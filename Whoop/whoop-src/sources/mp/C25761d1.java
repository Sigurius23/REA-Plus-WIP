package mp;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import la.C23548b;
import p031b9.AbstractC2875y;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: mp.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25761d1 implements Closeable {

    /* JADX INFO: renamed from: w */
    public final ByteArrayInputStream f101474w;

    /* JADX INFO: renamed from: x */
    public C25758c1 f101475x;

    /* JADX INFO: renamed from: y */
    public final byte[] f101476y = new byte[8];

    /* JADX INFO: renamed from: z */
    public final C23548b f101477z = new C23548b(9, (byte) 0);

    public C25761d1(ByteArrayInputStream byteArrayInputStream) {
        this.f101474w = byteArrayInputStream;
    }

    /* JADX INFO: renamed from: J */
    public final void m76010J(byte b) {
        m76016k();
        if (this.f101475x.f101472a != b) {
            throw new IllegalStateException(AbstractC2875y.m8294g((b >> 5) & 7, (this.f101475x.f101472a >> 5) & 7, "expected major type ", " but found "));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m76011T(int i13, byte[] bArr) throws IOException {
        int i14 = 0;
        while (i14 != i13) {
            int i15 = this.f101474w.read(bArr, i14, i13 - i14);
            if (i15 == -1) {
                throw new EOFException();
            }
            i14 += i15;
        }
        this.f101475x = null;
    }

    /* JADX INFO: renamed from: a0 */
    public final byte[] m76012a0() {
        m76019x();
        long jM76018s = m76018s();
        if (jM76018s < 0 || jM76018s > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f101474w.available() < jM76018s) {
            throw new EOFException();
        }
        int i13 = (int) jM76018s;
        byte[] bArr = new byte[i13];
        m76011T(i13, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public final long m76013b() {
        m76010J((byte) -128);
        m76019x();
        long jM76018s = m76018s();
        if (jM76018s < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jM76018s > 0) {
            ((ArrayDeque) this.f101477z.f93280x).push(Long.valueOf(jM76018s));
        }
        return jM76018s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f101474w.close();
        this.f101477z.m68167I();
    }

    /* JADX INFO: renamed from: h */
    public final long m76014h() {
        boolean z4;
        m76016k();
        byte b = this.f101475x.f101472a;
        if (b == 0) {
            z4 = true;
        } else {
            if (b != 32) {
                throw new IllegalStateException(AbstractC2875y.m8295h((this.f101475x.f101472a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z4 = false;
        }
        long jM76018s = m76018s();
        if (jM76018s >= 0) {
            return z4 ? jM76018s : ~jM76018s;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    /* JADX INFO: renamed from: i */
    public final long m76015i() {
        m76010J((byte) -96);
        m76019x();
        long jM76018s = m76018s();
        if (jM76018s < 0 || jM76018s > DurationKt.MAX_MILLIS) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jM76018s > 0) {
            ((ArrayDeque) this.f101477z.f93280x).push(Long.valueOf(jM76018s + jM76018s));
        }
        return jM76018s;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mp.C25758c1 m76016k() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.C25761d1.m76016k():mp.c1");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m76017m() {
        m76010J((byte) -32);
        if (this.f101475x.f101473b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iM76018s = (int) m76018s();
        if (iM76018s == 20) {
            return false;
        }
        if (iM76018s == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    /* JADX INFO: renamed from: s */
    public final long m76018s() throws IOException {
        byte b = this.f101475x.f101473b;
        if (b < 24) {
            long j7 = b;
            this.f101475x = null;
            return j7;
        }
        if (b == 24) {
            int i13 = this.f101474w.read();
            if (i13 == -1) {
                throw new EOFException();
            }
            this.f101475x = null;
            return ((long) i13) & 255;
        }
        byte[] bArr = this.f101476y;
        if (b == 25) {
            m76011T(2, bArr);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b == 26) {
            m76011T(4, bArr);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b != 27) {
            C25758c1 c25758c1 = this.f101475x;
            throw new IOException(AbstractC2875y.m8294g(c25758c1.f101473b, (c25758c1.f101472a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        m76011T(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8) | (((long) bArr[7]) & 255);
    }

    /* JADX INFO: renamed from: x */
    public final void m76019x() {
        m76016k();
        if (this.f101475x.f101473b == 31) {
            throw new IllegalStateException(AbstractC2875y.m8295h(this.f101475x.f101473b, "expected definite length but found "));
        }
    }
}
