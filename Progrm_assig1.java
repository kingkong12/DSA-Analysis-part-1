/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random; 
/**
 *
 * @author Mithil
 */
   public class Progrm_assig1 
   {
       
    static int[] arry_1=new int[32];
    static int[] arry_2 =new int[32];
    static int[] arry_3 =new int[32];
    static int[] temp1 =new int[32];
    static int[] temp2 =new int[32];
    static int[] temp3 =new int[32];
    
   //static int[] random_arry = new int[32];
   
    public static void SortedArray()  // FUNCTION TO GENERATESORTED ARRAY.
    {
            int i=1;
            int j=0;
            while(i<=arry_1.length)
            {
                arry_1[j]= i;
                j++;
                i++;            
            }            
       
    }
    public static void RevSortedArray()  // FUNCTION TO GENERATE rev SORTED ARRAY.
    {
            
            int i=arry_2.length;
            int j=0;
            while(i>0)
            {
                arry_2[j]= i;
                j++;
                i--;            
            } 
        
    }
   public static int[] randomIntArray(int size) // random array of 32 integers
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
                continue;
            } else 
            {
                tmp_arry[i++] = randomInt;
            }

        }
        return tmp_arry;
    }
                
        
    public static void PrintArray(int printArry[]) // FUNCTION TO PRINT ARRAY
    {
        int i;
        
        for (i=0;i<printArry.length;i++)
        {
            System.out.print(printArry[i]+" ");
        }
        System.out.print("\n");
    }
   
    
    
//----------------------------------MAIN------------------------------
    public static void main(String[] args) 
    {
        double startTimer, endTimer, ttlTime;
        SortingAlgorithm alg= new SortingAlgorithm(); 
        
        
                   // Displaying Array list 
                    SortedArray();                     
                    System.out.print("Sorted Array:"+" "+"N="+arry_1.length);
                    System.out.println("");
                    PrintArray(arry_1); 
                    System.out.println();

                    RevSortedArray();
                    System.out.print("Reverse Sorted Array:"+" "+"N="+arry_2.length);
                    System.out.println("");
                    PrintArray(arry_2);
                    System.out.println();

                    arry_3 = randomIntArray(arry_3.length);
                    
                    System.out.print("Randomly generated array:"+"\n");
                    PrintArray(arry_3); 
                    System.out.println("");

                            //coping array in temp ;
                            temp1=alg.copy(arry_1);
                            temp2=alg.copy(arry_2);
                            temp3=alg.copy(arry_3);
                            //
                            
                        
                        System.out.println("-------------1. MERGE SORT RESULTS (N=32)-------------------");

                                System.out.println("1.Sorted Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.mergesort(arry_1);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(arry_1);
                                System.out.println("");
                                

                                System.out.println("2.Reverse Sorted Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.mergesort(arry_2);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(arry_2);
                                System.out.println("");
                                
                                
                                
                                System.out.println("3.Randomly Generated Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.mergesort(arry_3);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(arry_3);
                                System.out.print("");
                                System.out.print("\n");
                                System.out.print("\n");
                                
                                
                                //COpying og array 
                                arry_1=alg.copy(temp1);
                                arry_2=alg.copy(temp2);
                                arry_3=alg.copy(temp3);
                              
//------------------------2. Heap Sort------------------------------------

                     System.out.println("-------------1. HEAP SORT RESULTS (N=32)-------------------");

                                System.out.println("1.Sorted Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.heapsort(temp1);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(temp1);
                                System.out.println("");
                            
                                System.out.println("2.Reverse Sorted Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.heapsort(temp2);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(temp2);
                                System.out.println("");
                                
                                System.out.println("3.Randomly  Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.heapsort(temp3);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(temp3);
                                System.out.println("");
                            
                            
                          
                            
//------------------------3.Quick SOrt------------------------------------------

                    System.out.println("-------------3. QUICK SORT RESULTS (N=32)-------------------");

                                System.out.println("1.Sorted Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.quickSort(arry_1);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(arry_1);
                                System.out.println("");
                            
                                System.out.println("2.Reverse Sorted Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.quickSort(arry_2);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(arry_2);
                                System.out.println("");
                                
                                System.out.println("3.Randomly  Array ");
                                alg.resetCounter();
                                startTimer= System.nanoTime();
                                alg.quickSort(arry_3);
                                endTimer= System.nanoTime();
                                ttlTime=(endTimer-startTimer)/1000000.0  ;
                                System.out.println(" Time = "+ttlTime+" ms");
                                System.out.print(" Resultant Sorted Array:"+"\n");
                                PrintArray(arry_3);
                                System.out.println("");
                            

 /* 

*/


                }
    
}

//--------------------------------------------------------
class SortingAlgorithm
{
    static int compCount;
    SortingAlgorithm(){}

                    public void resetCounter()
                    {
                        compCount=0;
                    }
                    
                     public int[] copy(int[] mergeArry) 
                    {
                        int[] copiedArry= new int[mergeArry.length];
                        for(int i= 0; i<mergeArry.length;i++)
                        {
                            copiedArry[i]= mergeArry[i];
                        }

                        return copiedArry; 
                    }


                    public static void Count(int i, int j)
                    {

                        compCount++;
                    }




//-----------------------------------------MERGE SORT LOGIC---------

                    public void mergesort(int [] mergeArry)
                    {
                    mergesortA(mergeArry,0,mergeArry.length-1);
                    System.out.println("COMPARISION = "+compCount+"    ");
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
                    }
        
                    
                    
 //------------------------------------------------------HEAP SORT LOGIC--------// 
                    
                           
                    
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
                   
                   
                   
                public void quickSort(int[] arrQ) 
                {
                                quickSort(arrQ,0,arrQ.length-1);
                                System.out.println(" Comparision="+compCount+"   ");
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

                        int pivot = arrQ[low];
                        do {

                                while (low < high && arrQ[high] >= pivot) 
                                {
                                            high--;
                                            Count(arrQ[high], pivot);

                                }
                                if (low < high) 
                                {
                                        arrQ[low] = arrQ[high];
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
                    
}   



