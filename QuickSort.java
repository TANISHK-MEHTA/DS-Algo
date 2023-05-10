
// Quick Sort Algorithm

public class Main
{
    public static int Sort(int pivot, int low, int high, int arr[]){
        
        int i = low;
        int j = high;
        
        while(i < j){
            
            while(i <= j && pivot >= arr[i])
                i++;
                
            while(i <= j && pivot < arr[j])
                j--;
                
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
            
            
            
        }
        int sj = arr[low];
            arr[low] = arr[j];
            arr[j] = sj;
            
        
            
            return j;
        
        
    }
    public static void QuickSort(int pivot, int low, int high, int arr[]){
        
        if(low == high) return;
        
        int part = Sort(pivot, low, high, arr);
        //System.out.println(low +" " + part + " " + high);
        
        if(low < part)
            QuickSort(arr[low], low, part - 1, arr);
        if(high > part)
            QuickSort(arr[part + 1], part + 1, high, arr);
            
        
        
    }
	public static void main(String[] args) {
		int arr[] = {4, 6, 2, 5, 7, 9, 1, 3};
		QuickSort(arr[0], 0, arr.length - 1, arr);
		
		for(int x: arr){
		    System.out.print(x + " ");
		}
		System.out.println();
		
		
	}
}
