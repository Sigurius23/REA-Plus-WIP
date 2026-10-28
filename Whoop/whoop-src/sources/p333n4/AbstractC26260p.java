package p333n4;

import p108e4.AbstractC12682p;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;

/* JADX INFO: renamed from: n4.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC26260p implements InterfaceC26249e {

    /* JADX INFO: renamed from: a */
    public int f104405a;

    /* JADX INFO: renamed from: b */
    public C25016e f104406b;

    /* JADX INFO: renamed from: c */
    public C26257m f104407c;

    /* JADX INFO: renamed from: d */
    public int f104408d;

    /* JADX INFO: renamed from: e */
    public final C26252h f104409e = new C26252h(this);

    /* JADX INFO: renamed from: f */
    public int f104410f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f104411g = false;

    /* JADX INFO: renamed from: h */
    public final C26251g f104412h = new C26251g(this);

    /* JADX INFO: renamed from: i */
    public final C26251g f104413i = new C26251g(this);

    /* JADX INFO: renamed from: j */
    public int f104414j = 1;

    public AbstractC26260p(C25016e c25016e) {
        this.f104406b = c25016e;
    }

    /* JADX INFO: renamed from: b */
    public static void m77939b(C26251g c26251g, C26251g c26251g2, int i13) {
        c26251g.f104391l.add(c26251g2);
        c26251g.f104385f = i13;
        c26251g2.f104390k.add(c26251g);
    }

    /* JADX INFO: renamed from: h */
    public static C26251g m77940h(C25015d c25015d) {
        C25015d c25015d2 = c25015d.f97877f;
        if (c25015d2 == null) {
            return null;
        }
        C25016e c25016e = c25015d2.f97875d;
        int iM35485e = AbstractC12682p.m35485e(c25015d2.f97876e);
        if (iM35485e == 1) {
            return c25016e.f97913d.f104412h;
        }
        if (iM35485e == 2) {
            return c25016e.f97915e.f104412h;
        }
        if (iM35485e == 3) {
            return c25016e.f97913d.f104413i;
        }
        if (iM35485e == 4) {
            return c25016e.f97915e.f104413i;
        }
        if (iM35485e != 5) {
            return null;
        }
        return c25016e.f97915e.f104397k;
    }

    /* JADX INFO: renamed from: i */
    public static C26251g m77941i(C25015d c25015d, int i13) {
        C25015d c25015d2 = c25015d.f97877f;
        if (c25015d2 == null) {
            return null;
        }
        C25016e c25016e = c25015d2.f97875d;
        AbstractC26260p abstractC26260p = i13 == 0 ? c25016e.f97913d : c25016e.f97915e;
        int iM35485e = AbstractC12682p.m35485e(c25015d2.f97876e);
        if (iM35485e == 1 || iM35485e == 2) {
            return abstractC26260p.f104412h;
        }
        if (iM35485e == 3 || iM35485e == 4) {
            return abstractC26260p.f104413i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m77942c(C26251g c26251g, C26251g c26251g2, int i13, C26252h c26252h) {
        c26251g.f104391l.add(c26251g2);
        c26251g.f104391l.add(this.f104409e);
        c26251g.f104387h = i13;
        c26251g.f104388i = c26252h;
        c26251g2.f104390k.add(c26251g);
        c26252h.f104390k.add(c26251g);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo77902d();

    /* JADX INFO: renamed from: e */
    public abstract void mo77903e();

    /* JADX INFO: renamed from: f */
    public abstract void mo77904f();

    /* JADX INFO: renamed from: g */
    public final int m77943g(int i13, int i14) {
        if (i14 == 0) {
            C25016e c25016e = this.f104406b;
            int i15 = c25016e.f97946w;
            int iMax = Math.max(c25016e.f97945v, i13);
            if (i15 > 0) {
                iMax = Math.min(i15, i13);
            }
            if (iMax != i13) {
                return iMax;
            }
        } else {
            C25016e c25016e2 = this.f104406b;
            int i16 = c25016e2.f97949z;
            int iMax2 = Math.max(c25016e2.f97948y, i13);
            if (i16 > 0) {
                iMax2 = Math.min(i16, i13);
            }
            if (iMax2 != i13) {
                return iMax2;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: j */
    public long mo77905j() {
        C26252h c26252h = this.f104409e;
        if (c26252h.f104389j) {
            return c26252h.f104386g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo77906k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX INFO: renamed from: l */
    public final void m77944l(C25015d c25015d, C25015d c25015d2, int i13) {
        C26252h c26252h;
        float f13;
        int i14;
        C26251g c26251gM77940h = m77940h(c25015d);
        C26251g c26251gM77940h2 = m77940h(c25015d2);
        if (c26251gM77940h.f104389j && c26251gM77940h2.f104389j) {
            int iM73403e = c25015d.m73403e() + c26251gM77940h.f104386g;
            int iM73403e2 = c26251gM77940h2.f104386g - c25015d2.m73403e();
            int i15 = iM73403e2 - iM73403e;
            C26252h c26252h2 = this.f104409e;
            if (!c26252h2.f104389j && this.f104408d == 3) {
                int i16 = this.f104405a;
                if (i16 == 0) {
                    c26252h2.mo77918d(m77943g(i15, i13));
                } else if (i16 == 1) {
                    c26252h2.mo77918d(Math.min(m77943g(c26252h2.f104392m, i13), i15));
                } else if (i16 == 2) {
                    C25016e c25016e = this.f104406b;
                    C25017f c25017f = c25016e.f97901U;
                    if (c25017f != null) {
                        C26252h c26252h3 = (i13 == 0 ? c25017f.f97913d : c25017f.f97915e).f104409e;
                        if (c26252h3.f104389j) {
                            c26252h2.mo77918d(m77943g((int) ((c26252h3.f104386g * (i13 == 0 ? c25016e.f97947x : c25016e.f97881A)) + 0.5f), i13));
                        }
                    }
                } else if (i16 == 3) {
                    C25016e c25016e2 = this.f104406b;
                    AbstractC26260p abstractC26260p = c25016e2.f97913d;
                    if (abstractC26260p.f104408d == 3 && abstractC26260p.f104405a == 3) {
                        C26258n c26258n = c25016e2.f97915e;
                        if (c26258n.f104408d != 3 || c26258n.f104405a != 3) {
                            if (i13 == 0) {
                                abstractC26260p = c25016e2.f97915e;
                            }
                            c26252h = abstractC26260p.f104409e;
                            if (c26252h.f104389j) {
                                f13 = c25016e2.f97904X;
                                if (i13 == 1) {
                                    i14 = (int) ((c26252h.f104386g / f13) + 0.5f);
                                } else {
                                    i14 = (int) ((f13 * c26252h.f104386g) + 0.5f);
                                }
                                c26252h2.mo77918d(i14);
                            }
                        }
                    } else {
                        if (i13 == 0) {
                            abstractC26260p = c25016e2.f97915e;
                        }
                        c26252h = abstractC26260p.f104409e;
                        if (c26252h.f104389j) {
                            f13 = c25016e2.f97904X;
                            if (i13 == 1) {
                                i14 = (int) ((c26252h.f104386g / f13) + 0.5f);
                            } else {
                                i14 = (int) ((f13 * c26252h.f104386g) + 0.5f);
                            }
                            c26252h2.mo77918d(i14);
                        }
                    }
                }
            }
            if (c26252h2.f104389j) {
                int i17 = c26252h2.f104386g;
                C26251g c26251g = this.f104413i;
                C26251g c26251g2 = this.f104412h;
                if (i17 == i15) {
                    c26251g2.mo77918d(iM73403e);
                    c26251g.mo77918d(iM73403e2);
                    return;
                }
                float f14 = i13 == 0 ? this.f104406b.f97916e0 : this.f104406b.f97918f0;
                if (c26251gM77940h == c26251gM77940h2) {
                    iM73403e = c26251gM77940h.f104386g;
                    iM73403e2 = c26251gM77940h2.f104386g;
                    f14 = 0.5f;
                }
                c26251g2.mo77918d((int) ((((iM73403e2 - iM73403e) - i17) * f14) + iM73403e + 0.5f));
                c26251g.mo77918d(c26251g2.f104386g + c26252h2.f104386g);
            }
        }
    }
}
