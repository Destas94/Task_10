import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int a = input.nextInt();
        System.out.println("Введите количество столбцов: ");
        int b = input.nextInt();
        int array[][] = new int[a][b];
        for (int t = 0; t < a; t++) {
            for (int i = 0; i < b; i++) {
                System.out.print("Введите элемент arr[" + t + "][" + i + "]:");
                array[t][i] = input.nextInt();
            }
        }
        System.out.println ("Введённые элементы матрицы: ");
        for (int t = 0; t < a; t++) {
            for (int i = 0; i < b; i++) {
                System.out.print (array[t][i]+" ");
            }
            System.out.println();
        }
        System.out.println ("Первая строка матрицы с элементами, умноженными на 3: ");
            for (int i = 0; i < b; i++) {
                array[0][i] = array[0][i]*3;
                System.out.print (array[0][i]+" ");
            }

    }
}
