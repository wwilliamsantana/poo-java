package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class IOUtils {
    public static void println(String message){
        System.out.println(message);
    }

    public static int scanInt(Scanner scanner){
        while (true){
            try{
                var input = scanner.nextInt();
                scanner.nextLine();
                return input;
            }catch (InputMismatchException err){
                System.out.println("Digite um valor válido!");
                scanner.nextLine();
            }
        }

    }

    public static boolean validateDate(String date){
            try{
                var isValidation = LocalDate.parse(date);
                return true;
            }catch(DateTimeParseException err){
                System.out.println("Informe uma data valida!");
                return false;
            }

    }
}
