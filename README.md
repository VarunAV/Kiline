						     ********************
						      	KILINE PROJECT
						     ********************


===========
Tools used:
===========
o IDE - Eclipse
o Language - Java
o Java - JDK 1.6
o Platform - Ubuntu
o Coding - Java Coding guidelines

========
Problem:
========
Provided are a set of datasets for a bus network. The network is represented with 10 data files. The content
of each of the file is described in details in the Kiline Database PDF document.
The purpose is to develop a program in Java/C++ using OOPS principle to build the network model using the
provided data.
 
Result needed:
--------------
1. Count the number of total lines on the network.
2. Mention the total number of routes on the network.
3. Mention the list of Bus stops (Stop points) on Line with ID 1 and Route 1 in order.
4. Find out the longest route on the network and the total distance.
5. Find out the line & route a passenger has to take if he has to go from Stop ID 3672(OURSEULLES SUR MER camping 1)
   to Stop ID 352(DOUVRES LA DELIVRANDE fossett)

=================
Problem analysis:
=================
The datasets are related to each other. Thus, a self-implementation of the program can be created to get the solution. These datasets can be related to each other using the UML process.

===============
Data modelling:
===============
Data modelling is done using the UML(Unified Modelling Language) process.

==========
Solutions:
==========
Q1: The number of lines on the network are found out by using the Scanner function (from the java.util.Scanner header file) which makes it easier for the read operations. The Scanner functions are used on the line.dat dataset which contains the information needed.

Q2: The total number of routes on the network are found out by using the Scanner function (from the java.util.Scanner header file) which makes it easier for the read operations. The Scanner functions are used on the route.dat dataset which contains the information needed.

Q3: The dataset needed for this is sar_on_rte. Each element is extracted from the dataset and those values of bus stops are listed which has Line ID and Route ID as '1'.

Q4: The LineID and RouteID of the Stopoints 3672 and 352 are found out. Then the common LineID and RouteID are taken.
