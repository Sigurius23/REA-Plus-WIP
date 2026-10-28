package p149fh;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.room.AbstractC1772c1;
import e93.AbstractC12889b;
import p341nh.EnumC26713g;

/* JADX INFO: renamed from: fh.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C14478b extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: E */
    public float f52843E = 1.0f;

    /* JADX INFO: renamed from: w */
    public final Drawable f52844w;

    /* JADX INFO: renamed from: x */
    public final EnumC26713g f52845x;

    /* JADX INFO: renamed from: y */
    public float f52846y;

    /* JADX INFO: renamed from: z */
    public float f52847z;

    public C14478b(Drawable drawable, EnumC26713g enumC26713g) {
        this.f52844w = drawable;
        this.f52845x = enumC26713g;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f52846y, this.f52847z);
            float f13 = this.f52843E;
            canvas.scale(f13, f13);
            this.f52844w.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f52844w.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f52844w.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f52844w.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f52844w.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f52844w.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f52844w;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f52844w;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f52846y = 0.0f;
            this.f52847z = 0.0f;
            this.f52843E = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM5393k = AbstractC1772c1.m5393k(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f52845x);
        double d3 = 2;
        int iM36257W = AbstractC12889b.m36257W((((double) iWidth) - (((double) intrinsicWidth) * dM5393k)) / d3);
        int iM36257W2 = AbstractC12889b.m36257W((((double) iHeight) - (((double) intrinsicHeight) * dM5393k)) / d3);
        drawable.setBounds(iM36257W, iM36257W2, intrinsicWidth + iM36257W, intrinsicHeight + iM36257W2);
        this.f52846y = rect.left;
        this.f52847z = rect.top;
        this.f52843E = (float) dM5393k;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        return this.f52844w.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f52844w.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f52844w.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f52844w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        this.f52844w.setTint(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f52844w.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f52844w.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f52844w.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f52844w;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f52844w;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
