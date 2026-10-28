package wa3;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: wa3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C36982a extends FilterInputStream {

    /* JADX INFO: renamed from: w */
    public int f158306w;

    public C36982a(ByteArrayInputStream byteArrayInputStream, int i13) {
        super(byteArrayInputStream);
        this.f158306w = i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f158306w);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f158306w <= 0) {
            return -1;
        }
        int i13 = super.read();
        if (i13 >= 0) {
            this.f158306w--;
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jSkip = super.skip(Math.min(j7, this.f158306w));
        if (jSkip >= 0) {
            this.f158306w = (int) (((long) this.f158306w) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = this.f158306w;
        if (i15 <= 0) {
            return -1;
        }
        int i16 = super.read(bArr, i13, Math.min(i14, i15));
        if (i16 >= 0) {
            this.f158306w -= i16;
        }
        return i16;
    }
}
