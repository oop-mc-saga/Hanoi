package model;

import java.util.StringJoiner;
import parts.*;

/**
 * Tower of Hanoi
 *
 * @author tadaki
 */
public class Hanoi {

    private final Pillar pillars[];//array of three pillars
    private final int n;//number of disks
    private int numberOfMove = 0;
    private boolean debug = true;

    /**
     * Constructor
     *
     * @param n number of disks
     */
    public Hanoi(int n) {
        this.n = n;
        //create pillars
        pillars = new Pillar[3];
        for (int i = 0; i < 3; i++) {
            pillars[i] = new Pillar();
        }
        //put all disks to 0th pillar
        for (int i = n - 1; i >= 0; i--) {
            pillars[0].push(new Disk(i + 1));
        }
        numberOfMove = 0;
    }

    /**
     * Start the motion
     */
    public void start() {
        if (debug) {
            showState();
        }
        moveDisks(0, 2, n);
    }

    /**
     * Move disks
     *
     * @param from source pillar
     * @param to destination pillar
     * @param number number of disks to move
     */
    private void moveDisks(int from, int to, int number) {

    
    
    
    
    
    
    }

    /**
     * Move one disk
     *
     * @param from source pillar
     * @param to destination pillar
     */
    private void moveSingleDisk(int from, int to) {

    
    
    
    
    
    }

    /**
     * Show the current state
     */
    private void showState() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (Pillar p : pillars) {
            sj.add(p.toString());
        }
        System.out.println(sj.toString());
    }

    /**
     * *** setters and getters **********************
     */
    
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
