package androidx.health.platform.client.proto;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C1463g extends C1468h {

    /* JADX INFO: renamed from: E */
    public final int f6039E;

    /* JADX INFO: renamed from: F */
    public final int f6040F;

    public C1463g(byte[] bArr, int i13, int i14) {
        super(bArr);
        C1468h.m4630c(i13, i13 + i14, bArr.length);
        this.f6039E = i13;
        this.f6040F = i14;
    }

    @Override // androidx.health.platform.client.proto.C1468h
    /* JADX INFO: renamed from: a */
    public final byte mo4609a(int i13) {
        int i14 = this.f6040F;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f6047x[this.f6039E + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Index > length: ", ", "));
    }

    @Override // androidx.health.platform.client.proto.C1468h
    /* JADX INFO: renamed from: e */
    public final int mo4610e() {
        return this.f6039E;
    }

    @Override // androidx.health.platform.client.proto.C1468h
    /* JADX INFO: renamed from: f */
    public final byte mo4611f(int i13) {
        return this.f6047x[this.f6039E + i13];
    }

    @Override // androidx.health.platform.client.proto.C1468h
    public final int size() {
        return this.f6040F;
    }
}
