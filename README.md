# simple-event-handler

Event Defintion from MSDN.
https://msdn.microsoft.com/en-us/library/17sde2xt(v=vs.85).aspx

An event is a message sent by an object to signal the occurrence of an action. The action could be caused by  some other program logic. 
The object that raises the event is called the event sender. The object that captures the event and responds to it is called the event receiver.

In event communication, the event sender class does not know which object or method will receive (handle) the events it raises. the receiver.


This pattern has interesting applications. The code in this repo is a very simple implementation of Event handling in Java.


Code 
-----
Step 1. Compile the code using the following command.
mvn clean install

Step 2. Run the code
java -cp target/simple-event-handler-0.0.1-SNAPSHOT.jar simple.eventmanager.Application
