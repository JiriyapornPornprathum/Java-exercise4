

public class exercise4_3 {

    private int num;
    private String msg;

    public void setPrime(int num){
        this.num = num;
    }

    public void cal(){
        int i = this.num;
        if((i==1 || i%2 == 0 || i%3 == 0 || i%5==0 || i%7==0)  && (i!=2 && i!=3 && i!=5 && i!=7)){
            msg = "Number "+ this.num +" is not prime number.";
        }else{
            msg = "Number "+ this.num +" is prime number.";
        }
    }

    public void display(){
        System.out.print(msg);
    }
    
}
