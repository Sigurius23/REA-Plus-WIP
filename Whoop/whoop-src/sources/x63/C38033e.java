package x63;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x63.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C38033e extends AbstractC38032d {

    /* JADX INFO: renamed from: F */
    public final int f162940F;

    public C38033e(int i13, int i14) {
        super(i13);
        this.f162940F = i14;
    }

    @Override // x63.AbstractC38032d
    /* JADX INFO: renamed from: i */
    public final Object mo113260i(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // x63.AbstractC38032d
    /* JADX INFO: renamed from: m */
    public final Object mo55798m() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f162940F);
        AbstractC22676k.m65747g(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // x63.AbstractC38032d
    /* JADX INFO: renamed from: x */
    public final void mo113261x(Object obj) {
        ByteBuffer instance = (ByteBuffer) obj;
        AbstractC22676k.m65750j(instance, "instance");
        if (instance.capacity() != this.f162940F) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
