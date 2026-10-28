package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17808z1;
import hy0.EnumC17727b2;
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
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.s8 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40466s8 {
    /* JADX INFO: renamed from: b */
    public static final void m130853b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1586923804);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(4 * 8, c2314t);
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
            AbstractC22399k.m64473c("Single value with background", c28655q, 6);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("12%");
            EnumC17727b2 enumC17727b2 = EnumC17727b2.POSITIVE;
            int i14 = TextResource.$stable | 432;
            AbstractC17808z1.m51177e(textResourceM21278l, true, enumC17727b2, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            float f13 = 10;
            TextResource textResourceM61154y = AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%");
            EnumC17727b2 enumC17727b3 = EnumC17727b2.NEGATIVE;
            AbstractC17808z1.m51177e(textResourceM61154y, true, enumC17727b3, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            TextResource textResourceM61154y2 = AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%");
            EnumC17727b2 enumC17727b4 = EnumC17727b2.NEUTRAL;
            AbstractC17808z1.m51177e(textResourceM61154y2, true, enumC17727b4, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%"), true, EnumC17727b2.POSITIVE_WITH_COLOR, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%"), true, EnumC17727b2.NEGATIVE_WITH_COLOR, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%"), true, EnumC17727b2.POSITIVE_GREEN, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%"), true, EnumC17727b2.NEGATIVE_YELLOW, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC22399k.m64473c("Range value with background", c28655q, 6);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("within 94-95%");
            EnumC17727b2 enumC17727b5 = EnumC17727b2.POSITIVE_RANGE;
            AbstractC17808z1.m51177e(textResourceM21278l2, true, enumC17727b5, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            TextResource textResourceM61154y3 = AbstractC21702c.m61154y(c2314t, f13, c28655q, "within 94-95%");
            EnumC17727b2 enumC17727b6 = EnumC17727b2.CONCERN_RANGE;
            AbstractC17808z1.m51177e(textResourceM61154y3, true, enumC17727b6, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            TextResource textResourceM61154y4 = AbstractC21702c.m61154y(c2314t, f13, c28655q, "within 94-95%");
            EnumC17727b2 enumC17727b7 = EnumC17727b2.ALERT_RANGE;
            AbstractC17808z1.m51177e(textResourceM61154y4, true, enumC17727b7, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC22399k.m64473c("Single value without background", c28655q, 6);
            AbstractC17808z1.m51177e(AbstractC8693b.m21278l("12%"), false, enumC17727b2, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%"), false, enumC17727b3, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "12%"), false, enumC17727b4, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC22399k.m64473c("Range value without background", c28655q, 6);
            AbstractC17808z1.m51177e(AbstractC8693b.m21278l("within 94-95%"), false, enumC17727b5, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "within 94-95%"), false, enumC17727b6, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            AbstractC17808z1.m51177e(AbstractC21702c.m61154y(c2314t, f13, c28655q, "within 94-95%"), false, enumC17727b7, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, i14, 0, 32760);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40475t7(i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130854c(int i13, Composer composer, int i14) {
        m130853b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
