import java.util.Scanner;
public class Code{
    public static void main(String[] args) {
        double a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz. : ");
        a=input.nextDouble();
        System.out.print("ikinci sayiyi giriniz. : ");
        b=input.nextDouble();
        System.out.print("ucuncu sayiyi giriniz. : ");
        c=input.nextDouble();
        
        if((a==b)||(b==c)||(a==c)){System.out.println("*ERROR!\nLutfen birbirinden farkli sayiler giriniz!");}else{
            if(a<b&&a<c){
            if(b<c){
                System.out.println("a<b<c");}else{
                    System.out.println("a<c<b");}
            }else if(b<a&&b<c){
                if(a<c){
                    System.out.println("b<a<c");}else{
                        System.out.println("b<c<a");
                    }
                }else{
                    if(a<b){System.out.println("c<a<b");}else{
                        System.out.println("c<b<a");
                    }
                }
            }

        
            

    }
}