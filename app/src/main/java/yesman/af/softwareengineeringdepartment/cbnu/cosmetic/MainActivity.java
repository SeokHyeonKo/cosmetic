package yesman.af.softwareengineeringdepartment.cbnu.cosmetic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button get_cosmetic_btn;
    Button get_all_cosmetic_btn;
    Button get_rank_cosmetic_btn;
    Button store_review_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get_cosmetic_btn = (Button) findViewById(R.id.get_cosmetic_btn);
        get_all_cosmetic_btn = (Button) findViewById(R.id.get_all_cosmetic_btn);
        get_rank_cosmetic_btn = (Button) findViewById(R.id.get_rank_cosmetic_btn);
        store_review_btn = (Button) findViewById(R.id.store_review);

        get_cosmetic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServerManager manager = ServerManager.getInstance();
                manager.get_cosmetic_data();
            }
        });

        get_all_cosmetic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServerManager manager = ServerManager.getInstance();
                manager.getAllCosmetic_withReview();
            }
        });
        get_rank_cosmetic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServerManager manager = ServerManager.getInstance();
                manager.get_rank_cosmetic_info();
            }
        });

        store_review_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServerManager manager = ServerManager.getInstance();
                manager.delete_review(new Review("Lush","Dirty Spray","유원영","나쁨/Bod/NoTip!",3,4.0,1));
            }
        });


    }



}
