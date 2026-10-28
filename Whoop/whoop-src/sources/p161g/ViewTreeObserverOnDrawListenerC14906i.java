package p161g;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.RunnableC1319m;
import p497t7.InterfaceC33561b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC14906i implements InterfaceExecutorC14905h, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: w */
    public final long f55582w = SystemClock.uptimeMillis() + ((long) InterfaceC33561b.INVALID_OWNERSHIP);

    /* JADX INFO: renamed from: x */
    public Runnable f55583x;

    /* JADX INFO: renamed from: y */
    public boolean f55584y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractActivityC14909l f55585z;

    public ViewTreeObserverOnDrawListenerC14906i(AbstractActivityC14909l abstractActivityC14909l) {
        this.f55585z = abstractActivityC14909l;
    }

    /* JADX INFO: renamed from: a */
    public final void m42996a(View view) {
        if (this.f55584y) {
            return;
        }
        this.f55584y = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC22676k.m65750j(runnable, "runnable");
        this.f55583x = runnable;
        View decorView = this.f55585z.getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "window.decorView");
        if (!this.f55584y) {
            decorView.postOnAnimation(new RunnableC1319m(this, 23));
        } else if (AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.f55583x;
        AbstractActivityC14909l abstractActivityC14909l = this.f55585z;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f55582w) {
                this.f55584y = false;
                abstractActivityC14909l.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f55583x = null;
        if (abstractActivityC14909l.getFullyDrawnReporter().m43007b()) {
            this.f55584y = false;
            abstractActivityC14909l.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f55585z.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
