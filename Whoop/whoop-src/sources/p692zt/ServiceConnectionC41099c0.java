package p692zt;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.lifecycle.RunnableC1645z0;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p020ap.ThreadFactoryC1879b;
import p073cq.C11052u;
import p655yo.C39678a;
import vd1.C35909c;

/* JADX INFO: renamed from: zt.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC41099c0 implements ServiceConnection {

    /* JADX INFO: renamed from: E */
    public BinderC41095a0 f177182E;

    /* JADX INFO: renamed from: F */
    public boolean f177183F;

    /* JADX INFO: renamed from: w */
    public final Context f177184w;

    /* JADX INFO: renamed from: x */
    public final Intent f177185x;

    /* JADX INFO: renamed from: y */
    public final ScheduledThreadPoolExecutor f177186y;

    /* JADX INFO: renamed from: z */
    public final ArrayDeque f177187z;

    public ServiceConnectionC41099c0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC1879b("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f177187z = new ArrayDeque();
        this.f177183F = false;
        Context applicationContext = context.getApplicationContext();
        this.f177184w = applicationContext;
        this.f177185x = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f177186y = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m133434a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f177187z.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC41095a0 binderC41095a0 = this.f177182E;
                if (binderC41095a0 == null || !binderC41095a0.isBinderAlive()) {
                    m133436c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f177182E.m133433a((C41097b0) this.f177187z.poll());
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C11052u m133435b(Intent intent) {
        C41097b0 c41097b0;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c41097b0 = new C41097b0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f177186y;
            c41097b0.f177180b.f34644a.addOnCompleteListener(scheduledThreadPoolExecutor, new C35909c(scheduledThreadPoolExecutor.schedule(new RunnableC1645z0(c41097b0, 21), 20L, TimeUnit.SECONDS), 7));
            this.f177187z.add(c41097b0);
            m133434a();
        } catch (Throwable th3) {
            throw th3;
        }
        return c41097b0.f177180b.f34644a;
    }

    /* JADX INFO: renamed from: c */
    public final void m133436c() {
        ServiceConnectionC41099c0 serviceConnectionC41099c0;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb4 = new StringBuilder("binder is dead. start connection? ");
            sb4.append(!this.f177183F);
            Log.d("FirebaseMessaging", sb4.toString());
        }
        if (this.f177183F) {
            return;
        }
        this.f177183F = true;
        try {
            C39678a c39678aM126907a = C39678a.m126907a();
            Context context = this.f177184w;
            serviceConnectionC41099c0 = this;
            try {
                if (c39678aM126907a.m126909c(context, context.getClass().getName(), this.f177185x, serviceConnectionC41099c0, 65, null)) {
                    return;
                } else {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                }
                while (true) {
                    ArrayDeque arrayDeque = serviceConnectionC41099c0.f177187z;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((C41097b0) arrayDeque.poll()).f177180b.m29689d(null);
                    }
                }
            } catch (SecurityException e5) {
                e = e5;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        } catch (SecurityException e13) {
            e = e13;
            serviceConnectionC41099c0 = this;
        }
        serviceConnectionC41099c0.f177183F = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f177183F = false;
            if (iBinder instanceof BinderC41095a0) {
                this.f177182E = (BinderC41095a0) iBinder;
                m133434a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f177187z;
            while (!arrayDeque.isEmpty()) {
                ((C41097b0) arrayDeque.poll()).f177180b.m29689d(null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m133434a();
    }
}
