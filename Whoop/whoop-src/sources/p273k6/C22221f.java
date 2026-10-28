package p273k6;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: k6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C22221f extends C22217b {
    public C22221f(byte[] bArr) {
        super(bArr);
        this.f86573w.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: h */
    public final void m63686h(long j7) throws IOException {
        int i13 = this.f86574x;
        if (i13 > j7) {
            this.f86574x = 0;
            this.f86573w.reset();
        } else {
            j7 -= (long) i13;
        }
        m63677b((int) j7);
    }

    public C22221f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f86573w.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
