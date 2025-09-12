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
