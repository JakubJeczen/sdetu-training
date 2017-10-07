package basics;

public class Assignment {

	public static void main(String[] args) {
		
int a = 3;
int numbers[] = {303,6,90,8,17};
System.out.println("Suma dla " + a + " wynosi " + sum(a));
System.out.println("Silnia z " + a + " wynosi " + fact(a));
System.out.println("Najmniejszy z elementow tablicy numbers to " + checkMin(numbers));
System.out.println("Najmniejszy z elementow tablicy numbers to " + checkMax(numbers));
System.out.println("Srednia arytmetyczna elementow tablicy numbers to " + checkAv(numbers));
	}
	
	
	public static int sum(int n){
		
		if (n == 1){
			return 1;
		}
		else
		{
			return n + sum(n - 1);
		}
	}
	
	public static int fact(int n){
		
		if (n == 1){
			return 1;
		}
		else
		{
			return n * fact(n - 1);
		}
	}
	
	public static int checkMin(int[] array){
		int min = array[0];
		for (int x = 1; x < array.length; x++){
			if (array[x] < min){
				min = array[x];
			}
		}
		
		return min;
	}
	
	public static int checkMax(int[] array){
		int max = array[0];
		for (int x = 1; x < array.length; x++){
			if (array[x] > max){
				max = array[x];
			}
		}
		
		return max;
	}
	
	public static double checkAv(int [] array){
		int len = array.length;
		int suma = 0;
		for (int x = 0; x < array.length; x++){
			suma += array[x];
		}
		System.out.println(len);
		return suma / len;
		
	}
	
	

}
