package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.whoop.android.R;
import com.whoop.service.network.model.UserState;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import live.hms.video.factories.MediaConstraintsFactory;
import no.nordicsemi.android.dfu.DfuBaseService;
import p035bp.C3512c;
import p529uo.AbstractC35135w;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: com.google.android.gms.common.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4988e {

    /* JADX INFO: renamed from: b */
    public static boolean f20526b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f20527c = false;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f20529e = 0;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f20525a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f20528d = new AtomicBoolean();

    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ac A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static int m15612a(Context context, int i13) {
        boolean z4;
        PackageInfo packageInfo;
        int i14;
        int i15;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f20528d.get()) {
            synchronized (AbstractC35135w.f149082a) {
                try {
                    if (!AbstractC35135w.f149083b) {
                        AbstractC35135w.f149083b = true;
                        try {
                            Bundle bundle = ((Context) C3512c.m10398a(context).f3422w).getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                AbstractC35135w.f149084c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e5);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            int i16 = AbstractC35135w.f149084c;
            if (i16 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i16 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i16);
            }
        }
        if (AbstractC40909b.m132601c(context)) {
            z4 = false;
        } else {
            if (AbstractC40909b.f176321d == null) {
                AbstractC40909b.f176321d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (AbstractC40909b.f176321d.booleanValue()) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        AbstractC35135w.m111089a(i13 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z4) {
            try {
                packageInfo = packageManager.getPackageInfo(C4987d.GOOGLE_PLAY_STORE_PACKAGE, 134225984);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            C4989f.m15614a(context);
            if (!C4989f.m15615c(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z4) {
                    if (z4) {
                    }
                    i14 = packageInfo2.versionCode;
                    if (i14 == -1) {
                        i15 = -1;
                    } else {
                        i15 = i14 / 1000;
                    }
                    if (i15 < (i13 != -1 ? i13 / 1000 : -1)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i13).length() + 11 + String.valueOf(i14).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i13);
                    sb4.append(" but found ");
                    sb4.append(i14);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
                    return 2;
                }
                AbstractC35135w.m111094f(packageInfo);
                if (!C4989f.m15615c(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z4 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i14 = packageInfo2.versionCode;
                        if (i14 == -1) {
                            i15 = -1;
                        } else {
                            i15 = i14 / 1000;
                        }
                        if (i15 < (i13 != -1 ? i13 / 1000 : -1)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e13) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e13);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        StringBuilder sb5 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i13).length() + 11 + String.valueOf(i14).length());
                        sb5.append("Google Play services out of date for ");
                        sb5.append(packageName);
                        sb5.append(".  Requires ");
                        sb5.append(i13);
                        sb5.append(" but found ");
                        sb5.append(i14);
                        Log.w("GooglePlayServicesUtil", sb5.toString());
                        return 2;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15613b(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, DfuBaseService.ERROR_REMOTE_MASK);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled) {
                return false;
            }
            Object systemService = context.getSystemService(UserState.Sources.USER);
            AbstractC35135w.m111094f(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions == null || !MediaConstraintsFactory.kValueTrue.equals(applicationRestrictions.getString("restricted_profile"));
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
