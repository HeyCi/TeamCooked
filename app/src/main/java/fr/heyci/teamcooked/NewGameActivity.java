package fr.heyci.teamcooked;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class NewGameActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editGameName;
    private EditText editPassword;
    private RadioButton rbCreateGame;
    private RadioButton rbJoinGame;
    private Button btnOK;
    private TextView tvGameName;
    private Boolean creator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        editGameName = findViewById(R.id.editGameName);
        editPassword = findViewById(R.id.editPassword);
        rbCreateGame = findViewById(R.id.rbCreateGame);
        rbJoinGame = findViewById(R.id.rbJoinGame);
        btnOK = findViewById(R.id.btnOK);
        tvGameName = findViewById(R.id.gameName);

        btnOK.setOnClickListener(this);
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
        // TODO implementer la verification des editText
        if (editGameName.length()> 0) {
            if (rbJoinGame.isChecked() || rbCreateGame.isChecked()) {
                Intent intent = new Intent(this, WaitingRoomActivity.class);
                if (rbCreateGame.isChecked()) {
                    creator = true;
                } else if (rbJoinGame.isChecked()) {
                    creator = false;
                }
                intent.putExtra("creator", creator);
                startActivity(intent);
                finish();
            } else {
                rbCreateGame.setTextColor(ContextCompat.getColor(this, R.color.colorWarning));
                rbJoinGame.setTextColor(ContextCompat.getColor(this, R.color.colorWarning));
            }
        } else {
            tvGameName.setTextColor(ContextCompat.getColor(this, R.color.colorWarning));
        }
    }
}
