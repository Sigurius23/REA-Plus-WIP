package m83;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: m83.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25236b implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public int f99114w;

    /* JADX INFO: renamed from: x */
    public Object f99115x;

    /* JADX INFO: renamed from: a */
    public abstract void mo73981a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f99114w;
        if (i13 == 0) {
            this.f99114w = 3;
            mo73981a();
            return this.f99114w == 1;
        }
        if (i13 == 1) {
            return true;
        }
        if (i13 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f99114w;
        if (i13 == 1) {
            this.f99114w = 0;
            return this.f99115x;
        }
        if (i13 != 2) {
            this.f99114w = 3;
            mo73981a();
            if (this.f99114w == 1) {
                this.f99114w = 0;
                return this.f99115x;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
