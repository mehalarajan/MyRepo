public class quadraticroot2 {
    public static void main(String[] args){
        double a=2, b=10, c=5;
        double root1, root2;
        double d=b*b-4*a*c;
        System.out.println(d);
        if(d>0){
            root1=(-b +Math.sqrt(d))/(2*a);
            root2=( b -Math.sqrt(d))/(2*a);
            System.out.format("root1=%.2f and root2=%.2f",root1 ,root2);
        }
        else if(d == 0){
            root1= root2=-b/(2*a);
            System.out.format("root1 =root2=%.2f",root1);
        }
        else{
            double real= -b/ (2*a);
            double imaginary= Math.sqrt(-d)/(2*a);

            System.out.format("real=%.2f+%.2i and imaginary= %.2f-%.2i", real,imaginary);
        }
    }

}
