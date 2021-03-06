import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int characters[] = new int[256];
        for(int i = 0; i < 256; i++)
            characters[i] = 0;
        for(int i = 0; i < input.length(); i++)
            characters[(int)(input.charAt(i))]++;

        int userInput = 0;
        System.out.println("");
        System.out.println("");
        System.out.println("Please select the option you would like to see");
        System.out.println("");
        System.out.println("");
        while(userInput != 4){
            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");
            try {
                userInput = scanner.nextInt();
                if (userInput < 1 || userInput > 4)
                    throw new Exception("Error, bad input, please enter a number 1-4");
            }
            catch (Exception userError){
                System.out.println("Error, bad input, please enter a number 1-4");
                System.out.println("");
                System.out.println("");
            }
            if(userInput == 1){
                alphabeticalSort(characters);
                System.out.println("");
                System.out.println("");
            }
            if(userInput == 2){
                frequencySort(characters);
                System.out.println("");
                System.out.println("");

            }
            if(userInput == 3){
                charTypes(characters);
                System.out.println("");
                System.out.println("");
            }




            }
        System.out.println("");
        System.out.println("");
        System.out.println("Character Sorter Successfully Exited");

        }
    public static void alphabeticalSort(int[] charArray){
        for(int i = 0; i < 256; i++){
            if(charArray [i] != 0){
                System.out.println((char)(i) + " freq: " + charArray[i]);
            }
        }

    }
    public static void frequencySort(int[] userArray){
        int temp = 0;
        char tempChar = 0;
        int freqArray[] = new int[256];
        char charArray[] = new char[256];
        for(int i = 0; i < 256; i++){
            freqArray[i] = 0;
            charArray[i] = '0';
        }
        for(int i = 0; i < 256; i++){
            for(int j = 0; j < 256; j++){
                if(charArray[j] > charArray[j + 1]){
                    tempChar = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j+1] = tempChar;
                if(freqArray[j] > freqArray[j + 1]){
                    temp = freqArray[j];
                    freqArray[j] = freqArray[j+1];
                    freqArray[j+1] = temp;
                }


                }
            }
        }


    }
    public static void charTypes(int[] charArray){
        int numbers = 0;
        int symbols = 0;
        int letters = 0;
        int whitespace = 0;
        for(int i = 0; i < 256; i++){
            if (Character.isDigit(i)) numbers += charArray[i];
            else if (Character.isLetter(i)) letters += charArray[i];
            else if (Character.isWhitespace(i)) whitespace += charArray[i];
            else symbols += charArray[i];

        }
        System.out.println("Textual character count: " + letters);
        System.out.println("Numerical character count: " + numbers);
        System.out.println("WhiteSpace character count: " + whitespace);
        System.out.println("Symbols character count: " + symbols);
    }





    }



