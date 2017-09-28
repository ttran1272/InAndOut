package edu.orangecoastcollege.cs273.ttran1272.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OrderActivity extends AppCompatActivity {

    // Create the Order instance
    private Order anOrder;
    private double totalOrder;
    private double subTotal;
    private double tax;
    private int itemOrdered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        anOrder = new Order();
        setContentView(R.layout.activity_order);

        setOrder();
        totalOrder = anOrder.calculateTotal();
        subTotal = anOrder.calculateSubtotal();
        tax = anOrder.calculateTax();
        itemOrdered = anOrder.getNumberItemsOrdered();

        Button placeOrderButton = (Button) findViewById(R.id.placeOrderButton);
        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getApplicationContext() , SummaryActivity.class);
                myIntent.putExtra("totalOrder", "$" + totalOrder);
                myIntent.putExtra("itemOrdered", "" + itemOrdered);
                myIntent.putExtra("subTotal", "$" + subTotal);
                myIntent.putExtra("tax", "$" + tax );
                startActivity(myIntent);
            }
        });
    }

    /**
     * This function gets the order details from the user input and initialize the Order model
     */
    private void setOrder(){

        EditText doubleDoubleET = (EditText) findViewById(R.id.doubleDoubleEditText);
        EditText cheeseBurgerET = (EditText) findViewById(R.id.cheeseBurgerEditText);
        EditText frenchFriesET = (EditText) findViewById(R.id.frenchFriesEditText);
        EditText shakesET = (EditText) findViewById(R.id.shakesEditText);
        EditText drinkSmallET = (EditText) findViewById(R.id.smallSizeEditText);
        EditText drinkMediumET = (EditText) findViewById(R.id.mediumSizeEditText);
        EditText drinkLargeET = (EditText) findViewById(R.id.largeSizeEditText);

        /**
        try {

            if (doubleDoubleET.getText().toString() != null) {
                int doubleDouble = Integer.parseInt(doubleDoubleET.getText().toString());
                anOrder.setDoubleDoubles(doubleDouble);
            }

            if (cheeseBurgerET.getText().toString() != null) {
                int cheeseburger = Integer.parseInt(cheeseBurgerET.getText().toString());
                anOrder.setCheeseburgers(Integer.parseInt(cheeseBurgerET.getText().toString()));
            }

            if (frenchFriesET.getText().toString() != null) {
                int frenchFries = Integer.parseInt(frenchFriesET.getText().toString());
                anOrder.setFrenchFries(Integer.parseInt(frenchFriesET.getText().toString()));
            }

            if (shakesET.getText().toString() != null) {
                int shakes = Integer.parseInt(shakesET.getText().toString());
                anOrder.setShakes(Integer.parseInt(shakesET.getText().toString()));
            }

            if (drinkSmallET.getText().toString() != null) {
                int smallDrink = Integer.parseInt(drinkSmallET.getText().toString());
                anOrder.setSmallDrinks(Integer.parseInt(drinkSmallET.getText().toString()));
            }

            if (drinkMediumET.getText().toString() != null) {
                int mediumDrink = Integer.parseInt(drinkMediumET.getText().toString());
                anOrder.setMediumDrinks(Integer.parseInt(drinkMediumET.getText().toString()));
            }

            if (drinkLargeET.getText().toString() != null) {
                int largeDrink = Integer.parseInt(drinkLargeET.getText().toString());
                anOrder.setLargeDrinks(Integer.parseInt(drinkLargeET.getText().toString()));
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

         **/
         try {
             int doubleDouble = Integer.parseInt(doubleDoubleET.getText().toString());
             anOrder.setDoubleDoubles(doubleDouble);
             int cheeseburger = Integer.parseInt(cheeseBurgerET.getText().toString());
             anOrder.setCheeseburgers(cheeseburger);
             int frenchFries = Integer.parseInt(frenchFriesET.getText().toString());
             anOrder.setFrenchFries(frenchFries);
             int shakes = Integer.parseInt(shakesET.getText().toString());
             anOrder.setShakes(shakes);
             int smallDrink = Integer.parseInt(drinkSmallET.getText().toString());
             anOrder.setSmallDrinks(smallDrink);
             int mediumDrink = Integer.parseInt(drinkMediumET.getText().toString());
             anOrder.setMediumDrinks(mediumDrink);
             int largeDrink = Integer.parseInt(drinkLargeET.getText().toString());
             anOrder.setLargeDrinks(largeDrink);

         }catch (NumberFormatException e) {
             e.printStackTrace();
         }


    }


}
