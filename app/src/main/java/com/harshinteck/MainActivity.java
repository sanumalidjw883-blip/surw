package com.harsh.tek.in.app;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.unity3d.ads.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.jetbrains.kotlin.*;
import org.json.*;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.ads.UnityAds;

public class MainActivity extends AppCompatActivity {
	
	private String fontName = "";
	private String typeace = "";
	
	private ArrayList<HashMap<String, Object>> Maps = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ImageView imageview9;
	private LinearLayout linear4;
	private LinearLayout linear34;
	private LinearLayout linear29;
	private LinearLayout Mane;
	private ImageView imageview5;
	private LinearLayout linear33;
	private LinearLayout linear39;
	private LinearLayout linear36;
	private LinearLayout Harsh1;
	private LinearLayout Harsh2;
	private TextView textview7;
	private TextView country;
	private TextView textview29;
	private TextView region;
	private LinearLayout Harsh3;
	private LinearLayout Harsh4;
	private TextView textview28;
	private TextView city;
	private TextView sss;
	private TextView IP;
	private LinearLayout linear6;
	private LinearLayout linear35;
	private LinearLayout Vpn;
	private TextView textview4;
	private TextView vpnonoff;
	private TextView textview23;
	private TextView textview26;
	private Button button1;
	private Button button2;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private ImageView imageview6;
	private TextView textview31;
	private ImageView imageview7;
	private TextView textview33;
	
	private Intent i = new Intent();
	private RequestNetwork raq;
	private RequestNetwork.RequestListener _raq_request_listener;
	private Intent Harsh_Tek = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		imageview9 = findViewById(R.id.imageview9);
		linear4 = findViewById(R.id.linear4);
		linear34 = findViewById(R.id.linear34);
		linear29 = findViewById(R.id.linear29);
		Mane = findViewById(R.id.Mane);
		imageview5 = findViewById(R.id.imageview5);
		linear33 = findViewById(R.id.linear33);
		linear39 = findViewById(R.id.linear39);
		linear36 = findViewById(R.id.linear36);
		Harsh1 = findViewById(R.id.Harsh1);
		Harsh2 = findViewById(R.id.Harsh2);
		textview7 = findViewById(R.id.textview7);
		country = findViewById(R.id.country);
		textview29 = findViewById(R.id.textview29);
		region = findViewById(R.id.region);
		Harsh3 = findViewById(R.id.Harsh3);
		Harsh4 = findViewById(R.id.Harsh4);
		textview28 = findViewById(R.id.textview28);
		city = findViewById(R.id.city);
		sss = findViewById(R.id.sss);
		IP = findViewById(R.id.IP);
		linear6 = findViewById(R.id.linear6);
		linear35 = findViewById(R.id.linear35);
		Vpn = findViewById(R.id.Vpn);
		textview4 = findViewById(R.id.textview4);
		vpnonoff = findViewById(R.id.vpnonoff);
		textview23 = findViewById(R.id.textview23);
		textview26 = findViewById(R.id.textview26);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		imageview6 = findViewById(R.id.imageview6);
		textview31 = findViewById(R.id.textview31);
		imageview7 = findViewById(R.id.imageview7);
		textview33 = findViewById(R.id.textview33);
		raq = new RequestNetwork(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				UnityAds.load("Interstitial_Android", loadListener);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				UnityAds.load("Rewarded_Android", loadListener);
			}
		});
		
		linear37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Harsh_Tek.setAction(Intent.ACTION_VIEW);
				Harsh_Tek.setData(Uri.parse("https://wa.me/+917755046047"));
				Harsh_Tek.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(Harsh_Tek);
			}
		});
		
		linear38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Harsh_Tek.setAction(Intent.ACTION_VIEW);
				Harsh_Tek.setData(Uri.parse("https://telegram.me/Harsh_Tek_Official"));
				Harsh_Tek.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(Harsh_Tek);
			}
		});
		
		_raq_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					Maps = new Gson().fromJson("[".concat(_response.concat("]")), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					city.setText(Maps.get((int)0).get("city").toString());
					country.setText(Maps.get((int)0).get("country").toString());
					region.setText(Maps.get((int)0).get("region").toString());
					IP.setText(Maps.get((int)0).get("ip").toString());
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "Error!");
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		_DARK_ICONS();
		_setNavigationBarColor(0xFFECEFF1);
		_changeActivityFont("google");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFECEFF1);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				Harsh1.setElevation(d*7);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				Harsh1.setBackground(SketchUiRD);
				Harsh1.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				Harsh2.setElevation(d*7);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				Harsh2.setBackground(SketchUiRD);
				Harsh2.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				Harsh3.setElevation(d*7);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				Harsh3.setBackground(SketchUiRD);
				Harsh3.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				Harsh4.setElevation(d*7);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				Harsh4.setBackground(SketchUiRD);
				Harsh4.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				linear35.setElevation(d*0);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				linear35.setBackground(SketchUiRD);
				linear35.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				linear37.setElevation(d*0);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				linear37.setBackground(SketchUiRD);
				linear37.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				linear38.setElevation(d*0);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				linear38.setBackground(SketchUiRD);
				linear38.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFECEFF1,0xFFECEFF1};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*5);
				SketchUi.setStroke(d*2,0xFFCFD8DC);
				Vpn.setElevation(d*7);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				Vpn.setBackground(SketchUiRD);
				Vpn.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFF29B6F6,0xFF039BE5};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*14);
				SketchUi.setStroke(d*0,0xFFCFD8DC);
				button1.setElevation(d*7);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				button1.setBackground(SketchUiRD);
				button1.setClickable(true);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				int clrs [] = {0xFFE57373,0xFFF44336};
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, clrs);
				SketchUi.setCornerRadius(d*14);
				SketchUi.setStroke(d*0,0xFFCFD8DC);
				button2.setElevation(d*7);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.TRANSPARENT}), SketchUi, null);
				button2.setBackground(SketchUiRD);
				button2.setClickable(true);
		}
		UnityAds.initialize(getApplicationContext(), "6024242", false, new IUnityAdsInitializationListener() {
			@Override
			public void onInitializationComplete() {
				 
			}
			@Override
			public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String HarshTek) {
				 
			}
		});
		raq.startRequestNetwork(RequestNetworkController.GET, "https://ipinfo.io/geo", "", _raq_request_listener);
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		boolean TechnoSahil = false;
		try{
				android.net.ConnectivityManager cm = (android.net.ConnectivityManager) getApplicationContext().getSystemService(android.content.Context.CONNECTIVITY_SERVICE);
				
				Network activeNetwork = cm.getActiveNetwork();
				NetworkCapabilities caps = cm.getNetworkCapabilities(activeNetwork);
				
			TechnoSahil = caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN);
		}catch(Exception e){
				showMessage(e.toString());
		}
		if (TechnoSahil) {
				vpnonoff.setText("ON");
			vpnonoff.setTextColor(0xFF4CAF50);
		}
		else {
				vpnonoff.setText("OFF");
			vpnonoff.setTextColor(0xFFF44336);
		}
	}
	public void _Unity_By_Harsh_Tek() {
	}private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
		@Override
		public void onUnityAdsAdLoaded(String placementId) {
			UnityAds.show(MainActivity.this, placementId, new UnityAdsShowOptions(), showListener);
		}
		@Override
		public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String HarshTek) {
			SketchwareUtil.showMessage(getApplicationContext(), "Ads/Not Load Please Wait");
		}
	};
	private IUnityAdsShowListener showListener = new IUnityAdsShowListener() {
		@Override
		public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String HarshTek) {
			SketchwareUtil.showMessage(getApplicationContext(), "Ads/Not Load Please Wait");
		}
		@Override
		public void onUnityAdsShowStart(String placementId) {
			 
		}
		@Override
		public void onUnityAdsShowClick(String placementId) {
			 
		}
		@Override
		public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
			if (state.equals(UnityAds.UnityAdsShowCompletionState.COMPLETED)) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ads/Completed");
			} else {
				SketchwareUtil.showMessage(getApplicationContext(), "Ads Skipped");
			}
		}
	};
	//Blocks are made By Harsh Tek
	{
	}
	
	
	public void _DARK_ICONS() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		linear1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
	}
	
	
	public void _changeActivityFont(final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	public void _setNavigationBarColor(final int _color) {
		Window w = getWindow();
		w.setNavigationBarColor(_color);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}