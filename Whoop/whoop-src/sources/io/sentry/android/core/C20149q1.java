package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.AbstractC20576u4;
import io.sentry.C20319e3;
import io.sentry.C20340g3;
import io.sentry.C20535s;
import io.sentry.C20628x5;
import io.sentry.InterfaceC20408l1;
import io.sentry.InterfaceC20432n1;
import io.sentry.InterfaceC20631y0;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.android.core.internal.util.InterfaceC20115p;
import io.sentry.util.C20579a;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import p005a3.C0194e0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.android.core.q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20149q1 implements InterfaceC20631y0, InterfaceC20115p {

    /* JADX INFO: renamed from: h */
    public static final long f75685h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i */
    public static final C20628x5 f75686i = new C20628x5(new Date(0), 0);

    /* JADX INFO: renamed from: a */
    public final boolean f75687a;

    /* JADX INFO: renamed from: c */
    public final C20116q f75689c;

    /* JADX INFO: renamed from: d */
    public volatile String f75690d;

    /* JADX INFO: renamed from: b */
    public final C20579a f75688b = new C20579a();

    /* JADX INFO: renamed from: e */
    public final TreeSet f75691e = new TreeSet(new C0194e0(2));

    /* JADX INFO: renamed from: f */
    public final ConcurrentSkipListSet f75692f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g */
    public long f75693g = 16666666;

    public C20149q1(SentryAndroidOptions sentryAndroidOptions, C20116q c20116q) {
        this.f75689c = c20116q;
        this.f75687a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    /* JADX INFO: renamed from: g */
    public static long m56050g(AbstractC20576u4 abstractC20576u4) {
        if (abstractC20576u4 instanceof C20628x5) {
            return abstractC20576u4.mo56692b(f75686i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC20576u4.mo56606d());
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC20115p
    /* JADX INFO: renamed from: c */
    public final void mo56003c(long j7, long j13, long j14, long j15, boolean z4, boolean z13, float f13) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f75692f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j16 = (long) (f75685h / ((double) f13));
        this.f75693g = j16;
        if (z4 || z13) {
            concurrentSkipListSet.add(new C20137p1(j7, j13, j14, j15, z4, z13, j16));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56051d() {
        C20535s c20535sM56711a = this.f75688b.m56711a();
        try {
            if (this.f75690d != null) {
                this.f75689c.m56005b(this.f75690d);
                this.f75690d = null;
            }
            this.f75692f.clear();
            this.f75691e.clear();
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x016b  */
    /* JADX INFO: renamed from: e */
    public final void m56052e(InterfaceC20408l1 interfaceC20408l1) {
        C20535s c20535s;
        Throwable th3;
        AbstractC20576u4 abstractC20576u4Mo56463u;
        TreeSet treeSet;
        C20579a c20579a;
        int i13;
        int i14;
        long j7;
        long j13;
        long j14;
        long jLongValue;
        Field field;
        Iterator it;
        TreeSet treeSet2 = this.f75691e;
        if (!this.f75687a || (interfaceC20408l1 instanceof C20319e3) || (interfaceC20408l1 instanceof C20340g3)) {
            return;
        }
        C20579a c20579a2 = this.f75688b;
        C20535s c20535sM56711a = c20579a2.m56711a();
        try {
            if (!treeSet2.contains(interfaceC20408l1)) {
                c20535sM56711a.close();
                return;
            }
            c20535sM56711a.close();
            C20535s c20535sM56711a2 = c20579a2.m56711a();
            try {
                boolean zRemove = treeSet2.remove(interfaceC20408l1);
                ConcurrentSkipListSet concurrentSkipListSet = this.f75692f;
                if (zRemove && (abstractC20576u4Mo56463u = interfaceC20408l1.mo56463u()) != null) {
                    long jM56050g = m56050g(interfaceC20408l1.mo56466x());
                    long jM56050g2 = m56050g(abstractC20576u4Mo56463u);
                    long j15 = jM56050g2 - jM56050g;
                    if (j15 <= 0) {
                        c20535sM56711a2.close();
                        treeSet = treeSet2;
                        c20579a = c20579a2;
                    } else {
                        long j16 = this.f75693g;
                        int i15 = 1;
                        if (concurrentSkipListSet.isEmpty()) {
                            treeSet = treeSet2;
                            c20579a = c20579a2;
                            c20535s = c20535sM56711a2;
                            i13 = 0;
                            i14 = 0;
                            j7 = 0;
                            j13 = 0;
                            j14 = 0;
                        } else {
                            Iterator it3 = concurrentSkipListSet.tailSet(new C20137p1(jM56050g)).iterator();
                            i13 = 0;
                            i14 = 0;
                            j7 = 0;
                            j13 = 0;
                            j14 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    treeSet = treeSet2;
                                    c20579a = c20579a2;
                                    break;
                                }
                                C20137p1 c20137p1 = (C20137p1) it3.next();
                                treeSet = treeSet2;
                                c20579a = c20579a2;
                                long j17 = c20137p1.f75644w;
                                long j18 = c20137p1.f75647z;
                                long j19 = c20137p1.f75643G;
                                long j24 = c20137p1.f75645x;
                                if (j17 > jM56050g2) {
                                    break;
                                }
                                if (j17 < jM56050g || j24 > jM56050g2) {
                                    if ((jM56050g > j17 && jM56050g < j24) || (jM56050g2 > j17 && jM56050g2 < j24)) {
                                        c20535s = c20535sM56711a2;
                                        it = it3;
                                        try {
                                            long jMin = Math.min(j18 - Math.max(0L, Math.max(0L, jM56050g - j17) - j19), j15);
                                            long jMin2 = Math.min(jM56050g2, j24) - Math.max(jM56050g, c20137p1.f75644w);
                                            int i16 = C20116q.f75563Q;
                                            boolean z4 = jMin2 > j19;
                                            j7 += jMin2;
                                            if (jMin2 > C20116q.f75562P) {
                                                j14 += jMin;
                                                i14++;
                                            } else if (z4) {
                                                j13 += jMin;
                                                i13++;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                    it3 = it;
                                    treeSet2 = treeSet;
                                    c20579a2 = c20579a;
                                    c20535sM56711a2 = c20535s;
                                    j16 = j19;
                                } else {
                                    try {
                                        long j25 = c20137p1.f75646y;
                                        boolean z13 = c20137p1.f75641E;
                                        j7 += j25;
                                        if (c20137p1.f75642F) {
                                            j14 += j18;
                                            i14++;
                                        } else if (z13) {
                                            j13 += j18;
                                            i13++;
                                        }
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                        c20535s = c20535sM56711a2;
                                    }
                                }
                                c20535s = c20535sM56711a2;
                                it = it3;
                                it3 = it;
                                treeSet2 = treeSet;
                                c20579a2 = c20579a;
                                c20535sM56711a2 = c20535s;
                                j16 = j19;
                                th = th4;
                                th3 = th;
                                try {
                                    c20535s.close();
                                    throw th3;
                                } catch (Throwable th6) {
                                    th3.addSuppressed(th6);
                                    throw th3;
                                }
                            }
                            c20535s = c20535sM56711a2;
                        }
                        int iCeil = i13 + i14;
                        C20116q c20116q = this.f75689c;
                        Choreographer choreographer = c20116q.f75569J;
                        if (choreographer == null || (field = c20116q.f75570K) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l7 = (Long) field.get(choreographer);
                                if (l7 != null) {
                                    jLongValue = l7.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jM56050g2 - jLongValue);
                            if (jMax > j16) {
                                boolean z14 = jMax > C20116q.f75562P;
                                long jMax2 = Math.max(0L, jMax - j16);
                                j7 += jMax;
                                if (z14) {
                                    j14 += jMax2;
                                    i14++;
                                } else {
                                    j13 += jMax2;
                                    i13++;
                                }
                            } else {
                                i15 = 0;
                            }
                            long j26 = j15 - j7;
                            iCeil = iCeil + i15 + (j26 > 0 ? (int) Math.ceil(j26 / j16) : 0);
                        }
                        double d3 = (j13 + j14) / 1.0E9d;
                        interfaceC20408l1.mo56459o(Integer.valueOf(iCeil), "frames.total");
                        interfaceC20408l1.mo56459o(Integer.valueOf(i13), "frames.slow");
                        interfaceC20408l1.mo56459o(Integer.valueOf(i14), "frames.frozen");
                        interfaceC20408l1.mo56459o(Double.valueOf(d3), "frames.delay");
                        if (interfaceC20408l1 instanceof InterfaceC20432n1) {
                            interfaceC20408l1.mo56454i("frames_total", Integer.valueOf(iCeil));
                            interfaceC20408l1.mo56454i("frames_slow", Integer.valueOf(i13));
                            interfaceC20408l1.mo56454i("frames_frozen", Integer.valueOf(i14));
                            interfaceC20408l1.mo56454i("frames_delay", Double.valueOf(d3));
                        }
                        c20535s.close();
                    }
                } else {
                    c20535sM56711a2.close();
                    treeSet = treeSet2;
                    c20579a = c20579a2;
                }
                C20535s c20535sM56711a3 = c20579a.m56711a();
                try {
                    if (treeSet.isEmpty()) {
                        m56051d();
                    } else {
                        concurrentSkipListSet.headSet(new C20137p1(m56050g(((InterfaceC20408l1) treeSet.first()).mo56466x()))).clear();
                    }
                    c20535sM56711a3.close();
                } catch (Throwable th7) {
                    try {
                        c20535sM56711a3.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                c20535s = c20535sM56711a2;
            }
        } catch (Throwable th10) {
            try {
                c20535sM56711a.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m56053f(InterfaceC20408l1 interfaceC20408l1) {
        String str;
        if (!this.f75687a || (interfaceC20408l1 instanceof C20319e3) || (interfaceC20408l1 instanceof C20340g3)) {
            return;
        }
        C20535s c20535sM56711a = this.f75688b.m56711a();
        try {
            this.f75691e.add(interfaceC20408l1);
            if (this.f75690d == null) {
                C20116q c20116q = this.f75689c;
                if (c20116q.f75566G) {
                    String strM92131v = AbstractC30060g.m92131v();
                    c20116q.f75565F.put(strM92131v, this);
                    c20116q.m56006c();
                    str = strM92131v;
                } else {
                    str = null;
                }
                this.f75690d = str;
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
