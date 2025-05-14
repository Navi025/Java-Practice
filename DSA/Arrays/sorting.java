public class sorting{
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int turn = 0; turn<n-1; turn++){
            for(int j = 0; j<n-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
               
            }
        }
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for (int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos=j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }        
    }

    // public static void insertionSort(int arr[]){
    //     for(int i = 1; i<=)
    // }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}