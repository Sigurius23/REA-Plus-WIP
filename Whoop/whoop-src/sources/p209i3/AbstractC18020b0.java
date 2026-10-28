package p209i3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25269w;
import p002a0.AbstractC0052t;
import p002a0.C0006a1;
import p002a0.C0023g0;
import p133f1.C13982u0;
import p181h2.C16618c;
import p636y3.EnumC39181m;
import p705ea2.C12915l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18020b0 {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f69933a;

    /* JADX INFO: renamed from: b */
    public static final C18018a0 f69934b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i13 = 0;
        while (i13 < 2) {
            comparatorArr[i13] = new C13982u0(new C13982u0(i13 == 0 ? C18025g.f69942y : C18025g.f69941x), 2);
            i13++;
        }
        f69933a = comparatorArr;
        f69934b = C18018a0.f69930w;
    }

    /* JADX INFO: renamed from: a */
    public static final void m51766a(C18034p c18034p, ArrayList arrayList, C0006a1 c0006a1, C0006a1 c0006a2, C0023g0 c0023g0) {
        C18030l c18030l = c18034p.f69989d;
        Object objM129g = c18030l.f69980w.m129g(AbstractC18039u.f70046m);
        if (objM129g == null) {
            objM129g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM129g).booleanValue();
        if ((zBooleanValue || ((Boolean) c0006a2.invoke(c18034p)).booleanValue()) && ((Boolean) c0006a1.invoke(c18034p)).booleanValue()) {
            arrayList.add(c18034p);
        }
        if (zBooleanValue) {
            c0023g0.m51h(c18034p.f69992g, m51767b(c18034p, c0006a1, c0006a2, C18034p.m51776j(7, c18034p)));
            return;
        }
        List listM51776j = C18034p.m51776j(7, c18034p);
        int size = listM51776j.size();
        for (int i13 = 0; i13 < size; i13++) {
            m51766a((C18034p) listM51776j.get(i13), arrayList, c0006a1, c0006a2, c0023g0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX INFO: renamed from: b */
    public static final ArrayList m51767b(C18034p c18034p, C0006a1 c0006a1, C0006a1 c0006a2, List list) {
        C0023g0 c0023g0 = AbstractC0052t.f161a;
        C0023g0 c0023g1 = new C0023g0();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            m51766a((C18034p) list.get(i13), arrayList, c0006a1, c0006a2, c0023g1);
        }
        char c3 = c18034p.f69988c.f777Y == EnumC39181m.f168424x ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iM118951C = AbstractC37056f.m118951C(arrayList);
        if (iM118951C >= 0) {
            int i14 = 0;
            while (true) {
                C18034p c18034p2 = (C18034p) arrayList.get(i14);
                if (i14 == 0) {
                    arrayList2.add(new C23465k(c18034p2.m51784h(), AbstractC37056f.m118964P(c18034p2)));
                    break;
                }
                float f13 = c18034p2.m51784h().f63940b;
                float f14 = c18034p2.m51784h().f63942d;
                boolean z4 = f13 >= f14;
                int iM118951C2 = AbstractC37056f.m118951C(arrayList2);
                if (iM118951C2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        C16618c c16618c = (C16618c) ((C23465k) arrayList2.get(i15)).f92937w;
                        float f15 = c16618c.f63940b;
                        float f16 = c16618c.f63942d;
                        boolean z13 = f15 >= f16;
                        if (!z4 && !z13 && Math.max(f13, f15) < Math.min(f14, f16)) {
                            arrayList2.set(i15, new C23465k(new C16618c(Math.max(c16618c.f63939a, 0.0f), Math.max(c16618c.f63940b, f13), Math.min(c16618c.f63941c, Float.POSITIVE_INFINITY), Math.min(f16, f14)), ((C23465k) arrayList2.get(i15)).f92938x));
                            ((List) ((C23465k) arrayList2.get(i15)).f92938x).add(c18034p2);
                            break;
                        }
                        if (i15 != iM118951C2) {
                            i15++;
                        }
                    }
                }
                arrayList2.add(new C23465k(c18034p2.m51784h(), AbstractC37056f.m118964P(c18034p2)));
                break;
                if (i14 == iM118951C) {
                    break;
                }
                i14++;
            }
        }
        AbstractC25269w.m74166l0(arrayList2, C18025g.f69943z);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f69933a[c3 ^ 1];
        int size2 = arrayList2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            C23465k c23465k = (C23465k) arrayList2.get(i16);
            AbstractC25269w.m74166l0((List) c23465k.f92938x, comparator);
            arrayList3.addAll((Collection) c23465k.f92938x);
        }
        AbstractC25269w.m74166l0(arrayList3, new C12915l(f69934b, 3));
        int size3 = 0;
        while (size3 <= AbstractC37056f.m118951C(arrayList3)) {
            List list2 = (List) c0023g1.m121b(((C18034p) arrayList3.get(size3)).f69992g);
            if (list2 != null) {
                if (((Boolean) c0006a2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
