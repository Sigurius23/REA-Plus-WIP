package p076d;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: d.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C11291i extends AbstractC11305p {

    /* JADX INFO: renamed from: E */
    public boolean f36216E;

    /* JADX INFO: renamed from: F */
    public boolean f36217F;

    /* JADX INFO: renamed from: y */
    public int f36218y;

    /* JADX INFO: renamed from: z */
    public int f36219z;

    public C11291i(InputStream inputStream, int i13) throws IOException {
        super(inputStream, i13);
        this.f36216E = false;
        this.f36217F = true;
        this.f36218y = inputStream.read();
        int i14 = inputStream.read();
        this.f36219z = i14;
        if (i14 < 0) {
            throw new EOFException();
        }
        m30508h();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m30508h() {
        if (!this.f36216E && this.f36217F && this.f36218y == 0 && this.f36219z == 0) {
            this.f36216E = true;
            m30513b();
        }
        return this.f36216E;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (m30508h()) {
            return -1;
        }
        int i13 = this.f36234w.read();
        if (i13 < 0) {
            throw new EOFException();
        }
        int i14 = this.f36218y;
        this.f36218y = this.f36219z;
        this.f36219z = i13;
        return i14;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        if (this.f36217F || i14 < 3) {
            return super.read(bArr, i13, i14);
        }
        if (this.f36216E) {
            return -1;
        }
        InputStream inputStream = this.f36234w;
        int i15 = inputStream.read(bArr, i13 + 2, i14 - 2);
        if (i15 < 0) {
            throw new EOFException();
        }
        bArr[i13] = (byte) this.f36218y;
        bArr[i13 + 1] = (byte) this.f36219z;
        this.f36218y = inputStream.read();
        int i16 = inputStream.read();
        this.f36219z = i16;
        if (i16 >= 0) {
            return i15 + 2;
        }
        throw new EOFException();
    }
}
