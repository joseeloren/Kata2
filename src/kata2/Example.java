package kata2;

public class Example {
    public static void main(String[] args) {
        Integer[] array = {1,4,7,1,1,8,4,1,4,9};
        String[] array2 = {"Pedro","Juan","Ana","Alex","Juan","Jose","Jose","Juan","Daniel","Pedro"};
        
        Histogram<Integer> histogram = BuildHistogram.computeHistogram(array);
        System.out.println(new Histogram(array).toString());
        System.out.println("");
        Histogram<Integer> histogram2 = BuildHistogram.computeHistogram(array);
        System.out.println(new Histogram(array2).toString());
    }
}
