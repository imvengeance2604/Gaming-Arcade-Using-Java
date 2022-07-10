import java.io.*;
class ws1
{void ws()throws Exception
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a[][]={{" ","0","1","2","3","4","5","6","7","8","9","10","11","12"},
                      {"0","S","I","T","T","H","T","C","T","E","R","Y","L","O"},
                      {"1","E","W","G","O","E","A","Y","T","N","W","L","A","J"},
                      {"2","R","E","D","E","E","L","V","D","G","T","F","K","U"},
                      {"3","D","E","E","A","T","T","C","E","E","R","F","D","M"},
                      {"4","Y","S","A","A","E","S","A","S","T","M","R","R","P"},
                      {"5","A","P","W","D","G","W","T","K","W","P","I","I","S"}}; 

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        for(int m=0;m<6;m++)
            {for(int n=0;n<13;n++)
                {System.out.print(a[m][n]+" ");}
                System.out.println();}
                int a1=0;
                int f1=0;
                System.out.println("1.Sit      5.Eat");
                System.out.println("2.Help     6.Get");
                System.out.println("3.Skate");
                System.out.println("4.Have");
                System.out.println("Enter Word number put hyphen and enter location of the corresponding word letter wise");      
             while(f1==0)
                      { int no=Integer.parseInt(br.readLine());
             double loc=Double.parseDouble(br.readLine());
             if(no==1&&loc!=000102.0){System.out.println("Wrong Location");f1=1;}
              if(no==1&&loc==000102.0){System.out.println("You are right");a1++;}
               if(no==2&&loc!=60616263.0){System.out.println("Wrong ");f1=1;}  
              if(no==2&&loc==60616263.0){System.out.println("You Are right ");a1++;} 
              if(no==3&&loc!=2435465768.0){System.out.println("Wrong");f1=1;}
             if(no==3&&loc==2435465768.0){System.out.println("You are right");a1++;}
             if(no==4&&loc!=04152637.0){System.out.println("Wrong");f1=1;}
             if(no==4&&loc==04152637.0){System.out.println("You are right");a1++;}
             if(no==5&&loc!=323334.0){System.out.println("Wrong");f1=1;}
             if(no==5&&loc==323334.0){System.out.println("You are right");a1++;}
             if(no==6&&loc!=344454.0){System.out.println("Wrong");f1=1;}
              if(no==6&&loc==344454.0){System.out.println("You are right");a1++;}
              if(a1==6){System.out.println("Congrats You Have Found All Words");break;}}
             System.out.println("Enter 1 to play again and Enter 2 to go to Options Menu");
    int nj=Integer.parseInt(br.readLine());
    if(nj==1){ws1 w=new ws1();
        System.out.println("\u000c");
        w.ws();}
        if(nj==2){options o1=new options();
            System.out.println("\u000c");
            o1.x();}}}
                
                
                
           