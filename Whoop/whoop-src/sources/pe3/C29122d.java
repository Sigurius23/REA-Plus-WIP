package pe3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: renamed from: pe3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C29122d extends UploadDataProvider {

    /* JADX INFO: renamed from: w */
    public volatile FileChannel f117886w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC29121c f117887x;

    /* JADX INFO: renamed from: y */
    public final Object f117888y = new Object();

    public C29122d(InterfaceC29121c interfaceC29121c) {
        this.f117887x = interfaceC29121c;
    }

    /* JADX INFO: renamed from: b */
    public final FileChannel m88490b() {
        if (this.f117886w == null) {
            synchronized (this.f117888y) {
                try {
                    if (this.f117886w == null) {
                        this.f117886w = this.f117887x.getChannel();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f117886w;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f117886w;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return m88490b().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelM88490b = m88490b();
        int i13 = 0;
        while (i13 == 0) {
            int i14 = fileChannelM88490b.read(byteBuffer);
            if (i14 == -1) {
                break;
            } else {
                i13 += i14;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        m88490b().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
