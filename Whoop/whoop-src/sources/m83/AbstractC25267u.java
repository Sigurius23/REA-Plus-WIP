package m83;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m83.u */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25267u extends AbstractC37056f {
    /* JADX INFO: renamed from: i0 */
    public static int m74163i0(Iterable iterable, int i13) {
        AbstractC22676k.m65750j(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i13;
    }

    /* JADX INFO: renamed from: j0 */
    public static ArrayList m74164j0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
