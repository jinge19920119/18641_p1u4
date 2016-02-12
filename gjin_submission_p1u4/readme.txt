Project 1 - Unit 4    readme.txt

1.There are several 2 files in it, one is for client and one is for server. As usually, there are 2 class diagrams,2 input files in client and output for every step. 

2. class diagram.png is the class diagram of this unit. readFileProp.properties and readFileProp1.properties are two input files.

3.There are 7 packages in both projects, adapter,scale,exception, driver, model ,util in both, client package for client and server package for server. Other than two different packages and some methods added in proxyAutomobile, Automobile and FileIO classes, all the methods keep the same functionality as before. 

In client package, there are 3 classes, CarModelOptionIO, DefaultSocketClient and SelectCarOption. A CarModelOptionIO object will be created in main method and a DefaultSocketClient object will be created here for serving as a client. In the handleSession method will be all the implementation. At last, you can make choices through methods in SelectCarOption class.

In server package, there are 2 classes, BuildCarModelOption and DefaultSocketClient. A BuildCarModelOption object will be created in main method, and a DefaultSocketClient object will be created here for serving as a server. In the handleSession method will be all the implementation.

4. The outcomes are served in outcome.txt 

5. All the comments and explanations of the project has been written in the code as comments.