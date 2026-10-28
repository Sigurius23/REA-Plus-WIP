package n21;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import java.util.List;
import jd2.C21612a;
import k71.C22246d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p319m4.AbstractC25012a;
import p353o0.C27317b;
import p353o0.C27323g;
import p353o0.InterfaceC27326j;
import p353o0.InterfaceC27335s;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: n21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "Lk71/d;", "legends", "Landroidx/compose/ui/Modifier;", "modifier", "Li2/x;", "labelColor", "Ll83/a0;", "e", "(Ljava/util/List;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26189c {

    /* JADX INFO: renamed from: n21.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f103872w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22246d c22246d) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n21.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f103873w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f103874x;

        public b(Function1 function1, List list) {
            this.f103873w = function1;
            this.f103874x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m77746a(int i13) {
            return this.f103873w.invoke(this.f103874x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m77746a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: n21.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f103875w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ long f103876x;

        public c(List list, long j7) {
            this.f103875w = list;
            this.f103876x = j7;
        }

        /* JADX INFO: renamed from: a */
        public final void m77747a(InterfaceC27326j interfaceC27326j, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC27326j) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C22246d c22246d = (C22246d) this.f103875w.get(i13);
            c28655q.m87150e0(-1458903707);
            AbstractC26194h.m77780n(null, c22246d.getLegendColor(), c22246d.getLegendText(), c22246d.getShape(), c22246d.getIcon(), this.f103876x, null, null, c28655q, 0, 193);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m77747a((InterfaceC27326j) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd A[LOOP:0: B:84:0x01c7->B:86:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0208  */
    /* JADX WARN: Code duplicated, block: B:89:0x028e  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m77740e(final List<C22246d> legends, Modifier modifier, long j7, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        long brandWhite;
        boolean z4;
        final Modifier modifier3;
        final long j13;
        C28677v1 c28677v1M87180u;
        int i15;
        C2314t c2314t;
        int i16;
        final long j14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int size;
        long j15;
        boolean z13;
        C28655q c28655q;
        long j16;
        boolean z14;
        int iHashCode2;
        C28677v1 c28677v1M87180u2;
        C2305k c2305k = C2299e.f9112O;
        AbstractC22676k.m65750j(legends, "legends");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1065021881);
        int i17 = (i13 & 6) == 0 ? (c28655q2.m87157i(legends) ? 4 : 2) | i13 : i13;
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i17 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    brandWhite = j7;
                    int i19 = c28655q2.m87151f(brandWhite) ? 256 : 128;
                    i17 |= i19;
                } else {
                    brandWhite = j7;
                }
                i17 |= i19;
            } else {
                brandWhite = j7;
            }
            if ((i17 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z4)) {
                c28655q2.m87140Z();
                i15 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i15 != 0 || c28655q2.m87118C()) {
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i17 &= -897;
                    }
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 4) != 0) {
                        i17 &= -897;
                    }
                }
                i16 = i17;
                modifier3 = modifier2;
                c28655q2.m87175r();
                if (legends.isEmpty()) {
                    c28677v1M87180u2 = c28655q2.m87180u();
                    if (c28677v1M87180u2 != null) {
                        final int i24 = 0;
                        final long j17 = brandWhite;
                        c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: n21.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i24) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC26189c.m77741f(legends, modifier3, j17, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC26189c.m77744i(legends, modifier3, j17, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                j14 = brandWhite;
                Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier3);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                size = legends.size();
                if (size != 1) {
                    c28655q2.m87150e0(-161715220);
                    j15 = j14;
                    AbstractC26194h.m77787u(legends.get(0).getLegendColor(), legends.get(0).getLegendText(), legends.get(0).getShape(), legends.get(0).getIcon(), null, null, null, null, j15, AbstractC1099a.m3396r(new HorizontalAlignElement(c2305k), 2 * 8, 0.0f, 2), c28655q2, (i16 << 18) & 234881024, 240);
                    c28655q2.m87173q(false);
                    z13 = true;
                } else if (size != 2) {
                    c28655q2.m87150e0(-161226381);
                    j15 = j14;
                    AbstractC26194h.m77787u(legends.get(0).getLegendColor(), legends.get(0).getLegendText(), legends.get(0).getShape(), legends.get(0).getIcon(), legends.get(1).getLegendColor(), legends.get(1).getLegendText(), legends.get(1).getShape(), legends.get(1).getIcon(), j15, AbstractC1099a.m3396r(new HorizontalAlignElement(c2305k), 2 * 8, 0.0f, 2), c28655q2, (i16 << 18) & 234881024, 0);
                    c28655q2.m87173q(false);
                    z13 = true;
                } else if (size != 3) {
                    c28655q2.m87150e0(-159811386);
                    j15 = j14;
                    AbstractC22953f.m66714a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * 8, 0.0f, 2), null, false, AbstractC37817c.m121344e(370646860, c28655q2, new Function3() { // from class: n21.b
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC26189c.m77742g(legends, j14, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3078, 6);
                    c28655q2.m87173q(false);
                    z13 = true;
                    c28655q2 = c28655q2;
                } else {
                    c28655q = c28655q2;
                    j16 = j14;
                    z14 = false;
                    c28655q.m87150e0(-160545435);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(new HorizontalAlignElement(c2305k), 2 * 8, 0.0f, 2);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 4), C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    c28655q.m87150e0(-2033895083);
                    for (C22246d c22246d : legends) {
                        long j18 = j16;
                        C28655q c28655q3 = c28655q;
                        AbstractC26194h.m77780n(null, c22246d.getLegendColor(), c22246d.getLegendText(), c22246d.getShape(), c22246d.getIcon(), j18, null, null, c28655q3, (i16 << 9) & 458752, 193);
                        c28655q = c28655q3;
                        z14 = z14;
                        j16 = j18;
                    }
                    long j19 = j16;
                    z13 = true;
                    boolean z15 = z14;
                    c28655q2 = c28655q;
                    AbstractC25012a.m73392y(c28655q2, z15, true, z15);
                    j15 = j19;
                }
                c28655q2.m87173q(z13);
                j13 = j15;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                j13 = brandWhite;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                final int i25 = 1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n21.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i25) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC26189c.m77741f(legends, modifier3, j13, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC26189c.m77744i(legends, modifier3, j13, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            }
        }
        i17 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                brandWhite = j7;
                if (c28655q2.m87151f(brandWhite)) {
                }
                i17 |= i19;
            } else {
                brandWhite = j7;
            }
            i17 |= i19;
        } else {
            brandWhite = j7;
        }
        if ((i17 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z4)) {
            c28655q2.m87140Z();
            i15 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i15 != 0) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i17 &= -897;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i17 &= -897;
                }
            }
            i16 = i17;
            modifier3 = modifier2;
            c28655q2.m87175r();
            if (legends.isEmpty()) {
                c28677v1M87180u2 = c28655q2.m87180u();
                if (c28677v1M87180u2 != null) {
                    final int i26 = 0;
                    final long j110 = brandWhite;
                    c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: n21.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i26) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC26189c.m77741f(legends, modifier3, j110, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC26189c.m77744i(legends, modifier3, j110, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    return;
                }
                return;
            }
            j14 = brandWhite;
            Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier3);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            size = legends.size();
            if (size != 1) {
                c28655q2.m87150e0(-161715220);
                j15 = j14;
                AbstractC26194h.m77787u(legends.get(0).getLegendColor(), legends.get(0).getLegendText(), legends.get(0).getShape(), legends.get(0).getIcon(), null, null, null, null, j15, AbstractC1099a.m3396r(new HorizontalAlignElement(c2305k), 2 * 8, 0.0f, 2), c28655q2, (i16 << 18) & 234881024, 240);
                c28655q2.m87173q(false);
                z13 = true;
            } else if (size != 2) {
                c28655q2.m87150e0(-161226381);
                j15 = j14;
                AbstractC26194h.m77787u(legends.get(0).getLegendColor(), legends.get(0).getLegendText(), legends.get(0).getShape(), legends.get(0).getIcon(), legends.get(1).getLegendColor(), legends.get(1).getLegendText(), legends.get(1).getShape(), legends.get(1).getIcon(), j15, AbstractC1099a.m3396r(new HorizontalAlignElement(c2305k), 2 * 8, 0.0f, 2), c28655q2, (i16 << 18) & 234881024, 0);
                c28655q2.m87173q(false);
                z13 = true;
            } else if (size != 3) {
                c28655q2.m87150e0(-159811386);
                j15 = j14;
                AbstractC22953f.m66714a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * 8, 0.0f, 2), null, false, AbstractC37817c.m121344e(370646860, c28655q2, new Function3() { // from class: n21.b
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC26189c.m77742g(legends, j14, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3078, 6);
                c28655q2.m87173q(false);
                z13 = true;
                c28655q2 = c28655q2;
            } else {
                c28655q = c28655q2;
                j16 = j14;
                z14 = false;
                c28655q.m87150e0(-160545435);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(new HorizontalAlignElement(c2305k), 2 * 8, 0.0f, 2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 4), C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                c28655q.m87150e0(-2033895083);
                while (r0.hasNext()) {
                    long j111 = j16;
                    C28655q c28655q4 = c28655q;
                    AbstractC26194h.m77780n(null, c22246d.getLegendColor(), c22246d.getLegendText(), c22246d.getShape(), c22246d.getIcon(), j111, null, null, c28655q4, (i16 << 9) & 458752, 193);
                    c28655q = c28655q4;
                    z14 = z14;
                    j16 = j111;
                }
                long j112 = j16;
                z13 = true;
                boolean z16 = z14;
                c28655q2 = c28655q;
                AbstractC25012a.m73392y(c28655q2, z16, true, z16);
                j15 = j112;
            }
            c28655q2.m87173q(z13);
            j13 = j15;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            j13 = brandWhite;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            final int i27 = 1;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n21.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i27) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC26189c.m77741f(legends, modifier3, j13, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC26189c.m77744i(legends, modifier3, j13, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m77741f(List list, Modifier modifier, long j7, int i13, int i14, Composer composer, int i15) {
        m77740e(list, modifier, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m77742g(List list, long j7, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i15 = 1;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int iM124765i = C39169a.m124765i(((C1101c) BoxWithConstraints).f4585b);
            C27317b c27317b = new C27317b(3);
            Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, iM124765i, 1);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22971k c22971kM66748k = AbstractC22977m.m66748k(((float) 0.5d) * 8, C2299e.f9108K);
            C22961h c22961h = AbstractC22977m.f90654e;
            boolean zM87157i = c28655q.m87157i(list) | c28655q.m87151f(j7);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21612a(list, i15, j7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32417h.m101202k(c27317b, modifierM3413j, null, null, c22971kM66748k, c22961h, null, false, null, (Function1) objM87133R, c28655q, 102432768, 668);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m77743h(List list, long j7, InterfaceC27335s LazyVerticalGrid) {
        AbstractC22676k.m65750j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        C27323g c27323g = (C27323g) LazyVerticalGrid;
        c27323g.m82467q(list.size(), new b(a.f103872w, list), new C37816b(new c(list, j7), true, -1117249557));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m77744i(List list, Modifier modifier, long j7, int i13, int i14, Composer composer, int i15) {
        m77740e(list, modifier, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
