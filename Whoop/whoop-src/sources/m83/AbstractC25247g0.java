package m83;

import androidx.room.AbstractC1772c1;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m83.g0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25247g0 extends AbstractC1772c1 {
    /* JADX INFO: renamed from: U */
    public static Object m73986U(Object obj, Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        if (map instanceof InterfaceC25245f0) {
            return ((InterfaceC25245f0) map).m73984R();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(AbstractC18489d0.m53369j(obj, "Key ", " is missing in the map."));
    }

    /* JADX INFO: renamed from: V */
    public static HashMap m73987V(C23465k... c23465kArr) {
        HashMap map = new HashMap(m73988W(c23465kArr.length));
        m73997f0(map, c23465kArr);
        return map;
    }

    /* JADX INFO: renamed from: W */
    public static int m73988W(int i13) {
        if (i13 < 0) {
            return i13;
        }
        if (i13 < 3) {
            return i13 + 1;
        }
        if (i13 < 1073741824) {
            return (int) ((i13 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: X */
    public static Map m73989X(C23465k pair) {
        AbstractC22676k.m65750j(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f92937w, pair.f92938x);
        AbstractC22676k.m65749i(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: Y */
    public static Map m73990Y(C23465k... c23465kArr) {
        if (c23465kArr.length <= 0) {
            return C25272z.f99163w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m73988W(c23465kArr.length));
        m73997f0(linkedHashMap, c23465kArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: Z */
    public static Map m73991Z(Object obj, Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        LinkedHashMap linkedHashMapM74003l0 = m74003l0(map);
        linkedHashMapM74003l0.remove(obj);
        return m73994c0(linkedHashMapM74003l0);
    }

    /* JADX INFO: renamed from: a0 */
    public static Map m73992a0(Map map, Iterable keys) {
        AbstractC22676k.m65750j(map, "<this>");
        AbstractC22676k.m65750j(keys, "keys");
        LinkedHashMap linkedHashMapM74003l0 = m74003l0(map);
        Set setKeySet = linkedHashMapM74003l0.keySet();
        AbstractC22676k.m65750j(setKeySet, "<this>");
        setKeySet.removeAll(AbstractC25265s.m74157x0(keys));
        return m73994c0(linkedHashMapM74003l0);
    }

    /* JADX INFO: renamed from: b0 */
    public static LinkedHashMap m73993b0(C23465k... pairs) {
        AbstractC22676k.m65750j(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m73988W(pairs.length));
        m73997f0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Map m73994c0(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : m74004m0(linkedHashMap);
        }
        return C25272z.f99163w;
    }

    /* JADX INFO: renamed from: d0 */
    public static LinkedHashMap m73995d0(Map map, Map map2) {
        AbstractC22676k.m65750j(map, "<this>");
        AbstractC22676k.m65750j(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: e0 */
    public static Map m73996e0(Map map, C23465k c23465k) {
        AbstractC22676k.m65750j(map, "<this>");
        if (map.isEmpty()) {
            return m73989X(c23465k);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c23465k.f92937w, c23465k.f92938x);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m73997f0(HashMap map, C23465k[] pairs) {
        AbstractC22676k.m65750j(pairs, "pairs");
        for (C23465k c23465k : pairs) {
            map.put(c23465k.f92937w, c23465k.f92938x);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m73998g0(LinkedHashMap linkedHashMap, Iterable pairs) {
        AbstractC22676k.m65750j(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C23465k c23465k = (C23465k) it.next();
            linkedHashMap.put(c23465k.f92937w, c23465k.f92938x);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static List m73999h0(Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        int size = map.size();
        C25271y c25271y = C25271y.f99162w;
        if (size == 0) {
            return c25271y;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c25271y;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC37056f.m118958J(new C23465k(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C23465k(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C23465k(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public static Map m74000i0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m73998g0(linkedHashMap, iterable);
            return m73994c0(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C25272z.f99163w;
        }
        if (size == 1) {
            return m73989X((C23465k) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m73988W(collection.size()));
        m73998g0(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: j0 */
    public static Map m74001j0(Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? m74003l0(map) : m74004m0(map);
        }
        return C25272z.f99163w;
    }

    /* JADX INFO: renamed from: k0 */
    public static Map m74002k0(C23465k[] c23465kArr) {
        AbstractC22676k.m65750j(c23465kArr, "<this>");
        int length = c23465kArr.length;
        if (length == 0) {
            return C25272z.f99163w;
        }
        if (length == 1) {
            return m73989X(c23465kArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m73988W(c23465kArr.length));
        m73997f0(linkedHashMap, c23465kArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: l0 */
    public static LinkedHashMap m74003l0(Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        return new LinkedHashMap(map);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Map m74004m0(Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC22676k.m65749i(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: n0 */
    public static TreeMap m74005n0(Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        return new TreeMap(map);
    }

    /* JADX INFO: renamed from: o0 */
    public static TreeMap m74006o0(Map map, Comparator comparator) {
        AbstractC22676k.m65750j(map, "<this>");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
