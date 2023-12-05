


![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.001.png)

**TaskFriend:** A Tamagotchi inspired To-Do List
#

## <a name="_w5gi5leap4rj"></a><a name="_twxkedxgkn6i"></a>TEAM 6:
KATRINA MAI

CHRISTIAN VILLANUEVA

MAYA LOUISE DAGDAG

ARPITA SAKSHEE


COURSE: CIS 043

INSTRUCTOR: HELEN SUN


VERSION 1
# <a name="_jwdak36ksizu"></a>**Contents**
Introduction											

`	`Project Idea										3

Features										3

`	`To-Do List									3

`	`Task Friend									3

Additional Features									4

`	`Task Difficulty Rating							4

`	`Task Friend Mini Games							4

Design												

Inheritance Hierarchy								4

UML Class Diagram									5	

GUI Screens										6

`		`Home Screen									6

`			`To-Do List GUI							6

`			`Add Task								6

`			`Task Friend Interaction GUI						7

`				`Feed, Toy, and Heal						7

`				`Play 								8

`				`Exchange Task Friend					9

`				`Accessories							9

`		`Task Friend Stats GUI							10

Use case flow chart									11

Summary											

`	`Conclusion										12

Appendix: Source code									13

References											239


# <a name="_aed2zlrd3tu1"></a>**Introduction**
## <a name="_yjuu4d8xm456"></a>**Project Idea:** A To-Do list application combined with Tamagotchi
An accountability-based pet simulator. Earn points by completing tasks on your To-Do list and use those points to care for your Task Friend, a virtual pet that cheers you on as you work.

TaskFriend is inspired by Tamagotchi, an interactive pet game that allows users to care for a virtual creature in real time. The owner is responsible for the wellness of the Tamagotchi by following simple tasks such as feeding the Tamagotchi, cleaning up after them, and providing them with the proper attention to keep them happy and alive.

Our application caters to individuals who utilize to-do lists to manage their day-to-day lives and would like a fun twist to their productivity system. By combining the to-do list experience with Tamagotchi, TaskFriend provides a unique incentive to stay on top of your work. You not only get the satisfaction of completing tasks but also the joy of seeing your Task Friend thrive.
## <a name="_2q6xtk7b4gov"></a>**Features**
### <a name="_str1n32v1k1l"></a>To-Do List
Main function of the application

- Add tasks to a To-Do List 
  - Set task name, difficulty, and due date & time
- Edit tasks on To-Do List
  - Edit task name, difficulty, and due date & time
- Remove tasks from To-Do List
  - Remove selected tasks without adding points
- Completing tasks in time will earn points depending on the difficulty
  - Not completing tasks in time depletes Task Friend’s Wellness points
  - Will continue deducting Wellness points until the user completes a task
- Completing overdue tasks will still earn points, but less
### <a name="_yuf4a5csm2dq"></a>Task Friend
Start with a randomly chosen Task Friend at full health out of 5 unique designs

- Feed your Task Friend by spending points on Food of choice
  - Adds Fullness points
- Entertain your Task Friend by spending points on Toy of choice
  - Adds Happiness points
- Heal your Task Friend by spending points on Heal of choice
  - Adds Wellness points
- Play with your Task Friend by spending points on choice of Mini Game
  - Adds Happiness & Wellness points
- Exchange your Task Friend for the other 4 designs by spending many points
- Dress up your Task Friend by spending many points on Accessory of choice

## <a name="_svr2x73y82ry"></a>**Additional Features**
### <a name="_emr8id3ir0v0"></a>Task Difficulty Rating
It may be difficult to self-evaluate the difficulty of a task objectively

- Based on the physical effort, mental effort, and length of time a task takes, will evaluate the objective difficulty of the task
### <a name="_wzqnqokbqzs9"></a>Task Friend Mini-Games
From the original Tamagotchi: Play mini-games to interact with your Task Friend

- Playing a minigame is costly but grants many Happiness and Wellness points
- Example: Higher Lower Mini-game
# <a name="_u7piymu3qrlg"></a>**Design**
We wanted to make sure that the Tamagotchi element was not counterproductive to the productivity of the application and provided an incentive instead of a distraction. Thus, the To-Do List operations are separate from the Task Friend interactions.
## <a name="_vhq1ihwjsnm"></a>**Inheritance Hierarchy**
### <a name="_8rkd4xvvv9dw"></a>Data Classes: ![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.002.png) ![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.003.png) ![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.004.png)
### <a name="_1w2lruz38n3x"></a>GUI Classes: ![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.005.png)
## <a name="_4wrscyoe177r"></a>**UML Class Design![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.006.png)**
## <a name="_gnnjj9z7y441"></a>**GUI Screens**
### <a name="_yuuh987w9ctg"></a>**Home Screen**			![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.007.png)![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.008.png)
*Full Home Screen				       To-Do List methods*
###
### <a name="_kyb9qgz8z8zt"></a><a name="_29zns47phmtr"></a>To-Do List GUI
Mainly features the To-Do List and its methods: 

- Add Task, Edit Task, Remove Task, and Complete Task
- To-Do List methods are visually presented as “console buttons,” reminiscent of handheld video game consoles

*Add Task Screen				Added task on To-Do List![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.009.png)![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.010.png)*
###
### <a name="_zfi4hqf4agu6"></a><a name="_31naeaok14fp"></a>Add Task 
- Opens a new screen for the user to enter a name, difficulty, and due date
- Creates a new Task object stored in ToDoList and displayed on To-Do List GUI

![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.011.png) 

*Task Friend Interaction GUI*
### <a name="_me8ffzx7i8w6"></a>Task Friend Interaction GUI
Menu of interaction buttons: Feed, Toy, Heal, Play, Avatar, and Accessories

- Items will only be used if amount of points are sufficient![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.012.png)![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.013.png)![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.014.png)

`   `*Feed Screen				Toy Screen			         Heal Screen*

### <a name="_13m0pc5h7gk7"></a>Feed, Toy, and Heal
Opens a screen for the user to spend points to use the selected item

![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.015.png)

*Play Screen (Mini game: Guess the number)*

Play 

Opens a screen to spend points to play the selected mini game

Description: Your Task Friend will give you a random number between 1-9. Your goal is to guess whether the next number it thinks of will be higher or lower than the given number. It cannot pick a number higher than 9, or lower than 1


![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.016.png)		       ![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.017.png)

`   `*Task Friend Select Screen			   	        New Task Friend!*

Exchange Task Friend

Opens a screen to spend points to exchange current Task Friend for selected Task Friend

![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.018.png)	![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.019.png)

` `*Accessory Screen			        Task Friend wearing an accessory*

Accessories

Opens a screen to spend points to change Task Friend’s appearance with selected accessory

![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.020.png)

*Task Friend Stats GUI*
### <a name="_j3ot9sqbp35l"></a>**Task Friend Stats GUI**
- Monitor 3 Health Stats: Fullness, Happiness, and Wellness
  - Task Friend’s overall health is a weighted average of these 3 stats
- Fullness and Happiness steadily decrease over time
- Overdue tasks or To-Do List inactivity for 2 days causes Wellness to decrease over time
  - Wellness represents your Task Friend’s pride in you for accomplishing tasks
- Failing to maintain these stats will deplete health, going from:

![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.021.png)![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.022.png)![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.023.png)![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.024.png)

`        `Healthy (100%) 	    →     Weak (75%)       →       Sick (50%)       →          Dead (0%)

- If health reaches 0, your Task Friend will die and points go to zero
- Adding another task will revive Task Friend
## <a name="_ecvl5p6msive"></a>**Use Case Flow Chart**
## ![](Aspose.Words.99e6b528-5216-4bcf-bd89-49edeb3d1d61.025.png)
# <a name="_pzcqdb2p1pkt"></a><a name="_7jzvn9wuyct4"></a>**Summary**
## <a name="_twlu43wuzil9"></a>**Conclusion**
This semester, our team created TaskFriend, a Tamagotchi inspired To-Do list. TaskFriend integrates multiple features from a To-Do list software and the virtual pet simulation game into one functional application. Users add and complete tasks while caring after a Task Friend, whose well-being highly depends on how productive the user is, as well as how attentive they are to their pet. We faced several challenges such as getting the overall health bar of the Task Friend to reflect the health meters, which was crucial for the project to function as we intended. Despite these challenges, however, we were able to navigate through them by utilizing the resources available to us and maintaining active communication within the team. As a result, we created a prototype that we were pleased with.

Creating TaskFriend provided us with invaluable teamwork experience, new technical knowledge, and room for creativity. We realized the importance of frequent communication to ensure we were on the same page. By developing an application prototype, we got a glimpse of the software development process using the concepts we learned in class. Working on TaskFriend allowed us to apply not only these concepts but also the skills we had beforehand, thus allowing us to use our creative and problem-solving skills. If we were to continue working on this project, we would like to include features such as checkboxes for tasks, Task Friend growth stages, and the ability to transform it into a web-based application to allow online accessibility. 
#
# <a name="_m2s6df2d7hng"></a><a name="_oiq1rmpdilhn"></a>**Appendix: Source Code**
## <a name="_p296b9edq5u5"></a>**GitHub Link:** 
### <https://github.com/ArpitaSakshee/TaskFriend> 
# <a name="_ieyxm7knwzm0"></a>**References**
Java SE Documentation by Oracle. *How to Use Various Components.* [online] Available at: <https://docs.oracle.com/javase/tutorial/uiswing/components/componentlist.html> 

GeekExtreme. *What is a Tamagotchi? From 90s Fad to Modern Must-Have Toy.* [online] Available at: <https://www.geekextreme.com/what-is-a-tamagotchi/> 

Stack Overflow. *Running a Java Thread in intervals.* [online] Available at: <https://stackoverflow.com/questions/426758/running-a-java-thread-in-intervals>

We need to periodically decrease the health attributes, we find ScheduledExecutorService thread code and modify it to call our functions periodically.

Java SE Documentation by Oracle. *ScheduledExecutorService.* [online] Available at: <https://docs.oracle.com/javase/6/docs/api/java/util/concurrent/ScheduledExecutorService.html>

Stack Overflow. *Java JList AbstractListModel add remove method not working - Stack Overflow.* [online] Available at: 

<https://stackoverflow.com/questions/46488805/java-jlist-abstractlistmodel-add-remove-method-not-working>

Task.java is influenced by the above code, but instead of storing a string we stored the task Object and added a function to convert the task object to string.
