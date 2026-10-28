package androidx.health.platform.client.proto;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.z1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1558z1 extends AbstractC1438b implements RandomAccess {

    /* JADX INFO: renamed from: z */
    public static final C1558z1 f6168z;

    /* JADX INFO: renamed from: x */
    public Object[] f6169x;

    /* JADX INFO: renamed from: y */
    public int f6170y;

    static {
        C1558z1 c1558z1 = new C1558z1(0, new Object[0]);
        f6168z = c1558z1;
        c1558z1.f6021w = false;
    }

    public C1558z1(int i13, Object[] objArr) {
        this.f6169x = objArr;
        this.f6170y = i13;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1438b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4569a();
        int i13 = this.f6170y;
        Object[] objArr = this.f6169x;
        if (i13 == objArr.length) {
            this.f6169x = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6169x;
        int i14 = this.f6170y;
        this.f6170y = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4949c(int i13) {
        if (i13 < 0 || i13 >= this.f6170y) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
            sbM30466t.append(this.f6170y);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        m4949c(i13);
        return this.f6169x[i13];
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1544w0
    /* JADX INFO: renamed from: i */
    public final InterfaceC1544w0 mo4923i(int i13) {
        if (i13 < this.f6170y) {
            throw new IllegalArgumentException();
        }
        return new C1558z1(this.f6170y, Arrays.copyOf(this.f6169x, i13));
    }

    @Override // androidx.health.platform.client.proto.AbstractC1438b, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        m4569a();
        m4949c(i13);
        Object[] objArr = this.f6169x;
        Object obj = objArr[i13];
        int i14 = this.f6170y;
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.f6170y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m4569a();
        m4949c(i13);
        Object[] objArr = this.f6169x;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6170y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        m4569a();
        if (i13 >= 0 && i13 <= (i14 = this.f6170y)) {
            Object[] objArr = this.f6169x;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArr2 = new Object[AbstractC11266d.m30446D(i14, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(this.f6169x, i13, objArr2, i13 + 1, this.f6170y - i13);
                this.f6169x = objArr2;
            }
            this.f6169x[i13] = obj;
            this.f6170y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
        sbM30466t.append(this.f6170y);
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }
}
