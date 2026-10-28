package p690zr;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: zr.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C41019f extends C41028i implements NavigableMap {

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C41052s0 f176991G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41019f(C41052s0 c41052s0, NavigableMap navigableMap) {
        super(c41052s0, navigableMap);
        this.f176991G = c41052s0;
    }

    @Override // p690zr.C41028i
    /* JADX INFO: renamed from: b */
    public final SortedSet mo133242b() {
        return new C41022g(this.f176991G, mo133244d());
    }

    @Override // p690zr.C41028i
    /* JADX INFO: renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo133244d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m133238a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo133244d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C41019f(this.f176991G, mo133244d().descendingMap());
    }

    /* JADX INFO: renamed from: e */
    public final C41011c0 m133245e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionM133292c = this.f176991G.m133292c();
        collectionM133292c.addAll((Collection) entry.getValue());
        it.remove();
        return new C41011c0(entry.getKey(), Collections.unmodifiableList((List) collectionM133292c));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo133244d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m133238a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo133244d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m133238a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo133244d().floorKey(obj);
    }

    @Override // p690zr.C41028i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo133244d() {
        return (NavigableMap) ((SortedMap) this.f176981y);
    }

    @Override // p690zr.C41028i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo133244d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m133238a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo133244d().higherKey(obj);
    }

    @Override // p690zr.C41028i, p690zr.C41013d, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo133244d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m133238a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo133244d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m133238a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo133244d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m133245e(((C41007b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m133245e(((C41007b) ((C41013d) descendingMap()).entrySet()).iterator());
    }

    @Override // p690zr.C41028i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p690zr.C41028i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z4) {
        return new C41019f(this.f176991G, mo133244d().headMap(obj, z4));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z4, Object obj2, boolean z13) {
        return new C41019f(this.f176991G, mo133244d().subMap(obj, z4, obj2, z13));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z4) {
        return new C41019f(this.f176991G, mo133244d().tailMap(obj, z4));
    }
}
