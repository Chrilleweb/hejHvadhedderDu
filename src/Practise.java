import java.util.Scanner;

public class Practise {
    Scanner scan = new Scanner(System.in);
    public void hvadHedderdu(){
        System.out.println("Hej, hvad hedder du?");
        String userName = scan.next();
        System.out.println("Hej " + userName);
    }


    public void start(){
        hvadHedderdu();
    }

    public static void main(String[] args){
        Practise practise = new Practise();
        practise.start();
    }
}
