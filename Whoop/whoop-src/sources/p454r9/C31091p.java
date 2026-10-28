package p454r9;

import android.os.SystemClock;
import java.util.NoSuchElementException;
import na.C26488a;
import p002a0.C0028i;
import p309lo.C24565w;
import p412q3.C29875i;
import p450r5.RunnableC30928b;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34629y0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: r9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C31091p {

    /* JADX INFO: renamed from: a */
    public final C29875i f128235a;

    /* JADX INFO: renamed from: b */
    public final C31089n f128236b;

    /* JADX INFO: renamed from: c */
    public final C26488a f128237c = new C26488a();

    /* JADX INFO: renamed from: d */
    public final C24565w f128238d = new C24565w(1);

    /* JADX INFO: renamed from: e */
    public final C24565w f128239e = new C24565w(1);

    /* JADX INFO: renamed from: f */
    public final C0028i f128240f;

    /* JADX INFO: renamed from: g */
    public long f128241g;

    /* JADX INFO: renamed from: h */
    public C34629y0 f128242h;

    /* JADX INFO: renamed from: i */
    public long f128243i;

    public C31091p(C29875i c29875i, C31089n c31089n) {
        this.f128235a = c29875i;
        this.f128236b = c31089n;
        C0028i c0028i = new C0028i(4);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c0028i.f70b = 0;
        c0028i.f71c = 0;
        c0028i.f73e = new long[iHighestOneBit];
        c0028i.f72d = iHighestOneBit - 1;
        this.f128240f = c0028i;
        this.f128241g = -9223372036854775807L;
        this.f128242h = C34629y0.f145874d;
    }

    /* JADX INFO: renamed from: a */
    public final void m95748a(long j7, long j13) {
        int iM95741a;
        final C29875i c29875i = this.f128235a;
        C31078c c31078c = (C31078c) c29875i.f122096x;
        do {
            C0028i c0028i = this.f128240f;
            int i13 = c0028i.f71c;
            if (i13 == 0) {
                return;
            }
            if (i13 == 0) {
                throw new NoSuchElementException();
            }
            long j14 = ((long[]) c0028i.f73e)[c0028i.f70b];
            Long l7 = (Long) this.f128239e.m71656f(j14);
            C31089n c31089n = this.f128236b;
            if (l7 != null && l7.longValue() != this.f128243i) {
                this.f128243i = l7.longValue();
                c31089n.m95744d(2);
            }
            iM95741a = this.f128236b.m95741a(j14, j7, j13, this.f128243i, false, false, this.f128237c);
            if (iM95741a == 0 || iM95741a == 1) {
                long jM70d = c0028i.m70d();
                C34629y0 c34629y0 = (C34629y0) this.f128238d.m71656f(jM70d);
                if (c34629y0 != null && !c34629y0.equals(C34629y0.f145874d) && !c34629y0.equals(this.f128242h)) {
                    this.f128242h = c34629y0;
                    C34608o c34608o = new C34608o();
                    c34608o.f145748t = c34629y0.f145875a;
                    c34608o.f145749u = c34629y0.f145876b;
                    c34608o.f145741m = AbstractC34587d0.m109382o("video/raw");
                    c29875i.f122095w = new C34610p(c34608o);
                    c31078c.f128132h.execute(new RunnableC30928b(2, c29875i, c34629y0));
                }
                int i14 = c31089n.f128220e;
                c31089n.f128220e = 3;
                c31089n.f128227l.getClass();
                c31089n.f128222g = AbstractC38065t.m121896J(SystemClock.elapsedRealtime());
                C34610p c34610p = (C34610p) c29875i.f122095w;
                C34610p c34610p2 = c34610p == null ? new C34610p(new C34608o()) : c34610p;
                InterfaceC31088m interfaceC31088m = c31078c.f128133i;
                c31078c.f128126b.getClass();
                interfaceC31088m.mo8050d(jM70d, System.nanoTime(), c34610p2, null);
                c31078c.f128128d.remove().getClass();
                throw new ClassCastException();
            }
            if (iM95741a == 2 || iM95741a == 3) {
                c0028i.m70d();
                final int i15 = 1;
                c31078c.f128132h.execute(new Runnable() { // from class: r9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                ((C31078c) c29875i.f122096x).f128131g.getClass();
                                break;
                            default:
                                ((C31078c) c29875i.f122096x).f128131g.getClass();
                                break;
                        }
                    }
                });
                c31078c.f128128d.remove().getClass();
                throw new ClassCastException();
            }
        } while (iM95741a == 4);
        if (iM95741a != 5) {
            throw new IllegalStateException(String.valueOf(iM95741a));
        }
    }
}
