package fr.heyci.teamcooked;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeMenu extends AppCompatActivity implements View.OnClickListener {

    private ImageView profilePicture;
    private TextView pseudo;
    private Button btnPlay;
    private Button btnProfile;
    private Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);
        profilePicture = findViewById(R.id.profilePicture);
        pseudo = findViewById(R.id.pseudo);
        btnPlay = findViewById(R.id.btnPlay);
        btnProfile = findViewById(R.id.btnProfile);
        btnQuit = findViewById(R.id.btnQuit);

        btnPlay.setOnClickListener(this);
        btnProfile.setOnClickListener(this);
        btnQuit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnPlay) {
            Intent intent = new Intent(this, NewGameActivity.class);
            startActivity(intent);
            finish();
        } else if (view == btnProfile) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            finish();
        } else if (view == btnQuit) {
            finish();
        }

    }
}
