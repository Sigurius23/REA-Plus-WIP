package p193hf;

import java.util.ListIterator;
import p184h5.C16927z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hf.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17228e extends C16927z implements ListIterator {

    /* JADX INFO: renamed from: E */
    public final Function1 f66202E;

    /* JADX INFO: renamed from: F */
    public final ListIterator f66203F;

    /* JADX INFO: renamed from: G */
    public final Function1 f66204G;

    /* JADX INFO: renamed from: z */
    public final ListIterator f66205z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17228e(ListIterator src, Function1 src2Dest, Function1 dest2Src) {
        super(src, src2Dest);
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        AbstractC22676k.m65750j(dest2Src, "dest2Src");
        this.f66205z = src;
        this.f66202E = src2Dest;
        this.f66203F = src;
        this.f66204G = dest2Src;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f66203F.add(this.f66204G.invoke(obj));
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f66205z.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f66205z.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f66202E.invoke(this.f66205z.previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f66205z.previousIndex();
    }

    @Override // p184h5.C16927z, java.util.Iterator
    public final void remove() {
        this.f66203F.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f66203F.set(this.f66204G.invoke(obj));
    }
}
