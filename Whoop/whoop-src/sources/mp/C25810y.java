package mp;

import java.util.Objects;

/* JADX INFO: renamed from: mp.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C25810y extends AbstractC25788n {

    /* JADX INFO: renamed from: E */
    public static final C25810y f101552E = new C25810y(0, new Object[0]);

    /* JADX INFO: renamed from: y */
    public final transient Object[] f101553y;

    /* JADX INFO: renamed from: z */
    public final transient int f101554z;

    public C25810y(int i13, Object[] objArr) {
        this.f101553y = objArr;
        this.f101554z = i13;
    }

    @Override // mp.AbstractC25788n, mp.AbstractC25774i
    /* JADX INFO: renamed from: a */
    public final int mo75979a(Object[] objArr) {
        Object[] objArr2 = this.f101553y;
        int i13 = this.f101554z;
        System.arraycopy(objArr2, 0, objArr, 0, i13);
        return i13;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: c */
    public final int mo75980c() {
        return this.f101554z;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: d */
    public final int mo75981d() {
        return 0;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: f */
    public final Object[] mo75983f() {
        return this.f101553y;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC25753b.m75993e(i13, this.f101554z);
        Object obj = this.f101553y[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f101554z;
    }
}
