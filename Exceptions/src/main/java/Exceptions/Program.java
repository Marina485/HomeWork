package Exceptions;

public class Program {
    public static void main(String[] args) {
        long sum = 0;
        String[][] arr = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"}};

        try {
            sum = strToInt(arr);
        } catch (MyArraySizeException e) {
            System.out.println("Массив неверного размера.");
            e.printStackTrace();
        }
        catch (MyArrayDataException e) {
            System.out.println("Неверные данные.");
            e.printStackTrace();
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

    public static long strToInt(String[][] a) throws MyArraySizeException, MyArrayDataException {
        long s = 0;
        int col = 0, row = 0;
        if (a.length != 4 || a[0].length != 4) {
            throw new MyArraySizeException("Размер массива: " + a.length + " : " + a[0].length);
        }
        for (String i[] : a) {
            for (String j : i) {
                try {
                    s += Integer.parseInt(j);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Преобразование не удалось в ячейке: " + col + " : " + row);
                }
                row++;
            }
            col++;
            row = 0;
        }
        return s;
    }
}

