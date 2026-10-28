package p076d;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: d.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C11273c extends AbstractC11305p {

    /* JADX INFO: renamed from: E */
    public static final byte[] f36187E = new byte[0];

    /* JADX INFO: renamed from: y */
    public final int f36188y;

    /* JADX INFO: renamed from: z */
    public int f36189z;

    public C11273c(InputStream inputStream, int i13, int i14) {
        super(inputStream, i14);
        if (i13 <= 0) {
            if (i13 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            m30513b();
        }
        this.f36188y = i13;
        this.f36189z = i13;
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m30484h() throws IOException {
        int i13 = this.f36189z;
        if (i13 == 0) {
            return f36187E;
        }
        int i14 = this.f36235x;
        if (i13 >= i14) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f36189z + " >= " + i14);
        }
        byte[] bArr = new byte[i13];
        int i15 = 0;
        while (i15 < i13) {
            int i16 = this.f36234w.read(bArr, i15, i13 - i15);
            if (i16 < 0) {
                break;
            }
            i15 += i16;
        }
        int i17 = i13 - i15;
        this.f36189z = i17;
        if (i17 == 0) {
            m30513b();
            return bArr;
        }
        throw new EOFException("DEF length " + this.f36188y + " object truncated by " + this.f36189z);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f36189z == 0) {
            return -1;
        }
        int i13 = this.f36234w.read();
        if (i13 >= 0) {
            int i14 = this.f36189z - 1;
            this.f36189z = i14;
            if (i14 == 0) {
                m30513b();
            }
            return i13;
        }
        throw new EOFException("DEF length " + this.f36188y + " object truncated by " + this.f36189z);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = this.f36189z;
        if (i15 == 0) {
            return -1;
        }
        int i16 = this.f36234w.read(bArr, i13, Math.min(i14, i15));
        if (i16 >= 0) {
            int i17 = this.f36189z - i16;
            this.f36189z = i17;
            if (i17 == 0) {
                m30513b();
            }
            return i16;
        }
        throw new EOFException("DEF length " + this.f36188y + " object truncated by " + this.f36189z);
    }
}
