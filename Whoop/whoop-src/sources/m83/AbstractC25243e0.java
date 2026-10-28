package m83;

import d93.InterfaceC11820a;
import java.util.Iterator;

/* JADX INFO: renamed from: m83.e0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25243e0 implements Iterator, InterfaceC11820a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
