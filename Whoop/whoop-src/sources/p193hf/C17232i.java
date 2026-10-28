package p193hf;

import d93.InterfaceC11825f;
import hg3.AbstractC17269i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: hf.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C17232i extends C17224a implements InterfaceC11825f, Set {

    /* JADX INFO: renamed from: F */
    public final Set f66221F;

    /* JADX INFO: renamed from: G */
    public final AbstractC22660c f66222G;

    /* JADX INFO: renamed from: H */
    public final C22672i f66223H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17232i(Set src, Function1 function1, Function1 function2) {
        super(src, function1, function2);
        AbstractC22676k.m65750j(src, "src");
        this.f66221F = src;
        this.f66222G = (AbstractC22660c) function1;
        this.f66223H = (C22672i) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // p193hf.C17224a, java.util.Collection
    public final boolean add(Object obj) {
        return this.f66221F.add(this.f66223H.invoke(obj));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.c] */
    @Override // p193hf.C17224a, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66221F.addAll(AbstractC17269i.m48912r(elements, this.f66223H, this.f66222G));
    }

    @Override // p193hf.C17224a, java.util.Collection
    public final void clear() {
        this.f66221F.clear();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.internal.c] */
    @Override // p193hf.C17224a, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f66221F.iterator();
        AbstractC22676k.m65750j(it, "<this>");
        ?? src2Dest = this.f66222G;
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        return new C17227d(it, src2Dest);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // p193hf.C17224a, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f66221F.remove(this.f66223H.invoke(obj));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.c] */
    @Override // p193hf.C17224a, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66221F.removeAll(AbstractC17269i.m48912r(elements, this.f66223H, this.f66222G));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.c] */
    @Override // p193hf.C17224a, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66221F.retainAll(AbstractC17269i.m48912r(elements, this.f66223H, this.f66222G));
    }
}
