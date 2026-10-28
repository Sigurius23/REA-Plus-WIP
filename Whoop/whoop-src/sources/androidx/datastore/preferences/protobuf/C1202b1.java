package androidx.datastore.preferences.protobuf;

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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1202b1 extends AbstractMap {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ int f5354F = 0;

    /* JADX INFO: renamed from: E */
    public Map f5355E;

    /* JADX INFO: renamed from: w */
    public List f5356w;

    /* JADX INFO: renamed from: x */
    public Map f5357x;

    /* JADX INFO: renamed from: y */
    public boolean f5358y;

    /* JADX INFO: renamed from: z */
    public volatile C0004a f5359z;

    /* JADX INFO: renamed from: g */
    public static C1202b1 m3779g() {
        C1202b1 c1202b1 = new C1202b1();
        c1202b1.f5356w = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        c1202b1.f5357x = map;
        c1202b1.f5355E = map;
        return c1202b1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m3780a(Comparable comparable) {
        int i13;
        int i14;
        int i15;
        int iCompareTo;
        int size = this.f5356w.size();
        int i16 = size - 1;
        if (i16 < 0) {
            i13 = 0;
            while (i13 <= i16) {
                i15 = (i13 + i16) / 2;
                iCompareTo = comparable.compareTo(((C1205c1) this.f5356w.get(i15)).m3790a());
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
            int iCompareTo2 = comparable.compareTo(((C1205c1) this.f5356w.get(i16)).m3790a());
            if (iCompareTo2 > 0) {
                i14 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i16;
                }
                i13 = 0;
                while (i13 <= i16) {
                    i15 = (i13 + i16) / 2;
                    iCompareTo = comparable.compareTo(((C1205c1) this.f5356w.get(i15)).m3790a());
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
    public final void m3781b() {
        if (this.f5358y) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m3782c(int i13) {
        return (Map.Entry) this.f5356w.get(i13);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3781b();
        if (!this.f5356w.isEmpty()) {
            this.f5356w.clear();
        }
        if (this.f5357x.isEmpty()) {
            return;
        }
        this.f5357x.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3780a(comparable) >= 0 || this.f5357x.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Set m3783d() {
        return this.f5357x.isEmpty() ? Collections.EMPTY_SET : this.f5357x.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m3784e() {
        m3781b();
        if (this.f5357x.isEmpty() && !(this.f5357x instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5357x = treeMap;
            this.f5355E = treeMap.descendingMap();
        }
        return (SortedMap) this.f5357x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5359z == null) {
            this.f5359z = new C0004a(this, 1);
        }
        return this.f5359z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1202b1)) {
            return super.equals(obj);
        }
        C1202b1 c1202b1 = (C1202b1) obj;
        int size = size();
        if (size == c1202b1.size()) {
            int size2 = this.f5356w.size();
            if (size2 != c1202b1.f5356w.size()) {
                return ((AbstractSet) entrySet()).equals(c1202b1.entrySet());
            }
            for (int i13 = 0; i13 < size2; i13++) {
                if (m3782c(i13).equals(c1202b1.m3782c(i13))) {
                }
            }
            if (size2 != size) {
                return this.f5357x.equals(c1202b1.f5357x);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM3780a = m3780a(comparable);
        return iM3780a >= 0 ? ((C1205c1) this.f5356w.get(iM3780a)).getValue() : this.f5357x.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m3781b();
        int iM3780a = m3780a(comparable);
        if (iM3780a >= 0) {
            return ((C1205c1) this.f5356w.get(iM3780a)).setValue(obj);
        }
        m3781b();
        if (this.f5356w.isEmpty() && !(this.f5356w instanceof ArrayList)) {
            this.f5356w = new ArrayList(16);
        }
        int i13 = -(iM3780a + 1);
        if (i13 >= 16) {
            return m3784e().put(comparable, obj);
        }
        if (this.f5356w.size() == 16) {
            C1205c1 c1205c1 = (C1205c1) this.f5356w.remove(15);
            m3784e().put(c1205c1.m3790a(), c1205c1.getValue());
        }
        this.f5356w.add(i13, new C1205c1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f5356w.size();
        int iHashCode = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iHashCode += ((C1205c1) this.f5356w.get(i13)).hashCode();
        }
        return this.f5357x.size() > 0 ? this.f5357x.hashCode() + iHashCode : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m3786i(int i13) {
        m3781b();
        Object value = ((C1205c1) this.f5356w.remove(i13)).getValue();
        if (!this.f5357x.isEmpty()) {
            Iterator it = m3784e().entrySet().iterator();
            this.f5356w.add(new C1205c1(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3781b();
        Comparable comparable = (Comparable) obj;
        int iM3780a = m3780a(comparable);
        if (iM3780a >= 0) {
            return m3786i(iM3780a);
        }
        if (this.f5357x.isEmpty()) {
            return null;
        }
        return this.f5357x.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5357x.size() + this.f5356w.size();
    }
}
