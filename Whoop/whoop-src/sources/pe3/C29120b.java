package pe3;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: renamed from: pe3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C29120b extends UploadDataProvider {

    /* JADX INFO: renamed from: w */
    public final ByteBuffer f117885w;

    public C29120b(ByteBuffer byteBuffer) {
        this.f117885w = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f117885w.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f117885w;
        if (iRemaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int iLimit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindSucceeded();
    }
}
