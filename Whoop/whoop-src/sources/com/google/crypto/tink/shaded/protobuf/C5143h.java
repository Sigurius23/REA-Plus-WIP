package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C1209e;
import java.util.Iterator;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public class C5143h extends AbstractC5146i {

    /* JADX INFO: renamed from: z */
    public final byte[] f21510z;

    public C5143h(byte[] bArr) {
        this.f21516w = 0;
        bArr.getClass();
        this.f21510z = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    /* JADX INFO: renamed from: a */
    public byte mo16164a(int i13) {
        return this.f21510z[i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    /* JADX INFO: renamed from: e */
    public void mo16165e(int i13, byte[] bArr) {
        System.arraycopy(this.f21510z, 0, bArr, 0, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5146i) || size() != ((AbstractC5146i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C5143h)) {
            return obj.equals(this);
        }
        C5143h c5143h = (C5143h) obj;
        int i13 = this.f21516w;
        int i14 = c5143h.f21516w;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int size = size();
        if (size > c5143h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c5143h.size()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(size, "Ran off end of other: 0, ", ", ");
            sbM30466t.append(c5143h.size());
            throw new IllegalArgumentException(sbM30466t.toString());
        }
        byte[] bArr = c5143h.f21510z;
        int iMo16167j = mo16167j() + size;
        int iMo16167j2 = mo16167j();
        int iMo16167j3 = c5143h.mo16167j();
        while (iMo16167j2 < iMo16167j) {
            if (this.f21510z[iMo16167j2] != bArr[iMo16167j3]) {
                return false;
            }
            iMo16167j2++;
            iMo16167j3++;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    /* JADX INFO: renamed from: f */
    public byte mo16166f(int i13) {
        return this.f21510z[i13];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1209e(this);
    }

    /* JADX INFO: renamed from: j */
    public int mo16167j() {
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    public int size() {
        return this.f21510z.length;
    }
}
