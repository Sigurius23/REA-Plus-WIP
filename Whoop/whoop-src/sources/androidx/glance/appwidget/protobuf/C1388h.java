package androidx.glance.appwidget.protobuf;

import androidx.datastore.preferences.protobuf.C1209e;
import java.util.Iterator;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.h */
/* JADX INFO: loaded from: classes5.dex */
public class C1388h extends AbstractC1391i {

    /* JADX INFO: renamed from: z */
    public final byte[] f5903z;

    public C1388h(byte[] bArr) {
        this.f5907w = 0;
        bArr.getClass();
        this.f5903z = bArr;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1391i
    /* JADX INFO: renamed from: a */
    public byte mo4335a(int i13) {
        return this.f5903z[i13];
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1391i
    /* JADX INFO: renamed from: e */
    public void mo4336e(int i13, byte[] bArr) {
        System.arraycopy(this.f5903z, 0, bArr, 0, i13);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1391i) || size() != ((AbstractC1391i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1388h)) {
            return obj.equals(this);
        }
        C1388h c1388h = (C1388h) obj;
        int i13 = this.f5907w;
        int i14 = c1388h.f5907w;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int size = size();
        if (size > c1388h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1388h.size()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(size, "Ran off end of other: 0, ", ", ");
            sbM30466t.append(c1388h.size());
            throw new IllegalArgumentException(sbM30466t.toString());
        }
        byte[] bArr = c1388h.f5903z;
        int iMo4337f = mo4337f() + size;
        int iMo4337f2 = mo4337f();
        int iMo4337f3 = c1388h.mo4337f();
        while (iMo4337f2 < iMo4337f) {
            if (this.f5903z[iMo4337f2] != bArr[iMo4337f3]) {
                return false;
            }
            iMo4337f2++;
            iMo4337f3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public int mo4337f() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public byte mo4338g(int i13) {
        return this.f5903z[i13];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1209e(this);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1391i
    public int size() {
        return this.f5903z.length;
    }
}
