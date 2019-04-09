package fr.heyci.teamcooked;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WaitingRoomActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgPlayer1;
    private TextView pseudo1;
    private ImageView imgPlayer2;
    private TextView pseudo2;
    private ImageView imgPlayer3;
    private TextView pseudo3;
    private ImageView imgPlayer4;
    private TextView pseudo4;
    private Button btnReady;
    private Button btnLaunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_room);
        imgPlayer1 = findViewById(R.id.imgPlayer1);
        pseudo1 = findViewById(R.id.pseudo1);
        imgPlayer2 = findViewById(R.id.imgPlayer2);
        pseudo2 = findViewById(R.id.pseudo2);
        imgPlayer3 = findViewById(R.id.imgPlayer3);
        pseudo3 = findViewById(R.id.pseudo3);
        imgPlayer4 = findViewById(R.id.imgPlayer4);
        pseudo4 = findViewById(R.id.pseudo4);
        btnReady = findViewById(R.id.btnReady);
        btnLaunch = findViewById(R.id.btnLaunch);

        btnReady.setOnClickListener(this);
        btnLaunch.setOnClickListener(this);

        // Si le client est le créateur de la partie il peut la lancer quand la salle est complète
        Boolean creator = getIntent().getBooleanExtra("creator", false);
        if (!creator) {
            btnLaunch.setEnabled(false);
        } else {
            btnLaunch.setEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, NewGameActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View view) {
        if (view == btnReady) {
            btnReady.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.colorInfo));
        } else if (view == btnLaunch) {
            Intent intent = new Intent(this, InGameActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
