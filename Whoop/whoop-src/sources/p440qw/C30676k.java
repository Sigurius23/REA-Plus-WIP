package p440qw;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: qw.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C30676k extends AbstractSet {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126220w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30679n f126221x;

    public /* synthetic */ C30676k(C30679n c30679n, int i13) {
        this.f126220w = i13;
        this.f126221x = c30679n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f126220w) {
            case 0:
                this.f126221x.clear();
                break;
            default:
                this.f126221x.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C30678m c30678mM94279a;
        switch (this.f126220w) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C30679n c30679n = this.f126221x;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C30678m c30678m = null;
                if (key != null) {
                    try {
                        c30678mM94279a = c30679n.m94279a(key, false);
                    } catch (ClassCastException unused) {
                        c30678mM94279a = null;
                    }
                    break;
                } else {
                    c30678mM94279a = null;
                }
                if (c30678mM94279a != null && Objects.equals(c30678mM94279a.f126230H, entry.getValue())) {
                    c30678m = c30678mM94279a;
                }
                return c30678m != null;
            default:
                return this.f126221x.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f126220w) {
            case 0:
                return new C30675j(this.f126221x, 0);
            default:
                return new C30675j(this.f126221x, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C30678m c30678mM94279a;
        switch (this.f126220w) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C30679n c30679n = this.f126221x;
                C30678m c30678m = null;
                if (key != null) {
                    try {
                        c30678mM94279a = c30679n.m94279a(key, false);
                    } catch (ClassCastException unused) {
                        c30678mM94279a = null;
                    }
                    break;
                } else {
                    c30678mM94279a = null;
                }
                if (c30678mM94279a != null && Objects.equals(c30678mM94279a.f126230H, entry.getValue())) {
                    c30678m = c30678mM94279a;
                }
                if (c30678m == null) {
                    return false;
                }
                c30679n.m94281c(c30678m, true);
                return true;
            default:
                C30679n c30679n2 = this.f126221x;
                C30678m c30678mM94279a2 = null;
                if (obj != null) {
                    try {
                        c30678mM94279a2 = c30679n2.m94279a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c30678mM94279a2 != null) {
                    c30679n2.m94281c(c30678mM94279a2, true);
                }
                return c30678mM94279a2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f126220w) {
            case 0:
                break;
        }
        return this.f126221x.f126244z;
    }
}
