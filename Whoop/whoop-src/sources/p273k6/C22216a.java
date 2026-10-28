package p273k6;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: k6.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22216a extends MediaDataSource {

    /* JADX INFO: renamed from: w */
    public long f86570w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22221f f86571x;

    public C22216a(C22221f c22221f) {
        this.f86571x = c22221f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j7, byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        if (j7 < 0) {
            return -1;
        }
        try {
            long j13 = this.f86570w;
            C22221f c22221f = this.f86571x;
            if (j13 != j7) {
                if (j13 >= 0 && j7 >= j13 + ((long) c22221f.f86573w.available())) {
                    return -1;
                }
                c22221f.m63686h(j7);
                this.f86570w = j7;
            }
            if (i14 > c22221f.f86573w.available()) {
                i14 = c22221f.f86573w.available();
            }
            int i15 = c22221f.read(bArr, i13, i14);
            if (i15 >= 0) {
                this.f86570w += (long) i15;
                return i15;
            }
        } catch (IOException unused) {
        }
        this.f86570w = -1L;
        return -1;
    }
}
