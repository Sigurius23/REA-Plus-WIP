package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18247a;
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
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;
import z71.AbstractC40142a;
import z71.AbstractC40153l;

/* JADX INFO: renamed from: zc1.y4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40522y4 {
    /* JADX INFO: renamed from: b */
    public static final void m131216b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1138364004);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Relaxed Meter", c28655q, 6);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC18247a abstractC18247aM128719d = AbstractC40142a.m128719d();
            AbstractC18247a abstractC18247aM128721f = AbstractC40142a.m128721f();
            TextResource textResourceM21278l = AbstractC8693b.m21278l("0.0");
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125371X = c38072d.m121949b(c28655q, i14).getRecovery();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("RELAXED");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Last updated 2:05pm");
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("0.0");
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("3.0");
            int i15 = AbstractC18247a.f71043a;
            int i16 = i15 << 3;
            int i17 = TextResource.$stable;
            int i18 = i17 << 12;
            int i19 = i17 << 15;
            int i24 = i17 << 24;
            int i25 = i17 << 27;
            int i26 = i15 | 3072 | i16 | i18 | i19 | i24 | i25;
            AbstractC40153l.m128755n(abstractC18247aM128719d, abstractC18247aM128721f, false, 0.0f, textResourceM21278l, textResourceM21278l2, jM125371X, 0L, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, null, false, null, false, null, c28655q, i26, i17, 63620);
            AbstractC22399k.m64473c("Balanced Meter", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC40153l.m128755n(AbstractC40142a.m128719d(), AbstractC40142a.m128721f(), false, 0.5f, AbstractC8693b.m21278l("1.5"), AbstractC8693b.m21278l("BALANCED"), c38072d.m121949b(c28655q, i14).getAccentPositiveTrend(), 0L, AbstractC8693b.m21278l("Last updated 2:05pm"), AbstractC8693b.m21278l("0.0"), AbstractC8693b.m21278l("3.0"), null, false, null, false, null, c28655q, i26, i17, 63620);
            AbstractC22399k.m64473c("Stressed Meter", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC40153l.m128755n(AbstractC40142a.m128719d(), AbstractC40142a.m128721f(), false, 1.0f, AbstractC8693b.m21278l("3.0"), AbstractC8693b.m21278l("stressed"), c38072d.m121949b(c28655q, i14).getAccentNegativeTrend(), 0L, AbstractC8693b.m21278l("Last updated 2:05pm"), AbstractC8693b.m21278l("0.0"), AbstractC8693b.m21278l("3.0"), null, false, null, false, null, c28655q, i26, i17, 63620);
            AbstractC22399k.m64473c("No Highlight", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            int i27 = i15 | 3456 | i16 | i18 | i19 | i24 | i25;
            AbstractC40153l.m128755n(AbstractC40142a.m128719d(), AbstractC40142a.m128721f(), false, 1.0f, AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("NO DATA"), c38072d.m121949b(c28655q, i14).getGreyL4(), 0L, AbstractC8693b.m21278l("Invalid Time"), AbstractC8693b.m21278l("0.0"), AbstractC8693b.m21278l("3.0"), null, false, null, false, null, c28655q, i27, i17, 63616);
            AbstractC22399k.m64473c("Loading", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC40153l.m128755n(AbstractC40142a.m128719d(), AbstractC40142a.m128721f(), true, 1.0f, AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("NO DATA"), c38072d.m121949b(c28655q, i14).getGreyL4(), 0L, AbstractC8693b.m21278l("Invalid Time"), AbstractC8693b.m21278l("0.0"), AbstractC8693b.m21278l("3.0"), null, true, AbstractC8693b.m21278l("LOADING PROMPT"), false, null, c28655q, i27, i17 | 384 | (i17 << 9), 51328);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m131217c(int i13, Composer composer, int i14) {
        m131216b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
