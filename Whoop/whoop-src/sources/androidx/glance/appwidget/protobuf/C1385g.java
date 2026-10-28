package androidx.glance.appwidget.protobuf;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C1385g extends C1388h {

    /* JADX INFO: renamed from: E */
    public final int f5889E;

    /* JADX INFO: renamed from: F */
    public final int f5890F;

    public C1385g(byte[] bArr, int i13, int i14) {
        super(bArr);
        AbstractC1391i.m4352c(i13, i13 + i14, bArr.length);
        this.f5889E = i13;
        this.f5890F = i14;
    }

    @Override // androidx.glance.appwidget.protobuf.C1388h, androidx.glance.appwidget.protobuf.AbstractC1391i
    /* JADX INFO: renamed from: a */
    public final byte mo4335a(int i13) {
        int i14 = this.f5890F;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f5903z[this.f5889E + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Index > length: ", ", "));
    }

    @Override // androidx.glance.appwidget.protobuf.C1388h, androidx.glance.appwidget.protobuf.AbstractC1391i
    /* JADX INFO: renamed from: e */
    public final void mo4336e(int i13, byte[] bArr) {
        System.arraycopy(this.f5903z, this.f5889E, bArr, 0, i13);
    }

    @Override // androidx.glance.appwidget.protobuf.C1388h
    /* JADX INFO: renamed from: f */
    public final int mo4337f() {
        return this.f5889E;
    }

    @Override // androidx.glance.appwidget.protobuf.C1388h
    /* JADX INFO: renamed from: g */
    public final byte mo4338g(int i13) {
        return this.f5903z[this.f5889E + i13];
    }

    @Override // androidx.glance.appwidget.protobuf.C1388h, androidx.glance.appwidget.protobuf.AbstractC1391i
    public final int size() {
        return this.f5890F;
    }
}
