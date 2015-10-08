/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author usuario
 */
public class HistagramBuilder<T> {
    public static <T> Histogram<T> computeHistogram(T[] array) {
        Histogram<T> histogram = new Histogram();
        for (T key : array) {
            histogram.incrementKeyValue(key);
        }
        
        return histogram;
    }
}
