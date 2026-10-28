package p491t1;

import java.util.NoSuchElementException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C33280k extends AbstractC33270a {

    /* JADX INFO: renamed from: E */
    public boolean f138748E;

    /* JADX INFO: renamed from: y */
    public int f138749y;

    /* JADX INFO: renamed from: z */
    public Object[] f138750z;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C33280k(Object[] objArr, int i13, int i14, int i15) {
        super(i13, i14);
        this.f138749y = i15;
        Object[] objArr2 = new Object[i15];
        this.f138750z = objArr2;
        ?? r10 = i13 == i14 ? 1 : 0;
        this.f138748E = r10;
        objArr2[0] = objArr;
        m105599b(i13 - r10, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m105598a() {
        int i13 = this.f138722w & 31;
        Object obj = this.f138750z[this.f138749y - 1];
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i13];
    }

    /* JADX INFO: renamed from: b */
    public final void m105599b(int i13, int i14) {
        int i15 = (this.f138749y - i14) * 5;
        while (i14 < this.f138749y) {
            Object[] objArr = this.f138750z;
            Object obj = objArr[i14 - 1];
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i14] = ((Object[]) obj)[AbstractC37056f.m118955G(i13, i15)];
            i15 -= 5;
            i14++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m105600c(int i13) {
        int i14 = 0;
        while (AbstractC37056f.m118955G(this.f138722w, i14) == i13) {
            i14 += 5;
        }
        if (i14 > 0) {
            m105599b(this.f138722w, ((this.f138749y - 1) - (i14 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM105598a = m105598a();
        int i13 = this.f138722w + 1;
        this.f138722w = i13;
        if (i13 == this.f138723x) {
            this.f138748E = true;
            return objM105598a;
        }
        m105600c(0);
        return objM105598a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f138722w--;
        if (this.f138748E) {
            this.f138748E = false;
            return m105598a();
        }
        m105600c(31);
        return m105598a();
    }
}
