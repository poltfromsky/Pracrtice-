// Разделение строки на заглавные и строчные буквы
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

        System.out.print("Bukvy: ");
        for (String s : bukvy) System.out.print(s + " ");
        System.out.print("\nChisla: ");
        for (String s : chisla) System.out.print(s + " ");
    }
}

// • Строка "AaBbCcDd" — это набор символов.
//  • Считаем их по индексам (0, 1, 2, …).
//  • Чётные индексы → символы A, B, C, D.
//  • Нечётные индексы → символы a, b, c, d.
//  • В итоге:
//  • Заглавные: ABCD
//  • Строчные: abcd.
