package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.C20203e0;
import io.sentry.android.replay.C20253w;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.util.RunnableC20237e;
import io.sentry.util.C20579a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l83.EnumC23463i;
import p021av.C2088b;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.android.replay.screenshot.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20223c implements InterfaceC20229i {

    /* JADX INFO: renamed from: a */
    public final C20203e0 f75946a;

    /* JADX INFO: renamed from: b */
    public final ReplayIntegration f75947b;

    /* JADX INFO: renamed from: c */
    public final C20513q6 f75948c;

    /* JADX INFO: renamed from: d */
    public final C20253w f75949d;

    /* JADX INFO: renamed from: e */
    public volatile Bitmap f75950e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f75951f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final C20579a f75952g = new C20579a();

    /* JADX INFO: renamed from: h */
    public final Object f75953h = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C2088b(this, 25));

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f75954i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public final C20230j f75955j = new C20230j();

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f75956k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    public final SurfaceTexture f75957l;

    /* JADX INFO: renamed from: m */
    public final Surface f75958m;

    /* JADX INFO: renamed from: n */
    public final RunnableC20221a f75959n;

    public C20223c(C20513q6 c20513q6, ReplayIntegration replayIntegration, C20253w c20253w, C20203e0 c20203e0) {
        this.f75946a = c20203e0;
        this.f75947b = replayIntegration;
        this.f75948c = c20513q6;
        this.f75949d = c20253w;
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(c20253w.f76069a, c20253w.f76070b);
        this.f75957l = surfaceTexture;
        this.f75958m = new Surface(surfaceTexture);
        AbstractC21598x.m60683i("ReplayCanvasStrategy");
        this.f75959n = new RunnableC20221a(this, 0);
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    /* JADX INFO: renamed from: a */
    public final boolean mo56142a() {
        return this.f75954i.get();
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    /* JADX INFO: renamed from: b */
    public final void mo56143b() {
        Bitmap bitmap;
        if (!this.f75954i.get() || (bitmap = this.f75950e) == null || bitmap.isRecycled()) {
            return;
        }
        this.f75947b.m56096b0(bitmap);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l83.h] */
    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    /* JADX INFO: renamed from: c */
    public final void mo56144c(View view) {
        AtomicBoolean atomicBoolean = this.f75956k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        C20253w c20253w = this.f75949d;
        Canvas canvasBeginRecording = picture.beginRecording(c20253w.f76069a, c20253w.f76070b);
        AbstractC22676k.m65749i(canvasBeginRecording, "beginRecording(...)");
        C20230j c20230j = this.f75955j;
        c20230j.getClass();
        c20230j.f75998a = canvasBeginRecording;
        c20230j.setMatrix((Matrix) this.f75953h.getValue());
        view.draw(c20230j);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f75951f.set(picture);
        m56145d(this.f75946a.m56126i(), new RunnableC20237e(this.f75959n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    public final void close() {
        this.f75956k.set(true);
        m56145d(this.f75946a.m56126i(), new RunnableC20237e(new RunnableC20221a(this, 1), "CanvasStrategy.close"));
        this.f75951f.getAndSet(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m56145d(Handler handler, RunnableC20237e runnableC20237e) {
        try {
            handler.post(runnableC20237e);
        } catch (Throwable th3) {
            this.f75948c.getLogger().mo16060j(EnumC20436n5.ERROR, "Canvas Strategy: failed to post runnable " + runnableC20237e.f76024w, th3);
        }
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    public final void onContentChanged() {
    }
}
