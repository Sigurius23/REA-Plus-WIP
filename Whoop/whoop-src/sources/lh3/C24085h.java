package lh3;

import ch3.AbstractC4677d;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: lh3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C24085h {

    /* JADX INFO: renamed from: a */
    public final int f95143a;

    /* JADX INFO: renamed from: b */
    public volatile C24084g f95144b;

    /* JADX INFO: renamed from: c */
    public C24084g f95145c;

    /* JADX INFO: renamed from: d */
    public int f95146d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f95147e;

    /* JADX INFO: renamed from: f */
    public Throwable f95148f;

    public C24085h(int i13) {
        this.f95143a = i13;
        C24084g c24084g = new C24084g(null);
        this.f95145c = c24084g;
        this.f95144b = c24084g;
    }

    /* JADX INFO: renamed from: a */
    public final void m71001a(C24083f c24083f) {
        if (c24083f.getAndIncrement() != 0) {
            return;
        }
        AbstractC38292s abstractC38292s = c24083f.f95138w;
        int iAddAndGet = 1;
        do {
            long j7 = c24083f.f95139x.get();
            C24084g c24084g = c24083f.f95141z;
            if (c24084g == null) {
                c24084g = this.f95144b;
            }
            long j13 = 0;
            while (true) {
                if (j13 == j7) {
                    break;
                }
                if (abstractC38292s.mo14749a()) {
                    c24083f.f95141z = null;
                    return;
                }
                boolean z4 = this.f95147e;
                C24084g c24084g2 = (C24084g) c24084g.get();
                boolean z13 = c24084g2 == null;
                if (z4 && z13) {
                    c24083f.f95141z = null;
                    Throwable th3 = this.f95148f;
                    if (th3 != null) {
                        abstractC38292s.onError(th3);
                        return;
                    } else {
                        abstractC38292s.onCompleted();
                        return;
                    }
                }
                if (z13) {
                    break;
                }
                abstractC38292s.onNext(c24084g2.f95142w);
                j13++;
                c24084g = c24084g2;
            }
            if (j13 == j7) {
                if (abstractC38292s.mo14749a()) {
                    c24083f.f95141z = null;
                    return;
                }
                boolean z14 = this.f95147e;
                boolean z15 = c24084g.get() == null;
                if (z14 && z15) {
                    c24083f.f95141z = null;
                    Throwable th4 = this.f95148f;
                    if (th4 != null) {
                        abstractC38292s.onError(th4);
                        return;
                    } else {
                        abstractC38292s.onCompleted();
                        return;
                    }
                }
            }
            if (j13 != 0 && j7 != Long.MAX_VALUE) {
                AbstractC4677d.m14747d(c24083f.f95139x, j13);
            }
            c24083f.f95141z = c24084g;
            iAddAndGet = c24083f.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }
}
