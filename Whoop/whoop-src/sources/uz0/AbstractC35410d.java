package uz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import p736sz0.AbstractC33207p;
import p736sz0.EnumC33185h1;
import p91.AbstractC29011e;
import p91.C29007a;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uz0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Luz0/m;", "viewState", "Ll83/a0;", "b", "(Luz0/m;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35410d {
    /* JADX INFO: renamed from: b */
    public static final void m112329b(C35419m viewState, Composer composer, int i13) {
        float f13;
        C2314t c2314t;
        C0209i c0209i;
        C17916v0 c17916v0;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z4;
        C0213j c0213j;
        C0209i c0209i5;
        C17916v0 c17916v1;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2032809387);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87153g(viewState) ? 4 : 2) : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC35409c.m112326b(viewState.getIconImageSource(), viewState.getActivityStrain(), viewState.getActivityTitle(), viewState.getBackgroundBrush(), c28655q, 0);
            float f14 = 8;
            C2314t c2314t2 = C2314t.f9131w;
            AbstractC11266d.m30469w((float) 1.5d, f14, c2314t2, c28655q);
            Modifier modifierM3411h = AbstractC1102d.m3411h(1, AbstractC1102d.m3409f(1.0f, c2314t2));
            C38072d c38072d = C38072d.f163053a;
            long white10 = c38072d.m121949b(c28655q, 6).getWhite10();
            C17916v0 c17916v2 = AbstractC17918w0.f69621a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3411h, white10, c17916v2), c28655q, 0);
            AbstractC11266d.m30469w(2, f14, c2314t2, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m);
            C0209i c0209i8 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i8);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N);
            if (viewState.getActivityDuration() != null) {
                c28655q.m87150e0(637347227);
                TextResource.C8691e c8691e = new TextResource.C8691e(viewState.getActivityDuration());
                long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
                long white70 = c38072d.m121949b(c28655q, 6).getWhite70();
                String activityDurationUnit = viewState.getActivityDurationUnit();
                TextResource.C8691e c8691e2 = activityDurationUnit != null ? new TextResource.C8691e(activityDurationUnit) : null;
                EnumC33185h1 enumC33185h1 = EnumC33185h1.TEXT;
                String activityDurationLabel = viewState.getActivityDurationLabel();
                if (activityDurationLabel == null) {
                    activityDurationLabel = "";
                }
                c2314t = c2314t2;
                f13 = f14;
                c0209i2 = c0209i7;
                z4 = true;
                c17916v0 = c17916v2;
                c0209i = c0209i9;
                c0209i3 = c0209i8;
                c0209i4 = c0209i6;
                AbstractC33207p.m105301e(null, null, c8691e, null, c8691e2, enumC33185h1, null, new TextResource.C8691e(activityDurationLabel), false, brandWhite, white70, c38072d.m121952e(c28655q, 6).getN6(), c38072d.m121952e(c28655q, 6).getB2(), c38072d.m121952e(c28655q, 6).getH5(), false, null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0, 49483);
                c28655q = c28655q;
                AbstractC18489d0.m53381v(4, f13, c2314t, c28655q, false);
            } else {
                f13 = f14;
                c2314t = c2314t2;
                c0209i = c0209i9;
                c17916v0 = c17916v2;
                c0209i2 = c0209i7;
                c0209i3 = c0209i8;
                c0209i4 = c0209i6;
                z4 = true;
                c28655q.m87150e0(638044913);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            C0209i c0209i10 = c0209i4;
            AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a);
            C0209i c0209i11 = c0209i2;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i3;
            }
            C0209i c0209i12 = c0209i;
            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N2);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C2307m c2307m2 = c2307m;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N3);
            c28655q.m87150e0(209159915);
            Iterator<T> it = viewState.getTargetZones().m112392b().iterator();
            int i15 = 0;
            while (true) {
                float fFloatValue = 0.0f;
                if (!it.hasNext()) {
                    C2307m c2307m3 = c2307m2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(z4);
                    float f15 = f13 * 0.5f;
                    Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(6, AbstractC30007c.m91835e(c2314t, f15, c28655q, c2314t, 1.0f)), AbstractC33253j.m105486b(25));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m3, false);
                    int iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM118994r);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    C0209i c0209i13 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i13);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    c28655q.m87150e0(748510712);
                    int i16 = 0;
                    for (Object obj : viewState.getTargetZones().m112392b()) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C35422p c35422p = (C35422p) obj;
                        List<C35422p> listSubList = viewState.getTargetZones().m112392b().subList(0, i16);
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listSubList, 10));
                        Iterator<T> it3 = listSubList.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(Float.valueOf(((C35422p) it3.next()).getSize()));
                        }
                        Iterator it4 = arrayList.iterator();
                        float fFloatValue2 = 0.0f;
                        while (it4.hasNext()) {
                            fFloatValue2 += ((Number) it4.next()).floatValue();
                        }
                        float size = i16 < AbstractC37056f.m118951C(viewState.getTargetZones().m112392b()) ? c35422p.getSize() - 0.005f : c35422p.getSize();
                        if (size < 0.0f) {
                            size = 0.0f;
                        }
                        float f16 = size - 0.002f;
                        if (f16 > 0.0f) {
                            c28655q.m87150e0(552702105);
                            Modifier modifierM88145f = AbstractC29011e.m88145f(AbstractC1102d.m3406c(1.0f, c2314t), fFloatValue2, 0.0f, f16, 0.0f, null, 26, null);
                            long jM112370a = AbstractC35416j.m112370a(c35422p.getStyle(), c28655q, 0);
                            c17916v1 = c17916v0;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM88145f, jM112370a, c17916v1), c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c17916v1 = c17916v0;
                            c28655q.m87150e0(553163385);
                            c28655q.m87173q(false);
                        }
                        c17916v0 = c17916v1;
                        i16 = i17;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(z4);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                    String title = viewState.getTargetZones().getTitle();
                    C38072d c38072d2 = C38072d.f163053a;
                    C28655q c28655q2 = c28655q;
                    AbstractC30795n.m94707h(title, AbstractC1102d.m3409f(1.0f, c2314t), c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH5(), null, c28655q2, 48, 0, 196088);
                    c28655q = c28655q2;
                    c28655q.m87173q(z4);
                    c28655q.m87173q(z4);
                    break;
                }
                Object next = it.next();
                int i18 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C35422p c35422p2 = (C35422p) next;
                List<C35422p> listSubList2 = viewState.getTargetZones().m112392b().subList(0, i15);
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listSubList2, 10));
                Iterator<T> it5 = listSubList2.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(Float.valueOf(((C35422p) it5.next()).getSize()));
                }
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    fFloatValue += ((Number) it6.next()).floatValue();
                }
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(c35422p2.getTitle(), AbstractC29011e.m88150k(c2314t, (fFloatValue + (c35422p2.getSize() + fFloatValue)) / 2.0f, 0.0f, C29007a.INSTANCE.m88137b(), 2, null), AbstractC35416j.m112370a(c35422p2.getStyle(), c28655q, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN9(), null, c28655q3, 0, 0, 196088);
                c28655q = c28655q3;
                i15 = i18;
                c2307m2 = c2307m2;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(viewState, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m112330c(C35419m c35419m, int i13, Composer composer, int i14) {
        m112329b(c35419m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
