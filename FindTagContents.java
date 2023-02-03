// good work
import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the HTML you would like to search");
        String text = scanner.nextLine();

        System.out.println("Now enter the tag you would like to search within");
        String searchTag = scanner.nextLine();

        int tagPos = text.indexOf("<"+searchTag+">");
        if (tagPos > -1) {
            int textStart = text.indexOf(">", tagPos)+1;
            int textEnd = text.indexOf("<", textStart);

            System.out.println(text.substring(textStart,textEnd));
        } else {
            System.out.println("There are no '"+searchTag+"' tags in the entered HTML");
        }
    }
}