package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.google.android.material.datepicker.C5020n;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.internal.util.PixelCopyOnPixelCopyFinishedListenerC20110k;
import io.sentry.android.replay.C20203e0;
import io.sentry.android.replay.C20253w;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.util.C20233a;
import io.sentry.android.replay.util.C20235c;
import io.sentry.android.replay.util.RunnableC20237e;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l83.EnumC23463i;
import p014aj.C0928c;
import p021av.C2088b;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.android.replay.screenshot.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20228h implements InterfaceC20229i {

    /* JADX INFO: renamed from: a */
    public final ReplayIntegration f75980a;

    /* JADX INFO: renamed from: b */
    public final C20513q6 f75981b;

    /* JADX INFO: renamed from: c */
    public final C20253w f75982c;

    /* JADX INFO: renamed from: d */
    public final C2088b f75983d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f75984e;

    /* JADX INFO: renamed from: f */
    public final C0928c f75985f;

    /* JADX INFO: renamed from: g */
    public final Bitmap f75986g;

    /* JADX INFO: renamed from: h */
    public final Object f75987h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f75988i;

    /* JADX INFO: renamed from: j */
    public final C20235c f75989j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f75990k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f75991l;

    /* JADX INFO: renamed from: m */
    public final Object f75992m;

    /* JADX INFO: renamed from: n */
    public final Object f75993n;

    /* JADX INFO: renamed from: o */
    public final Rect f75994o;

    /* JADX INFO: renamed from: p */
    public final RectF f75995p;

    /* JADX INFO: renamed from: q */
    public final int[] f75996q;

    /* JADX INFO: renamed from: r */
    public final int[] f75997r;

    public C20228h(C20203e0 c20203e0, ReplayIntegration replayIntegration, C20513q6 c20513q6, C20253w c20253w, C20233a c20233a, C2088b c2088b) {
        this.f75980a = replayIntegration;
        this.f75981b = c20513q6;
        this.f75982c = c20253w;
        this.f75983d = c2088b;
        this.f75984e = c20203e0.f75882E;
        this.f75985f = c20203e0.f75896z;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c20253w.f76069a, c20253w.f76070b, Bitmap.Config.ARGB_8888);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        this.f75986g = bitmapCreateBitmap;
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.f75987h = AbstractC30060g.m92087G(enumC23463i, new C20227g(this, 0));
        this.f75988i = new AtomicBoolean(false);
        this.f75989j = new C20235c();
        this.f75990k = new AtomicBoolean(false);
        this.f75991l = new AtomicBoolean(false);
        this.f75992m = AbstractC30060g.m92087G(enumC23463i, C20226f.f75977w);
        this.f75993n = AbstractC30060g.m92087G(enumC23463i, new C20227g(this, 1));
        this.f75994o = new Rect();
        this.f75995p = new RectF();
        this.f75996q = new int[2];
        this.f75997r = new int[2];
    }

    /* JADX INFO: renamed from: e */
    public static final void m56146e(AtomicInteger atomicInteger, final C20228h c20228h, final View view, final C5020n[] c5020nArr, final AbstractC20252g abstractC20252g, final int i13, final int i14) {
        if (atomicInteger.decrementAndGet() == 0) {
            c20228h.f75984e.submit(new RunnableC20237e(new Runnable() { // from class: io.sentry.android.replay.screenshot.e
                /* JADX WARN: Code duplicated, block: B:14:0x008c  */
                /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, l83.h] */
                /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, l83.h] */
                @Override // java.lang.Runnable
                public final void run() {
                    C20228h c20228h2 = this.f75973w;
                    boolean z4 = c20228h2.f75991l.get();
                    C5020n[] c5020nArr2 = c5020nArr;
                    if (z4 || c20228h2.f75986g.isRecycled()) {
                        c20228h2.f75981b.getLogger().mo16066m(EnumC20436n5.DEBUG, "PixelCopyStrategy is closed, skipping compositing", new Object[0]);
                        for (C5020n c5020n : c5020nArr2) {
                            if (c5020n != null) {
                                Bitmap bitmap = (Bitmap) c5020n.f20933z;
                                if (!bitmap.isRecycled()) {
                                    bitmap.recycle();
                                }
                            }
                        }
                        return;
                    }
                    int i15 = 0;
                    for (int length = c5020nArr2.length; i15 < length; length = length) {
                        C5020n c5020n2 = c5020nArr2[i15];
                        if (c5020n2 != null) {
                            Bitmap bitmap2 = (Bitmap) c5020n2.f20933z;
                            if (!bitmap2.isRecycled()) {
                                Canvas destCanvas = (Canvas) c20228h2.f75993n.getValue();
                                Paint destPaint = (Paint) c20228h2.f75992m.getValue();
                                Rect tmpSrc = c20228h2.f75994o;
                                RectF tmpDst = c20228h2.f75995p;
                                int i16 = c5020n2.f20931x;
                                int i17 = c5020n2.f20932y;
                                C20253w c20253w = c20228h2.f75982c;
                                float f13 = c20253w.f76071c;
                                float f14 = c20253w.f76072d;
                                AbstractC22676k.m65750j(destCanvas, "destCanvas");
                                AbstractC22676k.m65750j(destPaint, "destPaint");
                                AbstractC22676k.m65750j(tmpSrc, "tmpSrc");
                                AbstractC22676k.m65750j(tmpDst, "tmpDst");
                                float f15 = (i16 - i13) * f13;
                                float f16 = (i17 - i14) * f14;
                                tmpSrc.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                                tmpDst.set(f15, f16, (bitmap2.getWidth() * f13) + f15, (bitmap2.getHeight() * f14) + f16);
                                destCanvas.drawBitmap(bitmap2, tmpSrc, tmpDst, destPaint);
                                bitmap2.recycle();
                            }
                        }
                        i15++;
                    }
                    c20228h2.m56147d(view, abstractC20252g);
                }
            }, "screenshot_recorder.composite"));
        }
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    /* JADX INFO: renamed from: a */
    public final boolean mo56142a() {
        return this.f75988i.get();
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    /* JADX INFO: renamed from: b */
    public final void mo56143b() {
        if (this.f75988i.get()) {
            Bitmap bitmap = this.f75986g;
            if (bitmap.isRecycled()) {
                return;
            }
            this.f75980a.m56096b0(bitmap);
        }
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    /* JADX INFO: renamed from: c */
    public final void mo56144c(View view) throws IllegalAccessException {
        Window windowM113937D = AbstractC35902e.m113937D(view);
        C20513q6 c20513q6 = this.f75981b;
        if (windowM113937D == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.f75991l.get()) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f75990k.set(false);
            PixelCopy.request(windowM113937D, this.f75986g, new PixelCopyOnPixelCopyFinishedListenerC20110k(1, this, view), (Handler) this.f75985f.f3421x);
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to capture replay recording", th3);
            this.f75988i.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    public final void close() {
        this.f75991l.set(true);
        this.f75984e.submit(new RunnableC20237e(new RunnableC20277c7(this, 12), "PixelCopyStrategy.close"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: d */
    public final void m56147d(View view, AbstractC20252g abstractC20252g) {
        boolean z4 = this.f75991l.get();
        C20513q6 c20513q6 = this.f75981b;
        if (!z4) {
            Bitmap bitmap = this.f75986g;
            if (!bitmap.isRecycled()) {
                this.f75989j.m56153b(bitmap, abstractC20252g, (Matrix) this.f75987h.getValue());
                c20513q6.getReplayController().getClass();
                this.f75980a.m56096b0(bitmap);
                this.f75988i.set(true);
                this.f75990k.set(false);
                return;
            }
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
    }

    @Override // io.sentry.android.replay.screenshot.InterfaceC20229i
    public final void onContentChanged() {
        this.f75990k.set(true);
    }
}
