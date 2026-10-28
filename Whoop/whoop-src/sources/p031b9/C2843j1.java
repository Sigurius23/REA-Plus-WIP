package p031b9;

import p246j9.C21427b;
import p299l9.InterfaceC23540z0;
import p338n9.C26470d;
import p361o9.C27682v;
import p361o9.InterfaceC27679s;
import p516u8.C34610p;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2843j1 {

    /* JADX INFO: renamed from: a */
    public boolean f11229a;

    /* JADX INFO: renamed from: b */
    public boolean f11230b;

    /* JADX INFO: renamed from: c */
    public int f11231c;

    /* JADX INFO: renamed from: d */
    public int f11232d;

    /* JADX INFO: renamed from: e */
    public Object f11233e;

    /* JADX INFO: renamed from: f */
    public Object f11234f;

    /* JADX INFO: renamed from: b */
    public static void m8143b(AbstractC2829f abstractC2829f) {
        int i13 = abstractC2829f.f11084H;
        if (i13 == 2) {
            AbstractC35849g.m113807i(i13 == 2);
            abstractC2829f.f11084H = 1;
            abstractC2829f.mo8072u();
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8144h(AbstractC2829f abstractC2829f) {
        return abstractC2829f.f11084H != 0;
    }

    /* JADX INFO: renamed from: m */
    public static void m8145m(AbstractC2829f abstractC2829f, long j7) {
        abstractC2829f.f11090N = true;
        if (abstractC2829f instanceof C26470d) {
            C26470d c26470d = (C26470d) abstractC2829f;
            AbstractC35849g.m113807i(c26470d.f11090N);
            c26470d.f105142j0 = j7;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m8146a(AbstractC2829f abstractC2829f, C2847l c2847l) {
        AbstractC35849g.m113807i(((AbstractC2829f) this.f11233e) == abstractC2829f || ((AbstractC2829f) this.f11234f) == abstractC2829f);
        if (m8144h(abstractC2829f)) {
            if (abstractC2829f == ((AbstractC2829f) c2847l.f11251F)) {
                c2847l.f11252G = null;
                c2847l.f11251F = null;
                c2847l.f11254x = true;
            }
            m8143b(abstractC2829f);
            AbstractC35849g.m113807i(abstractC2829f.f11084H == 1);
            abstractC2829f.f11096y.m92812k();
            abstractC2829f.f11084H = 0;
            abstractC2829f.f11085I = null;
            abstractC2829f.f11086J = null;
            abstractC2829f.f11090N = false;
            abstractC2829f.mo8066o();
        }
    }

    /* JADX INFO: renamed from: c */
    public int m8147c() {
        boolean zM8144h = m8144h((AbstractC2829f) this.f11233e);
        AbstractC2829f abstractC2829f = (AbstractC2829f) this.f11234f;
        return (zM8144h ? 1 : 0) + ((abstractC2829f == null || !m8144h(abstractC2829f)) ? 0 : 1);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC2829f m8148d(C2860q0 c2860q0) {
        InterfaceC23540z0 interfaceC23540z0;
        if (c2860q0 != null && (interfaceC23540z0 = c2860q0.f11355c[this.f11231c]) != null) {
            AbstractC2829f abstractC2829f = (AbstractC2829f) this.f11233e;
            if (abstractC2829f.f11085I == interfaceC23540z0) {
                return abstractC2829f;
            }
            AbstractC2829f abstractC2829f2 = (AbstractC2829f) this.f11234f;
            if (abstractC2829f2 != null && abstractC2829f2.f11085I == interfaceC23540z0) {
                return abstractC2829f2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX INFO: renamed from: e */
    public boolean m8149e(C2860q0 c2860q0, AbstractC2829f abstractC2829f) {
        C2860q0 c2860q1;
        int i13 = this.f11231c;
        if (abstractC2829f != null) {
            InterfaceC23540z0 interfaceC23540z0 = c2860q0.f11355c[i13];
            InterfaceC23540z0 interfaceC23540z1 = abstractC2829f.f11085I;
            if (interfaceC23540z1 != null) {
                if (interfaceC23540z1 != interfaceC23540z0) {
                    c2860q1 = c2860q0.f11365m;
                    if (c2860q1 != null || c2860q1.f11355c[i13] != abstractC2829f.f11085I) {
                    }
                } else if (interfaceC23540z0 != null && !abstractC2829f.m8063k()) {
                    C2860q0 c2860q2 = c2860q0.f11365m;
                    if (!c2860q0.f11359g.f11377g || c2860q2 == null || !c2860q2.f11357e || (!(abstractC2829f instanceof C26470d) && !(abstractC2829f instanceof C21427b) && abstractC2829f.f11089M < c2860q2.m8256e())) {
                        c2860q1 = c2860q0.f11365m;
                        return c2860q1 != null ? false : false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m8150f() {
        int i13 = this.f11232d;
        return i13 == 2 || i13 == 4 || i13 == 3;
    }

    /* JADX INFO: renamed from: g */
    public boolean m8151g() {
        int i13 = this.f11232d;
        if (i13 == 0 || i13 == 2 || i13 == 4) {
            return m8144h((AbstractC2829f) this.f11233e);
        }
        AbstractC2829f abstractC2829f = (AbstractC2829f) this.f11234f;
        abstractC2829f.getClass();
        return abstractC2829f.f11084H != 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m8152i(int i13) {
        int i14 = this.f11231c;
        int i15 = this.f11232d;
        return ((i15 == 2 || i15 == 4) && i13 == i14) || (i15 == 3 && i13 != i14);
    }

    /* JADX INFO: renamed from: j */
    public void m8153j(boolean z4) {
        if (z4) {
            if (this.f11229a) {
                AbstractC2829f abstractC2829f = (AbstractC2829f) this.f11233e;
                AbstractC35849g.m113807i(abstractC2829f.f11084H == 0);
                abstractC2829f.f11096y.m92812k();
                abstractC2829f.mo8070s();
                this.f11229a = false;
                return;
            }
            return;
        }
        if (this.f11230b) {
            AbstractC2829f abstractC2829f2 = (AbstractC2829f) this.f11234f;
            abstractC2829f2.getClass();
            AbstractC35849g.m113807i(abstractC2829f2.f11084H == 0);
            abstractC2829f2.f11096y.m92812k();
            abstractC2829f2.mo8070s();
            this.f11230b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public int m8154k(AbstractC2829f abstractC2829f, C2860q0 c2860q0, C27682v c27682v, C2847l c2847l) {
        int i13;
        AbstractC2829f abstractC2829f2 = (AbstractC2829f) this.f11233e;
        int i14 = this.f11231c;
        if (abstractC2829f == null || abstractC2829f.f11084H == 0 || (abstractC2829f == abstractC2829f2 && ((i13 = this.f11232d) == 2 || i13 == 4))) {
            return 1;
        }
        if (abstractC2829f == ((AbstractC2829f) this.f11234f) && this.f11232d == 3) {
            return 1;
        }
        Object[] objArr = abstractC2829f.f11085I != c2860q0.f11355c[i14];
        boolean zM83678b = c27682v.m83678b(i14);
        if (!zM83678b || objArr != false) {
            if (!abstractC2829f.f11090N) {
                InterfaceC27679s interfaceC27679s = c27682v.f111439c[i14];
                int length = interfaceC27679s != null ? interfaceC27679s.length() : 0;
                C34610p[] c34610pArr = new C34610p[length];
                for (int i15 = 0; i15 < length; i15++) {
                    interfaceC27679s.getClass();
                    c34610pArr[i15] = interfaceC27679s.mo68072d(i15);
                }
                InterfaceC23540z0 interfaceC23540z0 = c2860q0.f11355c[i14];
                interfaceC23540z0.getClass();
                abstractC2829f.m8076y(c34610pArr, interfaceC23540z0, c2860q0.m8256e(), c2860q0.f11368p, c2860q0.f11359g.f11371a);
                return 3;
            }
            if (!abstractC2829f.mo8064l()) {
                return 0;
            }
            m8146a(abstractC2829f, c2847l);
            if (!zM83678b || m8150f()) {
                m8153j(abstractC2829f == abstractC2829f2);
                return 1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: l */
    public void m8155l() {
        if (!m8144h((AbstractC2829f) this.f11233e)) {
            m8153j(true);
        }
        AbstractC2829f abstractC2829f = (AbstractC2829f) this.f11234f;
        if (abstractC2829f == null || abstractC2829f.f11084H != 0) {
            return;
        }
        m8153j(false);
    }

    /* JADX INFO: renamed from: n */
    public void m8156n() {
        int i13;
        AbstractC2829f abstractC2829f = (AbstractC2829f) this.f11233e;
        int i14 = abstractC2829f.f11084H;
        if (i14 == 1 && this.f11232d != 4) {
            AbstractC35849g.m113807i(i14 == 1);
            abstractC2829f.f11084H = 2;
            abstractC2829f.mo8071t();
            return;
        }
        AbstractC2829f abstractC2829f2 = (AbstractC2829f) this.f11234f;
        if (abstractC2829f2 == null || (i13 = abstractC2829f2.f11084H) != 1 || this.f11232d == 3) {
            return;
        }
        AbstractC35849g.m113807i(i13 == 1);
        abstractC2829f2.f11084H = 2;
        abstractC2829f2.mo8071t();
    }
}
