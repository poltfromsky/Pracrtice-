// Разделение строки на заглавные и строчные буквы на джава
public class Main {
    public static void main(String[] args) {
        String stroka = "AaBbCcDd";   // ishodnaya stroka
        String bolshie = "";          // zaglavnye bukvy
        String malen = "";            // strochnye bukvy

        for (int i = 0; i < stroka.length(); i++) {
            if (i % 2 == 0)
                bolshie += stroka.charAt(i);
            else
                malen += stroka.charAt(i);
        }

        System.out.println("Заглавные: " + bolshie);
        System.out.println("Строчные: " + malen);
    }
}
// • Строка "AaBbCcDd" — это набор символов.
//  • Считаем их по индексам (0, 1, 2, …).
//  • Чётные индексы → символы A, B, C, D.
//  • Нечётные индексы → символы a, b, c, d.
//  • В итоге:
//  • Заглавные: ABCD
//  • Строчные: abcd.
