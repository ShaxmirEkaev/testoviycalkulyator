
пакет и название файла Calkulyator


import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.io.IOException;

public class Calkulyator {
    private static Object String;

    public static void main(String[] args) throws IOException {
        char op, oper1, oper2;

        RIm rim1 = RIm.I;
        RIm rim2 = RIm.II;
        RIm rim3 = RIm.III;
        RIm rim4 = RIm.IV;
        RIm rim5 = RIm.V;
        RIm rim6 = RIm.VI;
        RIm rim7 = RIm.VII;
        RIm rim8 = RIm.VIII;
        RIm rim9 = RIm.IX;
        RIm rim10 = RIm.X;


        Scanner TCNNE = new Scanner(System.in);      // TCNNE- to cto naberu na ecrane
        System.out.print("Vvedite pervoe chislo\n");

        if (TCNNE.hasNextInt()) {
            int num1 = TCNNE.nextInt();
            if (num1 > 10 | num1 < 0) {
                System.out.print("\nVvedite cheloe chislo menshe 11, bolshe 0 dlya num1:");
                for (num1 = TCNNE.nextInt(); num1 > 10 | num1 < 0; num1 = TCNNE.nextInt()) ;
            } else {
            }


            System.out.print("Vvedite num2\n");
            int num2 = TCNNE.nextInt();
            if (num2 > 10 | num2 < 0) {
                System.out.print("\nVvedite cheloe chislo menshe 11, bolshe 0 dlya num2:");
                for (num2 = TCNNE.nextInt(); num2 > 10 | num2 < 0; num2 = TCNNE.nextInt()) ;
            } else {
            }


            int resultat;
            System.out.print("\n Viberite operator (+, -, *, /):\n ");
            op = TCNNE.next().charAt(0);
            switch (op) {
                case '+':
                    resultat = num1 + num2;
                    System.out.printf(num1 + " " + op + " " + num2 + " = " + resultat);
                    break;
                case '-':
                    resultat = num1 - num2;
                    System.out.printf(num1 + " " + op + " " + num2 + " = " + resultat);
                    break;
                case '*':
                    resultat = num1 * num2;
                    System.out.printf(num1 + " " + op + " " + num2 + " = " + resultat);
                    break;
                case '/':
                    resultat = num1 / num2;
                    System.out.printf(num1 + " " + op + " " + num2 + " = " + resultat);
                    break;
                default:
                    System.out.printf("Operator vibran nepravilno");
                    ;
            }
            System.out.print("\nKonec\n");


        } else {

            String chislo1 = TCNNE.nextLine();
            int num1 = 0, num2 = 0, resultat;
            int IX;
            switch (chislo1) {
                case "I":
                    num1 = rim1.getChislo();
                    break;
                case "II":
                    num1 = rim2.getChislo();
                    break;
                case "III":
                    num1 = rim3.getChislo();
                    break;
                case "IV":
                    num1 = rim4.getChislo();
                    break;
                case "V":
                    num1 = rim5.getChislo();
                    break;
                case "VI":
                    num1 = rim6.getChislo();
                    break;
                case "VII":
                    num1 = rim7.getChislo();
                    break;
                case "VIII":
                    num1 = rim8.getChislo();
                    break;
                case "IX":
                    num1 = rim9.getChislo();
                    break;
                case "X":
                    num1 = rim10.getChislo();
                    break;
                default:
                    System.out.printf("Nepravilno nabran nomer)");
                    return;

            }

            System.out.print("Vvedite 2 chislo\n");
            String chislo2 = TCNNE.nextLine();
            switch (chislo2) {
                case "I":
                    num2 = rim1.getChislo();
                    break;
                case "II":
                    num2 = rim2.getChislo();
                    break;
                case "III":
                    num2 = rim3.getChislo();
                    break;
                case "IV":
                    num2 = rim4.getChislo();
                    break;
                case "V":
                    num2 = rim5.getChislo();
                    break;
                case "VI":
                    num2 = rim6.getChislo();
                    break;
                case "VII":
                    num2 = rim7.getChislo();
                    break;
                case "VIII":
                    num2 = rim8.getChislo();
                    break;
                case "IX":
                    num2 = rim9.getChislo();
                    break;
                case "X":
                    num2 = rim10.getChislo();
                    break;
                default:
                    System.out.printf("Nepravilno nabran nomer)");
                    return;
            }

            System.out.print("mayatnik");
            System.out.print(" Viberite operator (+, -, *, /): \n");
            String rascet = TCNNE.nextLine();



            switch (rascet) {

                case "+":
                    resultat = num1 + num2;
                    String[] Rimskie = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                            "X","XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",};
                    var i= resultat;
                    System.out.println(chislo1 + " " + rascet + " " + chislo2 + " = " + Rimskie[i]);
                    break;


                case "-":
                    resultat = num1 - num2;
                    if (resultat>0) {
                        String[] Rimskie3 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
                        var poi= resultat;
                        System.out.println(chislo1 + " " + rascet + " " + chislo2 + " = " + Rimskie3[poi]);}
                    else {}System.out.println("V rimskix chislzx net otricatelnix chisel");
                    break;



                case "*":
                    resultat = num1 * num2;
                    String[] Rimskie1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
                    };
                    var e= resultat;
                    System.out.println(chislo1 + " " + rascet + " " + chislo2 + " = " + Rimskie1[e]);
                    break;


                case "/":
                    resultat = num1 / num2;
                    String[] Rimskie3 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X"};
                    var x= resultat;
                    System.out.println(chislo1 + " " + rascet + " " + chislo2 + " = " + Rimskie3[x]);
                    break;


                default:
                    System.out.printf("Nepravilno nabran operator)");
                    return;

            }

        }
    }
}

