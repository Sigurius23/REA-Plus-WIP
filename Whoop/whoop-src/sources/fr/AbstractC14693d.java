package fr;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: fr.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14693d extends ProgressBar {

    /* JADX INFO: renamed from: E */
    public C14690a f54301E;

    /* JADX INFO: renamed from: F */
    public boolean f54302F;

    /* JADX INFO: renamed from: G */
    public int f54303G;

    /* JADX INFO: renamed from: H */
    public final RunnableC14691b f54304H;

    /* JADX INFO: renamed from: I */
    public final RunnableC14691b f54305I;

    /* JADX INFO: renamed from: J */
    public final C14692c f54306J;

    /* JADX INFO: renamed from: K */
    public final C14692c f54307K;

    /* JADX INFO: renamed from: w */
    public final AbstractC14694e f54308w;

    /* JADX INFO: renamed from: x */
    public int f54309x;

    /* JADX INFO: renamed from: y */
    public final boolean f54310y;

    /* JADX INFO: renamed from: z */
    public final int f54311z;

    public AbstractC14693d(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(AbstractC30554a.m93706a(context, attributeSet, i13, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i13);
        this.f54302F = false;
        this.f54303G = 4;
        this.f54304H = new RunnableC14691b(this, 0);
        this.f54305I = new RunnableC14691b(this, 1);
        this.f54306J = new C14692c(this, 0);
        this.f54307K = new C14692c(this, 1);
        Context context2 = getContext();
        this.f54308w = mo15773a(context2, attributeSet);
        AbstractC11075m.m29867a(context2, attributeSet, i13, i14);
        int[] iArr = AbstractC21885a.f84544d;
        AbstractC11075m.m29868b(context2, attributeSet, iArr, i13, i14, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        typedArrayObtainStyledAttributes.getInt(6, -1);
        this.f54311z = Math.min(typedArrayObtainStyledAttributes.getInt(4, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.f54301E = new C14690a();
        this.f54310y = true;
    }

    private AbstractC14704o getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f54366L;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f54343L;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC14694e mo15773a(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: b */
    public void mo15774b(int i13) {
        if (!isIndeterminate()) {
            super.setProgress(i13);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f54309x = i13;
            this.f54302F = true;
            if (getIndeterminateDrawable().isVisible()) {
                C14690a c14690a = this.f54301E;
                ContentResolver contentResolver = getContext().getContentResolver();
                c14690a.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f54367M.mo7246E();
                    return;
                }
            }
            this.f54306J.m42126a(getIndeterminateDrawable());
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42129c() {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f54308w.f54317f;
    }

    public int[] getIndicatorColor() {
        return this.f54308w.f54314c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f54308w.f54318g;
    }

    public int getShowAnimationBehavior() {
        return this.f54308w.f54316e;
    }

    public int getTrackColor() {
        return this.f54308w.f54315d;
    }

    public int getTrackCornerRadius() {
        return this.f54308w.f54313b;
    }

    public int getTrackThickness() {
        return this.f54308w.f54312a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f54367M.mo7245D(this.f54306J);
        }
        C14700k progressDrawable = getProgressDrawable();
        C14692c c14692c = this.f54307K;
        if (progressDrawable != null) {
            C14700k progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f54352F == null) {
                progressDrawable2.f54352F = new ArrayList();
            }
            if (!progressDrawable2.f54352F.contains(c14692c)) {
                progressDrawable2.f54352F.add(c14692c);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C14705p indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f54352F == null) {
                indeterminateDrawable.f54352F = new ArrayList();
            }
            if (!indeterminateDrawable.f54352F.contains(c14692c)) {
                indeterminateDrawable.f54352F.add(c14692c);
            }
        }
        if (m42129c()) {
            if (this.f54311z > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f54305I);
        removeCallbacks(this.f54304H);
        ((AbstractC14702m) getCurrentDrawable()).m42145c(false, false, false);
        C14705p indeterminateDrawable = getIndeterminateDrawable();
        C14692c c14692c = this.f54307K;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().m42146e(c14692c);
            getIndeterminateDrawable().f54367M.mo7252K();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m42146e(c14692c);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i13, int i14) {
        try {
            AbstractC14704o currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.mo42136f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i13) : currentDrawingDelegate.mo42136f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo42135e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i14) : currentDrawingDelegate.mo42135e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i13) {
        super.onVisibilityChanged(view, i13);
        boolean z4 = i13 == 0;
        if (this.f54310y) {
            ((AbstractC14702m) getCurrentDrawable()).m42145c(m42129c(), false, z4);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
        if (this.f54310y) {
            ((AbstractC14702m) getCurrentDrawable()).m42145c(m42129c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C14690a c14690a) {
        this.f54301E = c14690a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f54359y = c14690a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f54359y = c14690a;
        }
    }

    public void setHideAnimationBehavior(int i13) {
        this.f54308w.f54317f = i13;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z4) {
        try {
            if (z4 == isIndeterminate()) {
                return;
            }
            AbstractC14702m abstractC14702m = (AbstractC14702m) getCurrentDrawable();
            if (abstractC14702m != null) {
                abstractC14702m.m42145c(false, false, false);
            }
            super.setIndeterminate(z4);
            AbstractC14702m abstractC14702m2 = (AbstractC14702m) getCurrentDrawable();
            if (abstractC14702m2 != null) {
                abstractC14702m2.m42145c(m42129c(), false, false);
            }
            if ((abstractC14702m2 instanceof C14705p) && m42129c()) {
                ((C14705p) abstractC14702m2).f54367M.mo7250I();
            }
            this.f54302F = false;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C14705p)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((AbstractC14702m) drawable).m42145c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC31484o.m96968t(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f54308w.f54314c = iArr;
        getIndeterminateDrawable().f54367M.mo7269w();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (abstractC14694e.f54318g != i13) {
            abstractC14694e.f54318g = i13;
            abstractC14694e.mo42130a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i13) {
        if (isIndeterminate()) {
            return;
        }
        mo15774b(i13);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof C14700k)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            C14700k c14700k = (C14700k) drawable;
            c14700k.m42145c(false, false, false);
            super.setProgressDrawable(c14700k);
            c14700k.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i13) {
        this.f54308w.f54316e = i13;
        invalidate();
    }

    public void setTrackColor(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (abstractC14694e.f54315d != i13) {
            abstractC14694e.f54315d = i13;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (abstractC14694e.f54313b != i13) {
            abstractC14694e.f54313b = Math.min(i13, abstractC14694e.f54312a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (abstractC14694e.f54312a != i13) {
            abstractC14694e.f54312a = i13;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i13) {
        if (i13 != 0 && i13 != 4 && i13 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f54303G = i13;
    }

    @Override // android.widget.ProgressBar
    public C14705p getIndeterminateDrawable() {
        return (C14705p) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C14700k getProgressDrawable() {
        return (C14700k) super.getProgressDrawable();
    }
}
