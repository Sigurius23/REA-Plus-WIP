package p193hf;

import d93.InterfaceC11822c;
import hg3.AbstractC17269i;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hf.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17229f extends C17224a implements InterfaceC11822c, List {

    /* JADX INFO: renamed from: F */
    public final List f66206F;

    /* JADX INFO: renamed from: G */
    public final Function1 f66207G;

    /* JADX INFO: renamed from: H */
    public final Function1 f66208H;

    /* JADX INFO: renamed from: I */
    public final List f66209I;

    /* JADX INFO: renamed from: J */
    public final Function1 f66210J;

    /* JADX INFO: renamed from: K */
    public final Function1 f66211K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17229f(List src, Function1 src2Dest, Function1 dest2Src) {
        super(src, src2Dest, dest2Src);
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        AbstractC22676k.m65750j(dest2Src, "dest2Src");
        this.f66206F = src;
        this.f66207G = src2Dest;
        this.f66208H = dest2Src;
        this.f66209I = src;
        this.f66210J = src2Dest;
        this.f66211K = dest2Src;
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean add(Object obj) {
        return this.f66209I.add(this.f66211K.invoke(obj));
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66209I.addAll(i13, AbstractC17269i.m48912r(elements, this.f66211K, this.f66210J));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final void clear() {
        this.f66209I.clear();
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return this.f66207G.invoke(this.f66206F.get(i13));
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f66206F.indexOf(this.f66208H.invoke(obj));
    }

    @Override // p193hf.C17224a, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f66209I.iterator();
        AbstractC22676k.m65750j(it, "<this>");
        Function1 src2Dest = this.f66210J;
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        return new C17227d(it, src2Dest);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f66206F.lastIndexOf(this.f66208H.invoke(obj));
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        ListIterator listIterator = this.f66209I.listIterator();
        AbstractC22676k.m65750j(listIterator, "<this>");
        Function1 src2Dest = this.f66210J;
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        Function1 dest2Src = this.f66211K;
        AbstractC22676k.m65750j(dest2Src, "dest2Src");
        return new C17228e(listIterator, src2Dest, dest2Src);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        return this.f66210J.invoke(this.f66209I.remove(i13));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66209I.removeAll(AbstractC17269i.m48912r(elements, this.f66211K, this.f66210J));
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66209I.retainAll(AbstractC17269i.m48912r(elements, this.f66211K, this.f66210J));
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        return this.f66210J.invoke(this.f66209I.set(i13, this.f66211K.invoke(obj)));
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        return AbstractC17269i.m48914s(this.f66209I.subList(i13, i14), this.f66210J, this.f66211K);
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        this.f66209I.add(i13, this.f66211K.invoke(obj));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66209I.addAll(AbstractC17269i.m48912r(elements, this.f66211K, this.f66210J));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f66209I.remove(this.f66211K.invoke(obj));
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        ListIterator listIterator = this.f66209I.listIterator(i13);
        AbstractC22676k.m65750j(listIterator, "<this>");
        Function1 src2Dest = this.f66210J;
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        Function1 dest2Src = this.f66211K;
        AbstractC22676k.m65750j(dest2Src, "dest2Src");
        return new C17228e(listIterator, src2Dest, dest2Src);
    }
}
