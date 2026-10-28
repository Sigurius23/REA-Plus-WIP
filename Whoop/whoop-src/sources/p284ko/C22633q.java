package p284ko;

import android.content.Context;
import android.os.Handler;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.RunnableC20151r0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p309lo.C24560r;
import p309lo.C24562t;
import p690zr.AbstractC41023g0;
import p690zr.C41009b1;
import p690zr.C41060w0;

/* JADX INFO: renamed from: ko.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C22633q implements InterfaceC22614e, InterfaceC22625j0 {

    /* JADX INFO: renamed from: n */
    public static final C41060w0 f89034n = AbstractC41023g0.m133255q(5400000L, 3300000L, 2000000L, 1300000L, 760000L);

    /* JADX INFO: renamed from: o */
    public static final C41060w0 f89035o = AbstractC41023g0.m133255q(1700000L, 820000L, 450000L, 180000L, 130000L);

    /* JADX INFO: renamed from: p */
    public static final C41060w0 f89036p = AbstractC41023g0.m133255q(2300000L, 1300000L, 1000000L, 820000L, 570000L);

    /* JADX INFO: renamed from: q */
    public static final C41060w0 f89037q = AbstractC41023g0.m133255q(3400000L, 2000000L, 1400000L, 1000000L, 620000L);

    /* JADX INFO: renamed from: r */
    public static final C41060w0 f89038r = AbstractC41023g0.m133255q(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);

    /* JADX INFO: renamed from: s */
    public static final C41060w0 f89039s = AbstractC41023g0.m133255q(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    /* JADX INFO: renamed from: t */
    public static C22633q f89040t;

    /* JADX INFO: renamed from: a */
    public final C41009b1 f89041a;

    /* JADX INFO: renamed from: b */
    public final C22612d f89042b = new C22612d(0);

    /* JADX INFO: renamed from: c */
    public final C22621h0 f89043c;

    /* JADX INFO: renamed from: d */
    public final C24562t f89044d;

    /* JADX INFO: renamed from: e */
    public final boolean f89045e;

    /* JADX INFO: renamed from: f */
    public int f89046f;

    /* JADX INFO: renamed from: g */
    public long f89047g;

    /* JADX INFO: renamed from: h */
    public long f89048h;

    /* JADX INFO: renamed from: i */
    public int f89049i;

    /* JADX INFO: renamed from: j */
    public long f89050j;

    /* JADX INFO: renamed from: k */
    public long f89051k;

    /* JADX INFO: renamed from: l */
    public long f89052l;

    /* JADX INFO: renamed from: m */
    public long f89053m;

    public C22633q(Context context, Map map, int i13, C24562t c24562t, boolean z4) {
        C24560r c24560r;
        int i14;
        this.f89041a = C41009b1.m133232a(map);
        this.f89043c = new C22621h0(i13);
        this.f89044d = c24562t;
        this.f89045e = z4;
        if (context == null) {
            this.f89049i = 0;
            this.f89052l = m65569a(0);
            return;
        }
        synchronized (C24560r.class) {
            try {
                if (C24560r.f95852E == null) {
                    C24560r.f95852E = new C24560r(context);
                }
                c24560r = C24560r.f95852E;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (c24560r.f95853w) {
            i14 = c24560r.f95854x;
        }
        this.f89049i = i14;
        this.f89052l = m65569a(i14);
        C22632p c22632p = new C22632p(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) c24560r.f95856z;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c22632p));
        ((Handler) c24560r.f95855y).post(new RunnableC20151r0(18, c24560r, c22632p));
    }

    /* JADX INFO: renamed from: a */
    public final long m65569a(int i13) {
        Integer numValueOf = Integer.valueOf(i13);
        C41009b1 c41009b1 = this.f89041a;
        Long l7 = (Long) c41009b1.get(numValueOf);
        if (l7 == null) {
            l7 = (Long) c41009b1.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m65570b(int i13, long j7, long j13) {
        int i14;
        long j14;
        long j15;
        if (i13 == 0 && j7 == 0 && j13 == this.f89053m) {
            return;
        }
        this.f89053m = j13;
        for (C22610c c22610c : this.f89042b.f88960a) {
            if (c22610c.f88953c) {
                i14 = i13;
                j14 = j7;
                j15 = j13;
            } else {
                i14 = i13;
                j14 = j7;
                j15 = j13;
                c22610c.f88951a.post(new RunnableC20277c7(c22610c, i14, j14, j15));
            }
            i13 = i14;
            j7 = j14;
            j13 = j15;
        }
    }
}
