package p690zr;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: renamed from: zr.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41042n0 extends AbstractC41033j1 implements ListIterator {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f177027x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractList f177028y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41042n0(AbstractList abstractList, ListIterator listIterator, int i13) {
        super(listIterator);
        this.f177027x = i13;
        this.f177028y = abstractList;
    }

    @Override // p690zr.AbstractC41033j1
    /* JADX INFO: renamed from: a */
    public final Object mo133265a(Object obj) {
        switch (this.f177027x) {
            case 0:
                return ((C41044o0) this.f177028y).f177033x.apply(obj);
            default:
                return ((C41046p0) this.f177028y).f177037x.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f177008w).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f177008w).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo133265a(((ListIterator) this.f177008w).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f177008w).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
