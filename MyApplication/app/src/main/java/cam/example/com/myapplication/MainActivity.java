package cam.example.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    Button administrateur,utilisateur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        administrateur= (Button) findViewById(R.id.administrateur);

        utilisateur= (Button) findViewById(R.id.utilisateur);

        administrateur.setOnClickListener(this);
        utilisateur.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.administrateur:

                startActivity(new Intent(this,index_administrateur.class ));
                break;

            case R.id.utilisateur:

                startActivity(new Intent(this,CameraActivity.class ));

                break;
        }
    }
}

