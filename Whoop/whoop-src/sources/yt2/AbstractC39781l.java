package yt2;

import androidx.compose.runtime.Composer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p027b3.AbstractC2453v1;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p390p1.C28655q;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import w11.C36696c;
import zt2.C41139h;

/* JADX INFO: renamed from: yt2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "scrollId", "", "Lzt2/h;", "goalSectionList", "Ln0/u;", "a", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ln0/u;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39781l {
    /* JADX INFO: renamed from: a */
    public static final C26068u m127424a(String scrollId, List<C41139h> list, Composer composer, int i13) {
        int i14;
        int i15;
        List<InterfaceC25312u> listM133581h;
        AbstractC22676k.m65750j(scrollId, "scrollId");
        float f13 = 4;
        float f14 = 12 * f13;
        float f15 = 34 * f13;
        float f16 = 3 * f13;
        C28655q c28655q = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        int i16 = -1;
        if (list == null) {
            i14 = -1;
            break;
        }
        Iterator<C41139h> it = list.iterator();
        i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), scrollId)) {
                break;
            }
            i14++;
        }
        if (list == null) {
            i15 = -1;
            break;
        }
        Iterator<C41139h> it3 = list.iterator();
        i15 = 0;
        loop1: while (true) {
            if (!it3.hasNext()) {
                i15 = -1;
                break;
            }
            List<InterfaceC25312u> listM133581h2 = it3.next().m133581h();
            if (!(listM133581h2 instanceof Collection) || !listM133581h2.isEmpty()) {
                for (InterfaceC25312u interfaceC25312u : listM133581h2) {
                    if ((interfaceC25312u instanceof C36696c) && AbstractC22676k.m65745e(((C36696c) interfaceC25312u).getId(), scrollId)) {
                        break loop1;
                    }
                }
            }
            i15++;
        }
        if (i14 >= 0) {
            c28655q.m87150e0(944019364);
            C26068u c26068uM77569a = AbstractC26071x.m77569a(i14 + 1, 0, c28655q, 2);
            c28655q.m87173q(false);
            return c26068uM77569a;
        }
        if (i15 < 0) {
            c28655q.m87150e0(944852117);
            C26068u c26068uM77569a2 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            c28655q.m87173q(false);
            return c26068uM77569a2;
        }
        c28655q.m87150e0(944279888);
        C41139h c41139h = list != null ? list.get(i15) : null;
        if (c41139h != null && (listM133581h = c41139h.m133581h()) != null) {
            int i17 = 0;
            for (InterfaceC25312u interfaceC25312u2 : listM133581h) {
                if ((interfaceC25312u2 instanceof C36696c) && AbstractC22676k.m65745e(((C36696c) interfaceC25312u2).getId(), scrollId)) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
        }
        C26068u c26068uM77569a3 = AbstractC26071x.m77569a(i15 + 1, interfaceC39171c.mo724F(((f16 + f15) * i16) + f14), c28655q, 0);
        c28655q.m87173q(false);
        return c26068uM77569a3;
    }
}
