package kata2;

public class Example {
    public static void main(String[] args) {
        Integer[] array = {1,4,7,1,1,8,4,1,4,9};
        String[] array2 = {"Pedro","Juan","Ana","Alex","Juan","Jose","Jose","Juan","Daniel","Pedro"};
        
        Histogram<Integer> histogram = HistagramBuilder.computeHistogram(array);
        System.out.println(histogram.toString());
        System.out.println("");
        Histogram<String> histogram2 = HistagramBuilder.computeHistogram(array2);
        System.out.println(histogram2.toString());
    }
}
