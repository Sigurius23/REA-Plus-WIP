package q33;

import android.graphics.Rect;
import androidx.room.AbstractC1772c1;
import io.github.crow_misia.libyuv.Yuv;
import java.nio.ByteBuffer;
import l83.C23470p;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p715kotlin.NoWhenBranchMatchedException;
import r53.C30943d;
import r53.C30944e;
import r53.C30945f;
import r53.EnumC30946g;
import r53.RunnableC30940a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C29955c {

    /* JADX INFO: renamed from: a */
    public static final C23470p f122362a = AbstractC1772c1.m5382S(new C29955c(), "YuvFrame");

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX INFO: renamed from: a */
    public static C30944e m91640a(C30944e c30944e, int i13) {
        EnumC30946g enumC30946g;
        int iMin;
        int iMin2;
        int i14 = c30944e.f127677I;
        int i15 = c30944e.f127676H;
        if (i13 == -270) {
            enumC30946g = EnumC30946g.ROTATE_90;
        } else if (i13 == -180) {
            enumC30946g = EnumC30946g.ROTATE_180;
        } else if (i13 == -90) {
            enumC30946g = EnumC30946g.ROTATE_270;
        } else if (i13 == 90) {
            enumC30946g = EnumC30946g.ROTATE_90;
        } else if (i13 == 180) {
            enumC30946g = EnumC30946g.ROTATE_180;
        } else if (i13 != 270) {
            enumC30946g = EnumC30946g.ROTATE_0;
        } else {
            enumC30946g = EnumC30946g.ROTATE_270;
        }
        EnumC30946g enumC30946g2 = EnumC30946g.ROTATE_90;
        int i16 = (enumC30946g == enumC30946g2 || enumC30946g == EnumC30946g.ROTATE_270) ? i14 : i15;
        int i17 = (enumC30946g == enumC30946g2 || enumC30946g == EnumC30946g.ROTATE_270) ? i15 : i14;
        Rect rect = new Rect(0, 0, i16, i17);
        int i18 = (i16 + 1) >> 1;
        int i19 = ((i17 + 1) >> 1) * i18;
        ByteBuffer[] byteBufferArrM34085v = AbstractC12240d.m34085v(AbstractC37056f.m118959K(new C30943d(i16 * i17), new C30943d(i19), new C30943d(i19)));
        ByteBuffer byteBuffer = byteBufferArrM34085v[0];
        ByteBuffer byteBuffer2 = byteBufferArrM34085v[1];
        ByteBuffer byteBuffer3 = byteBufferArrM34085v[2];
        ByteBuffer byteBuffer4 = byteBufferArrM34085v[3];
        C30944e c30944e2 = new C30944e(byteBuffer4, new C30945f(i16, byteBuffer), new C30945f(i18, byteBuffer2), new C30945f(i18, byteBuffer3), i16, i17, rect, new RunnableC30940a(byteBuffer4, 1));
        Rect rect2 = c30944e.f127670y;
        Yuv yuv = Yuv.INSTANCE;
        C30945f c30945f = c30944e.f127673E;
        ByteBuffer byteBuffer5 = c30945f.f127679b;
        int i24 = c30945f.f127678a;
        int iM34262N = AbstractC12313p.m34262N(c30944e, 0);
        C30945f c30945f2 = c30944e.f127674F;
        ByteBuffer byteBuffer6 = c30945f2.f127679b;
        int i25 = c30945f2.f127678a;
        int iM34262N2 = AbstractC12313p.m34262N(c30944e, 1);
        C30945f c30945f3 = c30944e.f127675G;
        ByteBuffer byteBuffer7 = c30945f3.f127679b;
        int i26 = c30945f3.f127678a;
        int iM34262N3 = AbstractC12313p.m34262N(c30944e, 2);
        C30945f c30945f4 = c30944e2.f127673E;
        ByteBuffer byteBuffer8 = c30945f4.f127679b;
        int i27 = c30945f4.f127678a;
        int iM34262N4 = AbstractC12313p.m34262N(c30944e2, 0);
        C30945f c30945f5 = c30944e2.f127674F;
        ByteBuffer byteBuffer9 = c30945f5.f127679b;
        int i28 = c30945f5.f127678a;
        int iM34262N5 = AbstractC12313p.m34262N(c30944e2, 1);
        C30945f c30945f6 = c30944e2.f127675G;
        ByteBuffer byteBuffer10 = c30945f6.f127679b;
        int i29 = c30945f6.f127678a;
        int iM34262N6 = AbstractC12313p.m34262N(c30944e2, 2);
        int iOrdinal = enumC30946g.ordinal();
        if (iOrdinal == 0) {
            iMin = Math.min(rect2.width(), rect.width());
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    iMin = Math.min(rect2.width(), rect.width());
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            iMin = Math.min(rect2.width(), rect.height());
        }
        int i34 = iMin;
        int iOrdinal2 = enumC30946g.ordinal();
        if (iOrdinal2 == 0) {
            iMin2 = Math.min(rect2.height(), rect.height());
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    iMin2 = Math.min(rect2.height(), rect.height());
                } else if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            iMin2 = Math.min(rect2.height(), rect.width());
        }
        yuv.rotateI420Rotate(byteBuffer5, i24, iM34262N, byteBuffer6, i25, iM34262N2, byteBuffer7, i26, iM34262N3, byteBuffer8, i27, iM34262N4, byteBuffer9, i28, iM34262N5, byteBuffer10, i29, iM34262N6, i34, iMin2, enumC30946g.f127685w);
        return c30944e2;
    }
}
