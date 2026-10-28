package rb3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: rb3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C31208p implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128550w;

    /* JADX INFO: renamed from: x */
    public boolean f128551x = true;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f128552y;

    public /* synthetic */ C31208p(Object obj, int i13) {
        this.f128550w = i13;
        this.f128552y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f128550w) {
            case 0:
                break;
        }
        return this.f128551x;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f128550w) {
            case 0:
                if (!this.f128551x) {
                    throw new NoSuchElementException();
                }
                this.f128551x = false;
                return ((C31209q) this.f128552y).f128553w;
            default:
                if (!this.f128551x) {
                    throw new NoSuchElementException();
                }
                this.f128551x = false;
                return this.f128552y;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f128550w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
