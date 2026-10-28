package p208i2;

import android.graphics.Path;
import android.graphics.RectF;
import p181h2.C16618c;
import p181h2.C16619d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.s0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC17910s0 {
    /* JADX INFO: renamed from: a */
    static void m51495a(InterfaceC17910s0 interfaceC17910s0, C16618c c16618c) {
        EnumC17908r0 enumC17908r0 = EnumC17908r0.f69610w;
        C17891j c17891j = (C17891j) interfaceC17910s0;
        c17891j.getClass();
        C17891j.m51456n(c16618c);
        if (c17891j.f69588b == null) {
            c17891j.f69588b = new RectF();
        }
        RectF rectF = c17891j.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(c16618c.f63939a, c16618c.f63940b, c16618c.f63941c, c16618c.f63942d);
        Path path = c17891j.f69587a;
        RectF rectF2 = c17891j.f69588b;
        AbstractC22676k.m65747g(rectF2);
        path.addRect(rectF2, AbstractC17897m.m51479b(enumC17908r0));
    }

    /* JADX INFO: renamed from: b */
    static void m51496b(InterfaceC17910s0 interfaceC17910s0, C16619d c16619d) {
        EnumC17908r0 enumC17908r0 = EnumC17908r0.f69610w;
        C17891j c17891j = (C17891j) interfaceC17910s0;
        if (c17891j.f69588b == null) {
            c17891j.f69588b = new RectF();
        }
        RectF rectF = c17891j.f69588b;
        AbstractC22676k.m65747g(rectF);
        float f13 = c16619d.f63943a;
        long j7 = c16619d.f63950h;
        long j13 = c16619d.f63949g;
        long j14 = c16619d.f63948f;
        long j15 = c16619d.f63947e;
        rectF.set(f13, c16619d.f63944b, c16619d.f63945c, c16619d.f63946d);
        if (c17891j.f69589c == null) {
            c17891j.f69589c = new float[8];
        }
        float[] fArr = c17891j.f69589c;
        AbstractC22676k.m65747g(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j15 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j15 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j14 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j14 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j13 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        Path path = c17891j.f69587a;
        RectF rectF2 = c17891j.f69588b;
        AbstractC22676k.m65747g(rectF2);
        float[] fArr2 = c17891j.f69589c;
        AbstractC22676k.m65747g(fArr2);
        path.addRoundRect(rectF2, fArr2, AbstractC17897m.m51479b(enumC17908r0));
    }
}
