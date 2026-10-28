package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import jp.HandlerC21846d;
import p031b9.AbstractC2875y;
import p529uo.AbstractC35135w;
import to.C33971f;

/* JADX INFO: loaded from: classes6.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: w */
    public int f20485w = 0;

    /* JADX INFO: renamed from: a */
    public static Intent m15590a(Context context, PendingIntent pendingIntent, int i13, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i13);
        intent.putExtra("notify_manager", z4);
        return intent;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i13 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f20485w = 0;
            setResult(i14, intent);
            if (booleanExtra) {
                C33971f c33971fM107429e = C33971f.m107429e(this);
                if (i14 == -1) {
                    HandlerC21846d handlerC21846d = c33971fM107429e.f142427N;
                    handlerC21846d.sendMessage(handlerC21846d.obtainMessage(3));
                } else if (i14 == 0) {
                    c33971fM107429e.m107435i(new C4969a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i13 == 2) {
            this.f20485w = 0;
            setResult(i14, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f20485w = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f20485w = bundle.getInt("resolution");
        }
        if (this.f20485w == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            AbstractC35135w.m111094f(num);
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
            this.f20485w = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f20485w = 1;
            } catch (ActivityNotFoundException e5) {
                e = e5;
                if (extras.getBoolean("notify_manager", true)) {
                    C33971f.m107429e(this).m107435i(new C4969a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String string = pendingIntent.toString();
                    String strM8304q = AbstractC2875y.m8304q(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strM8304q = strM8304q.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strM8304q, e);
                }
                googleApiActivity.f20485w = 1;
                finish();
            } catch (IntentSender.SendIntentException e13) {
                e = e13;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e14) {
            e = e14;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e15) {
            e = e15;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f20485w);
        super.onSaveInstanceState(bundle);
    }
}
