package Lesson1.participants;

public class Cat implements Participants {
    Double maxLength;
    Double maxHeigth;


    public Cat(Double maxLength, Double maxHeigth) {
        this.maxLength = maxLength;
        this.maxHeigth = maxHeigth;
    }

    @Override
    public boolean run(Double length) {
        if ( maxLength < length) {
            System.out.println("Кот не смог пробежать " + length);
            return false;
        }
        else {
            System.out.println("Кот смог пробежать "+ length);
        }
        return true;
    }

    @Override
    public boolean jump(Double heigth) {
        if ( maxHeigth < heigth) {
            System.out.println("Kot не смог перепрыгнуть "+ heigth );
            return false;
        }
        else {
            System.out.println("Kot смог перепрыгнуть " + heigth);
        }
        return true;
    }
}
