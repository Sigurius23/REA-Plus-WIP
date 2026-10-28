package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C1661b0;
import ar.AbstractC1923k;
import ar.C1914b;
import ar.C1916d;
import ar.C1925m;
import ar.ViewTreeObserverOnPreDrawListenerC1919g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whoop.android.R;
import cr.AbstractC11066d;
import cr.AbstractC11075m;
import cr.AbstractC11079q;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kr.C22788g;
import kr.C22792k;
import kr.InterfaceC22803v;
import nr.C27067a;
import p076d.C11311s;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p287kq.C22770e;
import p413q4.AbstractC29957b;
import p413q4.C29960e;
import p413q4.InterfaceC29956a;
import p435qr.AbstractC30554a;
import p474s.C31992p;
import p474s.C32008t;
import p689zq.InterfaceC40954a;
import p715kotlin.jvm.internal.AbstractC22674j;
import ro.C31624i;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
public class FloatingActionButton extends AbstractC11079q implements InterfaceC40954a, InterfaceC22803v, InterfaceC29956a {

    /* JADX INFO: renamed from: E */
    public PorterDuff.Mode f20983E;

    /* JADX INFO: renamed from: F */
    public ColorStateList f20984F;

    /* JADX INFO: renamed from: G */
    public int f20985G;

    /* JADX INFO: renamed from: H */
    public int f20986H;

    /* JADX INFO: renamed from: I */
    public int f20987I;

    /* JADX INFO: renamed from: J */
    public int f20988J;

    /* JADX INFO: renamed from: K */
    public boolean f20989K;

    /* JADX INFO: renamed from: L */
    public final Rect f20990L;

    /* JADX INFO: renamed from: M */
    public final Rect f20991M;

    /* JADX INFO: renamed from: N */
    public final C32008t f20992N;

    /* JADX INFO: renamed from: O */
    public final C11311s f20993O;

    /* JADX INFO: renamed from: P */
    public C1925m f20994P;

    /* JADX INFO: renamed from: x */
    public ColorStateList f20995x;

    /* JADX INFO: renamed from: y */
    public PorterDuff.Mode f20996y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f20997z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f35041w = getVisibility();
        this.f20990L = new Rect();
        this.f20991M = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context2, attributeSet, AbstractC21885a.f84555o, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f20995x = AbstractC22674j.m65695C(typedArrayM29873g, context2, 1);
        this.f20996y = AbstractC11075m.m29874h(typedArrayM29873g.getInt(2, -1), null);
        this.f20984F = AbstractC22674j.m65695C(typedArrayM29873g, context2, 12);
        this.f20985G = typedArrayM29873g.getInt(7, -1);
        this.f20986H = typedArrayM29873g.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayM29873g.getDimensionPixelSize(3, 0);
        float dimension = typedArrayM29873g.getDimension(4, 0.0f);
        float dimension2 = typedArrayM29873g.getDimension(9, 0.0f);
        float dimension3 = typedArrayM29873g.getDimension(11, 0.0f);
        this.f20989K = typedArrayM29873g.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayM29873g.getDimensionPixelSize(10, 0));
        C22770e c22770eM65972a = C22770e.m65972a(typedArrayM29873g, context2, 15);
        C22770e c22770eM65972a2 = C22770e.m65972a(typedArrayM29873g, context2, 8);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC21885a.f84524A, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C22792k c22792kM66021a = C22792k.m66025a(context2, resourceId, resourceId2, C22792k.f89765m).m66021a();
        boolean z4 = typedArrayM29873g.getBoolean(5, false);
        setEnabled(typedArrayM29873g.getBoolean(0, true));
        typedArrayM29873g.recycle();
        C32008t c32008t = new C32008t(this);
        this.f20992N = c32008t;
        c32008t.m99560b(attributeSet, R.attr.floatingActionButtonStyle);
        C11311s c11311s = new C11311s();
        c11311s.f36245b = false;
        c11311s.f36244a = 0;
        c11311s.f36246c = this;
        this.f20993O = c11311s;
        getImpl().m5889n(c22792kM66021a);
        getImpl().mo5882g(this.f20995x, this.f20996y, this.f20984F, dimensionPixelSize);
        getImpl().f7627k = dimensionPixelSize2;
        AbstractC1923k impl = getImpl();
        if (impl.f7624h != dimension) {
            impl.f7624h = dimension;
            impl.mo5886k(dimension, impl.f7625i, impl.f7626j);
        }
        AbstractC1923k impl2 = getImpl();
        if (impl2.f7625i != dimension2) {
            impl2.f7625i = dimension2;
            impl2.mo5886k(impl2.f7624h, dimension2, impl2.f7626j);
        }
        AbstractC1923k impl3 = getImpl();
        if (impl3.f7626j != dimension3) {
            impl3.f7626j = dimension3;
            impl3.mo5886k(impl3.f7624h, impl3.f7625i, dimension3);
        }
        getImpl().f7629m = c22770eM65972a;
        getImpl().f7630n = c22770eM65972a2;
        getImpl().f7622f = z4;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private AbstractC1923k getImpl() {
        if (this.f20994P == null) {
            this.f20994P = new C1925m(this, new C31624i(this, 5));
        }
        return this.f20994P;
    }

    /* JADX INFO: renamed from: c */
    public final int m15765c(int i13) {
        int i14 = this.f20986H;
        if (i14 != 0) {
            return i14;
        }
        Resources resources = getResources();
        if (i13 != -1) {
            return i13 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m15765c(1) : m15765c(0);
    }

    /* JADX INFO: renamed from: d */
    public final void m15766d() {
        AbstractC1923k impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f7635s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f7634r == 1) {
                return;
            }
        } else if (impl.f7634r != 2) {
            return;
        }
        Animator animator = impl.f7628l;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f7635s;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.m29875a(4, false);
            return;
        }
        C22770e c22770e = impl.f7630n;
        AnimatorSet animatorSetM5878b = c22770e != null ? impl.m5878b(c22770e, 0.0f, 0.0f, 0.0f) : impl.m5879c(0.0f, 0.4f, 0.4f, AbstractC1923k.f7608C, AbstractC1923k.f7609D);
        animatorSetM5878b.addListener(new C1661b0(impl));
        animatorSetM5878b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo5885j(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public final void m15767e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f20997z;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f20983E;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C31992p.m99506c(colorForState, mode));
    }

    /* JADX INFO: renamed from: f */
    public final void m15768f() {
        AbstractC1923k impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f7635s;
        Matrix matrix = impl.f7640x;
        FloatingActionButton floatingActionButton2 = impl.f7635s;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f7634r == 2) {
                return;
            }
        } else if (impl.f7634r != 1) {
            return;
        }
        Animator animator = impl.f7628l;
        if (animator != null) {
            animator.cancel();
        }
        int i13 = 0;
        boolean z4 = impl.f7629m == null;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.m29875a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f7632p = 1.0f;
            impl.m5877a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z4 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z4 ? 0.4f : 0.0f);
            float f13 = z4 ? 0.4f : 0.0f;
            impl.f7632p = f13;
            impl.m5877a(f13, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        C22770e c22770e = impl.f7629m;
        AnimatorSet animatorSetM5878b = c22770e != null ? impl.m5878b(c22770e, 1.0f, 1.0f, 1.0f) : impl.m5879c(1.0f, 1.0f, 1.0f, AbstractC1923k.f7606A, AbstractC1923k.f7607B);
        animatorSetM5878b.addListener(new C1916d(impl, i13));
        animatorSetM5878b.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f20995x;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f20996y;
    }

    @Override // p413q4.InterfaceC29956a
    public AbstractC29957b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo5880e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f7625i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f7626j;
    }

    public Drawable getContentBackground() {
        return getImpl().f7621e;
    }

    public int getCustomSize() {
        return this.f20986H;
    }

    public int getExpandedComponentIdHint() {
        return this.f20993O.f36244a;
    }

    public C22770e getHideMotionSpec() {
        return getImpl().f7630n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f20984F;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f20984F;
    }

    public C22792k getShapeAppearanceModel() {
        C22792k c22792k = getImpl().f7617a;
        c22792k.getClass();
        return c22792k;
    }

    public C22770e getShowMotionSpec() {
        return getImpl().f7629m;
    }

    public int getSize() {
        return this.f20985G;
    }

    public int getSizeDimension() {
        return m15765c(this.f20985G);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f20997z;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f20983E;
    }

    public boolean getUseCompatPadding() {
        return this.f20989K;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo5883h();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1923k impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f7635s;
        C22788g c22788g = impl.f7618b;
        if (c22788g != null) {
            AbstractC32411b.m101088c0(floatingActionButton, c22788g);
        }
        if (impl instanceof C1925m) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f7641y == null) {
            impl.f7641y = new ViewTreeObserverOnPreDrawListenerC1919g(impl, 0);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f7641y);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1923k impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f7635s.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC1919g viewTreeObserverOnPreDrawListenerC1919g = impl.f7641y;
        if (viewTreeObserverOnPreDrawListenerC1919g != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1919g);
            impl.f7641y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int sizeDimension = getSizeDimension();
        this.f20987I = (sizeDimension - this.f20988J) / 2;
        getImpl().m5892q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i13), View.resolveSize(sizeDimension, i14));
        Rect rect = this.f20990L;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C27067a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C27067a c27067a = (C27067a) parcelable;
        super.onRestoreInstanceState(c27067a.m113141b());
        Bundle bundle = (Bundle) c27067a.f108200y.get("expandableWidgetHelper");
        bundle.getClass();
        C11311s c11311s = this.f20993O;
        c11311s.getClass();
        c11311s.f36245b = bundle.getBoolean("expanded", false);
        c11311s.f36244a = bundle.getInt("expandedComponentIdHint", 0);
        if (c11311s.f36245b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) c11311s.f36246c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m3660f(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C27067a c27067a = new C27067a(parcelableOnSaveInstanceState);
        C11311s c11311s = this.f20993O;
        c11311s.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c11311s.f36245b);
        bundle.putInt("expandedComponentIdHint", c11311s.f36244a);
        c27067a.f108200y.put("expandableWidgetHelper", bundle);
        return c27067a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f20991M;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i13 = rect.left;
            Rect rect2 = this.f20990L;
            rect.left = i13 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            C1925m c1925m = this.f20994P;
            int i14 = -(c1925m.f7622f ? Math.max((c1925m.f7627k - c1925m.f7635s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i14, i14);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f20995x != colorStateList) {
            this.f20995x = colorStateList;
            AbstractC1923k impl = getImpl();
            C22788g c22788g = impl.f7618b;
            if (c22788g != null) {
                c22788g.setTintList(colorStateList);
            }
            C1914b c1914b = impl.f7620d;
            if (c1914b != null) {
                if (colorStateList != null) {
                    c1914b.f7579m = colorStateList.getColorForState(c1914b.getState(), c1914b.f7579m);
                }
                c1914b.f7582p = colorStateList;
                c1914b.f7580n = true;
                c1914b.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f20996y != mode) {
            this.f20996y = mode;
            C22788g c22788g = getImpl().f7618b;
            if (c22788g != null) {
                c22788g.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f13) {
        AbstractC1923k impl = getImpl();
        if (impl.f7624h != f13) {
            impl.f7624h = f13;
            impl.mo5886k(f13, impl.f7625i, impl.f7626j);
        }
    }

    public void setCompatElevationResource(int i13) {
        setCompatElevation(getResources().getDimension(i13));
    }

    public void setCompatHoveredFocusedTranslationZ(float f13) {
        AbstractC1923k impl = getImpl();
        if (impl.f7625i != f13) {
            impl.f7625i = f13;
            impl.mo5886k(impl.f7624h, f13, impl.f7626j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i13) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i13));
    }

    public void setCompatPressedTranslationZ(float f13) {
        AbstractC1923k impl = getImpl();
        if (impl.f7626j != f13) {
            impl.f7626j = f13;
            impl.mo5886k(impl.f7624h, impl.f7625i, f13);
        }
    }

    public void setCompatPressedTranslationZResource(int i13) {
        setCompatPressedTranslationZ(getResources().getDimension(i13));
    }

    public void setCustomSize(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i13 != this.f20986H) {
            this.f20986H = i13;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        C22788g c22788g = getImpl().f7618b;
        if (c22788g != null) {
            c22788g.m66010l(f13);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        if (z4 != getImpl().f7622f) {
            getImpl().f7622f = z4;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i13) {
        this.f20993O.f36244a = i13;
    }

    public void setHideMotionSpec(C22770e c22770e) {
        getImpl().f7630n = c22770e;
    }

    public void setHideMotionSpecResource(int i13) {
        setHideMotionSpec(C22770e.m65973b(getContext(), i13));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            AbstractC1923k impl = getImpl();
            float f13 = impl.f7632p;
            impl.f7632p = f13;
            Matrix matrix = impl.f7640x;
            impl.m5877a(f13, matrix);
            impl.f7635s.setImageMatrix(matrix);
            if (this.f20997z != null) {
                m15767e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        this.f20992N.m99561c(i13);
        m15767e();
    }

    public void setMaxImageSize(int i13) {
        this.f20988J = i13;
        AbstractC1923k impl = getImpl();
        if (impl.f7633q != i13) {
            impl.f7633q = i13;
            float f13 = impl.f7632p;
            impl.f7632p = f13;
            Matrix matrix = impl.f7640x;
            impl.m5877a(f13, matrix);
            impl.f7635s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i13) {
        setRippleColor(ColorStateList.valueOf(i13));
    }

    @Override // android.view.View
    public void setScaleX(float f13) {
        super.setScaleX(f13);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f13) {
        super.setScaleY(f13);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z4) {
        AbstractC1923k impl = getImpl();
        impl.f7623g = z4;
        impl.m5892q();
    }

    @Override // kr.InterfaceC22803v
    public void setShapeAppearanceModel(C22792k c22792k) {
        getImpl().m5889n(c22792k);
    }

    public void setShowMotionSpec(C22770e c22770e) {
        getImpl().f7629m = c22770e;
    }

    public void setShowMotionSpecResource(int i13) {
        setShowMotionSpec(C22770e.m65973b(getContext(), i13));
    }

    public void setSize(int i13) {
        this.f20986H = 0;
        if (i13 != this.f20985G) {
            this.f20985G = i13;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f20997z != colorStateList) {
            this.f20997z = colorStateList;
            m15767e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f20983E != mode) {
            this.f20983E = mode;
            m15767e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f13) {
        super.setTranslationX(f13);
        getImpl().m5887l();
    }

    @Override // android.view.View
    public void setTranslationY(float f13) {
        super.setTranslationY(f13);
        getImpl().m5887l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f13) {
        super.setTranslationZ(f13);
        getImpl().m5887l();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f20989K != z4) {
            this.f20989K = z4;
            getImpl().mo5884i();
        }
    }

    @Override // cr.AbstractC11079q, android.widget.ImageView, android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends AbstractC29957b {

        /* JADX INFO: renamed from: a */
        public Rect f20998a;

        /* JADX INFO: renamed from: b */
        public final boolean f20999b;

        public BaseBehavior() {
            this.f20999b = true;
        }

        /* JADX INFO: renamed from: I */
        public final boolean m15769I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            C29960e c29960e = (C29960e) floatingActionButton.getLayoutParams();
            if (!this.f20999b || c29960e.f122369f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f20998a == null) {
                this.f20998a = new Rect();
            }
            Rect rect = this.f20998a;
            AbstractC11066d.m29858a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m15766d();
                return true;
            }
            floatingActionButton.m15768f();
            return true;
        }

        /* JADX INFO: renamed from: J */
        public final boolean m15770J(View view, FloatingActionButton floatingActionButton) {
            C29960e c29960e = (C29960e) floatingActionButton.getLayoutParams();
            if (!this.f20999b || c29960e.f122369f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((C29960e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m15766d();
                return true;
            }
            floatingActionButton.m15768f();
            return true;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: f */
        public final boolean mo15763f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f20990L;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: k */
        public final void mo15713k(C29960e c29960e) {
            if (c29960e.f122371h == 0) {
                c29960e.f122371h = 80;
            }
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: l */
        public final boolean mo15675l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m15769I(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C29960e ? ((C29960e) layoutParams).f122364a instanceof BottomSheetBehavior : false) {
                    m15770J(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: p */
        public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListM3662k = coordinatorLayout.m3662k(floatingActionButton);
            int size = arrayListM3662k.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                View view2 = (View) arrayListM3662k.get(i15);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof C29960e ? ((C29960e) layoutParams).f122364a instanceof BottomSheetBehavior : false) && m15770J(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m15769I(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m3666q(floatingActionButton, i13);
            Rect rect = floatingActionButton.f20990L;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C29960e c29960e = (C29960e) floatingActionButton.getLayoutParams();
                int i16 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c29960e).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c29960e).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin) {
                    i14 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c29960e).topMargin) {
                    i14 = -rect.top;
                }
                if (i14 != 0) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    floatingActionButton.offsetTopAndBottom(i14);
                }
                if (i16 != 0) {
                    WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                    floatingActionButton.offsetLeftAndRight(i16);
                }
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84556p);
            this.f20999b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f20984F != colorStateList) {
            this.f20984F = colorStateList;
            getImpl().mo5888m(this.f20984F);
        }
    }
}
