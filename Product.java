class Product{

    int product(){
        int a=10;
        int b=30;
        int mul = a * b;
        return mul;
    }
Product(){
    System.out.println("This is constructor");
}
    public static void main(String[] args){
    Product p1 = new Product();
    int mul = p1.product();
    System.out.println(mul);
    }
}