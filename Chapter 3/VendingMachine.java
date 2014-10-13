/**
 * A class that stands for a representation of a vending machine.
 * You are able to take cans in and out of the vending machine.
 * 
 * @author Annika Dugad
 * @version 18 September 2014
 */
public class VendingMachine
{
    /** The amount of cans within the vending machine at any given moment*/
    private int cans;
    /** The amount of tokens within the vending machine at any given moment*/
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int amountOfCans, int amountOfTokens)
    {
        // initialise instance variables
        this.cans = amountOfCans;
        this.tokens = amountOfTokens;
    }

    /**
     * This method adds one token and subtracts one can for every token inserted by the user
     */
    public void insertToken()
    {
        // put your code here
        this.tokens += 1;
        this.cans -= 1;
    }


    /**
     * Adds a number of cans to the vending machine.
     *
     * @param   numberCans   The number of cans added as an integer
     */
    public void fillUp(int numberCans)
    {
        // put your code here
        this.cans += numberCans;
    }

    /**
     * Returns the number of cans in the vending machine at any given time.
     * @return  Returns the number of cans
     */
    public int getCanCount()
    {
        // put your code here
        return this.cans;
    }

    /**
     * Returns the number of tokens in the vending machine at any given time.
     * @return  Returns the number of tokens
     */
    public int getTokenCount()
    {
        // put your code here
        return this.tokens;
    }

}
