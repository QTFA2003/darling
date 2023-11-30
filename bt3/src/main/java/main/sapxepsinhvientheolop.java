package main;

import java.util.*;


class sv implements Comparable<sv>{
    private String ten, msv, malop, ns;

    public sv(String msv, String ten, String malop, String ns){
        this.ten=ten;
        this.malop=malop;
        this.msv=msv;
        this.ns=ns;
    }

    @Override
    public String toString(){
        return msv+" "+ten+" "+malop+" "+ns;
    }
    public int compareTo(sv o){
//        if (this.malop.compareTo(o.malop)!=0){
//            return this.malop.compareTo(o.malop);
//        }
        return this.msv.compareTo(o.msv);
    }
}

public class sapxepsinhvientheolop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();
        sv[] a=new sv[1001];
        int i=0;
        while(sc.hasNext()){
            a[i]=new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            i++;
        }
        Arrays.sort(a);
        for(sv x:a){
            System.out.println(x);
        }
    }
}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT03-B
sv4@stu.ptit.edu.vn
*/