package p474s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: s.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31966i1 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: w */
    public Drawable f132713w;

    /* JADX INFO: renamed from: x */
    public boolean f132714x;

    /* JADX INFO: renamed from: a */
    public final void m99455a(Canvas canvas) {
        this.f132713w.draw(canvas);
    }

    /* JADX INFO: renamed from: b */
    public final void m99456b(float f13, float f14) {
        this.f132713w.setHotspot(f13, f14);
    }

    /* JADX INFO: renamed from: c */
    public final void m99457c(int i13, int i14, int i15, int i16) {
        this.f132713w.setHotspotBounds(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m99458d(boolean z4, boolean z13) {
        return super.setVisible(z4, z13) || this.f132713w.setVisible(z4, z13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f132714x) {
            m99455a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f132713w.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f132713w.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f132713w.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f132713w.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f132713w.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f132713w.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f132713w.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f132713w.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f132713w.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f132713w.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f132713w.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f132713w.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f132713w.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f132713w.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        return this.f132713w.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f132713w.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        this.f132713w.setAutoMirrored(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i13) {
        this.f132713w.setChangingConfigurations(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f132713w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z4) {
        this.f132713w.setDither(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z4) {
        this.f132713w.setFilterBitmap(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f13, float f14) {
        if (this.f132714x) {
            m99456b(f13, f14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i13, int i14, int i15, int i16) {
        if (this.f132714x) {
            m99457c(i13, i14, i15, i16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f132714x) {
            return this.f132713w.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        this.f132713w.setTint(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f132713w.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f132713w.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z13) {
        if (this.f132714x) {
            return m99458d(z4, z13);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
