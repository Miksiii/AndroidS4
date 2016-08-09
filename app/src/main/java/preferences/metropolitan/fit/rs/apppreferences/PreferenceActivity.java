package preferences.metropolitan.fit.rs.apppreferences;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        AppPreference appReferenceFragment = new AppPreference();
        fragmentTransaction.replace(android.R.id.content, appReferenceFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
