
public class exercise4_1 {

        private int start;
        private int end;
       
        public void setStart(int start){
            this.start = start;
        }

        public void setEnd(int end){
            this.end = end;
        }

        public void cal(){
            int sum = -1 ;
            for(int i = this.start; i <= this.end; i++){
                if(i%3 == 0 && i%5 == 0){
                    sum += 1;
                        if(sum % 5 == 0){
                            System.out.print("\n" + i + " ");  
                        }
                        else{
                            System.out.print(i + " ");
                        }
                    }
                }
            }
    
}
