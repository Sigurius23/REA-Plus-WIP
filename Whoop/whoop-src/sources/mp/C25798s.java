package mp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p026b2.C2298d;
import p031b9.AbstractC2875y;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: mp.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C25798s extends AbstractC25790o implements NavigableMap {

    /* JADX INFO: renamed from: F */
    public static final C25798s f101531F;

    /* JADX INFO: renamed from: E */
    public final transient C25798s f101532E;

    /* JADX INFO: renamed from: y */
    public final transient C25751a0 f101533y;

    /* JADX INFO: renamed from: z */
    public final transient AbstractC25788n f101534z;

    static {
        C25751a0 c25751a0M76044p = AbstractC25800t.m76044p(C25806w.f101547x);
        C25777j c25777j = AbstractC25788n.f101515x;
        f101531F = new C25798s(c25751a0M76044p, C25810y.f101552E, null);
    }

    public C25798s(C25751a0 c25751a0, AbstractC25788n abstractC25788n, C25798s c25798s) {
        this.f101533y = c25751a0;
        this.f101534z = abstractC25788n;
        this.f101532E = c25798s;
    }

    /* JADX INFO: renamed from: b */
    public static C25798s m76033b(TreeMap treeMap) {
        C25806w c25806w = C25806w.f101547x;
        Comparator comparator = treeMap.comparator();
        int i13 = 1;
        boolean zEquals = comparator == null ? true : c25806w.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionEntrySet.toArray(AbstractC25790o.f101520x);
        int length = entryArr.length;
        if (length == 0) {
            return m76034c(c25806w);
        }
        int i14 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i15 = 0; i15 < 1; i15++) {
                if (objArr[i15] == null) {
                    throw new NullPointerException(AbstractC2875y.m8295h(i15, "at index "));
                }
            }
            C25751a0 c25751a0 = new C25751a0(AbstractC25788n.m76024l(1, objArr), c25806w);
            Object[] objArr2 = {value};
            while (i14 < 1) {
                if (objArr2[i14] == null) {
                    throw new NullPointerException(AbstractC2875y.m8295h(i14, "at index "));
                }
                i14++;
            }
            return new C25798s(c25751a0, AbstractC25788n.m76024l(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i14 < length) {
                Map.Entry entry2 = entryArr[i14];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                AbstractC25753b.m75994f(key2, value2);
                objArr3[i14] = key2;
                objArr4[i14] = value2;
                i14++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new C2298d(20));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            AbstractC25753b.m75994f(objArr3[0], value3);
            while (i13 < length) {
                Map.Entry entry4 = entryArr[i13 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i13];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                AbstractC25753b.m75994f(key4, value4);
                objArr3[i13] = key4;
                objArr4[i13] = value4;
                if (c25806w.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(AbstractC31061c.m95640p("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i13++;
                key3 = key4;
            }
        }
        return new C25798s(new C25751a0(AbstractC25788n.m76024l(length, objArr3), c25806w), AbstractC25788n.m76024l(length, objArr4), null);
    }

    /* JADX INFO: renamed from: c */
    public static C25798s m76034c(Comparator comparator) {
        if (C25806w.f101547x.equals(comparator)) {
            return f101531F;
        }
        C25751a0 c25751a0M76044p = AbstractC25800t.m76044p(comparator);
        C25777j c25777j = AbstractC25788n.f101515x;
        return new C25798s(c25751a0M76044p, C25810y.f101552E, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f101533y.f101538z;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C25798s headMap(Object obj, boolean z4) {
        obj.getClass();
        return m76038h(0, this.f101533y.m75985q(obj, z4));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f101533y.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C25798s c25798s = this.f101532E;
        if (c25798s != null) {
            return c25798s;
        }
        boolean zIsEmpty = isEmpty();
        C25751a0 c25751a0 = this.f101533y;
        if (!zIsEmpty) {
            return new C25798s((C25751a0) c25751a0.descendingSet(), this.f101534z.mo76021g(), this);
        }
        Comparator comparator = c25751a0.f101538z;
        return m76034c((comparator instanceof AbstractC25808x ? (AbstractC25808x) comparator : new C25771h(comparator)).mo76003a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C25798s subMap(Object obj, boolean z4, Object obj2, boolean z13) {
        obj.getClass();
        obj2.getClass();
        if (this.f101533y.f101538z.compare(obj, obj2) <= 0) {
            return headMap(obj2, z13).tailMap(obj, z4);
        }
        throw new IllegalArgumentException(AbstractC25753b.m75991c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo75984l().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f101533y.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C25798s tailMap(Object obj, boolean z4) {
        obj.getClass();
        return m76038h(this.f101533y.m75986r(obj, z4), this.f101534z.size());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // mp.AbstractC25790o, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C25751a0 c25751a0 = this.f101533y;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c25751a0.f101463F, obj, c25751a0.f101538z);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f101534z.get(iBinarySearch);
    }

    /* JADX INFO: renamed from: h */
    public final C25798s m76038h(int i13, int i14) {
        AbstractC25788n abstractC25788n = this.f101534z;
        if (i13 == 0) {
            if (i14 == abstractC25788n.size()) {
                return this;
            }
            i13 = 0;
        }
        C25751a0 c25751a0 = this.f101533y;
        return i13 == i14 ? m76034c(c25751a0.f101538z) : new C25798s(c25751a0.m75987t(i13, i14), abstractC25788n.subList(i13, i14), null);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f101533y;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo75984l().get(this.f101534z.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f101533y.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f101533y;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f101534z.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f101534z;
    }
}
