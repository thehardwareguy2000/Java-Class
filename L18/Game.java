	import java.io.*;

enum Selection{
	ROCK,PAPER,SCISSOR;

}


class Game{
	public static void main(String args[]){
	Console c= System.console();
	Selection comp,user;
	int nt=0,nu=0,nc=0;
	int t=1;
while(t<=3){
	int r=(int)(Math.random()*3);
	if(r==0) comp=Selection.ROCK;
	else if(r==1) comp=Selection.PAPER;
	else  comp=Selection.SCISSOR;


	int op=Integer.parseInt(c.readLine("0 ROCK ||1 PAPER||2 SCISSOR"));

	if(op==0)  user=Selection.ROCK;
	else if(op==1)  user=Selection.PAPER;
	else  user=Selection.SCISSOR;

System.out.println(user+"   "+comp);
	t++;	
if (user==Selection.ROCK && comp==Selection.ROCK)
		nt++;
else if(user==Selection.PAPER && comp==Selection.PAPER)
		nt++;
else if(user==Selection.SCISSOR && comp==Selection.SCISSOR)
		nt++;
else if(user==Selection.PAPER && comp==Selection.ROCK)
		nu++;
else if(user==Selection.ROCK && comp==Selection.SCISSOR)
		nu++;
else if(user==Selection.SCISSOR && comp==Selection.PAPER)
		nu++;
else if(user==Selection.PAPER && comp==Selection.ROCK)
		nc++;
else if(user==Selection.SCISSOR && comp==Selection.PAPER)
		nc++;
else if(user==Selection.ROCK && comp==Selection.SCISSOR)
		nc++;

	}
	}
}