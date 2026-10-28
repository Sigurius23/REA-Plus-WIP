package p690zr;

import java.util.Objects;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: zr.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41060w0 extends AbstractC41023g0 {

    /* JADX INFO: renamed from: E */
    public static final C41060w0 f177067E = new C41060w0(0, new Object[0]);

    /* JADX INFO: renamed from: y */
    public final transient Object[] f177068y;

    /* JADX INFO: renamed from: z */
    public final transient int f177069z;

    public C41060w0(int i13, Object[] objArr) {
        this.f177068y = objArr;
        this.f177069z = i13;
    }

    @Override // p690zr.AbstractC41023g0, p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: c */
    public final int mo133228c(int i13, Object[] objArr) {
        Object[] objArr2 = this.f177068y;
        int i14 = this.f177069z;
        System.arraycopy(objArr2, 0, objArr, i13, i14);
        return i13 + i14;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: d */
    public final Object[] mo133229d() {
        return this.f177068y;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: e */
    public final int mo133230e() {
        return this.f177069z;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: f */
    public final int mo133231f() {
        return 0;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: g */
    public final boolean mo133226g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC31484o.m96957i(i13, this.f177069z);
        Object obj = this.f177068y[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f177069z;
    }
}
