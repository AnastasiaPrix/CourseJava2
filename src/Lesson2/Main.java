package Lesson2;

public class Main  {

    public static void main(String[] args) {
        String[][] mas = {
                {"3","4","12","22"},
                {"23","41","12","22"},
                {"15","21","1","2"},
                {"6","43","54"}
        };
        try {
            System.out.println(myArrayFunction(mas));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        catch (MyArrayDataException e1) {
            e1.printStackTrace();
        }


        System.out.println("End!");
    }

    public static int myArrayFunction(String[][] mas) {
        int result = 0;
        if ( mas.length != 4){
            throw new MyArraySizeException("Размер массива не соответствует. Пришло "+ mas.length + " строк", mas.length);
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
               if (mas[i].length != 4) {
                   throw new MyArraySizeException("Размер массива не соответствует. Пришло "+ mas[i].length + " столбцов", mas[i].length);
               }
                try {
                    result = result + Integer.parseInt(mas[i][j]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    throw new MyArrayDataException("Не удалось преборазовать элемент " + (i+1) +" "+ (j+1), i, j );
                }
            }


        }
        return result;
    }
}
