package com.phoenixdevs.ir;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ExpandableCardView expandableCardView=findViewById(R.id.ecv2);

        expandableCardView.setInnerView(R.layout.item_profile2);
        expandableCardView.setRtlDirection();
        expandableCardView.setTitle("Profile");
        expandableCardView.setIcon(R.drawable.ic_user);



        expandableCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expandableCardView.isExpanded()){
                    expandableCardView.collapse();
                    Toast.makeText(MainActivity.this, "Close", Toast.LENGTH_SHORT).show();

                }
                else{
                    expandableCardView.expand();
                    Toast.makeText(MainActivity.this, "Open", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
