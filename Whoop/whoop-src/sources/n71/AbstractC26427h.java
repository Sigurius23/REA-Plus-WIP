package n71;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import fc0.C14362f;
import fz0.C14887b;
import fz0.C14889d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: n71.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lfz0/d;", "itemState", "Ll83/a0;", "e", "(Landroidx/compose/ui/Modifier;Lfz0/d;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "thumbRadius", "b", "shadowThumbRadius", "", "zoneWidthPx", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26427h {

    /* JADX INFO: renamed from: a */
    private static final float f104963a;

    /* JADX INFO: renamed from: b */
    private static final float f104964b;

    static {
        float f13 = 4;
        f104963a = ((float) 2.5d) * f13;
        f104964b = ((float) 3.5d) * f13;
    }

    /* JADX INFO: renamed from: e */
    public static final void m78192e(Modifier modifier, final C14889d itemState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        int i16;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1028425005);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q);
            }
            final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C14362f(interfaceC28593a1, 5);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3409f, (Function1) objM87133R2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3502b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            Modifier modifier5 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f13 = f104964b;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(itemState.getHeight(), AbstractC1092a.m3358c(AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1), C17919x.m51541c(itemState.getCurrentZoneCoveredAlpha(), itemState.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0)), itemState.getZoneType().getShape())));
            C2307m c2307m = C2299e.f9102E;
            C1100b c1100b = C1100b.f4583a;
            AbstractC22989q.m66760a(c1100b.mo3400a(modifierM3409f2, c2307m), c28655q, 0);
            if (itemState.getShowThumb()) {
                c28655q.m87150e0(1042077813);
                Modifier modifierM3421r = AbstractC1102d.m3421r(c2314t, f13, f13);
                C2307m c2307m2 = C2299e.f9117z;
                Modifier modifierMo3400a = c1100b.mo3400a(modifierM3421r, c2307m2);
                int i18 = i15 & 112;
                boolean z4 = i18 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(itemState));
                Object objM87133R3 = c28655q.m87133R();
                if (z4 || objM87133R3 == c28676v0) {
                    final int i19 = 0;
                    objM87133R3 = new Function1() { // from class: n71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    return AbstractC26427h.m78196i(itemState, interfaceC28593a1, (InterfaceC39171c) obj);
                                default:
                                    return AbstractC26427h.m78197j(itemState, interfaceC28593a1, (InterfaceC39171c) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3390l = AbstractC1099a.m3390l(modifierMo3400a, (Function1) objM87133R3);
                C38072d c38072d = C38072d.f163053a;
                long jM125416r = c38072d.m121949b(c28655q, 6).getBlack30();
                C33252i c33252i = AbstractC33253j.f138651a;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3390l, jM125416r, c33252i), c28655q, 0);
                float f14 = f104963a;
                Modifier modifierMo3400a2 = c1100b.mo3400a(AbstractC1102d.m3421r(c2314t, f14, f14), c2307m2);
                boolean z13 = i18 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(itemState));
                Object objM87133R4 = c28655q.m87133R();
                if (z13 || objM87133R4 == c28676v0) {
                    final int i24 = 1;
                    objM87133R4 = new Function1() { // from class: n71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i24) {
                                case 0:
                                    return AbstractC26427h.m78196i(itemState, interfaceC28593a1, (InterfaceC39171c) obj);
                                default:
                                    return AbstractC26427h.m78197j(itemState, interfaceC28593a1, (InterfaceC39171c) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                i16 = 0;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC12889b.m36262a0(AbstractC1099a.m3390l(modifierMo3400a2, (Function1) objM87133R4), 4, null, false, 0L, 0L, 26), c38072d.m121949b(c28655q, 6).getBrandWhite(), c33252i), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                i16 = 0;
                c28655q.m87150e0(1043090707);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getLabel(), c28655q, i16), null, C17919x.m51541c(itemState.getCurrentZoneCoveredAlpha(), itemState.getColor().mo134584toComposableColorWaAFU9c(c28655q, i16)), 0L, null, null, null, 0L, null, null, 0L, 3, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN9(), null, c28655q, 0, 3120, 186362);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14887b(modifier3, itemState, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final int m78193f(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: g */
    private static final void m78194g(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m78195h(InterfaceC28593a1 interfaceC28593a1, C39180l c39180l) {
        m78194g(interfaceC28593a1, (int) (c39180l.f168422a >> 32));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C39178j m78196i(C14889d c14889d, InterfaceC28593a1 interfaceC28593a1, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) ((int) (c14889d.getPercentage() * (m78193f(interfaceC28593a1) - offset.mo743q0(f104964b))))) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C39178j m78197j(C14889d c14889d, InterfaceC28593a1 interfaceC28593a1, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) ((int) (c14889d.getPercentage() * (m78193f(interfaceC28593a1) - offset.mo743q0(f104963a))))) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m78198k(Modifier modifier, C14889d c14889d, int i13, int i14, Composer composer, int i15) {
        m78192e(modifier, c14889d, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
