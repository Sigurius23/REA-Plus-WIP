package p690zr;

import java.util.Objects;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: zr.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41006a1 extends AbstractC41023g0 {

    /* JADX INFO: renamed from: E */
    public final transient int f176954E;

    /* JADX INFO: renamed from: y */
    public final transient Object[] f176955y;

    /* JADX INFO: renamed from: z */
    public final transient int f176956z;

    public C41006a1(int i13, int i14, Object[] objArr) {
        this.f176955y = objArr;
        this.f176956z = i13;
        this.f176954E = i14;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: g */
    public final boolean mo133226g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC31484o.m96957i(i13, this.f176954E);
        Object obj = this.f176955y[(i13 * 2) + this.f176956z];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f176954E;
    }
}
