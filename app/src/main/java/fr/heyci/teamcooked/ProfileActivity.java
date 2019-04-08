package fr.heyci.teamcooked;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView profilePicture;
    private TextView pseudo;
    private TextView success;
    private ImageView successExample1;
    private ImageView successExample2;
    private ImageView successExample3;
    private ImageView successExample4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        profilePicture = findViewById(R.id.profilePicture);
        pseudo = findViewById(R.id.pseudo);
        success = findViewById(R.id.success);
        successExample1 = findViewById(R.id.successExample1);
        successExample2 = findViewById(R.id.successExample2);
        successExample3 = findViewById(R.id.successExample3);
        successExample4 = findViewById(R.id.successExample4);

        profilePicture.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, HomeMenu.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View view) {
        
    }
}
