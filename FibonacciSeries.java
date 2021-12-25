package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//Initialization
		int range=8, firstNum=0, secNum=1 , sum=0;
		
		//Print first and second Number of the series
		System.out.print(firstNum+" "+secNum);
		
		//loop to print rest of the series
		for(;sum<=range;)
		{
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.print(" "+sum);
		}

	}

}
