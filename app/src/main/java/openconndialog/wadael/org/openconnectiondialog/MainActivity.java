package openconndialog.wadael.org.openconnectiondialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent("android.settings.WIRELESS_SETTINGS");
        startActivity(i);
        finish();
    }
}
