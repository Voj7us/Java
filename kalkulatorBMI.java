//Aplikacja po wprowadzeniu masy ciała oraz wzrostu obliczy wskaźnik masy ciała(BMI)

package BMI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class kalkulatorBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoją wagę (w kg): ");
        double waga = scanner.nextDouble();
        System.out.println("Podaj swój wzrost (w cm): ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost) * 10000;
        bmi = zaokragl(bmi);
        if (bmi < 16.0) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - jesteś wygłodzony");
        } else if (bmi >= 16.0 && bmi <= 16.9) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - jesteś wychudzony");
        } else if (bmi >= 17.0 && bmi < 18.5) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - masz niedowage");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - masz prawidłową wage");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - masz nadwage");
        } else if (bmi >= 30.0 && bmi <= 34.9) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - masz otyłość I stopnia");
        } else if (bmi >= 35.0 && bmi <= 39.9) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - masz otyłość II stopnia");
        } else if (bmi >= 40.0) {
            System.out.println("Twoje BMI wynosi: " + bmi + " - masz otyłość III stopnia");
        }

    }

    private static double zaokragl(double bmi) {
        return Math.round(bmi * 100.0) / 100.0;
        
    }

}
