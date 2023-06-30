package HomeWork3;

// Пусть дан произвольный список целых чисел.//
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;
public class Task1 {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> list = createRandomList(20, 0, 100);
        deleteEven(list);
        findMinimum(list);
        findMaximum(list);
        findEverage(list);

    }

    static ArrayList<Integer> createRandomList(int size, int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            list.add(random.nextInt(start, end));
        }
        System.out.println(list);
        return list;
    }

    static void deleteEven(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    static void findMinimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Минимальное значение: " + min);
    }

    static void findMaximum(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Максимальное значение: " + max);
    }


    static void findEverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double result = (double) sum / list.size();

        System.out.println("Среднее значение: " + result);
    }
}
