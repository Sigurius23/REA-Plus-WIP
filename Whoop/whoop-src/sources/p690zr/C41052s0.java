package p690zr;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: renamed from: zr.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41052s0 extends AbstractC41043o implements Serializable {

    /* JADX INFO: renamed from: E */
    public transient int f177047E;

    /* JADX INFO: renamed from: F */
    public transient C41050r0 f177048F;

    /* JADX INFO: renamed from: z */
    public final transient Map f177049z;

    public C41052s0(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f177049z = map;
    }

    @Override // p690zr.AbstractC41043o
    /* JADX INFO: renamed from: a */
    public final Map mo133270a() {
        Map c41028i;
        Map map = this.f177031y;
        if (map != null) {
            return map;
        }
        Map map2 = this.f177049z;
        if (map2 instanceof NavigableMap) {
            c41028i = new C41019f(this, (NavigableMap) map2);
        } else {
            c41028i = map2 instanceof SortedMap ? new C41028i(this, (SortedMap) map2) : new C41013d(this, map2);
        }
        this.f177031y = c41028i;
        return c41028i;
    }

    /* JADX INFO: renamed from: b */
    public final void m133291b() {
        Map map = this.f177049z;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f177047E = 0;
    }

    /* JADX INFO: renamed from: c */
    public final Collection m133292c() {
        return (List) this.f177048F.get();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m133293d(Double d3, Integer num) {
        Map map = this.f177049z;
        Collection collection = (Collection) map.get(d3);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.f177047E++;
            return true;
        }
        Collection collectionM133292c = m133292c();
        if (!collectionM133292c.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f177047E++;
        map.put(d3, collectionM133292c);
        return true;
    }
}
