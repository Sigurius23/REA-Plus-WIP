package cc;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p479s4.AbstractC32121b;

/* JADX INFO: renamed from: cc.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4400g extends Drawable {

    /* JADX INFO: renamed from: w */
    public Drawable f17755w;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99998c(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m100012r(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i13) {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.setLevel(i13) : super.onLevelChange(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i13) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setChangingConfigurations(i13);
        } else {
            super.setChangingConfigurations(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i13, PorterDuff.Mode mode) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setColorFilter(i13, mode);
        } else {
            super.setColorFilter(i13, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z4) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setFilterBitmap(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f13, float f14) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99988A(drawable, f13, f14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i13, int i14, int i15, int i16) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99989B(drawable, i13, i14, i15, i16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
