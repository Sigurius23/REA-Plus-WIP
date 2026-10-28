package p002a0;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0038m implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public int f111w;

    /* JADX INFO: renamed from: x */
    public int f112x;

    /* JADX INFO: renamed from: y */
    public boolean f113y;

    public AbstractC0038m(int i13) {
        this.f111w = i13;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo9a(int i13);

    /* JADX INFO: renamed from: b */
    public abstract void mo10b(int i13);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f112x < this.f111w;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo9a = mo9a(this.f112x);
        this.f112x++;
        this.f113y = true;
        return objMo9a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f113y) {
            AbstractC34924m.m110134P("Call next() before removing an element.");
            throw null;
        }
        int i13 = this.f112x - 1;
        this.f112x = i13;
        mo10b(i13);
        this.f111w--;
        this.f113y = false;
    }
}
