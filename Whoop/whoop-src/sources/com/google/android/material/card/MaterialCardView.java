package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import cr.AbstractC11075m;
import kr.C22788g;
import kr.C22791j;
import kr.C22792k;
import kr.InterfaceC22803v;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31484o;
import p467rq.C31647c;
import p467rq.InterfaceC31645a;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.AbstractC30060g;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC22803v {

    /* JADX INFO: renamed from: L */
    public static final int[] f20857L = {R.attr.state_checkable};

    /* JADX INFO: renamed from: M */
    public static final int[] f20858M = {R.attr.state_checked};

    /* JADX INFO: renamed from: N */
    public static final int[] f20859N = {com.whoop.android.R.attr.state_dragged};

    /* JADX INFO: renamed from: H */
    public final C31647c f20860H;

    /* JADX INFO: renamed from: I */
    public final boolean f20861I;

    /* JADX INFO: renamed from: J */
    public boolean f20862J;

    /* JADX INFO: renamed from: K */
    public boolean f20863K;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, com.whoop.android.R.attr.materialCardViewStyle, com.whoop.android.R.style.Widget_MaterialComponents_CardView), attributeSet, com.whoop.android.R.attr.materialCardViewStyle);
        this.f20862J = false;
        this.f20863K = false;
        this.f20861I = true;
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(getContext(), attributeSet, AbstractC21885a.f84564x, com.whoop.android.R.attr.materialCardViewStyle, com.whoop.android.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C31647c c31647c = new C31647c(this, attributeSet);
        this.f20860H = c31647c;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C22788g c22788g = c31647c.f130789c;
        c22788g.m66011m(cardBackgroundColor);
        c31647c.f130788b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c31647c.m97815l();
        MaterialCardView materialCardView = c31647c.f130787a;
        ColorStateList colorStateListM65695C = AbstractC22674j.m65695C(typedArrayM29873g, materialCardView.getContext(), 11);
        c31647c.f130800n = colorStateListM65695C;
        if (colorStateListM65695C == null) {
            c31647c.f130800n = ColorStateList.valueOf(-1);
        }
        c31647c.f130794h = typedArrayM29873g.getDimensionPixelSize(12, 0);
        boolean z4 = typedArrayM29873g.getBoolean(0, false);
        c31647c.f130805s = z4;
        materialCardView.setLongClickable(z4);
        c31647c.f130798l = AbstractC22674j.m65695C(typedArrayM29873g, materialCardView.getContext(), 6);
        c31647c.m97810g(AbstractC22674j.m65698F(typedArrayM29873g, materialCardView.getContext(), 2));
        c31647c.f130792f = typedArrayM29873g.getDimensionPixelSize(5, 0);
        c31647c.f130791e = typedArrayM29873g.getDimensionPixelSize(4, 0);
        c31647c.f130793g = typedArrayM29873g.getInteger(3, 8388661);
        ColorStateList colorStateListM65695C2 = AbstractC22674j.m65695C(typedArrayM29873g, materialCardView.getContext(), 7);
        c31647c.f130797k = colorStateListM65695C2;
        if (colorStateListM65695C2 == null) {
            c31647c.f130797k = ColorStateList.valueOf(AbstractC31484o.m96969u(materialCardView, com.whoop.android.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListM65695C3 = AbstractC22674j.m65695C(typedArrayM29873g, materialCardView.getContext(), 1);
        colorStateListM65695C3 = colorStateListM65695C3 == null ? ColorStateList.valueOf(0) : colorStateListM65695C3;
        C22788g c22788g2 = c31647c.f130790d;
        c22788g2.m66011m(colorStateListM65695C3);
        RippleDrawable rippleDrawable = c31647c.f130801o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c31647c.f130797k);
        }
        c22788g.m66010l(materialCardView.getCardElevation());
        float f13 = c31647c.f130794h;
        ColorStateList colorStateList = c31647c.f130800n;
        c22788g2.m66017s(f13);
        c22788g2.m66015q(colorStateList);
        materialCardView.setBackgroundInternal(c31647c.m97807d(c22788g));
        Drawable drawableM97806c = c31647c.m97813j() ? c31647c.m97806c() : c22788g2;
        c31647c.f130795i = drawableM97806c;
        materialCardView.setForeground(c31647c.m97807d(drawableM97806c));
        typedArrayM29873g.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f20860H.f130789c.getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: b */
    public final void m15725b() {
        C31647c c31647c = this.f20860H;
        RippleDrawable rippleDrawable = c31647c.f130801o;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i13 = bounds.bottom;
            c31647c.f130801o.setBounds(bounds.left, bounds.top, bounds.right, i13 - 1);
            c31647c.f130801o.setBounds(bounds.left, bounds.top, bounds.right, i13);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f20860H.f130789c.f89748w.f89712c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f20860H.f130790d.f89748w.f89712c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f20860H.f130796j;
    }

    public int getCheckedIconGravity() {
        return this.f20860H.f130793g;
    }

    public int getCheckedIconMargin() {
        return this.f20860H.f130791e;
    }

    public int getCheckedIconSize() {
        return this.f20860H.f130792f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f20860H.f130798l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f20860H.f130788b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f20860H.f130788b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f20860H.f130788b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f20860H.f130788b.top;
    }

    public float getProgress() {
        return this.f20860H.f130789c.f89748w.f89719j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f20860H.f130789c.m66007i();
    }

    public ColorStateList getRippleColor() {
        return this.f20860H.f130797k;
    }

    public C22792k getShapeAppearanceModel() {
        return this.f20860H.f130799m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f20860H.f130800n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f20860H.f130800n;
    }

    public int getStrokeWidth() {
        return this.f20860H.f130794h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f20862J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31647c c31647c = this.f20860H;
        c31647c.m97814k();
        AbstractC32411b.m101088c0(this, c31647c.f130789c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 3);
        C31647c c31647c = this.f20860H;
        if (c31647c != null && c31647c.f130805s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20857L);
        }
        if (this.f20862J) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20858M);
        }
        if (this.f20863K) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20859N);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f20862J);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C31647c c31647c = this.f20860H;
        accessibilityNodeInfo.setCheckable(c31647c != null && c31647c.f130805s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f20862J);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        this.f20860H.m97808e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f20861I) {
            C31647c c31647c = this.f20860H;
            if (!c31647c.f130804r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c31647c.f130804r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i13) {
        this.f20860H.f130789c.m66011m(ColorStateList.valueOf(i13));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f13) {
        super.setCardElevation(f13);
        C31647c c31647c = this.f20860H;
        c31647c.f130789c.m66010l(c31647c.f130787a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C22788g c22788g = this.f20860H.f130790d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c22788g.m66011m(colorStateList);
    }

    public void setCheckable(boolean z4) {
        this.f20860H.f130805s = z4;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (this.f20862J != z4) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f20860H.m97810g(drawable);
    }

    public void setCheckedIconGravity(int i13) {
        C31647c c31647c = this.f20860H;
        if (c31647c.f130793g != i13) {
            c31647c.f130793g = i13;
            MaterialCardView materialCardView = c31647c.f130787a;
            c31647c.m97808e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i13) {
        this.f20860H.f130791e = i13;
    }

    public void setCheckedIconMarginResource(int i13) {
        if (i13 != -1) {
            this.f20860H.f130791e = getResources().getDimensionPixelSize(i13);
        }
    }

    public void setCheckedIconResource(int i13) {
        this.f20860H.m97810g(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setCheckedIconSize(int i13) {
        this.f20860H.f130792f = i13;
    }

    public void setCheckedIconSizeResource(int i13) {
        if (i13 != 0) {
            this.f20860H.f130792f = getResources().getDimensionPixelSize(i13);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C31647c c31647c = this.f20860H;
        c31647c.f130798l = colorStateList;
        Drawable drawable = c31647c.f130796j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        super.setClickable(z4);
        C31647c c31647c = this.f20860H;
        if (c31647c != null) {
            c31647c.m97814k();
        }
    }

    public void setDragged(boolean z4) {
        if (this.f20863K != z4) {
            this.f20863K = z4;
            refreshDrawableState();
            m15725b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f13) {
        super.setMaxCardElevation(f13);
        this.f20860H.m97816m();
    }

    public void setOnCheckedChangeListener(InterfaceC31645a interfaceC31645a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z4) {
        super.setPreventCornerOverlap(z4);
        C31647c c31647c = this.f20860H;
        c31647c.m97816m();
        c31647c.m97815l();
    }

    public void setProgress(float f13) {
        C31647c c31647c = this.f20860H;
        c31647c.f130789c.m66012n(f13);
        C22788g c22788g = c31647c.f130790d;
        if (c22788g != null) {
            c22788g.m66012n(f13);
        }
        C22788g c22788g2 = c31647c.f130803q;
        if (c22788g2 != null) {
            c22788g2.m66012n(f13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f13) {
        super.setRadius(f13);
        C31647c c31647c = this.f20860H;
        C22791j c22791jM66029e = c31647c.f130799m.m66029e();
        c22791jM66029e.m66022b(f13);
        c31647c.m97811h(c22791jM66029e.m66021a());
        c31647c.f130795i.invalidateSelf();
        if (c31647c.m97812i()) {
            c31647c.m97815l();
        } else if (c31647c.f130787a.getPreventCornerOverlap()) {
            C22788g c22788g = c31647c.f130789c;
            if (!c22788g.f89748w.f89710a.m66028d(c22788g.m66006h())) {
                c31647c.m97815l();
            }
        }
        if (c31647c.m97812i()) {
            c31647c.m97816m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C31647c c31647c = this.f20860H;
        c31647c.f130797k = colorStateList;
        RippleDrawable rippleDrawable = c31647c.f130801o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i13) {
        ColorStateList colorStateList = AbstractC32122c.getColorStateList(getContext(), i13);
        C31647c c31647c = this.f20860H;
        c31647c.f130797k = colorStateList;
        RippleDrawable rippleDrawable = c31647c.f130801o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // kr.InterfaceC22803v
    public void setShapeAppearanceModel(C22792k c22792k) {
        setClipToOutline(c22792k.m66028d(getBoundsAsRectF()));
        this.f20860H.m97811h(c22792k);
    }

    public void setStrokeColor(int i13) {
        setStrokeColor(ColorStateList.valueOf(i13));
    }

    public void setStrokeWidth(int i13) {
        C31647c c31647c = this.f20860H;
        if (i13 != c31647c.f130794h) {
            c31647c.f130794h = i13;
            C22788g c22788g = c31647c.f130790d;
            ColorStateList colorStateList = c31647c.f130800n;
            c22788g.m66017s(i13);
            c22788g.m66015q(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z4) {
        super.setUseCompatPadding(z4);
        C31647c c31647c = this.f20860H;
        c31647c.m97816m();
        c31647c.m97815l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C31647c c31647c = this.f20860H;
        if (c31647c != null && c31647c.f130805s && isEnabled()) {
            this.f20862J = !this.f20862J;
            refreshDrawableState();
            m15725b();
            c31647c.m97809f(this.f20862J, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C31647c c31647c = this.f20860H;
        if (c31647c.f130800n != colorStateList) {
            c31647c.f130800n = colorStateList;
            C22788g c22788g = c31647c.f130790d;
            c22788g.m66017s(c31647c.f130794h);
            c22788g.m66015q(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f20860H.f130789c.m66011m(colorStateList);
    }
}
