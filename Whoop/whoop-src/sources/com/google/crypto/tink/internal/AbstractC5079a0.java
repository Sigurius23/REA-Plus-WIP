package com.google.crypto.tink.internal;

import java.nio.ByteBuffer;
import p075ct.C11105a;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.a0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5079a0 {

    /* JADX INFO: renamed from: a */
    public static final C11105a f21389a = C11105a.m30034a(new byte[0]);

    /* JADX INFO: renamed from: a */
    public static final C11105a m15951a(int i13) {
        return C11105a.m30034a(ByteBuffer.allocate(5).put((byte) 0).putInt(i13).array());
    }

    /* JADX INFO: renamed from: b */
    public static final C11105a m15952b(int i13) {
        return C11105a.m30034a(ByteBuffer.allocate(5).put((byte) 1).putInt(i13).array());
    }
}
