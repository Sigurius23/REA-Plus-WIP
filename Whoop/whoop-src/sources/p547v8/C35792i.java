package p547v8;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: v8.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C35792i extends AbstractC35789f {
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: b */
    public final void mo31596b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        int i14 = this.f152199b.f152196c;
        if (i14 == 3) {
            i13 *= 2;
        } else if (i14 == 4) {
            i13 /= 2;
        } else {
            if (i14 != 21) {
                if (i14 == 22) {
                    i13 /= 2;
                } else if (i14 != 268435456) {
                    if (i14 != 1342177280) {
                        if (i14 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i13 /= 2;
                    }
                }
            }
            i13 /= 3;
            i13 *= 2;
        }
        ByteBuffer byteBufferM113439j = m113439j(i13);
        int i15 = this.f152199b.f152196c;
        if (i15 == 3) {
            while (iPosition < iLimit) {
                byteBufferM113439j.put((byte) 0);
                byteBufferM113439j.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i15 == 4) {
            while (iPosition < iLimit) {
                short sM121913f = (short) (AbstractC38065t.m121913f(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM113439j.put((byte) (sM121913f & 255));
                byteBufferM113439j.put((byte) ((sM121913f >> 8) & 255));
                iPosition += 4;
            }
        } else if (i15 == 21) {
            while (iPosition < iLimit) {
                byteBufferM113439j.put(byteBuffer.get(iPosition + 1));
                byteBufferM113439j.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i15 == 22) {
            while (iPosition < iLimit) {
                byteBufferM113439j.put(byteBuffer.get(iPosition + 2));
                byteBufferM113439j.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i15 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM113439j.put(byteBuffer.get(iPosition + 1));
                byteBufferM113439j.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i15 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM113439j.put(byteBuffer.get(iPosition + 1));
                byteBufferM113439j.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i15 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM113439j.put(byteBuffer.get(iPosition + 1));
                byteBufferM113439j.put(byteBuffer.get(iPosition));
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
        if (i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4) {
            return i13 != 2 ? new C35787d(c35787d.f152194a, c35787d.f152195b, 2) : C35787d.f152193e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c35787d);
    }
}
