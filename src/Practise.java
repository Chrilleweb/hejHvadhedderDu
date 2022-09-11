import java.util.Scanner;

public class Practise {
    Scanner scan = new Scanner(System.in);

    private Beregninger beregninger = new Beregninger();

    public void hvadHedderdu(){
        System.out.println("Hej, hvad hedder du?");
        String userName = scan.next();
        beregninger.setUserName(userName);
        System.out.println("Hej " + userName);
    }

    public void userAlder(){
        System.out.println("Hvor gammel er du?");
        int userAlder = scan.nextInt();
        beregninger.setUserAlder(userAlder);
        System.out.println("Du er " + userAlder + " år gammel");
    }

    public void fritid(){
        System.out.println("Hvad laver du i din fritid?");
        String userFritid = scan.next();
        System.out.println("Okay, du hedder " + beregninger.getUserName() +" og kan lide " + userFritid + " i din fritid, hvad ellers?");
    }

    public void tid(){
        System.out.println("du er "
                + beregninger.getUserAlder()
                + " år gammel, det vil sige du er født i "
                + beregninger.getTal());
    }

    public void start(){
        hvadHedderdu();
        userAlder();
        fritid();
        tid();
    }

    public static void main(String[] args){
        Practise practise = new Practise();
        practise.start();
    }
}
