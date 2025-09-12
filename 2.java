// Разделение  массива на буквы и числа
public class Main {
    public static void main(String[] args) {
        String[] massiv = {"a", "1", "b", "2", "c", "3"}; // ishodnyi massiv
        String[] bukvy = new String[3];   // massiv dlya bukv
        String[] chisla = new String[3];  // massiv dlya chisel

        int bi = 0, ci = 0; // schetchiki

        for (int i = 0; i < massiv.length; i++) {
            if (i % 2 == 0)
                bukvy[bi++] = massiv[i];
            else
                chisla[ci++] = massiv[i];
        }

        System.out.print("Буквы: ");
        for (String s : bukvy) System.out.print(s + " ");
        System.out.print("\nЧисла: ");
        for (String s : chisla) System.out.print(s + " ");
    }
}
// • Исходный массив: {"a", "1", "b", "2", "c", "3"}.
//  • Смотрим элементы по индексам:
//  • Чётные → "a", "b", "c" (это буквы).
//  • Нечётные → "1", "2", "3" (это числа).
//  • Сохраняем их в два разных массива и выводим.
//  • Результат:
//  • Буквы: a b c
//  • Числа: 1 2 3.
