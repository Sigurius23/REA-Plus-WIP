package p690zr;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p658yr.InterfaceC39718e;

/* JADX INFO: renamed from: zr.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41046p0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: w */
    public final List f177036w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39718e f177037x;

    public C41046p0(List list, InterfaceC39718e interfaceC39718e) {
        list.getClass();
        this.f177036w = list;
        this.f177037x = interfaceC39718e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f177036w.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new C41042n0(this, this.f177036w.listIterator(i13), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        this.f177036w.subList(i13, i14).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f177036w.size();
    }
}
