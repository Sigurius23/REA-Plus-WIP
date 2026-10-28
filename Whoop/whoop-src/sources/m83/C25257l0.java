package m83;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m83.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25257l0 extends AbstractC25242e implements RandomAccess {

    /* JADX INFO: renamed from: w */
    public final Object[] f99135w;

    /* JADX INFO: renamed from: x */
    public final int f99136x;

    /* JADX INFO: renamed from: y */
    public int f99137y;

    /* JADX INFO: renamed from: z */
    public int f99138z;

    public C25257l0(int i13, Object[] objArr) {
        this.f99135w = objArr;
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i13 <= objArr.length) {
            this.f99136x = objArr.length;
            this.f99138z = i13;
        } else {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM30466t.append(objArr.length);
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f99138z;
    }

    /* JADX INFO: renamed from: c */
    public final void m74014c(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "n shouldn't be negative but it is ").toString());
        }
        if (i13 > this.f99138z) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM30466t.append(this.f99138z);
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
        if (i13 > 0) {
            int i14 = this.f99137y;
            int i15 = this.f99136x;
            int i16 = (i14 + i13) % i15;
            Object[] objArr = this.f99135w;
            if (i14 > i16) {
                Arrays.fill(objArr, i14, i15, (Object) null);
                Arrays.fill(objArr, 0, i16, (Object) null);
            } else {
                Arrays.fill(objArr, i14, i16, (Object) null);
            }
            this.f99137y = i16;
            this.f99138z -= i13;
        }
    }

    @Override // java.util.List
    public final Object get(int i13) {
        int iMo73980a = mo73980a();
        if (i13 < 0 || i13 >= iMo73980a) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, iMo73980a, "index: ", ", size: "));
        }
        return this.f99135w[(this.f99137y + i13) % this.f99136x];
    }

    @Override // m83.AbstractC25242e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C25255k0(this);
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo73980a()]);
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        AbstractC22676k.m65750j(array, "array");
        int length = array.length;
        int i13 = this.f99138z;
        if (length < i13) {
            array = Arrays.copyOf(array, i13);
            AbstractC22676k.m65749i(array, "copyOf(...)");
        }
        int i14 = this.f99138z;
        int i15 = this.f99137y;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            objArr = this.f99135w;
            if (i17 >= i14 || i15 >= this.f99136x) {
                break;
            }
            array[i17] = objArr[i15];
            i17++;
            i15++;
        }
        while (i17 < i14) {
            array[i17] = objArr[i16];
            i17++;
            i16++;
        }
        if (i14 < array.length) {
            array[i14] = null;
        }
        return array;
    }
}
