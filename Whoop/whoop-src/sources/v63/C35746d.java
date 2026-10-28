package v63;

import hg3.AbstractC17269i;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import p479s4.AbstractC32120a;
import p481s6.AbstractC32229a;
import p482s7.AbstractC32237a;
import p715kotlin.jvm.internal.AbstractC22676k;
import t63.AbstractC33559b;
import w63.AbstractC36867b;
import w63.C36866a;
import x63.InterfaceC38034f;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: v63.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C35746d implements Appendable, Closeable {

    /* JADX INFO: renamed from: E */
    public int f152018E;

    /* JADX INFO: renamed from: F */
    public int f152019F;

    /* JADX INFO: renamed from: G */
    public int f152020G;

    /* JADX INFO: renamed from: H */
    public int f152021H;

    /* JADX INFO: renamed from: x */
    public C36866a f152023x;

    /* JADX INFO: renamed from: y */
    public C36866a f152024y;

    /* JADX INFO: renamed from: w */
    public final InterfaceC38034f f152022w = C36866a.f157701k;

    /* JADX INFO: renamed from: z */
    public ByteBuffer f152025z = AbstractC33559b.f140038a;

    /* JADX INFO: renamed from: b */
    public final void m113255b() {
        C36866a c36866a = this.f152024y;
        if (c36866a != null) {
            this.f152018E = c36866a.f77287c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC38034f interfaceC38034f = this.f152022w;
        C36866a c36866aM113259m = m113259m();
        if (c36866aM113259m == null) {
            return;
        }
        C36866a c36866aM118245h = c36866aM113259m;
        do {
            try {
                ByteBuffer source = (ByteBuffer) c36866aM118245h.f77291g;
                AbstractC22676k.m65750j(source, "source");
                c36866aM118245h = c36866aM118245h.m118245h();
            } finally {
                AbstractC32120a.m99984j(c36866aM113259m, interfaceC38034f);
            }
        } while (c36866aM118245h != null);
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C35746d append(CharSequence text, int i13, int i14) {
        int i15;
        if (text == null) {
            return append("null", i13, i14);
        }
        Charset charset = AbstractC39397a.f169546a;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(charset, "charset");
        if (charset == AbstractC39397a.f169546a) {
            C36866a c36866aM118254d = AbstractC36867b.m118254d(this, 1, null);
            int i16 = i13;
            while (true) {
                try {
                    CharSequence charSequence = text;
                    int i17 = i14;
                    int iM100290d = AbstractC32237a.m100290d((ByteBuffer) c36866aM118254d.f77291g, charSequence, i16, i17, c36866aM118254d.f77287c, c36866aM118254d.f77289e);
                    int iM100255b = AbstractC32229a.m100255b(iM100290d) & 65535;
                    i16 += iM100255b;
                    c36866aM118254d.m56791b(AbstractC32229a.m100256c(iM100290d) & 65535);
                    if (iM100255b != 0 || i16 >= i17) {
                        i15 = i16 < i17 ? 1 : 0;
                    } else {
                        i15 = 8;
                    }
                    if (i15 <= 0) {
                        break;
                    }
                    c36866aM118254d = AbstractC36867b.m118254d(this, i15, c36866aM118254d);
                    text = charSequence;
                    i14 = i17;
                } catch (Throwable th3) {
                    m113255b();
                    throw th3;
                }
            }
            m113255b();
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            AbstractC22676k.m65749i(charsetEncoderNewEncoder, "charset.newEncoder()");
            AbstractC17269i.m48863I(charsetEncoderNewEncoder, this, text, i13, i14);
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C35747e m113257i() throws EOFException {
        int i13 = (this.f152018E - this.f152020G) + this.f152021H;
        C36866a c36866aM113259m = m113259m();
        return c36866aM113259m == null ? C35747e.f152026H : new C35747e(c36866aM113259m, i13, this.f152022w);
    }

    /* JADX INFO: renamed from: k */
    public final C36866a m113258k(int i13) throws EOFException {
        C36866a c36866a;
        int i14 = this.f152019F;
        int i15 = this.f152018E;
        if (i14 - i15 >= i13 && (c36866a = this.f152024y) != null) {
            c36866a.m56792c(i15);
            return c36866a;
        }
        C36866a c36866a2 = (C36866a) this.f152022w.mo55796t0();
        c36866a2.m56795f();
        if (c36866a2.m118245h() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        C36866a c36866a3 = this.f152024y;
        if (c36866a3 == null) {
            this.f152023x = c36866a2;
            this.f152021H = 0;
        } else {
            c36866a3.m118249l(c36866a2);
            int i16 = this.f152018E;
            c36866a3.m56792c(i16);
            this.f152021H = (i16 - this.f152020G) + this.f152021H;
        }
        this.f152024y = c36866a2;
        this.f152021H = this.f152021H;
        this.f152025z = (ByteBuffer) c36866a2.f77291g;
        this.f152018E = c36866a2.f77287c;
        this.f152020G = c36866a2.f77286b;
        this.f152019F = c36866a2.f77289e;
        return c36866a2;
    }

    /* JADX INFO: renamed from: m */
    public final C36866a m113259m() throws EOFException {
        C36866a c36866a = this.f152023x;
        if (c36866a == null) {
            return null;
        }
        C36866a c36866a2 = this.f152024y;
        if (c36866a2 != null) {
            c36866a2.m56792c(this.f152018E);
        }
        this.f152023x = null;
        this.f152024y = null;
        this.f152018E = 0;
        this.f152019F = 0;
        this.f152020G = 0;
        this.f152021H = 0;
        this.f152025z = AbstractC33559b.f140038a;
        return c36866a;
    }

    public final String toString() {
        return "BytePacketBuilder(" + ((this.f152018E - this.f152020G) + this.f152021H) + " bytes written)";
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) throws EOFException {
        int i13 = this.f152018E;
        int i14 = 4;
        if (this.f152019F - i13 >= 3) {
            ByteBuffer byteBuffer = this.f152025z;
            if (c3 >= 0 && c3 < 128) {
                byteBuffer.put(i13, (byte) c3);
                i14 = 1;
            } else if (128 <= c3 && c3 < 2048) {
                byteBuffer.put(i13, (byte) (((c3 >> 6) & 31) | 192));
                byteBuffer.put(i13 + 1, (byte) ((c3 & '?') | 128));
                i14 = 2;
            } else if (2048 <= c3 && c3 < 0) {
                byteBuffer.put(i13, (byte) (((c3 >> '\f') & 15) | 224));
                byteBuffer.put(i13 + 1, (byte) (((c3 >> 6) & 63) | 128));
                byteBuffer.put(i13 + 2, (byte) ((c3 & '?') | 128));
                i14 = 3;
            } else {
                if (0 > c3 || c3 >= 0) {
                    AbstractC32237a.m100300o(c3);
                    throw null;
                }
                byteBuffer.put(i13, (byte) (((c3 >> 18) & 7) | 240));
                byteBuffer.put(i13 + 1, (byte) (((c3 >> '\f') & 63) | 128));
                byteBuffer.put(i13 + 2, (byte) (((c3 >> 6) & 63) | 128));
                byteBuffer.put(i13 + 3, (byte) ((c3 & '?') | 128));
            }
            this.f152018E = i13 + i14;
            return this;
        }
        C36866a c36866aM113258k = m113258k(3);
        try {
            ByteBuffer byteBuffer2 = (ByteBuffer) c36866aM113258k.f77291g;
            int i15 = c36866aM113258k.f77287c;
            if (c3 >= 0 && c3 < 128) {
                byteBuffer2.put(i15, (byte) c3);
                i14 = 1;
            } else if (128 <= c3 && c3 < 2048) {
                byteBuffer2.put(i15, (byte) (((c3 >> 6) & 31) | 192));
                byteBuffer2.put(i15 + 1, (byte) ((c3 & '?') | 128));
                i14 = 2;
            } else if (2048 <= c3 && c3 < 0) {
                byteBuffer2.put(i15, (byte) (((c3 >> '\f') & 15) | 224));
                byteBuffer2.put(i15 + 1, (byte) (((c3 >> 6) & 63) | 128));
                byteBuffer2.put(i15 + 2, (byte) ((c3 & '?') | 128));
                i14 = 3;
            } else {
                if (0 > c3 || c3 >= 0) {
                    AbstractC32237a.m100300o(c3);
                    throw null;
                }
                byteBuffer2.put(i15, (byte) (((c3 >> 18) & 7) | 240));
                byteBuffer2.put(i15 + 1, (byte) (((c3 >> '\f') & 63) | 128));
                byteBuffer2.put(i15 + 2, (byte) (((c3 >> 6) & 63) | 128));
                byteBuffer2.put(i15 + 3, (byte) ((c3 & '?') | 128));
            }
            c36866aM113258k.m56791b(i14);
            m113255b();
            return this;
        } catch (Throwable th3) {
            m113255b();
            throw th3;
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            append("null", 0, 4);
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
