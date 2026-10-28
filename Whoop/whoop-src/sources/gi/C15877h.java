package gi;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import e93.AbstractC12889b;
import p474s.AbstractC32004s;

/* JADX INFO: renamed from: gi.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C15877h extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: E */
    public float f59987E = 1.0f;

    /* JADX INFO: renamed from: w */
    public final Drawable f59988w;

    /* JADX INFO: renamed from: x */
    public final EnumC15876g f59989x;

    /* JADX INFO: renamed from: y */
    public float f59990y;

    /* JADX INFO: renamed from: z */
    public float f59991z;

    public C15877h(Drawable drawable, EnumC15876g enumC15876g) {
        this.f59988w = drawable;
        this.f59989x = enumC15876g;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f59990y, this.f59991z);
            float f13 = this.f59987E;
            canvas.scale(f13, f13);
            this.f59988w.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f59988w.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f59988w.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f59988w.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f59988w.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f59988w.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f59988w;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f59988w.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f59988w;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f59990y = 0.0f;
            this.f59991z = 0.0f;
            this.f59987E = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM99538g = AbstractC32004s.m99538g(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f59989x);
        double d3 = 2;
        int iM36257W = AbstractC12889b.m36257W((((double) iWidth) - (((double) intrinsicWidth) * dM99538g)) / d3);
        int iM36257W2 = AbstractC12889b.m36257W((((double) iHeight) - (((double) intrinsicHeight) * dM99538g)) / d3);
        drawable.setBounds(iM36257W, iM36257W2, intrinsicWidth + iM36257W, intrinsicHeight + iM36257W2);
        this.f59990y = rect.left;
        this.f59991z = rect.top;
        this.f59987E = (float) dM99538g;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        return this.f59988w.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f59988w.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f59988w.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f59988w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        this.f59988w.setTint(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f59988w.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f59988w.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f59988w.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f59988w;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f59988w;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
