package p623xr;

import java.util.Iterator;

/* JADX INFO: renamed from: xr.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C38614j extends AbstractC38612h {

    /* JADX INFO: renamed from: F */
    public static final Object[] f166121F;

    /* JADX INFO: renamed from: G */
    public static final C38614j f166122G;

    /* JADX INFO: renamed from: E */
    public final transient Object[] f166123E;

    /* JADX INFO: renamed from: z */
    public final transient Object[] f166124z;

    static {
        Object[] objArr = new Object[0];
        f166121F = objArr;
        f166122G = new C38614j(objArr, objArr);
    }

    public C38614j(Object[] objArr, Object[] objArr2) {
        this.f166124z = objArr;
        this.f166123E = objArr2;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: a */
    public final int mo123806a(Object[] objArr) {
        System.arraycopy(this.f166124z, 0, objArr, 0, 0);
        return 0;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: c */
    public final int mo123807c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f166123E.length;
        return false;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: d */
    public final int mo123808d() {
        return 0;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: e */
    public final Object[] mo123809e() {
        return this.f166124z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C38613i c38613i = this.f166118x;
        if (c38613i == null) {
            C38609e c38609e = AbstractC38611g.f166116x;
            c38613i = C38613i.f166119z;
            this.f166118x = c38613i;
        }
        return c38613i.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
