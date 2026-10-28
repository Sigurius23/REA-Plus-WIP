package o63;

import d93.InterfaceC11825f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25267u;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: o63.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C27618i implements Set, InterfaceC11825f {

    /* JADX INFO: renamed from: w */
    public final Set f111150w;

    /* JADX INFO: renamed from: x */
    public final AbstractC22680m f111151x;

    /* JADX INFO: renamed from: y */
    public final AbstractC22680m f111152y;

    /* JADX INFO: renamed from: z */
    public final int f111153z;

    /* JADX WARN: Multi-variable type inference failed */
    public C27618i(Set delegate, Function1 function1, Function1 function2) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f111150w = delegate;
        this.f111151x = (AbstractC22680m) function1;
        this.f111152y = (AbstractC22680m) function2;
        this.f111153z = delegate.size();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: a */
    public final ArrayList m83380a(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f111152y.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f111150w.add(this.f111152y.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f111150w.addAll(m83380a(elements));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: c */
    public final ArrayList m83381c(Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f111151x.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f111150w.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f111150w.contains(this.f111152y.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f111150w.containsAll(m83380a(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListM83381c = m83381c(this.f111150w);
        return ((Set) obj).containsAll(arrayListM83381c) && arrayListM83381c.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f111150w.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f111150w.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C27617h(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f111150w.remove(this.f111152y.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f111150w.removeAll(m83380a(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f111150w.retainAll(m83380a(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f111153z;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return m83381c(this.f111150w).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}
