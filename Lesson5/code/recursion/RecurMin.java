public class RecurMin{
  public static int findMin(int a[], int index, int compare){
    // base
    if (index == a.length-1)
      return a[index];

    int value = findMin(a, index + 1, 100);

    if (a[index] < value)
      return a[index];
    else
      return value;
  }
  public static void main(String[] args) {
    int a[] = {8,3,10,5,2,1,9};
    int min = findMin(a,0,100);
    System.out.println(min);
  }
}
