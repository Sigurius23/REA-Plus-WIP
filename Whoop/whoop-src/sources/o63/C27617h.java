package o63;

import d93.InterfaceC11820a;
import java.util.Iterator;
import xb3.C38184s;

/* JADX INFO: renamed from: o63.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C27617h implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111147w = 0;

    /* JADX INFO: renamed from: x */
    public final Iterator f111148x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f111149y;

    public C27617h(C27618i c27618i) {
        this.f111149y = c27618i;
        this.f111148x = c27618i.f111150w.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f111147w) {
            case 0:
                break;
        }
        return this.f111148x.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f111147w) {
            case 0:
                return ((C27618i) this.f111149y).f111151x.invoke(this.f111148x.next());
            default:
                return ((C38184s) this.f111149y).f163499b.invoke(this.f111148x.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f111147w) {
            case 0:
                this.f111148x.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C27617h(C38184s c38184s) {
        this.f111149y = c38184s;
        this.f111148x = c38184s.f163498a.iterator();
    }
}
