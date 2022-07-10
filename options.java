import java.io.*;
class options
{void x()throws Exception
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Please enter your option:\n1.Premier Badminton\n2.Word Search\n3.Bouncing Ball\n4.Rules\n5.Credits\n6.Some More Information");
int n=Integer.parseInt(br.readLine());
if(n!=1&&n!=2&&n!=3&&n!=4&&n!=5&&n!=6){System.out.println("Invalid Entry");}
if(n==1||n==2||n==3||n==4||n==5||n==6){
{switch(n)
{case 1:{addons a1=new addons();
    a1.main();
    premierbadminton n1=new premierbadminton();
       n1.load();
       n1.main();
    break;}
 case 2:{wsmain w1=new wsmain();
         w1.main();
         break;}
 case 3:{bounceball b1=new bounceball();
         b1.main();
         break;}
 case 4: {Rules r1=new Rules();
          r1.rul();
          break;}
 case 5:{credits c1=new credits();
         c1.main();
         break;}
 case 6:{info i1=new info();
    i1.main();
break;}}}}}}
    