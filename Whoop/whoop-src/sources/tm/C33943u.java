package tm;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: tm.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C33943u extends AbstractC33935m {

    /* JADX INFO: renamed from: i */
    public static final int f142298i = Float.floatToIntBits(Float.NaN);

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: b */
    public final void mo107335b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM107349j;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        int i14 = this.f142219b.f142177c;
        int i15 = f142298i;
        if (i14 == 536870912) {
            byteBufferM107349j = m107349j((i13 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i15) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferM107349j.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i14 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferM107349j = m107349j(i13);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i15) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferM107349j.putInt(iFloatToIntBits2);
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
        if (i13 == 536870912 || i13 == 805306368 || i13 == 4) {
            return i13 != 4 ? new C33929g(c33929g.f142175a, c33929g.f142176b, 4) : C33929g.f142174e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c33929g);
    }
}
