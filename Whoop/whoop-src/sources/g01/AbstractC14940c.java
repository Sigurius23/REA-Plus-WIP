package g01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d71.C11757c;
import f01.C13857f;
import f02.C13917c;
import gy0.AbstractC16277f;
import hy0.AbstractC17746g1;
import hy0.AbstractC17808z1;
import hy0.C17730c1;
import hy0.C17731c2;
import hy0.C17750h1;
import hy0.EnumC17727b2;
import hy0.EnumC17775o1;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p133f1.C13989w1;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: g01.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lg01/d;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lg01/a;", "body", "i", "(Lg01/a;Landroidx/compose/runtime/Composer;I)V", "Lhy0/c2;", "a", "Lhy0/c2;", "fertilityLowTrend", "b", "fertilityHighTrend", "Lhy0/h1;", "c", "Lhy0/h1;", "waitingToConfirmTag", "d", "confirmedTag", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14940c {

    /* JADX INFO: renamed from: a */
    private static final C17731c2 f55715a = new C17731c2(AbstractC8693b.m21278l("Low"), true, EnumC17727b2.NO_CHANGE, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null);

    /* JADX INFO: renamed from: b */
    private static final C17731c2 f55716b = new C17731c2(AbstractC8693b.m21278l("High"), true, EnumC17727b2.POSITIVE_GREEN, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null);

    /* JADX INFO: renamed from: c */
    private static final C17750h1 f55717c;

    /* JADX INFO: renamed from: d */
    private static final C17750h1 f55718d;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Waiting to confirm");
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        EnumC39333f enumC39333f2 = EnumC39333f.TRANSPARENT;
        float f13 = 2 * 4;
        C33252i c33252iM105489e = AbstractC33253j.m105489e(f13);
        EnumC17775o1 enumC17775o1 = EnumC17775o1.BADGE_SMALL_SECONDARY_NEUTRAL;
        f55717c = new C17750h1(textResourceM21278l, null, enumC39333f2, null, enumC39333f, null, null, enumC17775o1, false, c33252iM105489e, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, new C17730c1(null, 0.0f, 3, null), null, null, null, 3931498, null);
        f55718d = new C17750h1(AbstractC8693b.m21278l("Confirmed"), null, enumC39333f2, null, enumC39333f, null, null, enumC17775o1, false, AbstractC33253j.m105489e(f13), 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, new C17730c1(null, 0.0f, 3, null), null, null, null, 3931498, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m43039e(Modifier modifier, C14941d state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1287923783);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            boolean z4 = state.getDestination() != null;
            boolean zM87157i = c28655q2.m87157i(state) | ((i15 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C13989w1(9, state, onViewEvent);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3409f, z4, null, null, (InterfaceC4339a) objM87133R, 14), null, 0L, AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(1307784745, c28655q2, new C13857f(11, state, onViewEvent)), c28655q, 12582912, 118);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 8, modifier2, onViewEvent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m43040f(C14941d c14941d, Function1 function1) {
        C9598e c9598eM43047c = c14941d.getDestination();
        if (c9598eM43047c != null) {
            function1.invoke(c9598eM43047c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m43041g(C14941d c14941d, Function1 function1, Composer composer, int i13) {
        float f13;
        C0209i c0209i;
        float f14;
        C0209i c0209i2;
        C0213j c0213j;
        C2305k c2305k;
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f15 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f15, AbstractC1102d.m3409f(1.0f, c2314t));
            float f16 = 4;
            float f17 = 3 * f16;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f17);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k2, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
            String strM43046b = c14941d.getCardTitle();
            if (strM43046b == null) {
                c28655q.m87150e0(1965231475);
                c28655q.m87173q(false);
                f14 = f15;
                f13 = f16;
                c2305k = c2305k2;
                c0209i2 = c0209i5;
                c0213j = c0213j2;
                c0209i = c0209i3;
                i14 = 6;
            } else {
                c28655q.m87150e0(1965231476);
                C38072d c38072d = C38072d.f163053a;
                C2886a sh4 = c38072d.m121952e(c28655q, 6).getSh4();
                long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f13 = f16;
                c0209i = c0209i3;
                f14 = f15;
                c0209i2 = c0209i5;
                c0213j = c0213j2;
                c2305k = c2305k2;
                i14 = 6;
                AbstractC30795n.m94707h(strM43046b, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            C17731c2 c17731c2M43050g = c14941d.getTrend();
            if (c17731c2M43050g == null) {
                c28655q.m87150e0(1965541258);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1965541259);
                AbstractC17808z1.m51175c(c17731c2M43050g, c28655q, C9598e.f28134d);
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(((float) 0.5d) * f14, c2314t));
                c28655q.m87173q(false);
            }
            C28655q c28655q2 = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c14941d.getIcon().toWhoopIcon(), c28655q, i14), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62403z0), AbstractC1102d.m3419p(f13 * f13, c2314t), AbstractC13673n.m38559f(C38072d.f163053a, c28655q, i14, 0.5f), c28655q2, 384, 0);
            c28655q2.m87173q(true);
            C14938a c14938aM43045a = c14941d.getBody();
            if (c14938aM43045a == null) {
                c28655q2.m87150e0(-2037762799);
            } else {
                c28655q2.m87150e0(-2037762798);
                m43043i(c14938aM43045a, c28655q2, 0);
            }
            c28655q2.m87173q(false);
            if (c14941d.m43049f().isEmpty()) {
                z4 = true;
                c28655q2.m87150e0(-2037434353);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-2037683252);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k, c28655q2, i14);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
                c28655q2.m87150e0(-1029496076);
                Iterator<T> it = c14941d.m43049f().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function1, c28655q2, 0, 6);
                }
                z4 = true;
                AbstractC25012a.m73392y(c28655q2, false, true, false);
            }
            c28655q2.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m43042h(Modifier modifier, C14941d c14941d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m43039e(modifier, c14941d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m43043i(C14938a c14938a, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1146451678);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c14938a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            String title = c14938a.getTitle();
            if (title == null) {
                c28655q.m87150e0(1405816561);
                c28655q.m87173q(false);
                i15 = 6;
                z4 = false;
            } else {
                c28655q.m87150e0(1405816562);
                C38072d c38072d = C38072d.f163053a;
                C2886a b6 = c38072d.m121952e(c28655q, 6).getB1();
                long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                i15 = 6;
                z4 = false;
                AbstractC30795n.m94707h(title, AbstractC11895b.m31988g(modifierM3398t, true, 1.0f), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            C17750h1 tag = c14938a.getTag();
            if (tag == null) {
                c28655q.m87150e0(1406166923);
            } else {
                c28655q.m87150e0(1406166924);
                AbstractC17746g1.m50872h(tag, null, null, c28655q, 0, 6);
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
            String subtitle = c14938a.getSubtitle();
            if (subtitle == null) {
                c28655q.m87150e0(607989814);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(607989815);
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(subtitle, null, c38072d2.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i15).getB2(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c14938a, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m43044j(C14938a c14938a, int i13, Composer composer, int i14) {
        m43043i(c14938a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
