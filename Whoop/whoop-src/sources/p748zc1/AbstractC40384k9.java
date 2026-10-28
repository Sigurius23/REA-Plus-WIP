package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p736sz0.C33218s1;
import p736sz0.C33224u1;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.k9 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40384k9 {
    /* JADX INFO: renamed from: b */
    public static final void m130213b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2131647388);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Zone Row with editable max and min", c28655q, 6);
            float f13 = 2 * 4;
            TextResource textResourceM61133d = AbstractC21702c.m61133d(c2314t, f13, c28655q, "Zone 1");
            EnumC39333f enumC39333f = EnumC39333f.STRAIN_ZONE_1;
            C33224u1 c33224u1 = new C33224u1(96, AbstractC8693b.m21278l("96"), true);
            C33224u1 c33224u2 = new C33224u1(115, AbstractC8693b.m21278l("115"), true);
            EnumC39333f enumC39333f2 = EnumC39333f.STRAIN;
            C33218s1 c33218s1 = new C33218s1("ZONE_1", textResourceM61133d, enumC39333f, AbstractC8693b.m21278l("bpm"), enumC39333f2, 0.2f, c33224u1, c33224u2);
            int i14 = C33218s1.f138525i;
            AbstractC25303l.m74291r(c33218s1, null, null, null, c28655q, i14, 14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("Zone Row with editable min", c28655q, 6);
            TextResource textResourceM61133d2 = AbstractC21702c.m61133d(c2314t, f13, c28655q, "Zone 2");
            EnumC39333f enumC39333f3 = EnumC39333f.STRAIN_ZONE_2;
            AbstractC25303l.m74291r(new C33218s1("ZONE_2", textResourceM61133d2, enumC39333f3, AbstractC8693b.m21278l("bpm"), enumC39333f3, 0.2f, new C33224u1(96, AbstractC8693b.m21278l("96"), true), new C33224u1(115, AbstractC8693b.m21278l("115"), true)), null, null, null, c28655q, i14, 14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("Zone Row with non editable field", c28655q, 6);
            AbstractC25303l.m74291r(new C33218s1("ZONE_2", AbstractC21702c.m61133d(c2314t, f13, c28655q, "Zone 2"), enumC39333f3, AbstractC8693b.m21278l("bpm"), enumC39333f3, 0.2f, new C33224u1(96, AbstractC8693b.m21278l("96"), true), new C33224u1(115, AbstractC8693b.m21278l("115"), true)), null, null, null, c28655q, i14, 14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("Zone Row with different line and gradient color", c28655q, 6);
            AbstractC25303l.m74291r(new C33218s1("ZONE_2", AbstractC21702c.m61133d(c2314t, f13, c28655q, "Zone X"), EnumC39333f.STRAIN_ZONE_5, AbstractC8693b.m21278l("bpm"), enumC39333f2, 0.2f, new C33224u1(96, AbstractC8693b.m21278l("96"), true), new C33224u1(115, AbstractC8693b.m21278l("115"), true)), null, null, null, c28655q, i14, 14);
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40506w8(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130214c(int i13, Composer composer, int i14) {
        m130213b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
