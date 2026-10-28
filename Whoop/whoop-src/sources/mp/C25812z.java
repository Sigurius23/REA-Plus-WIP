package mp;

import java.util.Iterator;

/* JADX INFO: renamed from: mp.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C25812z extends AbstractC25792p {

    /* JADX INFO: renamed from: I */
    public static final Object[] f101556I;

    /* JADX INFO: renamed from: J */
    public static final C25812z f101557J;

    /* JADX INFO: renamed from: E */
    public final transient int f101558E;

    /* JADX INFO: renamed from: F */
    public final transient Object[] f101559F;

    /* JADX INFO: renamed from: G */
    public final transient int f101560G;

    /* JADX INFO: renamed from: H */
    public final transient int f101561H;

    /* JADX INFO: renamed from: z */
    public final transient Object[] f101562z;

    static {
        Object[] objArr = new Object[0];
        f101556I = objArr;
        f101557J = new C25812z(0, 0, 0, objArr, objArr);
    }

    public C25812z(int i13, int i14, int i15, Object[] objArr, Object[] objArr2) {
        this.f101562z = objArr;
        this.f101558E = i13;
        this.f101559F = objArr2;
        this.f101560G = i14;
        this.f101561H = i15;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: a */
    public final int mo75979a(Object[] objArr) {
        Object[] objArr2 = this.f101562z;
        int i13 = this.f101561H;
        System.arraycopy(objArr2, 0, objArr, 0, i13);
        return i13;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: c */
    public final int mo75980c() {
        return this.f101561H;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f101559F;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i13 = iRotateLeft & this.f101560G;
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i13 + 1;
        }
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: d */
    public final int mo75981d() {
        return 0;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: e */
    public final AbstractC25763e0 mo75982e() {
        return mo75984l().listIterator(0);
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: f */
    public final Object[] mo75983f() {
        return this.f101562z;
    }

    @Override // mp.AbstractC25792p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f101558E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo75984l().listIterator(0);
    }

    @Override // mp.AbstractC25792p
    /* JADX INFO: renamed from: m */
    public final AbstractC25788n mo76032m() {
        return AbstractC25788n.m76024l(this.f101561H, this.f101562z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f101561H;
    }
}
