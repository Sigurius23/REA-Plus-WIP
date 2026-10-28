package p425qh;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import bd3.C3143v;
import bh.C3247j;
import g73.C15556d;
import java.lang.ref.WeakReference;
import kh.C22469c;
import p005a3.C0237p;
import p304lh.InterfaceC24066e;
import p479s4.AbstractC32122c;

/* JADX INFO: renamed from: qh.g */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C30361g implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: E */
    public boolean f124558E = true;

    /* JADX INFO: renamed from: w */
    public final WeakReference f124559w;

    /* JADX INFO: renamed from: x */
    public Context f124560x;

    /* JADX INFO: renamed from: y */
    public InterfaceC24066e f124561y;

    /* JADX INFO: renamed from: z */
    public boolean f124562z;

    public ComponentCallbacks2C30361g(C3247j c3247j) {
        this.f124559w = new WeakReference(c3247j);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m92831a() {
        InterfaceC24066e c15556d;
        try {
            C3247j c3247j = (C3247j) this.f124559w.get();
            if (c3247j == null) {
                m92832b();
            } else if (this.f124561y == null) {
                if (c3247j.f12730e.f124552b) {
                    Context context = c3247j.f12726a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC32122c.getSystemService(context, ConnectivityManager.class);
                    if (connectivityManager == null || AbstractC32122c.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        c15556d = new C15556d(20);
                    } else {
                        try {
                            c15556d = new C0237p(connectivityManager, this);
                        } catch (Exception unused) {
                            c15556d = new C15556d(20);
                        }
                    }
                } else {
                    c15556d = new C15556d(20);
                }
                this.f124561y = c15556d;
                this.f124558E = c15556d.isOnline();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m92832b() {
        try {
            if (this.f124562z) {
                return;
            }
            this.f124562z = true;
            Context context = this.f124560x;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            InterfaceC24066e interfaceC24066e = this.f124561y;
            if (interfaceC24066e != null) {
                interfaceC24066e.shutdown();
            }
            this.f124559w.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C3247j) this.f124559w.get()) == null) {
            m92832b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i13) {
        C3247j c3247j = (C3247j) this.f124559w.get();
        if (c3247j != null) {
            C22469c c22469c = (C22469c) c3247j.f12728c.getValue();
            if (c22469c != null) {
                c22469c.f88020a.mo16046a(i13);
                C3143v c3143v = c22469c.f88021b;
                synchronized (c3143v) {
                    if (i13 >= 10 && i13 != 20) {
                        c3143v.m9036e();
                    }
                }
            }
        } else {
            m92832b();
        }
    }
}
