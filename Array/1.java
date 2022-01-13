class Demo {

  public static void main(String args[]) {
    int[] a = { 8, 34, 23, 3, 4, 56, 37, 67 };
    int min = a[0];
    int max = a[0];
    for (int i = 0; i < a.length; i++) {
      if (max < a[i]) {
        max = a[i];
      }
      if (min > a[i]) {
        min = a[i];
      }
    }

    System.out.println("Maximum element is : " + max);
    System.out.println("Minimum element is : " + min);
  }
}
