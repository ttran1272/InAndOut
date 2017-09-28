package edu.orangecoastcollege.cs273.ttran1272.inandout;

/**
 * Created by ttran1272 on 9/27/2017.
 * This class calculates the order total, the number of items to be ordered at a fictional IN-AND-OUT BURGER,
 * the subtotal of the order, and the tax to be paid, given the number of each item to be ordered
 */
public class Order {

    // Create constant variables
    private static final double PRICE_CHEESEBURGER = 2.15;
    private static final double PRICE_DOUBLE_DOUBLE = 3.60;
    private static final double PRICE_FRENCH_FRIES = 1.65;
    private static final double PRICE_LARGE_DRINK = 1.75;
    private static final double PRICE_MEDIUM_DRINK = 1.55;
    private static final double PRICE_SHAKE = 2.20;
    private static final double PRICE_SMALL_DRINK = 1.45;
    private static final double TAX_RATE = 0.075;

    // Create instance variables
    private int mCheeseburgers;
    private int mDoubleDoubles;
    private int mFrenchFries;
    private int mLargeDrinks;
    private int mMediumDrinks;
    private int mShakes;
    private int mSmallDrinks;

    // Constructor
    public Order() {
        mCheeseburgers = 0;
        mDoubleDoubles = 0;
        mFrenchFries = 0;
        mLargeDrinks = 0;
        mMediumDrinks = 0;
        mSmallDrinks = 0;
        mShakes = 0;
    }

    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public int getShakes() {
        return mShakes;
    }

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    /**
     * This function sums up the total number of items to be ordered
     * @return the total number of items to be ordered
     */
    public int getNumberItemsOrdered(){

        return mCheeseburgers + mDoubleDoubles + mFrenchFries + mLargeDrinks + mMediumDrinks + mShakes + mSmallDrinks;
    }

    public void setCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    public void setDoubleDoubles(int doubleDoubles) {
        mDoubleDoubles = doubleDoubles;
    }

    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    /**
     * This function calculates the total amount for the items to be ordered (without adding the tax)
     * @return total price for the ordered items
     */
    public double calculateSubtotal(){
        return (mCheeseburgers * PRICE_CHEESEBURGER + mDoubleDoubles * PRICE_DOUBLE_DOUBLE
                + mFrenchFries * PRICE_FRENCH_FRIES + mShakes * PRICE_SHAKE + mSmallDrinks * PRICE_SMALL_DRINK
                + mMediumDrinks * PRICE_MEDIUM_DRINK + mLargeDrinks * PRICE_LARGE_DRINK );
    }

    /**
     * This function returns the amount of tax to be paid on the order
     * @return tax needs to be paid in an order
     */
    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    /**
     * This function return the total amount that a customer has to pay for an order
     * @return total prices and tax for all ordered items
     */
    public double calculateTotal(){
        return calculateSubtotal() + calculateTax();
    }

}
