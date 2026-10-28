package p690zr;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p658yr.InterfaceC39719f;

/* JADX INFO: renamed from: zr.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41024g1 extends C41021f1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f176995w).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f176995w.iterator();
        it.getClass();
        InterfaceC39719f interfaceC39719f = this.f176996x;
        interfaceC39719f.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC39719f.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C41024g1(((SortedSet) this.f176995w).headSet(obj), this.f176996x);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f176995w;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f176996x.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C41024g1(((SortedSet) this.f176995w).subSet(obj, obj2), this.f176996x);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C41024g1(((SortedSet) this.f176995w).tailSet(obj), this.f176996x);
    }
}
