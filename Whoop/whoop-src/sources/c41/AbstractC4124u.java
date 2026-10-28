package c41;

import a01.C0085e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15676d;
import gz0.AbstractC16319p0;
import jy0.AbstractC22046b;
import kd1.AbstractC22403o;
import ky0.AbstractC22890b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p163g1.InterfaceC14948a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.u */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lc41/r;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onToggle", "Landroidx/compose/ui/Modifier;", "modifier", "c", "(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lg1/a1;", "f", "(Landroidx/compose/runtime/Composer;I)Lg1/a1;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4124u {
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m12707c(C4103r state, InterfaceC4339a onToggle, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        long jM95628d;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1804190911);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
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
                    modifier2 = C2314t.f9131w;
                }
                if (AbstractC4110s.m12668a(state)) {
                    c28655q.m87150e0(1430928019);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1430981618);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                AbstractC31926e.m99375j(modifier2, null, jM95628d, null, null, null, 0.0f, AbstractC37817c.m121344e(1461647151, c28655q, new C0003a0(10, state, onToggle)), c28655q, ((i15 >> 6) & 14) | 12582912, 122);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e((Object) state, (Object) onToggle, modifier3, i13, i14, 28);
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
                modifier2 = C2314t.f9131w;
            }
            if (AbstractC4110s.m12668a(state)) {
                c28655q.m87150e0(1430928019);
                jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1430981618);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            AbstractC31926e.m99375j(modifier2, null, jM95628d, null, null, null, 0.0f, AbstractC37817c.m121344e(1461647151, c28655q, new C0003a0(10, state, onToggle)), c28655q, ((i15 >> 6) & 14) | 12582912, 122);
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e((Object) state, (Object) onToggle, modifier3, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m12708d(C4103r c4103r, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        long jMo134584toComposableColorWaAFU9c;
        long jM95627c;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC15676d.m44101d(AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), AbstractC4110s.m12668a(c4103r), null, null, interfaceC4339a, 14), "activity_tile_selection_" + c4103r.getActivityV2Id()), f14, ((float) 1.5d) * f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            if (AbstractC4110s.m12668a(c4103r)) {
                c28655q.m87150e0(-1927240633);
                jMo134584toComposableColorWaAFU9c = EnumC39333f.STRAIN.mo134584toComposableColorWaAFU9c(c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1927155259);
                jMo134584toComposableColorWaAFU9c = EnumC39333f.WHITE_20.mo134584toComposableColorWaAFU9c(c28655q, 6);
                c28655q.m87173q(false);
            }
            long j7 = jMo134584toComposableColorWaAFU9c;
            AbstractC22403o icon = c4103r.getIcon();
            if (icon == null) {
                icon = new AbstractC22403o.a(AbstractC16319p0.m46430a().getAction().getAdd());
            }
            AbstractC22046b.m63097b(false, false, null, j7, icon, c4103r.getScoreDisplay(), null, c28655q, 54, 68);
            String strM21274h = AbstractC8693b.m21274h(c4103r.getTitle(), c28655q, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C38072d c38072d = C38072d.f163053a;
            C2886a h7 = c38072d.m121952e(c28655q, 6).getH4();
            if (AbstractC4110s.m12668a(c4103r)) {
                jM95627c = AbstractC25012a.m73366B(c28655q, -1926713261, c38072d, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                jM95627c = AbstractC31061c.m95627c(c28655q, -1926639946, c38072d, c28655q, 6);
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, 0, 196600);
            AbstractC22890b.m66525e(c4103r.getEndTimeText(), c4103r.getStartTimeText(), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m12709e(C4103r c4103r, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m12707c(c4103r, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC14948a1 m12710f(Composer composer, int i13) {
        C38072d c38072d = C38072d.f163053a;
        return AbstractC12240d.m34081r(c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandBlack(), c38072d.m121949b(composer, 6).getWhite20(), composer, 0, 16);
    }
}
