package p692zt;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p036bq.C3542a;
import p465rm.C31559p;

/* JADX INFO: renamed from: zt.z */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41122z {

    /* JADX INFO: renamed from: a */
    public static final long f177266a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    public static final Object f177267b = new Object();

    /* JADX INFO: renamed from: c */
    public static C3542a f177268c;

    /* JADX INFO: renamed from: a */
    public static void m133494a(Context context) {
        if (f177268c == null) {
            C3542a c3542a = new C3542a(context);
            f177268c = c3542a;
            synchronized (c3542a.f14249a) {
                c3542a.f14255g = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m133495b(Intent intent) {
        synchronized (f177267b) {
            try {
                if (f177268c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f177268c.m10577c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m133496c(Context context, ServiceConnectionC41099c0 serviceConnectionC41099c0, Intent intent) {
        synchronized (f177267b) {
            try {
                m133494a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f177268c.m10575a(f177266a);
                }
                serviceConnectionC41099c0.m133435b(intent).addOnCompleteListener(new C31559p(intent, 26));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static ComponentName m133497d(Context context, Intent intent) {
        synchronized (f177267b) {
            try {
                m133494a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f177268c.m10575a(f177266a);
                }
                return componentNameStartService;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
