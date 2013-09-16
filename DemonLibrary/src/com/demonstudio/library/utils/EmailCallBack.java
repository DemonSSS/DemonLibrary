package com.demonstudio.library.utils;

import java.net.URLEncoder;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import com.demonstudio.library.R;

public class EmailCallBack {

	public static void sendEmailFeedback(Activity activity) {
		final Intent email = new Intent(android.content.Intent.ACTION_SENDTO);
		String uriText = "mailto:demonsu1988@gmail.com" + "?subject="
				+ URLEncoder.encode("Feedback");
		email.setData(Uri.parse(uriText));
		try {
			activity.startActivity(email);
		} catch (Exception e) {
			Toast.makeText(activity, R.string.toast_email_feedcallback,
					Toast.LENGTH_SHORT).show();
		}
	}
}
