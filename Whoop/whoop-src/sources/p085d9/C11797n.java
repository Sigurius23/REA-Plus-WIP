package p085d9;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p547v8.AbstractC35789f;
import p547v8.C35787d;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: d9.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C11797n extends AbstractC35789f {

    /* JADX INFO: renamed from: i */
    public int[] f38297i;

    /* JADX INFO: renamed from: j */
    public int[] f38298j;

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: b */
    public final void mo31596b(ByteBuffer byteBuffer) {
        int[] iArr = this.f38298j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM113439j = m113439j(((iLimit - iPosition) / this.f152199b.f152197d) * this.f152200c.f152197d);
        while (iPosition < iLimit) {
            for (int i13 : iArr) {
                int iM121925r = (AbstractC38065t.m121925r(this.f152199b.f152196c) * i13) + iPosition;
                int i14 = this.f152199b.f152196c;
                if (i14 == 2) {
                    byteBufferM113439j.putShort(byteBuffer.getShort(iM121925r));
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f152199b.f152196c);
                    }
                    byteBufferM113439j.putFloat(byteBuffer.getFloat(iM121925r));
                }
            }
            iPosition += this.f152199b.f152197d;
        }
        byteBuffer.position(iLimit);
        byteBufferM113439j.flip();
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: f */
    public final C35787d mo31597f(C35787d c35787d) throws AudioProcessor$UnhandledAudioFormatException {
        int i13 = c35787d.f152196c;
        int[] iArr = this.f38297i;
        if (iArr == null) {
            return C35787d.f152193e;
        }
        int i14 = c35787d.f152195b;
        if (i13 != 2 && i13 != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(c35787d);
        }
        boolean z4 = i14 != iArr.length;
        int i15 = 0;
        while (i15 < iArr.length) {
            int i16 = iArr[i15];
            if (i16 >= i14) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c35787d);
            }
            z4 |= i16 != i15;
            i15++;
        }
        return z4 ? new C35787d(c35787d.f152194a, iArr.length, i13) : C35787d.f152193e;
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: g */
    public final void mo31598g() {
        this.f38298j = this.f38297i;
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: i */
    public final void mo31600i() {
        this.f38298j = null;
        this.f38297i = null;
    }
}
