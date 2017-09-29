package edu.orangecoastcollege.cs273.ttran1272.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView totalOrderTV = (TextView) findViewById(R.id.orderTotalTextView);
        TextView itemOrderedTV = (TextView) findViewById(R.id.itemOrderTextView);
        TextView subTotalTV = (TextView) findViewById(R.id.subTotalTextView);
        TextView taxTV = (TextView) findViewById(R.id.taxTextView);

        Bundle extras = getIntent().getExtras();

        totalOrderTV.setText(extras.getString("totalOrder"));
        itemOrderedTV.setText(extras.getString("itemOrdered"));
        subTotalTV.setText(extras.getString("subTotal"));
        taxTV.setText(extras.getString("tax"));

        Button startNewOrderButton = (Button) findViewById(R.id.startNewOrderButton);
        startNewOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anIntent = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(anIntent);
            }
        });
    }


}