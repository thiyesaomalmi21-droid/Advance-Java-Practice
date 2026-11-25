class Demo{
    public static void main(String args[]){
        System.out.println("Start");
        
        int a;
        
        try{
           a=100;
        }catch(ArithmeticException ex){
            
        }
        System.out.println("A :"+a);
        System.out.println("End");
    }
}
