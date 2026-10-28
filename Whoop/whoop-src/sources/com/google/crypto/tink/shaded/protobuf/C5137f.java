package com.google.crypto.tink.shaded.protobuf;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C5137f extends C5143h {

    /* JADX INFO: renamed from: E */
    public final int f21505E;

    /* JADX INFO: renamed from: F */
    public final int f21506F;

    public C5137f(byte[] bArr, int i13, int i14) {
        super(bArr);
        AbstractC5146i.m16172c(i13, i13 + i14, bArr.length);
        this.f21505E = i13;
        this.f21506F = i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5143h, com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    /* JADX INFO: renamed from: a */
    public final byte mo16164a(int i13) {
        int i14 = this.f21506F;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f21510z[this.f21505E + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5143h, com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    /* JADX INFO: renamed from: e */
    public final void mo16165e(int i13, byte[] bArr) {
        System.arraycopy(this.f21510z, this.f21505E, bArr, 0, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5143h, com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    /* JADX INFO: renamed from: f */
    public final byte mo16166f(int i13) {
        return this.f21510z[this.f21505E + i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5143h
    /* JADX INFO: renamed from: j */
    public final int mo16167j() {
        return this.f21505E;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5143h, com.google.crypto.tink.shaded.protobuf.AbstractC5146i
    public final int size() {
        return this.f21506F;
    }
}
