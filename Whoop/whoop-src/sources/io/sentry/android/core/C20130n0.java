package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import bd3.C3130k;
import bd3.C3142u;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.internal.util.C20105f;
import io.sentry.android.core.internal.util.C20109j;
import io.sentry.protocol.C20476f;
import io.sentry.protocol.C20492p;
import io.sentry.protocol.EnumC20474e;
import io.sentry.util.C20579a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.android.core.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20130n0 {

    /* JADX INFO: renamed from: i */
    public static volatile C20130n0 f75615i;

    /* JADX INFO: renamed from: j */
    public static final C20579a f75616j = new C20579a();

    /* JADX INFO: renamed from: a */
    public final Context f75617a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f75618b;

    /* JADX INFO: renamed from: c */
    public final C20121k0 f75619c;

    /* JADX INFO: renamed from: d */
    public final Boolean f75620d;

    /* JADX INFO: renamed from: e */
    public final C3142u f75621e;

    /* JADX INFO: renamed from: f */
    public final C3130k f75622f;

    /* JADX INFO: renamed from: g */
    public final C20492p f75623g;

    /* JADX INFO: renamed from: h */
    public final Long f75624h;

    public C20130n0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        C3142u c3142u;
        C3130k c3130k;
        Bundle bundle;
        this.f75617a = context;
        this.f75618b = sentryAndroidOptions;
        this.f75619c = new C20121k0(sentryAndroidOptions.getLogger());
        C20105f.f75530c.m55999a();
        C20492p c20492p = new C20492p();
        c20492p.f76751w = "Android";
        c20492p.f76752x = Build.VERSION.RELEASE;
        c20492p.f76754z = Build.DISPLAY;
        InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    property = line;
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e5) {
                logger.mo16060j(EnumC20436n5.ERROR, "Exception while attempting to read kernel information", e5);
            }
        }
        if (property != null) {
            c20492p.f76748E = property;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            c20492p.f76749F = Boolean.valueOf(new C20109j(this.f75617a, sentryAndroidOptions.getLogger(), this.f75619c).m56002a());
        }
        this.f75623g = c20492p;
        this.f75620d = this.f75619c.m56021a();
        InterfaceC20602v0 logger2 = sentryAndroidOptions.getLogger();
        boolean z4 = false;
        try {
            PackageInfo packageInfoM56012f = AbstractC20118j0.m56012f(context, this.f75619c);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoM56012f == null || packageManager == null) {
                c3142u = null;
            } else {
                str = packageInfoM56012f.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    c3142u = new C3142u(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    logger2.mo16066m(EnumC20436n5.DEBUG, "%s package isn't installed.", str);
                    c3142u = null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        this.f75621e = c3142u;
        C20121k0 c20121k0 = this.f75619c;
        c20121k0.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) AbstractC20118j0.f75582d.m56072b(context) : (ApplicationInfo) AbstractC20118j0.f75583e.m56072b(context);
        PackageInfo packageInfoM56012f2 = AbstractC20118j0.m56012f(context, c20121k0);
        if (packageInfoM56012f2 != null) {
            String[] strArr = packageInfoM56012f2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z4 = bundle.getBoolean("com.android.vending.splits.required");
            }
            c3130k = new C3130k(z4, strArr);
        } else {
            c3130k = null;
        }
        this.f75622f = c3130k;
        ActivityManager.MemoryInfo memoryInfoM56010d = AbstractC20118j0.m56010d(context, sentryAndroidOptions.getLogger());
        if (memoryInfoM56010d != null) {
            this.f75624h = Long.valueOf(memoryInfoM56010d.totalMem);
        } else {
            this.f75624h = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Float m56030b(Intent intent, C20513q6 c20513q6) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting device battery level.", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C20130n0 m56031c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f75615i == null) {
            C20535s c20535sM56711a = f75616j.m56711a();
            try {
                if (f75615i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f75615i = new C20130n0(context, sentryAndroidOptions);
                }
                c20535sM56711a.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        return f75615i;
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m56032d(Intent intent, C20513q6 c20513q6) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z4 = true;
            if (intExtra != 1 && intExtra != 2) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting device charging state.", th3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247 A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:97:0x023f, B:100:0x0247, B:102:0x024d, B:104:0x0251, B:113:0x0269, B:108:0x0258, B:111:0x025f, B:117:0x027c, B:114:0x026c), top: B:140:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:101:0x024c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0251 A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:97:0x023f, B:100:0x0247, B:102:0x024d, B:104:0x0251, B:113:0x0269, B:108:0x0258, B:111:0x025f, B:117:0x027c, B:114:0x026c), top: B:140:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0255  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:114:0x026c A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:97:0x023f, B:100:0x0247, B:102:0x024d, B:104:0x0251, B:113:0x0269, B:108:0x0258, B:111:0x025f, B:117:0x027c, B:114:0x026c), top: B:140:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:117:0x027c A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #2 {all -> 0x0286, blocks: (B:97:0x023f, B:100:0x0247, B:102:0x024d, B:104:0x0251, B:113:0x0269, B:108:0x0258, B:111:0x025f, B:117:0x027c, B:114:0x026c), top: B:140:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0293  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144  */
    /* JADX WARN: Code duplicated, block: B:60:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0184  */
    /* JADX WARN: Code duplicated, block: B:63:0x018a  */
    /* JADX WARN: Code duplicated, block: B:66:0x019f A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #3 {all -> 0x01a8, blocks: (B:64:0x0196, B:66:0x019f), top: B:142:0x0196 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x023b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245 A[DONT_INVERT] */
    /* JADX INFO: renamed from: a */
    public final C20476f m56033a(boolean z4, boolean z13) {
        EnumC20474e enumC20474e;
        Boolean bool;
        InterfaceC20602v0 logger;
        DisplayMetrics displayMetrics;
        Date dateM60660P;
        LocaleList locales;
        TimeZone timeZone;
        String strM56061a;
        Locale locale;
        ArrayList arrayListM55999a;
        boolean zIsCollectExternalStorageContext;
        IntentFilter intentFilter;
        Intent intentRegisterReceiver;
        int i13;
        Boolean bool2;
        ActivityManager.MemoryInfo memoryInfoM56010d;
        File dataDirectory;
        File externalFilesDir;
        StatFs statFs;
        Long lValueOf;
        File[] externalFilesDirs;
        File file;
        String absolutePath;
        int length;
        int i14;
        Long lValueOf2;
        Long lValueOf3;
        Float fValueOf;
        int intExtra;
        EnumC20474e enumC20474e2;
        Context context = this.f75617a;
        C20476f c20476f = new C20476f();
        c20476f.f76675x = Build.MANUFACTURER;
        c20476f.f76676y = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.f75618b;
        c20476f.f76677z = AbstractC20118j0.m56009c(sentryAndroidOptions.getLogger());
        c20476f.f76643E = Build.MODEL;
        c20476f.f76644F = Build.ID;
        c20476f.f76645G = Build.SUPPORTED_ABIS;
        this.f75619c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            c20476f.f76672h0 = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Long lValueOf4 = null;
        try {
            int i15 = context.getResources().getConfiguration().orientation;
            try {
                try {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            enumC20474e = null;
                        } else {
                            enumC20474e2 = EnumC20474e.LANDSCAPE;
                        }
                        if (enumC20474e == null) {
                            try {
                                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                enumC20474e = null;
                            } catch (Throwable th3) {
                                th = th3;
                                sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting device orientation.", th);
                            }
                        }
                        c20476f.f76649K = enumC20474e;
                        bool = this.f75620d;
                        if (bool != null) {
                            c20476f.f76650L = bool;
                        }
                        logger = sentryAndroidOptions.getLogger();
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            c20476f.f76659U = Integer.valueOf(displayMetrics.widthPixels);
                            c20476f.f76660V = Integer.valueOf(displayMetrics.heightPixels);
                            c20476f.f76661W = Float.valueOf(displayMetrics.density);
                            c20476f.f76662X = Integer.valueOf(displayMetrics.densityDpi);
                        }
                        dateM60660P = AbstractC21598x.m60660P(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        c20476f.f76663Y = dateM60660P;
                        locales = context.getResources().getConfiguration().getLocales();
                        if (locales.isEmpty()) {
                            timeZone = Calendar.getInstance().getTimeZone();
                        } else {
                            timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                        }
                        c20476f.f76664Z = timeZone;
                        if (c20476f.f76665a0 == null) {
                            try {
                                strM56061a = AbstractC20157t0.m56061a(context);
                            } catch (Throwable th4) {
                                sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting installationId.", th4);
                                strM56061a = null;
                            }
                            c20476f.f76665a0 = strM56061a;
                        }
                        locale = Locale.getDefault();
                        if (c20476f.f76666b0 == null) {
                            c20476f.f76666b0 = locale.toString();
                        }
                        arrayListM55999a = C20105f.f75530c.m55999a();
                        if (!arrayListM55999a.isEmpty()) {
                            c20476f.f76670f0 = Double.valueOf(((Integer) Collections.max(arrayListM55999a)).doubleValue());
                            c20476f.f76669e0 = Integer.valueOf(arrayListM55999a.size());
                        }
                        c20476f.f76651M = this.f75624h;
                        if (z4 && sentryAndroidOptions.isCollectAdditionalContext()) {
                            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                            if (Build.VERSION.SDK_INT >= 33) {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                            } else {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                            }
                            if (intentRegisterReceiver != null) {
                                c20476f.f76646H = m56030b(intentRegisterReceiver, sentryAndroidOptions);
                                c20476f.f76647I = m56032d(intentRegisterReceiver, sentryAndroidOptions);
                                try {
                                    intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                    if (intExtra != -1) {
                                        fValueOf = Float.valueOf(intExtra / 10.0f);
                                    } else {
                                        fValueOf = null;
                                    }
                                } catch (Throwable th5) {
                                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting battery temperature.", th5);
                                }
                                c20476f.f76668d0 = fValueOf;
                            }
                            i13 = AbstractC20127m0.f75611a[sentryAndroidOptions.getConnectionStatusProvider().mo55992l().ordinal()];
                            if (i13 != 1) {
                                bool2 = Boolean.FALSE;
                            } else if (i13 != 2) {
                                bool2 = null;
                            } else {
                                bool2 = Boolean.TRUE;
                            }
                            c20476f.f76648J = bool2;
                            memoryInfoM56010d = AbstractC20118j0.m56010d(context, sentryAndroidOptions.getLogger());
                            if (memoryInfoM56010d != null && z13) {
                                c20476f.f76652N = Long.valueOf(memoryInfoM56010d.availMem);
                                c20476f.f76654P = Boolean.valueOf(memoryInfoM56010d.lowMemory);
                            }
                            dataDirectory = Environment.getDataDirectory();
                            if (dataDirectory != null) {
                                StatFs statFs2 = new StatFs(dataDirectory.getPath());
                                try {
                                    lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th6) {
                                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting total internal storage amount.", th6);
                                    lValueOf2 = null;
                                }
                                c20476f.f76655Q = lValueOf2;
                                try {
                                    lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th7) {
                                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting unused internal storage amount.", th7);
                                    lValueOf3 = null;
                                }
                                c20476f.f76656R = lValueOf3;
                            }
                            if (zIsCollectExternalStorageContext) {
                                externalFilesDir = context.getExternalFilesDir(null);
                                try {
                                    externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs != null) {
                                        if (externalFilesDir != null) {
                                            absolutePath = externalFilesDir.getAbsolutePath();
                                        } else {
                                            absolutePath = null;
                                        }
                                        length = externalFilesDirs.length;
                                        i14 = 0;
                                        while (true) {
                                            if (i14 >= length) {
                                                file = externalFilesDirs[i14];
                                                if (file != null) {
                                                    if (absolutePath != null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                                        break;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                i14++;
                                            }
                                        }
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            statFs = null;
                                        }
                                        if (statFs != null) {
                                            try {
                                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th8) {
                                                sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting total external storage amount.", th8);
                                                lValueOf = null;
                                            }
                                            c20476f.f76657S = lValueOf;
                                            try {
                                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th9) {
                                                sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting unused external storage amount.", th9);
                                            }
                                            c20476f.f76658T = lValueOf4;
                                        }
                                    } else {
                                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                    }
                                    file = null;
                                    if (file != null) {
                                        statFs = new StatFs(file.getPath());
                                    } else {
                                        statFs = null;
                                    }
                                } catch (Throwable unused) {
                                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "Not possible to read external files directory", new Object[0]);
                                }
                                if (statFs != null) {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    c20476f.f76657S = lValueOf;
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    c20476f.f76658T = lValueOf4;
                                }
                            }
                            if (c20476f.f76667c0 == null) {
                                c20476f.f76667c0 = sentryAndroidOptions.getConnectionStatusProvider().mo55985G();
                            }
                        }
                        return c20476f;
                    }
                    enumC20474e2 = EnumC20474e.PORTRAIT;
                    displayMetrics = context.getResources().getDisplayMetrics();
                } catch (Throwable th10) {
                    logger.mo16060j(EnumC20436n5.ERROR, "Error getting DisplayMetrics.", th10);
                    displayMetrics = null;
                }
                dateM60660P = AbstractC21598x.m60660P(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            } catch (IllegalArgumentException e5) {
                sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.ERROR, e5, "Error getting the device's boot time.", new Object[0]);
                dateM60660P = null;
            }
            enumC20474e = enumC20474e2;
            if (enumC20474e == null) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                enumC20474e = null;
            }
        } catch (Throwable th11) {
            th = th11;
            enumC20474e = null;
        }
        c20476f.f76649K = enumC20474e;
        bool = this.f75620d;
        if (bool != null) {
            c20476f.f76650L = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            c20476f.f76659U = Integer.valueOf(displayMetrics.widthPixels);
            c20476f.f76660V = Integer.valueOf(displayMetrics.heightPixels);
            c20476f.f76661W = Float.valueOf(displayMetrics.density);
            c20476f.f76662X = Integer.valueOf(displayMetrics.densityDpi);
        }
        c20476f.f76663Y = dateM60660P;
        locales = context.getResources().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
        } else {
            timeZone = Calendar.getInstance().getTimeZone();
        }
        c20476f.f76664Z = timeZone;
        if (c20476f.f76665a0 == null) {
            strM56061a = AbstractC20157t0.m56061a(context);
            c20476f.f76665a0 = strM56061a;
        }
        locale = Locale.getDefault();
        if (c20476f.f76666b0 == null) {
            c20476f.f76666b0 = locale.toString();
        }
        arrayListM55999a = C20105f.f75530c.m55999a();
        if (!arrayListM55999a.isEmpty()) {
            c20476f.f76670f0 = Double.valueOf(((Integer) Collections.max(arrayListM55999a)).doubleValue());
            c20476f.f76669e0 = Integer.valueOf(arrayListM55999a.size());
        }
        c20476f.f76651M = this.f75624h;
        if (z4) {
            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
            } else {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
            }
            if (intentRegisterReceiver != null) {
                c20476f.f76646H = m56030b(intentRegisterReceiver, sentryAndroidOptions);
                c20476f.f76647I = m56032d(intentRegisterReceiver, sentryAndroidOptions);
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                c20476f.f76668d0 = fValueOf;
            }
            i13 = AbstractC20127m0.f75611a[sentryAndroidOptions.getConnectionStatusProvider().mo55992l().ordinal()];
            if (i13 != 1) {
                bool2 = Boolean.FALSE;
            } else if (i13 != 2) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            c20476f.f76648J = bool2;
            memoryInfoM56010d = AbstractC20118j0.m56010d(context, sentryAndroidOptions.getLogger());
            if (memoryInfoM56010d != null) {
                c20476f.f76652N = Long.valueOf(memoryInfoM56010d.availMem);
                c20476f.f76654P = Boolean.valueOf(memoryInfoM56010d.lowMemory);
            }
            dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                StatFs statFs3 = new StatFs(dataDirectory.getPath());
                lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                c20476f.f76655Q = lValueOf2;
                lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                c20476f.f76656R = lValueOf3;
            }
            if (zIsCollectExternalStorageContext) {
                externalFilesDir = context.getExternalFilesDir(null);
                externalFilesDirs = context.getExternalFilesDirs(null);
                if (externalFilesDirs != null) {
                    if (externalFilesDir != null) {
                        absolutePath = externalFilesDir.getAbsolutePath();
                    } else {
                        absolutePath = null;
                    }
                    length = externalFilesDirs.length;
                    i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            file = externalFilesDirs[i14];
                            if (file != null) {
                                if (absolutePath != null) {
                                    break;
                                }
                            }
                            i14++;
                        }
                    }
                    if (file != null) {
                        statFs = new StatFs(file.getPath());
                    } else {
                        statFs = null;
                    }
                    if (statFs != null) {
                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        c20476f.f76657S = lValueOf;
                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        c20476f.f76658T = lValueOf4;
                    }
                } else {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                }
                file = null;
                if (file != null) {
                    statFs = new StatFs(file.getPath());
                } else {
                    statFs = null;
                }
                if (statFs != null) {
                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                    c20476f.f76657S = lValueOf;
                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                    c20476f.f76658T = lValueOf4;
                }
            }
            if (c20476f.f76667c0 == null) {
                c20476f.f76667c0 = sentryAndroidOptions.getConnectionStatusProvider().mo55985G();
            }
        }
        return c20476f;
    }
}
