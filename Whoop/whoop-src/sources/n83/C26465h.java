package n83;

import java.util.Collection;
import java.util.Iterator;
import m83.AbstractC25246g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n83.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C26465h extends AbstractC25246g {

    /* JADX INFO: renamed from: w */
    public final C26463f f105118w;

    public C26465h(C26463f c26463f) {
        this.f105118w = c26463f;
    }

    @Override // m83.AbstractC25246g
    /* JADX INFO: renamed from: a */
    public final int mo73985a() {
        return this.f105118w.f105108I;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f105118w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f105118w.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f105118w.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C26463f c26463f = this.f105118w;
        c26463f.getClass();
        return new C26461d(c26463f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C26463f c26463f = this.f105118w;
        c26463f.m78381c();
        int iM78387j = c26463f.m78387j(obj);
        if (iM78387j < 0) {
            return false;
        }
        c26463f.m78390m(iM78387j);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        this.f105118w.m78381c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        this.f105118w.m78381c();
        return super.retainAll(elements);
    }
}
