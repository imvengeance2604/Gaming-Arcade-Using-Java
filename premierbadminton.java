import java.io.*;
class premierbadminton
{void load()throws Exception
    {
        for(int i=0;i<=5;i++)
        {System.out.print("                                  Loading");
         System.out.print(".");
            Thread.sleep(100);
            
         System.out.print(".");
            Thread.sleep(100);
         System.out.print(".");
            Thread.sleep(100);
         System.out.print(".");
            Thread.sleep(100);
         System.out.print(".");
            
         System.out.print("\u000c");}}
    

      void main()throws Exception
 {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     {System.out.println("                              The Game is About to Begins"); 
          load();
          System.out.println("Enter your Difficulty level\n\t\t\t'4' for Easy\n\t\t\t'5' for Medium \n\t\t\t'6' for hard");
          int n=Integer.parseInt(br.readLine());
          int d=-1;
          
          int ak=0;
          if(n==4){while(ak==0)
             {int imp=0;
                 d++;
         System.out.println("Your score is:"+d+"\n\n");
              for(int i=0;i<5;i++)
                   {String yo="";
                       if(i==0){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Front Serve";
                               System.out.println("Computer's Serve:"+yo);}
                               if(a==1){yo="Back Serve";
                               System.out.println("Computer's Serve:"+yo);}}}
                        if(i>0&&imp==3){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Drop";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Lift";
                               System.out.println("Computer's Receive:"+yo);}}}
                                if(i>0&&imp==2){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Smash";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Lift";
                               System.out.println("Computer's Receive:"+yo);}}}
                                if(i>0&&imp==1){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Smash";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Drop";
                               System.out.println("Computer's Receive:"+yo);}}}
                               System.out.print("Enter your Shot:");
                               int lmno=Integer.parseInt(br.readLine());
                               if(i>0&&yo=="Drop"&&lmno!=1){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i>0&&yo=="Smash"&&lmno!=2){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i>0&&yo=="Lift"&&lmno!=3){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i==0&&yo=="Front Serve"&&lmno!=1){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i==0&&yo=="Back Serve"&&lmno!=3){System.out.println("Game Over Wrong Shot");ak=1;break;} 
                       imp=lmno;}}
                     
                    }
                if(n==5){while(ak==0)
             {int imp=0;
                 d++;
         System.out.println("Your score is:"+d+"\n\n");
              for(int i=0;i<6;i++)
                   {String yo="";
                       if(i==0){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Front Serve";
                               System.out.println("Computer's Serve:"+yo);}
                               if(a==1){yo="Back Serve";
                               System.out.println("Computer's Serve:"+yo);}}}
                        if(i>0&&imp==3){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Drop";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Lift";
                               System.out.println("Computer's Receive:"+yo);}}}
                                if(i>0&&imp==2){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Smash";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Lift";
                               System.out.println("Computer's Receive:"+yo);}}}
                                if(i>0&&imp==1){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Smash";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Drop";
                               System.out.println("Computer's Receive:"+yo);}}}
                               System.out.print("Enter your Shot:");
                               int lmno=Integer.parseInt(br.readLine());
                               if(i>0&&yo=="Drop"&&lmno!=1){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i>0&&yo=="Smash"&&lmno!=2){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i>0&&yo=="Lift"&&lmno!=3){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i==0&&yo=="Front Serve"&&lmno!=1){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i==0&&yo=="Back Serve"&&lmno!=3){System.out.println("Game Over Wrong Shot");ak=1;break;} 
                       imp=lmno;}}
                     
                    }
                 if(n==6){while(ak==0)
             {int imp=0;
                 d++;
         System.out.println("Your score is:"+d+"\n\n");
              for(int i=0;i<7;i++)
                   {String yo="";
                       if(i==0){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Front Serve";
                               System.out.println("Computer's Serve:"+yo);}
                               if(a==1){yo="Back Serve";
                               System.out.println("Computer's Serve:"+yo);}}}
                        if(i>0&&imp==3){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Drop";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Lift";
                               System.out.println("Computer's Receive:"+yo);}}}
                                if(i>0&&imp==2){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Smash";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Lift";
                               System.out.println("Computer's Receive:"+yo);}}}
                                if(i>0&&imp==1){int a=(int)Math.round(Math.random());
                           {if(a==0){yo="Smash";
                               System.out.println("Computer's Receive:"+yo);}
                               if(a==1){yo="Drop";
                               System.out.println("Computer's Receive:"+yo);}}}
                               System.out.print("Enter your Shot:");
                               int lmno=Integer.parseInt(br.readLine());
                               if(i>0&&yo=="Drop"&&lmno!=1){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i>0&&yo=="Smash"&&lmno!=2){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i>0&&yo=="Lift"&&lmno!=3){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i==0&&yo=="Front Serve"&&lmno!=1){System.out.println("Game Over Wrong Shot");ak=1;break;}
                       if(i==0&&yo=="Back Serve"&&lmno!=3){System.out.println("Game Over Wrong Shot");ak=1;break;} 
                       imp=lmno;}}
                     
                    }
                System.out.println("Finally Your Score ="+d+"\n\n");
            System.out.print("Enter 1 to Play Again");
            System.out.print("Enter 2 to go to Menu");
        int t=Integer.parseInt(br.readLine());
    if(t==1){premierbadminton nt1=new premierbadminton();
             nt1.main();}
     if(t==2){options ok1=new options();
        ok1.x();}}}}
               
           
           
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         