import java.io.*;
class info
{void main()throws Exception
    {BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("1.Badminton\n2.Word Search");
      int al=0;
        try{
            al=Integer.parseInt(br.readLine());}
           catch(Exception e)
           {System.out.println("please enter correct value");
                al=Integer.parseInt(br.readLine());}
          
       switch(al)
        {case 1:{System.out.println("Badminton is a racquet sport played using racquets to hit a shuttlecock across a net.\nAlthough it may be played with larger teams, the most common forms\nof the game are singles (with one player per side) and doubles (with two players per side).\nBadminton is often played as a casual outdoor activity in a yard or on a beach; formal games are played\non a rectangular indoor court. Points are scored by striking the shuttlecock with the racquet and landing it within the opposing\nside's half of the court.");

System.out.println("Each side may only strike the shuttlecock once before it passes over the net. Play ends once the shuttlecock has struck the floor or if a\nfault has been called by the umpire, service judge, or (in their absence) the opposing side.");

System.out.println("The shuttlecock is a feathered or (in informal matches) plastic projectile which flies differently\nfrom the balls used in many other sports. In particular, the feathers create much higher drag\ncausing the shuttlecock to decelerate more rapidly. Shuttlecocks also have a high\ntop speed compared to the balls in other racquet sports. The flight of the shuttlecock\ngives the sport its distinctive nature.");

System.out.println("The game developed in British India from the earlier game of battledore and shuttlecock.\nEuropean play came to be dominated by Denmark but the game has became very popular in Asia, with recent\ncompetitions dominated by China. Since 1992, badminton has been a Summer Olympic\nsport with five events: men's singles, women's singles, men's doubles,\nwomen's doubles, and mixed doubles. At high levels of play, the sport demands excellent fitness: players\nrequire aerobic stamina, agility, strength, speed, and precision. It is also a technical sport, requiring good motor coordination and the development\nof sophisticated racquet movements");
break;}
case 2:System.out.println("A word search, word find, word seek, word sleuth \nor mystery word puzzle is a word game that consists of \nthe letters of words placed in a grid, which usually has a \nrectangular or square shape. The objective of this puzzle is to find and \nmark all the words hidden inside the box. The words may be placed horizontally,\n vertically, or diagonally. Often a list of the hidden words is provided, but more\n challenging puzzles may let the player figure them out. Many word search puzzles have \na theme to which all the hidden words are related. The puzzles have,\n like crosswords and arrowords, been very popular in the United Kingdom, and - also in common with \nthese latter puzzles - have had complete magazines devoted to them.");}}}
