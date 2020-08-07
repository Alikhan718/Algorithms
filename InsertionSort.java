public class InsertionSort {
    public static void main(String[] args) {

        //Создаём массив
        int[] arr = {9, 4, 33, 23, 10, 2, 7, 3, 13};

        //Выводим неотсортированный массив
        for (int item : arr) {
            System.out.print(item + " ");
        }

        //Внешний цикл
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            /*Перемещаем элементы arr[0..i-1],
            которые больше чем key на одну позицию вперед*/
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println();

        //Выводим отсортированный массив
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
