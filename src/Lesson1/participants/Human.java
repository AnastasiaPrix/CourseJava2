package Lesson1.participants;

public class Human implements Participants {
    Double maxLength;
    Double maxHeigth;


    public Human(Double maxLength, Double maxHeigth) {
        this.maxLength = maxLength;
        this.maxHeigth = maxHeigth;
    }

    @Override
    public boolean run(Double length) {
        if ( maxLength < length) {
            System.out.println("Chelovek не смог пробежать "+ length);
            return false;
        }
        else {
            System.out.println("Chelovek смог пробежать "+ length);
        }
        return true;
    }

    @Override
    public boolean jump(Double heigth) {
        if ( maxHeigth < heigth) {
            System.out.println("Chelovek не смог перепрыгнуть " + heigth);
            return false;
        }
        else {
            System.out.println("Chelovek смог перепрыгнуть " + heigth);
        }
        return true;
    }
}
