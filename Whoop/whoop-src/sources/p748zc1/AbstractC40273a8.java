package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17746g1;
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
import p291l0.AbstractC22960g2;
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
import y71.C39274g;

/* JADX INFO: renamed from: zc1.a8 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40273a8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m129328b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1725119164);
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
            AbstractC22399k.m64473c("Default", c28655q, 6);
            TextResource.C8691e c8691e = new TextResource.C8691e("A long tag Label");
            int i14 = TextResource.C8691e.f25898b;
            AbstractC17746g1.m50874j(c8691e, 0L, null, 0L, null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i14, 0, 0, 8388606);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Custom Color", c28655q, 6);
            TextResource.C8691e c8691e2 = new TextResource.C8691e("Medium");
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC17746g1.m50874j(c8691e2, c38072d.m121949b(c28655q, i15).getBrandWhite(), null, c38072d.m121949b(c28655q, i15).getBrandBlack(), null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i14, 0, 0, 8388596);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Custom Background", c28655q, 6);
            AbstractC17746g1.m50874j(new TextResource.C8691e("Tag"), c38072d.m121949b(c28655q, i15).getBrandPrimary(), null, 0L, null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i14, 0, 0, 8388604);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Default With Icon", c28655q, 6);
            TextResource.C8691e c8691e3 = new TextResource.C8691e("A long tag Label");
            C39274g c39274g = new C39274g(c38072d.m121951d().getTinyIcons().getTriangleUp(), new TextResource.C8691e("Up Arrow"));
            int i16 = C39274g.f168929c;
            int i17 = i14 | (i16 << 18);
            AbstractC17746g1.m50874j(c8691e3, 0L, null, 0L, null, false, c39274g, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i17, 0, 0, 8388542);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Custom Color With Icon", c28655q, 6);
            AbstractC17746g1.m50874j(new TextResource.C8691e("Medium"), c38072d.m121949b(c28655q, i15).getBrandWhite(), null, c38072d.m121949b(c28655q, i15).getBrandBlack(), null, false, new C39274g(c38072d.m121951d().getTinyIcons().getTinyHelp(), null, 2, 0 == true ? 1 : 0), null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i17, 0, 0, 8388532);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Custom Background With Icon", c28655q, 6);
            AbstractC17746g1.m50874j(new TextResource.C8691e("Tag"), c38072d.m121949b(c28655q, i15).getBrandPrimary(), null, 0L, null, false, new C39274g(c38072d.m121951d().getTinyIcons().getTinyCharging(), null, 2, 0 == true ? 1 : 0), null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i17, 0, 0, 8388540);
            AbstractC22399k.m64473c("Default With Right Icon", c28655q, 6);
            AbstractC17746g1.m50874j(new TextResource.C8691e("Default With Right Icon"), 0L, null, 0L, null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, new C39274g(c38072d.m121951d().getTinyIcons().getCross(), new TextResource.C8691e("Close")), null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i14, i16 << 9, 0, 8380414);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("All Background Styles", c28655q, 6);
            float f15 = 8;
            float f16 = 2 * f15;
            float f17 = ((float) 1.5d) * f15;
            AbstractC22960g2.m66729a(AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f16, f16), AbstractC22977m.m66746i(f17), AbstractC22977m.m66746i(f17), null, 0, 0, C40343h1.f174272a.m129850b(), c28655q, 1573302, 56);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40475t7(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129329c(int i13, Composer composer, int i14) {
        m129328b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
