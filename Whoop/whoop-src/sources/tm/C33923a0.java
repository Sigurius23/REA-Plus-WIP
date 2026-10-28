package tm;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: tm.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33923a0 extends AbstractC33935m {

    /* JADX INFO: renamed from: i */
    public int f142155i;

    /* JADX INFO: renamed from: j */
    public int f142156j;

    /* JADX INFO: renamed from: k */
    public boolean f142157k;

    /* JADX INFO: renamed from: l */
    public int f142158l;

    /* JADX INFO: renamed from: m */
    public byte[] f142159m;

    /* JADX INFO: renamed from: n */
    public int f142160n;

    /* JADX INFO: renamed from: o */
    public long f142161o;

    @Override // tm.AbstractC33935m, tm.InterfaceC33930h
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo107334a() {
        int i13;
        if (super.mo107336d() && (i13 = this.f142160n) > 0) {
            m107349j(i13).put(this.f142159m, 0, this.f142160n).flip();
            this.f142160n = 0;
        }
        return super.mo107334a();
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: b */
    public final void mo107335b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        if (i13 == 0) {
            return;
        }
        int iMin = Math.min(i13, this.f142158l);
        this.f142161o += (long) (iMin / this.f142219b.f142178d);
        this.f142158l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f142158l > 0) {
            return;
        }
        int i14 = i13 - iMin;
        int length = (this.f142160n + i14) - this.f142159m.length;
        ByteBuffer byteBufferM107349j = m107349j(length);
        int iM71677h = AbstractC24567y.m71677h(length, 0, this.f142160n);
        byteBufferM107349j.put(this.f142159m, 0, iM71677h);
        int iM71677h2 = AbstractC24567y.m71677h(length - iM71677h, 0, i14);
        byteBuffer.limit(byteBuffer.position() + iM71677h2);
        byteBufferM107349j.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i15 = i14 - iM71677h2;
        int i16 = this.f142160n - iM71677h;
        this.f142160n = i16;
        byte[] bArr = this.f142159m;
        System.arraycopy(bArr, iM71677h, bArr, 0, i16);
        byteBuffer.get(this.f142159m, this.f142160n, i15);
        this.f142160n += i15;
        byteBufferM107349j.flip();
    }

    @Override // tm.AbstractC33935m, tm.InterfaceC33930h
    /* JADX INFO: renamed from: d */
    public final boolean mo107336d() {
        return super.mo107336d() && this.f142160n == 0;
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: f */
    public final C33929g mo107337f(C33929g c33929g) throws AudioProcessor$UnhandledAudioFormatException {
        if (c33929g.f142177c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(c33929g);
        }
        this.f142157k = true;
        return (this.f142155i == 0 && this.f142156j == 0) ? C33929g.f142174e : c33929g;
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: g */
    public final void mo107338g() {
        if (this.f142157k) {
            this.f142157k = false;
            int i13 = this.f142156j;
            int i14 = this.f142219b.f142178d;
            this.f142159m = new byte[i13 * i14];
            this.f142158l = this.f142155i * i14;
        }
        this.f142160n = 0;
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: h */
    public final void mo107339h() {
        if (this.f142157k) {
            int i13 = this.f142160n;
            if (i13 > 0) {
                this.f142161o += (long) (i13 / this.f142219b.f142178d);
            }
            this.f142160n = 0;
        }
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: i */
    public final void mo107340i() {
        this.f142159m = AbstractC24567y.f95880f;
    }
}
