package io.sentry.android.core.internal.util;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.RunnableC1283d;
import com.google.android.material.datepicker.C5020n;
import io.sentry.C20513q6;
import io.sentry.C20578u6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.replay.screenshot.C20228h;
import io.sentry.android.replay.util.RunnableC20237e;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import io.sentry.android.replay.viewhierarchy.C20250e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o73.C27648a;
import p006a4.AbstractC0354a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PixelCopyOnPixelCopyFinishedListenerC20110k implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f75551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f75552c;

    public /* synthetic */ PixelCopyOnPixelCopyFinishedListenerC20110k(int i13, Object obj, Object obj2) {
        this.f75550a = i13;
        this.f75551b = obj;
        this.f75552c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i13) {
        Surface surface;
        final ?? r10;
        ?? r14;
        SurfaceHolder holder;
        switch (this.f75550a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f75551b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f75552c;
                atomicBoolean.set(i13 == 0);
                countDownLatch.countDown();
                break;
            default:
                final C20228h c20228h = (C20228h) this.f75551b;
                final View view = (View) this.f75552c;
                AtomicBoolean atomicBoolean2 = c20228h.f75991l;
                AtomicBoolean atomicBoolean3 = c20228h.f75988i;
                C20513q6 c20513q6 = c20228h.f75981b;
                if (atomicBoolean2.get()) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                } else if (i13 != 0) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i13));
                    atomicBoolean3.set(false);
                } else if (!c20228h.f75990k.get()) {
                    C20578u6 sessionReplay = c20513q6.getSessionReplay();
                    AbstractC22676k.m65749i(sessionReplay, "getSessionReplay(...)");
                    Surface surface2 = null;
                    AbstractC20252g abstractC20252gM83550A = C27648a.m83550A(view, null, sessionReplay);
                    ArrayList arrayList = c20513q6.getSessionReplay().f77074p ? new ArrayList() : null;
                    C20578u6 sessionReplay2 = c20513q6.getSessionReplay();
                    AbstractC22676k.m65749i(sessionReplay2, "getSessionReplay(...)");
                    InterfaceC20602v0 logger = c20513q6.getLogger();
                    AbstractC22676k.m65749i(logger, "getLogger(...)");
                    AbstractC0354a.m960G(view, abstractC20252gM83550A, sessionReplay2, logger, arrayList);
                    if (arrayList == null || arrayList.isEmpty()) {
                        c20228h.f75984e.submit(new RunnableC20237e(new RunnableC1283d(c20228h, view, abstractC20252gM83550A, 13), "screenshot_recorder.mask"));
                    } else {
                        c20228h.f75983d.invoke();
                        int[] iArr = c20228h.f75997r;
                        int[] iArr2 = c20228h.f75996q;
                        view.getLocationOnScreen(iArr2);
                        final int i14 = iArr2[0];
                        int i15 = iArr2[1];
                        final C5020n[] c5020nArr = new C5020n[arrayList.size()];
                        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
                        Iterator it = arrayList.iterator();
                        final AbstractC20252g abstractC20252g = abstractC20252gM83550A;
                        final int i16 = 0;
                        while (it.hasNext()) {
                            int i17 = i16 + 1;
                            SurfaceView surfaceView = (SurfaceView) ((C20250e) it.next()).f76057h.get();
                            Surface surface3 = (surfaceView == null || (holder = surfaceView.getHolder()) == null) ? surface2 : holder.getSurface();
                            if (surfaceView == null || surface3 == null || !surface3.isValid()) {
                                iArr = iArr;
                                surface = surface2;
                                c5020nArr = c5020nArr;
                                atomicInteger = atomicInteger;
                                abstractC20252g = abstractC20252g;
                                i14 = i14;
                                C20228h.m56146e(atomicInteger, c20228h, view, c5020nArr, abstractC20252g, i14, i15);
                            } else {
                                try {
                                    try {
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                                        try {
                                            surfaceView.getLocationOnScreen(iArr);
                                            view = view;
                                            r10 = bitmapCreateBitmap;
                                            c5020nArr = c5020nArr;
                                            try {
                                                final int i18 = iArr[0];
                                                final int i19 = i15;
                                                try {
                                                    final int i24 = iArr[1];
                                                    int[] iArr3 = iArr;
                                                    try {
                                                        iArr = iArr3;
                                                        surface = null;
                                                        try {
                                                            PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.d
                                                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                                                public final void onPixelCopyFinished(int i25) {
                                                                    C20228h c20228h2 = c20228h;
                                                                    boolean z4 = c20228h2.f75991l.get();
                                                                    Bitmap bitmap = r10;
                                                                    C5020n[] c5020nArr2 = c5020nArr;
                                                                    AtomicInteger atomicInteger2 = atomicInteger;
                                                                    View view2 = view;
                                                                    AbstractC20252g abstractC20252g2 = abstractC20252g;
                                                                    int i26 = i14;
                                                                    int i27 = i19;
                                                                    if (z4) {
                                                                        bitmap.recycle();
                                                                        C20228h.m56146e(atomicInteger2, c20228h2, view2, c5020nArr2, abstractC20252g2, i26, i27);
                                                                        return;
                                                                    }
                                                                    if (i25 == 0) {
                                                                        c5020nArr2[i16] = new C5020n(bitmap, i18, i24);
                                                                    } else {
                                                                        bitmap.recycle();
                                                                        c20228h2.f75981b.getLogger().mo16066m(EnumC20436n5.INFO, "Failed to capture SurfaceView: %d", Integer.valueOf(i25));
                                                                    }
                                                                    C20228h.m56146e(atomicInteger2, c20228h2, view2, c5020nArr2, abstractC20252g2, i26, i27);
                                                                }
                                                            };
                                                            atomicInteger = atomicInteger;
                                                            abstractC20252g = abstractC20252g;
                                                            i14 = i14;
                                                            i15 = i19;
                                                            try {
                                                                PixelCopy.request(surfaceView, (Bitmap) r10, onPixelCopyFinishedListener, (Handler) c20228h.f75985f.f3421x);
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to capture SurfaceView", th);
                                                                if (r10 != 0) {
                                                                    r10.recycle();
                                                                }
                                                                view = view;
                                                                C20228h.m56146e(atomicInteger, c20228h, view, c5020nArr, abstractC20252g, i14, i15);
                                                                view = view;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            atomicInteger = atomicInteger;
                                                            abstractC20252g = abstractC20252g;
                                                            i14 = i14;
                                                            i15 = i19;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        i15 = i19;
                                                        iArr = iArr3;
                                                        r10 = r10;
                                                        surface = null;
                                                        c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to capture SurfaceView", th);
                                                        if (r10 != 0) {
                                                            r10.recycle();
                                                        }
                                                        view = view;
                                                        C20228h.m56146e(atomicInteger, c20228h, view, c5020nArr, abstractC20252g, i14, i15);
                                                        view = view;
                                                        atomicInteger = atomicInteger;
                                                        abstractC20252g = abstractC20252g;
                                                        i14 = i14;
                                                        view = view;
                                                        i16 = i17;
                                                        iArr = iArr;
                                                        c5020nArr = c5020nArr;
                                                        surface2 = surface;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    iArr = iArr;
                                                    i15 = i19;
                                                    r10 = r10;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                r14 = r10;
                                                r10 = r14;
                                                surface = null;
                                                c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to capture SurfaceView", th);
                                                if (r10 != 0) {
                                                    r10.recycle();
                                                }
                                                view = view;
                                                C20228h.m56146e(atomicInteger, c20228h, view, c5020nArr, abstractC20252g, i14, i15);
                                                view = view;
                                                atomicInteger = atomicInteger;
                                                abstractC20252g = abstractC20252g;
                                                i14 = i14;
                                                view = view;
                                                i16 = i17;
                                                iArr = iArr;
                                                c5020nArr = c5020nArr;
                                                surface2 = surface;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            view = view;
                                            r14 = bitmapCreateBitmap;
                                            c5020nArr = c5020nArr;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        surface = null;
                                        r10 = surface;
                                        c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to capture SurfaceView", th);
                                        if (r10 != 0) {
                                            r10.recycle();
                                        }
                                        view = view;
                                        C20228h.m56146e(atomicInteger, c20228h, view, c5020nArr, abstractC20252g, i14, i15);
                                        view = view;
                                        atomicInteger = atomicInteger;
                                        abstractC20252g = abstractC20252g;
                                        i14 = i14;
                                        view = view;
                                        i16 = i17;
                                        iArr = iArr;
                                        c5020nArr = c5020nArr;
                                        surface2 = surface;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    surface = surface2;
                                }
                                atomicInteger = atomicInteger;
                                abstractC20252g = abstractC20252g;
                                i14 = i14;
                                view = view;
                                i16 = i17;
                                iArr = iArr;
                                c5020nArr = c5020nArr;
                                surface2 = surface;
                            }
                            view = view;
                            atomicInteger = atomicInteger;
                            abstractC20252g = abstractC20252g;
                            i14 = i14;
                            view = view;
                            i16 = i17;
                            iArr = iArr;
                            c5020nArr = c5020nArr;
                            surface2 = surface;
                        }
                    }
                } else {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                    atomicBoolean3.set(false);
                }
                break;
        }
    }
}
