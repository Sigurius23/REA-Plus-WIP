package p655yo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p035bp.C3512c;
import p529uo.AbstractC35135w;
import p529uo.ServiceConnectionC35114f0;

/* JADX INFO: renamed from: yo.a */
/* JADX INFO: loaded from: classes.dex */
public final class C39678a {

    /* JADX INFO: renamed from: b */
    public static final Object f170793b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile C39678a f170794c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f170795a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static C39678a m126907a() {
        if (f170794c == null) {
            synchronized (f170793b) {
                try {
                    if (f170794c == null) {
                        f170794c = new C39678a();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        C39678a c39678a = f170794c;
        AbstractC35135w.m111094f(c39678a);
        return c39678a;
    }

    /* JADX INFO: renamed from: b */
    public final void m126908b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ServiceConnectionC35114f0)) {
            ConcurrentHashMap concurrentHashMap = this.f170795a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m126909c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i13, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((((Context) C3512c.m10398a(context).f3422w).getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof ServiceConnectionC35114f0) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i13) : context.bindService(intent, i13, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f170795a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i13) : context.bindService(intent, i13, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th3) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th3;
        }
    }
}
