package avfont.com.aviator.aviatorfontlibrary;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import avfont.com.aviator.aviatorfontlib.AvFonts;
import avfont.com.aviator.aviatorfontlibrary.adapter.AdapterClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout col = findViewById(R.id.collapseLayout);
        col.setTitleEnabled(false);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ((TextView) findViewById(R.id.txtApp)).setTypeface(AvFonts.AndroidInsomniaRegular(MainActivity.this));
//       Test();
        ListView expandableListView = findViewById(R.id.exp);
        expandableListView.setAdapter(new AdapterClass(AvFonts.GetFonts(MainActivity.this), MainActivity.this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Test();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void Test() {
        String[] fns = new AvFonts().FontsNames(MainActivity.this); //AvFonts.GetFonts(MainActivity.this);
        if (fns != null) {
            Toast.makeText(this, String.valueOf(fns.length), Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Error loading fonts", Toast.LENGTH_SHORT).show();
    }
}
