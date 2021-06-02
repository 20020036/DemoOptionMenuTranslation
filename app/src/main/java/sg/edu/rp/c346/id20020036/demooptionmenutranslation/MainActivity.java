package sg.edu.rp.c346.id20020036.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslation;
    TextView tvTranslation2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslation = findViewById(R.id.tvTranslation);
        tvTranslation2 = findViewById(R.id.tvTranslation2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection)
        {
            tvTranslation.setText("Hello!");
            tvTranslation2.setText("Bye!");
            return true;
        }
        else if(id == R.id.italianSelection)
        {
            tvTranslation.setText("Ciao!");
            tvTranslation2.setText("Addio!");
        }
        else
        {
            tvTranslation.setText("Error Translation!");
        }

        return super.onOptionsItemSelected(item);
    }
}