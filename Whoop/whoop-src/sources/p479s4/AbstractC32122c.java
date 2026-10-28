package p479s4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.LocaleManagerCompat;
import androidx.core.app.NotificationManagerCompat;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import p029b5.C2728g;
import p088dc.AbstractC11895b;
import p107e3.AbstractC12602c;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34515c;
import p513u4.AbstractC34523k;
import p513u4.C34521i;
import p513u4.C34522j;
import p550vd.AbstractC35902e;

/* JADX INFO: renamed from: s4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC32122c {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? AbstractC12602c.m35319a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC12602c.m35320b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return context.getCodeCacheDir();
    }

    public static int getColor(Context context, int i13) {
        return context.getColor(i13);
    }

    public static ColorStateList getColorStateList(Context context, int i13) {
        ColorStateList colorStateListM109081a;
        ColorStateList colorStateList;
        C34521i c34521i;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C34522j c34522j = new C34522j(resources, theme);
        synchronized (AbstractC34523k.f145119c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC34523k.f145118b.get(c34522j);
                colorStateListM109081a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c34521i = (C34521i) sparseArray.get(i13)) == null) {
                    colorStateList = null;
                } else {
                    if (c34521i.f145113b.equals(resources.getConfiguration())) {
                        if (theme != null || c34521i.f145114c != 0) {
                            if (theme == null || c34521i.f145114c != theme.hashCode()) {
                            }
                        }
                        colorStateList = c34521i.f145112a;
                    }
                    sparseArray.remove(i13);
                    colorStateList = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i13, typedValue, true);
        int i14 = typedValue.type;
        if (i14 < 28 || i14 > 31) {
            try {
                colorStateListM109081a = AbstractC34515c.m109081a(resources, resources.getXml(i13), theme);
            } catch (Exception e5) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e5);
            }
        }
        if (colorStateListM109081a == null) {
            return AbstractC34514b.m109069e(resources, i13, theme);
        }
        synchronized (AbstractC34523k.f145119c) {
            try {
                WeakHashMap weakHashMap = AbstractC34523k.f145118b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c34522j);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c34522j, sparseArray2);
                }
                sparseArray2.append(i13, new C34521i(colorStateListM109081a, c34522j.f145115a.getConfiguration(), theme));
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return colorStateListM109081a;
    }

    public static Context getContextForLanguage(Context context) {
        C2728g applicationLocales = LocaleManagerCompat.getApplicationLocales(context);
        if (Build.VERSION.SDK_INT > 32 || applicationLocales.m7701c()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        AbstractC35902e.m113959c0(configuration, applicationLocales);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return context.getDataDir();
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? AbstractC12602c.m35321c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i13) {
        return context.getDrawable(i13);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return AbstractC32121b.m100004i(context);
    }

    public static File getNoBackupFilesDir(Context context) {
        return context.getNoBackupFilesDir();
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i13) {
        return getContextForLanguage(context).getString(i13);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (AbstractC32131l.m100073e(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(AbstractC11895b.m31996o("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i13) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i13);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        AbstractC32120a.m99986l(context, intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i13) {
        int i14 = i13 & 1;
        if (i14 != 0 && (i13 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i14 != 0) {
            i13 |= 2;
        }
        int i15 = i13;
        int i16 = i15 & 2;
        if (i16 == 0 && (i15 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i16 == 0 || (i15 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i15) : AbstractC32120a.m99983i(context, broadcastReceiver, intentFilter, str, handler, i15);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
