# hadoop-tea
Hadoop classes - Tópicos Especiais em Algoritmos

### standalone mode:
- javac -classpath $(/usr/local/hadoop/bin/hadoop classpath) CountNeighborsOccurrences.java 
- jar cvf count_neighboors_ocurrences.jar *.class
- /usr/local/hadoop/bin/hadoop jar count_neighboors_occurrences.jar CountNeighborsOccurrences ../social_network_data/ ~/graph_output
