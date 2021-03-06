package tof.cv.mpp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;


public class ExtraFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_extra, null);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		//getActivity().getActionBar().setIcon(R.drawable.ab_irail);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setSubtitle(null);

		final int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity());
		if ((!(status == ConnectionResult.SUCCESS)) && getView().findViewById(R.id.irail) != null) {
			getView().findViewById(R.id.irail).setVisibility(View.GONE);
		}
	}
}