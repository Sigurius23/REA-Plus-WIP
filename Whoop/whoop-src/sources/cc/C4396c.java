package cc;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: cc.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C4396c implements Drawable.Callback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C4399f f17745w;

    public C4396c(C4399f c4399f) {
        this.f17745w = c4399f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f17745w.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        this.f17745w.scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f17745w.unscheduleSelf(runnable);
    }
}
