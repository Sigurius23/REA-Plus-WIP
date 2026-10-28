package tm;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: tm.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C33946x extends AbstractC33935m {

    /* JADX INFO: renamed from: i */
    public final long f142310i = 150000;

    /* JADX INFO: renamed from: j */
    public final long f142311j = 20000;

    /* JADX INFO: renamed from: k */
    public final short f142312k = 1024;

    /* JADX INFO: renamed from: l */
    public int f142313l;

    /* JADX INFO: renamed from: m */
    public boolean f142314m;

    /* JADX INFO: renamed from: n */
    public byte[] f142315n;

    /* JADX INFO: renamed from: o */
    public byte[] f142316o;

    /* JADX INFO: renamed from: p */
    public int f142317p;

    /* JADX INFO: renamed from: q */
    public int f142318q;

    /* JADX INFO: renamed from: r */
    public int f142319r;

    /* JADX INFO: renamed from: s */
    public boolean f142320s;

    /* JADX INFO: renamed from: t */
    public long f142321t;

    public C33946x() {
        byte[] bArr = AbstractC24567y.f95880f;
        this.f142315n = bArr;
        this.f142316o = bArr;
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: b */
    public final void mo107335b(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f142224g.hasRemaining()) {
            int i13 = this.f142317p;
            if (i13 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f142315n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f142312k) {
                            int i14 = this.f142313l;
                            iPosition = AbstractC11266d.m30449c(iLimit2, i14, i14, i14);
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f142317p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    m107349j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f142320s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i13 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iM107380k = m107380k(byteBuffer);
                int iPosition2 = iM107380k - byteBuffer.position();
                byte[] bArr = this.f142315n;
                int length = bArr.length;
                int i15 = this.f142318q;
                int i16 = length - i15;
                if (iM107380k >= iLimit3 || iPosition2 >= i16) {
                    int iMin = Math.min(iPosition2, i16);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f142315n, this.f142318q, iMin);
                    int i17 = this.f142318q + iMin;
                    this.f142318q = i17;
                    byte[] bArr2 = this.f142315n;
                    if (i17 == bArr2.length) {
                        if (this.f142320s) {
                            m107381l(this.f142319r, bArr2);
                            this.f142321t += (long) ((this.f142318q - (this.f142319r * 2)) / this.f142313l);
                        } else {
                            this.f142321t += (long) ((i17 - this.f142319r) / this.f142313l);
                        }
                        m107382m(byteBuffer, this.f142315n, this.f142318q);
                        this.f142318q = 0;
                        this.f142317p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    m107381l(i15, bArr);
                    this.f142318q = 0;
                    this.f142317p = 0;
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iM107380k2 = m107380k(byteBuffer);
                byteBuffer.limit(iM107380k2);
                this.f142321t += (long) (byteBuffer.remaining() / this.f142313l);
                m107382m(byteBuffer, this.f142316o, this.f142319r);
                if (iM107380k2 < iLimit4) {
                    m107381l(this.f142319r, this.f142316o);
                    this.f142317p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: f */
    public final C33929g mo107337f(C33929g c33929g) throws AudioProcessor$UnhandledAudioFormatException {
        if (c33929g.f142177c == 2) {
            return this.f142314m ? c33929g : C33929g.f142174e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c33929g);
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: g */
    public final void mo107338g() {
        if (this.f142314m) {
            C33929g c33929g = this.f142219b;
            int i13 = c33929g.f142178d;
            this.f142313l = i13;
            int i14 = c33929g.f142175a;
            int i15 = ((int) ((this.f142310i * ((long) i14)) / 1000000)) * i13;
            if (this.f142315n.length != i15) {
                this.f142315n = new byte[i15];
            }
            int i16 = ((int) ((this.f142311j * ((long) i14)) / 1000000)) * i13;
            this.f142319r = i16;
            if (this.f142316o.length != i16) {
                this.f142316o = new byte[i16];
            }
        }
        this.f142317p = 0;
        this.f142321t = 0L;
        this.f142318q = 0;
        this.f142320s = false;
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: h */
    public final void mo107339h() {
        int i13 = this.f142318q;
        if (i13 > 0) {
            m107381l(i13, this.f142315n);
        }
        if (this.f142320s) {
            return;
        }
        this.f142321t += (long) (this.f142319r / this.f142313l);
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: i */
    public final void mo107340i() {
        this.f142314m = false;
        this.f142319r = 0;
        byte[] bArr = AbstractC24567y.f95880f;
        this.f142315n = bArr;
        this.f142316o = bArr;
    }

    @Override // tm.AbstractC33935m, tm.InterfaceC33930h
    public final boolean isActive() {
        return this.f142314m;
    }

    /* JADX INFO: renamed from: k */
    public final int m107380k(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f142312k) {
                int i13 = this.f142313l;
                return (iPosition / i13) * i13;
            }
        }
        return byteBuffer.limit();
    }

    /* JADX INFO: renamed from: l */
    public final void m107381l(int i13, byte[] bArr) {
        m107349j(i13).put(bArr, 0, i13).flip();
        if (i13 > 0) {
            this.f142320s = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m107382m(ByteBuffer byteBuffer, byte[] bArr, int i13) {
        int iMin = Math.min(byteBuffer.remaining(), this.f142319r);
        int i14 = this.f142319r - iMin;
        System.arraycopy(bArr, i13 - i14, this.f142316o, 0, i14);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f142316o, i14, iMin);
    }
}
