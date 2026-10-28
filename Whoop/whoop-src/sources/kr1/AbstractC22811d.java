package kr1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gr1.C16111r;
import gr1.C16112s;
import hy0.AbstractC17755i2;
import j21.C21245d;
import jp1.C21851c;
import jp1.C21852d;
import kl2.C22571f;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: kr1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lgr1/s;", "privacyControls", "Lkotlin/Function2;", "", "", "Ll83/a0;", "onToggle", "Landroidx/compose/ui/Modifier;", "modifier", "i", "(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lgr1/r;", "control", "e", "(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22811d {
    /* JADX INFO: renamed from: e */
    private static final void m66068e(C16111r c16111r, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C16111r c16111r2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-786284263);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c16111r) : c28655q.m87157i(c16111r) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            String strM21274h = AbstractC8693b.m21274h(c16111r.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a b6 = c38072d.m121952e(c28655q, i15).getB1();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c16111r2 = c16111r;
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i15).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-1037029970, c28655q, new C21245d(6, c16111r2, interfaceC4351m)), c28655q, 24576, 13);
            c28655q.m87173q(true);
        } else {
            c16111r2 = c16111r;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c16111r2, interfaceC4351m, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m66069f(C16111r c16111r, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean isEnabled = c16111r.getIsEnabled();
            boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87157i(c16111r);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C21851c(12, interfaceC4351m, c16111r);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, isEnabled, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66070g(InterfaceC4351m interfaceC4351m, C16111r c16111r, boolean z4) {
        interfaceC4351m.invoke(c16111r.getType(), Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66071h(C16111r c16111r, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m66068e(c16111r, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m66072i(C16112s privacyControls, InterfaceC4351m onToggle, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C16111r automaticImportControl;
        C16111r automaticExportControl;
        C16111r c16111r;
        boolean z13;
        boolean z14;
        AbstractC22676k.m65750j(privacyControls, "privacyControls");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1401010801);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(privacyControls) : c28655q.m87157i(privacyControls) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onToggle) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                automaticImportControl = privacyControls.getAutomaticImportControl();
                if (automaticImportControl == null) {
                    c28655q.m87150e0(-1919657812);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1919657811);
                    m66068e(automaticImportControl, onToggle, c28655q, TextResource.$stable | (i15 & 112));
                    c28655q.m87173q(false);
                }
                automaticExportControl = privacyControls.getAutomaticExportControl();
                if (automaticExportControl == null) {
                    c28655q.m87150e0(-1919526899);
                    c28655q.m87173q(false);
                    z14 = true;
                } else {
                    c28655q.m87150e0(-1919526898);
                    if (privacyControls.getAutomaticImportControl() != null) {
                        c28655q.m87150e0(-1540085540);
                        c16111r = automaticExportControl;
                        z13 = false;
                        AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q, 0, 255);
                        c28655q.m87173q(false);
                    } else {
                        c16111r = automaticExportControl;
                        z13 = false;
                        c28655q.m87150e0(-1540041334);
                        c28655q.m87173q(false);
                    }
                    m66068e(c16111r, onToggle, c28655q, TextResource.$stable | (i15 & 112));
                    c28655q.m87173q(z13);
                    z14 = true;
                }
                c28655q.m87173q(z14);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(privacyControls, onToggle, modifier3, i13, i14, 20);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            automaticImportControl = privacyControls.getAutomaticImportControl();
            if (automaticImportControl == null) {
                c28655q.m87150e0(-1919657812);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1919657811);
                m66068e(automaticImportControl, onToggle, c28655q, TextResource.$stable | (i15 & 112));
                c28655q.m87173q(false);
            }
            automaticExportControl = privacyControls.getAutomaticExportControl();
            if (automaticExportControl == null) {
                c28655q.m87150e0(-1919526899);
                c28655q.m87173q(false);
                z14 = true;
            } else {
                c28655q.m87150e0(-1919526898);
                if (privacyControls.getAutomaticImportControl() != null) {
                    c28655q.m87150e0(-1540085540);
                    c16111r = automaticExportControl;
                    z13 = false;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q, 0, 255);
                    c28655q.m87173q(false);
                } else {
                    c16111r = automaticExportControl;
                    z13 = false;
                    c28655q.m87150e0(-1540041334);
                    c28655q.m87173q(false);
                }
                m66068e(c16111r, onToggle, c28655q, TextResource.$stable | (i15 & 112));
                c28655q.m87173q(z13);
                z14 = true;
            }
            c28655q.m87173q(z14);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(privacyControls, onToggle, modifier3, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66073j(C16112s c16112s, InterfaceC4351m interfaceC4351m, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m66072i(c16112s, interfaceC4351m, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
