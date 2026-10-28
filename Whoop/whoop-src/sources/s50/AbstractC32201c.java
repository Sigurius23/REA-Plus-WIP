package s50;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.AbstractC4106r2;
import c41.C4092p2;
import f50.AbstractC14088a;
import gz0.EnumC16313m0;
import hy0.AbstractC17808z1;
import hy0.C17723a2;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import ih0.AbstractC18489d0;
import java.util.Locale;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q81.C30048f;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r12.C30856a;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s50.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Ls50/d;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "g", "(Ls50/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "p", "(Ls50/d;Landroidx/compose/runtime/Composer;I)V", "n", "Ls50/e;", "l", "(Ls50/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "j", "(Landroidx/compose/runtime/Composer;I)V", "Lhy0/b2;", "Li2/x;", "r", "(Lhy0/b2;Landroidx/compose/runtime/Composer;I)J", "Ly3/f;", "a", "F", "CHEVRONS_WIDTH", "b", "CHEVRONS_HEIGHT", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32201c {

    /* JADX INFO: renamed from: a */
    private static final float f133342a;

    /* JADX INFO: renamed from: b */
    private static final float f133343b;

    static {
        float f13 = 4;
        f133342a = 8.5f * f13;
        f133343b = f13 * f13;
    }

    /* JADX INFO: renamed from: g */
    public static final void m100152g(C32202d viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(563221919);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC31926e.m99375j(AbstractC1136a.m3599a(modifier, "MeasurementProgress"), null, 0L, AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-336881649, c28655q, new C30856a(viewState, 17)), c28655q, 12582912, 118);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, modifier2, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m100153h(C32202d c32202d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f14, f14, f14, 3 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i14 = C17731c2.f68917p;
            int i15 = C4092p2.f16593v;
            int i16 = i14 | i15;
            m100161p(c32202d, c28655q, i16);
            m100159n(c32202d, c28655q, i16);
            C4092p2 c4092p2M100164a = c32202d.getCallout();
            if (c4092p2M100164a == null) {
                c28655q.m87150e0(1028046949);
            } else {
                c28655q.m87150e0(1028046950);
                AbstractC4106r2.m12647f(null, c4092p2M100164a, null, c28655q, i15 << 3, 5);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m100154i(C32202d c32202d, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m100152g(c32202d, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m100155j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(228750365);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC14088a.f50621a, c28655q, 0), null, AbstractC1102d.m3421r(C2314t.f9131w, f133342a, f133343b), null, null, 0.0f, null, c28655q, 432, 120);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m100156k(int i13, Composer composer, int i14) {
        m100155j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:44:0x014e  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    private static final void m100157l(C32203e c32203e, Modifier modifier, Composer composer, int i13, int i14) {
        C32203e c32203e2;
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-191073887);
        if ((i13 & 6) == 0) {
            c32203e2 = c32203e;
            i15 = i13 | (c28655q.m87153g(c32203e2) ? 4 : 2);
        } else {
            c32203e2 = c32203e;
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                long jM100163r = m100163r(c32203e2.getStyle(), c28655q, 0);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                String strM100171a = c32203e.getLabel();
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C2886a c2886aM8415M = c38072d.m121952e(c28655q, i17).getSh5();
                C36775k c36775k = new C36775k(3);
                int i18 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM100171a, modifierM3409f, jM100163r, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8415M, null, c28655q, 48, i18, 196088);
                AbstractC30795n.m94707h(c32203e.getValue(), AbstractC1102d.m3409f(1.0f, c2314t), jM100163r, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getN6(), null, c28655q, 48, i18, 196088);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(c32203e, i13, modifier3, i14, 14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            long jM100163r2 = m100163r(c32203e2.getStyle(), c28655q, 0);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            String strM100171a2 = c32203e.getLabel();
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a c2886aM8415M2 = c38072d2.m121952e(c28655q, i19).getSh5();
            C36775k c36775k2 = new C36775k(3);
            int i110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM100171a2, modifierM3409f2, jM100163r2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8415M2, null, c28655q, 48, i110, 196088);
            AbstractC30795n.m94707h(c32203e.getValue(), AbstractC1102d.m3409f(1.0f, c2314t), jM100163r2, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getN6(), null, c28655q, 48, i110, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(c32203e, i13, modifier3, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m100158m(C32203e c32203e, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m100157l(c32203e, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m100159n(C32202d c32202d, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(49119491);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c32202d) : c28655q.m87157i(c32202d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C32203e c32203eM100167e = c32202d.getStart();
            C23000t1 c23000t1 = C23000t1.f90727a;
            m100157l(c32203eM100167e, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 0, 0);
            m100155j(c28655q, 0);
            m100157l(c32202d.getLatest(), c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 0, 0);
            m100155j(c28655q, 0);
            m100157l(c32202d.getTarget(), c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32200b(c32202d, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m100160o(C32202d c32202d, int i13, Composer composer, int i14) {
        m100159n(c32202d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m100161p(C32202d c32202d, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1115019977);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c32202d) : c28655q.m87157i(c32202d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 8;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(2 * f13);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f13, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            EnumC16313m0 enumC16313m0M100165b = c32202d.getIcon();
            if (enumC16313m0M100165b == null) {
                c28655q.m87150e0(1630978145);
                z4 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1630978146);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M100165b.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite50(), c28655q, 432, 0);
                z4 = false;
                c28655q.m87173q(false);
            }
            String upperCase = c32202d.getTitle().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            C17731c2 c17731c2M100168f = c32202d.getTag();
            if (c17731c2M100168f == null) {
                c28655q.m87150e0(-1491016059);
            } else {
                c28655q.m87150e0(-1491016058);
                AbstractC17808z1.m51175c(c17731c2M100168f.m50800a((28671 & 1) != 0 ? c17731c2M100168f.text : null, (28671 & 2) != 0 ? c17731c2M100168f.includeBackground : false, (28671 & 4) != 0 ? c17731c2M100168f.trendTypeState : null, (28671 & 8) != 0 ? c17731c2M100168f.isPressed : false, (28671 & 16) != 0 ? c17731c2M100168f.icon : null, (28671 & 32) != 0 ? c17731c2M100168f.removeSideRadius : null, (28671 & 64) != 0 ? c17731c2M100168f.withIcon : false, (28671 & 128) != 0 ? c17731c2M100168f.showBorder : false, (28671 & 256) != 0 ? c17731c2M100168f.overflow : 0, (28671 & 512) != 0 ? c17731c2M100168f.maxLines : 0, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c17731c2M100168f.iconSize : 0.0f, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c17731c2M100168f.destination : null, (28671 & 4096) != 0 ? c17731c2M100168f.maxFontScaling : Float.valueOf(1.5f), (28671 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c17731c2M100168f.radius : 0.0f, (28671 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c17731c2M100168f.backgroundPaddingValues : null), c28655q, C17731c2.f68917p);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32200b(c32202d, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m100162q(C32202d c32202d, int i13, Composer composer, int i14) {
        m100161p(c32202d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final long m100163r(EnumC17727b2 enumC17727b2, Composer composer, int i13) {
        C17723a2 c17723a2M51179g;
        if (enumC17727b2 == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1657013450);
            c28655q.m87173q(false);
            c17723a2M51179g = null;
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(330546711);
            c17723a2M51179g = AbstractC17808z1.m51179g(enumC17727b2, c28655q2, i13 & 14);
            c28655q2.m87173q(false);
        }
        C17919x c17919x = c17723a2M51179g != null ? new C17919x(c17723a2M51179g.getTextColor()) : null;
        C28655q c28655q3 = (C28655q) composer;
        if (c17919x == null) {
            c28655q3.m87150e0(330548180);
            return AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, C38072d.f163054b, false);
        }
        c28655q3.m87150e0(330546568);
        c28655q3.m87173q(false);
        return c17919x.f69639a;
    }
}
