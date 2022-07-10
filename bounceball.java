import java.io.*;
class bounceball
{void main()throws Exception
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 To play Manual\n2 to play Auto");
        int n=Integer.parseInt(br.readLine());
        switch(n)
        {case 1:{System.out.println("Enter 1 for Easy level and 2 for Difficult level");
                  int x=Integer.parseInt(br.readLine());
                  if(x==1){bouncesh b1=new bouncesh();
                           b1.bal();}
                           if(x==2){bounce b1=new bounce();
                               b1.bal();}
                               break;}
         case 2:{System.out.println("Enter 1 for Easy level and 2 for Difficult level");
                  int x=Integer.parseInt(br.readLine());
                  if(x==1){bounceesh b1=new bounceesh();
                           b1.bal();}
                           if(x==2){bouncee b1=new bouncee();
                               b1.bal();}
                               break;}  }}}                    