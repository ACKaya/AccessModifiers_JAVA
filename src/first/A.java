package first;

public class A {
    protected int a;
    private int b;

    public A(int a,int b) {
        this.a = a;
        this.b= b;
    }
    private int toplama(){
        return this.a+this.b;

    }
    public int  print(){
        return this.toplama();

    }
}
