package hms.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: hms.webrtc.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17484h implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67595w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ByteBuffer f67596x;

    public /* synthetic */ RunnableC17484h(ByteBuffer byteBuffer, int i13) {
        this.f67595w = i13;
        this.f67596x = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67595w) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.f67596x);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.f67596x);
                break;
        }
    }
}
