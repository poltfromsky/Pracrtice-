#include <iostream>
#include <string>
using namespace std;

int main() {
    string stroka = "AaBbCcDd";   // nasha stroka
    string bolshie = "";          // zaglavnye bukvy
    string malen = "";            // strochnye bukvy

    for (int i = 0; i < stroka.size(); i++) {
        if (i % 2 == 0)           // chetnyi indeks
            bolshie += stroka[i];
        else                      // nechetnyi indeks
            malen += stroka[i];
    }

    cout << "Заглавные: " << bolshie << endl;
    cout << "Строчные: " << malen << endl;
}
