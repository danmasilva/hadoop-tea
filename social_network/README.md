# Prática 1  
## Parte 1:
 
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop jar hadoop-mapreduce-examples-3.1.0.jar*  
An example program must be given as the first argument.  
Valid program names are:  
  aggregatewordcount: An Aggregate based map/reduce program that counts the words in the input files.  
  aggregatewordhist: An Aggregate based map/reduce program that computes the histogram of the words in the input files.  
  bbp: A map/reduce program that uses Bailey-Borwein-Plouffe to compute exact digits of Pi.  
  dbcount: An example job that count the pageview counts from a database.  
  distbbp: A map/reduce program that uses a BBP-type formula to compute exact bits of Pi.  
  grep: A map/reduce program that counts the matches of a regex in the input.  
  join: A job that effects a join over sorted, equally partitioned datasets  
  multifilewc: A job that counts words from several files.  
  pentomino: A map/reduce tile laying program to find solutions to pentomino problems.  
  pi: A map/reduce program that estimates Pi using a quasi-Monte Carlo method.  
  randomtextwriter: A map/reduce program that writes 10GB of random textual data per node.  
  randomwriter: A map/reduce program that writes 10GB of random data per node.  
  secondarysort: An example defining a secondary sort to the reduce.  
  sort: A map/reduce program that sorts the data written by the random writer.  
  sudoku: A sudoku solver.  
  teragen: Generate data for the terasort  
  terasort: Run the terasort  
  teravalidate: Checking results of terasort  
  wordcount: A map/reduce program that counts the words in the input files.  
  wordmean: A map/reduce program that counts the average length of the words in the input files.  
  wordmedian: A map/reduce program that counts the median length of the words in the input files.  
  wordstandarddeviation: A map/reduce program that counts the standard deviation of the length of the words in the input files.  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop fs -mkdir /Pratica1*  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop fs -mkdir /Pratica1/Input*  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop fs -mkdir /Pratica1/Output*  
  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop jar hadoop-mapreduce-examples-3.1.0.jar pi 6 888*  
Number of Maps  = 6  
Samples per Map = 888  
Wrote input for Map #0  
Wrote input for Map #1  
Wrote input for Map #2  
Wrote input for Map #3  
Wrote input for Map #4  
Wrote input for Map #5  
Starting Job  
2019-11-09 10:53:20,701 INFO client.RMProxy: Connecting to ResourceManager at /0.0.0.0:8032  
2019-11-09 10:53:21,560 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/daniel/.staging/job_1573303728696_0001  
2019-11-09 10:53:21,756 INFO input.FileInputFormat: Total input files to process : 6  
2019-11-09 10:53:21,853 INFO mapreduce.JobSubmitter: number of splits:6  
2019-11-09 10:53:21,924 INFO Configuration.deprecation: yarn.resourcemanager.system-metrics-publisher.enabled is deprecated. Instead, use yarn.system-metrics-publisher.enabled  
2019-11-09 10:53:22,238 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1573303728696_0001  
2019-11-09 10:53:22,241 INFO mapreduce.JobSubmitter: Executing with tokens: []  
2019-11-09 10:53:22,540 INFO conf.Configuration: resource-types.xml not found  
2019-11-09 10:53:22,548 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.  
2019-11-09 10:53:23,175 INFO impl.YarnClientImpl: Submitted application application_1573303728696_0001  
2019-11-09 10:53:23,313 INFO mapreduce.Job: The url to track the job: http://daniel-note:8088/proxy/application_1573303728696_0001/  
2019-11-09 10:53:23,317 INFO mapreduce.Job: Running job: job_1573303728696_0001  
2019-11-09 10:53:35,672 INFO mapreduce.Job: Job job_1573303728696_0001 running in uber mode : false  
2019-11-09 10:53:35,676 INFO mapreduce.Job:  map 0% reduce 0%  
2019-11-09 10:53:54,492 INFO mapreduce.Job:  map 17% reduce 0%  
2019-11-09 10:53:55,591 INFO mapreduce.Job:  map 33% reduce 0%  
2019-11-09 10:53:59,718 INFO mapreduce.Job:  map 67% reduce 0%  
2019-11-09 10:54:01,746 INFO mapreduce.Job:  map 83% reduce 0%  
2019-11-09 10:54:03,758 INFO mapreduce.Job:  map 100% reduce 0%  
2019-11-09 10:54:15,861 INFO mapreduce.Job:  map 100% reduce 100%  
2019-11-09 10:54:16,879 INFO mapreduce.Job: Job job_1573303728696_0001 completed successfully  
2019-11-09 10:54:17,005 INFO mapreduce.Job: Counters: 53  
        File System Counters  
                FILE: Number of bytes read=138  
                FILE: Number of bytes written=1500841  
                FILE: Number of read operations=0  
                FILE: Number of large read operations=0  
                FILE: Number of write operations=0  
                HDFS: Number of bytes read=1590  
                HDFS: Number of bytes written=215  
                HDFS: Number of read operations=29  
                HDFS: Number of large read operations=0  
                HDFS: Number of write operations=3  
        Job Counters  
                Launched map tasks=6  
                Launched reduce tasks=1  
                Rack-local map tasks=6  
                Total time spent by all maps in occupied slots (ms)=106417  
                Total time spent by all reduces in occupied slots (ms)=15697  
                Total time spent by all map tasks (ms)=106417  
                Total time spent by all reduce tasks (ms)=15697  
                Total vcore-milliseconds taken by all map tasks=106417  
                Total vcore-milliseconds taken by all reduce tasks=15697  
                Total megabyte-milliseconds taken by all map tasks=108971008  
                Total megabyte-milliseconds taken by all reduce tasks=16073728  
        Map-Reduce Framework  
                Map input records=6  
                Map output records=12  
                Map output bytes=108  
                Map output materialized bytes=168  
                Input split bytes=882  
                Combine input records=0  
                Combine output records=0  
                Reduce input groups=2  
                Reduce shuffle bytes=168  
                Reduce input records=12  
                Reduce output records=0  
                Spilled Records=24  
                Shuffled Maps =6  
                Failed Shuffles=0  
                Merged Map outputs=6  
                GC time elapsed (ms)=1205  
                CPU time spent (ms)=11628  
                Physical memory (bytes) snapshot=2002018304  
                Virtual memory (bytes) snapshot=2758987776  
                Total committed heap usage (bytes)=1497366528  
                Peak Map Physical memory (bytes)=334258176  
                Peak Map Virtual memory (bytes)=459280384  
                Peak Reduce Physical memory (bytes)=209199104  
                Peak Reduce Virtual memory (bytes)=324788224  
        Shuffle Errors  
                BAD_ID=0  
                CONNECTION=0  
                IO_ERROR=0  
                WRONG_LENGTH=0  
                WRONG_MAP=0  
                WRONG_REDUCE=0  
        File Input Format Counters  
                Bytes Read=708  
        File Output Format Counters  
                Bytes Written=97  
Job Finished in 56.458 seconds  
### Estimated value of Pi is 3.14039039039039039039  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop jar hadoop-mapreduce-examples-3.1.0.jar bbp 1 4 2 /Pratica1/bbp*  
Working Directory = /Pratica1/bbp  
  
Start Digit      = 1  
Number of Digits = 4  
Number of Maps   = 2  
  
Starting Job ...  
2019-11-09 11:15:56,413 INFO client.RMProxy: Connecting to ResourceManager at /0.0.0.0:8032  
2019-11-09 11:15:57,272 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/daniel/.staging/job_1573305293123_0001  
2019-11-09 11:15:58,122 INFO examples.BaileyBorweinPlouffe: Map #0: workload=10, offset=0, size=4  
2019-11-09 11:15:58,123 INFO examples.BaileyBorweinPlouffe: Map #1: workload=0, offset=4, size=0  
2019-11-09 11:15:58,336 INFO mapreduce.JobSubmitter: number of splits:2  
2019-11-09 11:15:58,424 INFO Configuration.deprecation: yarn.resourcemanager.system-metrics-publisher.enabled is deprecated. Instead, use yarn.system-metrics-publisher.enabled  
2019-11-09 11:15:58,574 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1573305293123_0001  
2019-11-09 11:15:58,578 INFO mapreduce.JobSubmitter: Executing with tokens: []  
2019-11-09 11:15:58,859 INFO conf.Configuration: resource-types.xml not found  
2019-11-09 11:15:58,860 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.  
2019-11-09 11:15:59,326 INFO impl.YarnClientImpl: Submitted application application_1573305293123_0001  
2019-11-09 11:15:59,390 INFO mapreduce.Job: The url to track the job: http://daniel-note:8088/proxy/application_1573305293123_0001/  
2019-11-09 11:15:59,392 INFO mapreduce.Job: Running job: job_1573305293123_0001  
2019-11-09 11:16:10,702 INFO mapreduce.Job: Job job_1573305293123_0001 running in uber mode : false  
2019-11-09 11:16:10,707 INFO mapreduce.Job:  map 0% reduce 0%  
2019-11-09 11:16:19,951 INFO mapreduce.Job:  map 50% reduce 0%  
2019-11-09 11:16:20,963 INFO mapreduce.Job:  map 100% reduce 0%  
2019-11-09 11:16:29,068 INFO mapreduce.Job:  map 100% reduce 100%  
2019-11-09 11:16:29,092 INFO mapreduce.Job: Job job_1573305293123_0001 completed successfully  
2019-11-09 11:16:29,341 INFO mapreduce.Job: Counters: 53  
        File System Counters  
                FILE: Number of bytes read=36  
                FILE: Number of bytes written=645083  
                FILE: Number of read operations=0  
                FILE: Number of large read operations=0  
                FILE: Number of write operations=0  
                HDFS: Number of bytes read=138  
                HDFS: Number of bytes written=112  
                HDFS: Number of read operations=9  
                HDFS: Number of large read operations=0  
                HDFS: Number of write operations=4  
        Job Counters  
                Launched map tasks=2  
                Launched reduce tasks=1  
                Other local map tasks=2  
                Total time spent by all maps in occupied slots (ms)=13368  
                Total time spent by all reduces in occupied slots (ms)=7143  
                Total time spent by all map tasks (ms)=13368  
                Total time spent by all reduce tasks (ms)=7143  
                Total vcore-milliseconds taken by all map tasks=13368  
                Total vcore-milliseconds taken by all reduce tasks=7143  
                Total megabyte-milliseconds taken by all map tasks=13688832  
                Total megabyte-milliseconds taken by all reduce tasks=7314432  
        Map-Reduce Framework  
                Map input records=2  
                Map output records=2  
                Map output bytes=26  
                Map output materialized bytes=42  
                Input split bytes=138  
                Combine input records=0  
                Combine output records=0  
                Reduce input groups=2  
                Reduce shuffle bytes=42  
                Reduce input records=2  
                Reduce output records=0  
                Spilled Records=4  
                Shuffled Maps =2  
                Failed Shuffles=0  
                Merged Map outputs=2  
                GC time elapsed (ms)=319  
                CPU time spent (ms)=2728  
                Physical memory (bytes) snapshot=798445568  
                Virtual memory (bytes) snapshot=1139650560  
                Total committed heap usage (bytes)=580911104  
                Peak Map Physical memory (bytes)=312160256  
                Peak Map Virtual memory (bytes)=435945472  
                Peak Reduce Physical memory (bytes)=212594688  
                Peak Reduce Virtual memory (bytes)=328835072  
        Shuffle Errors  
                BAD_ID=0  
                CONNECTION=0  
                IO_ERROR=0  
                WRONG_LENGTH=0  
                WRONG_MAP=0  
                WRONG_REDUCE=0  
        File Input Format Counters  
                Bytes Read=0  
        File Output Format Counters  
                Bytes Written=0  
Duration is 33.039 seconds.  
### Output file: hdfs://localhost:9000/Pratica1/bbp/pi_1_4.hex  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hdfs dfs -get /Pratica1/bbp*  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>cd bbp*  
  
C:\hadoop-3.1.0\share\hadoop\mapreduce\bbp>dir  
 O volume na unidade C não tem nome.  
 O Número de Série do Volume é 2EBB-BEE4  
  
 Pasta de C:\hadoop-3.1.0\share\hadoop\mapreduce\bbp  
  
09/11/2019  10:18    <DIR>          .  
09/11/2019  10:18    <DIR>          ..  
09/11/2019  10:18    <DIR>          out  
09/11/2019  10:18               110 pi.txt  
09/11/2019  10:18                 2 pi_1_4.hex  
               2 arquivo(s)            112 bytes  
               3 pasta(s)   36.359.462.912 bytes disponíveis  
  
  
*C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop jar hadoop-mapreduce-examples-3.1.0.jar wordcount /WordCountTutorial/Input /WordCountTutorial/Output*  
2019-11-09 11:26:52,327 INFO client.RMProxy: Connecting to ResourceManager at /0.0.0.0:8032  
2019-11-09 11:26:53,165 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/daniel/.staging/job_1573305293123_0004  
2019-11-09 11:26:53,511 INFO input.FileInputFormat: Total input files to process : 1  
2019-11-09 11:26:53,809 INFO mapreduce.JobSubmitter: number of splits:1  
2019-11-09 11:26:53,853 INFO Configuration.deprecation: yarn.resourcemanager.system-metrics-publisher.enabled is deprecated. Instead, use yarn.system-metrics-publisher.enabled  
2019-11-09 11:26:54,053 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1573305293123_0004  
2019-11-09 11:26:54,057 INFO mapreduce.JobSubmitter: Executing with tokens: []  
2019-11-09 11:26:54,512 INFO conf.Configuration: resource-types.xml not found  
2019-11-09 11:26:54,515 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.  
2019-11-09 11:26:54,621 INFO impl.YarnClientImpl: Submitted application application_1573305293123_0004  
2019-11-09 11:26:54,679 INFO mapreduce.Job: The url to track the job: http://daniel-note:8088/proxy/application_1573305293123_0004/  
2019-11-09 11:26:54,681 INFO mapreduce.Job: Running job: job_1573305293123_0004  
2019-11-09 11:27:04,930 INFO mapreduce.Job: Job job_1573305293123_0004 running in uber mode : false  
2019-11-09 11:27:04,935 INFO mapreduce.Job:  map 0% reduce 0%  
2019-11-09 11:27:16,206 INFO mapreduce.Job:  map 100% reduce 0%  
2019-11-09 11:27:28,387 INFO mapreduce.Job:  map 100% reduce 100%  
2019-11-09 11:27:29,401 INFO mapreduce.Job: Job job_1573305293123_0004 completed successfully  
2019-11-09 11:27:29,610 INFO mapreduce.Job: Counters: 53  
        File System Counters  
                FILE: Number of bytes read=138  
                FILE: Number of bytes written=428321  
                FILE: Number of read operations=0  
                FILE: Number of large read operations=0  
                FILE: Number of write operations=0  
                HDFS: Number of bytes read=226  
                HDFS: Number of bytes written=92  
                HDFS: Number of read operations=8  
                HDFS: Number of large read operations=0  
                HDFS: Number of write operations=2  
        Job Counters  
                Launched map tasks=1  
                Launched reduce tasks=1  
                Rack-local map tasks=1  
                Total time spent by all maps in occupied slots (ms)=7297  
                Total time spent by all reduces in occupied slots (ms)=10194  
                Total time spent by all map tasks (ms)=7297  
                Total time spent by all reduce tasks (ms)=10194  
                Total vcore-milliseconds taken by all map tasks=7297  
                Total vcore-milliseconds taken by all reduce tasks=10194  
                Total megabyte-milliseconds taken by all map tasks=7472128  
                Total megabyte-milliseconds taken by all reduce tasks=10438656  
        Map-Reduce Framework  
                Map input records=12  
                Map output records=14  
                Map output bytes=152  
                Map output materialized bytes=138  
                Input split bytes=120  
                Combine input records=14  
                Combine output records=10  
                Reduce input groups=10  
                Reduce shuffle bytes=138  
                Reduce input records=10  
                Reduce output records=10  
                Spilled Records=20  
                Shuffled Maps =1  
                Failed Shuffles=0  
                Merged Map outputs=1  
                GC time elapsed (ms)=268  
                CPU time spent (ms)=3684  
                Physical memory (bytes) snapshot=513282048  
                Virtual memory (bytes) snapshot=744873984  
                Total committed heap usage (bytes)=347602944  
                Peak Map Physical memory (bytes)=309678080  
                Peak Map Virtual memory (bytes)=426369024  
                Peak Reduce Physical memory (bytes)=203603968  
                Peak Reduce Virtual memory (bytes)=318504960  
        Shuffle Errors  
                BAD_ID=0  
                CONNECTION=0  
                IO_ERROR=0  
                WRONG_LENGTH=0  
                WRONG_MAP=0  
                WRONG_REDUCE=0  
        File Input Format Counters  
                Bytes Read=106  
        File Output Format Counters  
                Bytes Written=92  
  
* C:\hadoop-3.1.0\share\hadoop\mapreduce>hadoop dfs -cat /WordCountTutorial/Output/**  
DEPRECATED: Use of this script to execute hdfs command is deprecated.  
Instead use the hdfs command for it.  
bahia   1  
daniel  3  
domiciano       1  
giovana 1  
minas   1  
paracatu        1  
parana  1  
patricia        1  
paulo   2  
sao     2  
  
  
  
## Parte 2:  
Como utilizo windows, tive que adaptar os comandos:  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>javac -classpath C:\hadoop-3.1.0\etc\hadoop;C:\hadoop-3.1.0\share\hadoop\common;C:\hadoop-3.1.0\share\hadoop\common\lib\*;C:\hadoop-3.1.0\share\hadoop\common\*;C:\hadoop-3.1.0\share\hadoop\hdfs;C:\hadoop-3.1.0\share\hadoop\hdfs\lib\*;C:\hadoop-3.1.0\share\hadoop\hdfs\*;C:\hadoop-3.1.0\share\hadoop\yarn;C:\hadoop-3.1.0\share\hadoop\yarn\lib\*;C:\hadoop-3.1.0\share\hadoop\yarn\*;C:\hadoop-3.1.0\share\hadoop\mapreduce\* MaisAparece.java*  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>jar cf maisaparece.jar MaisAparece*.class*  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>mkdir saida*  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>hadoop fs -mkdir /Pratica1/MaisAparece*  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>hadoop fs -mkdir /Pratica1/MaisAparece/Input*  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>hadoop fs -mkdir /Pratica1/MaisAparece/Input*  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>hadoop fs -put numeros.txt /Pratica1/MaisAparece/Input*  
  
*C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>hadoop jar maisaparece.jar MaisAparece /Pratica1/MaisAparece/Input/numeros.txt saida*  
2019-11-09 11:44:03,036 INFO client.RMProxy: Connecting to ResourceManager at /0.0.0.0:8032  
2019-11-09 11:44:03,933 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.  
2019-11-09 11:44:03,956 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/daniel/.staging/job_1573305293123_0006  
2019-11-09 11:44:04,216 INFO input.FileInputFormat: Total input files to process : 1  
2019-11-09 11:44:04,375 INFO mapreduce.JobSubmitter: number of splits:1  
2019-11-09 11:44:04,439 INFO Configuration.deprecation: yarn.resourcemanager.system-metrics-publisher.enabled is deprecated. Instead, use yarn.system-metrics-publisher.enabled  
2019-11-09 11:44:04,582 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1573305293123_0006  
2019-11-09 11:44:04,585 INFO mapreduce.JobSubmitter: Executing with tokens: []  
2019-11-09 11:44:04,863 INFO conf.Configuration: resource-types.xml not found  
2019-11-09 11:44:04,866 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.  
2019-11-09 11:44:05,202 INFO impl.YarnClientImpl: Submitted application application_1573305293123_0006  
2019-11-09 11:44:05,300 INFO mapreduce.Job: The url to track the job: http://daniel-note:8088/proxy/application_1573305293123_0006/  
2019-11-09 11:44:05,305 INFO mapreduce.Job: Running job: job_1573305293123_0006  
2019-11-09 11:44:15,555 INFO mapreduce.Job: Job job_1573305293123_0006 running in uber mode : false  
2019-11-09 11:44:15,557 INFO mapreduce.Job:  map 0% reduce 0%  
2019-11-09 11:44:24,922 INFO mapreduce.Job:  map 100% reduce 0%  
2019-11-09 11:44:34,061 INFO mapreduce.Job:  map 100% reduce 100%  
2019-11-09 11:44:35,098 INFO mapreduce.Job: Job job_1573305293123_0006 completed successfully  
2019-11-09 11:44:35,391 INFO mapreduce.Job: Counters: 53  
        File System Counters  
                FILE: Number of bytes read=107  
                FILE: Number of bytes written=427413  
                FILE: Number of read operations=0  
                FILE: Number of large read operations=0  
                FILE: Number of write operations=0  
                HDFS: Number of bytes read=154  
                HDFS: Number of bytes written=32  
                HDFS: Number of read operations=8  
                HDFS: Number of large read operations=0  
                HDFS: Number of write operations=2  
        Job Counters  
                Launched map tasks=1  
                Launched reduce tasks=1  
                Rack-local map tasks=1  
                Total time spent by all maps in occupied slots (ms)=4960  
                Total time spent by all reduces in occupied slots (ms)=6962  
                Total time spent by all map tasks (ms)=4960  
                Total time spent by all reduce tasks (ms)=6962  
                Total vcore-milliseconds taken by all map tasks=4960  
                Total vcore-milliseconds taken by all reduce tasks=6962  
                Total megabyte-milliseconds taken by all map tasks=5079040  
                Total megabyte-milliseconds taken by all reduce tasks=7129088  
        Map-Reduce Framework  
                Map input records=12  
                Map output records=12  
                Map output bytes=77  
                Map output materialized bytes=107  
                Input split bytes=125  
                Combine input records=0  
                Combine output records=0  
                Reduce input groups=7  
                Reduce shuffle bytes=107  
                Reduce input records=12  
                Reduce output records=7  
                Spilled Records=24  
                Shuffled Maps =1  
                Failed Shuffles=0  
                Merged Map outputs=1  
                GC time elapsed (ms)=129  
                CPU time spent (ms)=2027  
                Physical memory (bytes) snapshot=495243264  
                Virtual memory (bytes) snapshot=712720384  
                Total committed heap usage (bytes)=347078656  
                Peak Map Physical memory (bytes)=294416384  
                Peak Map Virtual memory (bytes)=395784192  
                Peak Reduce Physical memory (bytes)=200826880  
                Peak Reduce Virtual memory (bytes)=316936192  
        Shuffle Errors  
                BAD_ID=0  
                CONNECTION=0  
                IO_ERROR=0  
                WRONG_LENGTH=0  
                WRONG_MAP=0  
                WRONG_REDUCE=0  
        File Input Format Counters  
                Bytes Read=29  
        File Output Format Counters  
                Bytes Written=32  
  
C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>dir  
 O volume na unidade C não tem nome.  
 O Número de Série do Volume é 2EBB-BEE4  
  
 Pasta de C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece  
  
09/11/2019  10:40    <DIR>          .  
09/11/2019  10:40    <DIR>          ..  
09/11/2019  10:30            12.288 .compile.sh.swp  
06/11/2019  14:45               239 compile.sh  
08/11/2019  14:47               270 LEIAME.txt  
09/11/2019  10:39             1.745 MaisAparece$IntSumReducer.class  
09/11/2019  10:39             1.742 MaisAparece$TokenizerMapper.class  
09/11/2019  10:39             1.462 MaisAparece.class  
09/11/2019  10:40             3.075 maisaparece.jar  
21/09/2019  10:03             1.871 MaisAparece.java  
21/09/2019  10:03                29 numeros.txt  
06/11/2019  15:24    <DIR>          saida  
08/11/2019  14:47    <DIR>          saida2  
06/11/2019  15:19               274 starthadoop.sh  
              10 arquivo(s)         22.995 bytes  
               4 pasta(s)   36.360.675.328 bytes disponíveis  
  
C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>dir  
 O volume na unidade C não tem nome.  
 O Número de Série do Volume é 2EBB-BEE4  
  
 Pasta de C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece  
  
09/11/2019  10:40    <DIR>          .  
09/11/2019  10:40    <DIR>          ..  
09/11/2019  10:30            12.288 .compile.sh.swp  
06/11/2019  14:45               239 compile.sh  
08/11/2019  14:47               270 LEIAME.txt  
09/11/2019  10:39             1.745 MaisAparece$IntSumReducer.class  
09/11/2019  10:39             1.742 MaisAparece$TokenizerMapper.class  
09/11/2019  10:39             1.462 MaisAparece.class  
09/11/2019  10:40             3.075 maisaparece.jar  
21/09/2019  10:03             1.871 MaisAparece.java  
21/09/2019  10:03                29 numeros.txt  
06/11/2019  15:24    <DIR>          saida  
08/11/2019  14:47    <DIR>          saida2  
06/11/2019  15:19               274 starthadoop.sh  
              10 arquivo(s)         22.995 bytes  
               4 pasta(s)   36.358.475.776 bytes disponíveis  
  
C:\hadoop-3.1.0\mydata\pratica_1\MaisAparece>type saida\*  
  
saida\part-r-00000  
  
  
1       4  
11      1  
12      2  
2       1  
21      1  
23      1  
3       2  
