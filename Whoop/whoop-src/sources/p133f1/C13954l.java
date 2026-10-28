package p133f1;

import e93.AbstractC12889b;
import p105e1.C12522i;
import p294l3.C23254g;
import p294l3.C23277r0;
import p294l3.C23286w;
import p635y2.InterfaceC39147y;

/* JADX INFO: renamed from: f1.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C13954l {

    /* JADX INFO: renamed from: a */
    public final long f49741a;

    /* JADX INFO: renamed from: b */
    public final C12522i f49742b;

    /* JADX INFO: renamed from: c */
    public final C12522i f49743c;

    /* JADX INFO: renamed from: e */
    public C23277r0 f49745e;

    /* JADX INFO: renamed from: d */
    public final C13954l f49744d = this;

    /* JADX INFO: renamed from: f */
    public int f49746f = -1;

    public C13954l(long j7, C12522i c12522i, C12522i c12522i2) {
        this.f49741a = j7;
        this.f49742b = c12522i;
        this.f49743c = c12522i2;
    }

    /* JADX INFO: renamed from: a */
    public final long m39733a(C13981u c13981u, boolean z4) {
        C23277r0 c23277r0;
        C13978t c13978t = c13981u.f49880b;
        C13978t c13978t2 = c13981u.f49879a;
        long j7 = this.f49741a;
        if (z4 && c13978t2.f49873c != j7) {
            return 9205357640488583168L;
        }
        if ((!z4 && c13978t.f49873c != j7) || m39736d() == null || (c23277r0 = (C23277r0) this.f49743c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return AbstractC13994y0.m39832u(c23277r0, AbstractC12889b.m36284n(z4 ? c13978t2.f49872b : c13978t.f49872b, 0, m39735c(c23277r0)), z4, c13981u.f49881c);
    }

    /* JADX INFO: renamed from: b */
    public final int m39734b() {
        C23277r0 c23277r0 = (C23277r0) this.f49743c.invoke();
        if (c23277r0 == null) {
            return 0;
        }
        return m39735c(c23277r0);
    }

    /* JADX INFO: renamed from: c */
    public final int m39735c(C23277r0 c23277r0) {
        int i13;
        int iM67375e;
        synchronized (this.f49744d) {
            try {
                if (this.f49745e != c23277r0) {
                    if (c23277r0.m67335d()) {
                        C23286w c23286w = c23277r0.f92228b;
                        if (c23286w.f92260c) {
                            iM67375e = c23277r0.f92228b.f92263f - 1;
                        } else {
                            iM67375e = c23286w.m67375e((int) (c23277r0.f92229c & 4294967295L));
                            int i14 = c23277r0.f92228b.f92263f - 1;
                            if (iM67375e > i14) {
                                iM67375e = i14;
                            }
                            while (iM67375e >= 0 && c23277r0.f92228b.m67376f(iM67375e) >= ((int) (c23277r0.f92229c & 4294967295L))) {
                                iM67375e--;
                            }
                            if (iM67375e < 0) {
                                iM67375e = 0;
                            }
                        }
                    } else {
                        iM67375e = c23277r0.f92228b.f92263f - 1;
                    }
                    this.f49746f = c23277r0.f92228b.m67373c(iM67375e, true);
                    this.f49745e = c23277r0;
                }
                i13 = this.f49746f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC39147y m39736d() {
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f49742b.invoke();
        if (interfaceC39147y == null || !interfaceC39147y.mo3532g()) {
            return null;
        }
        return interfaceC39147y;
    }

    /* JADX INFO: renamed from: e */
    public final C23254g m39737e() {
        C23277r0 c23277r0 = (C23277r0) this.f49743c.invoke();
        return c23277r0 == null ? new C23254g("") : c23277r0.f92227a.f92216a;
    }
}
