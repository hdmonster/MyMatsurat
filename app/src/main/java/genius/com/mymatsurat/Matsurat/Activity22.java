package genius.com.mymatsurat.Matsurat;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import genius.com.mymatsurat.R;

public class Activity22 extends AppCompatActivity {

    private Button btnNext;
    private Integer i = 6;
    private String value = Integer.toString(i);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);

        btnNext = (Button) findViewById(R.id.button22);
        btnNext.setTextColor(Color.WHITE);
        btnNext.setText("Baca "+ value +"X" );
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value;

                if(i > 1){
                    i = i - 1;

                    value = String.valueOf(i);
                    btnNext.setText("Baca "+ value +"X");

                } else {
                    Intent intent = new Intent(Activity22.this, Activity23.class);
                    startActivity(intent);
                }
            }
        });
    }
}
