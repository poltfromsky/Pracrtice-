// Разделение строки на заглавные и строчные буквы
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

// • Исходный массив: {"a", "1", "b", "2", "c", "3"}.
//  • Смотрим элементы по индексам:
//  • Чётные → "a", "b", "c" (это буквы).
//  • Нечётные → "1", "2", "3" (это числа).
//  • Сохраняем их в два разных массива и выводим.
//  • Результат:
//  • Буквы: a b c
//  • Числа: 1 2 3.
