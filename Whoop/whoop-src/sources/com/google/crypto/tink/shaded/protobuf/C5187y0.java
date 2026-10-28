package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5187y0 extends AbstractC5125b implements RandomAccess {

    /* JADX INFO: renamed from: z */
    public static final C5187y0 f21598z = new C5187y0(new Object[0], 0, false);

    /* JADX INFO: renamed from: x */
    public Object[] f21599x;

    /* JADX INFO: renamed from: y */
    public int f21600y;

    public C5187y0(Object[] objArr, int i13, boolean z4) {
        super(z4);
        this.f21599x = objArr;
        this.f21600y = i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5125b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m16122a();
        int i13 = this.f21600y;
        Object[] objArr = this.f21599x;
        if (i13 == objArr.length) {
            this.f21599x = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f21599x;
        int i14 = this.f21600y;
        this.f21600y = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m16375c(int i13) {
        if (i13 < 0 || i13 >= this.f21600y) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
            sbM30466t.append(this.f21600y);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        m16375c(i13);
        return this.f21599x[i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5123a0
    /* JADX INFO: renamed from: i */
    public final InterfaceC5123a0 mo16111i(int i13) {
        if (i13 >= this.f21600y) {
            return new C5187y0(Arrays.copyOf(this.f21599x, i13), this.f21600y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5125b, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        m16122a();
        m16375c(i13);
        Object[] objArr = this.f21599x;
        Object obj = objArr[i13];
        int i14 = this.f21600y;
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.f21600y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m16122a();
        m16375c(i13);
        Object[] objArr = this.f21599x;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21600y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        m16122a();
        if (i13 >= 0 && i13 <= (i14 = this.f21600y)) {
            Object[] objArr = this.f21599x;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArr2 = new Object[AbstractC11266d.m30446D(i14, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(this.f21599x, i13, objArr2, i13 + 1, this.f21600y - i13);
                this.f21599x = objArr2;
            }
            this.f21599x[i13] = obj;
            this.f21600y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index:", ", Size:");
        sbM30466t.append(this.f21600y);
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }
}
