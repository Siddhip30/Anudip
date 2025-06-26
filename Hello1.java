class Hello1{

    int add(){
        int a=10;
        int b=30;
        int sum = a + b;
        return sum;
    }
Hello1(){
    System.out.println("This is constructor");
}
    public static void main(String[] args){
    Hello1 h1 = new Hello1();
    int sum = h1.add();
    System.out.println(sum);
    }
}