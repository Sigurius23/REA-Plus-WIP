package p007a6;

import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import io.sentry.hints.C20363j;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23468n;
import l83.C23470p;
import mc3.AbstractC25438d;
import mc3.C25437c;
import p037bu.C3632c;
import p505ts.AbstractC34132o;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0429i0 implements InterfaceC0422g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0421f1 f1471a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2994c0 f1472b;

    /* JADX INFO: renamed from: c */
    public final C13084s1 f1473c;

    /* JADX INFO: renamed from: d */
    public final C25437c f1474d;

    /* JADX INFO: renamed from: e */
    public int f1475e;

    /* JADX INFO: renamed from: f */
    public C2996c2 f1476f;

    /* JADX INFO: renamed from: g */
    public final C3632c f1477g;

    /* JADX INFO: renamed from: h */
    public final C41113q f1478h;

    /* JADX INFO: renamed from: i */
    public final C23470p f1479i;

    /* JADX INFO: renamed from: j */
    public final C23470p f1480j;

    /* JADX INFO: renamed from: k */
    public final C41113q f1481k;

    public C0429i0(InterfaceC0421f1 interfaceC0421f1, List list, C20363j c20363j, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.f1471a = interfaceC0421f1;
        this.f1472b = scope;
        InterfaceC30057d interfaceC30057d = null;
        this.f1473c = new C13084s1(new C0458v(this, interfaceC30057d, 0));
        this.f1474d = AbstractC25438d.m74669a();
        this.f1477g = new C3632c(1);
        this.f1478h = new C41113q(this, list);
        final int i13 = 0;
        this.f1479i = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: a6.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C0429i0 f1460x;

            {
                this.f1460x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f1460x.f1471a.mo1101a();
                    default:
                        return ((InterfaceC0424g1) this.f1460x.f1479i.getValue()).mo1105e();
                }
            }
        });
        final int i14 = 1;
        this.f1480j = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: a6.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C0429i0 f1460x;

            {
                this.f1460x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f1460x.f1471a.mo1101a();
                    default:
                        return ((InterfaceC0424g1) this.f1460x.f1479i.getValue()).mo1105e();
                }
            }
        });
        this.f1481k = new C41113q(scope, new C0428i(this, 0), new C0431j(0), new C0410c(this, interfaceC30057d, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m1106b(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        C0460w c0460w;
        C25437c c25437c;
        if (abstractC32269c instanceof C0460w) {
            c0460w = (C0460w) abstractC32269c;
            int i13 = c0460w.f1578z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0460w.f1578z = i13 - Integer.MIN_VALUE;
            } else {
                c0460w = new C0460w(c0429i0, abstractC32269c);
            }
        } else {
            c0460w = new C0460w(c0429i0, abstractC32269c);
        }
        Object obj = c0460w.f1576x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0460w.f1578z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C25437c c25437c2 = c0429i0.f1474d;
            c0460w.f1575w = c25437c2;
            c0460w.f1578z = 1;
            if (c25437c2.mo68211b(c0460w) == enumC31071a) {
                return enumC31071a;
            }
            c25437c = c25437c2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25437c = c0460w.f1575w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            int i15 = c0429i0.f1475e - 1;
            c0429i0.f1475e = i15;
            if (i15 == 0) {
                C2996c2 c2996c2 = c0429i0.f1476f;
                if (c2996c2 != null) {
                    c2996c2.cancel((CancellationException) null);
                }
                c0429i0.f1476f = null;
            }
            return C23454a0.f92919a;
        } finally {
            c25437c.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m1107c(C0429i0 c0429i0, C0455t0 c0455t0, AbstractC32269c abstractC32269c) {
        C0462x c0462x;
        C3058t c3058t;
        if (abstractC32269c instanceof C0462x) {
            c0462x = (C0462x) abstractC32269c;
            int i13 = c0462x.f1582z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0462x.f1582z = i13 - Integer.MIN_VALUE;
            } else {
                c0462x = new C0462x(c0429i0, abstractC32269c);
            }
        } else {
            c0462x = new C0462x(c0429i0, abstractC32269c);
        }
        Object objM107888l = c0462x.f1580x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0462x.f1582z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM107888l);
            C3058t c3058t2 = c0455t0.f1564b;
            try {
                InterfaceC30063j interfaceC30063jPlus = c0455t0.f1566d.plus(c0462x.getContext());
                C0410c c0410c = new C0410c(c0429i0, c0455t0, null, 1);
                c0462x.f1579w = c3058t2;
                c0462x.f1582z = 1;
                Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063jPlus, c0410c, c0462x);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
                objM107888l = objM8705K;
                c3058t = c3058t2;
            } catch (Throwable th3) {
                th = th3;
                c3058t = c3058t2;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3058t = c0462x.f1579w;
            try {
                AbstractC34132o.m107864I(objM107888l);
            } catch (Throwable th4) {
                th = th4;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a == null) {
            c3058t.m8807L(objM107888l);
        } else {
            c3058t.completeExceptionally(thM68037a);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m1108d(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        C0464y c0464y;
        C25437c c25437c;
        if (abstractC32269c instanceof C0464y) {
            c0464y = (C0464y) abstractC32269c;
            int i13 = c0464y.f1590z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0464y.f1590z = i13 - Integer.MIN_VALUE;
            } else {
                c0464y = new C0464y(c0429i0, abstractC32269c);
            }
        } else {
            c0464y = new C0464y(c0429i0, abstractC32269c);
        }
        Object obj = c0464y.f1588x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0464y.f1590z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C25437c c25437c2 = c0429i0.f1474d;
            c0464y.f1587w = c25437c2;
            c0464y.f1590z = 1;
            if (c25437c2.mo68211b(c0464y) == enumC31071a) {
                return enumC31071a;
            }
            c25437c = c25437c2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25437c = c0464y.f1587w;
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC30057d interfaceC30057d = null;
        try {
            int i15 = c0429i0.f1475e + 1;
            c0429i0.f1475e = i15;
            if (i15 == 1) {
                c0429i0.f1476f = AbstractC3006f0.m8732z(c0429i0.f1472b, null, null, new C0444o(c0429i0, interfaceC30057d, 1), 3);
            }
            return C23454a0.f92919a;
        } finally {
            c25437c.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r2.m133454F(r0) == r1) goto L26;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1109e(p007a6.C0429i0 r6, s83.AbstractC32269c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p007a6.C0405a0
            if (r0 == 0) goto L13
            r0 = r7
            a6.a0 r0 = (p007a6.C0405a0) r0
            int r1 = r0.f1388z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1388z = r1
            goto L18
        L13:
            a6.a0 r0 = new a6.a0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f1386x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f1388z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.f1385w
            p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L2c:
            r7 = move-exception
            goto L64
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4a
        L3a:
            p505ts.AbstractC34132o.m107864I(r7)
            a6.d1 r7 = r6.m1112h()
            r0.f1388z = r4
            java.lang.Integer r7 = r7.m1098a()
            if (r7 != r1) goto L4a
            goto L5c
        L4a:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            zt.q r2 = r6.f1478h     // Catch: java.lang.Throwable -> L60
            r0.f1385w = r7     // Catch: java.lang.Throwable -> L60
            r0.f1388z = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r2.m133454F(r0)     // Catch: java.lang.Throwable -> L60
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        L60:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L64:
            bu.c r6 = r6.f1477g
            a6.v0 r1 = new a6.v0
            r1.<init>(r0, r7)
            r6.m11161J(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0429i0.m1109e(a6.i0, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1110f(p007a6.C0429i0 r8, boolean r9, q83.InterfaceC30057d r10) throws java.lang.Throwable {
        /*
            bu.c r0 = r8.f1477g
            boolean r1 = r10 instanceof p007a6.C0408b0
            if (r1 == 0) goto L15
            r1 = r10
            a6.b0 r1 = (p007a6.C0408b0) r1
            int r2 = r1.f1396E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f1396E = r2
            goto L1a
        L15:
            a6.b0 r1 = new a6.b0
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f1399y
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r1.f1396E
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L44
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            p505ts.AbstractC34132o.m107864I(r10)
            goto La5
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            p505ts.AbstractC34132o.m107864I(r10)
            goto L8d
        L3c:
            boolean r9 = r1.f1397w
            a6.e1 r3 = r1.f1398x
            p505ts.AbstractC34132o.m107864I(r10)
            goto L60
        L44:
            p505ts.AbstractC34132o.m107864I(r10)
            a6.e1 r3 = r0.m11154C()
            boolean r10 = r3 instanceof p007a6.C0427h1
            if (r10 != 0) goto Lb9
            a6.d1 r10 = r8.m1112h()
            r1.f1398x = r3
            r1.f1397w = r9
            r1.f1396E = r6
            java.lang.Integer r10 = r10.m1098a()
            if (r10 != r2) goto L60
            goto La4
        L60:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r6 = r3 instanceof p007a6.C0407b
            if (r6 == 0) goto L70
            r7 = r3
            a6.b r7 = (p007a6.C0407b) r7
            int r7 = r7.f1440a
            goto L71
        L70:
            r7 = -1
        L71:
            if (r6 == 0) goto L76
            if (r10 != r7) goto L76
            return r3
        L76:
            r10 = 0
            if (r9 == 0) goto L90
            a6.d1 r9 = r8.m1112h()
            a33.c r3 = new a33.c
            r3.<init>(r8, r10)
            r1.f1398x = r10
            r1.f1396E = r5
            java.lang.Object r10 = r9.m1099b(r3, r1)
            if (r10 != r2) goto L8d
            goto La4
        L8d:
            l83.k r10 = (l83.C23465k) r10
            goto La7
        L90:
            a6.d1 r9 = r8.m1112h()
            a6.c0 r3 = new a6.c0
            r5 = 0
            r3.<init>(r8, r7, r10, r5)
            r1.f1398x = r10
            r1.f1396E = r4
            java.lang.Object r10 = r9.m1100c(r3, r1)
            if (r10 != r2) goto La5
        La4:
            return r2
        La5:
            l83.k r10 = (l83.C23465k) r10
        La7:
            java.lang.Object r8 = r10.f92937w
            a6.e1 r8 = (p007a6.AbstractC0418e1) r8
            java.lang.Object r9 = r10.f92938x
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb8
            r0.m11161J(r8)
        Lb8:
            return r8
        Lb9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0429i0.m1110f(a6.i0, boolean, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5 A[Catch: CorruptionException -> 0x0099, TryCatch #0 {CorruptionException -> 0x0099, blocks: (B:36:0x0094, B:68:0x0118, B:41:0x009e, B:65:0x00fc, B:44:0x00a8, B:60:0x00e0, B:47:0x00ae, B:55:0x00c5, B:56:0x00c9, B:51:0x00b7, B:62:0x00ec), top: B:72:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        if (r10 == r1) goto L67;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1111g(p007a6.C0429i0 r8, boolean r9, s83.AbstractC32269c r10) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0429i0.m1111g(a6.i0, boolean, s83.c):java.lang.Object");
    }

    @Override // p007a6.InterfaceC0422g
    /* JADX INFO: renamed from: a */
    public final Object mo1102a(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        C0436k1 c0436k1 = (C0436k1) interfaceC30057d.getContext().get(C0433j1.f1489w);
        if (c0436k1 != null) {
            c0436k1.m1119a(this);
        }
        return AbstractC3006f0.m8705K(new C0436k1(c0436k1, this), new C0458v(this, interfaceC4351m, (InterfaceC30057d) null), interfaceC30057d);
    }

    @Override // p007a6.InterfaceC0422g
    public final InterfaceC13058l getData() {
        return this.f1473c;
    }

    /* JADX INFO: renamed from: h */
    public final C0415d1 m1112h() {
        return (C0415d1) this.f1480j.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final Object m1113i(AbstractC32269c abstractC32269c) {
        return ((InterfaceC0424g1) this.f1479i.getValue()).mo1103b(new C0450r(3, (InterfaceC30057d) null), abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m1114j(Object obj, boolean z4, AbstractC32269c abstractC32269c) {
        C0423g0 c0423g0;
        C22665e0 c22665e0;
        if (abstractC32269c instanceof C0423g0) {
            c0423g0 = (C0423g0) abstractC32269c;
            int i13 = c0423g0.f1458z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0423g0.f1458z = i13 - Integer.MIN_VALUE;
            } else {
                c0423g0 = new C0423g0(this, abstractC32269c);
            }
        } else {
            c0423g0 = new C0423g0(this, abstractC32269c);
        }
        Object obj2 = c0423g0.f1456x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0423g0.f1458z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            C22665e0 c22665e1 = new C22665e0();
            InterfaceC0424g1 interfaceC0424g1 = (InterfaceC0424g1) this.f1479i.getValue();
            C0426h0 c0426h0 = new C0426h0(c22665e1, this, obj, z4, null);
            c0423g0.f1455w = c22665e1;
            c0423g0.f1458z = 1;
            if (interfaceC0424g1.mo1104c(c0426h0, c0423g0) == enumC31071a) {
                return enumC31071a;
            }
            c22665e0 = c22665e1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22665e0 = c0423g0.f1455w;
            AbstractC34132o.m107864I(obj2);
        }
        return new Integer(c22665e0.f89334w);
    }
}
