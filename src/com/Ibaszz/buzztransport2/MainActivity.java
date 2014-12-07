package com.Ibaszz.buzztransport2;

import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	private Spinner spinner1, spinner2, spinner3, spinner4;
	public static int spiner;
	public static String Sdepart, Sto, SdepartD, SreturnD, SdepartT, SreturnT;
	private Button btnSubmit;
	public int cek = 0;

	public int getSpiner() {

		return spiner;
	}

	private static final String[] Provinsi = new String[] { "Ambarawa",
			"Anyer", "Bandung", "Bangil", "Banjar", "Jawa Barat",
			"Banjarnegara", "Bangkalan", "Bantul", "Banyumas", "Banyuwangi",
			"Batang", "Batu", "Bekasi", "Blitar", "Blora", "Bogor",
			"Bojonegoro", "Bondowoso", "Boyolali", "Bumiayu", "Brebes",
			"Caruban", "Cianjur", "Ciamis", "Cibinong", "Cikampek", "Cikarang",
			"Cilacap", "Cirebon", "Demak", "Depok", "Garut", "Gresik",
			"Indramayu", "Jakarta", "Jember", "Jepara", "Jombang", "Kajen",
			"Karanganyar", "Kebumen", "Kediri", "Kendal", "Kepanjen", "Klaten",
			"Kraksaan", "Kudus", "Kuningan", "Lamongan", "Lumajang", "Madiun",
			"Magelang", "Magetan", "Majalengka", "Malang", "Mojokerto",
			"Mojosari", "Mungkid", "Ngamprah", "Nganjuk", "Ngawi", "Pacitan",
			"Pamekasan", "Pandeglang", "Pare", "Pati", "Pasuruan",
			"Pekalongan", "Pelabuhan Ratu", "Pemalang", "Ponorogo",
			"Probolinggo", "Purbalingga", "Purwakarta", "Purwodadi",
			"Purwokerto", "Purworejo", "Rangkasbitung", "Rembang", "Salatiga",
			"Sampang", "Semarang", "Serang", "Sidayu", "Sidoarjo",
			"Singaparna", "Situbondo", "Slawi", "Sleman", "Soreang", "Sragen",
			"Subang", "Sukabumi", "Sukoharjo", "Sumber", "Sumedang", "Sumenep",
			"Surabaya", "Surakarta", "Tasikmalaya", "Tangerang", "Tangerang",
			"Selatan", "Tegal", "Temanggung", "Tigaraksa", "Trenggalek",
			"Tuban", "Tulungagung", "Ungaran", "Wates", "Wlingi", "Wonogiri",
			"Wonosari", "Wonosobo", "Yogyakarta" };

	// Buat Tanggal
	private EditText fromDateEtxt;
	private EditText toDateEtxt;
	private DatePickerDialog fromDatePickerDialog;
	private DatePickerDialog toDatePickerDialog;
	private SimpleDateFormat dateFormatter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
		findViewsById();
		setDateTimeField();
		cekTombol();
		Button jmlP = (Button) findViewById(R.id.confirm);
		jmlP.setEnabled(false);
		// Date
		dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
		// Auto Complete Text
		AutoCompleteTextView ACtv = (AutoCompleteTextView) findViewById(R.id.depart);
		AutoCompleteTextView ACtv2 = (AutoCompleteTextView) findViewById(R.id.to);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, Provinsi);
		ACtv.setAdapter(adapter);
		ACtv2.setAdapter(adapter);
		// Buat Pindah Ke Tab lanjh
		jmlP.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				addListenerOnButton();
				ambildata();
				// TODO Auto-generated method stub
				startActivity(new Intent("com.Ibaszz.buzztransport2.LANJUT"));
				;
			}
		});
	}

	public void cekTombol() {
		AutoCompleteTextView ACtv = (AutoCompleteTextView) findViewById(R.id.depart);
		AutoCompleteTextView ACtv2 = (AutoCompleteTextView) findViewById(R.id.to);
		EditText departD = (EditText) findViewById(R.id.departD);
		TextWatcher watcher = new LocalTextWatcher2();
		ACtv.addTextChangedListener(watcher);
		ACtv2.addTextChangedListener(watcher);
		departD.addTextChangedListener(watcher);

	}
	public void updateButtonState() {
		AutoCompleteTextView ACtv = (AutoCompleteTextView) findViewById(R.id.depart);
		AutoCompleteTextView ACtv2 = (AutoCompleteTextView) findViewById(R.id.to);
		EditText departD = (EditText) findViewById(R.id.departD);
		Button jmlP = (Button) findViewById(R.id.confirm);
		if (checkEditText2(ACtv) && checkEditText2(ACtv2)
				&& checkEditText2(departD)) {
			jmlP.setEnabled(true);
		}
		else{
			jmlP.setEnabled(false);
		}
	}
	
	private boolean checkEditText2(EditText edit) {
		return edit.getText().length() > 0;
	}

	private class LocalTextWatcher2 implements TextWatcher {
		public void afterTextChanged(Editable s) {
			updateButtonState();
		}
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
		}
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
		}
	}

	public void onRadioButtonClicked(View view) {
		// Is the button now checked?
		ambildata();
		boolean checked = ((RadioButton) view).isChecked();
		EditText edt = (EditText) findViewById(R.id.returnD);
		TextView tvRtrn = (TextView) findViewById(R.id.tvReturn);
		Spinner edt2 = (Spinner) findViewById(R.id.returnT);
		// Check which radio button was clicked
		switch (view.getId()) {
		case R.id.rbreturn:
			if (checked)

				edt.setEnabled(true);
			edt.setInputType(InputType.TYPE_NULL);
			edt.setFocusableInTouchMode(true);
			edt.clearFocus();
			edt.setVisibility(1);

			edt2.setEnabled(true);
			edt2.setFocusableInTouchMode(false);
			edt2.clearFocus();
			edt2.setVisibility(1);

			tvRtrn.setEnabled(true);
			tvRtrn.setFocusableInTouchMode(true);
			tvRtrn.requestFocus();
			tvRtrn.setVisibility(1);
			tvRtrn.setText("Waktu dan Tanggal Pulang");

			// Pirates are the best
			break;
		case R.id.rbway:
			if (checked)
				// Ninjas rule

				edt.setEnabled(true);
			edt.setInputType(InputType.TYPE_CLASS_NUMBER);
			edt.setFocusableInTouchMode(true);
			edt.requestFocus();
			edt.setVisibility(8);

			edt2.setEnabled(true);
			edt2.setFocusableInTouchMode(true);
			edt2.requestFocus();
			edt2.setVisibility(8);

			tvRtrn.setEnabled(false);
			tvRtrn.setFocusableInTouchMode(false);
			tvRtrn.setFocusableInTouchMode(false);
			tvRtrn.clearFocus();
			tvRtrn.setVisibility(1);
			tvRtrn.setText("");

			break;
		}
	}

	public void addListenerOnSpinnerItemSelection() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		spinner3 = (Spinner) findViewById(R.id.departT);
		spinner3.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		spinner4 = (Spinner) findViewById(R.id.returnT);
		spinner4.setOnItemSelectedListener(new CustomOnItemSelectedListener());

	}

	public void addListenerOnButton() {

		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		btnSubmit = (Button) findViewById(R.id.confirm);

		int spiner1 = Integer.parseInt(String.valueOf(spinner1
				.getSelectedItem()));
		int spiner2 = Integer.parseInt(String.valueOf(spinner2
				.getSelectedItem()));
		spiner = spiner1 + spiner2;
		getSpiner();

	}

	private void findViewsById() {
		fromDateEtxt = (EditText) findViewById(R.id.departD);
		fromDateEtxt.setInputType(InputType.TYPE_NULL);
		fromDateEtxt.requestFocus();

		toDateEtxt = (EditText) findViewById(R.id.returnD);
		toDateEtxt.setInputType(InputType.TYPE_NULL);
	}

	private void setDateTimeField() {
		fromDateEtxt.setOnClickListener(this);
		toDateEtxt.setOnClickListener(this);

		Calendar newCalendar = Calendar.getInstance();
		fromDatePickerDialog = new DatePickerDialog(this,
				new OnDateSetListener() {

					public void onDateSet(DatePicker view, int year,
							int monthOfYear, int dayOfMonth) {
						Calendar newDate = Calendar.getInstance();
						newDate.set(year, monthOfYear, dayOfMonth);
						fromDateEtxt.setText(dateFormatter.format(newDate
								.getTime()));
					}

				}, newCalendar.get(Calendar.YEAR),
				newCalendar.get(Calendar.MONTH),
				newCalendar.get(Calendar.DAY_OF_MONTH));

		toDatePickerDialog = new DatePickerDialog(this,
				new OnDateSetListener() {

					public void onDateSet(DatePicker view, int year,
							int monthOfYear, int dayOfMonth) {
						Calendar newDate = Calendar.getInstance();
						newDate.set(year, monthOfYear, dayOfMonth);
						toDateEtxt.setText(dateFormatter.format(newDate
								.getTime()));
					}

				}, newCalendar.get(Calendar.YEAR),
				newCalendar.get(Calendar.MONTH),
				newCalendar.get(Calendar.DAY_OF_MONTH));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void ambildata() {
		AutoCompleteTextView depart = (AutoCompleteTextView) findViewById(R.id.depart);
		AutoCompleteTextView to = (AutoCompleteTextView) findViewById(R.id.to);
		EditText departD = (EditText) findViewById(R.id.departD);
		EditText returnD = (EditText) findViewById(R.id.returnD);
		spinner3 = (Spinner) findViewById(R.id.departT);
		spinner4 = (Spinner) findViewById(R.id.returnT);
		Sdepart = depart.getText().toString();
		Sto = to.getText().toString();
		SdepartD = departD.getText().toString();
		SreturnD = returnD.getText().toString();
		// Jml penumpang = Spiner
		SdepartT = String.valueOf(spinner3.getSelectedItem());
		SreturnT = String.valueOf(spinner4.getSelectedItem());

	}

	@Override
	public void onClick(View view) {

		if (view == fromDateEtxt) {
			fromDatePickerDialog.show();
		} else if (view == toDateEtxt) {
			toDatePickerDialog.show();
		}
		// TODO Auto-generated method stub

	}
}
