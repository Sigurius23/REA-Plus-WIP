package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes6.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: w */
    public ResultReceiver f21378w;

    @Override // android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i13, i14, intent);
        if (i13 == 0 && (resultReceiver = this.f21378w) != null) {
            if (i14 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i14 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.f21378w = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f21378w = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        PendingIntent pendingIntent = extras != null ? (PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            ResultReceiver resultReceiver = this.f21378w;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
            return;
        }
        try {
            playCoreDialogWrapperActivity = this;
            try {
                playCoreDialogWrapperActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver2 = playCoreDialogWrapperActivity.f21378w;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(3, new Bundle());
                }
                finish();
            }
        } catch (IntentSender.SendIntentException unused2) {
            playCoreDialogWrapperActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f21378w);
    }
}
