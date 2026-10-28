package p085d9;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p547v8.AbstractC35789f;
import p547v8.C35787d;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: d9.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11788e0 extends AbstractC35789f {

    /* JADX INFO: renamed from: i */
    public int f38223i;

    /* JADX INFO: renamed from: j */
    public int f38224j;

    /* JADX INFO: renamed from: k */
    public boolean f38225k;

    /* JADX INFO: renamed from: l */
    public int f38226l;

    /* JADX INFO: renamed from: m */
    public byte[] f38227m;

    /* JADX INFO: renamed from: n */
    public int f38228n;

    /* JADX INFO: renamed from: o */
    public long f38229o;

    @Override // p547v8.AbstractC35789f, p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo31606a() {
        int i13;
        if (super.mo31607d() && (i13 = this.f38228n) > 0) {
            m113439j(i13).put(this.f38227m, 0, this.f38228n).flip();
            this.f38228n = 0;
        }
        return super.mo31606a();
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: b */
    public final void mo31596b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        if (i13 == 0) {
            return;
        }
        int iMin = Math.min(i13, this.f38226l);
        this.f38229o += (long) (iMin / this.f152199b.f152197d);
        this.f38226l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f38226l > 0) {
            return;
        }
        int i14 = i13 - iMin;
        int length = (this.f38228n + i14) - this.f38227m.length;
        ByteBuffer byteBufferM113439j = m113439j(length);
        int iM121914g = AbstractC38065t.m121914g(length, 0, this.f38228n);
        byteBufferM113439j.put(this.f38227m, 0, iM121914g);
        int iM121914g2 = AbstractC38065t.m121914g(length - iM121914g, 0, i14);
        byteBuffer.limit(byteBuffer.position() + iM121914g2);
        byteBufferM113439j.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i15 = i14 - iM121914g2;
        int i16 = this.f38228n - iM121914g;
        this.f38228n = i16;
        byte[] bArr = this.f38227m;
        System.arraycopy(bArr, iM121914g, bArr, 0, i16);
        byteBuffer.get(this.f38227m, this.f38228n, i15);
        this.f38228n += i15;
        byteBufferM113439j.flip();
    }

    @Override // p547v8.AbstractC35789f, p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: d */
    public final boolean mo31607d() {
        return super.mo31607d() && this.f38228n == 0;
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: f */
    public final C35787d mo31597f(C35787d c35787d) throws AudioProcessor$UnhandledAudioFormatException {
        int i13 = c35787d.f152196c;
        if (i13 != 2 && i13 != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(c35787d);
        }
        this.f38225k = true;
        return (this.f38223i == 0 && this.f38224j == 0) ? C35787d.f152193e : c35787d;
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: g */
    public final void mo31598g() {
        if (this.f38225k) {
            this.f38225k = false;
            int i13 = this.f38224j;
            int i14 = this.f152199b.f152197d;
            this.f38227m = new byte[i13 * i14];
            this.f38226l = this.f38223i * i14;
        }
        this.f38228n = 0;
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: h */
    public final void mo31599h() {
        if (this.f38225k) {
            int i13 = this.f38228n;
            if (i13 > 0) {
                this.f38229o += (long) (i13 / this.f152199b.f152197d);
            }
            this.f38228n = 0;
        }
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: i */
    public final void mo31600i() {
        this.f38227m = AbstractC38065t.f163033c;
    }
}
