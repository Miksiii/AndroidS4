package preferences.metropolitan.fit.rs.apppreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import android.widget.Toast;


public class AppPreference extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

    private static final String KEY_NOTIFICATIONS = "key_notifications",
                                KEY_UNI_NAME      = "key_uni_name",
                                KEY_UNI_ADDRESS   = "key_uni_address",
                                KEY_DATE          = "key_date",
                                KEY_TIME          = "key_time";

    private ListPreference prefNotifications;
    private EditTextPreference prefUniName, prefUniAddress;

    private DatePreferenceDialog prefDate;
    private TimePreferenceDialog prefTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.app_preferences);
        prefNotifications = (ListPreference) getPreferenceScreen().findPreference(KEY_NOTIFICATIONS);
        prefUniName = (EditTextPreference) getPreferenceScreen().findPreference(KEY_UNI_NAME);
        prefUniAddress = (EditTextPreference) getPreferenceScreen().findPreference(KEY_UNI_ADDRESS);
        prefDate = (DatePreferenceDialog) getPreferenceScreen().findPreference(KEY_DATE);
        prefTime = (TimePreferenceDialog) getPreferenceScreen().findPreference(KEY_TIME);

    }

    @Override
    public void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        switch(key) {
            case KEY_NOTIFICATIONS:
                Toast.makeText(getActivity(), "clicked on key_notifications key: " + prefNotifications.getEntry().toString(), Toast.LENGTH_SHORT).show();
                break;
            case KEY_UNI_NAME:
                Toast.makeText(getActivity(), "clicked on KEY_UNI_NAME" + prefUniName.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case KEY_UNI_ADDRESS:
                Toast.makeText(getActivity(), "clicked on KEY_UNI_ADDRESS" + prefUniAddress.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case KEY_DATE:
                Toast.makeText(getActivity(), "clicked on KEY_UNI_ADDRESS" + prefDate.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case KEY_TIME:
                Toast.makeText(getActivity(), "clicked on KEY_UNI_ADDRESS" + prefDate.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
