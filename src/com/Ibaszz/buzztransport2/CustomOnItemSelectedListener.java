package com.Ibaszz.buzztransport2;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class CustomOnItemSelectedListener implements OnItemSelectedListener {

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long id) {
		
		Toast.makeText(parent.getContext(), 
					"OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
					Toast.LENGTH_SHORT).show();
		// TODO Auto-generated method stub

	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub

	}

}
