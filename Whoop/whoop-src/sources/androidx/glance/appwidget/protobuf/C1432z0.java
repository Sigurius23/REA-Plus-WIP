package androidx.glance.appwidget.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1432z0 extends AbstractC1370b implements RandomAccess {

    /* JADX INFO: renamed from: z */
    public static final C1432z0 f5996z = new C1432z0(new Object[0], 0, false);

    /* JADX INFO: renamed from: x */
    public Object[] f5997x;

    /* JADX INFO: renamed from: y */
    public int f5998y;

    public C1432z0(Object[] objArr, int i13, boolean z4) {
        super(z4);
        this.f5997x = objArr;
        this.f5998y = i13;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4282a();
        int i13 = this.f5998y;
        Object[] objArr = this.f5997x;
        if (i13 == objArr.length) {
            this.f5997x = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5997x;
        int i14 = this.f5998y;
        this.f5998y = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4556c(int i13) {
        if (i13 < 0 || i13 >= this.f5998y) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
            sbM30466t.append(this.f5998y);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        m4556c(i13);
        return this.f5997x[i13];
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1380e0
    /* JADX INFO: renamed from: i */
    public final InterfaceC1380e0 mo4286i(int i13) {
        if (i13 >= this.f5998y) {
            return new C1432z0(Arrays.copyOf(this.f5997x, i13), this.f5998y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1370b, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        m4282a();
        m4556c(i13);
        Object[] objArr = this.f5997x;
        Object obj = objArr[i13];
        int i14 = this.f5998y;
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.f5998y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m4282a();
        m4556c(i13);
        Object[] objArr = this.f5997x;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5998y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        m4282a();
        if (i13 >= 0 && i13 <= (i14 = this.f5998y)) {
            Object[] objArr = this.f5997x;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArr2 = new Object[AbstractC11266d.m30446D(i14, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(this.f5997x, i13, objArr2, i13 + 1, this.f5998y - i13);
                this.f5997x = objArr2;
            }
            this.f5997x[i13] = obj;
            this.f5998y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
        sbM30466t.append(this.f5998y);
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }
}
