class Demo{
    public static void main(String args[]){
        System.out.println("Start");
        int x=42,y=2;
        int a;
        
        try{
           a=x/y;
           System.out.println("try block"); 
        }catch(ArithmeticException ex){
            a=-1;
            System.out.println("Catch Block");
        }
        System.out.println("x/y :"+a);
        System.out.println("End");
    }
}
