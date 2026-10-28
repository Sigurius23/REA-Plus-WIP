package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: org.webrtc.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28289k implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114082w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ByteBuffer f114083x;

    public /* synthetic */ RunnableC28289k(ByteBuffer byteBuffer, int i13) {
        this.f114082w = i13;
        this.f114083x = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114082w) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.f114083x);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.f114083x);
                break;
        }
    }
}
