import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        do{
            System.out.println("Enter array size: ");
            size=input.nextInt();
            if(size>10){
                System.out.print("Array length shouldn't be exceed 20");
            }

        }while (size>10);

        int []array=new int[size];
        for(int i=0; i<array.length;i++){
            System.out.print("Enter array's element "+ (i+1)+" :");
            array[i]=input.nextInt();
        }
        System.out.println("Array you put in: ");
        for(int i=0; i<array.length;i++){
            System.out.print (array[i]+ "; ");
        }
        System.out.println();
        for(int j=0; j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-j-1];
            array[size-j-1]=temp;
        }
        System.out.println("Array after revert: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ "; ");
        }

    }
}
