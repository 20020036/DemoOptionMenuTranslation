package sg.edu.rp.c346.id20020036.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslation = findViewById(R.id.tvTranslation);

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
            return true;
        }
        else if(id == R.id.italianSelection)
        {
            tvTranslation.setText("Ciao!");
        }
        else
        {
            tvTranslation.setText("Error Translation!");
        }

        return super.onOptionsItemSelected(item);
    }
}