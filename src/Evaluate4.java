public class Evaluate4 {
    public static void main(String[] args){
       int x=5;
        System.out.println("x="+x);
        int x1=++x - x++ + --x;

        System.out.println("++x - x++ + --x= "+x1);
    }
}
