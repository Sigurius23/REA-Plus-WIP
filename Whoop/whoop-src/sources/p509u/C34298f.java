package p509u;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: u.f */
/* JADX INFO: loaded from: classes.dex */
public class C34298f implements Iterable {

    /* JADX INFO: renamed from: w */
    public C34295c f144040w;

    /* JADX INFO: renamed from: x */
    public C34295c f144041x;

    /* JADX INFO: renamed from: y */
    public final WeakHashMap f144042y = new WeakHashMap();

    /* JADX INFO: renamed from: z */
    public int f144043z = 0;

    /* JADX INFO: renamed from: a */
    public C34295c mo108605a(Object obj) {
        C34295c c34295c = this.f144040w;
        while (c34295c != null && !c34295c.f144033w.equals(obj)) {
            c34295c = c34295c.f144035y;
        }
        return c34295c;
    }

    /* JADX INFO: renamed from: c */
    public Object mo108606c(Object obj, Object obj2) {
        C34295c c34295cMo108605a = mo108605a(obj);
        if (c34295cMo108605a != null) {
            return c34295cMo108605a.f144034x;
        }
        C34295c c34295c = new C34295c(obj, obj2);
        this.f144043z++;
        C34295c c34295c2 = this.f144041x;
        if (c34295c2 == null) {
            this.f144040w = c34295c;
            this.f144041x = c34295c;
            return null;
        }
        c34295c2.f144035y = c34295c;
        c34295c.f144036z = c34295c2;
        this.f144041x = c34295c;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public Object mo108607d(Object obj) {
        C34295c c34295cMo108605a = mo108605a(obj);
        if (c34295cMo108605a == null) {
            return null;
        }
        this.f144043z--;
        WeakHashMap weakHashMap = this.f144042y;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC34297e) it.next()).mo108608a(c34295cMo108605a);
            }
        }
        C34295c c34295c = c34295cMo108605a.f144036z;
        if (c34295c != null) {
            c34295c.f144035y = c34295cMo108605a.f144035y;
        } else {
            this.f144040w = c34295cMo108605a.f144035y;
        }
        C34295c c34295c2 = c34295cMo108605a.f144035y;
        if (c34295c2 != null) {
            c34295c2.f144036z = c34295c;
        } else {
            this.f144041x = c34295c;
        }
        c34295cMo108605a.f144035y = null;
        c34295cMo108605a.f144036z = null;
        return c34295cMo108605a.f144034x;
    }

    public final boolean equals(Object obj) {
        C34294b c34294b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34298f)) {
            return false;
        }
        C34298f c34298f = (C34298f) obj;
        if (this.f144043z != c34298f.f144043z) {
            return false;
        }
        Iterator it = iterator();
        Iterator it3 = c34298f.iterator();
        while (true) {
            c34294b = (C34294b) it;
            if (!c34294b.hasNext()) {
                break;
            }
            C34294b c34294b2 = (C34294b) it3;
            if (!c34294b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c34294b.next();
            Object next = c34294b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c34294b.hasNext() || ((C34294b) it3).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C34294b c34294b = (C34294b) it;
            if (!c34294b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c34294b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C34294b c34294b = new C34294b(this.f144040w, this.f144041x, 0);
        this.f144042y.put(c34294b, Boolean.FALSE);
        return c34294b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C34294b c34294b = (C34294b) it;
            if (!c34294b.hasNext()) {
                sb4.append("]");
                return sb4.toString();
            }
            sb4.append(((Map.Entry) c34294b.next()).toString());
            if (c34294b.hasNext()) {
                sb4.append(", ");
            }
        }
    }
}
