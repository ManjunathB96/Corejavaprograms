package FunctionalPrograms;

 class ThreeIntAdd2Zero {
    boolean find3numbers(int A[],int arr_size,int sum)
    {

        for (int i =0; i<arr_size-2; i++){

            for (int j=i+1; j<arr_size-1; j++){

                for (int k=j+1; j<arr_size; k++){

                    if( A[i] + A[j] +A[k] == sum){

                        System.out.println("Triplet is "+A[i]+"  "+A[j]+"  "+A[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ThreeIntAdd2Zero triplet = new ThreeIntAdd2Zero();
        int A[] ={1,2,3,4,5};
        int sum =7;
        int arr_size = A.length;

        triplet.find3numbers(A, arr_size, sum);
    }

}
