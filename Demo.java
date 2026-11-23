class A{}
class B extends A{
    public void mB(){
        System.out.println("Hello");
    }
}
class C extends A{
    public void mC(){
        System.out.println("Hello");
    }
}
class Demo{
    public static void main(String args[]){
        A a1=new B();
        C c1=(C)a1;
    }
}

