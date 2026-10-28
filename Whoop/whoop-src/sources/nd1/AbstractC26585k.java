package nd1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tf3.C33768a;

/* JADX INFO: renamed from: nd1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "Lnd1/j;", "Ltf3/a;", "a", "(Ljava/util/List;)Ljava/util/List;", "di_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26585k {
    /* JADX INFO: renamed from: a */
    public static final List<C33768a> m79057a(List<? extends InterfaceC26584j> list) {
        AbstractC22676k.m65750j(list, "<this>");
        List<? extends InterfaceC26584j> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC26584j) it.next()).define());
        }
        return arrayList;
    }
}
