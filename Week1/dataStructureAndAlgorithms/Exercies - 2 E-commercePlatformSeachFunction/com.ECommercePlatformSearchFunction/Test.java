
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Product[] producsts = new Product[100];
        for(int i = 0; i<100; i++) producsts[i] = new Product(i, null, null);
        System.out.println("Time required for Linear search O(n) : " + String.format("%.4f", (linearSearch(producsts, 55) / 1000000000.0)));
        System.out.println("Time required for Binary search O(Log n) : " + String.format("%.4f", (binarySearch(producsts, 55) / 1000000000.0)));
    }
    public static Double linearSearch(Product[] products, int procutId){
        Long starttime = System.nanoTime();
        int idx = -1;
        for(int i = 0; i<products.length; i++){
            if(products[i].getProcutId() == procutId) {
                idx = i;
                break;
            }
        }
        System.out.println(idx >= 0 ? "Product fonnd at " + idx : "Product not found");
        Long currtime = System.nanoTime();
        return (double) (currtime - starttime);
    }
    public static Double binarySearch(Product[] products, int procutId){
        Long starttime = System.nanoTime();
        int idx = -1;
        Product[] copyOfProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(copyOfProducts, (a,b)->a.getProcutId() - b.getProcutId());
        int low = 0, high = products.length - 1;
        while(low <= high){
            int mid = (low + high) >> 1;
            if(copyOfProducts[mid].getProcutId() == procutId){
                idx = mid;
                break;
            }
            else if(copyOfProducts[mid].getProcutId() < procutId){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        System.out.println(idx >= 0 ? "Product fonnd at " + idx : "Product not found");
        Long currtime = System.nanoTime();
        return (double) (currtime - starttime);
    }
}
