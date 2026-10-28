package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c41.AbstractC4021f1;
import c41.C4028g1;
import c41.EnumC4035h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import m83.AbstractC25267u;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p720m91.AbstractC25303l;

/* JADX INFO: renamed from: zc1.s1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40459s1 {
    /* JADX INFO: renamed from: b */
    public static final void m130819b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1030028188);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC22399k.m64473c("All Fields Enabled", c28655q, 6);
            AbstractC4021f1.m12235l(c28655q, 0);
            float f13 = 4;
            float f14 = f13 * f13;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("No Leading Icon", c28655q, 6);
            c28655q.m87150e0(2014618530);
            List<C4028g1> listM12243t = AbstractC4021f1.m12243t();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM12243t, 10));
            Iterator<T> it = listM12243t.iterator();
            while (it.hasNext()) {
                arrayList.add(C4028g1.m12267b((C4028g1) it.next(), null, null, null, null, null, null, null, null, null, null, null, 2043, null));
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC25303l.m74291r((C4028g1) it3.next(), null, null, null, c28655q, C4028g1.f16356l, 14);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("No Status Icon", c28655q, 6);
            c28655q.m87150e0(2014624258);
            List<C4028g1> listM12243t2 = AbstractC4021f1.m12243t();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM12243t2, 10));
            Iterator<T> it4 = listM12243t2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(C4028g1.m12267b((C4028g1) it4.next(), null, null, null, null, null, null, null, null, null, null, null, 1919, null));
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                AbstractC25303l.m74291r((C4028g1) it5.next(), null, null, null, c28655q, C4028g1.f16356l, 14);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Null Data", c28655q, 6);
            c28655q.m87150e0(2014633058);
            List<C4028g1> listM12243t3 = AbstractC4021f1.m12243t();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM12243t3, 10));
            for (C4028g1 c4028g1 : listM12243t3) {
                EnumC4035h1 enumC4035h1 = EnumC4035h1.NO_DATA;
                arrayList3.add(C4028g1.m12267b(c4028g1, null, null, null, null, enumC4035h1, enumC4035h1.getTextDefault(), null, null, null, null, null, 1871, null));
            }
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                AbstractC25303l.m74291r((C4028g1) it6.next(), null, null, null, c28655q, C4028g1.f16356l, 14);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Other Variants", c28655q, 6);
            AbstractC4021f1.m12237n(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130820c(int i13, Composer composer, int i14) {
        m130819b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
