# Tortoise-HareProject
Final project for NBCC Introduction to Java, Fall 2022
Java Final Project: Tortoise and Hare Race 
SUBMISSION INSTRUCTIONS: When finished, 
you must ZIP your entire Netbeans project and 
submit it to the dropbox on Brightspace by the due 
date.
REQUIREMENTS: In this project, you will create 
an application that uses threads and a Java FX GUI 
to simulate a race between two Animals that differ 
in their speed and how often they need to rest.
 You must use Netbeans as your IDE because that’s what I’ll be using to grade your work.
• You must use JavaFX to create a GUI similar to the screenshot above to display the results of the 
race.
• You must create a class Animal, which extends the Thread class and must include these private 
instance variables with appropriate getters/setters:
• a string representing the name of the animal
• an int value from 1 to 100 indicating the likelihood that on any given move the animal will rest 
instead of run
• an int value that indicates the animal’s speed—that is, how many meters the animal travels in 
each move
• an int value indicating the animal’s progress on the course
• You must create 2 classes “Hare” and “Tortoise” that extend the Animal class and override the 
getAnimalName() method of the Animal class.
• Each animal should be implemented as a separate thread using a class named Animal. 
• The race must start as soon as the form loads (HINT: you can do this by calling the start() method for 
each animal in the initialize() method of the controller class)
• The run() method of the Animal class should consist of a loop that repeats until the animal has 
reached 1000 meters. Each time through the loop, the thread should decide whether it should run or 
rest based on a random number and the percentage passed to the constructor. If this random number 
indicates that the animal should run, the method should add the speed value to the position value and 
display the new position. The run() method should sleep for 100 milliseconds on each repetition of 
the loop. When the loop ends, this method should display a message indicating that the animal has 
finished.
• The initialize() method of the application’s controller class should create two animal threads and start 
them. One of the threads should be named “Tortoise.” It runs only 10 meters each move, but plods 
along without ever resting. The other thread should be named “Hare.” It should run 100 meters each 
move, but should rest 90% of the time.
Hints
• To determine whether a thread should run or rest, calculate a random number between 1 and 100. 
Then, have the thread rest if the number is less than or equal to the percentage of time that the thread 
rests. Otherwise, the thread should run.
• In the animal class, you may notice an error if you try to create a method called getName() since this 
already exists in the inherited thread class and you can’t override it. Just call the method 
getAnimalName() to get around this problem.
• It will be very tricky to update the text in the GUI from the run() method of the Animal class. You’ll 
have to create an instance variable in the Animal class of type TextArea. Then set this TextArea 
property in the initialize method of the controller before you call the start methods of your threads
