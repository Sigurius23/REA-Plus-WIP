package p700bd1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import kd1.C22396h;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17918w0;
import p208i2.C17924z0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p291l0.C23016z;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p747z81.Function1;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bd1.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, m65681d2 = {"Lkd1/h;", "Li2/z0;", "shadowDescription", "Ll83/a0;", "i", "(Lkd1/h;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "cornerRadius", "", "description", "g", "(FLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lf0/t;", "borderStrokeDescription", "e", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3102t {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m8897e(C22396h<C13825t> c22396h, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-967378167);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c22396h) : c28655q.m87157i(c22396h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C13825t c13825tM64455a = c22396h.m64455a();
            String name = c22396h.getName();
            C2305k c2305k = C2299e.f9111N;
            C22961h c22961h = AbstractC22977m.f90654e;
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
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
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            Modifier modifierM44454g = AbstractC15751g.m44454g(AbstractC1102d.m3407d(1.0f, c2314t), c13825tM64455a, AbstractC17918w0.f69621a);
            float f14 = 1 * f13;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, modifierM44454g);
            C23016z c23016z = C23016z.f90757a;
            AbstractC15011f9.m43114b(name, c23016z.m66779c(modifierM3394p2, true, 2.0f), jM125430y, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 130552);
            AbstractC22953f.m66715b(c28655q, c23016z.m66779c(AbstractC1102d.m3407d(1.0f, c2314t), true, 1.0f));
            C2307m c2307m = C2299e.f9102E;
            Modifier modifierM66779c = c23016z.m66779c(AbstractC1102d.m3407d(1.0f, c2314t), true, 2.0f);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66779c);
            c28655q.m87158i0();
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
            Function1.m128930i(AbstractC1102d.m3407d(1.0f, c2314t), c13825tM64455a.f49345a, null, null, 0.0f, c28655q, 6, 28);
            Function1.m128934m(AbstractC1102d.m3407d(1.0f, c2314t), c13825tM64455a.f49345a, null, null, 0.0f, c28655q, 6, 28);
            Function1.m128932k(AbstractC1102d.m3407d(1.0f, c2314t), c13825tM64455a.f49345a, null, null, 0.0f, c28655q, 6, 28);
            AbstractC15011f9.m43114b(name, AbstractC1099a.m3394p(f14, c2314t), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, c28655q, 48, 0, 130552);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3100r(c22396h, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m8898f(C22396h c22396h, int i13, Composer composer, int i14) {
        m8897e(c22396h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m8899g(float f13, String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-406344019);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87147d(f13) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f14 = 1;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(8 * f14, C2314t.f9131w));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C13825t c13825tM48880a = AbstractC17269i.m48880a(f14, c38072d.m121949b(c28655q, i15).getBrandBlack());
            Modifier modifierM44456i = AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM3406c, c13825tM48880a.f49346b, AbstractC33253j.m105489e(f13));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44456i);
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
            AbstractC15011f9.m43114b(str, null, c38072d.m121949b(c28655q, i15).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, (i14 >> 3) & 14, 0, 131066);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3101s(f13, str, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m8900h(float f13, String str, int i13, Composer composer, int i14) {
        m8899g(f13, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m8901i(C22396h<C17924z0> c22396h, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1974761947);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c22396h) : c28655q.m87157i(c22396h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C17924z0 c17924z0M64455a = c22396h.m64455a();
            AbstractC12889b.m36263b(AbstractC12889b.m36262a0(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), c17924z0M64455a.f69671c, null, false, 0L, 0L, 30), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), null, 0.0f, AbstractC37817c.m121344e(-386877214, c28655q, new C0003a0(5, c17924z0M64455a, c22396h.getName())), c28655q, 1572864, 58);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3100r(c22396h, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m8902j(C17924z0 c17924z0, String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 1 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15011f9.m43114b(str, AbstractC1099a.m3394p(f13, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, new C23285v0(0L, 0L, null, null, null, 0L, null, c17924z0, 0, 0L, 16769023), c28655q, 48, 0, 65016);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m8903k(C22396h c22396h, int i13, Composer composer, int i14) {
        m8901i(c22396h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
