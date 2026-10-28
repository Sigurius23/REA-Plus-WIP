package ub3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ub3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C34753g implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Object f146408w;

    /* JADX INFO: renamed from: x */
    public boolean f146409x = true;

    public C34753g(Object obj) {
        this.f146408w = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f146409x;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f146409x) {
            throw new NoSuchElementException();
        }
        this.f146409x = false;
        return this.f146408w;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
