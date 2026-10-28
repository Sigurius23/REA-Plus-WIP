package com.squareup.wire;

import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.squareup.wire.d */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC5573d {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);


    /* JADX INFO: renamed from: w */
    public final int f22090w;

    EnumC5573d(int i13) {
        this.f22090w = i13;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC5586q m16739a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return AbstractC5586q.UINT64;
        }
        if (iOrdinal == 1) {
            return AbstractC5586q.FIXED64;
        }
        if (iOrdinal == 2) {
            return AbstractC5586q.BYTES;
        }
        if (iOrdinal == 3) {
            return AbstractC5586q.FIXED32;
        }
        throw new NoWhenBranchMatchedException();
    }
}
