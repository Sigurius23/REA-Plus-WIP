package p085d9;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p547v8.AbstractC35789f;
import p547v8.C35787d;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: d9.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11784c0 extends AbstractC35789f {

    /* JADX INFO: renamed from: n */
    public int f38208n;

    /* JADX INFO: renamed from: o */
    public boolean f38209o;

    /* JADX INFO: renamed from: p */
    public int f38210p;

    /* JADX INFO: renamed from: q */
    public long f38211q;

    /* JADX INFO: renamed from: s */
    public byte[] f38213s;

    /* JADX INFO: renamed from: v */
    public byte[] f38216v;

    /* JADX INFO: renamed from: r */
    public int f38212r = 0;

    /* JADX INFO: renamed from: t */
    public int f38214t = 0;

    /* JADX INFO: renamed from: u */
    public int f38215u = 0;

    /* JADX INFO: renamed from: l */
    public final long f38206l = 100000;

    /* JADX INFO: renamed from: i */
    public final float f38203i = 0.2f;

    /* JADX INFO: renamed from: m */
    public final long f38207m = 2000000;

    /* JADX INFO: renamed from: k */
    public final int f38205k = 10;

    /* JADX INFO: renamed from: j */
    public final short f38204j = 1024;

    public C11784c0() {
        byte[] bArr = AbstractC38065t.f163033c;
        this.f38213s = bArr;
        this.f38216v = bArr;
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: b */
    public final void mo31596b(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f152204g.hasRemaining()) {
            int i13 = this.f38210p;
            short s13 = this.f38204j;
            if (i13 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f38213s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s13) {
                        int i14 = this.f38208n;
                        iPosition = AbstractC11266d.m30449c(iLimit3, i14, i14, i14);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f38210p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m113439j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC35849g.m113807i(this.f38214t < this.f38213s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s13) {
                        int i15 = this.f38208n;
                        iLimit = (iPosition2 / i15) * i15;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f38214t;
                int i16 = this.f38215u;
                int length2 = length + i16;
                byte[] bArr = this.f38213s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i16 - (bArr.length - length);
                }
                int i17 = length - length2;
                boolean z4 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i17);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f38213s, length2, iMin);
                int i18 = this.f38215u + iMin;
                this.f38215u = i18;
                AbstractC35849g.m113807i(i18 <= this.f38213s.length);
                boolean z13 = z4 && iPosition3 < i17;
                m31602l(z13);
                if (z13) {
                    this.f38210p = 0;
                    this.f38212r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: f */
    public final C35787d mo31597f(C35787d c35787d) throws AudioProcessor$UnhandledAudioFormatException {
        if (c35787d.f152196c == 2) {
            return c35787d.f152194a == -1 ? C35787d.f152193e : c35787d;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c35787d);
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: g */
    public final void mo31598g() {
        if (isActive()) {
            C35787d c35787d = this.f152199b;
            int i13 = c35787d.f152195b * 2;
            this.f38208n = i13;
            int i14 = ((((int) ((this.f38206l * ((long) c35787d.f152194a)) / 1000000)) / 2) / i13) * i13 * 2;
            if (this.f38213s.length != i14) {
                this.f38213s = new byte[i14];
                this.f38216v = new byte[i14];
            }
        }
        this.f38210p = 0;
        this.f38211q = 0L;
        this.f38212r = 0;
        this.f38214t = 0;
        this.f38215u = 0;
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: h */
    public final void mo31599h() {
        if (this.f38215u > 0) {
            m31602l(true);
            this.f38212r = 0;
        }
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: i */
    public final void mo31600i() {
        this.f38209o = false;
        byte[] bArr = AbstractC38065t.f163033c;
        this.f38213s = bArr;
        this.f38216v = bArr;
    }

    @Override // p547v8.AbstractC35789f, p547v8.InterfaceC35788e
    public final boolean isActive() {
        return super.isActive() && this.f38209o;
    }

    /* JADX INFO: renamed from: k */
    public final int m31601k(int i13) {
        int length = ((((int) ((this.f38207m * ((long) this.f152199b.f152194a)) / 1000000)) - this.f38212r) * this.f38208n) - (this.f38213s.length / 2);
        AbstractC35849g.m113807i(length >= 0);
        int iMin = (int) Math.min((i13 * this.f38203i) + 0.5f, length);
        int i14 = this.f38208n;
        return (iMin / i14) * i14;
    }

    /* JADX INFO: renamed from: l */
    public final void m31602l(boolean z4) {
        int length;
        int iM31601k;
        int i13 = this.f38215u;
        byte[] bArr = this.f38213s;
        if (i13 == bArr.length || z4) {
            if (this.f38212r == 0) {
                if (z4) {
                    m31603m(i13, 3);
                    length = i13;
                } else {
                    AbstractC35849g.m113807i(i13 >= bArr.length / 2);
                    length = this.f38213s.length / 2;
                    m31603m(length, 0);
                }
                iM31601k = length;
            } else if (z4) {
                int length2 = i13 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM31601k2 = m31601k(length2) + (this.f38213s.length / 2);
                m31603m(iM31601k2, 2);
                iM31601k = iM31601k2;
                length = length3;
            } else {
                length = i13 - (bArr.length / 2);
                iM31601k = m31601k(length);
                m31603m(iM31601k, 1);
            }
            AbstractC35849g.m113806h("bytesConsumed is not aligned to frame size: %s" + length, length % this.f38208n == 0);
            AbstractC35849g.m113807i(i13 >= iM31601k);
            this.f38215u -= length;
            int i14 = this.f38214t + length;
            this.f38214t = i14;
            this.f38214t = i14 % this.f38213s.length;
            int i15 = this.f38212r;
            int i16 = this.f38208n;
            this.f38212r = (iM31601k / i16) + i15;
            this.f38211q += (long) ((length - iM31601k) / i16);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m31603m(int i13, int i14) {
        if (i13 == 0) {
            return;
        }
        AbstractC35849g.m113802d(this.f38215u >= i13);
        if (i14 == 2) {
            int i15 = this.f38214t;
            int i16 = this.f38215u;
            int i17 = i15 + i16;
            byte[] bArr = this.f38213s;
            if (i17 <= bArr.length) {
                System.arraycopy(bArr, i17 - i13, this.f38216v, 0, i13);
            } else {
                int length = i16 - (bArr.length - i15);
                if (length >= i13) {
                    System.arraycopy(bArr, length - i13, this.f38216v, 0, i13);
                } else {
                    int i18 = i13 - length;
                    System.arraycopy(bArr, bArr.length - i18, this.f38216v, 0, i18);
                    System.arraycopy(this.f38213s, 0, this.f38216v, i18, length);
                }
            }
        } else {
            int i19 = this.f38214t;
            int i24 = i19 + i13;
            byte[] bArr2 = this.f38213s;
            if (i24 <= bArr2.length) {
                System.arraycopy(bArr2, i19, this.f38216v, 0, i13);
            } else {
                int length2 = bArr2.length - i19;
                System.arraycopy(bArr2, i19, this.f38216v, 0, length2);
                System.arraycopy(this.f38213s, 0, this.f38216v, length2, i13 - length2);
            }
        }
        AbstractC35849g.m113803e(i13 % this.f38208n == 0, "sizeToOutput is not aligned to frame size: " + i13);
        AbstractC35849g.m113807i(this.f38214t < this.f38213s.length);
        byte[] bArr3 = this.f38216v;
        AbstractC35849g.m113803e(i13 % this.f38208n == 0, "byteOutput size is not aligned to frame size " + i13);
        if (i14 != 3) {
            for (int i25 = 0; i25 < i13; i25 += 2) {
                int i26 = i25 + 1;
                int i27 = (bArr3[i26] << 8) | (bArr3[i25] & 255);
                int i28 = this.f38205k;
                if (i14 == 0) {
                    i28 = ((((i25 * 1000) / (i13 - 1)) * (i28 - 100)) / 1000) + 100;
                } else if (i14 == 2) {
                    i28 += (((i25 * 1000) * (100 - i28)) / (i13 - 1)) / 1000;
                }
                int i29 = (i27 * i28) / 100;
                if (i29 >= 32767) {
                    bArr3[i25] = -1;
                    bArr3[i26] = 127;
                } else if (i29 <= -32768) {
                    bArr3[i25] = 0;
                    bArr3[i26] = -128;
                } else {
                    bArr3[i25] = (byte) (i29 & 255);
                    bArr3[i26] = (byte) (i29 >> 8);
                }
            }
        }
        m113439j(i13).put(bArr3, 0, i13).flip();
    }
}
