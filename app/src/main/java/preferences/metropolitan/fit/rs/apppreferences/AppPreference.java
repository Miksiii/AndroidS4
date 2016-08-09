package preferences.metropolitan.fit.rs.apppreferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;


public class AppPreference extends PreferenceFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.app_preferences);
    }
}
