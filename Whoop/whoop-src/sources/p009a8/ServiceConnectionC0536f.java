package p009a8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import p097ds.C12320w;
import qg3.C30352d;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: a8.f */
/* JADX INFO: loaded from: classes5.dex */
public final class ServiceConnectionC0536f implements ServiceConnection {

    /* JADX INFO: renamed from: F */
    public final C0532b f1851F;

    /* JADX INFO: renamed from: G */
    public IBinder f1852G;

    /* JADX INFO: renamed from: H */
    public volatile boolean f1853H;

    /* JADX INFO: renamed from: I */
    public int f1854I;

    /* JADX INFO: renamed from: J */
    public final C0535e f1855J;

    /* JADX INFO: renamed from: w */
    public final Context f1856w;

    /* JADX INFO: renamed from: y */
    public final C30352d f1858y;

    /* JADX INFO: renamed from: z */
    public final C0534d f1859z;

    /* JADX INFO: renamed from: x */
    public final ConcurrentLinkedQueue f1857x = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: E */
    public final HashMap f1850E = new HashMap();

    /* JADX WARN: Type inference failed for: r2v1, types: [a8.e] */
    public ServiceConnectionC0536f(Context context, C30352d c30352d, C0534d c0534d, C0532b c0532b) {
        context.getClass();
        this.f1856w = context;
        c30352d.getClass();
        this.f1858y = c30352d;
        this.f1859z = c0534d;
        this.f1851F = c0532b;
        this.f1855J = new IBinder.DeathRecipient() { // from class: a8.e
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                ServiceConnectionC0536f serviceConnectionC0536f = this.f1849a;
                serviceConnectionC0536f.f1858y.getClass();
                if (Log.isLoggable("ServiceConnection", 5)) {
                    Log.w("ServiceConnection", "Binder died for client:HealthData");
                }
                serviceConnectionC0536f.m1306d(new RemoteException("Binder died"));
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final void m1303a(Exception exc) {
        HashSet hashSet;
        m1307e();
        C0534d c0534d = this.f1859z;
        synchronized (c0534d.f1848a) {
            hashSet = new HashSet(c0534d.f1848a);
            c0534d.f1848a.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C12320w) it.next()).m34248k(exc);
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f1857x;
        for (C0531a c0531a : new ArrayList(concurrentLinkedQueue)) {
            if (concurrentLinkedQueue.remove(c0531a)) {
                c0531a.mo1299c(exc);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1304b() {
        if (this.f1853H) {
            return;
        }
        try {
            Context context = this.f1856w;
            Intent intent = new Intent();
            this.f1851F.getClass();
            Intent intent2 = intent.setPackage((String) this.f1858y.f124535x);
            this.f1858y.getClass();
            this.f1853H = context.bindService(intent2.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE"), this, 129);
            if (this.f1853H) {
                return;
            }
            this.f1858y.getClass();
            AbstractC37978j.m121662w("Connection to service is not available for package '" + ((String) this.f1858y.f124535x) + "' and action 'androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE'.");
            IllegalStateException illegalStateException = new IllegalStateException("Service not available");
            this.f1854I = 10;
            m1306d(illegalStateException);
        } catch (SecurityException e5) {
            AbstractC37978j.m121642a0(e5, "Failed to bind connection '" + this.f1858y.m92817q() + "', no permission or service not found.");
            this.f1853H = false;
            this.f1852G = null;
            throw e5;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1305c(C0531a c0531a) {
        try {
            c0531a.mo1300f(this.f1859z);
            IBinder iBinder = this.f1852G;
            iBinder.getClass();
            c0531a.mo1298a(iBinder);
        } catch (DeadObjectException e5) {
            m1306d(e5);
        } catch (RemoteException e13) {
            e = e13;
            c0531a.mo1299c(e);
        } catch (RuntimeException e14) {
            e = e14;
            c0531a.mo1299c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m1306d(Exception exc) {
        IBinder iBinder = this.f1852G;
        if (iBinder != null && iBinder.isBinderAlive()) {
            if (Log.isLoggable("ServiceConnection", 5)) {
                Log.w("ServiceConnection", "Connection is already re-established. No need to reconnect again");
            }
            return;
        }
        m1303a(exc);
        if (this.f1854I < 10) {
            StringBuilder sb4 = new StringBuilder("WCS SDK Client 'HealthData' disconnected, retrying connection. Retry attempt: ");
            this.f1858y.getClass();
            sb4.append(this.f1854I);
            AbstractC37978j.m121642a0(exc, sb4.toString());
            C0532b c0532b = this.f1851F;
            long j7 = 200 << this.f1854I;
            Handler handler = c0532b.f1843x;
            handler.sendMessageDelayed(handler.obtainMessage(2, this), j7);
        } else {
            AbstractC37978j.m121661v(exc, "Connection disconnected and maximum number of retries reached.");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1307e() {
        if (this.f1853H) {
            try {
                this.f1856w.unbindService(this);
            } catch (IllegalArgumentException e5) {
                AbstractC37978j.m121661v(e5, "Failed to unbind the service. Ignoring and continuing");
            }
            this.f1853H = false;
        }
        IBinder iBinder = this.f1852G;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.f1855J, 0);
            } catch (NoSuchElementException e13) {
                AbstractC37978j.m121661v(e13, "mDeathRecipient not linked");
            }
            this.f1852G = null;
        }
        AbstractC37978j.m121657r("ServiceConnection", "unbindService called");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.f1858y.getClass();
        AbstractC37978j.m121662w("Binding died for client 'HealthData'.");
        m1306d(new RemoteException("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.f1858y.getClass();
        AbstractC37978j.m121662w("Cannot bind client 'HealthData', binder is null");
        m1306d(new IllegalStateException("Null binding"));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC37978j.m121657r("ServiceConnection", "onServiceConnected(), componentName = " + componentName);
        if (iBinder == null) {
            AbstractC37978j.m121662w("Service connected but binder is null.");
            return;
        }
        this.f1854I = 0;
        try {
            iBinder.linkToDeath(this.f1855J, 0);
        } catch (RemoteException e5) {
            AbstractC37978j.m121642a0(e5, "Cannot link to death, binder already died. Cleaning operations.");
            m1306d(e5);
        }
        this.f1852G = iBinder;
        Handler handler = this.f1851F.f1843x;
        handler.sendMessage(handler.obtainMessage(1, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC37978j.m121657r("ServiceConnection", "onServiceDisconnected(), componentName = " + componentName);
    }
}
