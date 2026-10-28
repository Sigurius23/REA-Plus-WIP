package p441qx;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: qx.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30710f0 extends AbstractSet {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126454w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30714h0 f126455x;

    public /* synthetic */ C30710f0(C30714h0 c30714h0, int i13) {
        this.f126454w = i13;
        this.f126455x = c30714h0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f126454w) {
            case 0:
                this.f126455x.clear();
                break;
            default:
                this.f126455x.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C30712g0 c30712g0M94385a;
        Object obj2;
        Object value;
        switch (this.f126454w) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C30714h0 c30714h0 = this.f126455x;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C30712g0 c30712g0 = null;
                if (key != null) {
                    try {
                        c30712g0M94385a = c30714h0.m94385a(key, false);
                    } catch (ClassCastException unused) {
                        c30712g0M94385a = null;
                    }
                    break;
                } else {
                    c30712g0M94385a = null;
                }
                if (c30712g0M94385a != null && ((obj2 = c30712g0M94385a.f126464H) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c30712g0 = c30712g0M94385a;
                }
                return c30712g0 != null;
            default:
                return this.f126455x.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f126454w) {
            case 0:
                return new C30708e0(this.f126455x, 0);
            default:
                return new C30708e0(this.f126455x, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C30712g0 c30712g0M94385a;
        Object obj2;
        Object value;
        switch (this.f126454w) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C30714h0 c30714h0 = this.f126455x;
                C30712g0 c30712g0 = null;
                if (key != null) {
                    try {
                        c30712g0M94385a = c30714h0.m94385a(key, false);
                    } catch (ClassCastException unused) {
                        c30712g0M94385a = null;
                    }
                    break;
                } else {
                    c30712g0M94385a = null;
                }
                if (c30712g0M94385a != null && ((obj2 = c30712g0M94385a.f126464H) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c30712g0 = c30712g0M94385a;
                }
                if (c30712g0 == null) {
                    return false;
                }
                c30714h0.m94387c(c30712g0, true);
                return true;
            default:
                C30714h0 c30714h1 = this.f126455x;
                C30712g0 c30712g0M94385a2 = null;
                if (obj != null) {
                    try {
                        c30712g0M94385a2 = c30714h1.m94385a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c30712g0M94385a2 != null) {
                    c30714h1.m94387c(c30712g0M94385a2, true);
                }
                return c30712g0M94385a2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f126454w) {
            case 0:
                break;
        }
        return this.f126455x.f126481z;
    }
}
