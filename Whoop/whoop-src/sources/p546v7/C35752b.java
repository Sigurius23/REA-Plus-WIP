package p546v7;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import p009a8.C0531a;
import p009a8.C0532b;
import p087db.C11856j0;
import p097ds.C12317t;
import p097ds.C12320w;
import p097ds.EnumC12315r;
import p097ds.InterfaceFutureC12319v;
import p097ds.RunnableC12312o;
import p097ds.RunnableC12316s;
import p111e8.C12812e;
import p465rm.C31559p;
import p537ux.C35331f0;
import p640y7.C39264a;
import p673z7.C40137a;
import p673z7.C40138b;
import p673z7.InterfaceC40139c;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;

/* JADX INFO: renamed from: v7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C35752b {

    /* JADX INFO: renamed from: a */
    public final C30352d f152038a;

    /* JADX INFO: renamed from: b */
    public final C0532b f152039b;

    /* JADX INFO: renamed from: c */
    public final C35331f0 f152040c;

    /* JADX INFO: renamed from: d */
    public final C35331f0 f152041d;

    /* JADX INFO: renamed from: e */
    public volatile int f152042e;

    /* JADX INFO: renamed from: f */
    public final Context f152043f;

    /* JADX INFO: renamed from: g */
    public final String f152044g;

    public C35752b(Context context, C11856j0 c11856j0) {
        C0532b c0532b;
        AbstractC22676k.m65750j(context, "context");
        synchronized (C39264a.f168831a) {
            try {
                if (C39264a.f168832b == null) {
                    Context applicationContext = context.getApplicationContext();
                    HandlerThread handlerThread = new HandlerThread("ProviderConnectionManager", 9);
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    AbstractC22676k.m65749i(looper, "handlerThread.getLooper()");
                    C39264a.f168832b = new C0532b(applicationContext, looper);
                }
                c0532b = C39264a.f168832b;
                AbstractC22676k.m65747g(c0532b);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C35331f0 c35331f0 = new C35331f0(2);
        C35331f0 c35331f1 = new C35331f0(3);
        this.f152042e = -1;
        int i13 = 1;
        this.f152038a = new C30352d(i13, c11856j0.f38685x, new C0531a(this, c35331f1, c35331f0));
        this.f152039b = c0532b;
        this.f152040c = c35331f0;
        this.f152041d = c35331f1;
        this.f152043f = context;
        this.f152044g = context.getPackageName();
    }

    /* JADX INFO: renamed from: a */
    public final C12320w m113279a(int i13, InterfaceC40139c interfaceC40139c) {
        InterfaceFutureC12319v c12317t;
        EnumC12315r enumC12315r = EnumC12315r.f41243w;
        C12320w c12320w = new C12320w();
        if (this.f152042e != -1) {
            c12317t = new C12317t(Integer.valueOf(this.f152042e));
        } else {
            C31559p c31559p = new C31559p(this.f152041d, 24);
            C12320w c12320w2 = new C12320w();
            C0532b c0532b = this.f152039b;
            C40138b c40138b = new C40138b(this, this.f152038a, c31559p, c12320w2);
            Handler handler = c0532b.f1843x;
            handler.sendMessage(handler.obtainMessage(3, c40138b));
            C31559p c31559p2 = new C31559p(this, 23);
            RunnableC12312o runnableC12312o = new RunnableC12312o();
            runnableC12312o.f41238H = c12320w2;
            runnableC12312o.f41239I = c31559p2;
            c12320w2.mo31061a(runnableC12312o, enumC12315r);
            c12317t = runnableC12312o;
        }
        C40137a c40137a = new C40137a();
        c40137a.f173195d = this;
        c40137a.f173192a = i13;
        c40137a.f173193b = c12320w;
        c40137a.f173194c = interfaceC40139c;
        c12317t.mo31061a(new RunnableC12316s(0, c12317t, c40137a), enumC12315r);
        return c12320w;
    }

    /* JADX INFO: renamed from: b */
    public final C12812e m113280b() {
        String callingPackageName = this.f152044g;
        AbstractC22676k.m65749i(callingPackageName, "callingPackageName");
        String string = this.f152043f.getSharedPreferences("PermissionTokenManager.healthdata", 0).getString("token", null);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i13 = runningAppProcessInfo.importance;
        return new C12812e(callingPackageName, 112, string, i13 == 100 || i13 == 125 || i13 == 200);
    }
}
