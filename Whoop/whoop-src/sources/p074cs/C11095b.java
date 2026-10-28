package p074cs;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p463rj.AbstractC31484o;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: cs.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11095b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: w */
    public final int[] f35193w;

    /* JADX INFO: renamed from: x */
    public final int f35194x;

    /* JADX INFO: renamed from: y */
    public final int f35195y;

    public C11095b(int i13, int i14, int[] iArr) {
        this.f35193w = iArr;
        this.f35194x = i13;
        this.f35195y = i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && AbstractC35903f.m114021u(((Integer) obj).intValue(), this.f35194x, this.f35195y, this.f35193w) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11095b)) {
            return super.equals(obj);
        }
        C11095b c11095b = (C11095b) obj;
        int size = size();
        if (c11095b.size() != size) {
            return false;
        }
        for (int i13 = 0; i13 < size; i13++) {
            if (this.f35193w[this.f35194x + i13] != c11095b.f35193w[c11095b.f35194x + i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        AbstractC31484o.m96957i(i13, size());
        return Integer.valueOf(this.f35193w[this.f35194x + i13]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = this.f35194x; i14 < this.f35195y; i14++) {
            i13 = (i13 * 31) + this.f35193w[i14];
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i13 = this.f35195y;
        int i14 = this.f35194x;
        int iM114021u = AbstractC35903f.m114021u(iIntValue, i14, i13, this.f35193w);
        if (iM114021u >= 0) {
            return iM114021u - i14;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i13;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i14 = this.f35195y;
            do {
                i14--;
                i13 = this.f35194x;
                if (i14 < i13) {
                    i14 = -1;
                    break;
                }
            } while (this.f35193w[i14] != iIntValue);
            if (i14 >= 0) {
                return i14 - i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        Integer num = (Integer) obj;
        AbstractC31484o.m96957i(i13, size());
        int i14 = this.f35194x + i13;
        int[] iArr = this.f35193w;
        int i15 = iArr[i14];
        num.getClass();
        iArr[i14] = num.intValue();
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35195y - this.f35194x;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i13, int i14) {
        AbstractC31484o.m96960l(i13, i14, size());
        if (i13 == i14) {
            return Collections.EMPTY_LIST;
        }
        int i15 = this.f35194x;
        return new C11095b(i13 + i15, i15 + i14, this.f35193w);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb4 = new StringBuilder(size() * 5);
        sb4.append('[');
        int[] iArr = this.f35193w;
        int i13 = this.f35194x;
        sb4.append(iArr[i13]);
        while (true) {
            i13++;
            if (i13 >= this.f35195y) {
                sb4.append(']');
                return sb4.toString();
            }
            sb4.append(", ");
            sb4.append(iArr[i13]);
        }
    }
}
