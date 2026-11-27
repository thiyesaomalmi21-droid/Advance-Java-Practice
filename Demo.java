/* class Thread{
    public static void sleep(long x) throws InterruptedException{
    
    }
}*/
class Demo{
    public static void main(String args[]){
        System.out.println("Start main");
        int[] ar=new int[3];
        
        try{
            ar[-3]=100;
            Thread.sleep(2000);
        }catch(InterruptedException ex){
            System.out.println("Caught the innterrupted excption thrown by thread class");
        }catch(IndexOutOfBoundsException ex){
            System.out.println("index error");
        }
        
        System.out.println("End main");
    }
}
