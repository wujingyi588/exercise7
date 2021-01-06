package exercise7;

import java.util.Scanner;

public class Practice11_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of the points:");
        int num=input.nextInt();
        point[] a=new point[num];
        for(int i=0;i<num;i++){
            a[i]=new point();
        }
        System.out.println("Enter the coordinates of the points:");
        for(int i=0;i<num;i++){
            a[i].x=input.nextDouble();
            a[i].y=input.nextDouble();
        }
        System.out.println("The total area is: "+area(a,num));
	}
	public static float area(point a[],int num){
        float temp=0;
        int i;
        for(i=0;i<num-1;i++){
            temp+=(a[i].x-a[i+1].x)*(a[i].y+a[i+1].y);
        }
        temp+=(a[i].x-a[0].x)*(a[i].y+a[0].y);
        return Math.abs(temp/2);

	}

}
class point{
    public double x;
    public double y;
    
    public point(){
        x=0;
        y=0;
    }
}
