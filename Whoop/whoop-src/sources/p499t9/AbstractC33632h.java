package p499t9;

import p309lo.AbstractC24543a;
import p588wm.C37359a;
import p588wm.C37361c;
import p588wm.InterfaceC37360b;
import p588wm.InterfaceC37362d;
import p588wm.InterfaceC37368j;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: t9.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC33632h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140380a = 0;

    /* JADX INFO: renamed from: b */
    public final int f140381b;

    /* JADX INFO: renamed from: c */
    public final Object f140382c;

    /* JADX INFO: renamed from: d */
    public final Object f140383d;

    /* JADX INFO: renamed from: e */
    public Object f140384e;

    public AbstractC33632h(InterfaceC37360b interfaceC37360b, InterfaceC37362d interfaceC37362d, long j7, long j13, long j14, long j15, long j16, int i13) {
        this.f140383d = interfaceC37362d;
        this.f140381b = i13;
        this.f140382c = new C37359a(interfaceC37360b, j7, j13, j14, j15, j16);
    }

    /* JADX INFO: renamed from: c */
    public static int m106249c(InterfaceC33646o interfaceC33646o, long j7, C33650s c33650s) {
        if (j7 == interfaceC33646o.getPosition()) {
            return 0;
        }
        c33650s.f140436a = j7;
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m106250d(InterfaceC37368j interfaceC37368j, long j7, C33650s c33650s) {
        if (j7 == interfaceC37368j.getPosition()) {
            return 0;
        }
        c33650s.f140436a = j7;
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public int m106251a(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        InterfaceC33630g interfaceC33630g = (InterfaceC33630g) this.f140383d;
        while (true) {
            C33624d c33624d = (C33624d) this.f140384e;
            AbstractC35849g.m113808j(c33624d);
            long j7 = c33624d.f140361f;
            long j13 = c33624d.f140362g;
            long j14 = c33624d.f140363h;
            if (j13 - j7 <= this.f140381b) {
                this.f140384e = null;
                interfaceC33630g.mo1689d();
                return m106249c(interfaceC33646o, j7, c33650s);
            }
            long position = j14 - interfaceC33646o.getPosition();
            if (position < 0 || position > 262144) {
                return m106249c(interfaceC33646o, j14, c33650s);
            }
            interfaceC33646o.mo3100n((int) position);
            interfaceC33646o.mo3093e();
            C33628f c33628fMo1695j = interfaceC33630g.mo1695j(interfaceC33646o, c33624d.f140357b);
            int i13 = c33628fMo1695j.f140367a;
            long j15 = c33628fMo1695j.f140368b;
            long j16 = c33628fMo1695j.f140369c;
            if (i13 == -3) {
                this.f140384e = null;
                interfaceC33630g.mo1689d();
                return m106249c(interfaceC33646o, j14, c33650s);
            }
            if (i13 == -2) {
                c33624d.f140359d = j15;
                c33624d.f140361f = j16;
                c33624d.f140363h = C33624d.m106247a(c33624d.f140357b, j15, c33624d.f140360e, j16, c33624d.f140362g, c33624d.f140358c);
            } else {
                if (i13 != -1) {
                    if (i13 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j16 - interfaceC33646o.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC33646o.mo3100n((int) position2);
                    }
                    this.f140384e = null;
                    interfaceC33630g.mo1689d();
                    return m106249c(interfaceC33646o, j16, c33650s);
                }
                c33624d.f140360e = j15;
                c33624d.f140362g = j16;
                c33624d.f140363h = C33624d.m106247a(c33624d.f140357b, c33624d.f140359d, j15, c33624d.f140361f, j16, c33624d.f140358c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m106252b(InterfaceC37368j interfaceC37368j, C33650s c33650s) {
        InterfaceC37362d interfaceC37362d = (InterfaceC37362d) this.f140383d;
        while (true) {
            C33624d c33624d = (C33624d) this.f140384e;
            AbstractC24543a.m71574j(c33624d);
            long j7 = c33624d.f140361f;
            long j13 = c33624d.f140362g;
            long j14 = c33624d.f140363h;
            if (j13 - j7 <= this.f140381b) {
                this.f140384e = null;
                interfaceC37362d.mo30742d();
                return m106250d(interfaceC37368j, j7, c33650s);
            }
            long position = j14 - interfaceC37368j.getPosition();
            if (position < 0 || position > 262144) {
                return m106250d(interfaceC37368j, j14, c33650s);
            }
            interfaceC37368j.mo3100n((int) position);
            interfaceC37368j.mo3093e();
            C37361c c37361cMo30743h = interfaceC37362d.mo30743h(interfaceC37368j, c33624d.f140357b);
            int i13 = c37361cMo30743h.f159837a;
            long j15 = c37361cMo30743h.f159838b;
            long j16 = c37361cMo30743h.f159839c;
            if (i13 == -3) {
                this.f140384e = null;
                interfaceC37362d.mo30742d();
                return m106250d(interfaceC37368j, j14, c33650s);
            }
            if (i13 == -2) {
                c33624d.f140359d = j15;
                c33624d.f140361f = j16;
                c33624d.f140363h = C33624d.m106248b(c33624d.f140357b, j15, c33624d.f140360e, j16, c33624d.f140362g, c33624d.f140358c);
            } else {
                if (i13 != -1) {
                    if (i13 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j16 - interfaceC37368j.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC37368j.mo3100n((int) position2);
                    }
                    this.f140384e = null;
                    interfaceC37362d.mo30742d();
                    return m106250d(interfaceC37368j, j16, c33650s);
                }
                c33624d.f140360e = j15;
                c33624d.f140362g = j16;
                c33624d.f140363h = C33624d.m106248b(c33624d.f140357b, c33624d.f140359d, j15, c33624d.f140361f, j16, c33624d.f140358c);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m106253e(long j7) {
        switch (this.f140380a) {
            case 0:
                C33624d c33624d = (C33624d) this.f140384e;
                if (c33624d == null || c33624d.f140356a != j7) {
                    C33622c c33622c = (C33622c) this.f140382c;
                    this.f140384e = new C33624d(j7, c33622c.f140350a.mo79414d(j7), c33622c.f140352c, c33622c.f140353d, c33622c.f140354e, c33622c.f140355f, 0);
                }
                break;
            default:
                C33624d c33624d2 = (C33624d) this.f140384e;
                if (c33624d2 == null || c33624d2.f140356a != j7) {
                    C37359a c37359a = (C37359a) this.f140382c;
                    this.f140384e = new C33624d(j7, c37359a.f159830a.mo106244d(j7), c37359a.f159832c, c37359a.f159833d, c37359a.f159834e, c37359a.f159835f, 1);
                }
                break;
        }
    }

    public AbstractC33632h(InterfaceC33626e interfaceC33626e, InterfaceC33630g interfaceC33630g, long j7, long j13, long j14, long j15, long j16, int i13) {
        this.f140383d = interfaceC33630g;
        this.f140381b = i13;
        this.f140382c = new C33622c(interfaceC33626e, j7, j13, j14, j15, j16);
    }
}
