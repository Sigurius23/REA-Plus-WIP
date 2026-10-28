package so;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jp.HandlerC21846d;
import p036bq.RunnableC3543b;
import p073cq.RunnableC11044m;
import p655yo.C39678a;
import pg3.C29203o;

/* JADX INFO: renamed from: so.m */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC32796m implements ServiceConnection {

    /* JADX INFO: renamed from: E */
    public final SparseArray f136487E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C32798o f136488F;

    /* JADX INFO: renamed from: w */
    public int f136489w = 0;

    /* JADX INFO: renamed from: x */
    public final Messenger f136490x;

    /* JADX INFO: renamed from: y */
    public C29203o f136491y;

    /* JADX INFO: renamed from: z */
    public final ArrayDeque f136492z;

    public ServiceConnectionC32796m(C32798o c32798o) {
        this.f136488F = c32798o;
        HandlerC21846d handlerC21846d = new HandlerC21846d(Looper.getMainLooper(), new Handler.Callback() { // from class: so.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i13 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i13);
                }
                ServiceConnectionC32796m serviceConnectionC32796m = this.f136486w;
                synchronized (serviceConnectionC32796m) {
                    try {
                        C32797n c32797n = (C32797n) serviceConnectionC32796m.f136487E.get(i13);
                        if (c32797n == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i13);
                            return true;
                        }
                        serviceConnectionC32796m.f136487E.remove(i13);
                        serviceConnectionC32796m.m102850c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            c32797n.m102853b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (c32797n.f136497e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    c32797n.m102854c(null);
                                    return true;
                                }
                                c32797n.m102853b(new zzt("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                c32797n.m102854c(bundle);
                                return true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f136490x = new Messenger(handlerC21846d);
        this.f136492z = new ArrayDeque();
        this.f136487E = new SparseArray();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m102848a(String str) {
        m102849b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m102849b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i13 = this.f136489w;
            if (i13 == 0) {
                throw new IllegalStateException();
            }
            if (i13 != 1 && i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                this.f136489w = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f136489w = 4;
            C39678a.m126907a().m126908b((Context) this.f136488F.f136500b, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f136492z.iterator();
            while (it.hasNext()) {
                ((C32797n) it.next()).m102853b(zztVar);
            }
            this.f136492z.clear();
            for (int i14 = 0; i14 < this.f136487E.size(); i14++) {
                ((C32797n) this.f136487E.valueAt(i14)).m102853b(zztVar);
            }
            this.f136487E.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m102850c() {
        try {
            if (this.f136489w == 2 && this.f136492z.isEmpty() && this.f136487E.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f136489w = 3;
                C39678a.m126907a().m126908b((Context) this.f136488F.f136500b, this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m102851d(C32797n c32797n) throws Throwable {
        Throwable th3;
        try {
            try {
                int i13 = this.f136489w;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            this.f136492z.add(c32797n);
                            return true;
                        }
                        if (i13 != 2) {
                            return false;
                        }
                        this.f136492z.add(c32797n);
                        ((ScheduledExecutorService) this.f136488F.f136501c).execute(new RunnableC32794k(this, 0));
                        return true;
                    }
                    this.f136492z.add(c32797n);
                    if (this.f136489w != 0) {
                        throw new IllegalStateException();
                    }
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.f136489w = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        C39678a c39678aM126907a = C39678a.m126907a();
                        Context context = (Context) this.f136488F.f136500b;
                        try {
                            if (c39678aM126907a.m126909c(context, context.getClass().getName(), intent, this, 1, null)) {
                                ((ScheduledExecutorService) this.f136488F.f136501c).schedule(new RunnableC32794k(this, 1), 30L, TimeUnit.SECONDS);
                            } else {
                                m102848a("Unable to bind to service");
                            }
                        } catch (SecurityException e5) {
                            e = e5;
                            m102849b("Unable to bind to service", e);
                        }
                    } catch (SecurityException e13) {
                        e = e13;
                    }
                    return true;
                } catch (Throwable th4) {
                    th3 = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        throw th3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f136488F.f136501c).execute(new RunnableC11044m(this, iBinder, false, 12));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f136488F.f136501c).execute(new RunnableC3543b(this, 24));
    }
}
