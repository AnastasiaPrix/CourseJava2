package Lesson5;

public class Main {

    static final int SIZE = 10000000;
    static final int H = SIZE/ 2;



    public static void main(String[] args) throws InterruptedException {
        float[] mas = new float[SIZE];
        startFill(mas);
        oneArrForm(mas);
        startFill(mas);
        twoArrForm(mas);


    }
    public static void startFill(float[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 1;
        }
    }

    public static void oneArrForm(float[] mas){
        long start = System.currentTimeMillis();
        for (int i = 0; i < mas.length; i++) {
            mas[i]  = (float)(mas[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время работы: " + (System.currentTimeMillis()-start) +" ms" );
    }

    public static void twoArrForm(float[] mas) throws InterruptedException {
        long start = System.currentTimeMillis();
        float[] a1= new float[H];
        float[] a2 = new float[H];
        System.arraycopy(mas, 0, a1, 0, H);
        System.arraycopy(mas, H, a2, 0, H);
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < a1.length; i++) {
                a1[i]  = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < a2.length; i++) {
                a2[i]  = (float)(a2[i] * Math.sin(0.2f + (i+H) / 5) * Math.cos(0.2f + (i+H) / 5) * Math.cos(0.4f + (i +H)/ 2));
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.arraycopy(a1, 0, mas, 0, H);
        System.arraycopy(a2, 0, mas, H, H);

        System.out.println("Время работы: " + (System.currentTimeMillis()-start) + "ms" );

    }
}
