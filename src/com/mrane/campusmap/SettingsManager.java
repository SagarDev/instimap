package com.mrane.campusmap;

import in.designlabs.instimap.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceManager;

public class SettingsManager implements OnSharedPreferenceChangeListener{
	private SharedPreferences sharedPrefs;
	private String muteKey;
	private String residencesKey;
	private String lastUpdatedKey;
	private String convoKey;
	private MapActivity mainActivity;
	
	public SettingsManager(Context context){
		sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
		sharedPrefs.registerOnSharedPreferenceChangeListener(this);
		mainActivity = MapActivity.getMainActivity();
		Resources res = context.getResources();
		muteKey = res.getString(R.string.setting_mute_key);
		residencesKey = res.getString(R.string.setting_residences_key);
		lastUpdatedKey = res.getString(R.string.settings_last_updated_key);
		convoKey = res.getString(R.string.setting_convo_key);
	}
	
	public boolean isMuted(){
		return sharedPrefs.getBoolean(muteKey, false);
	}
	
	public boolean isInConvoMode(){
		return sharedPrefs.getBoolean(convoKey, true);
	}
	
	public boolean showResidences(){
		return sharedPrefs.getBoolean(residencesKey, true);
	}

	public void setMuted(boolean mute){
		sharedPrefs.edit().putBoolean(muteKey, mute).commit();
	}
	
	public void setShowResidences(boolean show){
		sharedPrefs.edit().putBoolean(residencesKey, show).commit();
	}
	
	public SharedPreferences getSharedPrefs(){
		return sharedPrefs;
	}

	public long getLastUpdatedOn() {
		return sharedPrefs.getLong(lastUpdatedKey, 0);
	}

	public void setLastUpdatedOn(long lastUpdatedOn) {
		sharedPrefs.edit().putLong(lastUpdatedKey, lastUpdatedOn).commit();
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences prefs, String key) {
		
		if(key.equals(convoKey)){
			mainActivity.setConvocationMode(prefs.getBoolean(key, true));
		}
	}

	
}
