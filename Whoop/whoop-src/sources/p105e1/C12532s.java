package p105e1;

import aa3.C0627i1;
import android.os.Trace;
import j93.InterfaceC21493z;
import java.util.HashMap;
import java.util.List;
import m83.C25271y;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0262w0;
import p005a3.C0238p0;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0216j2;
import p005a3.InterfaceC0245r;
import p007a6.C0438l0;
import p026b2.AbstractC2316v;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p208i2.C17924z0;
import p208i2.InterfaceC17868a0;
import p208i2.InterfaceC17915v;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p268k0.AbstractC22086a;
import p270k2.AbstractC22132f;
import p270k2.C22134h;
import p294l3.C23242a;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23285v0;
import p294l3.C23286w;
import p294l3.InterfaceC23243a0;
import p318m3.C24983m;
import p392p3.InterfaceC28770h;
import p571w3.C36776l;
import p635y2.AbstractC39083d;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C12532s extends AbstractC2316v implements InterfaceC0186c0, InterfaceC0245r, InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public String f42823O;

    /* JADX INFO: renamed from: P */
    public C23285v0 f42824P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC28770h f42825Q;

    /* JADX INFO: renamed from: R */
    public int f42826R;

    /* JADX INFO: renamed from: S */
    public boolean f42827S;

    /* JADX INFO: renamed from: T */
    public int f42828T;

    /* JADX INFO: renamed from: U */
    public int f42829U;

    /* JADX INFO: renamed from: V */
    public InterfaceC17868a0 f42830V;

    /* JADX INFO: renamed from: W */
    public HashMap f42831W;

    /* JADX INFO: renamed from: X */
    public C12520g f42832X;

    /* JADX INFO: renamed from: Y */
    public C12530q f42833Y;

    /* JADX INFO: renamed from: Z */
    public C12531r f42834Z;

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        C12520g c12520gM35204X0;
        C12531r c12531r = this.f42834Z;
        if (c12531r == null) {
            c12520gM35204X0 = m35204X0();
        } else {
            if (!c12531r.f42821c) {
                c12531r = null;
            }
            if (c12531r == null || (c12520gM35204X0 = c12531r.f42822d) == null) {
                c12520gM35204X0 = m35204X0();
            }
        }
        c12520gM35204X0.m35180d(abstractC0262w0);
        return c12520gM35204X0.m35177a(i13, abstractC0262w0.getLayoutDirection());
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        C12520g c12520gM35204X0;
        if (this.f9141N) {
            C12531r c12531r = this.f42834Z;
            if (c12531r == null) {
                c12520gM35204X0 = m35204X0();
            } else {
                if (!c12531r.f42821c) {
                    c12531r = null;
                }
                if (c12531r == null || (c12520gM35204X0 = c12531r.f42822d) == null) {
                    c12520gM35204X0 = m35204X0();
                }
            }
            C23242a c23242a = c12520gM35204X0.f42763j;
            if (c23242a == null) {
                AbstractC22086a.m63159b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f42832X + ", textSubstitution=" + this.f42834Z + ')');
                throw new KotlinNothingValueException();
            }
            InterfaceC17915v interfaceC17915vM716w = c0238p0.f815w.f85852x.m716w();
            boolean z4 = c12520gM35204X0.f42764k;
            if (z4) {
                long j7 = c12520gM35204X0.f42765l;
                interfaceC17915vM716w.mo51426q();
                interfaceC17915vM716w.mo51415e(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L), 1);
            }
            try {
                C23267m0 c23267m0 = this.f42824P.f92255a;
                C36776l c36776l = c23267m0.f92203m;
                if (c36776l == null) {
                    c36776l = C36776l.f157351b;
                }
                C36776l c36776l2 = c36776l;
                C17924z0 c17924z0 = c23267m0.f92204n;
                if (c17924z0 == null) {
                    c17924z0 = C17924z0.f69668d;
                }
                C17924z0 c17924z1 = c17924z0;
                AbstractC22132f abstractC22132f = c23267m0.f92206p;
                if (abstractC22132f == null) {
                    abstractC22132f = C22134h.f85857a;
                }
                AbstractC22132f abstractC22132f2 = abstractC22132f;
                AbstractC17911t abstractC17911tMo117876c = c23267m0.f92191a.mo117876c();
                if (abstractC17911tMo117876c != null) {
                    c23242a.m67295g(interfaceC17915vM716w, abstractC17911tMo117876c, this.f42824P.f92255a.f92191a.mo117874a(), c17924z1, c36776l2, abstractC22132f2);
                } else {
                    InterfaceC17868a0 interfaceC17868a0 = this.f42830V;
                    long jMo3457a = interfaceC17868a0 != null ? interfaceC17868a0.mo3457a() : C17919x.f69637n;
                    if (jMo3457a == 16) {
                        jMo3457a = this.f42824P.m67366c() != 16 ? this.f42824P.m67366c() : C17919x.f69625b;
                    }
                    c23242a.m67294f(interfaceC17915vM716w, jMo3457a, c17924z1, c36776l2, abstractC22132f2);
                }
            } finally {
                if (z4) {
                    interfaceC17915vM716w.mo51417g();
                }
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final C12520g m35204X0() {
        if (this.f42832X == null) {
            this.f42832X = new C12520g(this.f42823O, this.f42824P, this.f42825Q, this.f42826R, this.f42827S, this.f42828T, this.f42829U);
        }
        C12520g c12520g = this.f42832X;
        AbstractC22676k.m65747g(c12520g);
        return c12520g;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x0073, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        C12520g c12520gM35204X0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            C12531r c12531r = this.f42834Z;
            if (c12531r == null) {
                c12520gM35204X0 = m35204X0();
            } else {
                if (!c12531r.f42821c) {
                    c12531r = null;
                }
                if (c12531r == null || (c12520gM35204X0 = c12531r.f42822d) == null) {
                    c12520gM35204X0 = m35204X0();
                }
            }
            c12520gM35204X0.m35180d(interfaceC39133t0);
            boolean zM35178b = c12520gM35204X0.m35178b(j7, interfaceC39133t0.getLayoutDirection());
            InterfaceC23243a0 interfaceC23243a0 = c12520gM35204X0.f42767n;
            if (interfaceC23243a0 != null) {
                interfaceC23243a0.mo1618b();
            }
            C23242a c23242a = c12520gM35204X0.f42763j;
            AbstractC22676k.m65747g(c23242a);
            C24983m c24983m = c23242a.f92101d;
            long j13 = c12520gM35204X0.f42765l;
            if (zM35178b) {
                AbstractC0201g.m514n(this, 2).m3542n1();
                HashMap map = this.f42831W;
                if (map == null) {
                    map = new HashMap(2);
                    this.f42831W = map;
                }
                map.put(AbstractC39083d.f168140a, Integer.valueOf(Math.round(c24983m.m73310d(0))));
                map.put(AbstractC39083d.f168141b, Integer.valueOf(Math.round(c24983m.m73310d(c24983m.f97769g - 1))));
            }
            int i13 = (int) (j13 >> 32);
            int i14 = (int) (j13 & 4294967295L);
            AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC35854l.m113834n(i13, i13, i14, i14));
            HashMap map2 = this.f42831W;
            AbstractC22676k.m65747g(map2);
            return interfaceC39133t0.mo86822W(i13, i14, map2, new C12526m(abstractC39104j1Mo448T, 1));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        C12520g c12520gM35204X0;
        C12531r c12531r = this.f42834Z;
        if (c12531r == null) {
            c12520gM35204X0 = m35204X0();
        } else {
            if (!c12531r.f42821c) {
                c12531r = null;
            }
            if (c12531r == null || (c12520gM35204X0 = c12531r.f42822d) == null) {
                c12520gM35204X0 = m35204X0();
            }
        }
        c12520gM35204X0.m35180d(abstractC0262w0);
        return AbstractC37056f.m118989l(c12520gM35204X0.m35181e(abstractC0262w0.getLayoutDirection()).mo1623g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [e1.q] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        C12530q c12530q = this.f42833Y;
        ?? r10 = c12530q;
        if (c12530q == null) {
            final int i13 = 0;
            ?? r14 = new Function1(this) { // from class: e1.q

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C12532s f42818x;

                {
                    this.f42818x = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    InterfaceC39171c interfaceC39171c;
                    C23277r0 c23277r0;
                    boolean z4;
                    switch (i13) {
                        case 0:
                            List list = (List) obj;
                            C12532s c12532s = this.f42818x;
                            C12520g c12520gM35204X0 = c12532s.m35204X0();
                            C23285v0 c23285v0 = c12532s.f42824P;
                            InterfaceC17868a0 interfaceC17868a0 = c12532s.f42830V;
                            C23285v0 c23285v0M67365f = C23285v0.m67365f(c23285v0, interfaceC17868a0 != null ? interfaceC17868a0.mo3457a() : C17919x.f69637n, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                            EnumC39181m enumC39181m = c12520gM35204X0.f42768o;
                            C23277r0 c23277r1 = null;
                            if (enumC39181m == null || (interfaceC39171c = c12520gM35204X0.f42762i) == null) {
                                c23277r0 = null;
                            } else {
                                C23254g c23254g = new C23254g(c12520gM35204X0.f42754a);
                                if (c12520gM35204X0.f42763j == null || c12520gM35204X0.f42767n == null) {
                                    c23277r0 = null;
                                } else {
                                    long j7 = c12520gM35204X0.f42769p & (-8589934589L);
                                    int i14 = c12520gM35204X0.f42759f;
                                    boolean z13 = c12520gM35204X0.f42758e;
                                    int i15 = c12520gM35204X0.f42757d;
                                    InterfaceC28770h interfaceC28770h = c12520gM35204X0.f42756c;
                                    C25271y c25271y = C25271y.f99162w;
                                    c23277r0 = new C23277r0(new C23275q0(c23254g, c23285v0M67365f, c25271y, i14, z13, i15, interfaceC39171c, enumC39181m, interfaceC28770h, j7), new C23286w(new C0627i1(c23254g, c23285v0M67365f, c25271y, interfaceC39171c, interfaceC28770h), j7, c12520gM35204X0.f42759f, c12520gM35204X0.f42757d), c12520gM35204X0.f42765l);
                                }
                            }
                            if (c23277r0 != null) {
                                list.add(c23277r0);
                                c23277r1 = c23277r0;
                            }
                            return Boolean.valueOf(c23277r1 != null);
                        case 1:
                            String str = ((C23254g) obj).f92135x;
                            C12532s c12532s2 = this.f42818x;
                            C12531r c12531r = c12532s2.f42834Z;
                            if (c12531r == null) {
                                C12531r c12531r2 = new C12531r(c12532s2.f42823O, str);
                                C12520g c12520g = new C12520g(str, c12532s2.f42824P, c12532s2.f42825Q, c12532s2.f42826R, c12532s2.f42827S, c12532s2.f42828T, c12532s2.f42829U);
                                c12520g.m35180d(c12532s2.m35204X0().f42762i);
                                c12531r2.f42822d = c12520g;
                                c12532s2.f42834Z = c12531r2;
                            } else if (!AbstractC22676k.m65745e(str, c12531r.f42820b)) {
                                c12531r.f42820b = str;
                                C12520g c12520g2 = c12531r.f42822d;
                                if (c12520g2 != null) {
                                    C23285v0 c23285v1 = c12532s2.f42824P;
                                    InterfaceC28770h interfaceC28770h2 = c12532s2.f42825Q;
                                    int i16 = c12532s2.f42826R;
                                    boolean z14 = c12532s2.f42827S;
                                    int i17 = c12532s2.f42828T;
                                    int i18 = c12532s2.f42829U;
                                    c12520g2.f42754a = str;
                                    c12520g2.f42755b = c23285v1;
                                    c12520g2.f42756c = interfaceC28770h2;
                                    c12520g2.f42757d = i16;
                                    c12520g2.f42758e = z14;
                                    c12520g2.f42759f = i17;
                                    c12520g2.f42760g = i18;
                                    c12520g2.f42772s = (c12520g2.f42772s << 2) | 2;
                                    c12520g2.m35179c();
                                }
                            }
                            AbstractC0201g.m510j(c12532s2);
                            AbstractC0201g.m509i(c12532s2);
                            AbstractC0201g.m508h(c12532s2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C12532s c12532s3 = this.f42818x;
                            C12531r c12531r3 = c12532s3.f42834Z;
                            if (c12531r3 == null) {
                                z4 = false;
                            } else {
                                c12531r3.f42821c = zBooleanValue;
                                AbstractC0201g.m510j(c12532s3);
                                AbstractC0201g.m509i(c12532s3);
                                AbstractC0201g.m508h(c12532s3);
                                z4 = true;
                            }
                            return Boolean.valueOf(z4);
                    }
                }
            };
            this.f42833Y = r14;
            r10 = r14;
        }
        AbstractC18041w.m51813l(interfaceC18044z, new C23254g(this.f42823O));
        C12531r c12531r = this.f42834Z;
        if (c12531r != null) {
            boolean z4 = c12531r.f42821c;
            C18043y c18043y = AbstractC18039u.f70021C;
            InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
            InterfaceC21493z interfaceC21493z = interfaceC21493zArr[16];
            c18043y.m51817a(interfaceC18044z, Boolean.valueOf(z4));
            C23254g c23254g = new C23254g(c12531r.f42820b);
            C18043y c18043y2 = AbstractC18039u.f70020B;
            InterfaceC21493z interfaceC21493z2 = interfaceC21493zArr[15];
            c18043y2.m51817a(interfaceC18044z, c23254g);
        }
        final int i14 = 1;
        Function1 function1 = new Function1(this) { // from class: e1.q

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C12532s f42818x;

            {
                this.f42818x = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC39171c interfaceC39171c;
                C23277r0 c23277r0;
                boolean z13;
                switch (i14) {
                    case 0:
                        List list = (List) obj;
                        C12532s c12532s = this.f42818x;
                        C12520g c12520gM35204X0 = c12532s.m35204X0();
                        C23285v0 c23285v0 = c12532s.f42824P;
                        InterfaceC17868a0 interfaceC17868a0 = c12532s.f42830V;
                        C23285v0 c23285v0M67365f = C23285v0.m67365f(c23285v0, interfaceC17868a0 != null ? interfaceC17868a0.mo3457a() : C17919x.f69637n, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                        EnumC39181m enumC39181m = c12520gM35204X0.f42768o;
                        C23277r0 c23277r1 = null;
                        if (enumC39181m == null || (interfaceC39171c = c12520gM35204X0.f42762i) == null) {
                            c23277r0 = null;
                        } else {
                            C23254g c23254g2 = new C23254g(c12520gM35204X0.f42754a);
                            if (c12520gM35204X0.f42763j == null || c12520gM35204X0.f42767n == null) {
                                c23277r0 = null;
                            } else {
                                long j7 = c12520gM35204X0.f42769p & (-8589934589L);
                                int i15 = c12520gM35204X0.f42759f;
                                boolean z14 = c12520gM35204X0.f42758e;
                                int i16 = c12520gM35204X0.f42757d;
                                InterfaceC28770h interfaceC28770h = c12520gM35204X0.f42756c;
                                C25271y c25271y = C25271y.f99162w;
                                c23277r0 = new C23277r0(new C23275q0(c23254g2, c23285v0M67365f, c25271y, i15, z14, i16, interfaceC39171c, enumC39181m, interfaceC28770h, j7), new C23286w(new C0627i1(c23254g2, c23285v0M67365f, c25271y, interfaceC39171c, interfaceC28770h), j7, c12520gM35204X0.f42759f, c12520gM35204X0.f42757d), c12520gM35204X0.f42765l);
                            }
                        }
                        if (c23277r0 != null) {
                            list.add(c23277r0);
                            c23277r1 = c23277r0;
                        }
                        return Boolean.valueOf(c23277r1 != null);
                    case 1:
                        String str = ((C23254g) obj).f92135x;
                        C12532s c12532s2 = this.f42818x;
                        C12531r c12531r2 = c12532s2.f42834Z;
                        if (c12531r2 == null) {
                            C12531r c12531r3 = new C12531r(c12532s2.f42823O, str);
                            C12520g c12520g = new C12520g(str, c12532s2.f42824P, c12532s2.f42825Q, c12532s2.f42826R, c12532s2.f42827S, c12532s2.f42828T, c12532s2.f42829U);
                            c12520g.m35180d(c12532s2.m35204X0().f42762i);
                            c12531r3.f42822d = c12520g;
                            c12532s2.f42834Z = c12531r3;
                        } else if (!AbstractC22676k.m65745e(str, c12531r2.f42820b)) {
                            c12531r2.f42820b = str;
                            C12520g c12520g2 = c12531r2.f42822d;
                            if (c12520g2 != null) {
                                C23285v0 c23285v1 = c12532s2.f42824P;
                                InterfaceC28770h interfaceC28770h2 = c12532s2.f42825Q;
                                int i17 = c12532s2.f42826R;
                                boolean z15 = c12532s2.f42827S;
                                int i18 = c12532s2.f42828T;
                                int i19 = c12532s2.f42829U;
                                c12520g2.f42754a = str;
                                c12520g2.f42755b = c23285v1;
                                c12520g2.f42756c = interfaceC28770h2;
                                c12520g2.f42757d = i17;
                                c12520g2.f42758e = z15;
                                c12520g2.f42759f = i18;
                                c12520g2.f42760g = i19;
                                c12520g2.f42772s = (c12520g2.f42772s << 2) | 2;
                                c12520g2.m35179c();
                            }
                        }
                        AbstractC0201g.m510j(c12532s2);
                        AbstractC0201g.m509i(c12532s2);
                        AbstractC0201g.m508h(c12532s2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C12532s c12532s3 = this.f42818x;
                        C12531r c12531r4 = c12532s3.f42834Z;
                        if (c12531r4 == null) {
                            z13 = false;
                        } else {
                            c12531r4.f42821c = zBooleanValue;
                            AbstractC0201g.m510j(c12532s3);
                            AbstractC0201g.m509i(c12532s3);
                            AbstractC0201g.m508h(c12532s3);
                            z13 = true;
                        }
                        return Boolean.valueOf(z13);
                }
            }
        };
        C18043y c18043y3 = AbstractC18029k.f69964k;
        C18017a c18017a = new C18017a(null, function1);
        C18030l c18030l = (C18030l) interfaceC18044z;
        c18030l.m51772e(c18043y3, c18017a);
        final int i15 = 2;
        c18030l.m51772e(AbstractC18029k.f69965l, new C18017a(null, new Function1(this) { // from class: e1.q

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C12532s f42818x;

            {
                this.f42818x = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC39171c interfaceC39171c;
                C23277r0 c23277r0;
                boolean z13;
                switch (i15) {
                    case 0:
                        List list = (List) obj;
                        C12532s c12532s = this.f42818x;
                        C12520g c12520gM35204X0 = c12532s.m35204X0();
                        C23285v0 c23285v0 = c12532s.f42824P;
                        InterfaceC17868a0 interfaceC17868a0 = c12532s.f42830V;
                        C23285v0 c23285v0M67365f = C23285v0.m67365f(c23285v0, interfaceC17868a0 != null ? interfaceC17868a0.mo3457a() : C17919x.f69637n, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                        EnumC39181m enumC39181m = c12520gM35204X0.f42768o;
                        C23277r0 c23277r1 = null;
                        if (enumC39181m == null || (interfaceC39171c = c12520gM35204X0.f42762i) == null) {
                            c23277r0 = null;
                        } else {
                            C23254g c23254g2 = new C23254g(c12520gM35204X0.f42754a);
                            if (c12520gM35204X0.f42763j == null || c12520gM35204X0.f42767n == null) {
                                c23277r0 = null;
                            } else {
                                long j7 = c12520gM35204X0.f42769p & (-8589934589L);
                                int i16 = c12520gM35204X0.f42759f;
                                boolean z14 = c12520gM35204X0.f42758e;
                                int i17 = c12520gM35204X0.f42757d;
                                InterfaceC28770h interfaceC28770h = c12520gM35204X0.f42756c;
                                C25271y c25271y = C25271y.f99162w;
                                c23277r0 = new C23277r0(new C23275q0(c23254g2, c23285v0M67365f, c25271y, i16, z14, i17, interfaceC39171c, enumC39181m, interfaceC28770h, j7), new C23286w(new C0627i1(c23254g2, c23285v0M67365f, c25271y, interfaceC39171c, interfaceC28770h), j7, c12520gM35204X0.f42759f, c12520gM35204X0.f42757d), c12520gM35204X0.f42765l);
                            }
                        }
                        if (c23277r0 != null) {
                            list.add(c23277r0);
                            c23277r1 = c23277r0;
                        }
                        return Boolean.valueOf(c23277r1 != null);
                    case 1:
                        String str = ((C23254g) obj).f92135x;
                        C12532s c12532s2 = this.f42818x;
                        C12531r c12531r2 = c12532s2.f42834Z;
                        if (c12531r2 == null) {
                            C12531r c12531r3 = new C12531r(c12532s2.f42823O, str);
                            C12520g c12520g = new C12520g(str, c12532s2.f42824P, c12532s2.f42825Q, c12532s2.f42826R, c12532s2.f42827S, c12532s2.f42828T, c12532s2.f42829U);
                            c12520g.m35180d(c12532s2.m35204X0().f42762i);
                            c12531r3.f42822d = c12520g;
                            c12532s2.f42834Z = c12531r3;
                        } else if (!AbstractC22676k.m65745e(str, c12531r2.f42820b)) {
                            c12531r2.f42820b = str;
                            C12520g c12520g2 = c12531r2.f42822d;
                            if (c12520g2 != null) {
                                C23285v0 c23285v1 = c12532s2.f42824P;
                                InterfaceC28770h interfaceC28770h2 = c12532s2.f42825Q;
                                int i18 = c12532s2.f42826R;
                                boolean z15 = c12532s2.f42827S;
                                int i19 = c12532s2.f42828T;
                                int i110 = c12532s2.f42829U;
                                c12520g2.f42754a = str;
                                c12520g2.f42755b = c23285v1;
                                c12520g2.f42756c = interfaceC28770h2;
                                c12520g2.f42757d = i18;
                                c12520g2.f42758e = z15;
                                c12520g2.f42759f = i19;
                                c12520g2.f42760g = i110;
                                c12520g2.f42772s = (c12520g2.f42772s << 2) | 2;
                                c12520g2.m35179c();
                            }
                        }
                        AbstractC0201g.m510j(c12532s2);
                        AbstractC0201g.m509i(c12532s2);
                        AbstractC0201g.m508h(c12532s2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C12532s c12532s3 = this.f42818x;
                        C12531r c12531r4 = c12532s3.f42834Z;
                        if (c12531r4 == null) {
                            z13 = false;
                        } else {
                            c12531r4.f42821c = zBooleanValue;
                            AbstractC0201g.m510j(c12532s3);
                            AbstractC0201g.m509i(c12532s3);
                            AbstractC0201g.m508h(c12532s3);
                            z13 = true;
                        }
                        return Boolean.valueOf(z13);
                }
            }
        }));
        c18030l.m51772e(AbstractC18029k.f69966m, new C18017a(null, new C0438l0(this, 11)));
        AbstractC18041w.m51803b(interfaceC18044z, r10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        C12520g c12520gM35204X0;
        C12531r c12531r = this.f42834Z;
        if (c12531r == null) {
            c12520gM35204X0 = m35204X0();
        } else {
            if (!c12531r.f42821c) {
                c12531r = null;
            }
            if (c12531r == null || (c12520gM35204X0 = c12531r.f42822d) == null) {
                c12520gM35204X0 = m35204X0();
            }
        }
        c12520gM35204X0.m35180d(abstractC0262w0);
        return AbstractC37056f.m118989l(c12520gM35204X0.m35181e(abstractC0262w0.getLayoutDirection()).mo1619c());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        C12520g c12520gM35204X0;
        C12531r c12531r = this.f42834Z;
        if (c12531r == null) {
            c12520gM35204X0 = m35204X0();
        } else {
            if (!c12531r.f42821c) {
                c12531r = null;
            }
            if (c12531r == null || (c12520gM35204X0 = c12531r.f42822d) == null) {
                c12520gM35204X0 = m35204X0();
            }
        }
        c12520gM35204X0.m35180d(abstractC0262w0);
        return c12520gM35204X0.m35177a(i13, abstractC0262w0.getLayoutDirection());
    }
}
