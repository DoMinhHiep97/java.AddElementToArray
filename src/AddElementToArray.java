import java.util.Scanner;
public class AddElementToArray {
    //tạo mảng mới lớn hơn -> copy mảng cũ qua -> thêm phần tử vào.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={2,2,3,4,5,1};
        int[] arrCopy= new int[7];
        for(int value:arr){
            System.out.print(value+" ");
        }
        System.out.println("Enter your number you need add:");
        int number=scanner.nextInt();
        System.out.println("Enter your location you add:");
        int index=scanner.nextInt();
        if(index<0){
            System.out.println("Not exist location!");

            }
        else if(index<arr.length){
          for (int i=0;i<arr.length;i++){
              if(i<index){
                  arrCopy[i]=arr[i];
              }else if(i>=index){
                  arrCopy[i+1]=arr[i];
              }
          }
          arrCopy[index]=number;
            for(int value:arrCopy){
                System.out.print(value+" ");
            }
        }else {
            System.out.println("Not exist location!");
        }

    }
}
