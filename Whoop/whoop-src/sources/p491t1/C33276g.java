package p491t1;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: t1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C33276g extends AbstractC33270a {

    /* JADX INFO: renamed from: y */
    public final Object[] f138739y;

    /* JADX INFO: renamed from: z */
    public final C33280k f138740z;

    public C33276g(int i13, int i14, int i15, Object[] objArr, Object[] objArr2) {
        super(i13, i14);
        this.f138739y = objArr2;
        int i16 = (i14 - 1) & (-32);
        this.f138740z = new C33280k(objArr, i13 > i16 ? i16 : i13, i16, i15);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C33280k c33280k = this.f138740z;
        if (c33280k.hasNext()) {
            this.f138722w++;
            return c33280k.next();
        }
        int i13 = this.f138722w;
        this.f138722w = i13 + 1;
        return this.f138739y[i13 - c33280k.f138723x];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f138722w;
        C33280k c33280k = this.f138740z;
        int i14 = c33280k.f138723x;
        if (i13 <= i14) {
            this.f138722w = i13 - 1;
            return c33280k.previous();
        }
        int i15 = i13 - 1;
        this.f138722w = i15;
        return this.f138739y[i15 - i14];
    }
}
