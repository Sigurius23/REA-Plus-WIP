package androidx.health.platform.client.proto;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.i3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1477i3 extends AbstractList implements InterfaceC1435a1, RandomAccess {

    /* JADX INFO: renamed from: w */
    public final C1557z0 f6053w;

    public C1477i3(C1557z0 c1557z0) {
        this.f6053w = c1557z0;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: M0 */
    public final void mo4565M0(C1468h c1468h) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: b */
    public final List mo4566b() {
        return Collections.unmodifiableList(this.f6053w.f6167x);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (String) this.f6053w.get(i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C1472h3 c1472h3 = new C1472h3();
        c1472h3.f6051w = this.f6053w.iterator();
        return c1472h3;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: k */
    public final InterfaceC1435a1 mo4567k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        C1467g3 c1467g3 = new C1467g3();
        c1467g3.f6043w = this.f6053w.listIterator(i13);
        return c1467g3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6053w.size();
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: x */
    public final Object mo4568x(int i13) {
        return this.f6053w.f6167x.get(i13);
    }
}
