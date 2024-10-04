11. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
*/
    
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 6, -2, -1, -9, -3, 2, 8};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        perestnovkaArray(numbers);
        System.out.println("Изменённый массив: " + Arrays.toString(numbers));
    }

    private static void perestnovkaArray(int[] arr) {
        int n = arr.length;
        int polozhitelnie = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                if (polozhitelnie != i) {
                    swap(arr, polozhitelnie, i);
                }
                polozhitelnie++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
