package com.Ibaszz.buzztransport2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataPemesanan extends Activity {

	String Sdepart = MainActivity.Sdepart;
	String Sto = MainActivity.Sto;
	String SdepartD = MainActivity.SdepartD;
	String SreturnD = MainActivity.SreturnD;
	int spiner = MainActivity.spiner;
	String SdepartT = MainActivity.SdepartT;
	String SreturnT = MainActivity.SreturnT;
	String nama = DataDiri.nama;
	String alamat = DataDiri.almt;
	String noTlp = DataDiri.noTlp;
	String noId = DataDiri.noId;
	String noRek = DataDiri.noRek;
	String email = DataDiri.email;

	int S1 = Lanjut.i1;
	int S2 = Lanjut.i2;
	int S3 = Lanjut.i3;
	int S4 = Lanjut.i4;
	int S5 = Lanjut.i5;
	int S6 = Lanjut.i6;
	int S7 = Lanjut.i7;
	int S8 = Lanjut.i8;
	int S9 = Lanjut.i9;
	int S10 = Lanjut.i10;
	int S11 = Lanjut.i11;
	int S12 = Lanjut.i12;
	int S13 = Lanjut.i13;
	int S14 = Lanjut.i14;
	int S15 = Lanjut.i15;
	int S16 = Lanjut.i16;
	int S17 = Lanjut.i17;
	int S18 = Lanjut.i18;
	int S19 = Lanjut.i19;
	int S20 = Lanjut.i20;
	int S21 = Lanjut.i21;
	int S22 = Lanjut.i22;
	int S23 = Lanjut.i23;
	int S24 = Lanjut.i24;
	int S25 = Lanjut.i25;
	int S26 = Lanjut.i26;
	int S27 = Lanjut.i27;
	int S28 = Lanjut.i28;
	int S29 = Lanjut.i29;
	String Si = "";
	String Si1 = "";
	String Si2 = "";
	String Si3 = "";
	String Si4 = "";
	String Si5 = "";
	String Si6 = "";
	String Si7 = "";
	String Si8 = "";
	String Si9 = "";
	String Si10 = "";
	String Si11 = "";
	String Si12 = "";
	String Si13 = "";
	String Si14 = "";
	String Si15 = "";
	String Si16 = "";
	String Si17 = "";
	String Si18 = "";
	String Si19 = "";
	String Si20 = "";
	String Si21 = "";
	String Si22 = "";
	String Si23 = "";
	String Si24 = "";
	String Si25 = "";
	String Si26 = "";
	String Si27 = "";
	String Si28 = "";
	String Si29 = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.data_pemesanan);
		terimaData();
		Button ubah = (Button) findViewById(R.id.ubah);
		ubah.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						MainActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);

			}

		});
	}

	public void terimaData() {
		TextView tvDepart = (TextView) findViewById(R.id.tvDepart);
		tvDepart.setText("  " + Sdepart);
		TextView tvTujuan = (TextView) findViewById(R.id.tvTujuan);
		tvTujuan.setText("  " + Sto);
		TextView tvTglPrgi = (TextView) findViewById(R.id.tvTglPrgi);
		tvTglPrgi.setText("  " + SdepartD);
		TextView tvWktPrgi = (TextView) findViewById(R.id.tvWktPrgi);
		tvWktPrgi.setText("  " + SdepartT);
		TextView tvTglPlng = (TextView) findViewById(R.id.tvTglPlng);
		tvTglPlng.setText("  " + SreturnD);
		TextView tvWktPlng = (TextView) findViewById(R.id.tvWktPlng);
		tvWktPlng.setText("  " + SreturnT);
		TextView tvJmlKrsi = (TextView) findViewById(R.id.tvJmlKrsi);
		tvJmlKrsi.setText("  " + spiner);
		TextView tvNoKrsi = (TextView) findViewById(R.id.tvNoKursi);

		if (S1 == 1) {
			Si = "A1";
		}
		if (S2 == 1) {
			Si1 = " B1";
		}
		if (S3 == 1) {
			Si2 = " C1";
		}
		if (S4 == 1) {
			Si3 = " D1";
		}
		if (S5 == 1) {
			Si4 = " E1";		
		}
		if (S6 == 1) {
			Si5 = " F1";			
		}
		if (S7 == 1) {
			Si6 = " A2";
		}
		if (S8 == 1) {
			Si7 = " B2";
		}
		if (S9 == 1) {
			Si8 = " C2";
		}
		if (S10 == 1) {
			Si9 = " D2";
		}
		if (S11 == 1) {
			Si10 = " E2";
		}
		if (S12 == 1) {
			Si11 = " F2";
		}
		if (S13 == 1) {
			Si12 = " A3";
		}
		if (S14 == 1) {
			Si13 = " B3";
		}
		if (S15 == 1) {
			Si14 = " C3";
		}
		if (S16 == 1) {
			Si15 = " D3";
		}
		if (S17 == 1) {
			Si16 = " E3";
		}
		if (S18 == 1) {
			Si17 = " F3";
		}
		if (S19 == 1) {
			Si18 = " A4";
		}
		if (S20 == 1) {
			Si19 = " B4";
		}
		if (S21 == 1) {
			Si20 = " C4";
		}
		if (S22 == 1) {
			Si21 = " D4";
		}
		if (S23 == 1) {
			Si22 = " E4";
		}
		if (S24 == 1) {
			Si23 = " F4";
		}
		if (S25 == 1) {
			Si24 = " H1";
		}
		if (S26 == 1) {
			Si25 = " H2";
		}
		if (S27 == 1) {
			Si26 = " H3";
		}
		if (S28 == 1) {
			Si27 = " H4";
		}
		if (S29 == 1) {
			Si28 = " H5";
		}

		tvNoKrsi.setText("" + Si + "" +Si1+ "" + Si2 + "" + Si3 + "" + Si4 + "" + Si5 + ""
				+ Si6 + "" + Si7 + "" + Si8 + "" + Si9 + "" + Si10 + "" + Si11 + ""
				+ Si12 + "" + Si13 + "" + Si14 + "" + Si15 + "" + Si16 + "" + Si17
				+ "" + Si18 + "" + Si19 + "" + Si20 + "" + Si21 + "" + Si22 + ""
				+ Si23 + "" + Si24 + "" + Si25 + "" + Si26 + "" + Si27 + "" + Si28
				+ "");
		TextView tvAlamat = (TextView) findViewById(R.id.tvAlamat);
		tvAlamat.setText("  " + alamat);
		TextView tvid = (TextView) findViewById(R.id.tvId);
		tvid.setText("  " + noId);
		TextView tvrek = (TextView) findViewById(R.id.tvRek);
		tvrek.setText("  " + noRek);
		TextView tvtlp = (TextView) findViewById(R.id.tvTlp);
		tvtlp.setText("  " + noTlp);
		TextView tvnama = (TextView) findViewById(R.id.tvNama);
		tvnama.setText("  " + nama);
		TextView tvemail = (TextView) findViewById(R.id.tvEmail);
		tvemail.setText("  " + email);

	}
}
