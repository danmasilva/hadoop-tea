import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class LikedFilms {

	public static class TokenizerMapper extends Mapper<LongWritable, Text, LongWritable, IntWritable> {

		private static final IntWritable one = new IntWritable(1);
		private final static String CSV_SEPARATOR = ",";

		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

			String valueString = value.toString();
			String[] columnData = valueString.split(CSV_SEPARATOR);
			try{
				if (Float.parseFloat(columnData[2]) > 3.0) {
					context.write(new LongWritable(Integer.parseInt(columnData[1])), one);
				}
			}catch (Exception e) {
				System.err.println(e.getLocalizedMessage());
				//e.printStackTrace();
			}

		}

	}

	// REDUCE
	public static class CountLikedFilms extends Reducer<LongWritable, IntWritable, LongWritable, LongWritable> {

		private LongWritable result = new LongWritable();

		public void reduce(LongWritable key, Iterable<IntWritable> values, Context context)
				throws IOException, InterruptedException {
			long sum = 0;
			for (IntWritable val : values) {
				sum += val.get();
			}
			result.set(sum);
			context.write(key, result);
		}
	}

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "count liked films");
		job.setJarByClass(LikedFilms.class);

		job.setMapperClass(TokenizerMapper.class); // MAP
		job.setReducerClass(CountLikedFilms.class); // REDUCE

		job.setOutputKeyClass(LongWritable.class);
		job.setOutputValueClass(IntWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
