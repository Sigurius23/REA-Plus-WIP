package p132f0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.support.v4.media.session.AbstractC1079m;
import android.widget.EdgeEffect;
import e93.AbstractC12889b;
import p005a3.AbstractC0233o;
import p005a3.C0237p;
import p005a3.C0238p0;
import p005a3.InterfaceC0245r;
import p014aj.C0929d;
import p095dp.AbstractC12240d;
import p180h0.EnumC16377d2;
import p181h2.C16620e;
import p208i2.AbstractC17876d;
import p208i2.C17873c;
import p208i2.InterfaceC17915v;
import p270k2.C22127a;
import p270k2.C22128b;
import p293l2.C23226c;
import p512u2.C34462h0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: f0.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13827t1 extends AbstractC0233o implements InterfaceC0245r {

    /* JADX INFO: renamed from: Q */
    public final C13798k f49347Q;

    /* JADX INFO: renamed from: R */
    public final C13787g0 f49348R;

    /* JADX INFO: renamed from: S */
    public RenderNode f49349S;

    public C13827t1(C34462h0 c34462h0, C13798k c13798k, C13787g0 c13787g0) {
        this.f49347Q = c13798k;
        this.f49348R = c13787g0;
        m665X0(c34462h0);
    }

    /* JADX INFO: renamed from: a1 */
    public static boolean m39190a1(float f13, EdgeEffect edgeEffect, Canvas canvas) {
        if (f13 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f13);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        boolean zM39190a1;
        char c3;
        C22128b c22128b = c0238p0.f815w;
        long jMo731d = c22128b.mo731d();
        C13798k c13798k = this.f49347Q;
        c13798k.m39169i(jMo731d);
        Canvas canvasM51433a = AbstractC17876d.m51433a(c22128b.f85852x.m716w());
        c13798k.f49236d.getValue();
        if (C16620e.m47214f(c22128b.mo731d())) {
            c0238p0.m728a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasM51433a.isHardwareAccelerated();
        C13787g0 c13787g0 = this.f49348R;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = c13787g0.f49186d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = c13787g0.f49187e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = c13787g0.f49188f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = c13787g0.f49189g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = c13787g0.f49190h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = c13787g0.f49191i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = c13787g0.f49192j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = c13787g0.f49193k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            c0238p0.m728a();
            return;
        }
        float fMo743q0 = c0238p0.mo743q0(AbstractC13837y.f49372a);
        boolean z4 = C13787g0.m39140f(c13787g0.f49186d) || C13787g0.m39141g(c13787g0.f49190h) || C13787g0.m39140f(c13787g0.f49187e) || C13787g0.m39141g(c13787g0.f49191i);
        boolean z13 = C13787g0.m39140f(c13787g0.f49188f) || C13787g0.m39141g(c13787g0.f49192j) || C13787g0.m39140f(c13787g0.f49189g) || C13787g0.m39141g(c13787g0.f49193k);
        if (z4 && z13) {
            m39191b1().setPosition(0, 0, canvasM51433a.getWidth(), canvasM51433a.getHeight());
        } else if (z4) {
            m39191b1().setPosition(0, 0, (AbstractC12889b.m36258X(fMo743q0) * 2) + canvasM51433a.getWidth(), canvasM51433a.getHeight());
        } else {
            if (!z13) {
                c0238p0.m728a();
                return;
            }
            m39191b1().setPosition(0, 0, canvasM51433a.getWidth(), (AbstractC12889b.m36258X(fMo743q0) * 2) + canvasM51433a.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = m39191b1().beginRecording();
        if (C13787g0.m39141g(c13787g0.f49192j)) {
            EdgeEffect edgeEffectM39142a = c13787g0.f49192j;
            if (edgeEffectM39142a == null) {
                edgeEffectM39142a = c13787g0.m39142a(EnumC16377d2.f62972x);
                c13787g0.f49192j = edgeEffectM39142a;
            }
            m39190a1(90.0f, edgeEffectM39142a, recordingCanvasBeginRecording);
            edgeEffectM39142a.finish();
        }
        if (C13787g0.m39140f(c13787g0.f49188f)) {
            EdgeEffect edgeEffectM39144c = c13787g0.m39144c();
            zM39190a1 = m39190a1(270.0f, edgeEffectM39144c, recordingCanvasBeginRecording);
            if (C13787g0.m39141g(c13787g0.f49188f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c13798k.m39163c() & 4294967295L));
                EdgeEffect edgeEffectM39142a2 = c13787g0.f49192j;
                if (edgeEffectM39142a2 == null) {
                    edgeEffectM39142a2 = c13787g0.m39142a(EnumC16377d2.f62972x);
                    c13787g0.f49192j = edgeEffectM39142a2;
                }
                AbstractC12240d.m34052R(edgeEffectM39142a2, AbstractC12240d.m34041G(edgeEffectM39144c), 1 - fIntBitsToFloat);
            }
        } else {
            zM39190a1 = false;
        }
        if (C13787g0.m39141g(c13787g0.f49190h)) {
            EdgeEffect edgeEffectM39142a3 = c13787g0.f49190h;
            if (edgeEffectM39142a3 == null) {
                edgeEffectM39142a3 = c13787g0.m39142a(EnumC16377d2.f62971w);
                c13787g0.f49190h = edgeEffectM39142a3;
            }
            m39190a1(180.0f, edgeEffectM39142a3, recordingCanvasBeginRecording);
            edgeEffectM39142a3.finish();
        }
        if (C13787g0.m39140f(c13787g0.f49186d)) {
            EdgeEffect edgeEffectM39146e = c13787g0.m39146e();
            zM39190a1 = m39190a1(0.0f, edgeEffectM39146e, recordingCanvasBeginRecording) || zM39190a1;
            c3 = ' ';
            if (C13787g0.m39141g(c13787g0.f49186d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c13798k.m39163c() >> 32));
                EdgeEffect edgeEffectM39142a4 = c13787g0.f49190h;
                if (edgeEffectM39142a4 == null) {
                    edgeEffectM39142a4 = c13787g0.m39142a(EnumC16377d2.f62971w);
                    c13787g0.f49190h = edgeEffectM39142a4;
                }
                AbstractC12240d.m34052R(edgeEffectM39142a4, AbstractC12240d.m34041G(edgeEffectM39146e), fIntBitsToFloat2);
            }
        } else {
            c3 = ' ';
        }
        if (C13787g0.m39141g(c13787g0.f49193k)) {
            EdgeEffect edgeEffectM39142a5 = c13787g0.f49193k;
            if (edgeEffectM39142a5 == null) {
                edgeEffectM39142a5 = c13787g0.m39142a(EnumC16377d2.f62972x);
                c13787g0.f49193k = edgeEffectM39142a5;
            }
            m39190a1(270.0f, edgeEffectM39142a5, recordingCanvasBeginRecording);
            edgeEffectM39142a5.finish();
        }
        if (C13787g0.m39140f(c13787g0.f49189g)) {
            EdgeEffect edgeEffectM39145d = c13787g0.m39145d();
            zM39190a1 = m39190a1(90.0f, edgeEffectM39145d, recordingCanvasBeginRecording) || zM39190a1;
            if (C13787g0.m39141g(c13787g0.f49189g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c13798k.m39163c() & 4294967295L));
                EdgeEffect edgeEffectM39142a6 = c13787g0.f49193k;
                if (edgeEffectM39142a6 == null) {
                    edgeEffectM39142a6 = c13787g0.m39142a(EnumC16377d2.f62972x);
                    c13787g0.f49193k = edgeEffectM39142a6;
                }
                AbstractC12240d.m34052R(edgeEffectM39142a6, AbstractC12240d.m34041G(edgeEffectM39145d), fIntBitsToFloat3);
            }
        }
        if (C13787g0.m39141g(c13787g0.f49191i)) {
            EdgeEffect edgeEffectM39142a7 = c13787g0.f49191i;
            if (edgeEffectM39142a7 == null) {
                edgeEffectM39142a7 = c13787g0.m39142a(EnumC16377d2.f62971w);
                c13787g0.f49191i = edgeEffectM39142a7;
            }
            m39190a1(0.0f, edgeEffectM39142a7, recordingCanvasBeginRecording);
            edgeEffectM39142a7.finish();
        }
        if (C13787g0.m39140f(c13787g0.f49187e)) {
            EdgeEffect edgeEffectM39143b = c13787g0.m39143b();
            boolean z14 = m39190a1(180.0f, edgeEffectM39143b, recordingCanvasBeginRecording) || zM39190a1;
            if (C13787g0.m39141g(c13787g0.f49187e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c13798k.m39163c() >> c3));
                EdgeEffect edgeEffectM39142a8 = c13787g0.f49191i;
                if (edgeEffectM39142a8 == null) {
                    edgeEffectM39142a8 = c13787g0.m39142a(EnumC16377d2.f62971w);
                    c13787g0.f49191i = edgeEffectM39142a8;
                }
                AbstractC12240d.m34052R(edgeEffectM39142a8, AbstractC12240d.m34041G(edgeEffectM39143b), 1 - fIntBitsToFloat4);
            }
            zM39190a1 = z14;
        }
        if (zM39190a1) {
            c13798k.m39164d();
        }
        float f13 = z13 ? 0.0f : fMo743q0;
        if (z4) {
            fMo743q0 = 0.0f;
        }
        EnumC39181m layoutDirection = c0238p0.getLayoutDirection();
        C17873c c17873c = new C17873c();
        c17873c.f69556a = recordingCanvasBeginRecording;
        long jMo731d2 = c22128b.mo731d();
        C0237p c0237p = c22128b.f85852x;
        C22127a c22127a = ((C22128b) c0237p.f814z).f85851w;
        InterfaceC39171c interfaceC39171c = c22127a.f85847a;
        EnumC39181m enumC39181m = c22127a.f85848b;
        InterfaceC17915v interfaceC17915vM716w = c0237p.m716w();
        long jM670A = c22128b.f85852x.m670A();
        C0237p c0237p2 = c22128b.f85852x;
        C23226c c23226c = (C23226c) c0237p2.f813y;
        c0237p2.m686Q(c0238p0);
        c0237p2.m689T(layoutDirection);
        c0237p2.m685P(c17873c);
        c0237p2.m690U(jMo731d2);
        c0237p2.f813y = null;
        c17873c.mo51426q();
        try {
            ((C0929d) c22128b.f85852x.f812x).m2339B(f13, fMo743q0);
            try {
                c0238p0.m728a();
                float f14 = -f13;
                float f15 = -fMo743q0;
                ((C0929d) c22128b.f85852x.f812x).m2339B(f14, f15);
                c17873c.mo51417g();
                C0237p c0237p3 = c22128b.f85852x;
                c0237p3.m686Q(interfaceC39171c);
                c0237p3.m689T(enumC39181m);
                c0237p3.m685P(interfaceC17915vM716w);
                c0237p3.m690U(jM670A);
                c0237p3.f813y = c23226c;
                m39191b1().endRecording();
                int iSave = canvasM51433a.save();
                canvasM51433a.translate(f14, f15);
                canvasM51433a.drawRenderNode(m39191b1());
                canvasM51433a.restoreToCount(iSave);
            } catch (Throwable th3) {
                ((C0929d) c22128b.f85852x.f812x).m2339B(-f13, -fMo743q0);
                throw th3;
            }
        } catch (Throwable th4) {
            c17873c.mo51417g();
            C0237p c0237p4 = c22128b.f85852x;
            c0237p4.m686Q(interfaceC39171c);
            c0237p4.m689T(enumC39181m);
            c0237p4.m685P(interfaceC17915vM716w);
            c0237p4.m690U(jM670A);
            c0237p4.f813y = c23226c;
            throw th4;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final RenderNode m39191b1() {
        RenderNode renderNode = this.f49349S;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM3217e = AbstractC1079m.m3217e();
        this.f49349S = renderNodeM3217e;
        return renderNodeM3217e;
    }
}
