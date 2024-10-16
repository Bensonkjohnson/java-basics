public class Fibanooci {
    public static void main(String[] arg){
        int num = 10, n1 = 0,n2 = 1;
        System.out.println("the numbers are "+n1  + "  , "+ n2);
        for(int i=1;i<=num;i++){
            int n3 =n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}