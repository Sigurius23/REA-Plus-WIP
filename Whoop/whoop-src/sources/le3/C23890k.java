package le3;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import ne3.AbstractC26604b;
import ne3.C26612f;
import ne3.C26616h;
import ne3.C26624l;
import ne3.C26626m;
import ne3.InterfaceC26618i;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: le3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C23890k implements Closeable {

    /* JADX INFO: renamed from: E */
    public final long f94489E;

    /* JADX INFO: renamed from: F */
    public final C26616h f94490F;

    /* JADX INFO: renamed from: G */
    public final C26616h f94491G;

    /* JADX INFO: renamed from: H */
    public boolean f94492H;

    /* JADX INFO: renamed from: I */
    public C23880a f94493I;

    /* JADX INFO: renamed from: J */
    public final byte[] f94494J;

    /* JADX INFO: renamed from: K */
    public final C26612f f94495K;

    /* JADX INFO: renamed from: w */
    public final InterfaceC26618i f94496w;

    /* JADX INFO: renamed from: x */
    public final Random f94497x;

    /* JADX INFO: renamed from: y */
    public final boolean f94498y;

    /* JADX INFO: renamed from: z */
    public final boolean f94499z;

    public C23890k(InterfaceC26618i sink, Random random, boolean z4, boolean z13, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        this.f94496w = sink;
        this.f94497x = random;
        this.f94498y = z4;
        this.f94499z = z13;
        this.f94489E = j7;
        this.f94490F = new C26616h();
        this.f94491G = sink.mo79205f();
        this.f94494J = new byte[4];
        this.f94495K = new C26612f();
    }

    /* JADX INFO: renamed from: b */
    public final void m70171b(int i13, C26624l c26624l) throws IOException {
        if (this.f94492H) {
            throw new IOException("closed");
        }
        int iMo79253d = c26624l.mo79253d();
        if (iMo79253d > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C26616h c26616h = this.f94491G;
        c26616h.m79219m1(i13 | 128);
        c26616h.m79219m1(iMo79253d | 128);
        byte[] bArr = this.f94494J;
        AbstractC22676k.m65747g(bArr);
        this.f94497x.nextBytes(bArr);
        c26616h.m134462write(bArr);
        if (iMo79253d > 0) {
            long j7 = c26616h.f105866x;
            c26616h.m79217l1(c26624l);
            C26612f c26612f = this.f94495K;
            AbstractC22676k.m65747g(c26612f);
            c26616h.m79199a0(c26612f);
            c26612f.m79181i(j7);
            int length = bArr.length;
            int i14 = 0;
            do {
                byte[] bArr2 = c26612f.f105850E;
                int i15 = c26612f.f105851F;
                int i16 = c26612f.f105852G;
                if (bArr2 != null) {
                    while (i15 < i16) {
                        int i17 = i14 % length;
                        bArr2[i15] = (byte) (bArr2[i15] ^ bArr[i17]);
                        i15++;
                        i14 = i17 + 1;
                    }
                }
            } while (c26612f.m79179b() != -1);
            c26612f.close();
        }
        this.f94496w.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C23880a c23880a = this.f94493I;
        if (c23880a != null) {
            AbstractC37172f.m119117b(c23880a);
        }
        AbstractC37172f.m119117b(this.f94496w);
    }

    /* JADX INFO: renamed from: h */
    public final void m70172h(int i13, C26624l data) throws IOException {
        AbstractC22676k.m65750j(data, "data");
        if (this.f94492H) {
            throw new IOException("closed");
        }
        C26616h c26616h = this.f94490F;
        c26616h.m79217l1(data);
        int i14 = i13 | 128;
        int i15 = 0;
        if (this.f94498y && data.mo79253d() >= this.f94489E) {
            C23880a c23880a = this.f94493I;
            if (c23880a == null) {
                c23880a = new C23880a(this.f94499z, 0);
                this.f94493I = c23880a;
            }
            C26626m c26626m = (C26626m) c23880a.f94429E;
            C26616h c26616h2 = c23880a.f94432y;
            if (c26616h2.f105866x != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (c23880a.f94431x) {
                ((Deflater) c23880a.f94433z).reset();
            }
            c26626m.write(c26616h, c26616h.f105866x);
            c26626m.flush();
            C26624l c26624l = AbstractC23881b.f94434a;
            if (c26616h2.mo79202d0(c26616h2.f105866x - ((long) c26624l.f105883w.length), c26624l)) {
                long j7 = c26616h2.f105866x - ((long) 4);
                C26612f c26612fM79199a0 = c26616h2.m79199a0(AbstractC26604b.f105833a);
                try {
                    c26612fM79199a0.m79180h(j7);
                    c26612fM79199a0.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(c26612fM79199a0, th3);
                        throw th4;
                    }
                }
            } else {
                c26616h2.m79219m1(0);
            }
            c26616h.write(c26616h2, c26616h2.f105866x);
            i14 = i13 | 192;
        }
        long j13 = c26616h.f105866x;
        C26616h c26616h3 = this.f94491G;
        c26616h3.m79219m1(i14);
        if (j13 <= 125) {
            c26616h3.m79219m1(((int) j13) | 128);
        } else if (j13 <= 65535) {
            c26616h3.m79219m1(254);
            c26616h3.m79228r1((int) j13);
        } else {
            c26616h3.m79219m1(255);
            c26616h3.m79227q1(j13);
        }
        byte[] bArr = this.f94494J;
        AbstractC22676k.m65747g(bArr);
        this.f94497x.nextBytes(bArr);
        c26616h3.m134462write(bArr);
        if (j13 > 0) {
            C26612f c26612f = this.f94495K;
            AbstractC22676k.m65747g(c26612f);
            c26616h.m79199a0(c26612f);
            c26612f.m79181i(0L);
            int length = bArr.length;
            do {
                byte[] bArr2 = c26612f.f105850E;
                int i16 = c26612f.f105851F;
                int i17 = c26612f.f105852G;
                if (bArr2 != null) {
                    while (i16 < i17) {
                        int i18 = i15 % length;
                        bArr2[i16] = (byte) (bArr2[i16] ^ bArr[i18]);
                        i16++;
                        i15 = i18 + 1;
                    }
                }
            } while (c26612f.m79179b() != -1);
            c26612f.close();
        }
        c26616h3.write(c26616h, j13);
        this.f94496w.flush();
    }
}
