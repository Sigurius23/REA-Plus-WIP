package cr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p257jq.AbstractC21885a;

/* JADX INFO: renamed from: cr.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11067e extends LinearLayoutCompat {

    /* JADX INFO: renamed from: E */
    public final boolean f35005E;

    /* JADX INFO: renamed from: F */
    public boolean f35006F;

    /* JADX INFO: renamed from: w */
    public Drawable f35007w;

    /* JADX INFO: renamed from: x */
    public final Rect f35008x;

    /* JADX INFO: renamed from: y */
    public final Rect f35009y;

    /* JADX INFO: renamed from: z */
    public int f35010z;

    public AbstractC11067e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f35008x = new Rect();
        this.f35009y = new Rect();
        this.f35010z = 119;
        this.f35005E = true;
        this.f35006F = false;
        AbstractC11075m.m29867a(context, attributeSet, 0, 0);
        int[] iArr = AbstractC21885a.f84557q;
        AbstractC11075m.m29868b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f35010z = typedArrayObtainStyledAttributes.getInt(1, this.f35010z);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f35005E = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f35007w;
        if (drawable != null) {
            if (this.f35006F) {
                this.f35006F = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z4 = this.f35005E;
                Rect rect = this.f35008x;
                if (z4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i13 = this.f35010z;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f35009y;
                Gravity.apply(i13, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f35007w;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f35007w;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f35007w.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f35007w;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f35010z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f35007w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        this.f35006F = z4 | this.f35006F;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f35006F = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f35007w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f35007w);
            }
            this.f35007w = drawable;
            this.f35006F = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f35010z == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i13) {
        if (this.f35010z != i13) {
            if ((8388615 & i13) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            this.f35010z = i13;
            if (i13 == 119 && this.f35007w != null) {
                this.f35007w.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f35007w;
    }
}
