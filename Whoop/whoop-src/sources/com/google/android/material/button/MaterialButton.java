package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import cr.AbstractC11075m;
import ir.AbstractC20858a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kr.C22791j;
import kr.C22792k;
import kr.InterfaceC22803v;
import p000.AbstractC11266d;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p434qq.C30542b;
import p434qq.C30543c;
import p434qq.InterfaceC30541a;
import p435qr.AbstractC30554a;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22674j;
import q30.C29934u0;
import q83.AbstractC30060g;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC22803v {

    /* JADX INFO: renamed from: R */
    public static final int[] f20830R = {R.attr.state_checkable};

    /* JADX INFO: renamed from: S */
    public static final int[] f20831S = {R.attr.state_checked};

    /* JADX INFO: renamed from: E */
    public final LinkedHashSet f20832E;

    /* JADX INFO: renamed from: F */
    public InterfaceC30541a f20833F;

    /* JADX INFO: renamed from: G */
    public PorterDuff.Mode f20834G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f20835H;

    /* JADX INFO: renamed from: I */
    public Drawable f20836I;

    /* JADX INFO: renamed from: J */
    public String f20837J;

    /* JADX INFO: renamed from: K */
    public int f20838K;

    /* JADX INFO: renamed from: L */
    public int f20839L;

    /* JADX INFO: renamed from: M */
    public int f20840M;

    /* JADX INFO: renamed from: N */
    public int f20841N;

    /* JADX INFO: renamed from: O */
    public boolean f20842O;

    /* JADX INFO: renamed from: P */
    public boolean f20843P;

    /* JADX INFO: renamed from: Q */
    public int f20844Q;

    /* JADX INFO: renamed from: z */
    public final C30543c f20845z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.whoop.android.R.attr.materialButtonStyle);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i13 = 0; i13 < lineCount; i13++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i13));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15716a() {
        C30543c c30543c = this.f20845z;
        return (c30543c == null || c30543c.f125694o) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m15717b() {
        int i13 = this.f20844Q;
        if (i13 == 1 || i13 == 2) {
            setCompoundDrawablesRelative(this.f20836I, null, null, null);
            return;
        }
        if (i13 == 3 || i13 == 4) {
            setCompoundDrawablesRelative(null, null, this.f20836I, null);
        } else if (i13 == 16 || i13 == 32) {
            setCompoundDrawablesRelative(null, this.f20836I, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15718c(boolean z4) {
        Drawable drawable = this.f20836I;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f20836I = drawableMutate;
            drawableMutate.setTintList(this.f20835H);
            PorterDuff.Mode mode = this.f20834G;
            if (mode != null) {
                this.f20836I.setTintMode(mode);
            }
            int intrinsicWidth = this.f20838K;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f20836I.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f20838K;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f20836I.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f20836I;
            int i13 = this.f20839L;
            int i14 = this.f20840M;
            drawable2.setBounds(i13, i14, intrinsicWidth + i13, intrinsicHeight + i14);
            this.f20836I.setVisible(true, z4);
        }
        if (z4) {
            m15717b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i15 = this.f20844Q;
        if (((i15 == 1 || i15 == 2) && drawable3 != this.f20836I) || (((i15 == 3 || i15 == 4) && drawable5 != this.f20836I) || ((i15 == 16 || i15 == 32) && drawable4 != this.f20836I))) {
            m15717b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15719d(int i13, int i14) {
        if (this.f20836I == null || getLayout() == null) {
            return;
        }
        int i15 = this.f20844Q;
        if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4) {
            if (i15 == 16 || i15 == 32) {
                this.f20839L = 0;
                if (i15 == 16) {
                    this.f20840M = 0;
                    m15718c(false);
                    return;
                }
                int intrinsicHeight = this.f20838K;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f20836I.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i14 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f20841N) - getPaddingBottom()) / 2);
                if (this.f20840M != iMax) {
                    this.f20840M = iMax;
                    m15718c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f20840M = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i16 = this.f20844Q;
        if (i16 == 1 || i16 == 3 || ((i16 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i16 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f20839L = 0;
            m15718c(false);
            return;
        }
        int intrinsicWidth = this.f20838K;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f20836I.getIntrinsicWidth();
        }
        int textLayoutWidth = i13 - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f20841N) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f20844Q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f20839L != paddingEnd) {
            this.f20839L = paddingEnd;
            m15718c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f20837J)) {
            return this.f20837J;
        }
        C30543c c30543c = this.f20845z;
        return ((c30543c == null || !c30543c.f125696q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m15716a()) {
            return this.f20845z.f125686g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f20836I;
    }

    public int getIconGravity() {
        return this.f20844Q;
    }

    public int getIconPadding() {
        return this.f20841N;
    }

    public int getIconSize() {
        return this.f20838K;
    }

    public ColorStateList getIconTint() {
        return this.f20835H;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f20834G;
    }

    public int getInsetBottom() {
        return this.f20845z.f125685f;
    }

    public int getInsetTop() {
        return this.f20845z.f125684e;
    }

    public ColorStateList getRippleColor() {
        if (m15716a()) {
            return this.f20845z.f125691l;
        }
        return null;
    }

    public C22792k getShapeAppearanceModel() {
        if (m15716a()) {
            return this.f20845z.f125681b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m15716a()) {
            return this.f20845z.f125690k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m15716a()) {
            return this.f20845z.f125687h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return m15716a() ? this.f20845z.f125689j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m15716a() ? this.f20845z.f125688i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f20842O;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m15716a()) {
            AbstractC32411b.m101088c0(this, this.f20845z.m93630b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        C30543c c30543c = this.f20845z;
        if (c30543c != null && c30543c.f125696q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20830R);
        }
        if (this.f20842O) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20831S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f20842O);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C30543c c30543c = this.f20845z;
        accessibilityNodeInfo.setCheckable(c30543c != null && c30543c.f125696q);
        accessibilityNodeInfo.setChecked(this.f20842O);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        m15719d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C30542b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C30542b c30542b = (C30542b) parcelable;
        super.onRestoreInstanceState(c30542b.m113141b());
        setChecked(c30542b.f125679y);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C30542b c30542b = new C30542b(super.onSaveInstanceState());
        c30542b.f125679y = this.f20842O;
        return c30542b;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        m15719d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f20845z.f125697r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f20836I != null) {
            if (this.f20836I.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f20837J = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        if (!m15716a()) {
            super.setBackgroundColor(i13);
            return;
        }
        C30543c c30543c = this.f20845z;
        if (c30543c.m93630b(false) != null) {
            c30543c.m93630b(false).setTint(i13);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m15716a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C30543c c30543c = this.f20845z;
        c30543c.f125694o = true;
        MaterialButton materialButton = c30543c.f125680a;
        materialButton.setSupportBackgroundTintList(c30543c.f125689j);
        materialButton.setSupportBackgroundTintMode(c30543c.f125688i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i13) {
        setBackgroundDrawable(i13 != 0 ? AbstractC30060g.m92133x(getContext(), i13) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (m15716a()) {
            this.f20845z.f125696q = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        C30543c c30543c = this.f20845z;
        if (c30543c == null || !c30543c.f125696q || !isEnabled() || this.f20842O == z4) {
            return;
        }
        this.f20842O = z4;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z13 = this.f20842O;
            if (!materialButtonToggleGroup.f20848F) {
                materialButtonToggleGroup.m15721b(getId(), z13);
            }
        }
        if (this.f20843P) {
            return;
        }
        this.f20843P = true;
        Iterator it = this.f20832E.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        this.f20843P = false;
    }

    public void setCornerRadius(int i13) {
        if (m15716a()) {
            C30543c c30543c = this.f20845z;
            if (c30543c.f125695p && c30543c.f125686g == i13) {
                return;
            }
            c30543c.f125686g = i13;
            c30543c.f125695p = true;
            C22791j c22791jM66029e = c30543c.f125681b.m66029e();
            c22791jM66029e.m66022b(i13);
            c30543c.m93631c(c22791jM66029e.m66021a());
        }
    }

    public void setCornerRadiusResource(int i13) {
        if (m15716a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i13));
        }
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        if (m15716a()) {
            this.f20845z.m93630b(false).m66010l(f13);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f20836I != drawable) {
            this.f20836I = drawable;
            m15718c(true);
            m15719d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i13) {
        if (this.f20844Q != i13) {
            this.f20844Q = i13;
            m15719d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i13) {
        if (this.f20841N != i13) {
            this.f20841N = i13;
            setCompoundDrawablePadding(i13);
        }
    }

    public void setIconResource(int i13) {
        setIcon(i13 != 0 ? AbstractC30060g.m92133x(getContext(), i13) : null);
    }

    public void setIconSize(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f20838K != i13) {
            this.f20838K = i13;
            m15718c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f20835H != colorStateList) {
            this.f20835H = colorStateList;
            m15718c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f20834G != mode) {
            this.f20834G = mode;
            m15718c(false);
        }
    }

    public void setIconTintResource(int i13) {
        setIconTint(AbstractC32122c.getColorStateList(getContext(), i13));
    }

    public void setInsetBottom(int i13) {
        C30543c c30543c = this.f20845z;
        c30543c.m93632d(c30543c.f125684e, i13);
    }

    public void setInsetTop(int i13) {
        C30543c c30543c = this.f20845z;
        c30543c.m93632d(i13, c30543c.f125685f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC30541a interfaceC30541a) {
        this.f20833F = interfaceC30541a;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        InterfaceC30541a interfaceC30541a = this.f20833F;
        if (interfaceC30541a != null) {
            ((MaterialButtonToggleGroup) ((C29934u0) interfaceC30541a).f122249x).invalidate();
        }
        super.setPressed(z4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m15716a()) {
            C30543c c30543c = this.f20845z;
            MaterialButton materialButton = c30543c.f125680a;
            if (c30543c.f125691l != colorStateList) {
                c30543c.f125691l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC20858a.m57613b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i13) {
        if (m15716a()) {
            setRippleColor(AbstractC32122c.getColorStateList(getContext(), i13));
        }
    }

    @Override // kr.InterfaceC22803v
    public void setShapeAppearanceModel(C22792k c22792k) {
        if (!m15716a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f20845z.m93631c(c22792k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (m15716a()) {
            C30543c c30543c = this.f20845z;
            c30543c.f125693n = z4;
            c30543c.m93634f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m15716a()) {
            C30543c c30543c = this.f20845z;
            if (c30543c.f125690k != colorStateList) {
                c30543c.f125690k = colorStateList;
                c30543c.m93634f();
            }
        }
    }

    public void setStrokeColorResource(int i13) {
        if (m15716a()) {
            setStrokeColor(AbstractC32122c.getColorStateList(getContext(), i13));
        }
    }

    public void setStrokeWidth(int i13) {
        if (m15716a()) {
            C30543c c30543c = this.f20845z;
            if (c30543c.f125687h != i13) {
                c30543c.f125687h = i13;
                c30543c.m93634f();
            }
        }
    }

    public void setStrokeWidthResource(int i13) {
        if (m15716a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i13));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m15716a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C30543c c30543c = this.f20845z;
        if (c30543c.f125689j != colorStateList) {
            c30543c.f125689j = colorStateList;
            if (c30543c.m93630b(false) != null) {
                c30543c.m93630b(false).setTintList(c30543c.f125689j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m15716a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C30543c c30543c = this.f20845z;
        if (c30543c.f125688i != mode) {
            c30543c.f125688i = mode;
            if (c30543c.m93630b(false) == null || c30543c.f125688i == null) {
                return;
            }
            c30543c.m93630b(false).setTintMode(c30543c.f125688i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i13) {
        super.setTextAlignment(i13);
        m15719d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z4) {
        this.f20845z.f125697r = z4;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f20842O);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i13) {
        super(AbstractC30554a.m93706a(context, attributeSet, i13, com.whoop.android.R.style.Widget_MaterialComponents_Button), attributeSet, i13);
        this.f20832E = new LinkedHashSet();
        this.f20842O = false;
        this.f20843P = false;
        Context context2 = getContext();
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context2, attributeSet, AbstractC21885a.f84560t, i13, com.whoop.android.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f20841N = typedArrayM29873g.getDimensionPixelSize(12, 0);
        int i14 = typedArrayM29873g.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f20834G = AbstractC11075m.m29874h(i14, mode);
        this.f20835H = AbstractC22674j.m65695C(typedArrayM29873g, getContext(), 14);
        this.f20836I = AbstractC22674j.m65698F(typedArrayM29873g, getContext(), 10);
        this.f20844Q = typedArrayM29873g.getInteger(11, 1);
        this.f20838K = typedArrayM29873g.getDimensionPixelSize(13, 0);
        C30543c c30543c = new C30543c(this, C22792k.m66026b(context2, attributeSet, i13, com.whoop.android.R.style.Widget_MaterialComponents_Button).m66021a());
        this.f20845z = c30543c;
        c30543c.f125682c = typedArrayM29873g.getDimensionPixelOffset(1, 0);
        c30543c.f125683d = typedArrayM29873g.getDimensionPixelOffset(2, 0);
        c30543c.f125684e = typedArrayM29873g.getDimensionPixelOffset(3, 0);
        c30543c.f125685f = typedArrayM29873g.getDimensionPixelOffset(4, 0);
        if (typedArrayM29873g.hasValue(8)) {
            int dimensionPixelSize = typedArrayM29873g.getDimensionPixelSize(8, -1);
            c30543c.f125686g = dimensionPixelSize;
            C22791j c22791jM66029e = c30543c.f125681b.m66029e();
            c22791jM66029e.m66022b(dimensionPixelSize);
            c30543c.m93631c(c22791jM66029e.m66021a());
            c30543c.f125695p = true;
        }
        c30543c.f125687h = typedArrayM29873g.getDimensionPixelSize(20, 0);
        c30543c.f125688i = AbstractC11075m.m29874h(typedArrayM29873g.getInt(7, -1), mode);
        c30543c.f125689j = AbstractC22674j.m65695C(typedArrayM29873g, getContext(), 6);
        c30543c.f125690k = AbstractC22674j.m65695C(typedArrayM29873g, getContext(), 19);
        c30543c.f125691l = AbstractC22674j.m65695C(typedArrayM29873g, getContext(), 16);
        c30543c.f125696q = typedArrayM29873g.getBoolean(5, false);
        c30543c.f125699t = typedArrayM29873g.getDimensionPixelSize(9, 0);
        c30543c.f125697r = typedArrayM29873g.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM29873g.hasValue(0)) {
            c30543c.f125694o = true;
            setSupportBackgroundTintList(c30543c.f125689j);
            setSupportBackgroundTintMode(c30543c.f125688i);
        } else {
            c30543c.m93633e();
        }
        setPaddingRelative(paddingStart + c30543c.f125682c, paddingTop + c30543c.f125684e, paddingEnd + c30543c.f125683d, paddingBottom + c30543c.f125685f);
        typedArrayM29873g.recycle();
        setCompoundDrawablePadding(this.f20841N);
        m15718c(this.f20836I != null);
    }
}
