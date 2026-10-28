package x41;

import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w41.AbstractC36816p;
import w41.AbstractC36826z;
import w41.C36823w;
import wr0.C37564y;
import x81.C38072d;

/* JADX INFO: renamed from: x41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lw41/z$a;", "mapState", "Ll83/a0;", "b", "(Lw41/z$a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37953a {
    /* JADX INFO: renamed from: b */
    public static final void m121546b(AbstractC36826z.a mapState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(mapState, "mapState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1641980887);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(mapState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            List<C36823w> listM118032b = AbstractC36816p.m118032b(mapState);
            if (listM118032b.size() >= 2) {
                c28655q.m87150e0(-869918354);
                List<C36823w> list = listM118032b;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC36816p.m118031a((C36823w) it.next()));
                }
                AbstractC3269g.m9502f(C38072d.f163053a.m121949b(c28655q, 6).getStrain(), arrayList, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-869784775);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37564y(mapState, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m121547c(AbstractC36826z.a aVar, int i13, Composer composer, int i14) {
        m121546b(aVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
