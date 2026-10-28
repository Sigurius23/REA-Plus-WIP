package l83;

import d93.InterfaceC11820a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p184h5.C16907r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C23473s implements Collection, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final byte[] f92951w;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0022 A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C23472r)) {
            return false;
        }
        byte b = ((C23472r) obj).f92950w;
        byte[] bArr = this.f92951w;
        AbstractC22676k.m65750j(bArr, "<this>");
        int length = bArr.length;
        int i13 = 0;
        while (i13 < length) {
            if (b == bArr[i13]) {
                if (i13 >= 0) {
                    return true;
                }
                return false;
            }
            i13++;
        }
        i13 = -1;
        if (i13 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C23472r) {
                    byte b = ((C23472r) obj).f92950w;
                    byte[] bArr = this.f92951w;
                    AbstractC22676k.m65750j(bArr, "<this>");
                    int length = bArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i13 = -1;
                            break;
                        }
                        if (b == bArr[i13]) {
                            break;
                        }
                        i13++;
                    }
                    if (i13 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C23473s) {
            return AbstractC22676k.m65745e(this.f92951w, ((C23473s) obj).f92951w);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f92951w);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f92951w.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C16907r0(this.f92951w);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f92951w.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f92951w) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}
