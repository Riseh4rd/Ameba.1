import java.util.Scanner;
public class Main {
    public static long[] AmebaGotSplit(long[] Variables) {
        Variables[0] =Variables[0]*Variables[1];
        Variables[5] =Variables[5]+Variables[2];
        System.out.println("[Ameba Count]:"+Variables[0]+" [Time Now]:"+Variables[5]+"/"+Variables[3]);
        return Variables;
    }
    public static void main(String[] args) throws InterruptedException {
System.out.println("Enter [Ameba Count]-[Split Count]-[Split Time]-[Total Time]");
        Scanner Input =new Scanner(System.in);
        String GotInput =Input.nextLine();
        String[] Splitter = GotInput.split("-");
        long[] Variables = new long[6];
        for (int i = 0; i <4 ; i++) {Variables[i] = Integer.parseInt(Splitter[i]);}
        Variables[5]=0;
        while(!(Variables[5]>=Variables[3])){Thread.sleep(300); Variables=AmebaGotSplit(Variables);}
    }
}