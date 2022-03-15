package parts;

/**
 * Disk class in Tower of Hanoi
 * 
 * @author tadaki
 */
public class Disk implements Comparable<Disk>{
    private final int n;//size of this disk

    public Disk(int n) {
        this.n = n;
    }

    @Override
    public int compareTo(Disk o) {
        
    }
   
    @Override
    public String toString(){
        return String.valueOf(n);
    }
    
}
