package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.android.R;
import p290l.AbstractC22932a;
import p461rh.C31422k;
import p474s.AbstractC31955f2;

/* JADX INFO: loaded from: classes5.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public Drawable f4249E;

    /* JADX INFO: renamed from: F */
    public Drawable f4250F;

    /* JADX INFO: renamed from: G */
    public final boolean f4251G;

    /* JADX INFO: renamed from: H */
    public boolean f4252H;

    /* JADX INFO: renamed from: I */
    public final int f4253I;

    /* JADX INFO: renamed from: w */
    public boolean f4254w;

    /* JADX INFO: renamed from: x */
    public View f4255x;

    /* JADX INFO: renamed from: y */
    public View f4256y;

    /* JADX INFO: renamed from: z */
    public Drawable f4257z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C31422k(this, 1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90508a);
        boolean z4 = false;
        this.f4257z = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f4249E = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f4253I = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4251G = true;
            this.f4250F = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4251G ? !(this.f4257z != null || this.f4249E != null) : this.f4250F == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4257z;
        if (drawable != null && drawable.isStateful()) {
            this.f4257z.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4249E;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4249E.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4250F;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4250F.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4257z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4249E;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4250F;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4255x = findViewById(R.id.action_bar);
        this.f4256y = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4254w || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        boolean z13 = true;
        if (this.f4251G) {
            Drawable drawable = this.f4250F;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z13 = false;
            }
        } else {
            if (this.f4257z == null) {
                z13 = false;
            } else if (this.f4255x.getVisibility() == 0) {
                this.f4257z.setBounds(this.f4255x.getLeft(), this.f4255x.getTop(), this.f4255x.getRight(), this.f4255x.getBottom());
            } else {
                View view = this.f4256y;
                if (view == null || view.getVisibility() != 0) {
                    this.f4257z.setBounds(0, 0, 0, 0);
                } else {
                    this.f4257z.setBounds(this.f4256y.getLeft(), this.f4256y.getTop(), this.f4256y.getRight(), this.f4256y.getBottom());
                }
            }
            this.f4252H = false;
        }
        if (z13) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        if (this.f4255x == null && View.MeasureSpec.getMode(i14) == Integer.MIN_VALUE && (i15 = this.f4253I) >= 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(Math.min(i15, View.MeasureSpec.getSize(i14)), Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
        if (this.f4255x == null) {
            return;
        }
        View.MeasureSpec.getMode(i14);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4257z;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4257z);
        }
        this.f4257z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4255x;
            if (view != null) {
                this.f4257z.setBounds(view.getLeft(), this.f4255x.getTop(), this.f4255x.getRight(), this.f4255x.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f4251G ? !(this.f4257z != null || this.f4249E != null) : this.f4250F == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4250F;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4250F);
        }
        this.f4250F = drawable;
        boolean z4 = this.f4251G;
        boolean z13 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f4250F) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f4257z != null || this.f4249E != null) : this.f4250F == null) {
            z13 = true;
        }
        setWillNotDraw(z13);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4249E;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4249E);
        }
        this.f4249E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4252H && this.f4249E != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f4251G ? !(this.f4257z != null || this.f4249E != null) : this.f4250F == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC31955f2 abstractC31955f2) {
    }

    public void setTransitioning(boolean z4) {
        this.f4254w = z4;
        setDescendantFocusability(z4 ? 393216 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z4 = i13 == 0;
        Drawable drawable = this.f4257z;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f4249E;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f4250F;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4257z;
        boolean z4 = this.f4251G;
        if (drawable == drawable2 && !z4) {
            return true;
        }
        if (drawable == this.f4249E && this.f4252H) {
            return true;
        }
        return (drawable == this.f4250F && z4) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i13) {
        if (i13 != 0) {
            return super.startActionModeForChild(view, callback, i13);
        }
        return null;
    }
}
