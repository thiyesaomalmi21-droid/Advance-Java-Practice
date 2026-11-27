class Demo{
    public static void main(String args[]){
        System.out.println("Start main");
        int[] ar=new int[3];
        ar[-3]=100;
        Thread.sleep(2000);
        System.out.println("End main");
    }
}
