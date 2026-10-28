package zq0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import dn0.C12201a;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.AbstractC25315x;
import p720m91.InterfaceC25312u;
import p748zc1.C40518y0;
import vv2.C36537c;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.C38072d;

/* JADX INFO: renamed from: zq0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\f\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"", "Lm91/u;", "items", "Lzq0/o;", "slots", "Ly3/f;", "viewportHeight", "chromeHeight", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Ljava/util/List;Ljava/util/List;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "item", "slot", "g", "(Lm91/u;Lzq0/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40972m {
    /* JADX INFO: renamed from: f */
    public static final void m133019f(List<? extends InterfaceC25312u> items, List<C40974o> slots, float f13, float f14, Function1 onViewEvent, Composer composer, int i13) {
        float f15;
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(slots, "slots");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-106902074);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(items) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(slots) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            long jM125426w = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack();
            boolean zM87151f = c28655q.m87151f(jM125426w);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                f15 = 1.0f;
                objM87133R = C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, jM125426w))), new C23465k(Float.valueOf(0.5f), new C17919x(C17919x.m51541c(0.75f, jM125426w))), new C23465k(Float.valueOf(1.0f), new C17919x(jM125426w))}, 0.0f, 0.0f, 14);
                c28655q.m87172p0(objM87133R);
            } else {
                f15 = 1.0f;
            }
            AbstractC17911t abstractC17911t = (AbstractC17911t) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(f15, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C2307m c2307m = C2299e.f9105H;
            C1100b c1100b = C1100b.f4583a;
            int i15 = i14;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(f14, AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m))), abstractC17911t, null, 0.0f, 6), c28655q, 0);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), "CommunitySnapshotFooterOverlay");
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-1643207602);
            int i16 = 0;
            for (Object obj : items) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m133020g((InterfaceC25312u) obj, slots.get(i16), onViewEvent, c28655q, (i15 >> 6) & 896);
                i16 = i17;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12201a(items, slots, f13, f14, onViewEvent, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m133020g(InterfaceC25312u interfaceC25312u, C40974o c40974o, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-797197291);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c40974o) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C40967h(c40974o, 3);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3502b = AbstractC1132b.m3502b(C2314t.f9131w, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC28683x.m87247a(AbstractC25315x.m74337c().mo86977a(c40974o.getDeclared()), AbstractC37817c.m121344e(36579855, c28655q, new C37888f1(15, interfaceC25312u, function1)), c28655q, 56);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(interfaceC25312u, c40974o, function1, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m133021h(C40974o c40974o, C39180l c39180l) {
        c40974o.m133031d((int) (c39180l.f168422a & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m133022i(InterfaceC25312u interfaceC25312u, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC25303l.m74291r(interfaceC25312u, null, new C40518y0(17), function1, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m133023j(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1448215169);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m133024k(InterfaceC25312u interfaceC25312u, C40974o c40974o, Function1 function1, int i13, Composer composer, int i14) {
        m133020g(interfaceC25312u, c40974o, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m133025l(List list, List list2, float f13, float f14, Function1 function1, int i13, Composer composer, int i14) {
        m133019f(list, list2, f13, f14, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
