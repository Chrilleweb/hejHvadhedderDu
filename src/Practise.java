import java.util.Scanner;

public class Practise {
    Scanner scan = new Scanner(System.in);
    public void hvadHedderdu(){
        System.out.println("Hej, hvad hedder du?");
        String userName = scan.next();
        System.out.println("Hej " + userName);
    }

    public void userAlder(){
        System.out.println("Hvor gammel er du?");
        int userAlder = scan.nextInt();
        System.out.println("Du er " + userAlder + " år gammel");
    }


    public void start(){
        hvadHedderdu();
        userAlder();
    }

    public static void main(String[] args){
        Practise practise = new Practise();
        practise.start();
    }
}
