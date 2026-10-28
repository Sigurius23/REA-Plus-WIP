package androidx.datastore.preferences.protobuf;

import androidx.glance.appwidget.protobuf.C1388h;
import androidx.health.platform.client.proto.C1468h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import mp.C25801t0;
import wa3.C37018u;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C1209e implements Iterator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5384w = 0;

    /* JADX INFO: renamed from: x */
    public int f5385x = 0;

    /* JADX INFO: renamed from: y */
    public final int f5386y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Iterable f5387z;

    public C1209e(C25801t0 c25801t0) {
        this.f5387z = c25801t0;
        this.f5386y = c25801t0.mo76042e();
    }

    /* JADX INFO: renamed from: a */
    public byte m3792a() {
        switch (this.f5384w) {
            case 0:
                int i13 = this.f5385x;
                if (i13 >= this.f5386y) {
                    throw new NoSuchElementException();
                }
                this.f5385x = i13 + 1;
                return ((C1218h) this.f5387z).mo3800g(i13);
            case 3:
                int i14 = this.f5385x;
                if (i14 >= this.f5386y) {
                    throw new NoSuchElementException();
                }
                this.f5385x = i14 + 1;
                return ((AbstractC5146i) this.f5387z).mo16166f(i14);
            default:
                try {
                    byte[] bArr = ((C37018u) this.f5387z).f158387x;
                    int i15 = this.f5385x;
                    this.f5385x = i15 + 1;
                    return bArr[i15];
                } catch (ArrayIndexOutOfBoundsException e5) {
                    throw new NoSuchElementException(e5.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5384w) {
            case 0:
                return this.f5385x < this.f5386y;
            case 1:
                return this.f5385x < this.f5386y;
            case 2:
                return this.f5385x < this.f5386y;
            case 3:
                return this.f5385x < this.f5386y;
            case 4:
                return this.f5385x < this.f5386y;
            default:
                return this.f5385x < this.f5386y;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5384w) {
            case 0:
                return Byte.valueOf(m3792a());
            case 1:
                int i13 = this.f5385x;
                if (i13 >= this.f5386y) {
                    throw new NoSuchElementException();
                }
                this.f5385x = i13 + 1;
                return Byte.valueOf(((C1388h) this.f5387z).mo4338g(i13));
            case 2:
                int i14 = this.f5385x;
                if (i14 >= this.f5386y) {
                    throw new NoSuchElementException();
                }
                this.f5385x = i14 + 1;
                return Byte.valueOf(((C1468h) this.f5387z).mo4611f(i14));
            case 3:
                return Byte.valueOf(m3792a());
            case 4:
                int i15 = this.f5385x;
                if (i15 >= this.f5386y) {
                    throw new NoSuchElementException();
                }
                this.f5385x = i15 + 1;
                return Byte.valueOf(((C25801t0) this.f5387z).mo76040c(i15));
            default:
                return Byte.valueOf(m3792a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5384w) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C1209e(C1218h c1218h) {
        this.f5387z = c1218h;
        this.f5386y = c1218h.size();
    }

    public C1209e(C1388h c1388h) {
        this.f5387z = c1388h;
        this.f5386y = c1388h.size();
    }

    public C1209e(C1468h c1468h) {
        this.f5387z = c1468h;
        this.f5386y = c1468h.size();
    }

    public C1209e(AbstractC5146i abstractC5146i) {
        this.f5387z = abstractC5146i;
        this.f5386y = abstractC5146i.size();
    }

    public C1209e(C37018u c37018u) {
        this.f5387z = c37018u;
        this.f5386y = c37018u.f158387x.length;
    }
}
