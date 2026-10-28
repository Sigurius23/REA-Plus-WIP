package m83;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m83.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25253j0 extends AbstractC25242e {

    /* JADX INFO: renamed from: w */
    public final List f99129w;

    public C25253j0(List delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f99129w = delegate;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f99129w.size();
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return this.f99129w.get(AbstractC25265s.m74135m0(i13, this));
    }

    @Override // m83.AbstractC25242e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C25249h0(this, 0);
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final ListIterator listIterator() {
        return new C25249h0(this, 0);
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final ListIterator listIterator(int i13) {
        return new C25249h0(this, i13);
    }
}
