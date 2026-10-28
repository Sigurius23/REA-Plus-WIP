package p491t1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: t1.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C33277h extends AbstractC33270a {

    /* JADX INFO: renamed from: E */
    public C33280k f138741E;

    /* JADX INFO: renamed from: F */
    public int f138742F;

    /* JADX INFO: renamed from: y */
    public final C33275f f138743y;

    /* JADX INFO: renamed from: z */
    public int f138744z;

    public C33277h(C33275f c33275f, int i13) {
        super(i13, c33275f.f138734H);
        this.f138743y = c33275f;
        this.f138744z = c33275f.m105582g();
        this.f138742F = -1;
        m105597b();
    }

    /* JADX INFO: renamed from: a */
    public final void m105596a() {
        if (this.f138744z != this.f138743y.m105582g()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p491t1.AbstractC33270a, java.util.ListIterator
    public final void add(Object obj) {
        m105596a();
        int i13 = this.f138722w;
        C33275f c33275f = this.f138743y;
        c33275f.add(i13, obj);
        this.f138722w++;
        this.f138723x = c33275f.mo74007a();
        this.f138744z = c33275f.m105582g();
        this.f138742F = -1;
        m105597b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: b */
    public final void m105597b() {
        C33275f c33275f = this.f138743y;
        Object[] objArr = c33275f.f138732F;
        if (objArr == null) {
            this.f138741E = null;
            return;
        }
        int i13 = (c33275f.f138734H - 1) & (-32);
        int i14 = this.f138722w;
        if (i14 > i13) {
            i14 = i13;
        }
        int i15 = (c33275f.f138738z / 5) + 1;
        C33280k c33280k = this.f138741E;
        if (c33280k == null) {
            this.f138741E = new C33280k(objArr, i14, i13, i15);
            return;
        }
        c33280k.f138722w = i14;
        c33280k.f138723x = i13;
        c33280k.f138749y = i15;
        if (c33280k.f138750z.length < i15) {
            c33280k.f138750z = new Object[i15];
        }
        c33280k.f138750z[0] = objArr;
        ?? r10 = i14 == i13 ? 1 : 0;
        c33280k.f138748E = r10;
        c33280k.m105599b(i14 - r10, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m105596a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f138722w;
        this.f138742F = i13;
        C33280k c33280k = this.f138741E;
        C33275f c33275f = this.f138743y;
        if (c33280k == null) {
            Object[] objArr = c33275f.f138733G;
            this.f138722w = i13 + 1;
            return objArr[i13];
        }
        if (c33280k.hasNext()) {
            this.f138722w++;
            return c33280k.next();
        }
        Object[] objArr2 = c33275f.f138733G;
        int i14 = this.f138722w;
        this.f138722w = i14 + 1;
        return objArr2[i14 - c33280k.f138723x];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m105596a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f138722w;
        this.f138742F = i13 - 1;
        C33280k c33280k = this.f138741E;
        C33275f c33275f = this.f138743y;
        if (c33280k == null) {
            Object[] objArr = c33275f.f138733G;
            int i14 = i13 - 1;
            this.f138722w = i14;
            return objArr[i14];
        }
        int i15 = c33280k.f138723x;
        if (i13 <= i15) {
            this.f138722w = i13 - 1;
            return c33280k.previous();
        }
        Object[] objArr2 = c33275f.f138733G;
        int i16 = i13 - 1;
        this.f138722w = i16;
        return objArr2[i16 - i15];
    }

    @Override // p491t1.AbstractC33270a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m105596a();
        int i13 = this.f138742F;
        if (i13 == -1) {
            throw new IllegalStateException();
        }
        C33275f c33275f = this.f138743y;
        c33275f.mo74008c(i13);
        int i14 = this.f138742F;
        if (i14 < this.f138722w) {
            this.f138722w = i14;
        }
        this.f138723x = c33275f.mo74007a();
        this.f138744z = c33275f.m105582g();
        this.f138742F = -1;
        m105597b();
    }

    @Override // p491t1.AbstractC33270a, java.util.ListIterator
    public final void set(Object obj) {
        m105596a();
        int i13 = this.f138742F;
        if (i13 == -1) {
            throw new IllegalStateException();
        }
        C33275f c33275f = this.f138743y;
        c33275f.set(i13, obj);
        this.f138744z = c33275f.m105582g();
        m105597b();
    }
}
