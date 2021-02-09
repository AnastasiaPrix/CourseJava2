package Lesson1.obstacle;

import Lesson1.participants.Participants;

public class Wall implements Obstacle {
     Double heigth;

    public Wall(Double heigth) {
        this.heigth = heigth;
    }

    @Override
    public boolean overcoming(Participants p) {
        return p.jump(heigth);
    }
}
