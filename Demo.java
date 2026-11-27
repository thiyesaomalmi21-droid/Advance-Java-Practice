class Demo{
    
    public static void main(String args[]){
       int[] ar=new int[3];
       String name="Omalmi";
       int a=0,b=6,c=3;
        try{
           ar[c]=name.charAt(b)/a;
        }catch(ArithmeticException | IndexOutOfBoundsException ex){
            System.out.println(" error");
        
       
        }catch(RuntimeException ex){
             System.out.println("Any runtime  error");
        }
        System.out.println("End main");
       
       
    }
}
