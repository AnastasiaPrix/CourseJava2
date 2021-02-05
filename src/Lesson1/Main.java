package Lesson1;

import Lesson1.obstacle.Obstacle;
import Lesson1.obstacle.Road;
import Lesson1.obstacle.Wall;
import Lesson1.participants.Cat;
import Lesson1.participants.Human;
import Lesson1.participants.Participants;
import Lesson1.participants.Robot;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {new Cat(1400.0, 5.0), new Human(500., 1.5),
                new Robot(10000., 10.)};
        Obstacle[] obstacles = { new Road(100.), new Wall(4.)};

        for (Participants p: participants) {
            for (Obstacle obstacle: obstacles){
                obstacle.overcoming(p);
            }

        }
    }



}
