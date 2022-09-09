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

    public void fritid(){
        System.out.print("Hvad laver du i din fritid?");
        String userFritid = scan.next();
        System.out.println("Okay, du hedder");
    }

    public void start(){
        hvadHedderdu();
        userAlder();
        fritid();
    }

    public static void main(String[] args){
        Practise practise = new Practise();
        practise.start();
    }
}
