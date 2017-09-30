import java.util.* ;
public class Main {

    public static void main(String[] args) {
        //攝氏轉華氏
        Scanner in=new Scanner(System.in);
        int X ,Y;  //X身高 Y身高
        double x ,y ;
        X=in.nextInt();
        Y=in.nextInt();
        x = X/2.54;
        y = Y/0.454;
        System.out.printf("%.14f\n",x);
        System.out.printf("%.14f\n",y);
    }
}