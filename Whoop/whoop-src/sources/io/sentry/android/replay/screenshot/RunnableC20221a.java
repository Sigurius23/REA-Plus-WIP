package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.PixelCopy;
import android.view.Surface;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.C20253w;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.screenshot.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC20221a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75943w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20223c f75944x;

    public /* synthetic */ RunnableC20221a(C20223c c20223c, int i13) {
        this.f75943w = i13;
        this.f75944x = c20223c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75943w) {
            case 0:
                final C20223c c20223c = this.f75944x;
                if (c20223c.f75956k.get()) {
                    c20223c.f75948c.getLogger().mo16066m(EnumC20436n5.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
                    return;
                }
                Picture picture = (Picture) c20223c.f75951f.getAndSet(null);
                if (picture == null) {
                    return;
                }
                try {
                    Canvas canvasLockHardwareCanvas = c20223c.f75958m.lockHardwareCanvas();
                    try {
                        canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                        picture.draw(canvasLockHardwareCanvas);
                        c20223c.f75958m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        if (c20223c.f75950e == null) {
                            C20535s c20535sM56711a = c20223c.f75952g.m56711a();
                            try {
                                if (c20223c.f75950e == null) {
                                    C20253w c20253w = c20223c.f75949d;
                                    c20223c.f75950e = Bitmap.createBitmap(c20253w.f76069a, c20253w.f76070b, Bitmap.Config.ARGB_8888);
                                }
                                AbstractC21598x.m60698r(c20535sM56711a, null);
                                break;
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    AbstractC21598x.m60698r(c20535sM56711a, th3);
                                    throw th4;
                                }
                            }
                        }
                        if (c20223c.f75956k.get()) {
                            c20223c.f75948c.getLogger().mo16066m(EnumC20436n5.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                            return;
                        }
                        Surface surface = c20223c.f75958m;
                        Bitmap bitmap = c20223c.f75950e;
                        AbstractC22676k.m65747g(bitmap);
                        PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.b
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i13) {
                                C20223c c20223c2 = c20223c;
                                if (c20223c2.f75956k.get()) {
                                    c20223c2.f75948c.getLogger().mo16066m(EnumC20436n5.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                                    return;
                                }
                                if (i13 != 0) {
                                    c20223c2.f75948c.getLogger().mo16066m(EnumC20436n5.ERROR, AbstractC2875y.m8295h(i13, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                                    c20223c2.f75954i.set(false);
                                    return;
                                }
                                c20223c2.f75954i.set(true);
                                Bitmap bitmap2 = c20223c2.f75950e;
                                if (bitmap2 == null || bitmap2.isRecycled()) {
                                    return;
                                }
                                c20223c2.f75947b.m56096b0(bitmap2);
                            }
                        }, c20223c.f75946a.m56126i());
                        return;
                    } catch (Throwable th5) {
                        c20223c.f75958m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        throw th5;
                    }
                } catch (Throwable th6) {
                    c20223c.f75948c.getLogger().mo16060j(EnumC20436n5.ERROR, "Canvas Strategy: picture render failed", th6);
                    c20223c.f75954i.set(false);
                    return;
                }
            default:
                C20223c c20223c2 = this.f75944x;
                Bitmap bitmap2 = c20223c2.f75950e;
                if (bitmap2 != null) {
                    synchronized (bitmap2) {
                        if (!bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        break;
                    }
                }
                c20223c2.f75958m.release();
                c20223c2.f75957l.release();
                return;
        }
    }
}
