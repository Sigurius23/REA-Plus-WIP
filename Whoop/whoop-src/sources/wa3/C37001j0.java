package wa3;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: wa3.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37001j0 extends AbstractList implements RandomAccess, InterfaceC37017t {

    /* JADX INFO: renamed from: w */
    public final C37016s f158352w;

    public C37001j0(C37016s c37016s) {
        this.f158352w = c37016s;
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: S0 */
    public final void mo118812S0(C37018u c37018u) {
        throw new UnsupportedOperationException();
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: b */
    public final List mo118813b() {
        return Collections.unmodifiableList(this.f158352w.f158386w);
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: b0 */
    public final AbstractC36990e mo118814b0(int i13) {
        return this.f158352w.mo118814b0(i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (String) this.f158352w.get(i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C36999i0(this);
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: k */
    public final C37001j0 mo118815k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new C36997h0(this, i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f158352w.size();
    }
}
