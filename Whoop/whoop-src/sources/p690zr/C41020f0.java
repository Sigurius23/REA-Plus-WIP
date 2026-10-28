package p690zr;

import java.util.Iterator;
import java.util.ListIterator;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: zr.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41020f0 extends AbstractC41023g0 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC41023g0 f176992E;

    /* JADX INFO: renamed from: y */
    public final transient int f176993y;

    /* JADX INFO: renamed from: z */
    public final transient int f176994z;

    public C41020f0(AbstractC41023g0 abstractC41023g0, int i13, int i14) {
        this.f176992E = abstractC41023g0;
        this.f176993y = i13;
        this.f176994z = i14;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: d */
    public final Object[] mo133229d() {
        return this.f176992E.mo133229d();
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: e */
    public final int mo133230e() {
        return this.f176992E.mo133231f() + this.f176993y + this.f176994z;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: f */
    public final int mo133231f() {
        return this.f176992E.mo133231f() + this.f176993y;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: g */
    public final boolean mo133226g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC31484o.m96957i(i13, this.f176994z);
        return this.f176992E.get(i13 + this.f176993y);
    }

    @Override // p690zr.AbstractC41023g0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p690zr.AbstractC41023g0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f176994z;
    }

    @Override // p690zr.AbstractC41023g0, java.util.List
    /* JADX INFO: renamed from: v */
    public final AbstractC41023g0 subList(int i13, int i14) {
        AbstractC31484o.m96960l(i13, i14, this.f176994z);
        int i15 = this.f176993y;
        return this.f176992E.subList(i13 + i15, i14 + i15);
    }

    @Override // p690zr.AbstractC41023g0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i13) {
        return listIterator(i13);
    }
}
