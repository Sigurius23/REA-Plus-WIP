package p685zl;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;
import p181h2.C16620e;
import p249jc.AbstractC21598x;
import p390p1.C28633k1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zl.a */
/* JADX INFO: loaded from: classes.dex */
public final class C40866a implements Drawable.Callback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DrawablePainter f176111w;

    public C40866a(DrawablePainter drawablePainter) {
        this.f176111w = drawablePainter;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d3) {
        AbstractC22676k.m65750j(d3, "d");
        DrawablePainter drawablePainter = this.f176111w;
        C28633k1 c28633k1 = drawablePainter.f20360F;
        c28633k1.setValue(Integer.valueOf(((Number) c28633k1.getValue()).intValue() + 1));
        Drawable drawable = drawablePainter.f20359E;
        Object obj = AbstractC40868c.f176113a;
        drawablePainter.f20361G.setValue(new C16620e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC21598x.m60672b(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, l83.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d3, Runnable what, long j7) {
        AbstractC22676k.m65750j(d3, "d");
        AbstractC22676k.m65750j(what, "what");
        ((Handler) AbstractC40868c.f176113a.getValue()).postAtTime(what, j7);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, l83.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d3, Runnable what) {
        AbstractC22676k.m65750j(d3, "d");
        AbstractC22676k.m65750j(what, "what");
        ((Handler) AbstractC40868c.f176113a.getValue()).removeCallbacks(what);
    }
}
