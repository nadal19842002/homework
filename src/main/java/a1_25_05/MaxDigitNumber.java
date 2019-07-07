package a1_25_05;

import java.util.Scanner;

public class MaxDigitNumber {
    public static void main(String[] args) {
        /*pasul 1. creem un obiect din clasa Scanner (tastatura) pt a solicita utilizatorului sa introduca
        un numar de la 1 la 127*/
        Scanner input = new Scanner(System.in);
        //pasul 2. Solicitam utilizatorului sa introduca un numar intreg de la 1 la 127
        System.out.println("Introdu de la tastatura un numar intreg : ");
        int inputNumber = input.nextInt();
        /*pasul 3. definim cifra 1 ca fiind digit-ul maxim.cu o bucla while identificam fiecare cifra a numarului,iar ulterior o comparam pe fiecare cu cifra maxima*/
        int maxDigit = 1;
        while (inputNumber != 0) {
            int digit = inputNumber % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            inputNumber = inputNumber / 10;
        }
        //pasul 4. afisam rezultatul
        System.out.println("Valoarea maxima a cifrei numarului propus este" + " " + maxDigit);
    }
}
