package in.zattack.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void popularApp(View view) {
        Toast.makeText(this, "Launching the Popular Movies App", Toast.LENGTH_SHORT).show();
    }

    public void stackApp(View view) {
        Toast.makeText(this, "Launching the Stack Hawk App", Toast.LENGTH_SHORT).show();
    }

    public void biggerApp(View view) {
        Toast.makeText(this, "Launching the Bigger App", Toast.LENGTH_SHORT).show();
    }

    public void materialDesignApp(View view) {
        Toast.makeText(this, "Launching the Material Design App", Toast.LENGTH_SHORT).show();
    }

    public void xyz(View view) {
        Toast.makeText(this, "Launching the XYZ Reader App", Toast.LENGTH_SHORT).show();
    }

    public void capstoneApp(View view) {
        Toast.makeText(this, "Launching the Capstone App", Toast.LENGTH_SHORT).show();
    }
}
