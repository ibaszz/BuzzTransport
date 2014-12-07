package com.Ibaszz.buzztransport2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Lanjut extends Activity {
	int i = 0;
	int j1 = 0;
	int j2 = 0;
	int j3 = 0;
	int j4 = 0;
	int j5 = 0;
	int j6 = 0;
	int j7 = 0;
	int j8 = 0;
	int j9 = 0;
	int j10 = 0;
	int j11 = 0;
	int j12 = 0;
	int j13 = 0;
	int j14 = 0;
	int j15 = 0;
	int j16 = 0;
	int j17 = 0;
	int j18 = 0;
	int j19 = 0;
	int j20 = 0;
	int j21 = 0;
	int j22 = 0;
	int j23 = 0;
	int j24 = 0;
	int j25 = 0;
	int j26 = 0;
	int j27 = 0;
	int j28 = 0;
	int j29 = 0;

	
	public static int i1 = 0;
	public static int i2 = 0;
	public static int i3 = 0;
	public static int i4 = 0;
	public static int i5 = 0;
	public static int i6 = 0;
	public static int i7 = 0;
	public static int i8 = 0;
	public static int i9 = 0;
	public static int i10 = 0;
	public static int i11 = 0;
	public static int i12 = 0;
	public static int i13 = 0;
	public static int i14 = 0;
	public static int i15 = 0;
	public static int i16 = 0;
	public static int i17 = 0;
	public static int i18 = 0;
	public static int i19 = 0;
	public static int i20 = 0;
	public static int i21 = 0;
	public static int i22 = 0;
	public static int i23 = 0;
	public static int i24 = 0;
	public static int i25 = 0;
	public static int i26 = 0;
	public static int i27 = 0;
	public static int i28 = 0;
	public static int i29 = 0;


	public static String Si, Si1, Si2, Si3, Si4, Si5, Si6, Si7, Si8, Si9, Si10,
			Si11, Si12, Si13, Si14, Si15, Si16, Si17, Si18, Si19, Si20, Si21,
			Si22, Si23, Si24, Si25, Si26, Si27, Si28, Si29;

	
	
	MainActivity ambil = new MainActivity();
	int spiner = MainActivity.spiner;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lanjut_confirm);
		TextView testingpenjelasan = (TextView) findViewById(R.id.penjelasantvi);
		testingpenjelasan.setText("Jumlah Pesanan : " + spiner);
		Button lanjut2 = (Button) findViewById(R.id.tmblLanjut2);
		lanjut2.setEnabled(false);
		lanjut2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				
				// TODO Auto-generated method stub
				tes();
				startActivity(new Intent("com.Ibaszz.buzztransport2.LANJUT2"));
				;
			}
		});
		aktivasiTombol();
	}

	public void tombolOn() {
		ToggleButton toggle = (ToggleButton) findViewById(R.id.bA1);
		ToggleButton toggle1 = (ToggleButton) findViewById(R.id.bB1);
		ToggleButton toggle2 = (ToggleButton) findViewById(R.id.bC1);
		ToggleButton toggle3 = (ToggleButton) findViewById(R.id.bD1);
		ToggleButton toggle4 = (ToggleButton) findViewById(R.id.bE1);
		ToggleButton toggle5 = (ToggleButton) findViewById(R.id.bF1);
		ToggleButton toggle6 = (ToggleButton) findViewById(R.id.bA2);
		ToggleButton toggle7 = (ToggleButton) findViewById(R.id.bB2);
		ToggleButton toggle8 = (ToggleButton) findViewById(R.id.bC2);
		ToggleButton toggle9 = (ToggleButton) findViewById(R.id.bD2);
		ToggleButton toggle10 = (ToggleButton) findViewById(R.id.bE2);
		ToggleButton toggle11 = (ToggleButton) findViewById(R.id.bF2);
		ToggleButton toggle12 = (ToggleButton) findViewById(R.id.bA3);
		ToggleButton toggle13 = (ToggleButton) findViewById(R.id.bB3);
		ToggleButton toggle14 = (ToggleButton) findViewById(R.id.bC3);
		ToggleButton toggle15 = (ToggleButton) findViewById(R.id.bD3);
		ToggleButton toggle16 = (ToggleButton) findViewById(R.id.bE3);
		ToggleButton toggle17 = (ToggleButton) findViewById(R.id.bF3);
		ToggleButton toggle18 = (ToggleButton) findViewById(R.id.bA4);
		ToggleButton toggle19 = (ToggleButton) findViewById(R.id.bB4);
		ToggleButton toggle20 = (ToggleButton) findViewById(R.id.bC4);
		ToggleButton toggle21 = (ToggleButton) findViewById(R.id.bD4);
		ToggleButton toggle22 = (ToggleButton) findViewById(R.id.bE4);
		ToggleButton toggle23 = (ToggleButton) findViewById(R.id.bF4);
		ToggleButton toggle24 = (ToggleButton) findViewById(R.id.bH1);
		ToggleButton toggle25 = (ToggleButton) findViewById(R.id.bH2);
		ToggleButton toggle26 = (ToggleButton) findViewById(R.id.bH3);
		ToggleButton toggle27 = (ToggleButton) findViewById(R.id.bH4);
		ToggleButton toggle28 = (ToggleButton) findViewById(R.id.bH5);
		Button lanjut2 = (Button) findViewById(R.id.tmblLanjut2);
		toggle1.setEnabled(true);
		toggle.setEnabled(true);
		toggle2.setEnabled(true);
		toggle3.setEnabled(true);
		toggle4.setEnabled(true);
		toggle5.setEnabled(true);
		toggle6.setEnabled(true);
		toggle7.setEnabled(true);
		toggle8.setEnabled(true);
		toggle9.setEnabled(true);
		toggle10.setEnabled(true);
		toggle11.setEnabled(true);
		toggle12.setEnabled(true);
		toggle13.setEnabled(true);
		toggle14.setEnabled(true);
		toggle15.setEnabled(true);
		toggle16.setEnabled(true);
		toggle17.setEnabled(true);
		toggle18.setEnabled(true);
		toggle19.setEnabled(true);
		toggle20.setEnabled(true);
		toggle21.setEnabled(true);
		toggle22.setEnabled(true);
		toggle23.setEnabled(true);
		toggle24.setEnabled(true);
		toggle25.setEnabled(true);
		toggle26.setEnabled(true);
		toggle27.setEnabled(true);
		toggle28.setEnabled(true);
		lanjut2.setEnabled(false);
	}

	public void aktivasiTombol() {
		ToggleButton toggle = (ToggleButton) findViewById(R.id.bA1);
		ToggleButton toggle1 = (ToggleButton) findViewById(R.id.bB1);
		ToggleButton toggle2 = (ToggleButton) findViewById(R.id.bC1);
		ToggleButton toggle3 = (ToggleButton) findViewById(R.id.bD1);
		ToggleButton toggle4 = (ToggleButton) findViewById(R.id.bE1);
		ToggleButton toggle5 = (ToggleButton) findViewById(R.id.bF1);
		ToggleButton toggle6 = (ToggleButton) findViewById(R.id.bA2);
		ToggleButton toggle7 = (ToggleButton) findViewById(R.id.bB2);
		ToggleButton toggle8 = (ToggleButton) findViewById(R.id.bC2);
		ToggleButton toggle9 = (ToggleButton) findViewById(R.id.bD2);
		ToggleButton toggle10 = (ToggleButton) findViewById(R.id.bE2);
		ToggleButton toggle11 = (ToggleButton) findViewById(R.id.bF2);
		ToggleButton toggle12 = (ToggleButton) findViewById(R.id.bA3);
		ToggleButton toggle13 = (ToggleButton) findViewById(R.id.bB3);
		ToggleButton toggle14 = (ToggleButton) findViewById(R.id.bC3);
		ToggleButton toggle15 = (ToggleButton) findViewById(R.id.bD3);
		ToggleButton toggle16 = (ToggleButton) findViewById(R.id.bE3);
		ToggleButton toggle17 = (ToggleButton) findViewById(R.id.bF3);
		ToggleButton toggle18 = (ToggleButton) findViewById(R.id.bA4);
		ToggleButton toggle19 = (ToggleButton) findViewById(R.id.bB4);
		ToggleButton toggle20 = (ToggleButton) findViewById(R.id.bC4);
		ToggleButton toggle21 = (ToggleButton) findViewById(R.id.bD4);
		ToggleButton toggle22 = (ToggleButton) findViewById(R.id.bE4);
		ToggleButton toggle23 = (ToggleButton) findViewById(R.id.bF4);
		ToggleButton toggle24 = (ToggleButton) findViewById(R.id.bH1);
		ToggleButton toggle25 = (ToggleButton) findViewById(R.id.bH2);
		ToggleButton toggle26 = (ToggleButton) findViewById(R.id.bH3);
		ToggleButton toggle27 = (ToggleButton) findViewById(R.id.bH4);
		ToggleButton toggle28 = (ToggleButton) findViewById(R.id.bH5);

		if (spiner <= i) {
			Button lanjut2 = (Button) findViewById(R.id.tmblLanjut2);
			lanjut2.setEnabled(true);
			if (j1 >= 1) {
				toggle.setEnabled(true);
				toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j1= 1;
						
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();

						} else {

							i = i - 1;
							j1 = 0;
							
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle.setEnabled(false);
			}
			if (j2 >= 1) {
				toggle1.setEnabled(true);
				toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j2 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j2 = 0;

							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();
						}
					}
				});
			} else {
				toggle1.setEnabled(false);

			}
			if (j3 >= 1) {

				toggle2.setEnabled(true);
				toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j3 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j3 = 0;

							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();
						}
					}
				});
			} else {
				toggle2.setEnabled(false);

			}
			if (j4 >= 1) {
				toggle3.setEnabled(true);
				toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j4 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();

						} else {

							i = i - 1;
							j4 = 0;

							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();
						}
					}
				});
			} else {
				toggle3.setEnabled(false);

			}
			if (j5 >= 1) {
				toggle4.setEnabled(true);
				toggle4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j5 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();

						} else {

							i = i - 1;
							j5 = 0;

							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();
						}
					}
				});
			} else {
				toggle4.setEnabled(false);

			}
			if (j6 >= 1) {
				toggle5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j6 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();

						} else {

							i = i - 1;
							j6 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();
						}
					}
				});
				toggle5.setEnabled(true);
			} else {
				toggle5.setEnabled(false);

			}
			if (j7 >= 1) {
				toggle6.setEnabled(true);

				toggle6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j7 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j7 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle6.setEnabled(false);
			}
			if (j8 >= 1) {
				toggle7.setEnabled(true);
				toggle7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j8 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j8 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});

			} else {
				toggle7.setEnabled(false);
			}
			if (j9 >= 1) {
				toggle8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j9 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j9 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
				toggle8.setEnabled(true);
			} else {
				toggle8.setEnabled(false);
			}
			if (j10 >= 1) {
				toggle9.setEnabled(true);
				toggle9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j10 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j10 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle9.setEnabled(false);

			}
			if (j11 >= 1) {
				toggle10.setEnabled(true);
				toggle10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j11 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j11 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle10.setEnabled(false);
			}
			if (j12 >= 1) {
				toggle11.setEnabled(true);
				toggle11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j12 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j12 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle11.setEnabled(false);
			}
			if (j13 >= 1) {
				toggle12.setEnabled(true);
				toggle12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j13 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j13 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle12.setEnabled(false);
			}
			if (j14 >= 1) {
				toggle13.setEnabled(true);
				toggle13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j14 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j14 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle13.setEnabled(false);
			}
			if (j15 >= 1) {
				toggle14.setEnabled(true);
				toggle14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							i15 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j15 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle14.setEnabled(false);
			}
			if (j16 >= 1) {
				toggle15.setEnabled(true);
				toggle15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j16 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j16 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle15.setEnabled(false);
			}
			if (j17 >= 1) {

				toggle16.setEnabled(true);
				toggle16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j17 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j17 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle16.setEnabled(false);
			}
			if (j18 >= 1) {
				toggle17.setEnabled(true);
				toggle17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j18 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j18 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle17.setEnabled(false);
			}
			if (j19 >= 1) {
				toggle18.setEnabled(true);
				toggle18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j19 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j19 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle18.setEnabled(false);
			}
			if (j20 >= 1) {
				toggle19.setEnabled(true);
				toggle19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j20 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j20 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle19.setEnabled(false);
			}
			if (j21 >= 1) {
				toggle20.setEnabled(true);
				toggle20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j21 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j21 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle20.setEnabled(false);
			}
			if (j22 >= 1) {
				toggle21.setEnabled(true);
				toggle21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j22 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j22 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle21.setEnabled(false);
			}
			if (j23 >= 1) {
				toggle22.setEnabled(true);
				toggle22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j23 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j23 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle22.setEnabled(false);
			}
			if (j24 >= 1) {
				toggle23.setEnabled(true);
				toggle23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j24 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j24 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle23.setEnabled(false);
			}
			if (j25 >= 1) {
				toggle24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j25 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j25 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
				toggle24.setEnabled(true);
			} else {
				toggle24.setEnabled(false);
			}
			if (j26 >= 1) {
				toggle25.setEnabled(true);
				toggle25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j26 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j26 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle25.setEnabled(false);
			}
			if (j27 >= 1) {

				toggle26.setEnabled(true);
				toggle26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j27 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j27 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle26.setEnabled(false);
			}
			if (j28 >= 1) {
				toggle27.setEnabled(true);
				toggle27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j28 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j28 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle27.setEnabled(false);
			}
			if (j29 >= 1) {
				toggle28.setEnabled(true);
				toggle28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						TextView tv = (TextView) findViewById(R.id.tvi);

						if (isChecked) {
							// The toggle is enabled
							i = i + 1;
							j29 = 1;
							tv.setText("Kursi yang sudah dipilih : " + i);

							aktivasiTombol();

						} else {

							i = i - 1;
							j29 = 0;
							tv.setText("Kursi yang sudah dipilih : " + i);
							aktivasiTombol();
							tombolOn();

						}
					}
				});
			} else {
				toggle28.setEnabled(false);
			}
		} else {
			toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);

					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						j1 = 1;
						aktivasiTombol();

					} else {

						i = i - 1;
						j1 = 0;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					}
				}
			});

			toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j2 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j2 = 0;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					}
				}
			});

			toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j3 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j3 = 0;

						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					}
				}
			});
			toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j4 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {
						j4 = 0;

						i = i - 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					}
				}
			});
			toggle4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j5 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j5 = 0;

						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					}
				}
			});
			toggle5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j6 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j6 = 0;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					}
				}
			});

			toggle6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j7 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						j7 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j8 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j8 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j9 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j9 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j10 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j10 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j11 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j11 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j12 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j12 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j13 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j13 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j14 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j14 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j15 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j15 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j16 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j16 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j17 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j17 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j18 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j18 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j19 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j19 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j20 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j20 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j21 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j21 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j22 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j22 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j23 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j23 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j24 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j24 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j25 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j25 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j26 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j26 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j27 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j27 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j28 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j28 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
			toggle28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					TextView tv = (TextView) findViewById(R.id.tvi);
					if (isChecked) {
						// The toggle is enabled
						i = i + 1;
						j29 = 1;
						tv.setText("Kursi yang sudah dipilih : " + i);
						aktivasiTombol();
					} else {

						i = i - 1;
						j29 = 0;
						aktivasiTombol();
						tv.setText("Kursi yang sudah dipilih : " + i);
					}
				}
			});
		
		}
	}

	public void tes() {

		i1 = j1;
		i2 = j2;
		i3 = j3;
		i4 = j4;
		i5 = j5;
		i6 = j6;
		i7 = j7;
		i8 = j8;
		i9 = j9;
		i10 = j10;
		i11 = j11;
		i12 = j12;
		i13 = j13;
		i14 = j14;
		i15 = j15;
		i16 = j16;
		i17 = j17;
		i18 = j18;
		i19 = j19;
		i20 = j20;
		i21 = j21;
		i22 = j22;
		i23 = j23;
		i24 = j24;
		i25 = j25;
		i26 = j26;
		i27 = j27;
		i28 = j28;
		i29 = j29;
		
	}
}
