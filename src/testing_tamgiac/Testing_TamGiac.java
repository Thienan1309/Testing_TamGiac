/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing_tamgiac;

import java.util.Scanner;


public class Testing_TamGiac {
    double a;
    double b;
    double c;
    public Testing_TamGiac(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String xacThuc() {
        if(this.a <=0 || this.b <= 0 || this.c <=0){
            return "InvalidInput";
        }
        if ((this.a + this.b <= this.c) || (this.a + this.c <= this.b) || (this.b + this.c <= this.a)) {
            return "NotATriangle";
        }
        if (this.a == this.b && this.b == this.c) {
            return "Tam giac Deu"; 
        } else if (this.a == this.b || this.b == this.c || this.a == this.c) {
            return "Tam gia can";
        } else {
            return "Tam giac thuong";
        }
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac canh cua tam gia: ");
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String ketQua = tg.xacThuc();
        System.out.println("Ket qua: " + ketQua);
    }
    
}
