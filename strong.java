import java.util.*;
class strong{
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		int pow=1,sum=0,digit,fact,ctr;
		while(num/pow!=0)
		{
			digit=(num/pow)%10;
			for(ctr=1,fact=1;ctr<=digit;fact=fact*ctr,ctr++);
				sum=sum+fact;
				pow*=10;
		}
		if(num==sum)
		{
			System.out.println(num);
		}
		else{
		    System.out.println("no");
		}
	}
}