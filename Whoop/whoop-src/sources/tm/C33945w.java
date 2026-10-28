package tm;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: tm.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C33945w extends AbstractC33935m {
    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: b */
    public final void mo107335b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        int i14 = this.f142219b.f142177c;
        if (i14 == 3) {
            i13 *= 2;
        } else if (i14 == 4) {
            i13 /= 2;
        } else if (i14 != 268435456) {
            if (i14 != 536870912) {
                if (i14 != 805306368) {
                    throw new IllegalStateException();
                }
                i13 /= 2;
            } else {
                i13 /= 3;
                i13 *= 2;
            }
        }
        ByteBuffer byteBufferM107349j = m107349j(i13);
        int i15 = this.f142219b.f142177c;
        if (i15 == 3) {
            while (iPosition < iLimit) {
                byteBufferM107349j.put((byte) 0);
                byteBufferM107349j.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i15 == 4) {
            while (iPosition < iLimit) {
                short sM71676g = (short) (AbstractC24567y.m71676g(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM107349j.put((byte) (sM71676g & 255));
                byteBufferM107349j.put((byte) ((sM71676g >> 8) & 255));
                iPosition += 4;
            }
        } else if (i15 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM107349j.put(byteBuffer.get(iPosition + 1));
                byteBufferM107349j.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i15 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferM107349j.put(byteBuffer.get(iPosition + 1));
                byteBufferM107349j.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i15 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM107349j.put(byteBuffer.get(iPosition + 2));
                byteBufferM107349j.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM107349j.flip();
    }

    @Override // tm.AbstractC33935m
    /* JADX INFO: renamed from: f */
    public final C33929g mo107337f(C33929g c33929g) throws AudioProcessor$UnhandledAudioFormatException {
        int i13 = c33929g.f142177c;
        if (i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 536870912 || i13 == 805306368 || i13 == 4) {
            return i13 != 2 ? new C33929g(c33929g.f142175a, c33929g.f142176b, 2) : C33929g.f142174e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c33929g);
    }
}
