package p310lp;

import java.util.Objects;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: lp.f */
/* JADX INFO: loaded from: classes.dex */
public final class C24627f extends AbstractC24626e {

    /* JADX INFO: renamed from: E */
    public static final C24627f f96358E = new C24627f(0, new Object[0]);

    /* JADX INFO: renamed from: y */
    public final transient Object[] f96359y;

    /* JADX INFO: renamed from: z */
    public final transient int f96360z;

    public C24627f(int i13, Object[] objArr) {
        this.f96359y = objArr;
        this.f96360z = i13;
    }

    @Override // p310lp.AbstractC24622a
    /* JADX INFO: renamed from: a */
    public final Object[] mo71954a() {
        return this.f96359y;
    }

    @Override // p310lp.AbstractC24622a
    /* JADX INFO: renamed from: c */
    public final int mo71955c() {
        return 0;
    }

    @Override // p310lp.AbstractC24622a
    /* JADX INFO: renamed from: d */
    public final int mo71956d() {
        return this.f96360z;
    }

    @Override // p310lp.AbstractC24626e, p310lp.AbstractC24622a
    /* JADX INFO: renamed from: e */
    public final int mo71957e(Object[] objArr) {
        Object[] objArr2 = this.f96359y;
        int i13 = this.f96360z;
        System.arraycopy(objArr2, 0, objArr, 0, i13);
        return i13;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC21598x.m60646C0(i13, this.f96360z);
        Object obj = this.f96359y[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f96360z;
    }
}
