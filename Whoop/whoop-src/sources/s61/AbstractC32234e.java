package s61;

import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p181h2.C16617b;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s61.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\b\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "Lh2/b;", "points", "Li2/s0;", "b", "(Ljava/util/List;)Li2/s0;", "topPoints", "bottomPoints", "a", "(Ljava/util/List;Ljava/util/List;)Li2/s0;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32234e {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC17910s0 m100279a(List<C16617b> topPoints, List<C16617b> bottomPoints) {
        AbstractC22676k.m65750j(topPoints, "topPoints");
        AbstractC22676k.m65750j(bottomPoints, "bottomPoints");
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        if (!topPoints.isEmpty()) {
            List<C16617b> list = bottomPoints;
            if (!list.isEmpty()) {
                c17891jM51478a.m51462i(Float.intBitsToFloat((int) (topPoints.get(0).f63937a >> 32)), Float.intBitsToFloat((int) (topPoints.get(0).f63937a & 4294967295L)));
                Iterator it = AbstractC25265s.m74161z0(topPoints, 1).iterator();
                while (it.hasNext()) {
                    long j7 = ((C16617b) it.next()).f63937a;
                    c17891jM51478a.m51461h(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
                }
                C18284j c18284jM118950B = AbstractC37056f.m118950B(list);
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
                Iterator it3 = c18284jM118950B.iterator();
                while (((C18283i) it3).f71138y) {
                    arrayList.add(new C16617b(bottomPoints.get((bottomPoints.size() - 1) - ((AbstractC25243e0) it3).nextInt()).f63937a));
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    long j13 = ((C16617b) it4.next()).f63937a;
                    c17891jM51478a.m51461h(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
                }
                c17891jM51478a.m51461h(Float.intBitsToFloat((int) (((C16617b) AbstractC25265s.m74096F0(topPoints)).f63937a >> 32)), Float.intBitsToFloat((int) (((C16617b) AbstractC25265s.m74096F0(topPoints)).f63937a >> 32)));
                c17891jM51478a.m51459f();
            }
        }
        return c17891jM51478a;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC17910s0 m100280b(List<C16617b> points) {
        AbstractC22676k.m65750j(points, "points");
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        if (!points.isEmpty()) {
            c17891jM51478a.m51462i(Float.intBitsToFloat((int) (points.get(0).f63937a >> 32)), Float.intBitsToFloat((int) (points.get(0).f63937a & 4294967295L)));
            Iterator it = AbstractC25265s.m74161z0(points, 1).iterator();
            while (it.hasNext()) {
                long j7 = ((C16617b) it.next()).f63937a;
                c17891jM51478a.m51461h(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
            }
        }
        return c17891jM51478a;
    }
}
