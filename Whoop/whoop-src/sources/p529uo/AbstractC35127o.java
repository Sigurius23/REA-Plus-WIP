package p529uo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.common.AbstractC4988e;
import com.whoop.android.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p002a0.C0021f1;
import p029b5.C2728g;
import p035bp.C3512c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: uo.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35127o {

    /* JADX INFO: renamed from: a */
    public static final C0021f1 f149058a = new C0021f1(0);

    /* JADX INFO: renamed from: b */
    public static Locale f149059b;

    /* JADX INFO: renamed from: a */
    public static String m111076a(Context context, int i13) {
        Resources resources = context.getResources();
        switch (i13) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m111083h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m111083h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            default:
                StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 22);
                sb4.append("Unexpected error code ");
                sb4.append(i13);
                Log.e("GoogleApiAvailability", sb4.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m111083h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m111083h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m111077b(Context context, int i13) {
        String strM111083h = i13 == 6 ? m111083h(context, "common_google_play_services_resolution_required_title") : m111076a(context, i13);
        return strM111083h == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : strM111083h;
    }

    /* JADX INFO: renamed from: c */
    public static String m111078c(Context context, int i13) {
        Resources resources = context.getResources();
        String strM111081f = m111081f(context);
        if (i13 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM111081f);
        }
        if (i13 == 2) {
            return AbstractC40909b.m132601c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM111081f);
        }
        if (i13 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM111081f);
        }
        if (i13 == 5) {
            return m111082g(context, "common_google_play_services_invalid_account_text", strM111081f);
        }
        if (i13 == 7) {
            return m111082g(context, "common_google_play_services_network_error_text", strM111081f);
        }
        if (i13 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM111081f);
        }
        if (i13 == 20) {
            return m111082g(context, "common_google_play_services_restricted_profile_text", strM111081f);
        }
        switch (i13) {
            case 16:
                return m111082g(context, "common_google_play_services_api_unavailable_text", strM111081f);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return m111082g(context, "common_google_play_services_sign_in_failed_text", strM111081f);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return resources.getString(R.string.common_google_play_services_updating_text, strM111081f);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM111081f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m111079d(Context context, int i13) {
        return (i13 == 6 || i13 == 19) ? m111082g(context, "common_google_play_services_resolution_required_text", m111081f(context)) : m111078c(context, i13);
    }

    /* JADX INFO: renamed from: e */
    public static String m111080e(Context context, int i13) {
        Resources resources = context.getResources();
        if (i13 == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i13 != 2) {
            return i13 != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button);
        }
        return resources.getString(R.string.common_google_play_services_update_button);
    }

    /* JADX INFO: renamed from: f */
    public static String m111081f(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) C3512c.m10398a(context).f3422w;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m111082g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM111083h = m111083h(context, str);
        if (strM111083h == null) {
            strM111083h = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM111083h, str2);
    }

    /* JADX INFO: renamed from: h */
    public static String m111083h(Context context, String str) {
        Resources resourcesForApplication;
        C0021f1 c0021f1 = f149058a;
        synchronized (c0021f1) {
            try {
                Locale localeM7700b = C2728g.m7699f(context.getResources().getConfiguration().getLocales()).m7700b(0);
                if (!localeM7700b.equals(f149059b)) {
                    c0021f1.clear();
                    f149059b = localeM7700b;
                }
                String str2 = (String) c0021f1.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 18);
                        sb4.append("Missing resource: ");
                        sb4.append(str);
                        Log.w("GoogleApiAvailability", sb4.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            c0021f1.put(str, string);
                            return string;
                        }
                        StringBuilder sb5 = new StringBuilder(str.length() + 20);
                        sb5.append("Got empty resource: ");
                        sb5.append(str);
                        Log.w("GoogleApiAvailability", sb5.toString());
                    }
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
