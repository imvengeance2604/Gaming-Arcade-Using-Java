import java.io.*;
class bounceesh
{void bal()throws Exception
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      char a[][]={{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                  {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','_','_','_','_','_','_','_','_','_','+','_','_','_',' ',' ','|',' ',' ',' ',' ',' ',' '},
                  {'O','_','_','_',' ','+','_','_','_','_','+','_','_',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','_','_','|','_','_','+','_','_','_'}};
       System.out.println("Enter to continue");
       char ch=(char)br.read();
       int f=0;
       while(f==0)
       {int x=0;
           int y=0;
           Thread.sleep(100);
           System.out.println("\u000c");
           

           for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            
             for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {if(Character.isLetter(a[i][j])){x=i;y=j;}}
            }
            
            if(a[x][y]==a[2][34])
            {
                System.out.println("Game Over Bye");
                break;
            }
            if(a[x][y]!=a[2][4]&&a[x][y]!=a[2][9]&&a[x][y]!=a[2][12]&&a[x][y]!=a[1][21]&&a[x][y]!=a[1][25]&&a[x][y]!=a[2][27]&&a[x][y]!=a[2][30]&&a[x][y]!=a[2][34]){a[x][y+1]=a[x][y];
                                                                                                                                                                      a[x][y]='_';
                                                                                                                                                                    y++;}
                if(a[x][y]==a[2][4]||a[x][y]==a[2][9]||a[x][y]==a[2][12]||a[x][y]==a[1][21]||a[x][y]==a[1][25]||a[x][y]==a[2][27]||a[x][y]==a[2][30]||a[x][y]==a[2][34]){
                    char ak=(char)br.read();
                    switch(ak)
                    {case 'w':{if(a[x][y+1]!='+'){System.out.println("Wrong value entered reenter correctly");Thread.sleep(1000);break;}
              
               a[x-1][y]=a[x][y];
               a[x][y]='_';
               System.out.print("\u000c");
               Thread.sleep(100);
               for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
               Thread.sleep(100);
               a[x-1][y+1]=a[x-1][y];
               a[x-1][y]=' ';
               System.out.print("\u000c");
               Thread.sleep(100);
               for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
               Thread.sleep(100);
               a[x-1][y+2]=a[x-1][y+1];
               a[x-1][y+1]=' ';
               System.out.print("\u000c");
               Thread.sleep(100);
                   for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
           
               Thread.sleep(100);
               a[x][y+2]=a[x-1][y+2];
               a[x-1][y+2]=' ';
           break; }
            case 'e':{if(a[x-1][y+1]!='_'){System.out.println("Wrong value entered reenter correctly");Thread.sleep(1000);break;}
               
                a[x-1][y]=a[x][y];
                a[x][y]='_';
                System.out.println("\u000c");
                Thread.sleep(100);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            a[x-1][y+1]=a[x-1][y];
            a[x-1][y]=' ';
            System.out.println("\u000c");
                Thread.sleep(100);
                    for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }break;
        }
            case 'a': {if(a[x+1][y+1]!='_'){System.out.println("Wrong value entered reenter correctly");Thread.sleep(1000);break;}
              
                a[x][y+1]=a[x][y];
                a[x][y]='_';
            System.out.println("\u000c");
                Thread.sleep(100);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            a[x+1][y+1]=a[x][y+1];
            a[x][y+1]=' ';
            
            System.out.println("\u000c");
                Thread.sleep(100);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }break;} 
            case 'x':{if(a[x][y+1]!='|'){System.out.println("Wrong value entered reenter correctly");Thread.sleep(1000);break;}
              
                a[x-1][y]='O';
                   a[x][y]='_';
                   System.out.println("\u000c");
                Thread.sleep(150);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            a[x-2][y]='O';
            a[x-1][y]=' ';
            System.out.println("\u000c");
                Thread.sleep(150);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            a[x-2][y+1]='O';
            a[x-2][y]=' ';
            System.out.println("\u000c");
                Thread.sleep(140);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            a[x-2][y+2]='O';
            a[x-2][y+1]=' ';
            System.out.println("\u000c");
                Thread.sleep(150);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            a[x-1][y+2]='O';
            a[x-2][y+2]=' ';
            System.out.println("\u000c");
                Thread.sleep(150);
                        for(int i=0;i<a.length;i++)
           {for(int j=0;j<a[0].length;j++)
               {System.out.print(a[i][j]);}
                System.out.println();
            }
            a[x][y+2]='O';
            a[x-1][y+2]=' '; 
            break;}
        
    }} 
              }    
               System.out.println("Enter 1 to play again and Enter 2 to go to Options Menu");
    int nj=Integer.parseInt(br.readLine());
    if(nj==1){bounceesh b1=new bounceesh();
        System.out.println("\u000c");
        b1.bal();}
        if(nj==2){options o1=new options();
            System.out.println("\u000c");
            o1.x();}
                                                                                                                                                                     
             
            
          
                
        
            
        
    }
}