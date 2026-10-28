package p174gk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.common.AbstractC4988e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p108e4.AbstractC12682p;
import p114eb.C12968k;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15922a {

    /* JADX INFO: renamed from: a */
    public final String f60222a;

    /* JADX INFO: renamed from: b */
    public final String f60223b;

    /* JADX INFO: renamed from: c */
    public final String f60224c;

    /* JADX INFO: renamed from: d */
    public final String f60225d;

    /* JADX INFO: renamed from: e */
    public final String f60226e;

    /* JADX INFO: renamed from: f */
    public final String f60227f;

    /* JADX INFO: renamed from: g */
    public final String f60228g;

    /* JADX INFO: renamed from: h */
    public final String f60229h;

    /* JADX INFO: renamed from: i */
    public final String f60230i;

    /* JADX INFO: renamed from: j */
    public final String f60231j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C12968k f60232k;

    public C15922a(C12968k c12968k) {
        String string;
        String str;
        String networkOperatorName;
        String country;
        String networkCountryIso;
        Context context = (Context) c12968k.f44791c;
        this.f60232k = c12968k;
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC22676k.m65749i(RELEASE, "RELEASE");
        this.f60225d = RELEASE;
        String BRAND = Build.BRAND;
        AbstractC22676k.m65749i(BRAND, "BRAND");
        this.f60226e = BRAND;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC22676k.m65749i(MANUFACTURER, "MANUFACTURER");
        this.f60227f = MANUFACTURER;
        String MODEL = Build.MODEL;
        AbstractC22676k.m65749i(MODEL, "MODEL");
        this.f60228g = MODEL;
        String language = m44931a().getLanguage();
        AbstractC22676k.m65749i(language, "locale.language");
        this.f60230i = language;
        String str2 = null;
        if (!c12968k.f44789a) {
            string = null;
        } else if ("Amazon".equals(MANUFACTURER)) {
            ContentResolver contentResolver = context.getContentResolver();
            Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0);
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } else {
            try {
                Object objInvoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                Object objInvoke2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
                Boolean bool = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
                if (bool != null) {
                    bool.booleanValue();
                }
                Object objInvoke3 = objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                AbstractC22676k.m65748h(objInvoke3, "null cannot be cast to non-null type kotlin.String");
                string = (String) objInvoke3;
            } catch (ClassNotFoundException unused) {
                if (AbstractC12682p.m35482b(2, 3) <= 0) {
                    Log.w("Amplitude", "Google Play Services SDK not found for advertising id!");
                }
                string = null;
            } catch (InvocationTargetException unused2) {
                if (AbstractC12682p.m35482b(2, 3) <= 0) {
                    Log.w("Amplitude", "Google Play Services not available for advertising id");
                }
                string = null;
            } catch (Exception unused3) {
                if (AbstractC12682p.m35482b(2, 4) <= 0) {
                    Log.e("Amplitude", "Encountered an error connecting to Google Play Services for advertising id");
                }
                string = null;
            }
        }
        this.f60222a = string;
        Context context2 = (Context) this.f60232k.f44791c;
        try {
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            AbstractC22676k.m65749i(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused4) {
            str = null;
        }
        this.f60224c = str;
        try {
            Object systemService = ((Context) this.f60232k.f44791c).getSystemService("phone");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        } catch (Exception unused5) {
            networkOperatorName = null;
        }
        this.f60229h = networkOperatorName;
        try {
            Object systemService2 = ((Context) this.f60232k.f44791c).getSystemService("phone");
            AbstractC22676k.m65748h(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService2;
            if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                country = null;
            } else {
                Locale US = Locale.US;
                AbstractC22676k.m65749i(US, "US");
                country = networkCountryIso.toUpperCase(US);
                AbstractC22676k.m65749i(country, "this as java.lang.String).toUpperCase(locale)");
            }
        } catch (Exception unused6) {
        }
        if (country == null || country.length() == 0) {
            country = m44931a().getCountry();
            AbstractC22676k.m65749i(country, "locale.country");
        }
        this.f60223b = country;
        try {
            AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
            Object objInvoke4 = AbstractC4988e.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, (Context) this.f60232k.f44791c);
            Integer num = objInvoke4 instanceof Integer ? (Integer) objInvoke4 : null;
            if (num != null) {
                num.intValue();
            }
        } catch (ClassNotFoundException unused7) {
            if (AbstractC12682p.m35482b(2, 3) <= 0) {
                Log.w("Amplitude", "Google Play Services Util not found!");
            }
        } catch (IllegalAccessException unused8) {
            if (AbstractC12682p.m35482b(2, 3) <= 0) {
                Log.w("Amplitude", "Google Play Services not available");
            }
        } catch (Exception e5) {
            String message = "Error when checking for Google Play Services: " + e5;
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 3) <= 0) {
                Log.w("Amplitude", message);
            }
        } catch (NoClassDefFoundError unused9) {
            if (AbstractC12682p.m35482b(2, 3) <= 0) {
                Log.w("Amplitude", "Google Play Services Util not found!");
            }
        } catch (NoSuchMethodException unused10) {
            if (AbstractC12682p.m35482b(2, 3) <= 0) {
                Log.w("Amplitude", "Google Play Services not available");
            }
        } catch (InvocationTargetException unused11) {
            if (AbstractC12682p.m35482b(2, 3) <= 0) {
                Log.w("Amplitude", "Google Play Services not available");
            }
        }
        if (this.f60232k.f44790b) {
            try {
                Object objInvoke5 = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, (Context) this.f60232k.f44791c);
                Object objInvoke6 = Tasks.class.getMethod("await", Task.class).invoke(null, objInvoke5.getClass().getMethod("getAppSetIdInfo", null).invoke(objInvoke5, null));
                Object objInvoke7 = objInvoke6.getClass().getMethod("getId", null).invoke(objInvoke6, null);
                AbstractC22676k.m65748h(objInvoke7, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) objInvoke7;
            } catch (ClassNotFoundException unused12) {
                if (AbstractC12682p.m35482b(2, 3) <= 0) {
                    Log.w("Amplitude", "Google Play Services SDK not found for app set id!");
                }
            } catch (InvocationTargetException unused13) {
                if (AbstractC12682p.m35482b(2, 3) <= 0) {
                    Log.w("Amplitude", "Google Play Services not available for app set id");
                }
            } catch (Exception unused14) {
                if (AbstractC12682p.m35482b(2, 4) <= 0) {
                    Log.e("Amplitude", "Encountered an error connecting to Google Play Services for app set id");
                }
            }
        }
        this.f60231j = str2;
    }

    /* JADX INFO: renamed from: a */
    public static Locale m44931a() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        AbstractC22676k.m65749i(locales, "configuration.locales");
        Locale locale = locales.isEmpty() ? Locale.getDefault() : locales.get(0);
        AbstractC22676k.m65749i(locale, "{\n                    va…      }\n                }");
        return locale;
    }
}
