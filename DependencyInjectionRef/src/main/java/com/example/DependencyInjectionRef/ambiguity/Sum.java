package com.example.DependencyInjectionRef.ambiguity;

public class Sum {
    private int a;
    private int b;

    public Sum(double a, double b){
        this.a=(int)a;
        this.b=(int)b;
        System.out.println("Constructor: double,double");
    }
    public Sum(int a , int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor: int, int");
    }
    public Sum(String a ,String b){
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("Constructor: String, String");
    }

    public void doSum(){
        System.out.println(this.a+this.b);
    }
}