import java.util.Scanner;
public class Checking_the_Tax_ID {
    public static void main(String[] args) {
        System.out.println("Введите ИНН");
        Scanner in = new Scanner(System.in);
        String inn = in.nextLine();
        if (inn.length() !=0) {
        if (inn.length() == 10 || inn.length() == 12) {
            if (inn.length() == 10) {
            char[] chArray = inn.toCharArray();
            int x1 = (Character.getNumericValue(chArray[0]) * 2) + (Character.getNumericValue(chArray[1]) * 4);
            int x2 = (Character.getNumericValue(chArray[2]) * 10) + (Character.getNumericValue(chArray[3]) * 3) + (Character.getNumericValue(chArray[4]) * 5);
            int x3 = (Character.getNumericValue(chArray[5]) * 9) + (Character.getNumericValue(chArray[6]) * 4) + (Character.getNumericValue(chArray[7]) * 6) + (Character.getNumericValue(chArray[8]) * 8) + (Character.getNumericValue(chArray[9]) * 0);
            int x4 = (x1 + x2 + x3) % 11;
            if (Character.getNumericValue(chArray[9]) == x4) {
                System.out.print("ИНН правильный");
            } else {
                if (x4 > 9) {
                    x4 = x4 % 10;
                    if (Character.getNumericValue(chArray[9]) == x4) {
                        System.out.print("ИНН правильный");
                    }
                } else {
                    System.out.print( "ИНН не правильный");
                }
            }
        } else {
            char[] chArray = inn.toCharArray();
            int x1 = (Character.getNumericValue(chArray[0]) * 7) + (Character.getNumericValue(chArray[1]) * 2) + (Character.getNumericValue(chArray[2]) * 4);
            int x2 = (Character.getNumericValue(chArray[3]) * 10) + (Character.getNumericValue(chArray[4]) * 3) + (Character.getNumericValue(chArray[5]) * 5) + (Character.getNumericValue(chArray[6]) * 9);
            int x3 = (Character.getNumericValue(chArray[7]) * 4) + (Character.getNumericValue(chArray[8]) * 6) + (Character.getNumericValue(chArray[9]) * 8) + (Character.getNumericValue(chArray[10]) * 0);
            int kk1 = (x1 + x2 + x3) % 11;
            if (kk1 > 9) {
                kk1 = kk1 % 10;
            }
        if (Character.getNumericValue(chArray[10]) == kk1) {
                int x4 = (Character.getNumericValue(chArray[0]) * 3) + (Character.getNumericValue(chArray[1]) * 7) + (Character.getNumericValue(chArray[2]) * 2) + (Character.getNumericValue(chArray[3]) * 4);
                int x5 = (Character.getNumericValue(chArray[4]) * 10) + (Character.getNumericValue(chArray[5]) * 3) + (Character.getNumericValue(chArray[6]) * 5) + (Character.getNumericValue(chArray[7]) * 9);
                int x6 = (Character.getNumericValue(chArray[8]) * 4) + (Character.getNumericValue(chArray[9]) * 6) + (Character.getNumericValue(chArray[10]) * 8) + (Character.getNumericValue(chArray[11]) * 0);
                int kk2 = (x4 + x5 + x6) % 11;
                if (kk2 > 9) {
                    kk2 = kk2 % 10;
                }
        if (Character.getNumericValue(chArray[11]) == kk2) {
                    System.out.print("ИНН правильный");
                }
        } else {
                System.out.print("ИНН не правильный");
            }
        }
        } else {
            System.out.print("Ошибка! Проверьте правильность ввода ИНН");
        }
        } else {System.out.print("Ошибка! Поле пустое");
            }
        }
}