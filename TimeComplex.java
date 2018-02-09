


import java.util.Random;

/**
 *
 * @author Mithil Vasani
 */
public class TimeComplex {
    static int[] arry_1=new int[1024];    
    static int[] arry_2 =new int[32768];
    static int[] arry_3 =new int[1048576];
    
    
    
    
       public static int[] randomIntArray(int size) 
	{
        
        Random random = new Random();
        int tmp_arry[] = new int[size];
        int i = 0;

        while (i < size) 
        {
            boolean isDuplicate = false;
            int randomInt = random.nextInt(size) + 1;

            for (int j = 0; j < i; j++) 
            {
                if (tmp_arry[j] == randomInt) 
                {
                    isDuplicate = true;
                    break;
                }

            }
            if (isDuplicate) 
            {
                //continue;
            } else 
            {
                tmp_arry[i++] = randomInt;
            }

        }
        System.out.println("Generated Array of sze = "+size);
        return tmp_arry;
        } 
    
    
    
    
    
       //---------------------MAIN-----------------
    public static void main(String[] args) 
    {
        double startTimer, endTimer, ttlTime; 
        SortingAlgorithm alg= new SortingAlgorithm(); 
        
        int[]temp1 =new int [1024];
        int[]temp2 =new int [32768];
	int[]temp3 =new int [1048576];
        
        arry_1 = randomIntArray(1024);   //(Generating Array.  
        arry_2 = randomIntArray(32768);
        arry_3 = randomIntArray(1048576);
        temp1 = alg.copy(arry_1);
        temp2 = alg.copy(arry_2);
        temp3 = alg.copy(arry_3);
       
        
        
        
        
        //-------------MERGE SORT ------------
        System.out.println(" ");
        System.out.println("---------- 1.MERGE SORT RESULTS----------");
        //1. array .
        
                //a. 1024
                System.out.print(" A) N = "+arry_1.length);
                System.out.println("");
                    alg.resetCounter();
                    startTimer= System.nanoTime();
                    alg.mergesort(arry_1);
                    endTimer= System.nanoTime();
                    ttlTime=(endTimer-startTimer)/1000000.0  ;
                    System.out.println("  "+"Time = "+ttlTime+" ms");
                    System.out.println("");
                    
                    
                  
        
                //b. 32768    
                System.out.print(" B) N = "+arry_2.length);
                    System.out.println("");
                        alg.resetCounter();
                       startTimer= System.nanoTime();
                       alg.mergesort(arry_2);
                       endTimer= System.nanoTime();
                       ttlTime=(endTimer-startTimer)/1000000.0  ;
                       System.out.println("  "+"Time = "+ttlTime+" ms");               
             
                    
                      //c. 1048576 
                System.out.print(" C) N = "+arry_3.length);
                    System.out.println("");
                            alg.resetCounter();
                            startTimer= System.nanoTime();
                            alg.mergesort(arry_3);
                            endTimer= System.nanoTime();
                            ttlTime=(endTimer-startTimer)/1000000.0  ;
                            System.out.println("  "+"Time = "+ttlTime+" ms");        
        
        
                                //temp copying
                arry_1 = alg.copy(temp1);
                arry_2 = alg.copy(temp2);
                arry_3 = alg.copy(temp3);
             
             
                //-------------Heap SORT ------------
                System.out.println(" ");
                System.out.println("---------- 2.HEAP SORT RESULTS----------");
                      
                        //1024
                        System.out.print(" A) N = "+temp1.length);
                        System.out.println("");
                            alg.resetCounter();
                            startTimer= System.nanoTime();
                            alg.heapsort(temp1);
                            endTimer= System.nanoTime();
                            ttlTime=(endTimer-startTimer)/1000000.0  ;
                            System.out.println("  "+"Time = "+ttlTime+" ms");
                            System.out.println("");
                            
                    
                    
                    //32768
                        System.out.print("B) N = "+temp2.length);
                        System.out.println("");
                    alg.resetCounter();
                    startTimer= System.nanoTime();
                    alg.heapsort(temp2);
                    endTimer= System.nanoTime();
                    ttlTime=(endTimer-startTimer)/1000000.0  ;
                    System.out.println("  "+"Time = "+ttlTime+" ms");
                    System.out.println("");
                    
        
               
                       //1048576
                        System.out.print("C) N = "+temp3.length);
                        System.out.println("");
                    alg.resetCounter();
                    startTimer= System.nanoTime();
                    alg.heapsort(temp3);
                    endTimer= System.nanoTime();
                    ttlTime=(endTimer-startTimer)/1000000.0  ;
                    System.out.println("  "+"Time = "+ttlTime+" ms");
                    System.out.println("");
                 
                    
       //-------------Quick SORT quickSort ------------              
                    System.out.println(" ");
                    System.out.println("---------- 3.Quick SORT RESULTS----------");
                
              //1024
                System.out.print("A) N = "+arry_1.length);
                System.out.println("");
                    alg.resetCounter();
                    startTimer= System.nanoTime();
                    alg.quickSort(arry_1);
                    endTimer= System.nanoTime();
                    ttlTime=(endTimer-startTimer)/1000000.0  ;
                    System.out.println("  "+"Time = "+ttlTime+" ms");
                    System.out.println("");
                    
                    
                    
                 //32768
                System.out.print("B) N = "+arry_2.length);
                System.out.println("");
                    alg.resetCounter();
                    startTimer= System.nanoTime();
                    alg.quickSort(arry_2);
                    endTimer= System.nanoTime();
                    ttlTime=(endTimer-startTimer)/1000000.0  ;
                    System.out.println("  "+"Time = "+ttlTime+" ms");
                    System.out.println("");
                    
                System.out.print("C) N = "+arry_3.length);
                System.out.println("");
                    alg.resetCounter();
                    startTimer= System.nanoTime();
                    alg.quickSort(arry_3);
                    endTimer= System.nanoTime();
                    ttlTime=(endTimer-startTimer)/1000000.0  ;
                    System.out.println("  "+"Time = "+ttlTime+" ms");
                    System.out.println("");    
   
                    
                    
        
    }
    
}

class SortingAlgorithm
{
    static int compCount;
                    SortingAlgorithm()
                    {}
                    
                    //-----COUNTER
                    public void resetCounter()
                    {
                        compCount=0;
                    }
    
                   public static void Count(int i, int j)
                    {

                        compCount++;
                    }
                   
                   //---------
                    
                   //-----Array copy ---------
                   public int[] copy(int[] mergeArry) 
                    {
                        int[] copiedArry= new int[mergeArry.length];
                        for(int i= 0; i<mergeArry.length;i++)
                        {
                            copiedArry[i]= mergeArry[i];
                        }

                        return copiedArry; 
                    }


                    
    
                   
                   
                   
                   
                   
     //1. ---- MERGE SORTING ALGO ----    
                   public void mergesort(int [] mergeArry)
                    {
                    mergesortA(mergeArry,0,mergeArry.length-1);
                    System.out.println("  "+"Comparisions = "+compCount+"    ");
                    
                    }


                    public void mergesortA(int[] mergeArry,int start,int end)
                    {
                        if(start >= end)
                        {
                        return;
                        }
                        else
                        {
                        int mid = (start+end)/2;
                        mergesortA(mergeArry, start, mid);
                        mergesortA(mergeArry, mid+1, end);
                        mergesortB(mergeArry,start,end);
                        }
                    }


                    private void mergesortB(int[] mergeArry, int start, int end) 
                    {

                            int[] temp = copy(mergeArry);
                            int mid = (start + end)/2;
                            int index1 = 0;
                            int index2 = start;
                            int index3 = mid + 1;
                            while (index2 <= mid && index3 <= end) 
                            {
                                    Count(mergeArry[index2],mergeArry[index3 ]);
                                    if (mergeArry[index2] < mergeArry[index3 ]) 
                                    {

                                            temp[index1] = mergeArry[index2];
                                            index1++;
                                            index2++;
                                    } else {
                                            temp[index1] = mergeArry[index3 ];
                                            index1++;
                                            index3 ++;
                                    }
                            }
                            while (index2 <= mid) 
                            {
                                    temp[index1] = mergeArry[index2];
                                    index1++;
                                    index2++;
                            }
                            while (index3  <= end) 
                            {
                                    temp[index1] = mergeArry[index3 ];
                                    index1++;
                                    index3 ++;
                            }
                            for (int i=start, j=0; i<=end; i++, j++) 
                            {
                                    mergeArry[i] = temp[j];
                            }
                    } // end merge 
                    
       
    //2. ------------HEAP SORT -----------
                          
    public void heapsort(int arry[])
                     {
                         int len = arry.length-1;

                         for (int i = len/ 2 ; i >= 0; i--) {
                           heap(arry, len+1, i);
                         }

                         for (int i=len; i>=0; i--)
                         {
                             swap(arry,0,i);
                             heap(arry, i, 0);
                         }
                         System.out.println("  "+"Comparision = "+ compCount);
                     }
 
                    void heap(int arr[], int len, int i)
                    {

                        int largest = i; 
                        int left = 2*i + 1; 
                        int right = 2*i + 2;  

                        if (left < len && arr[left] > arr[largest])
                        {   
                            largest = left;
                        }
                        if (right< len && arr[right] > arr[largest])
                        {   //Count(r ,arr[r]);
                            largest = right;
                        }


                        if (largest != i)
                        {
                            int swap = arr[i];
                            arr[i] = arr[largest];
                            arr[largest] = swap; 
                            heap(arr, len, largest);
                        }
                        Count(left ,right);
                    }
                    
                    public static void swap(int[] array, int i, int j) 
                    {
                        int t = array[i];
                        array[i] = array[j];
                        array[j] = t;
	    
                    }     
               
                    
      //------------------- quick sort ----------------------
                   
                   
                   
	public void quickSort(int[] arrQ)  //quick sort
	{
			quickSort(arrQ,0,arrQ.length-1);
			System.out.println(" "+" Comparision ="+compCount+"   ");
	}

	private void quickSort(int[] arrQ, int low, int high) 
	{
		if (low < high) 
		{
		int mid = partition(arrQ,low,high);
		quickSort(arrQ,low,mid-1);
		quickSort(arrQ,mid+1,high);
		}
	}
	
	private int partition(int[] arrQ, int low, int high) 
	{
		
		int pivot = arrQ[low];// for pivot
		do {
			
			while (low < high && arrQ[high] >= pivot) 
			{
					high--;
					  Count(arrQ[high], pivot);
					  
			}
			if (low < high) 
			{
				arrQ[low] = arrQ[high];//for swapping smaller number
				while (low < high && arrQ[low] <= pivot) 
				{
		 		  	low++;
		 		  	Count(arrQ[high], pivot);
					
				}
				if (low < high) 
				{
					arrQ[high] = arrQ[low];
				}
			}   
		} while (low < high);
		arrQ[low] = pivot;
		return low;
        }
                   
                    
                    
                    
                    
                    
} // end class