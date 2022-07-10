import java.io.*;
class wordsearch
{void main()throws Exception
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String a[][]={{" ","0","1","2","3","4","5","6","7","8","9","10","11","12"},
                 {"0","C","O","N","C","E","I","T","E","D","Y","E","G","T"},
                 {"1","D","R","D","J","G","I","S","C","G","I","V","I","U"},
                 {"2","A","S","E","R","V","I","C","E","O","P","I","N","S"},
                 {"3","G","C","O","N","F","O","R","M","D","E","L","O","G"},
                 {"4","I","R","E","V","E","N","G","E","E","R","F","I","N"},
                 {"5","F","T","O","H","H","A","H","T","H","S","B","T","I"},
                 {"6","T","G","T","E","E","O","L","G","A","E","O","C","W"},
                 {"7","S","A","R","R","I","V","L","V","T","C","D","I","E"},
                 {"8","J","O","Y","F","U","L","F","Y","E","U","Y","L","N"},
                 {"9","C","C","O","R","N","H","F","A","I","T","H","F","E"},
                 {"10","L","E","V","I","P","E","E","C","N","E","L","F","R"},
                 {"12","I","B","C","E","I","W","R","A","T","H","E","A","C"},
                 {"13","N","A","E","T","N","F","D","L","R","O","W","N","C"}};
                 
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
         for(int k=0;k<13;k++)
         {for(int m=0;m<13;m++)
             {System.out.print(" "+a[k][m]+" ");}
             System.out.println();}
             int a1=0;
             int f1=0;
             System.out.println("1.Gifts     7.Revenge");
             System.out.println("2.God       ");
             System.out.println("3.Wrath     ");
             System.out.println("4.World    ");
             System.out.println("5.Grace     ");
             System.out.println("6.Body     ");
             System.out.println("Enter Word number and enter location of the corresponding word letter wise");      
             while(f1==0)
             
            { int no=Integer.parseInt(br.readLine());
             double loc=Double.parseDouble(br.readLine());
             if(no==1&&loc!=3040506070.0){System.out.println("Wrong Location");f1=1;}
              if(no==1&&loc==3040506070.0){System.out.println("You are right");a1++;}
               if(no==2&&loc!=182838.0){System.out.println("Wrong ");f1=1;}  
              if(no==2&&loc==182838.0){System.out.println("You Are right ");a1++;} 
              if(no==3&&loc!=115116117118119.0){System.out.println("Wrong");f1=1;}
             if(no==3&&loc==115116117118119.0){System.out.println("You are right");a1++;}
             if(no==4&&loc!=1261271281291210.0){System.out.println("Wrong");f1=1;}
             if(no==4&&loc==1261271281291210.0){System.out.println("You are right");a1++;}
             if(no==5&&loc!=133134135136137.0){System.out.println("Wrong");f1=1;}
             if(no==5&&loc==133134135136137.0){System.out.println("You are right");a1++;}
             if(no==6&&loc!=510511512513.0){System.out.println("Wrong");f1=1;}
              if(no==6&&loc==510511512513.0){System.out.println("You are right");a1++;}
              if(no==7&&loc!=41424344454647.0){System.out.println("Wrong");f1=1;}
                if(no==7&&loc==41424344454647.0){System.out.println("You are right");a1++;}
if(a1==7){System.out.println("Congrats You Have Found All Words");break;}}
 System.out.println("Enter 1 to play again and Enter 2 to go to Options Menu");
    int nj=Integer.parseInt(br.readLine());
    if(nj==1){wordsearch w1=new wordsearch();
        System.out.println("\u000c");
        w1.main();}
        if(nj==2){options o1=new options();
            System.out.println("\u000c");
            o1.x();}}}
             
        
        
        
         
     