package p077d0;

import al.AbstractC0954a;
import bc3.C3033m;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import i93.C18284j;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.AbstractC25260n;
import mc3.AbstractC25438d;
import mc3.C25437c;
import p002a0.C0047q0;
import p007a6.C0438l0;
import p114eb.C12982q;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28633k1;
import p505ts.AbstractC34132o;
import p668z1.C39973v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11350f1 extends AbstractC0954a {

    /* JADX INFO: renamed from: S */
    public static final C11380n f36378S = new C11380n(0.0f);

    /* JADX INFO: renamed from: T */
    public static final C11380n f36379T = new C11380n(1.0f);

    /* JADX INFO: renamed from: E */
    public Object f36380E;

    /* JADX INFO: renamed from: F */
    public C11421z1 f36381F;

    /* JADX INFO: renamed from: G */
    public long f36382G;

    /* JADX INFO: renamed from: H */
    public final C0438l0 f36383H;

    /* JADX INFO: renamed from: I */
    public final C28617g1 f36384I;

    /* JADX INFO: renamed from: J */
    public C3033m f36385J;

    /* JADX INFO: renamed from: K */
    public final C25437c f36386K;

    /* JADX INFO: renamed from: L */
    public final C11402t0 f36387L;

    /* JADX INFO: renamed from: M */
    public long f36388M;

    /* JADX INFO: renamed from: N */
    public final C0047q0 f36389N;

    /* JADX INFO: renamed from: O */
    public C11417y0 f36390O;

    /* JADX INFO: renamed from: P */
    public final C11414x0 f36391P;

    /* JADX INFO: renamed from: Q */
    public float f36392Q;

    /* JADX INFO: renamed from: R */
    public final C11414x0 f36393R;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f36394y;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f36395z;

    /* JADX WARN: Type inference failed for: r3v6, types: [d0.x0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [d0.x0] */
    public C11350f1(C12982q c12982q) {
        super(1);
        this.f36394y = AbstractC28683x.m87272z(c12982q);
        this.f36395z = AbstractC28683x.m87272z(c12982q);
        this.f36380E = c12982q;
        this.f36383H = new C0438l0(this, 7);
        this.f36384I = new C28617g1(0.0f);
        this.f36386K = AbstractC25438d.m74669a();
        this.f36387L = new C11402t0();
        this.f36388M = Long.MIN_VALUE;
        this.f36389N = new C0047q0();
        final int i13 = 0;
        this.f36391P = new Function1(this) { // from class: d0.x0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11350f1 f36611x;

            {
                this.f36611x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l7 = (Long) obj;
                switch (i13) {
                    case 0:
                        this.f36611x.f36388M = l7.longValue();
                        break;
                    default:
                        long jLongValue = l7.longValue();
                        C11350f1 c11350f1 = this.f36611x;
                        long j7 = jLongValue - c11350f1.f36388M;
                        c11350f1.f36388M = jLongValue;
                        long jM36259Y = AbstractC12889b.m36259Y(j7 / ((double) c11350f1.f36392Q));
                        C0047q0 c0047q0 = c11350f1.f36389N;
                        if (c0047q0.m105h()) {
                            Object[] objArr = c0047q0.f136a;
                            int i14 = c0047q0.f137b;
                            int i15 = 0;
                            for (int i16 = 0; i16 < i14; i16++) {
                                C11417y0 c11417y0 = (C11417y0) objArr[i16];
                                C11350f1.m30581N0(c11417y0, jM36259Y);
                                c11417y0.m30655j(true);
                            }
                            C11421z1 c11421z1 = c11350f1.f36381F;
                            if (c11421z1 != null) {
                                c11421z1.m30673o();
                            }
                            int i17 = c0047q0.f137b;
                            Object[] objArr2 = c0047q0.f136a;
                            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i17);
                            int i18 = c18284jM36278i0.f71133w;
                            int i19 = c18284jM36278i0.f71134x;
                            if (i18 <= i19) {
                                while (true) {
                                    objArr2[i18 - i15] = objArr2[i18];
                                    if (((C11417y0) objArr2[i18]).m30653h()) {
                                        i15++;
                                    }
                                    if (i18 != i19) {
                                        i18++;
                                    }
                                }
                            }
                            AbstractC25260n.m74073n0(i17 - i15, i17, null, objArr2);
                            c0047q0.f137b -= i15;
                        }
                        C11417y0 c11417y1 = c11350f1.f36390O;
                        if (c11417y1 != null) {
                            c11417y1.m30656k(c11350f1.f36382G);
                            C11350f1.m30581N0(c11417y1, jM36259Y);
                            c11350f1.m30586Q0(c11417y1.m30652g());
                            if (c11417y1.m30652g() == 1.0f) {
                                c11350f1.f36390O = null;
                            }
                            c11350f1.m30585P0();
                        }
                        break;
                }
                return C23454a0.f92919a;
            }
        };
        final int i14 = 1;
        this.f36393R = new Function1(this) { // from class: d0.x0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11350f1 f36611x;

            {
                this.f36611x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l7 = (Long) obj;
                switch (i14) {
                    case 0:
                        this.f36611x.f36388M = l7.longValue();
                        break;
                    default:
                        long jLongValue = l7.longValue();
                        C11350f1 c11350f1 = this.f36611x;
                        long j7 = jLongValue - c11350f1.f36388M;
                        c11350f1.f36388M = jLongValue;
                        long jM36259Y = AbstractC12889b.m36259Y(j7 / ((double) c11350f1.f36392Q));
                        C0047q0 c0047q0 = c11350f1.f36389N;
                        if (c0047q0.m105h()) {
                            Object[] objArr = c0047q0.f136a;
                            int i15 = c0047q0.f137b;
                            int i16 = 0;
                            for (int i17 = 0; i17 < i15; i17++) {
                                C11417y0 c11417y0 = (C11417y0) objArr[i17];
                                C11350f1.m30581N0(c11417y0, jM36259Y);
                                c11417y0.m30655j(true);
                            }
                            C11421z1 c11421z1 = c11350f1.f36381F;
                            if (c11421z1 != null) {
                                c11421z1.m30673o();
                            }
                            int i18 = c0047q0.f137b;
                            Object[] objArr2 = c0047q0.f136a;
                            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i18);
                            int i19 = c18284jM36278i0.f71133w;
                            int i110 = c18284jM36278i0.f71134x;
                            if (i19 <= i110) {
                                while (true) {
                                    objArr2[i19 - i16] = objArr2[i19];
                                    if (((C11417y0) objArr2[i19]).m30653h()) {
                                        i16++;
                                    }
                                    if (i19 != i110) {
                                        i19++;
                                    }
                                }
                            }
                            AbstractC25260n.m74073n0(i18 - i16, i18, null, objArr2);
                            c0047q0.f137b -= i16;
                        }
                        C11417y0 c11417y1 = c11350f1.f36390O;
                        if (c11417y1 != null) {
                            c11417y1.m30656k(c11350f1.f36382G);
                            C11350f1.m30581N0(c11417y1, jM36259Y);
                            c11350f1.m30586Q0(c11417y1.m30652g());
                            if (c11417y1.m30652g() == 1.0f) {
                                c11350f1.f36390O = null;
                            }
                            c11350f1.m30585P0();
                        }
                        break;
                }
                return C23454a0.f92919a;
            }
        };
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m30577H0(C11350f1 c11350f1) {
        C11421z1 c11421z1 = c11350f1.f36381F;
        C28617g1 c28617g1 = c11350f1.f36384I;
        if (c11421z1 == null) {
            return;
        }
        C11417y0 c11417y0 = c11350f1.f36390O;
        if (c11417y0 == null) {
            if (c11350f1.f36382G <= 0 || c28617g1.m87022x() == 1.0f || AbstractC22676k.m65745e(c11350f1.f36395z.getValue(), c11350f1.f36394y.getValue())) {
                c11417y0 = null;
            } else {
                c11417y0 = new C11417y0();
                c11417y0.m30658m(c28617g1.m87022x());
                long j7 = c11350f1.f36382G;
                c11417y0.m30656k(j7);
                c11417y0.m30654i(AbstractC12889b.m36259Y((1.0d - ((double) c28617g1.m87022x())) * j7));
                c11417y0.m30651f().mo30611e(c28617g1.m87022x(), 0);
            }
        }
        if (c11417y0 != null) {
            c11417y0.m30656k(c11350f1.f36382G);
            c11350f1.f36389N.m98a(c11417y0);
            c11421z1.m30671m(c11417y0);
        }
        c11350f1.f36390O = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: I0 */
    public static final Object m30578I0(C11350f1 c11350f1, AbstractC32269c abstractC32269c) {
        C11330a1 c11330a1;
        C0047q0 c0047q0 = c11350f1.f36389N;
        if (abstractC32269c instanceof C11330a1) {
            c11330a1 = (C11330a1) abstractC32269c;
            int i13 = c11330a1.f36299y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11330a1.f36299y = i13 - Integer.MIN_VALUE;
            } else {
                c11330a1 = new C11330a1(c11350f1, abstractC32269c);
            }
        } else {
            c11330a1 = new C11330a1(c11350f1, abstractC32269c);
        }
        Object obj = c11330a1.f36297w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c11330a1.f36299y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (c0047q0.m104g() && c11350f1.f36390O == null) {
                return c23454a0;
            }
            if (AbstractC11348f.m30568p(c11330a1.getContext()) == 0.0f) {
                c11350f1.m30583M0();
                c11350f1.f36388M = Long.MIN_VALUE;
                return c23454a0;
            }
            if (c11350f1.f36388M == Long.MIN_VALUE) {
                C11414x0 c11414x0 = c11350f1.f36391P;
                c11330a1.f36299y = 1;
                if (AbstractC28683x.m87268v(c11330a1.getContext()).mo7286k(c11414x0, c11330a1) != obj2) {
                }
            }
            return obj2;
        }
        if (i14 != 1 && i14 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        do {
            if (!c0047q0.m105h() && c11350f1.f36390O == null) {
                c11350f1.f36388M = Long.MIN_VALUE;
                return c23454a0;
            }
            c11330a1.f36299y = 2;
        } while (c11350f1.m30582L0(c11330a1) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: J0 */
    public static final Object m30579J0(C11350f1 c11350f1, AbstractC32269c abstractC32269c) {
        C11342d1 c11342d1;
        Object value;
        Object obj;
        C25437c c25437c = c11350f1.f36386K;
        if (abstractC32269c instanceof C11342d1) {
            c11342d1 = (C11342d1) abstractC32269c;
            int i13 = c11342d1.f36338z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11342d1.f36338z = i13 - Integer.MIN_VALUE;
            } else {
                c11342d1 = new C11342d1(c11350f1, abstractC32269c);
            }
        } else {
            c11342d1 = new C11342d1(c11350f1, abstractC32269c);
        }
        Object obj2 = c11342d1.f36336x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11342d1.f36338z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            value = c11350f1.f36394y.getValue();
            c11342d1.f36335w = value;
            c11342d1.f36338z = 1;
            if (c25437c.mo68211b(c11342d1) != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            Object obj3 = c11342d1.f36335w;
            AbstractC34132o.m107864I(obj2);
            value = obj3;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c11342d1.f36335w;
            AbstractC34132o.m107864I(obj2);
        }
        if (AbstractC22676k.m65745e(obj2, obj)) {
            return C23454a0.f92919a;
        }
        c11350f1.f36388M = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        c11342d1.f36335w = value;
        c11342d1.f36338z = 2;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c11342d1));
        c3033m.m8774s();
        c11350f1.f36385J = c3033m;
        c25437c.mo68214i(null);
        Object objM8773r = c3033m.m8773r();
        if (objM8773r != enumC31071a) {
            obj = value;
            obj2 = objM8773r;
            if (AbstractC22676k.m65745e(obj2, obj)) {
                return C23454a0.f92919a;
            }
            c11350f1.f36388M = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0086, please report this as an issue */
    /* JADX INFO: renamed from: K0 */
    public static final Object m30580K0(C11350f1 c11350f1, AbstractC32269c abstractC32269c) {
        C11346e1 c11346e1;
        Object value;
        Object obj;
        C25437c c25437c = c11350f1.f36386K;
        if (abstractC32269c instanceof C11346e1) {
            c11346e1 = (C11346e1) abstractC32269c;
            int i13 = c11346e1.f36355z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11346e1.f36355z = i13 - Integer.MIN_VALUE;
            } else {
                c11346e1 = new C11346e1(c11350f1, abstractC32269c);
            }
        } else {
            c11346e1 = new C11346e1(c11350f1, abstractC32269c);
        }
        Object obj2 = c11346e1.f36353x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11346e1.f36355z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            value = c11350f1.f36394y.getValue();
            c11346e1.f36352w = value;
            c11346e1.f36355z = 1;
            if (c25437c.mo68211b(c11346e1) != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            Object obj3 = c11346e1.f36352w;
            AbstractC34132o.m107864I(obj2);
            value = obj3;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c11346e1.f36352w;
            AbstractC34132o.m107864I(obj2);
        }
        if (!AbstractC22676k.m65745e(obj2, obj)) {
            c11350f1.f36388M = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return C23454a0.f92919a;
        if (!AbstractC22676k.m65745e(value, c11350f1.f36380E)) {
            c11346e1.f36352w = value;
            c11346e1.f36355z = 2;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c11346e1));
            c3033m.m8774s();
            c11350f1.f36385J = c3033m;
            c25437c.mo68214i(null);
            Object objM8773r = c3033m.m8773r();
            if (objM8773r != enumC31071a) {
                obj = value;
                obj2 = objM8773r;
                if (!AbstractC22676k.m65745e(obj2, obj)) {
                    c11350f1.f36388M = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return enumC31071a;
        }
        c25437c.mo68214i(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N0 */
    public static void m30581N0(C11417y0 c11417y0, long j7) {
        long jM30650e = c11417y0.m30650e() + j7;
        c11417y0.m30657l(jM30650e);
        long jM30647b = c11417y0.m30647b();
        if (jM30650e >= jM30647b) {
            c11417y0.m30658m(1.0f);
            return;
        }
        InterfaceC11355g2 interfaceC11355g2M30646a = c11417y0.m30646a();
        if (interfaceC11355g2M30646a == null) {
            float f13 = jM30650e / jM30647b;
            c11417y0.m30658m((f13 * 1.0f) + ((1 - f13) * c11417y0.m30651f().mo30607a(0)));
            return;
        }
        C11380n c11380nM30651f = c11417y0.m30651f();
        C11380n c11380nM30649d = c11417y0.m30649d();
        if (c11380nM30649d == null) {
            c11380nM30649d = f36378S;
        }
        c11417y0.m30658m(AbstractC12889b.m36283m(((C11380n) interfaceC11355g2M30646a.mo2202h(jM30650e, c11380nM30651f, f36379T, c11380nM30649d)).mo30607a(0), 0.0f, 1.0f));
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: B0 */
    public final void mo2414B0(Object obj) {
        this.f36395z.setValue(obj);
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: C0 */
    public final void mo2415C0(C11421z1 c11421z1) {
        C11421z1 c11421z2 = this.f36381F;
        if (c11421z2 != null && !c11421z1.equals(c11421z2)) {
            AbstractC11405u0.m30639b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f36381F + ", new instance: " + c11421z1);
        }
        this.f36381F = c11421z1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l83.h] */
    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: D0 */
    public final void mo2416D0() {
        this.f36381F = null;
        ((C39973v) AbstractC11343d2.f36340b.getValue()).m128202b(this);
    }

    /* JADX INFO: renamed from: L0 */
    public final Object m30582L0(AbstractC32269c abstractC32269c) {
        float fM30568p = AbstractC11348f.m30568p(abstractC32269c.getContext());
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (fM30568p <= 0.0f) {
            m30583M0();
            return c23454a0;
        }
        this.f36392Q = fM30568p;
        Object objMo7286k = AbstractC28683x.m87268v(abstractC32269c.getContext()).mo7286k(this.f36393R, abstractC32269c);
        return objMo7286k == EnumC31071a.f128113w ? objMo7286k : c23454a0;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m30583M0() {
        C11421z1 c11421z1 = this.f36381F;
        if (c11421z1 != null) {
            c11421z1.m30661c();
        }
        this.f36389N.m100c();
        if (this.f36390O != null) {
            this.f36390O = null;
            m30586Q0(1.0f);
            m30585P0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final Object m30584O0(float f13, Object obj, AbstractC32275i abstractC32275i) {
        if (0.0f > f13 || f13 > 1.0f) {
            AbstractC11405u0.m30638a("Expecting fraction between 0 and 1. Got " + f13);
        }
        C11421z1 c11421z1 = this.f36381F;
        if (c11421z1 != null) {
            Object objM30636a = C11402t0.m30636a(this.f36387L, new C11338c1(obj, this.f36394y.getValue(), this, c11421z1, f13, null), abstractC32275i);
            if (objM30636a == EnumC31071a.f128113w) {
                return objM30636a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m30585P0() {
        C11421z1 c11421z1 = this.f36381F;
        if (c11421z1 == null) {
            return;
        }
        c11421z1.m30670l(AbstractC12889b.m36259Y(((double) this.f36384I.m87022x()) * ((Number) c11421z1.f36641l.getValue()).longValue()));
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m30586Q0(float f13) {
        this.f36384I.m87023y(f13);
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: y0 */
    public final Object mo2428y0() {
        return this.f36395z.getValue();
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: z0 */
    public final Object mo2429z0() {
        return this.f36394y.getValue();
    }
}
