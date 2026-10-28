package p492t2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import p005a3.AbstractC0201g;
import p005a3.C0222l0;
import p005a3.C0227m1;
import p005a3.InterfaceC0240p2;
import p026b2.AbstractC2316v;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C33319g extends AbstractC2316v implements InterfaceC0240p2, InterfaceC33313a {

    /* JADX INFO: renamed from: O */
    public InterfaceC33313a f138990O;

    /* JADX INFO: renamed from: P */
    public C33316d f138991P;

    /* JADX INFO: renamed from: Q */
    public C33319g f138992Q;

    /* JADX INFO: renamed from: R */
    public final String f138993R;

    public C33319g(InterfaceC33313a interfaceC33313a, C33316d c33316d) {
        this.f138990O = interfaceC33313a;
        this.f138991P = c33316d == null ? new C33316d() : c33316d;
        this.f138993R = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        long jMo9761J = this.f138990O.mo9761J(j7, j13, i13);
        boolean z4 = this.f9141N;
        C33319g c33319g = null;
        if (z4 && z4) {
            c33319g = (C33319g) AbstractC0201g.m507g(this);
        }
        C33319g c33319g2 = c33319g;
        return C16617b.m47192h(jMo9761J, c33319g2 != null ? c33319g2.mo9761J(C16617b.m47192h(j7, jMo9761J), C16617b.m47191g(j13, jMo9761J), i13) : 0L);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        C33316d c33316d = this.f138991P;
        c33316d.f138977a = this;
        c33316d.f138978b = null;
        this.f138992Q = null;
        c33316d.f138979c = new C0222l0(this, 20);
        c33316d.f138980d = m7158L0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        C22669g0 c22669g0 = new C22669g0();
        AbstractC0201g.m519s(this, new C0227m1(c22669g0, 25));
        C33319g c33319g = (C33319g) ((InterfaceC0240p2) c22669g0.f89336w);
        this.f138992Q = c33319g;
        C33316d c33316d = this.f138991P;
        c33316d.f138978b = c33319g;
        if (c33316d.f138977a == this) {
            c33316d.f138977a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public final Object mo9762V(long j7, long j13, InterfaceC30057d interfaceC30057d) {
        C33317e c33317e;
        long j14;
        long j15;
        long jM124819j;
        C33319g c33319g;
        long jM124819j2;
        long j16;
        if (interfaceC30057d instanceof C33317e) {
            c33317e = (C33317e) interfaceC30057d;
            int i13 = c33317e.f138981E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33317e.f138981E = i13 - Integer.MIN_VALUE;
            } else {
                c33317e = new C33317e(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c33317e = new C33317e(this, (AbstractC32269c) interfaceC30057d);
        }
        C33317e c33317e2 = c33317e;
        Object objMo9762V = c33317e2.f138984y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33317e2.f138981E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo9762V);
            InterfaceC33313a interfaceC33313a = this.f138990O;
            c33317e2.f138982w = j7;
            c33317e2.f138983x = j13;
            c33317e2.f138981E = 1;
            objMo9762V = interfaceC33313a.mo9762V(j7, j13, c33317e2);
            if (objMo9762V != enumC31071a) {
                j14 = j7;
                j15 = j13;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            j15 = c33317e2.f138983x;
            j14 = c33317e2.f138982w;
            AbstractC34132o.m107864I(objMo9762V);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j16 = c33317e2.f138982w;
            AbstractC34132o.m107864I(objMo9762V);
        }
        jM124819j2 = ((C39185q) objMo9762V).m124819j();
        jM124819j = j16;
        return C39185q.m124810a(C39185q.m124816g(jM124819j, jM124819j2));
        jM124819j = ((C39185q) objMo9762V).m124819j();
        boolean z4 = this.f9141N;
        if (z4) {
            c33319g = null;
            if (z4 && z4) {
                c33319g = (C33319g) AbstractC0201g.m507g(this);
            }
        } else {
            c33319g = this.f138992Q;
        }
        if (c33319g != null) {
            long jM124816g = C39185q.m124816g(j14, jM124819j);
            long jM124815f = C39185q.m124815f(j15, jM124819j);
            c33317e2.f138982w = jM124819j;
            c33317e2.f138981E = 2;
            objMo9762V = c33319g.mo9762V(jM124816g, jM124815f, c33317e2);
            if (objMo9762V != enumC31071a) {
                j16 = jM124819j;
                jM124819j2 = ((C39185q) objMo9762V).m124819j();
                jM124819j = j16;
            }
            return enumC31071a;
        }
        jM124819j2 = 0;
        return C39185q.m124810a(C39185q.m124816g(jM124819j, jM124819j2));
    }

    /* JADX INFO: renamed from: X0 */
    public final InterfaceC2994c0 m105693X0() {
        C33319g c33319g = this.f9141N ? (C33319g) AbstractC0201g.m507g(this) : null;
        InterfaceC2994c0 interfaceC2994c0M105693X0 = c33319g != null ? c33319g.m105693X0() : null;
        if (interfaceC2994c0M105693X0 != null && AbstractC3006f0.m8729w(interfaceC2994c0M105693X0)) {
            return interfaceC2994c0M105693X0;
        }
        InterfaceC2994c0 interfaceC2994c0 = this.f138991P.f138980d;
        if (interfaceC2994c0 != null) {
            return interfaceC2994c0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // p005a3.InterfaceC0240p2
    /* JADX INFO: renamed from: f */
    public final Object mo276f() {
        return this.f138993R;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public final long mo29341l0(long j7, int i13) {
        boolean z4 = this.f9141N;
        C33319g c33319g = null;
        if (z4 && z4) {
            c33319g = (C33319g) AbstractC0201g.m507g(this);
        }
        long jMo29341l0 = c33319g != null ? c33319g.mo29341l0(j7, i13) : 0L;
        return C16617b.m47192h(jMo29341l0, this.f138990O.mo29341l0(C16617b.m47191g(j7, jMo29341l0), i13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r11 == r1) goto L29;
     */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo29342p0(long r9, q83.InterfaceC30057d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p492t2.C33318f
            if (r0 == 0) goto L13
            r0 = r11
            t2.f r0 = (p492t2.C33318f) r0
            int r1 = r0.f138989z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138989z = r1
            goto L1a
        L13:
            t2.f r0 = new t2.f
            s83.c r11 = (s83.AbstractC32269c) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.f138987x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f138989z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f138986w
            p505ts.AbstractC34132o.m107864I(r11)
            goto L78
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f138986w
            p505ts.AbstractC34132o.m107864I(r11)
            goto L5a
        L3c:
            p505ts.AbstractC34132o.m107864I(r11)
            boolean r11 = r8.f9141N
            r2 = 0
            if (r11 == 0) goto L4d
            if (r11 == 0) goto L4d
            a3.p2 r11 = p005a3.AbstractC0201g.m507g(r8)
            r2 = r11
            t2.g r2 = (p492t2.C33319g) r2
        L4d:
            if (r2 == 0) goto L64
            r0.f138986w = r9
            r0.f138989z = r4
            java.lang.Object r11 = r2.mo29342p0(r9, r0)
            if (r11 != r1) goto L5a
            goto L77
        L5a:
            y3.q r11 = (p636y3.C39185q) r11
            long r4 = r11.m124819j()
        L60:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L67
        L64:
            r4 = 0
            goto L60
        L67:
            t2.a r11 = r8.f138990O
            long r4 = p636y3.C39185q.m124815f(r4, r9)
            r0.f138986w = r9
            r0.f138989z = r3
            java.lang.Object r11 = r11.mo29342p0(r4, r0)
            if (r11 != r1) goto L78
        L77:
            return r1
        L78:
            y3.q r11 = (p636y3.C39185q) r11
            long r0 = r11.m124819j()
            long r9 = p636y3.C39185q.m124816g(r9, r0)
            y3.q r9 = p636y3.C39185q.m124810a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p492t2.C33319g.mo29342p0(long, q83.d):java.lang.Object");
    }
}
