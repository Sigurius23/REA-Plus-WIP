package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import p032bc.C2939b;
import p184h5.AbstractC16901p0;
import p185h6.C16955j;
import p290l.AbstractC22932a;
import p388p.C28504a;
import p474s.AbstractC31950e1;
import p474s.AbstractC31967i2;
import p474s.C31963h2;
import p474s.C31983m2;
import p474s.C32000r;
import p474s.C32001r0;
import p479s4.AbstractC32122c;
import p550vd.AbstractC35903f;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: u0 */
    public static final C2939b f4351u0 = new C2939b(Float.class, "thumbPos", 12);

    /* JADX INFO: renamed from: v0 */
    public static final int[] f4352v0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: E */
    public boolean f4353E;

    /* JADX INFO: renamed from: F */
    public Drawable f4354F;

    /* JADX INFO: renamed from: G */
    public ColorStateList f4355G;

    /* JADX INFO: renamed from: H */
    public PorterDuff.Mode f4356H;

    /* JADX INFO: renamed from: I */
    public boolean f4357I;

    /* JADX INFO: renamed from: J */
    public boolean f4358J;

    /* JADX INFO: renamed from: K */
    public int f4359K;

    /* JADX INFO: renamed from: L */
    public int f4360L;

    /* JADX INFO: renamed from: M */
    public int f4361M;

    /* JADX INFO: renamed from: N */
    public boolean f4362N;

    /* JADX INFO: renamed from: O */
    public CharSequence f4363O;

    /* JADX INFO: renamed from: P */
    public CharSequence f4364P;

    /* JADX INFO: renamed from: Q */
    public CharSequence f4365Q;

    /* JADX INFO: renamed from: R */
    public CharSequence f4366R;

    /* JADX INFO: renamed from: S */
    public boolean f4367S;

    /* JADX INFO: renamed from: T */
    public int f4368T;

    /* JADX INFO: renamed from: U */
    public final int f4369U;

    /* JADX INFO: renamed from: V */
    public float f4370V;

    /* JADX INFO: renamed from: W */
    public float f4371W;

    /* JADX INFO: renamed from: a0 */
    public final VelocityTracker f4372a0;

    /* JADX INFO: renamed from: b0 */
    public final int f4373b0;

    /* JADX INFO: renamed from: c0 */
    public float f4374c0;

    /* JADX INFO: renamed from: d0 */
    public int f4375d0;

    /* JADX INFO: renamed from: e0 */
    public int f4376e0;

    /* JADX INFO: renamed from: f0 */
    public int f4377f0;

    /* JADX INFO: renamed from: g0 */
    public int f4378g0;

    /* JADX INFO: renamed from: h0 */
    public int f4379h0;

    /* JADX INFO: renamed from: i0 */
    public int f4380i0;

    /* JADX INFO: renamed from: j0 */
    public int f4381j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f4382k0;

    /* JADX INFO: renamed from: l0 */
    public final TextPaint f4383l0;

    /* JADX INFO: renamed from: m0 */
    public ColorStateList f4384m0;

    /* JADX INFO: renamed from: n0 */
    public StaticLayout f4385n0;

    /* JADX INFO: renamed from: o0 */
    public StaticLayout f4386o0;

    /* JADX INFO: renamed from: p0 */
    public C28504a f4387p0;

    /* JADX INFO: renamed from: q0 */
    public ObjectAnimator f4388q0;

    /* JADX INFO: renamed from: r0 */
    public C32000r f4389r0;

    /* JADX INFO: renamed from: s0 */
    public C31963h2 f4390s0;

    /* JADX INFO: renamed from: t0 */
    public final Rect f4391t0;

    /* JADX INFO: renamed from: w */
    public Drawable f4392w;

    /* JADX INFO: renamed from: x */
    public ColorStateList f4393x;

    /* JADX INFO: renamed from: y */
    public PorterDuff.Mode f4394y;

    /* JADX INFO: renamed from: z */
    public boolean f4395z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C32000r getEmojiTextViewHelper() {
        if (this.f4389r0 == null) {
            this.f4389r0 = new C32000r(this);
        }
        return this.f4389r0;
    }

    private boolean getTargetCheckedState() {
        return this.f4374c0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f4374c0 : this.f4374c0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4354F;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f4391t0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f4392w;
        Rect rectM99444b = drawable2 != null ? AbstractC31950e1.m99444b(drawable2) : AbstractC31950e1.f132662c;
        return ((((this.f4375d0 - this.f4377f0) - rect.left) - rect.right) - rectM99444b.left) - rectM99444b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f4365Q = charSequence;
        C32000r emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo59955Y = ((AbstractC35903f) emojiTextViewHelper.f132803b.f67507x).mo59955Y(this.f4387p0);
        if (transformationMethodMo59955Y != null) {
            charSequence = transformationMethodMo59955Y.getTransformation(charSequence, this);
        }
        this.f4366R = charSequence;
        this.f4386o0 = null;
        if (this.f4367S) {
            m3294e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f4363O = charSequence;
        C32000r emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo59955Y = ((AbstractC35903f) emojiTextViewHelper.f132803b.f67507x).mo59955Y(this.f4387p0);
        if (transformationMethodMo59955Y != null) {
            charSequence = transformationMethodMo59955Y.getTransformation(charSequence, this);
        }
        this.f4364P = charSequence;
        this.f4385n0 = null;
        if (this.f4367S) {
            m3294e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3290a() {
        Drawable drawable = this.f4392w;
        if (drawable != null) {
            if (this.f4395z || this.f4353E) {
                Drawable drawableMutate = drawable.mutate();
                this.f4392w = drawableMutate;
                if (this.f4395z) {
                    drawableMutate.setTintList(this.f4393x);
                }
                if (this.f4353E) {
                    this.f4392w.setTintMode(this.f4394y);
                }
                if (this.f4392w.isStateful()) {
                    this.f4392w.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3291b() {
        Drawable drawable = this.f4354F;
        if (drawable != null) {
            if (this.f4357I || this.f4358J) {
                Drawable drawableMutate = drawable.mutate();
                this.f4354F = drawableMutate;
                if (this.f4357I) {
                    drawableMutate.setTintList(this.f4355G);
                }
                if (this.f4358J) {
                    this.f4354F.setTintMode(this.f4356H);
                }
                if (this.f4354F.isStateful()) {
                    this.f4354F.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3292c() {
        setTextOnInternal(this.f4363O);
        setTextOffInternal(this.f4365Q);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m3293d(Context context, int i13) {
        ColorStateList colorStateList;
        Typeface typeface;
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i13, AbstractC22932a.f90530w);
        if (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC32122c.getColorStateList(context, resourceId)) == null) {
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
        }
        if (colorStateList != null) {
            this.f4384m0 = colorStateList;
        } else {
            this.f4384m0 = getTextColors();
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        TextPaint textPaint = this.f4383l0;
        if (dimensionPixelSize != 0) {
            float f13 = dimensionPixelSize;
            if (f13 != textPaint.getTextSize()) {
                textPaint.setTextSize(f13);
                requestLayout();
            }
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(1, -1);
        int i15 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i14 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i14 != 2) {
            typeface = i14 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        if (i15 > 0) {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i15) : Typeface.create(typeface, i15);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i16 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i15;
            textPaint.setFakeBoldText((i16 & 1) != 0);
            textPaint.setTextSkewX((i16 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            Context context2 = getContext();
            C28504a c28504a = new C28504a();
            c28504a.f115389w = context2.getResources().getConfiguration().locale;
            this.f4387p0 = c28504a;
        } else {
            this.f4387p0 = null;
        }
        setTextOnInternal(this.f4363O);
        setTextOffInternal(this.f4365Q);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i13;
        int i14;
        int i15 = this.f4378g0;
        int i16 = this.f4379h0;
        int i17 = this.f4380i0;
        int i18 = this.f4381j0;
        int thumbOffset = getThumbOffset() + i15;
        Drawable drawable = this.f4392w;
        Rect rectM99444b = drawable != null ? AbstractC31950e1.m99444b(drawable) : AbstractC31950e1.f132662c;
        Drawable drawable2 = this.f4354F;
        Rect rect = this.f4391t0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i19 = rect.left;
            thumbOffset += i19;
            if (rectM99444b != null) {
                int i24 = rectM99444b.left;
                if (i24 > i19) {
                    i15 += i24 - i19;
                }
                int i25 = rectM99444b.top;
                int i26 = rect.top;
                i13 = i25 > i26 ? (i25 - i26) + i16 : i16;
                int i27 = rectM99444b.right;
                int i28 = rect.right;
                if (i27 > i28) {
                    i17 -= i27 - i28;
                }
                int i29 = rectM99444b.bottom;
                int i34 = rect.bottom;
                if (i29 > i34) {
                    i14 = i18 - (i29 - i34);
                }
                this.f4354F.setBounds(i15, i13, i17, i14);
            } else {
                i13 = i16;
            }
            i14 = i18;
            this.f4354F.setBounds(i15, i13, i17, i14);
        }
        Drawable drawable3 = this.f4392w;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i35 = thumbOffset - rect.left;
            int i36 = thumbOffset + this.f4377f0 + rect.right;
            this.f4392w.setBounds(i35, i16, i36, i18);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i35, i16, i36, i18);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f4392w;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
        Drawable drawable2 = this.f4354F;
        if (drawable2 != null) {
            drawable2.setHotspot(f13, f14);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4392w;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f4354F;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3294e() {
        if (this.f4390s0 == null && ((AbstractC35903f) this.f4389r0.f132803b.f67507x).mo59957x() && C16955j.m47709d()) {
            C16955j c16955jM47708a = C16955j.m47708a();
            int iM47711c = c16955jM47708a.m47711c();
            if (iM47711c == 3 || iM47711c == 0) {
                C31963h2 c31963h2 = new C31963h2(this);
                this.f4390s0 = c31963h2;
                c16955jM47708a.m47715h(c31963h2);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4375d0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4361M : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4375d0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4361M : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f4367S;
    }

    public boolean getSplitTrack() {
        return this.f4362N;
    }

    public int getSwitchMinWidth() {
        return this.f4360L;
    }

    public int getSwitchPadding() {
        return this.f4361M;
    }

    public CharSequence getTextOff() {
        return this.f4365Q;
    }

    public CharSequence getTextOn() {
        return this.f4363O;
    }

    public Drawable getThumbDrawable() {
        return this.f4392w;
    }

    public final float getThumbPosition() {
        return this.f4374c0;
    }

    public int getThumbTextPadding() {
        return this.f4359K;
    }

    public ColorStateList getThumbTintList() {
        return this.f4393x;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4394y;
    }

    public Drawable getTrackDrawable() {
        return this.f4354F;
    }

    public ColorStateList getTrackTintList() {
        return this.f4355G;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4356H;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4392w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4354F;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4388q0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f4388q0.end();
        this.f4388q0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4352v0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f4354F;
        Rect rect = this.f4391t0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i13 = this.f4379h0;
        int i14 = this.f4381j0;
        int i15 = i13 + rect.top;
        int i16 = i14 - rect.bottom;
        Drawable drawable2 = this.f4392w;
        if (drawable != null) {
            if (!this.f4362N || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM99444b = AbstractC31950e1.m99444b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM99444b.left;
                rect.right -= rectM99444b.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f4385n0 : this.f4386o0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f4384m0;
            TextPaint textPaint = this.f4383l0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i15 + i16) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f4363O : this.f4365Q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(text);
            sb4.append(' ');
            sb4.append(charSequence);
            accessibilityNodeInfo.setText(sb4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z4, i13, i14, i15, i16);
        int iMax2 = 0;
        if (this.f4392w != null) {
            Drawable drawable = this.f4354F;
            Rect rect = this.f4391t0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM99444b = AbstractC31950e1.m99444b(this.f4392w);
            iMax = Math.max(0, rectM99444b.left - rect.left);
            iMax2 = Math.max(0, rectM99444b.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f4375d0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f4375d0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i17 = this.f4376e0;
            int i18 = height2 - (i17 / 2);
            height = i17 + i18;
            paddingTop = i18;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f4376e0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f4376e0;
        }
        this.f4378g0 = paddingLeft;
        this.f4379h0 = paddingTop;
        this.f4381j0 = height;
        this.f4380i0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f4367S) {
            StaticLayout staticLayout = this.f4385n0;
            TextPaint textPaint = this.f4383l0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f4364P;
                this.f4385n0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f4386o0 == null) {
                CharSequence charSequence2 = this.f4366R;
                this.f4386o0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f4392w;
        Rect rect = this.f4391t0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f4392w.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f4392w.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f4367S) {
            iMax = (this.f4359K * 2) + Math.max(this.f4385n0.getWidth(), this.f4386o0.getWidth());
        } else {
            iMax = 0;
        }
        this.f4377f0 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f4354F;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f4354F.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f4392w;
        if (drawable3 != null) {
            Rect rectM99444b = AbstractC31950e1.m99444b(drawable3);
            iMax2 = Math.max(iMax2, rectM99444b.left);
            iMax3 = Math.max(iMax3, rectM99444b.right);
        }
        int iMax4 = this.f4382k0 ? Math.max(this.f4360L, (this.f4377f0 * 2) + iMax2 + iMax3) : this.f4360L;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f4375d0 = iMax4;
        this.f4376e0 = iMax5;
        super.onMeasure(i13, i14);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f4363O : this.f4365Q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f13;
        VelocityTracker velocityTracker = this.f4372a0;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i13 = this.f4369U;
        if (actionMasked != 0) {
            float f14 = 0.0f;
            if (actionMasked == 1) {
                if (this.f4368T == 2) {
                    this.f4368T = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    zIsChecked = isChecked();
                    if (z4) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f4373b0) {
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f4368T = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i14 = this.f4368T;
                if (i14 == 1) {
                    float x3 = motionEvent.getX();
                    float y13 = motionEvent.getY();
                    float f15 = i13;
                    if (Math.abs(x3 - this.f4370V) > f15 || Math.abs(y13 - this.f4371W) > f15) {
                        this.f4368T = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f4370V = x3;
                        this.f4371W = y13;
                        return true;
                    }
                } else if (i14 == 2) {
                    float x5 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f16 = x5 - this.f4370V;
                    if (thumbScrollRange != 0) {
                        f13 = f16 / thumbScrollRange;
                    } else {
                        f13 = f16 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (getLayoutDirection() == 1) {
                        f13 = -f13;
                    }
                    float f17 = this.f4374c0;
                    float f18 = f13 + f17;
                    if (f18 >= 0.0f) {
                        f14 = f18 > 1.0f ? 1.0f : f18;
                    }
                    if (f14 != f17) {
                        this.f4370V = x5;
                        setThumbPosition(f14);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f4368T == 2) {
                    this.f4368T = 0;
                    if (motionEvent.getAction() == 1) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    zIsChecked = isChecked();
                    if (z4) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f4373b0) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (getLayoutDirection() == 1) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f4368T = 0;
                velocityTracker.clear();
            }
        } else {
            float x9 = motionEvent.getX();
            float y14 = motionEvent.getY();
            if (isEnabled() && this.f4392w != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f4392w;
                Rect rect = this.f4391t0;
                drawable.getPadding(rect);
                int i15 = this.f4379h0 - i13;
                int i16 = (this.f4378g0 + thumbOffset) - i13;
                int i17 = this.f4377f0 + i16 + rect.left + rect.right + i13;
                int i18 = this.f4381j0 + i13;
                if (x9 > i16 && x9 < i17 && y14 > i15 && y14 < i18) {
                    this.f4368T = 1;
                    this.f4370V = x9;
                    this.f4371W = y14;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().m99518c(z4);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.f4363O;
                if (string == null) {
                    string = getResources().getString(com.whoop.android.R.string.abc_capital_on);
                }
                AbstractC16901p0.m47585p(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.f4365Q;
            if (string2 == null) {
                string2 = getResources().getString(com.whoop.android.R.string.abc_capital_off);
            }
            AbstractC16901p0.m47585p(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f4388q0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f4351u0, zIsChecked ? 1.0f : 0.0f);
        this.f4388q0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f4388q0.setAutoCancel(true);
        this.f4388q0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().m99519d(z4);
        setTextOnInternal(this.f4363O);
        setTextOffInternal(this.f4365Q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z4) {
        this.f4382k0 = z4;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m99516a(inputFilterArr));
    }

    public void setShowText(boolean z4) {
        if (this.f4367S != z4) {
            this.f4367S = z4;
            requestLayout();
            if (z4) {
                m3294e();
            }
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f4362N = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i13) {
        this.f4360L = i13;
        requestLayout();
    }

    public void setSwitchPadding(int i13) {
        this.f4361M = i13;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f4383l0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f4365Q;
        if (string == null) {
            string = getResources().getString(com.whoop.android.R.string.abc_capital_off);
        }
        AbstractC16901p0.m47585p(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f4363O;
        if (string == null) {
            string = getResources().getString(com.whoop.android.R.string.abc_capital_on);
        }
        AbstractC16901p0.m47585p(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4392w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4392w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f13) {
        this.f4374c0 = f13;
        invalidate();
    }

    public void setThumbResource(int i13) {
        setThumbDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setThumbTextPadding(int i13) {
        this.f4359K = i13;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4393x = colorStateList;
        this.f4395z = true;
        m3290a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4394y = mode;
        this.f4353E = true;
        m3290a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4354F;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4354F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i13) {
        setTrackDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4355G = colorStateList;
        this.f4357I = true;
        m3291b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4356H = mode;
        this.f4358J = true;
        m3291b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4392w || drawable == this.f4354F;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, com.whoop.android.R.attr.switchStyle);
        this.f4393x = null;
        this.f4394y = null;
        this.f4395z = false;
        this.f4353E = false;
        this.f4355G = null;
        this.f4356H = null;
        this.f4357I = false;
        this.f4358J = false;
        this.f4372a0 = VelocityTracker.obtain();
        this.f4382k0 = true;
        this.f4391t0 = new Rect();
        AbstractC31967i2.m99459a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f4383l0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC22932a.f90529v;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, com.whoop.android.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        AbstractC16901p0.m47582m(this, context, iArr, attributeSet, typedArray, com.whoop.android.R.attr.switchStyle);
        Drawable drawableM99486j = c31983m2M99479q.m99486j(2);
        this.f4392w = drawableM99486j;
        if (drawableM99486j != null) {
            drawableM99486j.setCallback(this);
        }
        Drawable drawableM99486j2 = c31983m2M99479q.m99486j(11);
        this.f4354F = drawableM99486j2;
        if (drawableM99486j2 != null) {
            drawableM99486j2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f4367S = typedArray.getBoolean(3, true);
        this.f4359K = typedArray.getDimensionPixelSize(8, 0);
        this.f4360L = typedArray.getDimensionPixelSize(5, 0);
        this.f4361M = typedArray.getDimensionPixelSize(6, 0);
        this.f4362N = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM99484h = c31983m2M99479q.m99484h(9);
        if (colorStateListM99484h != null) {
            this.f4393x = colorStateListM99484h;
            this.f4395z = true;
        }
        PorterDuff.Mode modeM99445c = AbstractC31950e1.m99445c(typedArray.getInt(10, -1), null);
        if (this.f4394y != modeM99445c) {
            this.f4394y = modeM99445c;
            this.f4353E = true;
        }
        if (this.f4395z || this.f4353E) {
            m3290a();
        }
        ColorStateList colorStateListM99484h2 = c31983m2M99479q.m99484h(12);
        if (colorStateListM99484h2 != null) {
            this.f4355G = colorStateListM99484h2;
            this.f4357I = true;
        }
        PorterDuff.Mode modeM99445c2 = AbstractC31950e1.m99445c(typedArray.getInt(13, -1), null);
        if (this.f4356H != modeM99445c2) {
            this.f4356H = modeM99445c2;
            this.f4358J = true;
        }
        if (this.f4357I || this.f4358J) {
            m3291b();
        }
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            m3293d(context, resourceId);
        }
        new C32001r0(this).m99525f(attributeSet, com.whoop.android.R.attr.switchStyle);
        c31983m2M99479q.m99491r();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4369U = viewConfiguration.getScaledTouchSlop();
        this.f4373b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m99517b(attributeSet, com.whoop.android.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
