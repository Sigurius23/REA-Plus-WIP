package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import jp.HandlerC21846d;

/* JADX INFO: renamed from: com.google.android.gms.common.i */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerC4992i extends HandlerC21846d {

    /* JADX INFO: renamed from: a */
    public final Context f20539a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GoogleApiAvailability f20540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4992i(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f20540b = googleApiAvailability;
        this.f20539a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i13 = message.what;
        if (i13 != 1) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 39);
            sb4.append("Don't know how to handle this message: ");
            sb4.append(i13);
            Log.w("GoogleApiAvailability", sb4.toString());
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f20540b;
        Context context = this.f20539a;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            googleApiAvailability.showErrorNotification(context, iIsGooglePlayServicesAvailable);
        }
    }
}
