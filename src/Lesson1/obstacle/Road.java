package Lesson1.obstacle;

import Lesson1.participants.Participants;

public class Road implements Obstacle {

    Double length;

    public Road(Double length) {
        this.length = length;
    }

    @Override
    public boolean overcoming(Participants p) {
        return p.run(length);
    }
}
