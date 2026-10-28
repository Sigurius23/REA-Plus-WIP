package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ml.C25660b;
import ml.C25663e;
import ml.C25668j;
import ml.InterfaceC25659a;
import ml.InterfaceC25661c;
import ml.InterfaceC25662d;
import ml.InterfaceC25666h;
import p036bq.RunnableC3543b;
import p133f1.C13968p1;
import p249jc.C21565a;
import p283kl.C22553b;
import p429ql.InterfaceC30463i;
import p479s4.AbstractC32122c;
import p586wk.InterfaceC37327e;
import pl.C29341d;
import pl.C29342e;
import pl.InterfaceC29339b;
import sl.AbstractC32576b;
import sl.C32575a;
import sl.C32578d;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: com.bumptech.glide.h */
/* JADX INFO: loaded from: classes6.dex */
public final class ComponentCallbacks2C4966h implements ComponentCallbacks2, InterfaceC25662d {

    /* JADX INFO: renamed from: L */
    public static final C29341d f20326L;

    /* JADX INFO: renamed from: E */
    public final InterfaceC25666h f20327E;

    /* JADX INFO: renamed from: F */
    public final C25668j f20328F;

    /* JADX INFO: renamed from: G */
    public final RunnableC3543b f20329G;

    /* JADX INFO: renamed from: H */
    public final Handler f20330H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC25659a f20331I;

    /* JADX INFO: renamed from: J */
    public final CopyOnWriteArrayList f20332J;

    /* JADX INFO: renamed from: K */
    public final C29341d f20333K;

    /* JADX INFO: renamed from: w */
    public final ComponentCallbacks2C4960b f20334w;

    /* JADX INFO: renamed from: x */
    public final Context f20335x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC25661c f20336y;

    /* JADX INFO: renamed from: z */
    public final C13968p1 f20337z;

    static {
        C29341d c29341d = (C29341d) new C29341d().m89313c(Bitmap.class);
        c29341d.f118869P = true;
        f20326L = c29341d;
        ((C29341d) new C29341d().m89313c(C22553b.class)).f118869P = true;
    }

    public ComponentCallbacks2C4966h(ComponentCallbacks2C4960b componentCallbacks2C4960b, InterfaceC25661c interfaceC25661c, InterfaceC25666h interfaceC25666h, Context context) {
        C29341d c29341d;
        C13968p1 c13968p1 = new C13968p1(6);
        C21565a c21565a = componentCallbacks2C4960b.f20295H;
        this.f20328F = new C25668j();
        RunnableC3543b runnableC3543b = new RunnableC3543b(this, 1);
        this.f20329G = runnableC3543b;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f20330H = handler;
        this.f20334w = componentCallbacks2C4960b;
        this.f20336y = interfaceC25661c;
        this.f20327E = interfaceC25666h;
        this.f20337z = c13968p1;
        this.f20335x = context;
        Context applicationContext = context.getApplicationContext();
        C20378c c20378c = new C20378c(this, c13968p1);
        c21565a.getClass();
        boolean z4 = AbstractC32122c.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z4 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC25659a c25660b = z4 ? new C25660b(applicationContext, c20378c) : new C25663e();
        this.f20331I = c25660b;
        if (AbstractC33913l.m107272g()) {
            handler.post(runnableC3543b);
        } else {
            interfaceC25661c.mo7696h(this);
        }
        interfaceC25661c.mo7696h(c25660b);
        this.f20332J = new CopyOnWriteArrayList(componentCallbacks2C4960b.f20300z.f20306e);
        C4961c c4961c = componentCallbacks2C4960b.f20300z;
        synchronized (c4961c) {
            try {
                if (c4961c.f20310i == null) {
                    c4961c.f20305d.getClass();
                    C29341d c29341d2 = new C29341d();
                    c29341d2.f118869P = true;
                    c4961c.f20310i = c29341d2;
                }
                c29341d = c4961c.f20310i;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this) {
            C29341d c29341d3 = (C29341d) c29341d.clone();
            if (c29341d3.f118869P && !c29341d3.f118870Q) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c29341d3.f118870Q = true;
            c29341d3.f118869P = true;
            this.f20333K = c29341d3;
        }
        synchronized (componentCallbacks2C4960b.f20296I) {
            try {
                if (componentCallbacks2C4960b.f20296I.contains(this)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                componentCallbacks2C4960b.f20296I.add(this);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final C4964f m15545i(Class cls) {
        return new C4964f(this.f20334w, this, cls, this.f20335x);
    }

    /* JADX INFO: renamed from: j */
    public final C4964f m15546j() {
        return m15545i(Bitmap.class).mo15533a(f20326L);
    }

    /* JADX INFO: renamed from: k */
    public final void m15547k(InterfaceC30463i interfaceC30463i) {
        if (interfaceC30463i == null) {
            return;
        }
        boolean zM15552p = m15552p(interfaceC30463i);
        InterfaceC29339b interfaceC29339bMo15541d = interfaceC30463i.mo15541d();
        if (zM15552p) {
            return;
        }
        ComponentCallbacks2C4960b componentCallbacks2C4960b = this.f20334w;
        synchronized (componentCallbacks2C4960b.f20296I) {
            try {
                Iterator it = componentCallbacks2C4960b.f20296I.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C4966h) it.next()).m15552p(interfaceC30463i)) {
                        return;
                    }
                }
                if (interfaceC29339bMo15541d != null) {
                    interfaceC30463i.mo15542f(null);
                    ((C29342e) interfaceC29339bMo15541d).m89333c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final C4964f m15548l(Integer num) {
        PackageInfo packageInfo;
        C4964f c4964fM15545i = m15545i(Drawable.class);
        c4964fM15545i.f20321Y = num;
        c4964fM15545i.f20323a0 = true;
        Context context = c4964fM15545i.f20316T;
        ConcurrentHashMap concurrentHashMap = AbstractC32576b.f134966a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = AbstractC32576b.f134966a;
        InterfaceC37327e interfaceC37327e = (InterfaceC37327e) concurrentHashMap2.get(packageName);
        if (interfaceC37327e == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e5);
                packageInfo = null;
            }
            C32578d c32578d = new C32578d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            InterfaceC37327e interfaceC37327e2 = (InterfaceC37327e) concurrentHashMap2.putIfAbsent(packageName, c32578d);
            interfaceC37327e = interfaceC37327e2 == null ? c32578d : interfaceC37327e2;
        }
        return c4964fM15545i.mo15533a((C29341d) new C29341d().m89325q(new C32575a(context.getResources().getConfiguration().uiMode & 48, interfaceC37327e)));
    }

    /* JADX INFO: renamed from: m */
    public final C4964f m15549m(String str) {
        C4964f c4964fM15545i = m15545i(Drawable.class);
        c4964fM15545i.f20321Y = str;
        c4964fM15545i.f20323a0 = true;
        return c4964fM15545i;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m15550n() {
        C13968p1 c13968p1 = this.f20337z;
        c13968p1.f49807x = true;
        Iterator it = AbstractC33913l.m107269d((Set) c13968p1.f49808y).iterator();
        while (it.hasNext()) {
            C29342e c29342e = (C29342e) ((InterfaceC29339b) it.next());
            if (c29342e.m89336f()) {
                synchronized (c29342e.f118881c) {
                    try {
                        if (c29342e.m89336f()) {
                            c29342e.m89333c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                ((ArrayList) c13968p1.f49809z).add(c29342e);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m15551o() {
        C13968p1 c13968p1 = this.f20337z;
        c13968p1.f49807x = false;
        Iterator it = AbstractC33913l.m107269d((Set) c13968p1.f49808y).iterator();
        while (it.hasNext()) {
            C29342e c29342e = (C29342e) ((InterfaceC29339b) it.next());
            if (!c29342e.m89335e() && !c29342e.m89336f()) {
                c29342e.m89331a();
            }
        }
        ((ArrayList) c13968p1.f49809z).clear();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // ml.InterfaceC25662d
    public final synchronized void onDestroy() {
        try {
            this.f20328F.onDestroy();
            Iterator it = AbstractC33913l.m107269d(this.f20328F.f100937w).iterator();
            while (it.hasNext()) {
                m15547k((InterfaceC30463i) it.next());
            }
            this.f20328F.f100937w.clear();
            C13968p1 c13968p1 = this.f20337z;
            Iterator it3 = AbstractC33913l.m107269d((Set) c13968p1.f49808y).iterator();
            while (it3.hasNext()) {
                c13968p1.m39751f((InterfaceC29339b) it3.next());
            }
            ((ArrayList) c13968p1.f49809z).clear();
            this.f20336y.mo7697k(this);
            this.f20336y.mo7697k(this.f20331I);
            this.f20330H.removeCallbacks(this.f20329G);
            ComponentCallbacks2C4960b componentCallbacks2C4960b = this.f20334w;
            synchronized (componentCallbacks2C4960b.f20296I) {
                if (!componentCallbacks2C4960b.f20296I.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                componentCallbacks2C4960b.f20296I.remove(this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // ml.InterfaceC25662d
    public final synchronized void onStart() {
        m15551o();
        this.f20328F.onStart();
    }

    @Override // ml.InterfaceC25662d
    public final synchronized void onStop() {
        m15550n();
        this.f20328F.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
    }

    /* JADX INFO: renamed from: p */
    public final synchronized boolean m15552p(InterfaceC30463i interfaceC30463i) {
        InterfaceC29339b interfaceC29339bMo15541d = interfaceC30463i.mo15541d();
        if (interfaceC29339bMo15541d == null) {
            return true;
        }
        if (!this.f20337z.m39751f(interfaceC29339bMo15541d)) {
            return false;
        }
        this.f20328F.f100937w.remove(interfaceC30463i);
        interfaceC30463i.mo15542f(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f20337z + ", treeNode=" + this.f20327E + "}";
    }
}
