public class PrimeCheck {
    public static void main(String[]arg){
        int num = 12;
        boolean prime = false;
        for(int i =2;i<=num/2;i++){
            if(num % i ==0){
                prime =true;
            }
        }
        if(prime){
            System.out.println("its not a prime number");
        }else{
            System.out.println(" its a  prime number");
        }
    }
    
}
