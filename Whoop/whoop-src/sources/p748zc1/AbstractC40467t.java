package p748zc1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import ny0.C27270o;
import p700bd1.C3096n;
import p715kotlin.Metadata;
import p727py0.AbstractC29620e;

/* JADX INFO: renamed from: zc1.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lbd1/n;", "a", "()Ljava/util/List;", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40467t {
    /* JADX INFO: renamed from: a */
    public static final List<C3096n> m130855a() {
        List<C27270o> listM91007a = AbstractC29620e.m91007a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM91007a, 10));
        Iterator<T> it = listM91007a.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3096n((C27270o) it.next()));
        }
        return arrayList;
    }
}
