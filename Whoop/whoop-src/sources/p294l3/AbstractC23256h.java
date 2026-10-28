package p294l3;

import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.List;
import kg2.C22459e;

/* JADX INFO: renamed from: l3.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23256h {

    /* JADX INFO: renamed from: a */
    public static final C23254g f92140a = new C23254g("");

    /* JADX INFO: renamed from: a */
    public static final List m67319a(C23254g c23254g, int i13, int i14, C22459e c22459e) {
        List list;
        if (i13 == i14 || (list = c23254g.f92134w) == null) {
            return null;
        }
        if (i13 != 0 || i14 < c23254g.f92135x.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                C23250e c23250e = (C23250e) list.get(i15);
                if ((c22459e != null ? ((Boolean) c22459e.invoke(c23250e.f92125a)).booleanValue() : true) && m67320b(i13, i14, c23250e.f92126b, c23250e.f92127c)) {
                    arrayList.add(new C23250e(AbstractC12889b.m36284n(c23250e.f92126b, i13, i14) - i13, AbstractC12889b.m36284n(c23250e.f92127c, i13, i14) - i13, (InterfaceC23244b) c23250e.f92125a, c23250e.f92128d));
                }
            }
            return arrayList;
        }
        if (c22459e == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            Object obj = list.get(i16);
            if (((Boolean) c22459e.invoke(((C23250e) obj).f92125a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m67320b(int i13, int i14, int i15, int i16) {
        return ((i13 < i16) & (i15 < i14)) | (((i13 == i14) | (i15 == i16)) & (i13 == i15));
    }
}
