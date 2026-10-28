package n83;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m83.AbstractC25252j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n83.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C26464g extends AbstractC25252j {

    /* JADX INFO: renamed from: w */
    public final C26463f f105117w;

    public C26464g(C26463f c26463f) {
        this.f105117w = c26463f;
    }

    @Override // m83.AbstractC25252j
    /* JADX INFO: renamed from: a */
    public final int mo74013a() {
        return this.f105117w.f105108I;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        AbstractC22676k.m65750j(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f105117w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f105117w.m78384g((Map.Entry) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f105117w.m78383e(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f105117w.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C26463f c26463f = this.f105117w;
        c26463f.getClass();
        return new C26461d(c26463f, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C26463f c26463f = this.f105117w;
        c26463f.getClass();
        c26463f.m78381c();
        int iM78386i = c26463f.m78386i(entry.getKey());
        if (iM78386i >= 0) {
            Object[] objArr = c26463f.f105114x;
            AbstractC22676k.m65747g(objArr);
            if (AbstractC22676k.m65745e(objArr[iM78386i], entry.getValue())) {
                c26463f.m78390m(iM78386i);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        this.f105117w.m78381c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        this.f105117w.m78381c();
        return super.retainAll(elements);
    }
}
