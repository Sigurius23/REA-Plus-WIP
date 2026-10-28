package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16276e;
import hy0.AbstractC17746g1;
import hy0.AbstractC17795v0;
import kd1.C22411w;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p738tv0.AbstractC34204d;
import p738tv0.Function0;
import pv0.C29577d;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC37785x {
    /* JADX INFO: renamed from: a */
    public static final void m121280a(C29577d viewState, Function1 onEvent, Composer composer, int i13) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1758741856);
        int i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13 | (c28655q.m87157i(onEvent) ? 32 : 16);
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState.getIsLoading()) {
            c28655q.m87150e0(1524302108);
            AbstractC34204d.m108117b(c28655q, 0);
            c28655q.m87173q(false);
        } else if (viewState.getIsError()) {
            c28655q.m87150e0(1524303209);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27314o(onEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            Function0.m108114b((InterfaceC4339a) objM87133R, c28655q, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1524305588);
            m121284e(viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16342h(viewState, onEvent, i13, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m121281b(String str, TextResource textResource, Composer composer, int i13) {
        int i14;
        TextResource textResource2 = textResource;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1662025618);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (AbstractC39421y.m125921F(textResource2.resolve((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).toString(), str, true)) {
            c28655q.m87150e0(-1022022274);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC17746g1.m50874j(textResource2, c38072d.m121949b(c28655q, i15).getBrandWhite(), null, c38072d.m121949b(c28655q, i15).getBrandBlack(), null, false, null, null, 0.0f, null, C22411w.f87680a.m64535a().m64090c(), 1 * 8, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, TextResource.$stable | (i14 & 14), 48, 0, 8385524);
            c28655q.m87173q(false);
            c28655q = c28655q;
            textResource2 = textResource;
        } else {
            c28655q.m87150e0(-1021744080);
            textResource2 = textResource;
            AbstractC17746g1.m50874j(textResource2, 0L, null, 0L, null, false, null, null, 0.0f, null, C22411w.f87680a.m64535a().m64090c(), 1 * 8, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, TextResource.$stable | (i14 & 14), 48, 0, 8385534);
            c28655q = c28655q;
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(textResource2, str, i13, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m121282c(TextResource textResource, TextResource textResource2, TextResource textResource3, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1846340058);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(textResource3) : c28655q.m87157i(textResource3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 3 * f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | (i14 & 14));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t2, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB3(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            EnumC27284v enumC27284v = EnumC27284v.TextSmall;
            String strM21268b = AbstractC8693b.m21268b(textResource2);
            boolean z13 = (i14 & 7168) == 2048;
            if ((i14 & 896) == 256 || ((i14 & 512) != 0 && c28655q.m87157i(textResource3))) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C17820i(1, function1, textResource3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(null, enumC27284v, strM21268b, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 121);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(textResource, textResource2, textResource3, function1, i13, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m121283d(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(507238144);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13 * 4, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 3 * f13, 7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26047n(i13, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0389  */
    /* JADX WARN: Code duplicated, block: B:104:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:105:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0427  */
    /* JADX WARN: Code duplicated, block: B:115:0x0429  */
    /* JADX WARN: Code duplicated, block: B:119:0x043e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:41:0x016b  */
    /* JADX WARN: Code duplicated, block: B:46:0x018b  */
    /* JADX WARN: Code duplicated, block: B:49:0x019f  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0218  */
    /* JADX WARN: Code duplicated, block: B:54:0x021a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0223  */
    /* JADX WARN: Code duplicated, block: B:61:0x0255  */
    /* JADX WARN: Code duplicated, block: B:63:0x025d  */
    /* JADX WARN: Code duplicated, block: B:68:0x027d  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0305  */
    /* JADX WARN: Code duplicated, block: B:86:0x0311  */
    /* JADX WARN: Code duplicated, block: B:87:0x0313  */
    /* JADX WARN: Code duplicated, block: B:91:0x0328  */
    /* JADX WARN: Code duplicated, block: B:94:0x0364  */
    /* JADX WARN: Code duplicated, block: B:95:0x0368  */
    /* JADX INFO: renamed from: e */
    public static final void m121284e(C29577d c29577d, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        Context context;
        int i16;
        boolean z4;
        C28676v0 c28676v0;
        Object obj;
        int iHashCode;
        C0213j c0213j;
        Object objM87133R;
        boolean z13;
        Object obj2;
        C0213j c0213j2;
        C2307m c2307m;
        boolean z14;
        Object obj3;
        boolean z15;
        int iHashCode2;
        C0213j c0213j3;
        C0209i c0209i;
        int i17;
        C2314t c2314t;
        int i18;
        int iHashCode3;
        int i19;
        boolean z16;
        boolean zM87157i;
        int i24;
        Object obj4;
        C28655q c28655q2;
        boolean z17;
        boolean zM87157i2;
        Object obj5;
        int i25;
        boolean z18;
        boolean zM87157i3;
        Object obj6;
        int iHashCode4;
        C0213j c0213j4;
        C0209i c0209i2;
        C29577d c29577d2 = c29577d;
        C2307m c2307m2 = C2299e.f9114w;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-397921851);
        int i26 = i13 | (c28655q3.m87157i(c29577d2) ? 4 : 2) | (c28655q3.m87157i(function1) ? 32 : 16);
        if (c28655q3.m87135U(i26 & 1, (i26 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t2, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            int iHashCode5 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM94757f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j5 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j5);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q3.f115903S) {
                i15 = i26;
            } else {
                i15 = i26;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode5))) {
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N);
                context = (Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q3.m87150e0(-231755962);
                float f13 = 8;
                float f14 = 1 * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, f14, 0.0f, 0.0f, 13);
                AbstractC6721d.a aVarM20172c = AbstractC6721d.Companion.m20172c(AbstractC6721d.INSTANCE, c29577d2.getToolbarTitle(), null, null, 6, null);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object objM87133R2 = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                if (!z4 || objM87133R2 == c28676v0) {
                    C27314o c27314o = new C27314o(function1, 1);
                    c28655q3.m87172p0(c27314o);
                    obj = c27314o;
                } else {
                    obj = objM87133R2;
                }
                AbstractC6719b.m20143d(modifierM3398t, aVarM20172c, null, (InterfaceC4339a) obj, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f15 = 2 * f13;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3388j(c2314t2, EnumC22935a1.f90537w), f15, 0.0f, f15, f15, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3398t2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c0213j = c0213j5;
                    c28655q3.m87163l(c0213j);
                } else {
                    c0213j = c0213j5;
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N2);
                TextResource searchQuery = c29577d.getSearchQuery();
                TextResource searchTextPlaceholder = c29577d.getSearchTextPlaceholder();
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    z13 = false;
                    C28503p c28503p = new C28503p(0);
                    c28655q3.m87172p0(c28503p);
                    obj2 = c28503p;
                } else {
                    z13 = false;
                    obj2 = objM87133R;
                }
                Function1 function2 = (Function1) obj2;
                int i27 = TextResource.$stable;
                c0213j2 = c0213j;
                c2307m = c2307m2;
                AbstractC17795v0.m51127j(null, searchQuery, searchTextPlaceholder, null, 0L, 0, false, null, 0L, false, null, false, false, null, function2, c28655q3, (i27 << 3) | (i27 << 6), 24576, 16377);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t2), C17919x.f69636m, AbstractC17918w0.f69621a), "ContentSearchSearchField");
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Object objM87133R3 = c28655q3.m87133R();
                obj3 = objM87133R3;
                if (z14 || objM87133R3 == c28676v0) {
                    C27314o c27314o2 = new C27314o(function1, 2);
                    c28655q3.m87172p0(c27314o2);
                    obj3 = c27314o2;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3599a, false, null, null, (InterfaceC4339a) obj3, 15);
                z15 = false;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3362g);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c0213j3 = c0213j2;
                    c28655q3.m87163l(c0213j3);
                } else {
                    c0213j3 = c0213j2;
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m3);
                if (c28655q3.f115903S && AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i = c0209i5;
                } else {
                    c0209i = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N3);
                i17 = 1;
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                c2314t = c2314t2;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, f15, 0.0f, f15, 4 * f13, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f14, c2305k), C2299e.f9108K, c28655q3, 54);
                i18 = i16;
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3398t3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j3);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i3, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m4);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N4);
                c28655q3.m87150e0(-1895817452);
                for (TextResource textResource : c29577d.m90673b()) {
                    i25 = i18;
                    if (i25 == 32) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    zM87157i3 = z18 | c28655q3.m87157i(textResource) | c28655q3.m87157i(c29577d);
                    Object objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (zM87157i3 || objM87133R4 == c28676v0) {
                        C3718c c3718c = new C3718c(function1, textResource, c29577d, i17);
                        c28655q3.m87172p0(c3718c);
                        obj6 = c3718c;
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) obj6, 15);
                    C2314t c2314t3 = c2314t;
                    C2307m c2307m3 = c2307m;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m3, z15);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3362g2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                    m121281b(c29577d.getSelectedFilter(), textResource, c28655q3, TextResource.$stable);
                    c28655q3.m87173q(true);
                    i18 = i25;
                    c2307m = c2307m3;
                    c2314t = c2314t3;
                    z15 = false;
                }
                boolean z19 = z15;
                i19 = i18;
                c28655q3.m87173q(z19);
                c28655q3.m87173q(true);
                C26068u c26068uM77569a = AbstractC26071x.m77569a(z19 ? 1 : 0, z19 ? 1 : 0, c28655q3, 3);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, f15, 0.0f, 10);
                C22949e c22949e = AbstractC22977m.f90650a;
                C22971k c22971kM66748k = AbstractC22977m.m66748k(3 * f13, C2299e.f9107J);
                C2305k c2305k2 = C2299e.f9111N;
                boolean zM87157i4 = c28655q3.m87157i(c29577d);
                if (i19 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = zM87157i4 | z16 | c28655q3.m87157i(c29577d);
                Object objM87133R5 = c28655q3.m87133R();
                if (!zM87157i || objM87133R5 == c28676v0) {
                    i24 = 0;
                    C29656q c29656q = new C29656q(c29577d, c29577d, function1, i24);
                    c28655q3.m87172p0(c29656q);
                    obj4 = c29656q;
                } else {
                    i24 = 0;
                    obj4 = objM87133R5;
                }
                c29577d2 = c29577d;
                AbstractC22674j.m65717c(modifierM3398t4, c26068uM77569a, null, c22971kM66748k, c2305k2, null, false, null, (Function1) obj4, c28655q3, 221190, 460);
                c28655q2 = c28655q3;
                String nextToken = c29577d2.getNextToken();
                if (i19 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i2 = z17 | c28655q2.m87157i(c29577d2) | c28655q2.m87157i(context);
                Object objM87133R6 = c28655q2.m87133R();
                obj5 = objM87133R6;
                if (zM87157i2 || objM87133R6 == c28676v0) {
                    C3718c c3718c2 = new C3718c(function1, c29577d2, context, 2);
                    c28655q2.m87172p0(c3718c2);
                    obj5 = c3718c2;
                }
                m121285f(c26068uM77569a, 0, nextToken, (InterfaceC4339a) obj5, c28655q2, 0);
                i14 = 0;
                c28655q2.m87173q(false);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
            }
            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i5);
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N);
            context = (Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q3.m87150e0(-231755962);
            float f16 = 8;
            float f17 = 1 * f16;
            Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t2, 0.0f, f17, 0.0f, 0.0f, 13);
            AbstractC6721d.a aVarM20172c2 = AbstractC6721d.Companion.m20172c(AbstractC6721d.INSTANCE, c29577d2.getToolbarTitle(), null, null, 6, null);
            i16 = i15 & 112;
            if (i16 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object objM87133R7 = c28655q3.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z4) {
                C27314o c27314o3 = new C27314o(function1, 1);
                c28655q3.m87172p0(c27314o3);
                obj = c27314o3;
            } else {
                C27314o c27314o4 = new C27314o(function1, 1);
                c28655q3.m87172p0(c27314o4);
                obj = c27314o4;
            }
            AbstractC6719b.m20143d(modifierM3398t5, aVarM20172c2, null, (InterfaceC4339a) obj, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f18 = 2 * f16;
            Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1099a.m3388j(c2314t2, EnumC22935a1.f90537w), f18, 0.0f, f18, f18, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM3398t6);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c0213j = c0213j5;
                c28655q3.m87163l(c0213j);
            } else {
                c0213j = c0213j5;
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m6);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N6);
            TextResource searchQuery2 = c29577d.getSearchQuery();
            TextResource searchTextPlaceholder2 = c29577d.getSearchTextPlaceholder();
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                z13 = false;
                C28503p c28503p2 = new C28503p(0);
                c28655q3.m87172p0(c28503p2);
                obj2 = c28503p2;
            } else {
                z13 = false;
                obj2 = objM87133R;
            }
            Function1 function3 = (Function1) obj2;
            int i28 = TextResource.$stable;
            c0213j2 = c0213j;
            c2307m = c2307m2;
            AbstractC17795v0.m51127j(null, searchQuery2, searchTextPlaceholder2, null, 0L, 0, false, null, 0L, false, null, false, false, null, function3, c28655q3, (i28 << 3) | (i28 << 6), 24576, 16377);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t2), C17919x.f69636m, AbstractC17918w0.f69621a), "ContentSearchSearchField");
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object objM87133R8 = c28655q3.m87133R();
            obj3 = objM87133R8;
            if (z14) {
                C27314o c27314o5 = new C27314o(function1, 2);
                c28655q3.m87172p0(c27314o5);
                obj3 = c27314o5;
            } else {
                C27314o c27314o6 = new C27314o(function1, 2);
                c28655q3.m87172p0(c27314o6);
                obj3 = c27314o6;
            }
            Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3599a2, false, null, null, (InterfaceC4339a) obj3, 15);
            z15 = false;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM3362g3);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c0213j3 = c0213j2;
                c28655q3.m87163l(c0213j3);
            } else {
                c0213j3 = c0213j2;
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m7);
            if (c28655q3.f115903S) {
                c0209i = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                c0209i = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N7);
            i17 = 1;
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            c2314t = c2314t2;
            Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, f18, 0.0f, f18, 4 * f16, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f17, c2305k), C2299e.f9108K, c28655q3, 54);
            i18 = i16;
            iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3398t7);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j3);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i3, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m8);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N8);
            c28655q3.m87150e0(-1895817452);
            while (r0.hasNext()) {
                i25 = i18;
                if (i25 == 32) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                zM87157i3 = z18 | c28655q3.m87157i(textResource) | c28655q3.m87157i(c29577d);
                Object objM87133R9 = c28655q3.m87133R();
                obj6 = objM87133R9;
                if (zM87157i3) {
                    C3718c c3718c3 = new C3718c(function1, textResource, c29577d, i17);
                    c28655q3.m87172p0(c3718c3);
                    obj6 = c3718c3;
                } else {
                    C3718c c3718c4 = new C3718c(function1, textResource, c29577d, i17);
                    c28655q3.m87172p0(c3718c4);
                    obj6 = c3718c4;
                }
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) obj6, 15);
                C2314t c2314t4 = c2314t;
                C2307m c2307m4 = c2307m;
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, z15);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM3362g4);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m9);
                c0209i2 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N9);
                m121281b(c29577d.getSelectedFilter(), textResource, c28655q3, TextResource.$stable);
                c28655q3.m87173q(true);
                i18 = i25;
                c2307m = c2307m4;
                c2314t = c2314t4;
                z15 = false;
            }
            boolean z110 = z15;
            i19 = i18;
            c28655q3.m87173q(z110);
            c28655q3.m87173q(true);
            C26068u c26068uM77569a2 = AbstractC26071x.m77569a(z110 ? 1 : 0, z110 ? 1 : 0, c28655q3, 3);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, f18, 0.0f, 10);
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22971k c22971kM66748k2 = AbstractC22977m.m66748k(3 * f16, C2299e.f9107J);
            C2305k c2305k3 = C2299e.f9111N;
            boolean zM87157i5 = c28655q3.m87157i(c29577d);
            if (i19 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i = zM87157i5 | z16 | c28655q3.m87157i(c29577d);
            Object objM87133R10 = c28655q3.m87133R();
            if (zM87157i) {
                i24 = 0;
                C29656q c29656q2 = new C29656q(c29577d, c29577d, function1, i24);
                c28655q3.m87172p0(c29656q2);
                obj4 = c29656q2;
            } else {
                i24 = 0;
                C29656q c29656q3 = new C29656q(c29577d, c29577d, function1, i24);
                c28655q3.m87172p0(c29656q3);
                obj4 = c29656q3;
            }
            c29577d2 = c29577d;
            AbstractC22674j.m65717c(modifierM3398t8, c26068uM77569a2, null, c22971kM66748k2, c2305k3, null, false, null, (Function1) obj4, c28655q3, 221190, 460);
            c28655q2 = c28655q3;
            String nextToken2 = c29577d2.getNextToken();
            if (i19 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i2 = z17 | c28655q2.m87157i(c29577d2) | c28655q2.m87157i(context);
            Object objM87133R11 = c28655q2.m87133R();
            obj5 = objM87133R11;
            if (zM87157i2) {
                C3718c c3718c5 = new C3718c(function1, c29577d2, context, 2);
                c28655q2.m87172p0(c3718c5);
                obj5 = c3718c5;
            } else {
                C3718c c3718c6 = new C3718c(function1, c29577d2, context, 2);
                c28655q2.m87172p0(c3718c6);
                obj5 = c3718c6;
            }
            m121285f(c26068uM77569a2, 0, nextToken2, (InterfaceC4339a) obj5, c28655q2, 0);
            i14 = 0;
            c28655q2.m87173q(false);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
        } else {
            i14 = 0;
            C28655q c28655q4 = c28655q3;
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16342h(c29577d2, function1, i13, i14);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m121285f(C26068u c26068u, int i13, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2036994140);
        int i15 = (c28655q.m87153g(c26068u) ? 4 : 2) | i14 | 432 | (c28655q.m87153g(str) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(interfaceC4339a) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK);
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            boolean z4 = (i15 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C17820i(0, c26068u, str));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | ((i15 & 57344) == 16384);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C12473e(interfaceC28670t2, (Object) interfaceC4339a, (InterfaceC30057d) null, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28670t2);
            i13 = 10;
        } else {
            c28655q.m87138X();
        }
        int i16 = i13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(c26068u, i16, str, interfaceC4339a, i14);
        }
    }
}
