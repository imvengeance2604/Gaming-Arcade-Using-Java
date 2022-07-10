import java.io.*;
class wsmain
{void main()throws Exception
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        wordsearch y1=new wordsearch();
        y1.main();
        System.out.println("Enter 1 to play again");
        int n=Integer.parseInt(br.readLine());
        if(n==1){
            System.out.println("\u000c");
            y1.main();}
        ws1 t1=new ws1();
        t1.ws();
    }}