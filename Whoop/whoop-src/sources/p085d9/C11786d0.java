package p085d9;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p547v8.AbstractC35789f;
import p547v8.C35787d;

/* JADX INFO: renamed from: d9.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11786d0 extends AbstractC35789f {

    /* JADX INFO: renamed from: i */
    public static final int f38220i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: k */
    public static void m31604k(int i13, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i13) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f38220i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: b */
    public final void mo31596b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM113439j;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        int i14 = this.f152199b.f152196c;
        if (i14 == 21) {
            byteBufferM113439j = m113439j((i13 / 3) * 4);
            while (iPosition < iLimit) {
                m31604k(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM113439j);
                iPosition += 3;
            }
        } else if (i14 == 22) {
            byteBufferM113439j = m113439j(i13);
            while (iPosition < iLimit) {
                m31604k((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM113439j);
                iPosition += 4;
            }
        } else if (i14 == 1342177280) {
            byteBufferM113439j = m113439j((i13 / 3) * 4);
            while (iPosition < iLimit) {
                m31604k(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM113439j);
                iPosition += 3;
            }
        } else {
            if (i14 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM113439j = m113439j(i13);
            while (iPosition < iLimit) {
                m31604k((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM113439j);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM113439j.flip();
    }

    @Override // p547v8.AbstractC35789f
    /* JADX INFO: renamed from: f */
    public final C35787d mo31597f(C35787d c35787d) throws AudioProcessor$UnhandledAudioFormatException {
        int i13 = c35787d.f152196c;
        if (i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4) {
            return i13 != 4 ? new C35787d(c35787d.f152194a, c35787d.f152195b, 4) : C35787d.f152193e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c35787d);
    }
}
