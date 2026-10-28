package p184h5;

import android.view.View;
import android.view.ViewGroup;
import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l83.C23472r;
import l83.C23474t;
import l83.C23476v;
import l83.C23479y;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.C38182q;

/* JADX INFO: renamed from: h5.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16907r0 implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64865w = 0;

    /* JADX INFO: renamed from: x */
    public int f64866x;

    /* JADX INFO: renamed from: y */
    public final Object f64867y;

    public C16907r0(byte[] array) {
        AbstractC22676k.m65750j(array, "array");
        this.f64867y = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f64865w) {
            case 0:
                return this.f64866x < ((ViewGroup) this.f64867y).getChildCount();
            case 1:
                return this.f64866x < ((byte[]) this.f64867y).length;
            case 2:
                return this.f64866x < ((int[]) this.f64867y).length;
            case 3:
                return this.f64866x < ((long[]) this.f64867y).length;
            case 4:
                return this.f64866x < ((short[]) this.f64867y).length;
            default:
                return this.f64866x > 0 && ((Iterator) this.f64867y).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f64865w) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f64867y;
                int i13 = this.f64866x;
                this.f64866x = i13 + 1;
                View childAt = viewGroup.getChildAt(i13);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i14 = this.f64866x;
                byte[] bArr = (byte[]) this.f64867y;
                if (i14 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f64866x));
                }
                this.f64866x = i14 + 1;
                return new C23472r(bArr[i14]);
            case 2:
                int i15 = this.f64866x;
                int[] iArr = (int[]) this.f64867y;
                if (i15 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f64866x));
                }
                this.f64866x = i15 + 1;
                return new C23474t(iArr[i15]);
            case 3:
                int i16 = this.f64866x;
                long[] jArr = (long[]) this.f64867y;
                if (i16 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f64866x));
                }
                this.f64866x = i16 + 1;
                return new C23476v(jArr[i16]);
            case 4:
                int i17 = this.f64866x;
                short[] sArr = (short[]) this.f64867y;
                if (i17 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f64866x));
                }
                this.f64866x = i17 + 1;
                return new C23479y(sArr[i17]);
            default:
                int i18 = this.f64866x;
                if (i18 == 0) {
                    throw new NoSuchElementException();
                }
                this.f64866x = i18 - 1;
                return ((Iterator) this.f64867y).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f64865w) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f64867y;
                int i13 = this.f64866x - 1;
                this.f64866x = i13;
                viewGroup.removeViewAt(i13);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C16907r0(int[] array) {
        AbstractC22676k.m65750j(array, "array");
        this.f64867y = array;
    }

    public C16907r0(long[] array) {
        AbstractC22676k.m65750j(array, "array");
        this.f64867y = array;
    }

    public C16907r0(short[] array) {
        AbstractC22676k.m65750j(array, "array");
        this.f64867y = array;
    }

    public C16907r0(ViewGroup viewGroup) {
        this.f64867y = viewGroup;
    }

    public C16907r0(C38182q c38182q) {
        this.f64866x = c38182q.f163493b;
        this.f64867y = c38182q.f163492a.iterator();
    }
}
