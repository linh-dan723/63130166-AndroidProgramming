package tiil.edu.manhinhdangnhap;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Welcome to Home Screen!");
        textView.setTextSize(24);
        setContentView(textView);
    }
}
