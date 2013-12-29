##Text Property Visualization

This program verifies the text properties like Heap's and Zipf's law using content of the given file.The learning of these two laws are very usefule to scale the search engine efficiently.

#####`Zipf's Law`This law states that multiplication of frequency of particular word and non increasing sorted rank of that word based on frequency is always some constant k for that particular corpus.

                                          f . r=k
                                                   where f=frequency of that word.
                                                         r=non increasing sorted rank based on frequency.
                                                         k=constant.
                                                         
#####By this law we can learn that stop words like a, the appears large fration of the text.So, by not storing them we can significantly reduce the size of our indexing and can improve the performance.

`Screen Shot For Visualization of Zipf's Law`

![alt text](Zipfs.jpg "Zipf's Law")

#####`Heap's Law` This las states the realation between growth of vocabulary size and growth of corpus size.Based on this law we can say that when we index the large corpus then there is always be the finding of new vocabulary.Thus at the begining there will be stiff rise in vocabulary but after some time vocabulary size grows slowly compared to the size of the corpus.

                                          V=K .N^B    
                                                    Where K=Constant 10~100.
                                                          B=constant 0.4~0.6.
                                                          V=size of vocabulary.
                                                          N=size of corpus in words.
                                          
`Screen Shot For Visualization of Heaps Law`

![alt text](Heaps.jpg "Heap's Law")                                                          

##How To Run This Program

Downaload `ZipfLaw.java` ,`HeapsLaw.java` and `large.txt`.Here, large.txt is the file whose content will be used to verify these two laws.You can use content of other file as well,result will be the same for any file with large number of vocabularies.To verify these laws files must be large.

Here stdDraw.java API is taken from book Algorithms By Robert Sedgewick and Kevin Wyane.
