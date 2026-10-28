package mr;

import a00.C0072g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.WeakHashMap;
import kr.C22788g;
import kr.C22792k;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p186h8.C16999a;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31484o;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: mr.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25905k extends FrameLayout {

    /* JADX INFO: renamed from: L */
    public static final ViewOnTouchListenerC25904j f102233L = new ViewOnTouchListenerC25904j(0);

    /* JADX INFO: renamed from: E */
    public final float f102234E;

    /* JADX INFO: renamed from: F */
    public final int f102235F;

    /* JADX INFO: renamed from: G */
    public final int f102236G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f102237H;

    /* JADX INFO: renamed from: I */
    public PorterDuff.Mode f102238I;

    /* JADX INFO: renamed from: J */
    public Rect f102239J;

    /* JADX INFO: renamed from: K */
    public boolean f102240K;

    /* JADX INFO: renamed from: w */
    public AbstractC25906l f102241w;

    /* JADX INFO: renamed from: x */
    public final C22792k f102242x;

    /* JADX INFO: renamed from: y */
    public int f102243y;

    /* JADX INFO: renamed from: z */
    public final float f102244z;

    public AbstractC25905k(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC30554a.m93706a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC21885a.f84533J);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47516k(this, dimensionPixelSize);
        }
        this.f102243y = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f102242x = C22792k.m66026b(context2, attributeSet, 0, 0).m66021a();
        }
        this.f102244z = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context2, 4));
        setBackgroundTintMode(AbstractC11075m.m29874h(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f102234E = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f102235F = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f102236G = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f102233L);
        setFocusable(true);
        if (getBackground() == null) {
            int iM96972x = AbstractC31484o.m96972x(getBackgroundOverlayColorAlpha(), AbstractC31484o.m96969u(this, R.attr.colorSurface), AbstractC31484o.m96969u(this, R.attr.colorOnSurface));
            C22792k c22792k = this.f102242x;
            if (c22792k != null) {
                C16999a c16999a = AbstractC25906l.f102248x;
                C22788g c22788g = new C22788g(c22792k);
                c22788g.m66011m(ColorStateList.valueOf(iM96972x));
                drawable = c22788g;
            } else {
                Resources resources = getResources();
                C16999a c16999a2 = AbstractC25906l.f102248x;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM96972x);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f102237H;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(AbstractC25906l abstractC25906l) {
        this.f102241w = abstractC25906l;
    }

    public float getActionTextColorAlpha() {
        return this.f102234E;
    }

    public int getAnimationMode() {
        return this.f102243y;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f102244z;
    }

    public int getMaxInlineActionWidth() {
        return this.f102236G;
    }

    public int getMaxWidth() {
        return this.f102235F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC25906l abstractC25906l = this.f102241w;
        if (abstractC25906l != null) {
            abstractC25906l.m76612c();
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z4;
        super.onDetachedFromWindow();
        AbstractC25906l abstractC25906l = this.f102241w;
        if (abstractC25906l != null) {
            C0072g c0072gM163o = C0072g.m163o();
            C25901g c25901g = abstractC25906l.f102273w;
            synchronized (c0072gM163o.f223x) {
                z4 = true;
                if (!c0072gM163o.m200r(c25901g)) {
                    C25909o c25909o = (C25909o) c0072gM163o.f221E;
                    if (!(c25909o != null && c25909o.f102277a.get() == c25901g)) {
                        z4 = false;
                    }
                }
            }
            if (z4) {
                AbstractC25906l.f102245A.post(new RunnableC25899e(abstractC25906l, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        AbstractC25906l abstractC25906l = this.f102241w;
        if (abstractC25906l == null || !abstractC25906l.f102270t) {
            return;
        }
        abstractC25906l.m76615f();
        abstractC25906l.f102270t = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int i15 = this.f102235F;
        if (i15 <= 0 || getMeasuredWidth() <= i15) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), i14);
    }

    public void setAnimationMode(int i13) {
        this.f102243y = i13;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f102237H != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f102237H);
            drawable.setTintMode(this.f102238I);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f102237H = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f102238I);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f102238I = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f102240K || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f102239J = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        AbstractC25906l abstractC25906l = this.f102241w;
        if (abstractC25906l != null) {
            C16999a c16999a = AbstractC25906l.f102248x;
            abstractC25906l.m76616g();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f102233L);
        super.setOnClickListener(onClickListener);
    }
}
