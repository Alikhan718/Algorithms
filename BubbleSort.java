public class BubbleSort {
    public static void main(String[] args) {

        //Создаём массив
        int[] arr = {9, 4, 33, 23, 10, 2, 7, 3, 13};

        //Выводим неотсортированный массив
        for (int value : arr) {
            System.out.print(value + " ");
        }

        //Внешний цикл
        for (int j = 1; j < arr.length; j++)
            //Внутренний цикл
            for (int i = 1; i < arr.length; i++) {
                //Сравниваем числа, если число меньше предыдущего меняем их местами
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i]; //Сохраняем меньшее число во временную переменную
                    arr[i] = arr[i-1]; //Приравниваем меньшее число к большему
                    arr[i-1] = temp; //Приравниваем большее число к временной переменной
                }
            }
        System.out.println();

        //Выводим отсортированный массив
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
