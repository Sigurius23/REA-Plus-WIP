package wa3;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: wa3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C36983a0 extends AbstractMap {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ int f158307F = 0;

    /* JADX INFO: renamed from: E */
    public volatile C36995g0 f158308E;

    /* JADX INFO: renamed from: w */
    public final int f158309w;

    /* JADX INFO: renamed from: x */
    public List f158310x = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: y */
    public Map f158311y = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: z */
    public boolean f158312z;

    public C36983a0(int i13) {
        this.f158309w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m118727a(Comparable comparable) {
        int i13;
        int i14;
        int i15;
        int iCompareTo;
        int size = this.f158310x.size();
        int i16 = size - 1;
        if (i16 < 0) {
            i13 = 0;
            while (i13 <= i16) {
                i15 = (i13 + i16) / 2;
                iCompareTo = comparable.compareTo(((C36991e0) this.f158310x.get(i15)).f158322w);
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
            int iCompareTo2 = comparable.compareTo(((C36991e0) this.f158310x.get(i16)).f158322w);
            if (iCompareTo2 > 0) {
                i14 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i16;
                }
                i13 = 0;
                while (i13 <= i16) {
                    i15 = (i13 + i16) / 2;
                    iCompareTo = comparable.compareTo(((C36991e0) this.f158310x.get(i15)).f158322w);
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
    public final void m118728b() {
        if (this.f158312z) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Iterable m118729c() {
        return this.f158311y.isEmpty() ? AbstractC36989d0.f158320b : this.f158311y.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m118728b();
        if (!this.f158310x.isEmpty()) {
            this.f158310x.clear();
        }
        if (this.f158311y.isEmpty()) {
            return;
        }
        this.f158311y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m118727a(comparable) >= 0 || this.f158311y.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final SortedMap m118730d() {
        m118728b();
        if (this.f158311y.isEmpty() && !(this.f158311y instanceof TreeMap)) {
            this.f158311y = new TreeMap();
        }
        return (SortedMap) this.f158311y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m118728b();
        int iM118727a = m118727a(comparable);
        if (iM118727a >= 0) {
            return ((C36991e0) this.f158310x.get(iM118727a)).setValue(obj);
        }
        m118728b();
        boolean zIsEmpty = this.f158310x.isEmpty();
        int i13 = this.f158309w;
        if (zIsEmpty && !(this.f158310x instanceof ArrayList)) {
            this.f158310x = new ArrayList(i13);
        }
        int i14 = -(iM118727a + 1);
        if (i14 >= i13) {
            return m118730d().put(comparable, obj);
        }
        if (this.f158310x.size() == i13) {
            C36991e0 c36991e0 = (C36991e0) this.f158310x.remove(i13 - 1);
            m118730d().put(c36991e0.f158322w, c36991e0.f158323x);
        }
        this.f158310x.add(i14, new C36991e0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f158308E == null) {
            this.f158308E = new C36995g0(this);
        }
        return this.f158308E;
    }

    /* JADX INFO: renamed from: g */
    public final Object m118732g(int i13) {
        m118728b();
        Object obj = ((C36991e0) this.f158310x.remove(i13)).f158323x;
        if (!this.f158311y.isEmpty()) {
            Iterator it = m118730d().entrySet().iterator();
            List list = this.f158310x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C36991e0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM118727a = m118727a(comparable);
        return iM118727a >= 0 ? ((C36991e0) this.f158310x.get(iM118727a)).f158323x : this.f158311y.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m118728b();
        Comparable comparable = (Comparable) obj;
        int iM118727a = m118727a(comparable);
        if (iM118727a >= 0) {
            return m118732g(iM118727a);
        }
        if (this.f158311y.isEmpty()) {
            return null;
        }
        return this.f158311y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f158311y.size() + this.f158310x.size();
    }
}
