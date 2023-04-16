/*Написати метод який приймає массив цілих чисел
і вертає суму всіх його парних елементів(не тих які мають парні індекси а ті які самі є парними).
[8,2,3,4,5,6,7] -> 20*/

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{8, 2, 3, 4, 5, 6, 7};
        int finalSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                finalSum += array[i];
            }
        }
        System.out.println("Total sum of even numbers of array is " + finalSum);
    }
}
