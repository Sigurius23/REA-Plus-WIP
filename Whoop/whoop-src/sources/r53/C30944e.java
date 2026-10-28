package r53;

import android.graphics.Rect;
import io.github.crow_misia.libyuv.Yuv;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r53.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C30944e extends AbstractC30942c {

    /* JADX INFO: renamed from: E */
    public final C30945f f127673E;

    /* JADX INFO: renamed from: F */
    public final C30945f f127674F;

    /* JADX INFO: renamed from: G */
    public final C30945f f127675G;

    /* JADX INFO: renamed from: H */
    public final int f127676H;

    /* JADX INFO: renamed from: I */
    public final int f127677I;

    public C30944e(ByteBuffer byteBuffer, C30945f c30945f, C30945f c30945f2, C30945f c30945f3, int i13, int i14, Rect rect, RunnableC30940a runnableC30940a) {
        super(byteBuffer, rect, new C30945f[]{c30945f, c30945f2, c30945f3}, runnableC30940a);
        this.f127673E = c30945f;
        this.f127674F = c30945f2;
        this.f127675G = c30945f3;
        this.f127676H = i13;
        this.f127677I = i14;
    }

    @Override // r53.AbstractC30942c
    /* JADX INFO: renamed from: b */
    public final int mo95188b(int i13, int i14, int i15, int i16) {
        if (i13 == 0) {
            return (i14 * i16) + i15;
        }
        return (i14 * ((i16 + 1) >> 1)) + ((i15 + 1) >> 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m95190h(C30941b c30941b) {
        Rect rect = c30941b.f127670y;
        Rect rect2 = this.f127670y;
        int iWidth = rect2.width();
        Rect[] other = (Rect[]) Arrays.copyOf(new Rect[]{rect2, rect}, 2);
        AbstractC22676k.m65750j(other, "other");
        for (Rect rect3 : other) {
            iWidth = Math.min(iWidth, rect3.width());
        }
        Integer numValueOf = Integer.valueOf(iWidth);
        Rect[] rectArr = {rect2, rect};
        int iHeight = rect2.height();
        Rect[] other2 = (Rect[]) Arrays.copyOf(rectArr, 2);
        AbstractC22676k.m65750j(other2, "other");
        for (Rect rect4 : other2) {
            iHeight = Math.min(iHeight, rect4.height());
        }
        Integer numValueOf2 = Integer.valueOf(iHeight);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        Yuv yuv = Yuv.INSTANCE;
        C30945f c30945f = this.f127673E;
        ByteBuffer byteBuffer = c30945f.f127679b;
        int i13 = c30945f.f127678a;
        int iM34262N = AbstractC12313p.m34262N(this, 0);
        C30945f c30945f2 = this.f127674F;
        ByteBuffer byteBuffer2 = c30945f2.f127679b;
        int i14 = c30945f2.f127678a;
        int iM34262N2 = AbstractC12313p.m34262N(this, 1);
        C30945f c30945f3 = this.f127675G;
        ByteBuffer byteBuffer3 = c30945f3.f127679b;
        int i15 = c30945f3.f127678a;
        int iM34262N3 = AbstractC12313p.m34262N(this, 2);
        C30945f c30945f4 = c30941b.f127665E;
        yuv.convertI420ToABGR(byteBuffer, i13, iM34262N, byteBuffer2, i14, iM34262N2, byteBuffer3, i15, iM34262N3, c30945f4.f127679b, c30945f4.f127678a, AbstractC12313p.m34262N(c30941b, 0), iIntValue, iIntValue2);
    }
}
