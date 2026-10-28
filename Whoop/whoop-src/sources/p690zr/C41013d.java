package p690zr;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: zr.d */
/* JADX INFO: loaded from: classes6.dex */
public class C41013d extends AbstractMap {

    /* JADX INFO: renamed from: w */
    public transient C41007b f176979w;

    /* JADX INFO: renamed from: x */
    public transient C41041n f176980x;

    /* JADX INFO: renamed from: y */
    public final transient Map f176981y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C41052s0 f176982z;

    public C41013d(C41052s0 c41052s0, Map map) {
        this.f176982z = c41052s0;
        this.f176981y = map;
    }

    /* JADX INFO: renamed from: a */
    public final C41011c0 m133238a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z4 = list instanceof RandomAccess;
        C41052s0 c41052s0 = this.f176982z;
        return new C41011c0(key, z4 ? new C41025h(c41052s0, key, list, null) : new C41037l(c41052s0, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C41052s0 c41052s0 = this.f176982z;
        if (this.f176981y == c41052s0.f177049z) {
            c41052s0.m133291b();
            return;
        }
        C41010c c41010c = new C41010c(this);
        while (c41010c.hasNext()) {
            c41010c.next();
            c41010c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f176981y;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C41007b c41007b = this.f176979w;
        if (c41007b != null) {
            return c41007b;
        }
        C41007b c41007b2 = new C41007b(this);
        this.f176979w = c41007b2;
        return c41007b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f176981y.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f176981y;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z4 = list instanceof RandomAccess;
        C41052s0 c41052s0 = this.f176982z;
        return z4 ? new C41025h(c41052s0, obj, list, null) : new C41037l(c41052s0, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f176981y.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set c41031j;
        C41052s0 c41052s0 = this.f176982z;
        Set set = c41052s0.f177029w;
        if (set != null) {
            return set;
        }
        Map map = c41052s0.f177049z;
        if (map instanceof NavigableMap) {
            c41031j = new C41022g(c41052s0, (NavigableMap) map);
        } else {
            c41031j = map instanceof SortedMap ? new C41031j(c41052s0, (SortedMap) map) : new C41016e(c41052s0, map);
        }
        c41052s0.f177029w = c41031j;
        return c41031j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f176981y.remove(obj);
        if (collection == null) {
            return null;
        }
        C41052s0 c41052s0 = this.f176982z;
        Collection collectionM133292c = c41052s0.m133292c();
        collectionM133292c.addAll(collection);
        c41052s0.f177047E -= collection.size();
        collection.clear();
        return collectionM133292c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f176981y.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f176981y.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C41041n c41041n = this.f176980x;
        if (c41041n != null) {
            return c41041n;
        }
        C41041n c41041n2 = new C41041n(this);
        this.f176980x = c41041n2;
        return c41041n2;
    }
}
