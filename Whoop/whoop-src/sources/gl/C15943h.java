package gl;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p618xk.InterfaceC38416g;

/* JADX INFO: renamed from: gl.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C15943h implements InterfaceC15944i, InterfaceC38416g {

    /* JADX INFO: renamed from: w */
    public final ByteBuffer f60351w;

    public C15943h(byte[] bArr, int i13) {
        this.f60351w = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i13);
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: a */
    public void mo40832a() {
    }

    /* JADX INFO: renamed from: b */
    public short m44999b(int i13) {
        ByteBuffer byteBuffer = this.f60351w;
        if (byteBuffer.remaining() - i13 >= 2) {
            return byteBuffer.getShort(i13);
        }
        return (short) -1;
    }

    @Override // gl.InterfaceC15944i
    /* JADX INFO: renamed from: c */
    public int mo35230c() {
        return (mo35234h() << 8) | mo35234h();
    }

    /* JADX INFO: renamed from: d */
    public int m45000d(int i13) {
        ByteBuffer byteBuffer = this.f60351w;
        if (byteBuffer.remaining() - i13 >= 4) {
            return byteBuffer.getInt(i13);
        }
        return -1;
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: e */
    public Object mo40834e() {
        ByteBuffer byteBuffer = this.f60351w;
        byteBuffer.position(0);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: f */
    public int m45001f() {
        return this.f60351w.remaining();
    }

    /* JADX INFO: renamed from: g */
    public void m45002g(ByteOrder byteOrder) {
        this.f60351w.order(byteOrder);
    }

    @Override // gl.InterfaceC15944i
    /* JADX INFO: renamed from: h */
    public short mo35234h() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.f60351w;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // gl.InterfaceC15944i
    public long skip(long j7) {
        ByteBuffer byteBuffer = this.f60351w;
        int iMin = (int) Math.min(byteBuffer.remaining(), j7);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C15943h(ByteBuffer byteBuffer, int i13) {
        switch (i13) {
            case 2:
                this.f60351w = byteBuffer;
                break;
            default:
                this.f60351w = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }
}
