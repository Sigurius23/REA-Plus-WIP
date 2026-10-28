package androidx.health.platform.client.proto;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p002a0.C0004a;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.w2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1546w2 extends AbstractMap {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ int f6132G = 0;

    /* JADX INFO: renamed from: E */
    public volatile C0004a f6133E;

    /* JADX INFO: renamed from: F */
    public Map f6134F;

    /* JADX INFO: renamed from: w */
    public final int f6135w;

    /* JADX INFO: renamed from: x */
    public List f6136x = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: y */
    public Map f6137y;

    /* JADX INFO: renamed from: z */
    public boolean f6138z;

    public C1546w2(int i13) {
        this.f6135w = i13;
        Map map = Collections.EMPTY_MAP;
        this.f6137y = map;
        this.f6134F = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m4928a(Comparable comparable) {
        int i13;
        int i14;
        int i15;
        int iCompareTo;
        int size = this.f6136x.size();
        int i16 = size - 1;
        if (i16 < 0) {
            i13 = 0;
            while (i13 <= i16) {
                i15 = (i13 + i16) / 2;
                iCompareTo = comparable.compareTo(((C1437a3) this.f6136x.get(i15)).f6018w);
                if (iCompareTo < 0) {
                    i16 = i15 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i15;
                    }
                    i13 = i15 + 1;
                }
            }
            i14 = i13 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C1437a3) this.f6136x.get(i16)).f6018w);
            if (iCompareTo2 > 0) {
                i14 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i16;
                }
                i13 = 0;
                while (i13 <= i16) {
                    i15 = (i13 + i16) / 2;
                    iCompareTo = comparable.compareTo(((C1437a3) this.f6136x.get(i15)).f6018w);
                    if (iCompareTo < 0) {
                        i16 = i15 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i15;
                        }
                        i13 = i15 + 1;
                    }
                }
                i14 = i13 + 1;
            }
        }
        return -i14;
    }

    /* JADX INFO: renamed from: b */
    public final void m4929b() {
        if (this.f6138z) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m4930c(int i13) {
        return (Map.Entry) this.f6136x.get(i13);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4929b();
        if (!this.f6136x.isEmpty()) {
            this.f6136x.clear();
        }
        if (this.f6137y.isEmpty()) {
            return;
        }
        this.f6137y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m4928a(comparable) >= 0 || this.f6137y.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m4931d() {
        return this.f6137y.isEmpty() ? AbstractC1559z2.f6172b : this.f6137y.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m4932e() {
        m4929b();
        if (this.f6137y.isEmpty() && !(this.f6137y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6137y = treeMap;
            this.f6134F = treeMap.descendingMap();
        }
        return (SortedMap) this.f6137y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6133E == null) {
            this.f6133E = new C0004a(this, 2);
        }
        return this.f6133E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1546w2)) {
            return super.equals(obj);
        }
        C1546w2 c1546w2 = (C1546w2) obj;
        int size = size();
        if (size == c1546w2.size()) {
            int size2 = this.f6136x.size();
            if (size2 != c1546w2.f6136x.size()) {
                return ((AbstractSet) entrySet()).equals(c1546w2.entrySet());
            }
            for (int i13 = 0; i13 < size2; i13++) {
                if (m4930c(i13).equals(c1546w2.m4930c(i13))) {
                }
            }
            if (size2 != size) {
                return this.f6137y.equals(c1546w2.f6137y);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4933g(Comparable comparable, Object obj) {
        m4929b();
        int iM4928a = m4928a(comparable);
        if (iM4928a >= 0) {
            return ((C1437a3) this.f6136x.get(iM4928a)).setValue(obj);
        }
        m4929b();
        boolean zIsEmpty = this.f6136x.isEmpty();
        int i13 = this.f6135w;
        if (zIsEmpty && !(this.f6136x instanceof ArrayList)) {
            this.f6136x = new ArrayList(i13);
        }
        int i14 = -(iM4928a + 1);
        if (i14 >= i13) {
            return m4932e().put(comparable, obj);
        }
        if (this.f6136x.size() == i13) {
            C1437a3 c1437a3 = (C1437a3) this.f6136x.remove(i13 - 1);
            m4932e().put(c1437a3.f6018w, c1437a3.f6019x);
        }
        this.f6136x.add(i14, new C1437a3(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM4928a = m4928a(comparable);
        return iM4928a >= 0 ? ((C1437a3) this.f6136x.get(iM4928a)).f6019x : this.f6137y.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final Object m4934h(int i13) {
        m4929b();
        Object obj = ((C1437a3) this.f6136x.remove(i13)).f6019x;
        if (!this.f6137y.isEmpty()) {
            Iterator it = m4932e().entrySet().iterator();
            List list = this.f6136x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1437a3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f6136x.size();
        int iHashCode = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iHashCode += ((C1437a3) this.f6136x.get(i13)).hashCode();
        }
        return this.f6137y.size() > 0 ? this.f6137y.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return m4933g(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4929b();
        Comparable comparable = (Comparable) obj;
        int iM4928a = m4928a(comparable);
        if (iM4928a >= 0) {
            return m4934h(iM4928a);
        }
        if (this.f6137y.isEmpty()) {
            return null;
        }
        return this.f6137y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6137y.size() + this.f6136x.size();
    }
}
