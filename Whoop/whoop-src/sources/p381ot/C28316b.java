package p381ot;

import java.io.OutputStream;

/* JADX INFO: renamed from: ot.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C28316b extends OutputStream {

    /* JADX INFO: renamed from: w */
    public long f114199w;

    @Override // java.io.OutputStream
    public final void write(int i13) {
        this.f114199w++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f114199w += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        int i15;
        if (i13 >= 0 && i13 <= bArr.length && i14 >= 0 && (i15 = i13 + i14) <= bArr.length && i15 >= 0) {
            this.f114199w += (long) i14;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
