import java.util.Date;

public class Beregninger {
    private String userName;
    private int userAlder;
    private String userFritid;

    public Beregninger(){
        this.userName = userName;
    }


    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserAlder(int userAlder){
        this.userAlder = userAlder;
    }

    public String getUserName(){
        return userName;
    }

    public int getUserAlder(){
        return userAlder;
    }

    public String getTal(){
        Date d = new Date();
        int year = d.getYear();
        int currentYear = year + 1900;
        int bornYear = currentYear - userAlder-1;
        int bornYear1 = currentYear -userAlder;
        String bornYear2 = (bornYear + "/" + bornYear1);
        return bornYear2;
    }

}
