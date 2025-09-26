// разделение массива на буквы и числа
#include <iostream>
using namespace std;

int main() {
    string massiv[6] = {"a", "1", "b", "2", "c", "3"};  // ishodnyi massiv
    string bukvy[3];    // massiv dlya bukv
    string chisla[3];   // massiv dlya chisel

    int bi = 0, ci = 0; // schetchiki dlya massivov

    for (int i = 0; i < 6; i++) {
        if (i % 2 == 0)       // chetnyi -> bukva
            bukvy[bi++] = massiv[i];
        else                  // nechetnyi -> chislo
            chisla[ci++] = massiv[i];
    }

    cout << "Буквы: ";
    for (int i = 0; i < 3; i++) cout << bukvy[i] << " ";
    cout << "\nЧисла: ";
    for (int i = 0; i < 3; i++) cout << chisla[i] << " ";
}

// Есть массив: {"a", "1", "b", "2", "c", "3"}.
//  • Смотрим индексы элементов:
//  • Чётные (0, 2, 4) → это буквы "a", "b", "c".
//  • Нечётные (1, 3, 5) → это числа "1", "2", "3".
//  • Мы кладём буквы в массив bukvy, числа в массив chisla.
//  • В конце печатаем:
//  • Буквы: a b c
//  • Числа: 1 2 3.
