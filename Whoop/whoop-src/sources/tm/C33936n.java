package tm;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: tm.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C33936n extends AbstractC33935m {

    /* JADX INFO: renamed from: i */
    public int[] f142226i;

    /* JADX INFO: renamed from: j */
    public int[] f142227j;

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: b */
    public final void mo107335b(ByteBuffer byteBuffer) {
        int[] iArr = this.f142227j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM107349j = m107349j(((iLimit - iPosition) / this.f142219b.f142178d) * this.f142220c.f142178d);
        while (iPosition < iLimit) {
            for (int i13 : iArr) {
                byteBufferM107349j.putShort(byteBuffer.getShort((i13 * 2) + iPosition));
            }
            iPosition += this.f142219b.f142178d;
        }
        byteBuffer.position(iLimit);
        byteBufferM107349j.flip();
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: f */
    public final C33929g mo107337f(C33929g c33929g) throws AudioProcessor$UnhandledAudioFormatException {
        int[] iArr = this.f142226i;
        if (iArr == null) {
            return C33929g.f142174e;
        }
        int i13 = c33929g.f142177c;
        int i14 = c33929g.f142176b;
        if (i13 != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(c33929g);
        }
        boolean z4 = i14 != iArr.length;
        int i15 = 0;
        while (i15 < iArr.length) {
            int i16 = iArr[i15];
            if (i16 >= i14) {
                throw new AudioProcessor$UnhandledAudioFormatException(c33929g);
            }
            z4 |= i16 != i15;
            i15++;
        }
        return z4 ? new C33929g(c33929g.f142175a, iArr.length, 2) : C33929g.f142174e;
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: g */
    public final void mo107338g() {
        this.f142227j = this.f142226i;
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: i */
    public final void mo107340i() {
        this.f142227j = null;
        this.f142226i = null;
    }
}
