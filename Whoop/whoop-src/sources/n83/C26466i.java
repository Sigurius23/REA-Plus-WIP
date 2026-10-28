package n83;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import m83.AbstractC25252j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n83.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C26466i extends AbstractC25252j implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final C26466i f105119x;

    /* JADX INFO: renamed from: w */
    public final C26463f f105120w;

    static {
        C26463f c26463f = C26463f.f105103N;
        f105119x = new C26466i(C26463f.f105103N);
    }

    public C26466i(C26463f backing) {
        AbstractC22676k.m65750j(backing, "backing");
        this.f105120w = backing;
    }

    @Override // m83.AbstractC25252j
    /* JADX INFO: renamed from: a */
    public final int mo74013a() {
        return this.f105120w.f105108I;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f105120w.m78379a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        this.f105120w.m78381c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f105120w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f105120w.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f105120w.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C26463f c26463f = this.f105120w;
        c26463f.getClass();
        return new C26461d(c26463f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C26463f c26463f = this.f105120w;
        c26463f.m78381c();
        int iM78386i = c26463f.m78386i(obj);
        if (iM78386i < 0) {
            return false;
        }
        c26463f.m78390m(iM78386i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        this.f105120w.m78381c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        this.f105120w.m78381c();
        return super.retainAll(elements);
    }

    public C26466i() {
        this(new C26463f());
    }
}
