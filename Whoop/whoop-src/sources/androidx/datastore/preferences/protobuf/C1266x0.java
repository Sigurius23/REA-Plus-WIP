package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1266x0 extends AbstractC1200b implements RandomAccess {

    /* JADX INFO: renamed from: z */
    public static final C1266x0 f5507z = new C1266x0(new Object[0], 0, false);

    /* JADX INFO: renamed from: x */
    public Object[] f5508x;

    /* JADX INFO: renamed from: y */
    public int f5509y;

    public C1266x0(Object[] objArr, int i13, boolean z4) {
        this.f5353w = z4;
        this.f5508x = objArr;
        this.f5509y = i13;
    }

    /* JADX INFO: renamed from: e */
    public static C1266x0 m4016e() {
        return f5507z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3776a();
        int i13 = this.f5509y;
        Object[] objArr = this.f5508x;
        if (i13 == objArr.length) {
            this.f5508x = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5508x;
        int i14 = this.f5509y;
        this.f5509y = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m4017f(int i13) {
        if (i13 < 0 || i13 >= this.f5509y) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
            sbM30466t.append(this.f5509y);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public final C1266x0 m4018g(int i13) {
        if (i13 >= this.f5509y) {
            return new C1266x0(Arrays.copyOf(this.f5508x, i13), this.f5509y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        m4017f(i13);
        return this.f5508x[i13];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1200b, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        m3776a();
        m4017f(i13);
        Object[] objArr = this.f5508x;
        Object obj = objArr[i13];
        int i14 = this.f5509y;
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.f5509y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m3776a();
        m4017f(i13);
        Object[] objArr = this.f5508x;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5509y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        m3776a();
        if (i13 >= 0 && i13 <= (i14 = this.f5509y)) {
            Object[] objArr = this.f5508x;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArr2 = new Object[AbstractC11266d.m30446D(i14, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(this.f5508x, i13, objArr2, i13 + 1, this.f5509y - i13);
                this.f5508x = objArr2;
            }
            this.f5508x[i13] = obj;
            this.f5509y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
        sbM30466t.append(this.f5509y);
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }
}
