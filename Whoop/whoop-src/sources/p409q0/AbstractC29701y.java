package p409q0;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p005a3.C0230n0;
import p014aj.C0929d;
import p031b9.C2817b;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.InterfaceC11372l;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p132f0.EnumC13840z0;
import p163g1.C15051j5;
import p180h0.C16375d0;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16478x2;
import p181h2.C16617b;
import p238j0.C21084j;
import p268k0.AbstractC22086a;
import p299l9.C23517o;
import p353o0.C27339w;
import p389p0.C28514d;
import p389p0.C28521f0;
import p389p0.C28523g;
import p389p0.C28527h0;
import p389p0.C28529i0;
import p389p0.C28535l0;
import p389p0.InterfaceC28531j0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p636y3.AbstractC39170b;
import p636y3.InterfaceC39171c;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: q0.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29701y implements InterfaceC16478x2 {

    /* JADX INFO: renamed from: A */
    public final C27339w f121421A;

    /* JADX INFO: renamed from: B */
    public long f121422B;

    /* JADX INFO: renamed from: C */
    public final C28527h0 f121423C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC28601c1 f121424D;

    /* JADX INFO: renamed from: E */
    public final InterfaceC28601c1 f121425E;

    /* JADX INFO: renamed from: F */
    public final C28633k1 f121426F;

    /* JADX INFO: renamed from: G */
    public final C28633k1 f121427G;

    /* JADX INFO: renamed from: H */
    public final C28633k1 f121428H;

    /* JADX INFO: renamed from: I */
    public final C28633k1 f121429I;

    /* JADX INFO: renamed from: a */
    public boolean f121430a;

    /* JADX INFO: renamed from: b */
    public C29693q f121431b;

    /* JADX INFO: renamed from: c */
    public final C28633k1 f121432c;

    /* JADX INFO: renamed from: d */
    public final C23517o f121433d;

    /* JADX INFO: renamed from: e */
    public int f121434e;

    /* JADX INFO: renamed from: f */
    public int f121435f;

    /* JADX INFO: renamed from: g */
    public long f121436g;

    /* JADX INFO: renamed from: h */
    public long f121437h;

    /* JADX INFO: renamed from: i */
    public float f121438i;

    /* JADX INFO: renamed from: j */
    public float f121439j;

    /* JADX INFO: renamed from: k */
    public final C16375d0 f121440k;

    /* JADX INFO: renamed from: l */
    public final boolean f121441l;

    /* JADX INFO: renamed from: m */
    public int f121442m;

    /* JADX INFO: renamed from: n */
    public InterfaceC28531j0 f121443n;

    /* JADX INFO: renamed from: o */
    public boolean f121444o;

    /* JADX INFO: renamed from: p */
    public final C28633k1 f121445p;

    /* JADX INFO: renamed from: q */
    public InterfaceC39171c f121446q;

    /* JADX INFO: renamed from: r */
    public final C21084j f121447r;

    /* JADX INFO: renamed from: s */
    public final C28621h1 f121448s;

    /* JADX INFO: renamed from: t */
    public final C28621h1 f121449t;

    /* JADX INFO: renamed from: u */
    public final C28612f0 f121450u;

    /* JADX INFO: renamed from: v */
    public final C28612f0 f121451v;

    /* JADX INFO: renamed from: w */
    public final C28535l0 f121452w;

    /* JADX INFO: renamed from: x */
    public final C0929d f121453x;

    /* JADX INFO: renamed from: y */
    public final C28514d f121454y;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f121455z;

    public AbstractC29701y(int i13, float f13) {
        double d3 = f13;
        if (-0.5d > d3 || d3 > 0.5d) {
            AbstractC22086a.m63158a("currentPageOffsetFraction " + f13 + " is not within the range -0.5 to 0.5");
        }
        this.f121432c = AbstractC28683x.m87272z(new C16617b(0L));
        this.f121433d = new C23517o(i13, f13, this);
        this.f121434e = i13;
        this.f121436g = Long.MAX_VALUE;
        final int i14 = 0;
        this.f121440k = new C16375d0(new Function1(this) { // from class: q0.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC29701y f121403x;

            {
                this.f121403x = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C29693q c29693q;
                switch (i14) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        AbstractC29701y abstractC29701y = this.f121403x;
                        long jM35468t = AbstractC12667a.m35468t(abstractC29701y);
                        float f14 = abstractC29701y.f121438i + fFloatValue;
                        long jM36259Y = AbstractC12889b.m36259Y(f14);
                        abstractC29701y.f121438i = f14 - jM36259Y;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j7 = jM35468t + jM36259Y;
                            long jM36286p = AbstractC12889b.m36286p(j7, abstractC29701y.f121437h, abstractC29701y.f121436g);
                            boolean z4 = j7 != jM36286p;
                            long j13 = jM36286p - jM35468t;
                            float f15 = j13;
                            abstractC29701y.f121439j = f15;
                            if (Math.abs(j13) != 0) {
                                abstractC29701y.f121428H.setValue(Boolean.valueOf(f15 > 0.0f));
                                abstractC29701y.f121429I.setValue(Boolean.valueOf(f15 < 0.0f));
                            }
                            int i15 = (int) j13;
                            int i16 = -i15;
                            C29693q c29693qM91153d = ((C29693q) abstractC29701y.f121445p.getValue()).m91153d(i16);
                            if (c29693qM91153d != null && (c29693q = abstractC29701y.f121431b) != null) {
                                C29693q c29693qM91153d2 = c29693q.m91153d(i16);
                                if (c29693qM91153d2 != null) {
                                    abstractC29701y.f121431b = c29693qM91153d2;
                                } else {
                                    c29693qM91153d = null;
                                }
                            }
                            if (c29693qM91153d != null) {
                                abstractC29701y.m91160h(c29693qM91153d, abstractC29701y.f121430a, true);
                                abstractC29701y.f121424D.setValue(C23454a0.f92919a);
                            } else {
                                C23517o c23517o = abstractC29701y.f121433d;
                                AbstractC29701y abstractC29701y2 = (AbstractC29701y) c23517o.f93078b;
                                C28617g1 c28617g1 = (C28617g1) c23517o.f93080d;
                                c28617g1.m87023y(c28617g1.m87022x() + (abstractC29701y2.m91165o() != 0 ? i15 / abstractC29701y2.m91165o() : 0.0f));
                                C0230n0 c0230n0 = (C0230n0) abstractC29701y.f121455z.getValue();
                                if (c0230n0 != null) {
                                    c0230n0.m630m();
                                }
                            }
                            if (z4) {
                                ValueOf = Long.valueOf(j13);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        AbstractC29701y abstractC29701y3 = this.f121403x;
                        C28529i0 c28529i0 = (C28529i0) obj;
                        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
                        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
                        try {
                            c28529i0.m86830b(abstractC29701y3.f121434e);
                            return C23454a0.f92919a;
                        } finally {
                            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                        }
                }
            }
        });
        this.f121441l = true;
        this.f121442m = -1;
        this.f121445p = new C28633k1(AbstractC29677c0.f121292b, C28676v0.f115976y);
        this.f121446q = AbstractC29677c0.f121293c;
        this.f121447r = new C21084j();
        this.f121448s = new C28621h1(-1);
        this.f121449t = new C28621h1(i13);
        C28676v0 c28676v0 = C28676v0.f115974F;
        this.f121450u = AbstractC28683x.m87265s(new C29676c(this, 2), c28676v0);
        this.f121451v = AbstractC28683x.m87265s(new C29676c(this, 3), c28676v0);
        final int i15 = 1;
        this.f121452w = new C28535l0(new Function1(this) { // from class: q0.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC29701y f121403x;

            {
                this.f121403x = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C29693q c29693q;
                switch (i15) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        AbstractC29701y abstractC29701y = this.f121403x;
                        long jM35468t = AbstractC12667a.m35468t(abstractC29701y);
                        float f14 = abstractC29701y.f121438i + fFloatValue;
                        long jM36259Y = AbstractC12889b.m36259Y(f14);
                        abstractC29701y.f121438i = f14 - jM36259Y;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j7 = jM35468t + jM36259Y;
                            long jM36286p = AbstractC12889b.m36286p(j7, abstractC29701y.f121437h, abstractC29701y.f121436g);
                            boolean z4 = j7 != jM36286p;
                            long j13 = jM36286p - jM35468t;
                            float f15 = j13;
                            abstractC29701y.f121439j = f15;
                            if (Math.abs(j13) != 0) {
                                abstractC29701y.f121428H.setValue(Boolean.valueOf(f15 > 0.0f));
                                abstractC29701y.f121429I.setValue(Boolean.valueOf(f15 < 0.0f));
                            }
                            int i16 = (int) j13;
                            int i17 = -i16;
                            C29693q c29693qM91153d = ((C29693q) abstractC29701y.f121445p.getValue()).m91153d(i17);
                            if (c29693qM91153d != null && (c29693q = abstractC29701y.f121431b) != null) {
                                C29693q c29693qM91153d2 = c29693q.m91153d(i17);
                                if (c29693qM91153d2 != null) {
                                    abstractC29701y.f121431b = c29693qM91153d2;
                                } else {
                                    c29693qM91153d = null;
                                }
                            }
                            if (c29693qM91153d != null) {
                                abstractC29701y.m91160h(c29693qM91153d, abstractC29701y.f121430a, true);
                                abstractC29701y.f121424D.setValue(C23454a0.f92919a);
                            } else {
                                C23517o c23517o = abstractC29701y.f121433d;
                                AbstractC29701y abstractC29701y2 = (AbstractC29701y) c23517o.f93078b;
                                C28617g1 c28617g1 = (C28617g1) c23517o.f93080d;
                                c28617g1.m87023y(c28617g1.m87022x() + (abstractC29701y2.m91165o() != 0 ? i16 / abstractC29701y2.m91165o() : 0.0f));
                                C0230n0 c0230n0 = (C0230n0) abstractC29701y.f121455z.getValue();
                                if (c0230n0 != null) {
                                    c0230n0.m630m();
                                }
                            }
                            if (z4) {
                                ValueOf = Long.valueOf(j13);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        AbstractC29701y abstractC29701y3 = this.f121403x;
                        C28529i0 c28529i0 = (C28529i0) obj;
                        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
                        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
                        try {
                            c28529i0.m86830b(abstractC29701y3.f121434e);
                            return C23454a0.f92919a;
                        } finally {
                            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                        }
                }
            }
        });
        this.f121453x = new C0929d(22, false);
        this.f121454y = new C28514d();
        this.f121455z = AbstractC28683x.m87272z(null);
        this.f121421A = new C27339w(this, 1);
        this.f121422B = AbstractC39170b.m124770b(0, 0, 15);
        this.f121423C = new C28527h0();
        this.f121424D = AbstractC12350b.m34589j();
        this.f121425E = AbstractC12350b.m34589j();
        Boolean bool = Boolean.FALSE;
        this.f121426F = AbstractC28683x.m87272z(bool);
        this.f121427G = AbstractC28683x.m87272z(bool);
        this.f121428H = AbstractC28683x.m87272z(bool);
        this.f121429I = AbstractC28683x.m87272z(bool);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m91155g(AbstractC29701y abstractC29701y, int i13, C11347e2 c11347e2, InterfaceC30057d interfaceC30057d, int i14) {
        InterfaceC11372l interfaceC11372lM30573u = c11347e2;
        if ((i14 & 4) != 0) {
            interfaceC11372lM30573u = AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);
        }
        return abstractC29701y.m91159f(i13, interfaceC11372lM30573u, interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    public static int m91156i(boolean z4, C29693q c29693q) {
        List list = c29693q.f121381a;
        int i13 = c29693q.f121388h;
        if (!z4) {
            return (((C29678d) AbstractC25265s.m74096F0(list)).f121294a - i13) - 1;
        }
        int i14 = i13 + 1;
        if (i14 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((C29678d) AbstractC25265s.m74112P0(list)).f121294a + i14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r9.mo9764a(r7, r8, r0) == r1) goto L27;
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
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m91157u(p409q0.AbstractC29701y r6, p132f0.EnumC13840z0 r7, c93.InterfaceC4351m r8, q83.InterfaceC30057d r9) {
        /*
            boolean r0 = r9 instanceof p409q0.C29700x
            if (r0 == 0) goto L13
            r0 = r9
            q0.x r0 = (p409q0.C29700x) r0
            int r1 = r0.f121416F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121416F = r1
            goto L18
        L13:
            q0.x r0 = new q0.x
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f121420z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f121416F
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            q0.y r6 = r0.f121417w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            s83.i r6 = r0.f121419y
            r8 = r6
            c93.m r8 = (c93.InterfaceC4351m) r8
            f0.z0 r7 = r0.f121418x
            q0.y r6 = r0.f121417w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5e
        L43:
            p505ts.AbstractC34132o.m107864I(r9)
            r0.f121417w = r6
            r0.f121418x = r7
            r9 = r8
            s83.i r9 = (s83.AbstractC32275i) r9
            r0.f121419y = r9
            r0.f121416F = r5
            p0.d r9 = r6.f121454y
            java.lang.Object r9 = r9.m86821j(r0)
            if (r9 != r1) goto L5a
            goto L5b
        L5a:
            r9 = r3
        L5b:
            if (r9 != r1) goto L5e
            goto L80
        L5e:
            h0.d0 r9 = r6.f121440k
            boolean r9 = r9.mo9765b()
            if (r9 != 0) goto L6f
            int r9 = r6.m91162k()
            p1.h1 r2 = r6.f121449t
            r2.m87025y(r9)
        L6f:
            h0.d0 r9 = r6.f121440k
            r0.f121417w = r6
            r2 = 0
            r0.f121418x = r2
            r0.f121419y = r2
            r0.f121416F = r4
            java.lang.Object r7 = r9.mo9764a(r7, r8, r0)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            r7 = -1
            p1.h1 r6 = r6.f121448s
            r6.m87025y(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p409q0.AbstractC29701y.m91157u(q0.y, f0.z0, c93.m, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: v */
    public static Object m91158v(AbstractC29701y abstractC29701y, int i13, AbstractC32275i abstractC32275i) {
        abstractC29701y.getClass();
        Object objMo9764a = abstractC29701y.mo9764a(EnumC13840z0.f49374w, new C15051j5(abstractC29701y, i13, null, 2), abstractC32275i);
        return objMo9764a == EnumC31071a.f128113w ? objMo9764a : C23454a0.f92919a;
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: a */
    public final Object mo9764a(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        return m91157u(this, enumC13840z0, interfaceC4351m, interfaceC30057d);
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: b */
    public final boolean mo9765b() {
        return this.f121440k.mo9765b();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: c */
    public final boolean mo39182c() {
        return ((Boolean) this.f121427G.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: d */
    public final boolean mo39183d() {
        return ((Boolean) this.f121426F.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: e */
    public final float mo9766e(float f13) {
        return this.f121440k.mo9766e(f13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m91159f(int i13, InterfaceC11372l interfaceC11372l, InterfaceC30057d interfaceC30057d) {
        C29698v c29698v;
        if (interfaceC30057d instanceof C29698v) {
            c29698v = (C29698v) interfaceC30057d;
            int i14 = c29698v.f121404E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c29698v.f121404E = i14 - Integer.MIN_VALUE;
            } else {
                c29698v = new C29698v(this, interfaceC30057d);
            }
        } else {
            c29698v = new C29698v(this, interfaceC30057d);
        }
        Object obj = c29698v.f121407y;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = c29698v.f121404E;
        Object obj3 = C23454a0.f92919a;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            if ((i13 != m91162k() || ((C28617g1) this.f121433d.f93080d).m87022x() != 0.0f) && mo91148m() != 0) {
                c29698v.f121406x = interfaceC11372l;
                c29698v.f121405w = i13;
                c29698v.f121404E = 1;
                Object objM86821j = this.f121454y.m86821j(c29698v);
                if (objM86821j != obj2) {
                    objM86821j = obj3;
                }
                if (objM86821j == obj2) {
                }
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj3;
        }
        i13 = c29698v.f121405w;
        interfaceC11372l = c29698v.f121406x;
        AbstractC34132o.m107864I(obj);
        InterfaceC11372l interfaceC11372l2 = interfaceC11372l;
        double d3 = 0.0f;
        if (-0.5d > d3 || d3 > 0.5d) {
            AbstractC22086a.m63158a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        InterfaceC4351m c29699w = new C29699w(this, m91161j(i13), 0.0f * m91165o(), interfaceC11372l2, null);
        c29698v.f121406x = null;
        c29698v.f121404E = 2;
        return mo9764a(EnumC13840z0.f49374w, c29699w, c29698v) == obj2 ? obj2 : obj3;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0123 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:53:0x00c2, B:57:0x00d1, B:60:0x00da, B:63:0x00e7, B:65:0x00f3, B:77:0x012e, B:71:0x0123, B:68:0x010b), top: B:89:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX INFO: renamed from: h */
    public final void m91160h(C29693q c29693q, boolean z4, boolean z13) {
        List list = c29693q.f121381a;
        int i13 = c29693q.f121392l;
        C29678d c29678d = c29693q.f121389i;
        C29678d c29678d2 = c29693q.f121390j;
        float f13 = c29693q.f121391k;
        this.f121452w.f115451e = list.size();
        if (!z4 && this.f121430a) {
            this.f121431b = c29693q;
            return;
        }
        boolean z14 = true;
        if (z4) {
            this.f121430a = true;
        }
        C23517o c23517o = this.f121433d;
        if (z13) {
            ((C28617g1) c23517o.f93080d).m87023y(f13);
        } else {
            c23517o.getClass();
            c23517o.f93081e = c29678d2 != null ? c29678d2.f121297d : null;
            if (c23517o.f93077a || !list.isEmpty()) {
                c23517o.f93077a = true;
                int i14 = c29678d2 != null ? c29678d2.f121294a : 0;
                ((C28621h1) c23517o.f93079c).m87025y(i14);
                ((C28521f0) c23517o.f93082f).m86825a(i14);
                ((C28617g1) c23517o.f93080d).m87023y(f13);
            }
            if (this.f121442m != -1 && !list.isEmpty()) {
                if (this.f121442m != m91156i(this.f121444o, c29693q)) {
                    this.f121442m = -1;
                    InterfaceC28531j0 interfaceC28531j0 = this.f121443n;
                    if (interfaceC28531j0 != null) {
                        interfaceC28531j0.cancel();
                    }
                    this.f121443n = null;
                }
            }
        }
        this.f121445p.setValue(c29693q);
        this.f121426F.setValue(Boolean.valueOf(c29693q.f121393m));
        this.f121427G.setValue(Boolean.valueOf(((c29678d != null ? c29678d.f121294a : 0) == 0 && i13 == 0) ? false : true));
        if (c29678d != null) {
            this.f121434e = c29678d.f121294a;
        }
        this.f121435f = i13;
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            if (this.f121441l && c29693q.f121388h < mo91148m() && Math.abs(this.f121439j) > 0.5f) {
                float f14 = this.f121439j;
                if (m91163l().f121385e == EnumC16377d2.f62971w) {
                    if (Math.signum(f14) != Math.signum(-Float.intBitsToFloat((int) (m91168r() & 4294967295L)))) {
                        if (m91169s()) {
                            z14 = false;
                        }
                    }
                } else if (Math.signum(f14) != Math.signum(-Float.intBitsToFloat((int) (m91168r() >> 32)))) {
                    if (m91169s()) {
                        z14 = false;
                    }
                }
                if (z14) {
                    m91170t(this.f121439j, c29693q);
                }
            }
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            this.f121436g = AbstractC29677c0.m91149a(c29693q, mo91148m());
            mo91148m();
            int iM91154e = (int) (c29693q.f121385e == EnumC16377d2.f62972x ? c29693q.m91154e() >> 32 : c29693q.m91154e() & 4294967295L);
            this.f121437h = AbstractC12889b.m36284n(c29693q.f121394n.mo51269a(iM91154e, c29693q.f121382b, -c29693q.f121386f, c29693q.f121384d), 0, iM91154e);
        } catch (Throwable th3) {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m91161j(int i13) {
        if (mo91148m() > 0) {
            return AbstractC12889b.m36284n(i13, 0, mo91148m() - 1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final int m91162k() {
        return ((C28621h1) this.f121433d.f93079c).m87024x();
    }

    /* JADX INFO: renamed from: l */
    public final C29693q m91163l() {
        return (C29693q) this.f121445p.getValue();
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo91148m();

    /* JADX INFO: renamed from: n */
    public final int m91164n() {
        return ((C29693q) this.f121445p.getValue()).f121382b;
    }

    /* JADX INFO: renamed from: o */
    public final int m91165o() {
        return ((C29693q) this.f121445p.getValue()).f121383c + m91164n();
    }

    /* JADX INFO: renamed from: p */
    public final int m91166p() {
        return ((Number) this.f121450u.getValue()).intValue();
    }

    /* JADX INFO: renamed from: q */
    public final int m91167q() {
        return ((Number) this.f121451v.getValue()).intValue();
    }

    /* JADX INFO: renamed from: r */
    public final long m91168r() {
        return ((C16617b) this.f121432c.getValue()).f63937a;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m91169s() {
        return ((int) Float.intBitsToFloat((int) (m91168r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m91168r() & 4294967295L))) == 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m91170t(float f13, C29693q c29693q) {
        InterfaceC28531j0 interfaceC28531j0;
        InterfaceC28531j0 interfaceC28531j1;
        InterfaceC28531j0 interfaceC28531j2;
        List list = c29693q.f121381a;
        if (this.f121441l && !list.isEmpty()) {
            boolean z4 = f13 > 0.0f;
            int iM91156i = m91156i(z4, c29693q);
            if (iM91156i < 0 || iM91156i >= mo91148m()) {
                return;
            }
            if (iM91156i != this.f121442m) {
                if (this.f121444o != z4 && (interfaceC28531j2 = this.f121443n) != null) {
                    interfaceC28531j2.cancel();
                }
                this.f121444o = z4;
                this.f121442m = iM91156i;
                long j7 = this.f121422B;
                C28535l0 c28535l0 = this.f121452w;
                C2817b c2817b = c28535l0.f115449c;
                this.f121443n = c2817b != null ? c2817b.m8021y(iM91156i, j7, c28535l0.f115448b, true, null) : C28523g.f115424a;
            }
            if (z4) {
                if ((((C29678d) AbstractC25265s.m74112P0(list)).f121304k + (c29693q.f121382b + c29693q.f121383c)) - c29693q.f121387g >= f13 || (interfaceC28531j1 = this.f121443n) == null) {
                    return;
                }
                interfaceC28531j1.mo86826a();
                return;
            }
            if (c29693q.f121386f - ((C29678d) AbstractC25265s.m74096F0(list)).f121304k >= (-f13) || (interfaceC28531j0 = this.f121443n) == null) {
                return;
            }
            interfaceC28531j0.mo86826a();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m91171w(float f13, int i13, boolean z4) {
        C23517o c23517o = this.f121433d;
        ((C28621h1) c23517o.f93079c).m87025y(i13);
        ((C28521f0) c23517o.f93082f).m86825a(i13);
        ((C28617g1) c23517o.f93080d).m87023y(f13);
        c23517o.f93081e = null;
        if (!z4) {
            this.f121425E.setValue(C23454a0.f92919a);
            return;
        }
        C0230n0 c0230n0 = (C0230n0) this.f121455z.getValue();
        if (c0230n0 != null) {
            c0230n0.m630m();
        }
    }
}
