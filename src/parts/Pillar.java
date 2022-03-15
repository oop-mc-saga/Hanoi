package parts;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

/**
 * Pillar in Tower of Hanoi
 * 
 * @author tadaki
 */
public class Pillar {
    private final Deque<Disk> disks;

    public Pillar() {
        disks = new ArrayDeque<>();
    }
 
    /**
     * put a new disk
     * @param d 
     */
    public void push(Disk d) throws IllegalArgumentException{
        if(!canPush(d)){
            throw new IllegalArgumentException("Illigal Disk Order");
        }
        disks.addFirst(d);
    }
    
    /**
     * can put a disk to this pillar
     * @param d
     * @return 
     */
    public boolean canPush(Disk d){
        boolean f = true;
        if(!disks.isEmpty()){
            Disk top = disks.getFirst();//dist at the top
            f = (d.compareTo(top) <= 0);
        }
        return f;
    }
    
    public Disk pop(){
        if(disks.isEmpty())return null;
        return disks.removeFirst();
    }
    
    @Override
    public String toString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        disks.stream().forEachOrdered(d->sj.add(d.toString()));
        return sj.toString();
    }
}
