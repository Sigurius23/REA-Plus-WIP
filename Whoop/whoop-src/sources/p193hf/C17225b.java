package p193hf;

import d93.InterfaceC11821b;
import hg3.AbstractC17269i;
import java.util.Collection;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hf.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17225b extends C17224a implements InterfaceC11821b {

    /* JADX INFO: renamed from: F */
    public final Collection f66192F;

    /* JADX INFO: renamed from: G */
    public final C17230g f66193G;

    /* JADX INFO: renamed from: H */
    public final C17230g f66194H;

    public C17225b(Collection collection, C17230g c17230g, C17230g c17230g2) {
        super(collection, c17230g, c17230g2);
        this.f66192F = collection;
        this.f66193G = c17230g;
        this.f66194H = c17230g2;
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean add(Object obj) {
        return this.f66192F.add(this.f66194H.invoke(obj));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66192F.addAll(AbstractC17269i.m48912r(elements, this.f66194H, this.f66193G));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final void clear() {
        this.f66192F.clear();
    }

    @Override // p193hf.C17224a, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f66192F.iterator();
        AbstractC22676k.m65750j(it, "<this>");
        C17230g src2Dest = this.f66193G;
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        return new C17227d(it, src2Dest);
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f66192F.remove(this.f66194H.invoke(obj));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66192F.removeAll(AbstractC17269i.m48912r(elements, this.f66194H, this.f66193G));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66192F.retainAll(AbstractC17269i.m48912r(elements, this.f66194H, this.f66193G));
    }
}
