class Demo{
    public static void myMethod1(){
        System.out.println("Start myMethod1()..");
        myMethod2(); 
        System.out.println("End myMethod1()..");
    }
    public static void myMethod2(){
        System.out.println("Start myMethod2()..");
        try{
            myMethod3();
        }catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
         
        System.out.println("End myMethod2()..");
    }
    public static void myMethod3(){
        System.out.println("Start myMethod3()..");
        int[] ar=new int[3];
        ar[3]=100;
        
        System.out.println("End myMethod3()..");
    }
    public static void main(String args[]){
       System.out.println("Start main..");
       myMethod1(); 
       System.out.println("End main.."); 
    }
}
