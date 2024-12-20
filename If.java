package homework;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {
    	Scanner b=new Scanner(System.in);
    	System.out.println("enter the grade ");
    	int grade=b.nextInt();
    	if(grade>=70&&grade<=79) {
    		System.out.println("C");
    	}else if(grade>=80&&grade<=89) {
    		System.out.println("B");
    	}else if(grade>=90&&grade<=100){
    		System.out.println("A");
    	}else {
    		System.out.println("fail");
    	}
    	}
    }
    

