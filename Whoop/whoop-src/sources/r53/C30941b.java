package r53;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C30941b extends AbstractC30942c {

    /* JADX INFO: renamed from: E */
    public final C30945f f127665E;

    /* JADX INFO: renamed from: F */
    public final int f127666F;

    /* JADX INFO: renamed from: G */
    public final int f127667G;

    public C30941b(ByteBuffer byteBuffer, C30945f c30945f, int i13, int i14, Rect rect, RunnableC30940a runnableC30940a) {
        super(byteBuffer, rect, new C30945f[]{c30945f}, runnableC30940a);
        this.f127665E = c30945f;
        this.f127666F = i13;
        this.f127667G = i14;
    }

    @Override // r53.AbstractC30942c
    /* JADX INFO: renamed from: b */
    public final int mo95188b(int i13, int i14, int i15, int i16) {
        return (i14 * i16) + (i15 << 2);
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m95189h() {
        ByteBuffer byteBufferAllocateDirect = this.f127668w;
        if (byteBufferAllocateDirect != null) {
            byteBufferAllocateDirect.position(0);
        } else {
            int iLimit = 0;
            for (C30945f c30945f : this.f127669x) {
                iLimit += c30945f.f127679b.limit();
            }
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iLimit);
            this.f127668w = byteBufferAllocateDirect;
            AbstractC22676k.m65747g(byteBufferAllocateDirect);
            for (C30945f c30945f2 : this.f127669x) {
                ByteBuffer byteBuffer = c30945f2.f127679b;
                byteBuffer.position(0);
                byteBufferAllocateDirect.put(byteBuffer);
            }
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        AbstractC22676k.m65750j(config, "config");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f127666F, this.f127667G, config);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        byteBufferAllocateDirect.position(0);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        return bitmapCreateBitmap;
    }
}
