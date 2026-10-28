package yd3;

import c93.InterfaceC4339a;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;
import zd3.C40572p;
import zd3.C40573q;

/* JADX INFO: renamed from: yd3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C39471b extends AbstractC39470a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f169833e = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f169834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39471b(C40573q c40573q, String str) {
        super(str, true);
        this.f169834f = c40573q;
    }

    @Override // yd3.AbstractC39470a
    /* JADX INFO: renamed from: a */
    public final long mo70158a() {
        C40572p c40572p;
        switch (this.f169833e) {
            case 0:
                ((InterfaceC4339a) this.f169834f).invoke();
                return -1L;
            default:
                C40573q c40573q = (C40573q) this.f169834f;
                long jNanoTime = System.nanoTime();
                long j7 = (jNanoTime - c40573q.f174742a) + 1;
                Iterator it = c40573q.f174745d.iterator();
                AbstractC22676k.m65749i(it, "iterator(...)");
                long j13 = Long.MAX_VALUE;
                int i13 = 0;
                int i14 = 0;
                C40572p c40572p2 = null;
                C40572p c40572p3 = null;
                while (it.hasNext()) {
                    C40572p c40572p4 = (C40572p) it.next();
                    AbstractC22676k.m65747g(c40572p4);
                    synchronized (c40572p4) {
                        if (c40573q.m131559a(c40572p4, jNanoTime) > 0) {
                            i14++;
                        } else {
                            long j14 = j13;
                            long j15 = c40572p4.f174741r;
                            if (j15 < j7) {
                                j7 = j15;
                                c40572p2 = c40572p4;
                            }
                            i13++;
                            if (j15 < j14) {
                                j13 = j15;
                                c40572p3 = c40572p4;
                            } else {
                                j13 = j14;
                            }
                        }
                    }
                }
                long j16 = j13;
                if (c40572p2 != null) {
                    c40572p = c40572p2;
                } else if (i13 > 5) {
                    c40572p = c40572p3;
                    j7 = j16;
                } else {
                    j7 = -1;
                    c40572p = null;
                }
                if (c40572p == null) {
                    if (c40572p3 != null) {
                        return (j16 + c40573q.f174742a) - jNanoTime;
                    }
                    if (i14 > 0) {
                        return c40573q.f174742a;
                    }
                    return -1L;
                }
                synchronized (c40572p) {
                    if (c40572p.f174740q.isEmpty() && c40572p.f174741r == j7) {
                        c40572p.f174734k = true;
                        c40573q.f174745d.remove(c40572p);
                        AbstractC37174h.m119136c(c40572p.f174728e);
                        if (!c40573q.f174745d.isEmpty()) {
                            return 0L;
                        }
                        c40573q.f174743b.m126118a();
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39471b(InterfaceC4339a interfaceC4339a, String str, boolean z4) {
        super(str, z4);
        this.f169834f = interfaceC4339a;
    }
}
