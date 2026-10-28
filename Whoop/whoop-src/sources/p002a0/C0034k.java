package p002a0;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: a0.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C0034k implements Set, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97w;

    /* JADX INFO: renamed from: x */
    public final C0057v0 f98x;

    public C0034k(C0057v0 parent, int i13) {
        this.f97w = i13;
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(parent, "parent");
                this.f98x = parent;
                break;
            default:
                AbstractC22676k.m65750j(parent, "parent");
                this.f98x = parent;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f97w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f97w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f97w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f97w) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC22676k.m65745e(this.f98x.m129g(entry.getKey()), entry.getValue());
            default:
                return this.f98x.m125c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f97w) {
            case 0:
                AbstractC22676k.m65750j(elements, "elements");
                Collection<Map.Entry> collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection) {
                    if (!AbstractC22676k.m65745e(this.f98x.m129g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                AbstractC22676k.m65750j(elements, "elements");
                Collection collection2 = elements;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!this.f98x.m125c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f97w) {
            case 0:
                break;
        }
        return this.f98x.m131i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f97w) {
            case 0:
                return AbstractC35745c.m113247i(new C0031j(this, null, 0));
            default:
                return AbstractC35745c.m113247i(new C0031j(this, null, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f97w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f97w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f97w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f97w) {
            case 0:
                break;
        }
        return this.f98x.f174e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f97w) {
            case 0:
                break;
        }
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f97w) {
            case 0:
                AbstractC22676k.m65750j(array, "array");
                break;
            default:
                AbstractC22676k.m65750j(array, "array");
                break;
        }
        return AbstractC22676k.m65759s(this, array);
    }
}
