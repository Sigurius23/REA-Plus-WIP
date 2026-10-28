package p329n0;

import ad3.C0783z;
import androidx.compose.foundation.lazy.layout.C1106b;
import bc3.C2996c2;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import ku0.C22834c;
import l83.C23454a0;
import m40.C25041r;
import m83.AbstractC25265s;
import md0.C25447b;
import mu2.C25960e;
import p005a3.C0230n0;
import p006a4.AbstractC0354a;
import p007a6.C0428i;
import p014aj.C0929d;
import p077d0.AbstractC11348f;
import p077d0.C11376m;
import p098dt.AbstractC12350b;
import p132f0.EnumC13840z0;
import p180h0.C16375d0;
import p180h0.InterfaceC16478x2;
import p238j0.C21084j;
import p268k0.AbstractC22086a;
import p292l1.C23175t0;
import p293l2.C23224a;
import p389p0.C28514d;
import p389p0.C28521f0;
import p389p0.C28527h0;
import p389p0.C28535l0;
import p389p0.C28539n0;
import p389p0.InterfaceC28531j0;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p634y1.AbstractC39038k;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: n0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C26068u implements InterfaceC16478x2 {

    /* JADX INFO: renamed from: x */
    public static final C28539n0 f103217x = AbstractC39038k.m124456b(new C25960e(13), new C25447b(25));

    /* JADX INFO: renamed from: a */
    public final C26048a f103218a;

    /* JADX INFO: renamed from: b */
    public boolean f103219b;

    /* JADX INFO: renamed from: c */
    public C26061n f103220c;

    /* JADX INFO: renamed from: d */
    public boolean f103221d;

    /* JADX INFO: renamed from: e */
    public final C23224a f103222e;

    /* JADX INFO: renamed from: f */
    public final C28633k1 f103223f;

    /* JADX INFO: renamed from: g */
    public final C21084j f103224g;

    /* JADX INFO: renamed from: h */
    public float f103225h;

    /* JADX INFO: renamed from: i */
    public final C16375d0 f103226i;

    /* JADX INFO: renamed from: j */
    public final boolean f103227j;

    /* JADX INFO: renamed from: k */
    public C0230n0 f103228k;

    /* JADX INFO: renamed from: l */
    public final C26066s f103229l;

    /* JADX INFO: renamed from: m */
    public final C28514d f103230m;

    /* JADX INFO: renamed from: n */
    public final C1106b f103231n;

    /* JADX INFO: renamed from: o */
    public final C0929d f103232o;

    /* JADX INFO: renamed from: p */
    public final C28535l0 f103233p;

    /* JADX INFO: renamed from: q */
    public final C0783z f103234q;

    /* JADX INFO: renamed from: r */
    public final C28527h0 f103235r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC28601c1 f103236s;

    /* JADX INFO: renamed from: t */
    public final C28633k1 f103237t;

    /* JADX INFO: renamed from: u */
    public final C28633k1 f103238u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC28601c1 f103239v;

    /* JADX INFO: renamed from: w */
    public final C28539n0 f103240w;

    public C26068u(int i13, int i14) {
        C26048a c26048a = new C26048a();
        c26048a.f103111a = -1;
        c26048a.f103114d = -1;
        this.f103218a = c26048a;
        C23224a c23224a = new C23224a();
        c23224a.f91958b = new C28621h1(i13);
        c23224a.f91959c = new C28621h1(i14);
        c23224a.f91961e = new C28521f0(i13, 30, 100);
        this.f103222e = c23224a;
        this.f103223f = new C28633k1(AbstractC26071x.f103243a, C28676v0.f115976y);
        this.f103224g = new C21084j();
        this.f103226i = new C16375d0(new C0428i(this, 24));
        this.f103227j = true;
        this.f103229l = new C26066s(this);
        this.f103230m = new C28514d();
        this.f103231n = new C1106b();
        this.f103232o = new C0929d(22, false);
        this.f103233p = new C28535l0(new C22834c(this, i13, 1));
        this.f103234q = new C0783z(this, 23);
        this.f103235r = new C28527h0();
        this.f103236s = AbstractC12350b.m34589j();
        Boolean bool = Boolean.FALSE;
        this.f103237t = AbstractC28683x.m87272z(bool);
        this.f103238u = AbstractC28683x.m87272z(bool);
        this.f103239v = AbstractC12350b.m34589j();
        this.f103240w = new C28539n0(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r5.f103226i.mo9764a(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo9764a(p132f0.EnumC13840z0 r6, c93.InterfaceC4351m r7, q83.InterfaceC30057d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p329n0.C26067t
            if (r0 == 0) goto L13
            r0 = r8
            n0.t r0 = (p329n0.C26067t) r0
            int r1 = r0.f103212E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103212E = r1
            goto L18
        L13:
            n0.t r0 = new n0.t
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f103215y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f103212E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            s83.i r6 = r0.f103214x
            r7 = r6
            c93.m r7 = (c93.InterfaceC4351m) r7
            f0.z0 r6 = r0.f103213w
            p505ts.AbstractC34132o.m107864I(r8)
            goto L52
        L3d:
            p505ts.AbstractC34132o.m107864I(r8)
            r0.f103213w = r6
            r8 = r7
            s83.i r8 = (s83.AbstractC32275i) r8
            r0.f103214x = r8
            r0.f103212E = r4
            p0.d r8 = r5.f103230m
            java.lang.Object r8 = r8.m86821j(r0)
            if (r8 != r1) goto L52
            goto L61
        L52:
            r8 = 0
            r0.f103213w = r8
            r0.f103214x = r8
            r0.f103212E = r3
            h0.d0 r8 = r5.f103226i
            java.lang.Object r6 = r8.mo9764a(r6, r7, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p329n0.C26068u.mo9764a(f0.z0, c93.m, q83.d):java.lang.Object");
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: b */
    public final boolean mo9765b() {
        return this.f103226i.mo9765b();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: c */
    public final boolean mo39182c() {
        return ((Boolean) this.f103238u.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: d */
    public final boolean mo39183d() {
        return ((Boolean) this.f103237t.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: e */
    public final float mo9766e(float f13) {
        return this.f103226i.mo9766e(f13);
    }

    /* JADX INFO: renamed from: f */
    public final Object m77563f(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        Object objMo9764a = mo9764a(EnumC13840z0.f49374w, new C25041r(this, i13, i14, null), interfaceC30057d);
        return objMo9764a == EnumC31071a.f128113w ? objMo9764a : C23454a0.f92919a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final void m77564g(C26061n c26061n, boolean z4, boolean z13) {
        ?? r10 = c26061n.f103177k;
        int i13 = c26061n.f103180n;
        int i14 = c26061n.f103168b;
        C26062o c26062o = c26061n.f103167a;
        this.f103233p.f115451e = r10.size();
        C28539n0 c28539n0 = this.f103240w;
        C23224a c23224a = this.f103222e;
        if (!z4 && this.f103219b) {
            this.f103220c = c26061n;
            AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
            Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
            AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
            try {
                if (((Number) ((C11376m) c28539n0.f115463y).f36471x.getValue()).floatValue() != 0.0f && c26062o != null && c26062o.getIndex() == ((C28621h1) c23224a.f91958b).m87024x() && i14 == ((C28621h1) c23224a.f91959c).m87024x()) {
                    C2996c2 c2996c2 = (C2996c2) c28539n0.f115462x;
                    if (c2996c2 != null) {
                        c2996c2.cancel((CancellationException) null);
                    }
                    c28539n0.f115463y = new C11376m(AbstractC11348f.f36367i, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            }
        }
        if (z4) {
            this.f103219b = true;
        }
        this.f103238u.setValue(Boolean.valueOf(((c26062o != null ? c26062o.getIndex() : 0) == 0 && i14 == 0) ? false : true));
        this.f103237t.setValue(Boolean.valueOf(c26061n.f103169c));
        this.f103225h -= c26061n.f103170d;
        this.f103223f.setValue(c26061n);
        if (z13) {
            c23224a.getClass();
            if (!(((float) i14) >= 0.0f)) {
                AbstractC22086a.m63160c("scrollOffset should be non-negative");
            }
            ((C28621h1) c23224a.f91959c).m87025y(i14);
        } else {
            C26062o c26062o2 = (C26062o) AbstractC25265s.m74100H0(r10);
            C26062o c26062o3 = (C26062o) AbstractC25265s.m74114R0(r10);
            AbstractC0354a.m959F(c26062o2 != null ? c26062o2.getIndex() : -1L, "firstVisibleItem:index");
            AbstractC0354a.m959F(c26062o3 != null ? c26062o3.getIndex() : -1L, "lastVisibleItem:index");
            c23224a.getClass();
            c23224a.f91960d = c26062o != null ? c26062o.getKey() : null;
            if (c23224a.f91957a || i13 > 0) {
                c23224a.f91957a = true;
                if (!(((float) i14) >= 0.0f)) {
                    AbstractC22086a.m63160c("scrollOffset should be non-negative");
                }
                c23224a.m67207b(c26062o != null ? c26062o.getIndex() : 0, i14);
            }
            if (this.f103227j) {
                C26048a c26048a = this.f103218a;
                int i15 = c26048a.f103111a;
                boolean z14 = c26048a.f103113c;
                if (i15 != -1 && !((Collection) r10).isEmpty() && i15 != C26048a.m77516a(c26061n, z14)) {
                    c26048a.f103111a = -1;
                    InterfaceC28531j0 interfaceC28531j0 = c26048a.f103112b;
                    if (interfaceC28531j0 != null) {
                        interfaceC28531j0.cancel();
                    }
                    c26048a.f103112b = null;
                }
                int i16 = c26048a.f103114d;
                if (i16 != -1 && c26048a.f103115e != 0.0f && i16 != i13 && !((Collection) r10).isEmpty()) {
                    int iM77516a = C26048a.m77516a(c26061n, c26048a.f103115e < 0.0f);
                    if (iM77516a >= 0 && iM77516a < i13) {
                        c26048a.f103111a = iM77516a;
                        c26048a.f103112b = C0783z.m1856x(this.f103234q, iM77516a);
                    }
                }
                c26048a.f103114d = i13;
            }
        }
        if (z4) {
            c28539n0.m86841m(c26061n.f103172f, c26061n.f103175i, c26061n.f103174h);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C26061n m77565h() {
        return (C26061n) this.f103223f.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i */
    public final void m77566i(float f13, C26061n c26061n) {
        InterfaceC28531j0 interfaceC28531j0;
        InterfaceC28531j0 interfaceC28531j1;
        if (this.f103227j) {
            C26048a c26048a = this.f103218a;
            c26048a.getClass();
            Object obj = c26061n.f103177k;
            ?? r10 = c26061n.f103177k;
            if (!((Collection) obj).isEmpty()) {
                boolean z4 = f13 < 0.0f;
                int iM77516a = C26048a.m77516a(c26061n, z4);
                if (iM77516a >= 0 && iM77516a < c26061n.f103180n) {
                    if (iM77516a != c26048a.f103111a) {
                        if (c26048a.f103113c != z4) {
                            c26048a.f103111a = -1;
                            InterfaceC28531j0 interfaceC28531j2 = c26048a.f103112b;
                            if (interfaceC28531j2 != null) {
                                interfaceC28531j2.cancel();
                            }
                            c26048a.f103112b = null;
                        }
                        c26048a.f103113c = z4;
                        c26048a.f103111a = iM77516a;
                        c26048a.f103112b = C0783z.m1856x(this.f103234q, iM77516a);
                    }
                    if (z4) {
                        C26062o c26062o = (C26062o) ((InterfaceC26054g) AbstractC25265s.m74112P0(r10));
                        if (((c26062o.m77552o() + c26062o.m77551n()) + c26061n.f103183q) - c26061n.f103179m < (-f13) && (interfaceC28531j1 = c26048a.f103112b) != null) {
                            interfaceC28531j1.mo86826a();
                        }
                    } else if (c26061n.f103178l - ((C26062o) ((InterfaceC26054g) AbstractC25265s.m74096F0(r10))).m77551n() < f13 && (interfaceC28531j0 = c26048a.f103112b) != null) {
                        interfaceC28531j0.mo86826a();
                    }
                }
            }
            c26048a.f103115e = f13;
        }
    }

    /* JADX INFO: renamed from: j */
    public final Object m77567j(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        Object objMo9764a = mo9764a(EnumC13840z0.f49374w, new C23175t0(this, i13, i14, null), interfaceC30057d);
        return objMo9764a == EnumC31071a.f128113w ? objMo9764a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public final void m77568k(int i13, int i14) {
        C23224a c23224a = this.f103222e;
        if (((C28621h1) c23224a.f91958b).m87024x() != i13 || ((C28621h1) c23224a.f91959c).m87024x() != i14) {
            C1106b c1106b = this.f103231n;
            c1106b.m3440e();
            c1106b.f4614b = null;
            c1106b.f4615c = -1;
        }
        c23224a.m67207b(i13, i14);
        c23224a.f91960d = null;
        C0230n0 c0230n0 = this.f103228k;
        if (c0230n0 != null) {
            c0230n0.m630m();
        }
    }

    public /* synthetic */ C26068u(int i13, int i14, int i15) {
        this((i14 & 1) != 0 ? 0 : i13, 0);
    }
}
