package p690zr;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: zr.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C41041n extends AbstractCollection {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177025w;

    /* JADX INFO: renamed from: x */
    public final Object f177026x;

    public /* synthetic */ C41041n(int i13, Serializable serializable) {
        this.f177025w = i13;
        this.f177026x = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f177025w) {
            case 0:
                ((C41052s0) this.f177026x).m133291b();
                break;
            case 1:
                ((C41055u) this.f177026x).clear();
                break;
            default:
                ((C41013d) this.f177026x).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f177025w) {
            case 0:
                Iterator it = ((C41052s0) this.f177026x).mo133270a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C41013d) this.f177026x).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f177025w) {
            case 2:
                return ((C41013d) this.f177026x).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f177025w) {
            case 0:
                return new C41004a((C41052s0) this.f177026x);
            case 1:
                C41055u c41055u = (C41055u) this.f177026x;
                Map mapM133297b = c41055u.m133297b();
                return mapM133297b != null ? mapM133297b.values().iterator() : new C41049r(c41055u, 2);
            default:
                return new C41048q0(((C41013d) this.f177026x).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f177025w) {
            case 2:
                C41013d c41013d = (C41013d) this.f177026x;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : c41013d.entrySet()) {
                        if (AbstractC31479j.m96940s(obj, entry.getValue())) {
                            c41013d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f177025w) {
            case 2:
                C41013d c41013d = (C41013d) this.f177026x;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c41013d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c41013d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f177025w) {
            case 2:
                C41013d c41013d = (C41013d) this.f177026x;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c41013d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c41013d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f177025w) {
            case 0:
                return ((C41052s0) this.f177026x).f177047E;
            case 1:
                return ((C41055u) this.f177026x).size();
            default:
                return ((C41013d) this.f177026x).f176981y.size();
        }
    }

    public C41041n(C41013d c41013d) {
        this.f177025w = 2;
        this.f177026x = c41013d;
    }
}
