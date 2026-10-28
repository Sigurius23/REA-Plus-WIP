package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import cd0.C4435a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yk2.C39609i;

/* JADX INFO: renamed from: zc1.e0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lkotlin/Function1;", "Lzc1/d0;", "Ll83/a0;", "onClick", "f", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {
    /* JADX INFO: renamed from: f */
    public static final void m129614f(p715kotlin.jvm.functions.Function1 onClick, Composer composer, int i13) {
        int i14;
        p715kotlin.jvm.functions.Function1 function1;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-921108709);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(onClick) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            int i15 = i14 & 14;
            boolean z4 = i15 == 4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C39609i(onClick, 24);
                c28655q.m87172p0(objM87133R);
            }
            C40528z0 c40528z0 = C40528z0.f174439a;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R, null, false, null, null, null, null, null, c40528z0.m131255e(), c28655q, 805306368, 510);
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            boolean z13 = i15 == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39609i(onClick, 25);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R2, null, false, null, null, null, null, null, c40528z0.m131257g(), c28655q, 805306368, 510);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            boolean z14 = i15 == 4;
            Object objM87133R3 = c28655q.m87133R();
            if (z14 || objM87133R3 == c28676v0) {
                objM87133R3 = new C39609i(onClick, 26);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R3, null, false, null, null, null, null, null, c40528z0.m131258h(), c28655q, 805306368, 510);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            boolean z15 = i15 == 4;
            Object objM87133R4 = c28655q.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                function1 = onClick;
                objM87133R4 = new C39609i(function1, 27);
                c28655q.m87172p0(objM87133R4);
            } else {
                function1 = onClick;
            }
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R4, null, false, null, null, null, null, null, c40528z0.m131256f(), c28655q, 805306368, 510);
            c28655q.m87173q(true);
        } else {
            function1 = onClick;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m129615g(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(EnumC40298d0.LEFT);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m129616h(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(EnumC40298d0.RIGHT);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129617i(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(EnumC40298d0.FULL);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129618j(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(EnumC40298d0.NONE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129619k(p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m129614f(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
