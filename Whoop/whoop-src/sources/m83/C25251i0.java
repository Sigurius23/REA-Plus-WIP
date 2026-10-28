package m83;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: m83.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25251i0 extends AbstractC25248h {

    /* JADX INFO: renamed from: w */
    public final ArrayList f99128w;

    public C25251i0(ArrayList arrayList) {
        this.f99128w = arrayList;
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: a */
    public final int mo74007a() {
        return this.f99128w.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        this.f99128w.add(AbstractC25265s.m74137n0(i13, this), obj);
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: c */
    public final Object mo74008c(int i13) {
        return this.f99128w.remove(AbstractC25265s.m74135m0(i13, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f99128w.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return this.f99128w.get(AbstractC25265s.m74135m0(i13, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C25249h0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C25249h0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        return this.f99128w.set(AbstractC25265s.m74135m0(i13, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new C25249h0(this, i13);
    }
}
