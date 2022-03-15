package model;

import java.util.StringJoiner;
import parts.*;

/**
 *
 * @author tadaki
 */
public class Hanoi {

    private final Pillar pillars[];
    private final int n;//number of disks
    private int numberOfMove = 0;
    private boolean debug = true;

    public Hanoi(int n) {
        this.n = n;
        pillars = new Pillar[3];
        for (int i =0; i < 3; i++) {
            pillars[i] = new Pillar();
        }
        //put all disks to 0th pillar
        for (int i = n - 1; i >= 0; i--) {
            pillars[0].push(new Disk(i+1));
        }
        numberOfMove = 0;
    }

    public void start() {
        if(debug)showState();
        moveDisks(0, 2, n);
    }

    private void moveDisks(int from, int to, int number) {
        if (number == 1) {
            moveSingleDisk(from, to);
            return;
        }

        int other = 3 - (from + to);
        moveDisks(from, other, number - 1);
        moveDisks(from, to, 1);
        moveDisks(other, to, number - 1);
    }

    private void moveSingleDisk(int from, int to) {
        Disk d = pillars[from].pop();
        pillars[to].push(d);
        numberOfMove++;
        if (debug) {
            showState();
        }
    }

    private void showState() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (Pillar p : pillars) {
            sj.add(p.toString());
        }
        System.out.println(sj.toString());
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public int getNumberOfMove() {
        return numberOfMove;
    }

}
