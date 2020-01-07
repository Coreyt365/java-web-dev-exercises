package excercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[]args){
        String firstChapter = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Type in A term, to see if it's in the first paragraph of Alice in Wonderland.");
        String term = input.nextLine();
        input.close();
        //System.out.println(firstChapter.toLowerCase().contains(term.toLowerCase()));
        if (firstChapter.toLowerCase().contains(term.toLowerCase())){
            System.out.println(firstChapter.indexOf(term));
            System.out.println(term.length());
            firstChapter.replaceAll(term,"");
            System.out.println(firstChapter);
        }
    }

}
