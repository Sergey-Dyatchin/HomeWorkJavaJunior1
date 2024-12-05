import java.util.List;

/**
 * Напишите программу, которая использует Stream API для обработки списка чисел.
 * Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */

// Сделал перегрузку метода для массива и List

public class Main {
    public static void main(String[] args) {

        System.out.println(ProcessingNumbers.averageOfEven(new int[]{1, 2, 4, 2, 5, 7, 6, 2, 8, 9, 10, 12}));

        System.out.println(ProcessingNumbers.averageOfEven(List.of(1, 2, 4, 2, 5, 7, 6, 2, 8, 9, 10, 12)));
    }
}