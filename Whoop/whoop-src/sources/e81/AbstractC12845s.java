package e81;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e81.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Le81/r;", "", "selectedIndex", "", "unselectedAlpha", "", "Le81/w;", "a", "(Le81/r;Ljava/lang/Integer;F)Ljava/util/List;", "from", "to", "fraction", "c", "(Ljava/util/List;Ljava/util/List;F)Ljava/util/List;", "start", "end", "b", "(FFF)F", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12845s {
    /* JADX INFO: renamed from: a */
    public static final List<C12849w> m36058a(C12844r c12844r, Integer num, float f13) {
        AbstractC22676k.m65750j(c12844r, "<this>");
        List<C12850x> listM36057d = c12844r.m36057d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM36057d, 10));
        int i13 = 0;
        for (Object obj : listM36057d) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C12850x c12850x = (C12850x) obj;
            arrayList.add(new C12849w(c12850x.getStartAngle(), c12850x.getSweepAngle(), num != null && i13 != num.intValue() ? f13 : 1.0f));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private static final float m36059b(float f13, float f14, float f15) {
        return AbstractC2875y.m8288a(f14, f13, f15, f13);
    }

    /* JADX INFO: renamed from: c */
    public static final List<C12849w> m36060c(List<C12849w> from, List<C12849w> to3, float f13) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        if (from.size() != to3.size() || f13 >= 1.0f) {
            return to3;
        }
        if (f13 <= 0.0f) {
            return from;
        }
        List<C12849w> list = to3;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C12849w c12849w = (C12849w) obj;
            arrayList.add(new C12849w(c12849w.getStartAngle(), c12849w.getSweepAngle(), m36059b(from.get(i13).getAlpha(), c12849w.getAlpha(), f13)));
            i13 = i14;
        }
        return arrayList;
    }
}
