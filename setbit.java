import java.util.*;
class setbit{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int p=s.nextInt();
    if((a&(1<<p))!=0){
        System.out.println("set bit");
    }
    else{
        System.out.println("not setbit");

        }
        }
}