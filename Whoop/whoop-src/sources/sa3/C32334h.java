package sa3;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import qa3.C30123c1;
import qa3.C30169v0;
import qa3.C30171w0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sa3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C32334h {

    /* JADX INFO: renamed from: a */
    public final List f133832a;

    public C32334h(C30123c1 typeTable) {
        AbstractC22676k.m65750j(typeTable, "typeTable");
        List list = typeTable.f123065y;
        if ((typeTable.f123064x & 1) == 1) {
            int i13 = typeTable.f123066z;
            AbstractC22676k.m65749i(list, "getTypeList(...)");
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            int i14 = 0;
            for (Object obj : list2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C30171w0 c30171w0M92356k = (C30171w0) obj;
                if (i14 >= i13) {
                    c30171w0M92356k.getClass();
                    C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w0M92356k);
                    c30169v0M92361r.f123471z |= 2;
                    c30169v0M92361r.f123457F = true;
                    c30171w0M92356k = c30169v0M92361r.m92356k();
                    if (!c30171w0M92356k.mo92260b()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(c30171w0M92356k);
                i14 = i15;
            }
            list = arrayList;
        }
        AbstractC22676k.m65749i(list, "run(...)");
        this.f133832a = list;
    }

    /* JADX INFO: renamed from: a */
    public final C30171w0 m100633a(int i13) {
        return (C30171w0) this.f133832a.get(i13);
    }
}
