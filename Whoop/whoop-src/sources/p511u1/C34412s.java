package p511u1;

import m83.C25266t;

/* JADX INFO: renamed from: u1.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C34412s extends AbstractC34409p {

    /* JADX INFO: renamed from: z */
    public final C25266t f144632z;

    public C34412s(C25266t c25266t) {
        this.f144632z = c25266t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f144630y;
        this.f144630y = i13 + 2;
        Object[] objArr = this.f144628w;
        return new C34395b(this.f144632z, objArr[i13], objArr[i13 + 1]);
    }
}
