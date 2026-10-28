package androidx.datastore.preferences.protobuf;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C1212f extends C1218h {

    /* JADX INFO: renamed from: E */
    public final int f5388E;

    /* JADX INFO: renamed from: F */
    public final int f5389F;

    public C1212f(byte[] bArr, int i13, int i14) {
        super(bArr);
        C1218h.m3807c(i13, i13 + i14, bArr.length);
        this.f5388E = i13;
        this.f5389F = i14;
    }

    @Override // androidx.datastore.preferences.protobuf.C1218h
    /* JADX INFO: renamed from: a */
    public final byte mo3797a(int i13) {
        int i14 = this.f5389F;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f5401x[this.f5388E + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C1218h
    /* JADX INFO: renamed from: e */
    public final void mo3798e(int i13, byte[] bArr) {
        System.arraycopy(this.f5401x, this.f5388E, bArr, 0, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.C1218h
    /* JADX INFO: renamed from: f */
    public final int mo3799f() {
        return this.f5388E;
    }

    @Override // androidx.datastore.preferences.protobuf.C1218h
    /* JADX INFO: renamed from: g */
    public final byte mo3800g(int i13) {
        return this.f5401x[this.f5388E + i13];
    }

    @Override // androidx.datastore.preferences.protobuf.C1218h
    public final int size() {
        return this.f5389F;
    }
}
