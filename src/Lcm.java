public class Lcm {
    public static void main(String[] args) {
        int n1 = 44, n2 = 12, lcm;
        lcm = (n1 > n2) ? n1 : n2;
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
             }
            ++lcm;
        }
    }
}
