package fr.utt.if26.sol_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    /**
     * Comentaire Javadoc ^^
     */
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Comentaire Javadoc ^^
         */
        //String message = "bonjour if26";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx=(TextView) findViewById(R.id.textview);
        tx.setText("Message modifié dans le code Java");
        tx.setText(getResources().getString(R.string.message));

        Button bt=(Button)findViewById(R.id.bouton);
        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                tx.setBackgroundColor(Color.RED);
            }
        });
    }
}
