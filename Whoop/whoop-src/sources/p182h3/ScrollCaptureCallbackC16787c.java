package p182h3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.p018ui.platform.AndroidComposeView;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3075y1;
import e93.AbstractC12889b;
import h20.C16670i0;
import hc3.C17171d;
import java.util.function.Consumer;
import l83.C23454a0;
import p026b2.C2319y;
import p031b9.AbstractC2875y;
import p078d1.C11454g;
import p163g1.C15065l;
import p208i2.AbstractC17918w0;
import p209i3.C18034p;
import p390p1.AbstractC28683x;
import p505ts.AbstractC34132o;
import p636y3.C39179k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class ScrollCaptureCallbackC16787c implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final C18034p f64531a;

    /* JADX INFO: renamed from: b */
    public final C39179k f64532b;

    /* JADX INFO: renamed from: c */
    public final C16794j f64533c;

    /* JADX INFO: renamed from: d */
    public final AndroidComposeView f64534d;

    /* JADX INFO: renamed from: e */
    public final C17171d f64535e;

    /* JADX INFO: renamed from: f */
    public final C16791g f64536f;

    public ScrollCaptureCallbackC16787c(C18034p c18034p, C39179k c39179k, C17171d c17171d, C16794j c16794j, AndroidComposeView androidComposeView) {
        this.f64531a = c18034p;
        this.f64532b = c39179k;
        this.f64533c = c16794j;
        this.f64534d = androidComposeView;
        this.f64535e = AbstractC3006f0.m8696B(c17171d, C16789e.f64539w);
        this.f64536f = new C16791g(c39179k.m124796a(), new C15065l(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m47335a(ScrollCaptureCallbackC16787c scrollCaptureCallbackC16787c, ScrollCaptureSession scrollCaptureSession, C39179k c39179k, AbstractC32269c abstractC32269c) {
        C16785a c16785a;
        int i13;
        int i14;
        ScrollCaptureSession scrollCaptureSession2;
        C39179k c39179k2;
        int i15;
        int i16;
        int iM36284n;
        int iM36284n2;
        int i17;
        int i18;
        Canvas canvasLockHardwareCanvas;
        if (abstractC32269c instanceof C16785a) {
            c16785a = (C16785a) abstractC32269c;
            int i19 = c16785a.f64522G;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                c16785a.f64522G = i19 - Integer.MIN_VALUE;
            } else {
                c16785a = new C16785a(scrollCaptureCallbackC16787c, abstractC32269c);
            }
        } else {
            c16785a = new C16785a(scrollCaptureCallbackC16787c, abstractC32269c);
        }
        Object obj = c16785a.f64520E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i24 = c16785a.f64522G;
        if (i24 == 0) {
            AbstractC34132o.m107864I(obj);
            i13 = c39179k.f168419b;
            i14 = c39179k.f168421d;
            C16791g c16791g = scrollCaptureCallbackC16787c.f64536f;
            c16785a.f64523w = scrollCaptureSession;
            c16785a.f64524x = c39179k;
            c16785a.f64525y = i13;
            c16785a.f64526z = i14;
            c16785a.f64522G = 1;
            int i25 = c16791g.f64543a;
            if (i13 > i14) {
                throw new IllegalArgumentException(AbstractC2875y.m8294g(i13, i14, "Expected min=", " ≤ max=").toString());
            }
            int i26 = i14 - i13;
            if (i26 > i25) {
                throw new IllegalArgumentException(AbstractC2875y.m8294g(i26, i25, "Expected range (", ") to be ≤ viewportSize=").toString());
            }
            float f13 = i13;
            float f14 = c16791g.f64544b;
            Object obj2 = C23454a0.f92919a;
            if (f13 < f14 || i14 > i25 + f14) {
                Object objM47337b = c16791g.m47337b((f13 < f14 ? i13 : i14 - i25) - f14, c16785a);
                if (objM47337b != enumC31071a) {
                    objM47337b = obj2;
                }
                if (objM47337b == enumC31071a) {
                    obj2 = objM47337b;
                }
            }
            if (obj2 != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i24 == 1) {
            int i27 = c16785a.f64526z;
            int i28 = c16785a.f64525y;
            C39179k c39179k3 = c16785a.f64524x;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) c16785a.f64523w;
            AbstractC34132o.m107864I(obj);
            i13 = i28;
            c39179k = c39179k3;
            i14 = i27;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i24 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i16 = c16785a.f64526z;
            i15 = c16785a.f64525y;
            c39179k2 = c16785a.f64524x;
            scrollCaptureSession2 = (ScrollCaptureSession) c16785a.f64523w;
            AbstractC34132o.m107864I(obj);
        }
        C16791g c16791g2 = scrollCaptureCallbackC16787c.f64536f;
        iM36284n = AbstractC12889b.m36284n(i15 - AbstractC12889b.m36258X(c16791g2.f64544b), 0, c16791g2.f64543a);
        C16791g c16791g3 = scrollCaptureCallbackC16787c.f64536f;
        iM36284n2 = AbstractC12889b.m36284n(i16 - AbstractC12889b.m36258X(c16791g3.f64544b), 0, c16791g3.f64543a);
        i17 = c39179k2.f168418a;
        i18 = c39179k2.f168420c;
        if (iM36284n == iM36284n2) {
            return C39179k.f168417e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i17, -iM36284n);
            C39179k c39179k4 = scrollCaptureCallbackC16787c.f64532b;
            canvasLockHardwareCanvas.translate(-c39179k4.f168418a, -c39179k4.f168419b);
            scrollCaptureCallbackC16787c.f64534d.getRootView().draw(canvasLockHardwareCanvas);
            int iM36258X = AbstractC12889b.m36258X(scrollCaptureCallbackC16787c.f64536f.f64544b);
            return new C39179k(i17, iM36284n + iM36258X, i18, iM36284n2 + iM36258X);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        C16786b c16786b = C16786b.f64527x;
        c16785a.f64523w = scrollCaptureSession;
        c16785a.f64524x = c39179k;
        c16785a.f64525y = i13;
        c16785a.f64526z = i14;
        c16785a.f64522G = 2;
        if (AbstractC28683x.m87268v(c16785a.getContext()).mo7286k(c16786b, c16785a) != enumC31071a) {
            scrollCaptureSession2 = scrollCaptureSession;
            c39179k2 = c39179k;
            i15 = i13;
            i16 = i14;
            C16791g c16791g4 = scrollCaptureCallbackC16787c.f64536f;
            iM36284n = AbstractC12889b.m36284n(i15 - AbstractC12889b.m36258X(c16791g4.f64544b), 0, c16791g4.f64543a);
            C16791g c16791g5 = scrollCaptureCallbackC16787c.f64536f;
            iM36284n2 = AbstractC12889b.m36284n(i16 - AbstractC12889b.m36258X(c16791g5.f64544b), 0, c16791g5.f64543a);
            i17 = c39179k2.f168418a;
            i18 = c39179k2.f168420c;
            if (iM36284n == iM36284n2) {
                return C39179k.f168417e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i17, -iM36284n);
            C39179k c39179k5 = scrollCaptureCallbackC16787c.f64532b;
            canvasLockHardwareCanvas.translate(-c39179k5.f168418a, -c39179k5.f168419b);
            scrollCaptureCallbackC16787c.f64534d.getRootView().draw(canvasLockHardwareCanvas);
            int iM36258X2 = AbstractC12889b.m36258X(scrollCaptureCallbackC16787c.f64536f.f64544b);
            return new C39179k(i17, iM36284n + iM36258X2, i18, iM36284n2 + iM36258X2);
        }
        return enumC31071a;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC3006f0.m8732z(this.f64535e, C3075y1.f12109w, null, new C16670i0(this, runnable, (InterfaceC30057d) null, 5), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(this.f64535e, null, null, new C2319y(this, scrollCaptureSession, rect, consumer, (InterfaceC30057d) null, 13), 3);
        c2996c2M8732z.invokeOnCompletion(new C16788d(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new C11454g(c2996c2M8732z, 1));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC17918w0.m51503E(this.f64532b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f64536f.f64544b = 0.0f;
        this.f64533c.f64547a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
