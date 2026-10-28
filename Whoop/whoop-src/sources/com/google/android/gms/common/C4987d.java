package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.PendingIntentCompat;
import java.util.concurrent.atomic.AtomicBoolean;
import p014aj.C0929d;
import p035bp.C3512c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: com.google.android.gms.common.d */
/* JADX INFO: loaded from: classes.dex */
public class C4987d {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final String TRACKING_SOURCE_DIALOG = "d";
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final C4987d zza;

    static {
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
        zza = new C4987d();
    }

    public static C4987d getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        if (AbstractC4988e.f20525a.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e5) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e5);
        }
    }

    public int getApkVersion(Context context) {
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public Intent getErrorResolutionIntent(int i13) {
        return getErrorResolutionIntent(null, i13, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i13, int i14, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i13, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntentCompat.getActivity(context, i14, errorResolutionIntent, 134217728, false);
    }

    public int isGooglePlayServicesAvailable(Context context, int i13) {
        int iM15612a = AbstractC4988e.m15612a(context, i13);
        boolean zM15613b = true;
        if (iM15612a != 18) {
            zM15613b = iM15612a == 1 ? AbstractC4988e.m15613b(context, "com.google.android.gms") : false;
        }
        if (zM15613b) {
            return 18;
        }
        return iM15612a;
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i13) {
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        if (i13 == 18) {
            return true;
        }
        if (i13 == 1) {
            return AbstractC4988e.m15613b(context, "com.google.android.gms");
        }
        return false;
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int i13) {
        if (i13 == 9) {
            return AbstractC4988e.m15613b(context, GOOGLE_PLAY_STORE_PACKAGE);
        }
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        return false;
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return AbstractC4988e.m15613b(context, str);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int i13) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        int iIsGooglePlayServicesAvailable = getInstance().isGooglePlayServicesAvailable(context, i13);
        if (iIsGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            StringBuilder sb4 = new StringBuilder(String.valueOf(iIsGooglePlayServicesAvailable).length() + 46);
            sb4.append("GooglePlayServices not available due to error ");
            sb4.append(iIsGooglePlayServicesAvailable);
            Log.e("GooglePlayServicesUtil", sb4.toString());
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException();
            }
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
    }

    public Intent getErrorResolutionIntent(Context context, int i13, String str) {
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && AbstractC40909b.m132601c(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb4 = new StringBuilder("gcore_");
        sb4.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb4.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb4.append(str);
        }
        sb4.append("-");
        if (context != null) {
            sb4.append(context.getPackageName());
        }
        sb4.append("-");
        if (context != null) {
            try {
                C0929d c0929dM10398a = C3512c.m10398a(context);
                sb4.append(((Context) c0929dM10398a.f3422w).getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb4.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage(GOOGLE_PLAY_STORE_PACKAGE);
        intent3.addFlags(524288);
        return intent3;
    }
}
