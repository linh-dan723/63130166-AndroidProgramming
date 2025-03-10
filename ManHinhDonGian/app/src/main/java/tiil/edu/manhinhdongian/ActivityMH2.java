package tiil.edu.manhinhdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button nuthH2, nuthH3;

    void TimDieuKhien() {
        nuthH2 = findViewById(R.id.btnMH2);
        nuthH3 = findViewById(R.id.btnMH3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm điều khiển nút bấm
        TimDieuKhien();

        // Gán bộ lắng nghe sự kiện cho nút MH2
        nuthH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển sang màn hình 2
                Intent intentMH2 = new Intent(MainActivity.this, ActivityMH2.class);
                startActivity(intentMH2);
            }
        });

        // Gán bộ lắng nghe sự kiện cho nút MH3
        nuthH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển sang màn hình 3
                Intent intentMH3 = new Intent(MainActivity.this, ActivityMH3.class);
                startActivity(intentMH3);
            }
        });
    }
}
