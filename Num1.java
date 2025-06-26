class Num1{
    public static void main(String[] args) {
        int a = 10, b = 15, c = 20;
        int max;
        if(a >= b && a >= c) {
            max = a;
        } else if(b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Maximum no. is:"+max);
    }
}