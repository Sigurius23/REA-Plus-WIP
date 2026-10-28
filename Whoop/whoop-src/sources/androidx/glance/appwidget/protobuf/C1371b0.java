package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1371b0 extends AbstractC1370b implements InterfaceC1377d0, RandomAccess, InterfaceC1428x0 {

    /* JADX INFO: renamed from: z */
    public static final C1371b0 f5868z = new C1371b0(new int[0], 0, false);

    /* JADX INFO: renamed from: x */
    public int[] f5869x;

    /* JADX INFO: renamed from: y */
    public int f5870y;

    public C1371b0(int[] iArr, int i13, boolean z4) {
        super(z4);
        this.f5869x = iArr;
        this.f5870y = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        int iIntValue = ((Integer) obj).intValue();
        m4282a();
        if (i13 < 0 || i13 > (i14 = this.f5870y)) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
            sbM30466t.append(this.f5870y);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        int[] iArr = this.f5869x;
        if (i14 < iArr.length) {
            System.arraycopy(iArr, i13, iArr, i13 + 1, i14 - i13);
        } else {
            int[] iArr2 = new int[AbstractC11266d.m30446D(i14, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            System.arraycopy(this.f5869x, i13, iArr2, i13 + 1, this.f5870y - i13);
            this.f5869x = iArr2;
        }
        this.f5869x[i13] = iIntValue;
        this.f5870y++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1370b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m4282a();
        Charset charset = AbstractC1383f0.f5887a;
        collection.getClass();
        if (!(collection instanceof C1371b0)) {
            return super.addAll(collection);
        }
        C1371b0 c1371b0 = (C1371b0) collection;
        int i13 = c1371b0.f5870y;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f5870y;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        int[] iArr = this.f5869x;
        if (i15 > iArr.length) {
            this.f5869x = Arrays.copyOf(iArr, i15);
        }
        System.arraycopy(c1371b0.f5869x, 0, this.f5869x, this.f5870y, c1371b0.f5870y);
        this.f5870y = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4283c(int i13) {
        m4282a();
        int i14 = this.f5870y;
        int[] iArr = this.f5869x;
        if (i14 == iArr.length) {
            int[] iArr2 = new int[AbstractC11266d.m30446D(i14, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            this.f5869x = iArr2;
        }
        int[] iArr3 = this.f5869x;
        int i15 = this.f5870y;
        this.f5870y = i15 + 1;
        iArr3[i15] = i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m4284d(int i13) {
        if (i13 < 0 || i13 >= this.f5870y) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
            sbM30466t.append(this.f5870y);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4285e(int i13) {
        m4284d(i13);
        return this.f5869x[i13];
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1370b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1371b0)) {
            return super.equals(obj);
        }
        C1371b0 c1371b0 = (C1371b0) obj;
        if (this.f5870y != c1371b0.f5870y) {
            return false;
        }
        int[] iArr = c1371b0.f5869x;
        for (int i13 = 0; i13 < this.f5870y; i13++) {
            if (this.f5869x[i13] != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return Integer.valueOf(m4285e(i13));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1370b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f5870y; i14++) {
            i13 = (i13 * 31) + this.f5869x[i14];
        }
        return i13;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1380e0
    /* JADX INFO: renamed from: i */
    public final InterfaceC1380e0 mo4286i(int i13) {
        if (i13 >= this.f5870y) {
            return new C1371b0(Arrays.copyOf(this.f5869x, i13), this.f5870y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i13 = this.f5870y;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f5869x[i14] == iIntValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1370b, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        m4282a();
        m4284d(i13);
        int[] iArr = this.f5869x;
        int i14 = iArr[i13];
        int i15 = this.f5870y;
        if (i13 < i15 - 1) {
            System.arraycopy(iArr, i13 + 1, iArr, i13, (i15 - i13) - 1);
        }
        this.f5870y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        m4282a();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5869x;
        System.arraycopy(iArr, i14, iArr, i13, this.f5870y - i14);
        this.f5870y -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m4282a();
        m4284d(i13);
        int[] iArr = this.f5869x;
        int i14 = iArr[i13];
        iArr[i13] = iIntValue;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5870y;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4283c(((Integer) obj).intValue());
        return true;
    }
}
