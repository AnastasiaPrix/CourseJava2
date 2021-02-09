package Lesson1.participants;



public class Robot implements Participants {

    Double maxLength;
    Double maxHeigth;


    public Robot(Double maxLength, Double maxHeigth) {
        this.maxLength = maxLength;
        this.maxHeigth = maxHeigth;
    }

    @Override
    public boolean run(Double length) {
       if ( maxLength < length) {
           System.out.println("Робот не смог пробежать "+ length);
           return false;
       }
       else {
           System.out.println("Робот смог пробежать "+ length);
       }
       return true;
    }

    @Override
    public boolean jump(Double heigth) {
        if ( maxHeigth < heigth) {
            System.out.println("Робот не смог перепрыгнуть " + heigth);
            return false;
        }
        else {
            System.out.println("Робот смог перепрыгнуть " + heigth);
        }
        return true;
    }
}
