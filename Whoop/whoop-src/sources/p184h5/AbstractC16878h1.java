package p184h5;

import p543v4.C35643b;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: h5.h1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16878h1 {

    /* JADX INFO: renamed from: a */
    public final C16905q1 f64822a;

    /* JADX INFO: renamed from: b */
    public C35643b[] f64823b;

    public AbstractC16878h1() {
        this(new C16905q1((C16905q1) null));
    }

    /* JADX INFO: renamed from: a */
    public final void m47520a() {
        C35643b[] c35643bArr = this.f64823b;
        if (c35643bArr != null) {
            C35643b c35643bMo47530g = c35643bArr[0];
            C35643b c35643bMo47530g2 = c35643bArr[1];
            C16905q1 c16905q1 = this.f64822a;
            if (c35643bMo47530g2 == null) {
                c35643bMo47530g2 = c16905q1.f64864a.mo47530g(2);
            }
            if (c35643bMo47530g == null) {
                c35643bMo47530g = c16905q1.f64864a.mo47530g(1);
            }
            mo47497g(C35643b.m112839a(c35643bMo47530g, c35643bMo47530g2));
            C35643b c35643b = this.f64823b[AbstractC30060g.m92084B(16)];
            if (c35643b != null) {
                mo47502f(c35643b);
            }
            C35643b c35643b2 = this.f64823b[AbstractC30060g.m92084B(32)];
            if (c35643b2 != null) {
                mo47501d(c35643b2);
            }
            C35643b c35643b3 = this.f64823b[AbstractC30060g.m92084B(64)];
            if (c35643b3 != null) {
                mo47503h(c35643b3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C16905q1 mo47495b();

    /* JADX INFO: renamed from: c */
    public void mo47504c(int i13, C35643b c35643b) {
        if (this.f64823b == null) {
            this.f64823b = new C35643b[9];
        }
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((i13 & i14) != 0) {
                this.f64823b[AbstractC30060g.m92084B(i14)] = c35643b;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo47501d(C35643b c35643b) {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo47496e(C35643b c35643b);

    /* JADX INFO: renamed from: f */
    public void mo47502f(C35643b c35643b) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo47497g(C35643b c35643b);

    /* JADX INFO: renamed from: h */
    public void mo47503h(C35643b c35643b) {
    }

    public AbstractC16878h1(C16905q1 c16905q1) {
        this.f64822a = c16905q1;
    }
}
