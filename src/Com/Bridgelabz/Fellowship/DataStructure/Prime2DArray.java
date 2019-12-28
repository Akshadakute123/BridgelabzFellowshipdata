package Com.Bridgelabz.Fellowship.DataStructure;

public class Prime2DArray
{

	public static void main(String[] args) {
		int[][] arr=new int[10][25];
		int i,temp,first=0,second=0,third=0,forth=0,fifth=0,sixth=0,seventh=0,eighth=0,nineth=0,tenth=0;
		for(i=2;i<=1000;i++)
		{
			temp=0;
			for(int j=2;j<=i/2;j++)
			{
				
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp==0)
			{
				if(i>0 && i<101)
				{
					arr[0][first]=i;
					first++;
				}
				else if(i>100 && i<200)
				{
					arr[1][second]=i;
					second++;
				}
				else if(i>200 && i<301)
				{
					arr[2][third]=i;
					third++;
				}
				else if(i>300 && i<401)
				{
					arr[3][forth]=i;
					forth++;
				}
				else if(i>400 && i<501)
				{
					arr[4][fifth]=i;
					fifth++;
				}
				else if(i>500 && i<601)
				{
					arr[5][sixth]=i;
					sixth++;
				}
				else if(i>600 && i<701)
				{
					arr[6][seventh]=i;
					seventh++;
				}
				else if(i>700 && i<801)
				{
					arr[7][eighth]=i;
					eighth++;
				}
				else if(i>800 && i<901)
				{
					arr[8][nineth]=i;
					nineth++;
				}
				else if(i>900 && i<1001)
				{
					arr[9][tenth]=i;
					tenth++;
				}
			}
		}
			for(i=0;i<10;i++) 
			{
				for(int j=0;j<25;j++)
				{
					
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}

}