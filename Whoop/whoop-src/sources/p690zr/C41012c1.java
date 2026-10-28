package p690zr;

/* JADX INFO: renamed from: zr.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41012c1 extends AbstractC41032j0 {

    /* JADX INFO: renamed from: I */
    public static final Object[] f176972I;

    /* JADX INFO: renamed from: J */
    public static final C41012c1 f176973J;

    /* JADX INFO: renamed from: E */
    public final transient int f176974E;

    /* JADX INFO: renamed from: F */
    public final transient Object[] f176975F;

    /* JADX INFO: renamed from: G */
    public final transient int f176976G;

    /* JADX INFO: renamed from: H */
    public final transient int f176977H;

    /* JADX INFO: renamed from: z */
    public final transient Object[] f176978z;

    static {
        Object[] objArr = new Object[0];
        f176972I = objArr;
        f176973J = new C41012c1(0, 0, 0, objArr, objArr);
    }

    public C41012c1(int i13, int i14, int i15, Object[] objArr, Object[] objArr2) {
        this.f176978z = objArr;
        this.f176974E = i13;
        this.f176975F = objArr2;
        this.f176976G = i14;
        this.f176977H = i15;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: c */
    public final int mo133228c(int i13, Object[] objArr) {
        Object[] objArr2 = this.f176978z;
        int i14 = this.f176977H;
        System.arraycopy(objArr2, 0, objArr, i13, i14);
        return i13 + i14;
    }

    @Override // p690zr.AbstractC41008b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f176975F;
            if (objArr.length != 0) {
                int iM133287q = AbstractC41047q.m133287q(obj);
                while (true) {
                    int i13 = iM133287q & this.f176976G;
                    Object obj2 = objArr[i13];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM133287q = i13 + 1;
                }
            }
        }
        return false;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: d */
    public final Object[] mo133229d() {
        return this.f176978z;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: e */
    public final int mo133230e() {
        return this.f176977H;
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

    @Override // p690zr.AbstractC41032j0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f176974E;
    }

    @Override // p690zr.AbstractC41032j0
    /* JADX INFO: renamed from: n */
    public final AbstractC41023g0 mo133236n() {
        return AbstractC41023g0.m133250j(this.f176977H, this.f176978z);
    }

    @Override // p690zr.AbstractC41032j0
    /* JADX INFO: renamed from: o */
    public final AbstractC41036k1 iterator() {
        return mo133227a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f176977H;
    }
}
