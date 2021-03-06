package tk.alltrue.startactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);
        EditText giftEditText = (EditText) findViewById(R.id.editTextGift);

        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift" , giftEditText.getText().toString());
        startActivity(intent);
    }
}
