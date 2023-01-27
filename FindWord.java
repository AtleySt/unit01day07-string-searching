import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the sentence you would like to search");
        String text = scanner.nextLine();
        text = text + " ";
        System.out.println("Now enter the character you would like to search for");
        String searchChar = scanner.nextLine();

        int charPos = text.indexOf(searchChar);
        if (charPos > -1){
            int wordEnd = text.indexOf(" ", charPos);
            String startofsentence = text.substring(0, charPos);
            int startofword = startofsentence.lastIndexOf(" ");
            System.out.println();
            String result = text.substring(startofword+1,wordEnd);
            System.out.println(result);
        } else {
            System.out.println("Letter not in sentence");
        }
        
        
    }
}
