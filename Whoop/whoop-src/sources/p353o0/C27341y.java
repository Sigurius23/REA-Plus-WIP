package p353o0;

import androidx.compose.foundation.lazy.layout.C1106b;
import c33.C3936c;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import java.util.Collection;
import la.C23548b;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import no0.C26944e0;
import ny0.C27266m;
import p005a3.C0230n0;
import p014aj.C0929d;
import p098dt.AbstractC12350b;
import p180h0.C16375d0;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16478x2;
import p238j0.C21084j;
import p268k0.AbstractC22086a;
import p389p0.C28514d;
import p389p0.C28527h0;
import p389p0.C28535l0;
import p389p0.C28539n0;
import p389p0.InterfaceC28531j0;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p446r1.C30849c;
import p634y1.AbstractC39038k;
import p719m22.C24947b;
import se.AbstractC32416g;

/* JADX INFO: renamed from: o0.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C27341y implements InterfaceC16478x2 {

    /* JADX INFO: renamed from: w */
    public static final C28539n0 f109496w = AbstractC39038k.m124456b(new C24947b(18), new C27266m(3));

    /* JADX INFO: renamed from: b */
    public boolean f109498b;

    /* JADX INFO: renamed from: c */
    public C27331o f109499c;

    /* JADX INFO: renamed from: d */
    public final C3936c f109500d;

    /* JADX INFO: renamed from: g */
    public float f109503g;

    /* JADX INFO: renamed from: j */
    public C0230n0 f109506j;

    /* JADX INFO: renamed from: o */
    public final C28535l0 f109511o;

    /* JADX INFO: renamed from: t */
    public final C28633k1 f109516t;

    /* JADX INFO: renamed from: u */
    public final C28633k1 f109517u;

    /* JADX INFO: renamed from: v */
    public final C28539n0 f109518v;

    /* JADX INFO: renamed from: a */
    public final C27315a f109497a = new C27315a();

    /* JADX INFO: renamed from: e */
    public final C28633k1 f109501e = new C28633k1(AbstractC27316a0.f109384a, C28676v0.f115976y);

    /* JADX INFO: renamed from: f */
    public final C21084j f109502f = new C21084j();

    /* JADX INFO: renamed from: h */
    public final C16375d0 f109504h = new C16375d0(new C26944e0(this, 10));

    /* JADX INFO: renamed from: i */
    public final boolean f109505i = true;

    /* JADX INFO: renamed from: k */
    public final C27339w f109507k = new C27339w(this, 0);

    /* JADX INFO: renamed from: l */
    public final C28514d f109508l = new C28514d();

    /* JADX INFO: renamed from: m */
    public final C1106b f109509m = new C1106b();

    /* JADX INFO: renamed from: n */
    public final C0929d f109510n = new C0929d(22, false);

    /* JADX INFO: renamed from: p */
    public final C23548b f109512p = new C23548b(this, 21);

    /* JADX INFO: renamed from: q */
    public final C28527h0 f109513q = new C28527h0();

    /* JADX INFO: renamed from: r */
    public final InterfaceC28601c1 f109514r = AbstractC12350b.m34589j();

    /* JADX INFO: renamed from: s */
    public final InterfaceC28601c1 f109515s = AbstractC12350b.m34589j();

    public C27341y(int i13, int i14) {
        this.f109500d = new C3936c(i13, i14);
        this.f109511o = new C28535l0(new C6516c(this, i13, 13));
        Boolean bool = Boolean.FALSE;
        this.f109516t = AbstractC28683x.m87272z(bool);
        this.f109517u = AbstractC28683x.m87272z(bool);
        this.f109518v = new C28539n0(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r5.f109504h.mo9764a(r6, r7, r0) == r1) goto L21;
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
            boolean r0 = r8 instanceof p353o0.C27340x
            if (r0 == 0) goto L13
            r0 = r8
            o0.x r0 = (p353o0.C27340x) r0
            int r1 = r0.f109491E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109491E = r1
            goto L18
        L13:
            o0.x r0 = new o0.x
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f109494y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f109491E
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
            s83.i r6 = r0.f109493x
            r7 = r6
            c93.m r7 = (c93.InterfaceC4351m) r7
            f0.z0 r6 = r0.f109492w
            p505ts.AbstractC34132o.m107864I(r8)
            goto L52
        L3d:
            p505ts.AbstractC34132o.m107864I(r8)
            r0.f109492w = r6
            r8 = r7
            s83.i r8 = (s83.AbstractC32275i) r8
            r0.f109493x = r8
            r0.f109491E = r4
            p0.d r8 = r5.f109508l
            java.lang.Object r8 = r8.m86821j(r0)
            if (r8 != r1) goto L52
            goto L61
        L52:
            r8 = 0
            r0.f109492w = r8
            r0.f109493x = r8
            r0.f109491E = r3
            h0.d0 r8 = r5.f109504h
            java.lang.Object r6 = r8.mo9764a(r6, r7, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p353o0.C27341y.mo9764a(f0.z0, c93.m, q83.d):java.lang.Object");
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: b */
    public final boolean mo9765b() {
        return this.f109504h.mo9765b();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: c */
    public final boolean mo39182c() {
        return ((Boolean) this.f109517u.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: d */
    public final boolean mo39183d() {
        return ((Boolean) this.f109516t.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: e */
    public final float mo9766e(float f13) {
        return this.f109504h.mo9766e(f13);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final void m82481f(C27331o c27331o, boolean z4, boolean z13) {
        C27332p c27332p;
        C27332p c27332p2;
        ?? r10 = c27331o.f109439m;
        int i13 = c27331o.f109442p;
        int i14 = c27331o.f109428b;
        C27333q c27333q = c27331o.f109427a;
        this.f109511o.f115451e = r10.size();
        if (!z4 && this.f109498b) {
            this.f109499c = c27331o;
            return;
        }
        if (z4) {
            this.f109498b = true;
        }
        this.f109503g -= c27331o.f109430d;
        this.f109501e.setValue(c27331o);
        this.f109517u.setValue(Boolean.valueOf(((c27333q != null ? c27333q.f109469a : 0) == 0 && i14 == 0) ? false : true));
        this.f109516t.setValue(Boolean.valueOf(c27331o.f109429c));
        C3936c c3936c = this.f109500d;
        if (z13) {
            c3936c.getClass();
            if (!(((float) i14) >= 0.0f)) {
                AbstractC22086a.m63160c("scrollOffset should be non-negative");
            }
            ((C28621h1) c3936c.f16069b).m87025y(i14);
        } else {
            c3936c.getClass();
            c3936c.f16071d = (c27333q == null || (c27332p2 = (C27332p) AbstractC25260n.m74079t0(c27333q.f109470b)) == null) ? null : c27332p2.f109447b;
            if (c3936c.f16068a || i13 > 0) {
                c3936c.f16068a = true;
                if (!(((float) i14) >= 0.0f)) {
                    AbstractC22086a.m63160c("scrollOffset should be non-negative (" + i14 + ')');
                }
                c3936c.m11990g((c27333q == null || (c27332p = (C27332p) AbstractC25260n.m74079t0(c27333q.f109470b)) == null) ? 0 : c27332p.f109446a, i14);
            }
            if (this.f109505i) {
                C27315a c27315a = this.f109497a;
                C30849c c30849c = c27315a.f109380b;
                int i15 = c27315a.f109379a;
                boolean z14 = c27315a.f109381c;
                if (i15 != -1 && !((Collection) r10).isEmpty() && i15 != C27315a.m82465b(c27331o, z14)) {
                    c27315a.f109379a = -1;
                    Object[] objArr = c30849c.f127227w;
                    int i16 = c30849c.f127229y;
                    for (int i17 = 0; i17 < i16; i17++) {
                        ((InterfaceC28531j0) objArr[i17]).cancel();
                    }
                    c30849c.m94890g();
                }
                int i18 = c27315a.f109382d;
                if (i18 != -1 && c27315a.f109383e != 0.0f && i18 != i13 && !((Collection) r10).isEmpty()) {
                    int iM82465b = C27315a.m82465b(c27331o, c27315a.f109383e < 0.0f);
                    int iM82464a = C27315a.m82464a(c27331o, c27315a.f109383e < 0.0f);
                    if (iM82464a >= 0 && iM82464a < i13 && iM82465b != c27315a.f109379a && iM82465b >= 0) {
                        c27315a.f109379a = iM82465b;
                        c30849c.m94890g();
                        c30849c.m94886c(c30849c.f127229y, this.f109512p.m68164F(iM82465b));
                    }
                }
                c27315a.f109382d = i13;
            }
        }
        if (z4) {
            this.f109518v.m86841m(c27331o.f109432f, c27331o.f109435i, c27331o.f109434h);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C27331o m82482g() {
        return (C27331o) this.f109501e.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final void m82483h(float f13, C27331o c27331o) {
        if (this.f109505i) {
            C27315a c27315a = this.f109497a;
            C30849c c30849c = c27315a.f109380b;
            if (!((Collection) c27331o.f109439m).isEmpty()) {
                int i13 = 0;
                boolean z4 = f13 < 0.0f;
                int iM82465b = C27315a.m82465b(c27331o, z4);
                int iM82464a = C27315a.m82464a(c27331o, z4);
                if (iM82464a >= 0) {
                    EnumC16377d2 enumC16377d2 = c27331o.f109443q;
                    ?? r10 = c27331o.f109439m;
                    if (iM82464a < c27331o.f109442p) {
                        if (iM82465b != c27315a.f109379a && iM82465b >= 0) {
                            if (c27315a.f109381c != z4) {
                                Object[] objArr = c30849c.f127227w;
                                int i14 = c30849c.f127229y;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    ((InterfaceC28531j0) objArr[i15]).cancel();
                                }
                            }
                            c27315a.f109381c = z4;
                            c27315a.f109379a = iM82465b;
                            c30849c.m94890g();
                            c30849c.m94886c(c30849c.f127229y, this.f109512p.m68164F(iM82465b));
                        }
                        if (z4) {
                            C27332p c27332p = (C27332p) AbstractC25265s.m74112P0(r10);
                            if (((AbstractC32416g.m101138G(c27332p, enumC16377d2) + ((int) (enumC16377d2 == EnumC16377d2.f62971w ? c27332p.f109464s & 4294967295L : c27332p.f109464s >> 32))) + c27331o.f109445s) - c27331o.f109441o < (-f13)) {
                                Object[] objArr2 = c30849c.f127227w;
                                int i16 = c30849c.f127229y;
                                while (i13 < i16) {
                                    ((InterfaceC28531j0) objArr2[i13]).mo86826a();
                                    i13++;
                                }
                            }
                        } else if (c27331o.f109440n - AbstractC32416g.m101138G((C27332p) AbstractC25265s.m74096F0(r10), enumC16377d2) < f13) {
                            Object[] objArr3 = c30849c.f127227w;
                            int i17 = c30849c.f127229y;
                            while (i13 < i17) {
                                ((InterfaceC28531j0) objArr3[i13]).mo86826a();
                                i13++;
                            }
                        }
                    }
                }
            }
            c27315a.f109383e = f13;
        }
    }
}
