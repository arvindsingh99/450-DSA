class Demo{
    public static void main(String args[]){
        int[] a = {8,34,23,3,4,56,37,67};
        int[] b = new int[a.length];
        int index = 0;
        for(int i=a.length-1; i>=0; i--){
            b[index++] = a[i];
        }
        for(int num:b){
            System.out.print(num + " ");
        }
    }
}