package p389p0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p006a4.AbstractC0354a;
import p314m.C24849k0;
import p318m3.C24977g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnAttachStateChangeListenerC28505a implements InterfaceC28507a1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: H */
    public static long f115390H;

    /* JADX INFO: renamed from: F */
    public boolean f115392F;

    /* JADX INFO: renamed from: G */
    public long f115393G;

    /* JADX INFO: renamed from: w */
    public final View f115394w;

    /* JADX INFO: renamed from: y */
    public boolean f115396y;

    /* JADX INFO: renamed from: x */
    public final PriorityQueue f115395x = new PriorityQueue(11, new C24977g(12));

    /* JADX INFO: renamed from: z */
    public final Choreographer f115397z = Choreographer.getInstance();

    /* JADX INFO: renamed from: E */
    public final C24849k0 f115391E = new C24849k0();

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    public ViewOnAttachStateChangeListenerC28505a(View view) {
        float refreshRate;
        this.f115394w = view;
        if (f115390H == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f115390H = (long) (1000000000 / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f115392F = true;
        }
    }

    @Override // p389p0.InterfaceC28507a1
    /* JADX INFO: renamed from: a */
    public void mo86816a(C28561y0 c28561y0) {
        this.f115395x.add(new C28516d1(1, c28561y0));
        if (this.f115396y) {
            return;
        }
        this.f115396y = true;
        this.f115394w.post(this);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86817b() {
        C24849k0 c24849k0 = this.f115391E;
        long jM72855a = c24849k0.m72855a();
        AbstractC0354a.m959F(jM72855a, "compose:lazy:prefetch:available_time_nanos");
        boolean z4 = true;
        if (jM72855a > 0) {
            PriorityQueue priorityQueue = this.f115395x;
            Object objPeek = priorityQueue.peek();
            AbstractC22676k.m65747g(objPeek);
            if (!((C28516d1) objPeek).f115417b.m86890c(c24849k0)) {
                priorityQueue.poll();
                z4 = false;
            }
            c24849k0.f97341a = false;
        }
        return z4;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        if (this.f115392F) {
            this.f115393G = j7;
            this.f115394w.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f115392F = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f115392F = false;
        this.f115394w.removeCallbacks(this);
        this.f115397z.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f115395x;
        if (!priorityQueue.isEmpty() && this.f115396y && this.f115392F) {
            View view = this.f115394w;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z4 = System.nanoTime() > (((long) 2) * f115390H) + nanos;
                C24849k0 c24849k0 = this.f115391E;
                c24849k0.f97341a = z4;
                c24849k0.f97342b = Math.max(this.f115393G, nanos) + f115390H;
                boolean zM86817b = false;
                while (!priorityQueue.isEmpty() && !zM86817b) {
                    if (c24849k0.f97341a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM86817b = m86817b();
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } else {
                        zM86817b = m86817b();
                    }
                }
                if (zM86817b) {
                    this.f115397z.postFrameCallback(this);
                } else {
                    this.f115396y = false;
                }
                AbstractC0354a.m959F(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f115396y = false;
    }
}
