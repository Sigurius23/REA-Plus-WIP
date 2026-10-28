package p132f0;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import e93.AbstractC12889b;
import p005a3.AbstractC0233o;
import p005a3.C0238p0;
import p005a3.InterfaceC0245r;
import p181h2.C16620e;
import p208i2.AbstractC17876d;
import p270k2.C22128b;
import p291l0.InterfaceC22973k1;
import p512u2.C34462h0;

/* JADX INFO: renamed from: f0.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13802l0 extends AbstractC0233o implements InterfaceC0245r {

    /* JADX INFO: renamed from: Q */
    public final C13798k f49249Q;

    /* JADX INFO: renamed from: R */
    public final C13787g0 f49250R;

    /* JADX INFO: renamed from: S */
    public final InterfaceC22973k1 f49251S;

    public C13802l0(C34462h0 c34462h0, C13798k c13798k, C13787g0 c13787g0, InterfaceC22973k1 interfaceC22973k1) {
        this.f49249Q = c13798k;
        this.f49250R = c13787g0;
        this.f49251S = interfaceC22973k1;
        m665X0(c34462h0);
    }

    /* JADX INFO: renamed from: a1 */
    public static boolean m39170a1(float f13, long j7, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f13);
        canvas.translate(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        boolean zM39170a1;
        char c3;
        long j7;
        C22128b c22128b = c0238p0.f815w;
        long jMo731d = c22128b.mo731d();
        C13798k c13798k = this.f49249Q;
        c13798k.m39169i(jMo731d);
        if (C16620e.m47214f(c22128b.mo731d())) {
            c0238p0.m728a();
            return;
        }
        c0238p0.m728a();
        c13798k.f49236d.getValue();
        Canvas canvasM51433a = AbstractC17876d.m51433a(c22128b.f85852x.m716w());
        C13787g0 c13787g0 = this.f49250R;
        boolean zM39140f = C13787g0.m39140f(c13787g0.f49188f);
        InterfaceC22973k1 interfaceC22973k1 = this.f49251S;
        if (zM39140f) {
            zM39170a1 = m39170a1(270.0f, (((long) Float.floatToRawIntBits(c0238p0.mo743q0(interfaceC22973k1.mo43110b(c0238p0.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)))) << 32), c13787g0.m39144c(), canvasM51433a);
        } else {
            zM39170a1 = false;
        }
        if (C13787g0.m39140f(c13787g0.f49186d)) {
            c3 = ' ';
            j7 = 4294967295L;
            zM39170a1 = m39170a1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c0238p0.mo743q0(interfaceC22973k1.mo43112d()))) & 4294967295L), c13787g0.m39146e(), canvasM51433a) || zM39170a1;
        } else {
            c3 = ' ';
            j7 = 4294967295L;
        }
        if (C13787g0.m39140f(c13787g0.f49189g)) {
            zM39170a1 = m39170a1(90.0f, (((long) Float.floatToRawIntBits(c0238p0.mo743q0(interfaceC22973k1.mo43111c(c0238p0.getLayoutDirection())) + (-((float) AbstractC12889b.m36258X(Float.intBitsToFloat((int) (c22128b.mo731d() >> c3))))))) & j7) | (((long) Float.floatToRawIntBits(0.0f)) << c3), c13787g0.m39145d(), canvasM51433a) || zM39170a1;
        }
        if (C13787g0.m39140f(c13787g0.f49187e)) {
            EdgeEffect edgeEffectM39143b = c13787g0.m39143b();
            zM39170a1 = m39170a1(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c22128b.mo731d() & j7))) + c0238p0.mo743q0(interfaceC22973k1.mo43109a()))) & j7) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c22128b.mo731d() >> c3)))) << c3), edgeEffectM39143b, canvasM51433a) || zM39170a1;
        }
        if (zM39170a1) {
            c13798k.m39164d();
        }
    }
}
