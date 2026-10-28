package androidx.health.platform.client.proto;

import java.util.Iterator;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.h3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1472h3 implements Iterator {

    /* JADX INFO: renamed from: w */
    public Iterator f6051w;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6051w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f6051w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
