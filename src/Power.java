public class Power {
    public static void main(String[] args)
    {
        int base=2;
        int expo=3;
        int result=1;
        while(expo>0){
            result=result*base;
            expo--;
        }
        System.out.println(result);

    }
}
