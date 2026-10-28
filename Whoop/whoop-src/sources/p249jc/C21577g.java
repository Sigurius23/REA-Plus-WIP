package p249jc;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import io.sentry.android.core.RunnableC20151r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p218ic.C18348b;
import p218ic.C18389w;
import p400pc.C29063b;
import p400pc.InterfaceC29062a;
import p420qc.C30200j;
import sc.C32352b;

/* JADX INFO: renamed from: jc.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21577g implements InterfaceC29062a {

    /* JADX INFO: renamed from: l */
    public static final String f82738l = C18389w.m52887f("Processor");

    /* JADX INFO: renamed from: b */
    public final Context f82740b;

    /* JADX INFO: renamed from: c */
    public final C18348b f82741c;

    /* JADX INFO: renamed from: d */
    public final C32352b f82742d;

    /* JADX INFO: renamed from: e */
    public final WorkDatabase f82743e;

    /* JADX INFO: renamed from: g */
    public final HashMap f82745g = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f82744f = new HashMap();

    /* JADX INFO: renamed from: i */
    public final HashSet f82747i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final ArrayList f82748j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public PowerManager.WakeLock f82739a = null;

    /* JADX INFO: renamed from: k */
    public final Object f82749k = new Object();

    /* JADX INFO: renamed from: h */
    public final HashMap f82746h = new HashMap();

    public C21577g(Context context, C18348b c18348b, C32352b c32352b, WorkDatabase workDatabase) {
        this.f82740b = context;
        this.f82741c = c18348b;
        this.f82742d = c32352b;
        this.f82743e = workDatabase;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m60618d(String str, C21582i0 c21582i0, int i13) {
        String str2 = f82738l;
        if (c21582i0 == null) {
            C18389w.m52886d().m52888a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c21582i0.f82771n.mo8819p(new WorkerStoppedException(i13));
        C18389w.m52886d().m52888a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m60619a(InterfaceC21571d interfaceC21571d) {
        synchronized (this.f82749k) {
            this.f82748j.add(interfaceC21571d);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C21582i0 m60620b(String str) {
        C21582i0 c21582i0 = (C21582i0) this.f82744f.remove(str);
        boolean z4 = c21582i0 != null;
        if (!z4) {
            c21582i0 = (C21582i0) this.f82745g.remove(str);
        }
        this.f82746h.remove(str);
        if (z4) {
            synchronized (this.f82749k) {
                try {
                    if (this.f82744f.isEmpty()) {
                        try {
                            this.f82740b.startService(C29063b.m88341c(this.f82740b));
                        } catch (Throwable th3) {
                            C18389w.m52886d().m52890c(f82738l, "Unable to stop foreground service", th3);
                        }
                        PowerManager.WakeLock wakeLock = this.f82739a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f82739a = null;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return c21582i0;
    }

    /* JADX INFO: renamed from: c */
    public final C21582i0 m60621c(String str) {
        C21582i0 c21582i0 = (C21582i0) this.f82744f.get(str);
        return c21582i0 == null ? (C21582i0) this.f82745g.get(str) : c21582i0;
    }

    /* JADX INFO: renamed from: e */
    public final void m60622e(C30200j c30200j) {
        this.f82742d.f133918d.execute(new RunnableC20151r0(9, this, c30200j));
    }
}
