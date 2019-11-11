import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Graph {

  public static class TokenizerMapper extends Mapper<Object, Text, Text, Text> {

    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

      InputSplit is = context.getInputSplit();
      FileSplit f = (FileSplit) is;
      String filePath = f.getPath().getName().toString();

      Pattern p = Pattern.compile("(\\d{16})");
      Matcher m = p.matcher(value.toString());
      while(m.find()){
        context.write(new Text(filePath), new Text(value.toString().substring(m.start(),m.end())));
      }
    }  		  
  }

  // REDUCE
  public static class GetGraphNeighbors extends Reducer<Text,Text,Text,Text> {
    public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
      for (Text val : values) {
    	  if(!(key.toString().equals(val.toString())))
    		  context.write(key, val);
      }
    }
  }

  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    Job job = Job.getInstance(conf, "graph");
    job.setJarByClass(Graph.class);

    job.setMapperClass(TokenizerMapper.class); // MAP
    job.setReducerClass(GetGraphNeighbors.class); // REDUCE
    
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(Text.class);

    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}

