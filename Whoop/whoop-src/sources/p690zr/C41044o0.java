package p690zr;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p658yr.InterfaceC39718e;

/* JADX INFO: renamed from: zr.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41044o0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: w */
    public final List f177032w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39718e f177033x;

    public C41044o0(List list, InterfaceC39718e interfaceC39718e) {
        list.getClass();
        this.f177032w = list;
        this.f177033x = interfaceC39718e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return this.f177033x.apply(this.f177032w.get(i13));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f177032w.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new C41042n0(this, this.f177032w.listIterator(i13), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        return this.f177033x.apply(this.f177032w.remove(i13));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        this.f177032w.subList(i13, i14).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f177032w.size();
    }
}
