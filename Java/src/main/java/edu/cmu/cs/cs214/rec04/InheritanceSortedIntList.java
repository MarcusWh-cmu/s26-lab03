package edu.cmu.cs.cs214.rec04;


/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation
    
    private int totalAdded;
    
    /**
     * Constructs a new InheritanceSortedIntList with a totalAdded count of 0.
     */
    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }
    
    /**
     * Adds the specified int to the list and increments the totalAdded count.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        totalAdded++;
        return super.add(num);
    }
    
    /**
     * Adds all of the elements of the IntegerList to the list.
     * Note: We don't increment totalAdded here because super.addAll() 
     * calls add() for each element, which increments the counter.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }
    
    /**
     * Returns the total number of attempted element insertions to this list
     * since it was created.
     *
     * @return the total number of elements added to the list
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}