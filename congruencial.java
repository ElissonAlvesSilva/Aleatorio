import java.util.Date;
import java.util.Scanner;

public class congruencial {
		private static int Congruencial(int a, int Xn,int m, int b){
			int result = ((a*Xn+b)%m);	
			return result;
		}

	public static void main(String[] args) {
		System.out.println("Entre com uma quantidade de numeros: ");
      
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      
        int a = 243;
        int X0 = 133;
        int mod = 902;
        
        
        
        int Xn= 0;
        
        System.out.println("X0 = "+X0);
        
        for (int i = 0; i<n;i++){
        	
        	
        	int b = (int)(new Date().getTime()/1000)+i;
        	
        	
        	Xn = congruencial.Congruencial(a, X0, mod,b);
        	
        	System.out.println("X"+(i+1)+" = "+"("+a+"*"+X0+"+"+b+")%"+mod+" = "+Xn );
        	
        	X0 = Xn;
        	
        }
	}

}
