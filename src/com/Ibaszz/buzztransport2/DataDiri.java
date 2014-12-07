package com.Ibaszz.buzztransport2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DataDiri extends Activity {

	public static String nama, noId, noTlp, almt, email, noRek;

	int cek = 0;
	int cek1 = 0;
	int cek2 = 0;
	int cek3 = 0;
	int cek4 = 0;
	int cek5 = 0;
	int cek6 = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.data_diri);
		Button lanjut3 = (Button) findViewById(R.id.lanjut3);
		lanjut3.setEnabled(false);
		//cekTombol2();
		cekTombol3();
	
		lanjut3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ambilData2();
				// TODO Auto-generated method stub
				startActivity(new Intent("com.Ibaszz.buzztransport2.LANJUT3"));
				;
			}
		});
	}

	public void ambilData2() {
		EditText ambilnama = (EditText) findViewById(R.id.Nama);
		EditText ambilnoId = (EditText) findViewById(R.id.noId);
		EditText ambilnoTlp = (EditText) findViewById(R.id.noTlp);
		EditText ambilalamat = (EditText) findViewById(R.id.alamat);
		EditText ambilnoRek = (EditText) findViewById(R.id.noRek);
		EditText ambilemail = (EditText) findViewById(R.id.email);
		nama = ambilnama.getText().toString();
		noId = ambilnoId.getText().toString();
		noTlp = ambilnoTlp.getText().toString();
		almt = ambilalamat.getText().toString();
		noRek = ambilnoRek.getText().toString();
		email = ambilemail.getText().toString();

	}
//CODINGAN GAGAL DIBUANG SAYANG
	public void cekTombol2() {
		final Button lanjut3 = (Button) findViewById(R.id.lanjut3);
		final TextView testes = (TextView) findViewById(R.id.testes);
		EditText ambilnama = (EditText) findViewById(R.id.Nama);
		EditText ambilnoId = (EditText) findViewById(R.id.noId);
		EditText ambilnoTlp = (EditText) findViewById(R.id.noTlp);
		EditText ambilalamat = (EditText) findViewById(R.id.alamat);
		EditText ambilnoRek = (EditText) findViewById(R.id.noRek);
		EditText ambilemail = (EditText) findViewById(R.id.email);

		nama = ambilnama.getText().toString();
		noId = ambilnoId.getText().toString();
		noTlp = ambilnoTlp.getText().toString();
		almt = ambilalamat.getText().toString();
		noRek = ambilnoRek.getText().toString();
		email = ambilemail.getText().toString();
		testes.setText("HAI");

	

		ambilnama.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				;
			}

		});

		ambilnama.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					cekTombol2();
					if (!nama.equals("") && !noId.equals("")
							&& !noTlp.equals("") && !almt.equals("")
							&& !noRek.equals("") && !email.equals("")) {
						cek = 1;
						cek1 = 1;
						testes.setText(" " + cek + " " + cek1 + " " + cek2
								+ " " + cek3 + "" + cek4 + "" + cek5 + ""
								+ cek6);
						lanjut3.setEnabled(true);
						cekTombol2();

					} else {
						cek = 0;

					}
					if (cek == 0) {

						lanjut3.setEnabled(false);
					}
				}
			}
		});

		ambilnoId.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

			}

		});

		ambilnoId.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					cekTombol2();

					if (!nama.equals("") && !noId.equals("")
							&& !noTlp.equals("") && !almt.equals("")
							&& !noRek.equals("") && !email.equals("")) {
						lanjut3.setEnabled(true);
						cek = 1;
						testes.setText(" " + cek + " " + cek1 + " " + cek2
								+ " " + cek3 + "" + cek4 + "" + cek5 + ""
								+ cek6);
						cekTombol2();
					} else {
						cek = 0;

					}
					if (cek == 0) {

						lanjut3.setEnabled(false);
					}
					;
				}
			}
		});
		ambilnoTlp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				;
			}

		});

		ambilnoTlp.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					// showMyDialog();
					cekTombol2();
					if (!nama.equals("") && !noId.equals("")
							&& !noTlp.equals("") && !almt.equals("")
							&& !noRek.equals("") && !email.equals("")) {
						lanjut3.setEnabled(true);
						cek = 1;
						testes.setText(" " + cek + " " + cek1 + " " + cek2
								+ " " + cek3 + "" + cek4 + "" + cek5 + ""
								+ cek6);
						cekTombol2();
					} else {
						cek = 0;

					}
					if (cek == 0) {

						lanjut3.setEnabled(false);
					}
					;
				}
			}
		});

		ambilalamat.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				;
			}

		});
		ambilalamat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					// showMyDialog();
					cekTombol2();
					if (!nama.equals("") && !noId.equals("")
							&& !noTlp.equals("") && !almt.equals("")
							&& !noRek.equals("") && !email.equals("")) {
						lanjut3.setEnabled(true);
						cek = 1;
						testes.setText(" " + cek + " " + cek1 + " " + cek2
								+ " " + cek3 + "" + cek4 + "" + cek5 + ""
								+ cek6);
						cekTombol2();
					} else {
						cek = 0;

					}
					if (cek == 0) {

						lanjut3.setEnabled(false);
					}
					;
				}
			}
		});
		ambilnoRek.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				;
			}

		});
		ambilnoRek.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					cekTombol2();
					if (!nama.equals("") && !noId.equals("")
							&& !noTlp.equals("") && !almt.equals("")
							&& !noRek.equals("") && !email.equals("")) {
						lanjut3.setEnabled(true);
						cek = 1;
						testes.setText(" " + cek + " " + cek1 + " " + cek2
								+ " " + cek3 + "" + cek4 + "" + cek5 + ""
								+ cek6);
						cekTombol2();
					} else {
						cek = 0;

					}
					if (cek == 0) {

						lanjut3.setEnabled(false);
					}
					;
				}
			}
		});
		ambilemail.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				;
			}

		});

		ambilemail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (hasFocus) {
					cekTombol2();
					if (!nama.equals("") && !noId.equals("")
							&& !noTlp.equals("") && !almt.equals("")
							&& !noRek.equals("") && !email.equals("")) {
						lanjut3.setEnabled(true);
						cek = 1;
						testes.setText(" " + cek + " " + cek1 + " " + cek2
								+ " " + cek3 + "" + cek4 + "" + cek5 + ""
								+ cek6);
						cekTombol2();
					} else {
						cek = 0;

					}
					if (cek == 0) {

						lanjut3.setEnabled(false);
					}
					;
				}
			}
		});
		// if (nama.equals("") && noId.equals("") && noTlp.equals("")
		// && almt.equals("") && noRek.equals("") && email.equals("")) {

		// lanjut3.setEnabled(false);
		// cek = 1;
		// testes.setText("" + cek);

		// }

	}
	
	public void cekTombol3(){
		EditText ambilnama = (EditText) findViewById(R.id.Nama);
		EditText ambilnoId = (EditText) findViewById(R.id.noId);
		EditText ambilnoTlp = (EditText) findViewById(R.id.noTlp);
		EditText ambilalamat = (EditText) findViewById(R.id.alamat);
		EditText ambilnoRek = (EditText) findViewById(R.id.noRek);
		EditText ambilemail = (EditText) findViewById(R.id.email);
		Button lanjut3 = (Button) findViewById(R.id.lanjut3);
		 
		TextWatcher watcher = new LocalTextWatcher();
		    ambilnama.addTextChangedListener(watcher);
		    ambilnoId.addTextChangedListener(watcher);
		    ambilnoTlp.addTextChangedListener(watcher);
		    ambilnoRek.addTextChangedListener(watcher);
		    ambilalamat.addTextChangedListener(watcher);
		    ambilemail.addTextChangedListener(watcher);
		    updateButtonState();
		
	}
	
	public void updateButtonState() {
		
		EditText ambilnama = (EditText) findViewById(R.id.Nama);
		EditText ambilnoId = (EditText) findViewById(R.id.noId);
		EditText ambilnoTlp = (EditText) findViewById(R.id.noTlp);
		EditText ambilalamat = (EditText) findViewById(R.id.alamat);
		EditText ambilnoRek = (EditText) findViewById(R.id.noRek);
		EditText ambilemail = (EditText) findViewById(R.id.email);
		Button lanjut3 = (Button) findViewById(R.id.lanjut3);
		
		//if(checkEditText(ambilnama) && checkEditText(ambilnoId)&& checkEditText(ambilnoTlp)&& checkEditText(ambilnoRek)&& checkEditText(ambilalamat)&& checkEditText(ambilemail)) {
			
		//	lanjut3.setEnabled(false);
		//	}
	    //else 
	    	if (checkEditText2(ambilnama) && checkEditText2(ambilnoId)&& checkEditText2(ambilnoTlp)&& checkEditText2(ambilnoRek)&& checkEditText2(ambilalamat)&& checkEditText2(ambilemail)){
	    	lanjut3.setEnabled(true);
	    }
	    	else {
	    		lanjut3.setEnabled(false);	
	    	}
	        }
	

private boolean checkEditText(EditText edit) {
	 return edit.getText().length() == 0;
}
private boolean checkEditText2(EditText edit){
	
	return edit.getText().length() > 0;
}

private class LocalTextWatcher implements TextWatcher {
    public void afterTextChanged(Editable s) {
        updateButtonState();
    }

    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
	

}
