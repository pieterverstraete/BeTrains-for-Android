package tof.cv.mpp;

import tof.cv.mpp.Utils.ConnectionMaker;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActionBar.LayoutParams;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.viewpagerindicator.R;

public class SettingsActivity extends FragmentActivity {

	

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(this);
		if (settings.getBoolean("preffullscreen", false))
			ConnectionMaker.setFullscreen(this);

	    TextView label = new TextView(this);
	    label.setText("A FAIRE");
	    label.setTextSize(20);
	    label.setGravity(Gravity.CENTER_HORIZONTAL);

	    LinearLayout ll = new LinearLayout(this);
	    ll.setOrientation(LinearLayout.VERTICAL);
	    ll.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
	    ll.setGravity(Gravity.CENTER);
	    ll.addView(label);
	    setContentView(ll);

	}

	
}
