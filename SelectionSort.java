public class SelectionSort {
    public static void main(String[] args) {

        //Создаём массив
        int[] arr = {9, 4, 33, 23, 10, 2, 7, 3, 13};

        //Выводим неотсортированный массив
        for (int item : arr) {
            System.out.print(item + " ");
        }

        // Один за другим перемещаем границу несортированного подмассива
        for (int i = 0; i < arr.length-1; i++)
        {
            // Находим минимальный элемент в несортированном массиве
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            // Меняем найденный минимальный элемент на первый элемент
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println();

        //Выводим отсортированный массив
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
