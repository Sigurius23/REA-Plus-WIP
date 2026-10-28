package r53;

import io.github.crow_misia.libyuv.Yuv;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: r53.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC30940a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127663w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ByteBuffer f127664x;

    public /* synthetic */ RunnableC30940a(ByteBuffer byteBuffer, int i13) {
        this.f127663w = i13;
        this.f127664x = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f127663w) {
            case 0:
                Yuv.INSTANCE.freeNativeBuffer(this.f127664x);
                break;
            default:
                Yuv.INSTANCE.freeNativeBuffer(this.f127664x);
                break;
        }
    }
}
