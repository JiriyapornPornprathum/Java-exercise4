import java.util.Scanner;

public class exercise4_2 {
    private String num ;
    private int all, odd, even, zero;
    
    Scanner sc = new Scanner(System.in);

    public void setNum(String num){
        this.num = num;
    }

    public int toStr(String num){
        this.all = num.length();
        return this.all;
    }

    public void cal(){
        String Anum = this.num;
        char char_temp ;
        for(int i = 0 ; i < this.all ; i++){
            char_temp = Anum.charAt(i);
            int n = Character.getNumericValue(char_temp);
            if(n == 0){
                this.zero++;
            }else if(n%2 == 0){
                this.odd++;
            }else{
                this.even++;
            }
        }
    }

    public int Odd(){
        return this.odd;
    }
    public int Even(){
        return this.even;
    }
    public int Zero(){
        return this.zero;
    }
}
