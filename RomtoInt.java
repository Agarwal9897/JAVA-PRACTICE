import java.util.Scanner;
class RomtoInt{
    public static int romtoint(String s){
        int sum=0;
        int flag=0;
        char arr[] = new char[15];
        int arr1[] = new int[15];
        for(int i =0;i<s.length();i++){
            arr[i]=s.charAt(i);
            switch(arr[i]){
                case 'I' :
                    arr1[i]=1;
                    break;
                case 'V' :
                    arr1[i]=5;
                    break;
                case 'X' :
                    arr1[i]=10;
                    break;
                case 'L' :
                    arr1[i]=50;
                    break;
                case 'C' :
                    arr1[i]=100;
                    break;
                case 'D' :
                    arr1[i]=500;
                    break;
                case 'M' :
                    arr1[i]=1000;
                    break;                
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr1[j]>arr1[i]){
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                sum=sum-arr1[i];
            }
            else{
                sum=sum+arr1[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Number: ");
        String s = sc.nextLine();
        System.out.println(romtoint(s));
    }
}