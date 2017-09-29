package edu.orangecoastcollege.cs273.ttran1272.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;

public class OrderActivity extends AppCompatActivity {

    // Create the Order instance
    private Order anOrder;
    private double totalOrder;
    private double subTotal;
    private double tax;
    private int itemOrdered;

    public NumberFormat money = NumberFormat.getCurrencyInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        anOrder = new Order();
        setContentView(R.layout.activity_order);

        Button placeOrderButton = (Button) findViewById(R.id.placeOrderButton);
        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOrder();
                totalOrder = anOrder.calculateTotal();
                subTotal = anOrder.calculateSubtotal();
                tax = anOrder.calculateTax();
                itemOrdered = anOrder.getNumberItemsOrdered();

                Intent myIntent = new Intent(OrderActivity.this , SummaryActivity.class);
                myIntent.putExtra("totalOrder", "" + money.format(totalOrder));
                myIntent.putExtra("itemOrdered", "" + itemOrdered);
                myIntent.putExtra("subTotal", "" + money.format(subTotal));
                myIntent.putExtra("tax", "" + money.format(tax));
                startActivity(myIntent);
            }
        });
    }

    /**
     * This function gets the order details from the user input and initialize the Order model
     */
    protected void setOrder(){

        EditText doubleDoubleET = (EditText) findViewById(R.id.doubleDoubleEditText);
        EditText cheeseBurgerET = (EditText) findViewById(R.id.cheeseBurgerEditText);
        EditText frenchFriesET = (EditText) findViewById(R.id.frenchFriesEditText);
        EditText shakesET = (EditText) findViewById(R.id.shakesEditText);
        EditText drinkSmallET = (EditText) findViewById(R.id.smallSizeEditText);
        EditText drinkMediumET = (EditText) findViewById(R.id.mediumSizeEditText);
        EditText drinkLargeET = (EditText) findViewById(R.id.largeSizeEditText);

        try {
            if (doubleDoubleET.getText().toString() != "") {
                int doubleDouble = Integer.parseInt(doubleDoubleET.getText().toString());
                anOrder.setDoubleDoubles(doubleDouble);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            if (cheeseBurgerET.getText().toString() != "") {
                int cheeseburger = Integer.parseInt(cheeseBurgerET.getText().toString());
                anOrder.setCheeseburgers(cheeseburger);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            if (frenchFriesET.getText().toString() != "") {
                int frenchFries = Integer.parseInt(frenchFriesET.getText().toString());
                anOrder.setFrenchFries(frenchFries);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            if (shakesET.getText().toString() != "") {
                int shakes = Integer.parseInt(shakesET.getText().toString());
                anOrder.setShakes(shakes);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            if (drinkSmallET.getText().toString() != "") {
                int smallDrink = Integer.parseInt(drinkSmallET.getText().toString());
                anOrder.setSmallDrinks(smallDrink);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            if (drinkMediumET.getText().toString() != "") {
                int mediumDrink = Integer.parseInt(drinkMediumET.getText().toString());
                anOrder.setMediumDrinks(mediumDrink);
            }
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            if (drinkLargeET.getText().toString() != "") {
                int largeDrink = Integer.parseInt(drinkLargeET.getText().toString());
                anOrder.setLargeDrinks(largeDrink);
            }
        } catch (NumberFormatException e){
            e.printStackTrace();
        }


    }


}
