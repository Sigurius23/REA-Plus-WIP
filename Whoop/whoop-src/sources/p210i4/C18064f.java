package p210i4;

import java.util.Iterator;

/* JADX INFO: renamed from: i4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C18064f implements Iterator {

    /* JADX INFO: renamed from: w */
    public final C18065g f70151w;

    /* JADX INFO: renamed from: x */
    public int f70152x = 0;

    public C18064f(C18065g c18065g) {
        this.f70151w = c18065g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f70152x < this.f70151w.f70145E.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18062d c18062d = (C18062d) this.f70151w.f70145E.get(this.f70152x);
        this.f70152x++;
        return c18062d;
    }
}
