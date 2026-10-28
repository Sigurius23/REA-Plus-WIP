package p523uh;

import java.nio.ByteBuffer;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26633p0;

/* JADX INFO: renamed from: uh.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34956b implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final ByteBuffer f147922w;

    /* JADX INFO: renamed from: x */
    public final int f147923x;

    public C34956b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f147922w = byteBufferSlice;
        this.f147923x = byteBufferSlice.capacity();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h c26616h, long j7) {
        ByteBuffer byteBuffer = this.f147922w;
        int iPosition = byteBuffer.position();
        int i13 = this.f147923x;
        if (iPosition == i13) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j7);
        if (iPosition2 <= i13) {
            i13 = iPosition2;
        }
        byteBuffer.limit(i13);
        return c26616h.write(byteBuffer);
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }
}
