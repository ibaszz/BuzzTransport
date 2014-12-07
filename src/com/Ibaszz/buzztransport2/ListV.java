package com.Ibaszz.buzztransport2;

import android.app.ListActivity;
import android.content.Loader.ForceLoadContentObserver;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListV extends ListActivity{

	TextView textout;
	EditText textin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.listview, penumpang));
		ListView list = getListView();
		list.setTextFilterEnabled(true);
		list.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
			//	Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
			//	textout = (TextView) findViewById(R.id.outputpenumpang);
				//textout.setText(((TextView) view)).getText();
			}
		});
	}

	static final String[] penumpang=new String[]{
		"1 orang","2 orang", "3 orang","4 orang","5 orang","6 orang","7 orang","8 orang","9 orang","10 orang","11 orang","12 orang","13 orang","14 orang","15 orang","16 orang","17 orang","18 orang","19 orang","20 orang","21 orang","22 orang","23 orang","24 orang","25 orang","26 orang","27 orang","28 orang","29 orang","30 orang"
	
	
	};
}
