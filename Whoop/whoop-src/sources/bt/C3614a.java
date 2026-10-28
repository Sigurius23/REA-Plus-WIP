package bt;

import at.C1977u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: bt.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3614a extends InputStream {

    /* JADX INFO: renamed from: E */
    public int f14702E = -1;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C3615b f14703F;

    /* JADX INFO: renamed from: w */
    public final byte[] f14704w;

    /* JADX INFO: renamed from: x */
    public Mac f14705x;

    /* JADX INFO: renamed from: y */
    public byte[] f14706y;

    /* JADX INFO: renamed from: z */
    public ByteBuffer f14707z;

    public C3614a(C3615b c3615b, byte[] bArr) {
        this.f14703F = c3615b;
        this.f14704w = Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: b */
    public final void m10974b() throws InvalidKeyException, IOException {
        C3615b c3615b = this.f14703F;
        try {
            C1977u c1977u = C1977u.f7820c;
            Mac mac = (Mac) c1977u.f7825a.m6025a(C3615b.m10976a(c3615b.f14709a));
            this.f14705x = mac;
            byte[] bArr = c3615b.f14711c;
            if (bArr == null || bArr.length == 0) {
                mac.init(new SecretKeySpec(new byte[this.f14705x.getMacLength()], C3615b.m10976a(c3615b.f14709a)));
            } else {
                mac.init(new SecretKeySpec(c3615b.f14711c, C3615b.m10976a(c3615b.f14709a)));
            }
            this.f14705x.update(c3615b.f14710b);
            this.f14706y = this.f14705x.doFinal();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
            this.f14707z = byteBufferAllocateDirect;
            byteBufferAllocateDirect.mark();
            this.f14702E = 0;
        } catch (GeneralSecurityException e5) {
            throw new IOException("Creating HMac failed", e5);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10975h() throws InvalidKeyException {
        this.f14705x.init(new SecretKeySpec(this.f14706y, C3615b.m10976a(this.f14703F.f14709a)));
        this.f14707z.reset();
        this.f14705x.update(this.f14707z);
        this.f14705x.update(this.f14704w);
        int i13 = this.f14702E + 1;
        this.f14702E = i13;
        this.f14705x.update((byte) i13);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f14705x.doFinal());
        this.f14707z = byteBufferWrap;
        byteBufferWrap.mark();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i13 = read(bArr, 0, 1);
        if (i13 == 1) {
            return bArr[0] & 255;
        }
        if (i13 == -1) {
            return i13;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        try {
            if (this.f14702E == -1) {
                m10974b();
            }
            int i15 = 0;
            while (i15 < i14) {
                if (!this.f14707z.hasRemaining()) {
                    if (this.f14702E == 255) {
                        break;
                    }
                    m10975h();
                }
                int iMin = Math.min(i14 - i15, this.f14707z.remaining());
                this.f14707z.get(bArr, i13, iMin);
                i13 += iMin;
                i15 += iMin;
            }
            return i15;
        } catch (GeneralSecurityException e5) {
            this.f14705x = null;
            throw new IOException("HkdfInputStream failed", e5);
        }
    }
}
