package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.health.platform.client.proto.C1533u;
import com.iterable.iterableapi.C5327g1;
import cr.AbstractC11075m;
import cr.C11071i;
import cr.C11073k;
import cr.InterfaceC11068f;
import hr.C17574d;
import ir.AbstractC20858a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import kr.C22792k;
import kr.InterfaceC22803v;
import p137f5.AbstractC14087f;
import p137f5.C14083b;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p287kq.C22770e;
import p435qr.AbstractC30554a;
import p479s4.AbstractC32121b;
import p479s4.AbstractC32122c;
import p531uq.C35156a;
import p531uq.C35157b;
import p531uq.C35159d;
import p531uq.InterfaceC35158c;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.AbstractC30060g;
import s53.C32227b;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements InterfaceC35158c, InterfaceC22803v, Checkable {

    /* JADX INFO: renamed from: W */
    public static final Rect f20867W = new Rect();

    /* JADX INFO: renamed from: a0 */
    public static final int[] f20868a0 = {R.attr.state_selected};

    /* JADX INFO: renamed from: b0 */
    public static final int[] f20869b0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: E */
    public C35159d f20870E;

    /* JADX INFO: renamed from: F */
    public InsetDrawable f20871F;

    /* JADX INFO: renamed from: G */
    public RippleDrawable f20872G;

    /* JADX INFO: renamed from: H */
    public View.OnClickListener f20873H;

    /* JADX INFO: renamed from: I */
    public CompoundButton.OnCheckedChangeListener f20874I;

    /* JADX INFO: renamed from: J */
    public boolean f20875J;

    /* JADX INFO: renamed from: K */
    public boolean f20876K;

    /* JADX INFO: renamed from: L */
    public boolean f20877L;

    /* JADX INFO: renamed from: M */
    public boolean f20878M;

    /* JADX INFO: renamed from: N */
    public boolean f20879N;

    /* JADX INFO: renamed from: O */
    public int f20880O;

    /* JADX INFO: renamed from: P */
    public int f20881P;

    /* JADX INFO: renamed from: Q */
    public CharSequence f20882Q;

    /* JADX INFO: renamed from: R */
    public final C35157b f20883R;

    /* JADX INFO: renamed from: S */
    public boolean f20884S;

    /* JADX INFO: renamed from: T */
    public final Rect f20885T;

    /* JADX INFO: renamed from: U */
    public final RectF f20886U;

    /* JADX INFO: renamed from: V */
    public final C11071i f20887V;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(AbstractC30554a.m93706a(context, attributeSet, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.whoop.android.R.attr.chipStyle);
        this.f20885T = new Rect();
        this.f20886U = new RectF();
        this.f20887V = new C11071i(this, 1);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C35159d c35159d = new C35159d(context2, attributeSet);
        Context context3 = c35159d.f149177F0;
        int[] iArr = AbstractC21885a.f84548h;
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context3, attributeSet, iArr, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c35159d.f149211f1 = typedArrayM29873g.hasValue(37);
        Context context4 = c35159d.f149177F0;
        ColorStateList colorStateListM65695C = AbstractC22674j.m65695C(typedArrayM29873g, context4, 24);
        if (c35159d.f149196Y != colorStateListM65695C) {
            c35159d.f149196Y = colorStateListM65695C;
            c35159d.onStateChange(c35159d.getState());
        }
        ColorStateList colorStateListM65695C2 = AbstractC22674j.m65695C(typedArrayM29873g, context4, 11);
        if (c35159d.f149198Z != colorStateListM65695C2) {
            c35159d.f149198Z = colorStateListM65695C2;
            c35159d.onStateChange(c35159d.getState());
        }
        float dimension = typedArrayM29873g.getDimension(19, 0.0f);
        if (c35159d.f149200a0 != dimension) {
            c35159d.f149200a0 = dimension;
            c35159d.invalidateSelf();
            c35159d.m111238D();
        }
        if (typedArrayM29873g.hasValue(12)) {
            c35159d.m111244J(typedArrayM29873g.getDimension(12, 0.0f));
        }
        c35159d.m111249O(AbstractC22674j.m65695C(typedArrayM29873g, context4, 22));
        c35159d.m111250P(typedArrayM29873g.getDimension(23, 0.0f));
        c35159d.m111259Y(AbstractC22674j.m65695C(typedArrayM29873g, context4, 36));
        String text = typedArrayM29873g.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c35159d.f149210f0, text);
        C11073k c11073k = c35159d.f149183L0;
        if (!zEquals) {
            c35159d.f149210f0 = text;
            c11073k.f35029e = true;
            c35159d.invalidateSelf();
            c35159d.m111238D();
        }
        C17574d c17574d = (!typedArrayM29873g.hasValue(0) || (resourceId = typedArrayM29873g.getResourceId(0, 0)) == 0) ? null : new C17574d(context4, resourceId);
        c17574d.f68101k = typedArrayM29873g.getDimension(1, c17574d.f68101k);
        c11073k.m29866b(c17574d, context4);
        int i13 = typedArrayM29873g.getInt(3, 0);
        if (i13 == 1) {
            c35159d.f149205c1 = TextUtils.TruncateAt.START;
        } else if (i13 == 2) {
            c35159d.f149205c1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i13 == 3) {
            c35159d.f149205c1 = TextUtils.TruncateAt.END;
        }
        c35159d.m111248N(typedArrayM29873g.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c35159d.m111248N(typedArrayM29873g.getBoolean(15, false));
        }
        c35159d.m111245K(AbstractC22674j.m65698F(typedArrayM29873g, context4, 14));
        if (typedArrayM29873g.hasValue(17)) {
            c35159d.m111247M(AbstractC22674j.m65695C(typedArrayM29873g, context4, 17));
        }
        c35159d.m111246L(typedArrayM29873g.getDimension(16, -1.0f));
        c35159d.m111256V(typedArrayM29873g.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c35159d.m111256V(typedArrayM29873g.getBoolean(26, false));
        }
        c35159d.m111251Q(AbstractC22674j.m65698F(typedArrayM29873g, context4, 25));
        c35159d.m111255U(AbstractC22674j.m65695C(typedArrayM29873g, context4, 30));
        c35159d.m111253S(typedArrayM29873g.getDimension(28, 0.0f));
        c35159d.m111240F(typedArrayM29873g.getBoolean(6, false));
        c35159d.m111243I(typedArrayM29873g.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c35159d.m111243I(typedArrayM29873g.getBoolean(8, false));
        }
        c35159d.m111241G(AbstractC22674j.m65698F(typedArrayM29873g, context4, 7));
        if (typedArrayM29873g.hasValue(9)) {
            c35159d.m111242H(AbstractC22674j.m65695C(typedArrayM29873g, context4, 9));
        }
        c35159d.f149227v0 = C22770e.m65972a(typedArrayM29873g, context4, 39);
        c35159d.f149228w0 = C22770e.m65972a(typedArrayM29873g, context4, 33);
        float dimension2 = typedArrayM29873g.getDimension(21, 0.0f);
        if (c35159d.f149229x0 != dimension2) {
            c35159d.f149229x0 = dimension2;
            c35159d.invalidateSelf();
            c35159d.m111238D();
        }
        c35159d.m111258X(typedArrayM29873g.getDimension(35, 0.0f));
        c35159d.m111257W(typedArrayM29873g.getDimension(34, 0.0f));
        float dimension3 = typedArrayM29873g.getDimension(41, 0.0f);
        if (c35159d.f149172A0 != dimension3) {
            c35159d.f149172A0 = dimension3;
            c35159d.invalidateSelf();
            c35159d.m111238D();
        }
        float dimension4 = typedArrayM29873g.getDimension(40, 0.0f);
        if (c35159d.f149173B0 != dimension4) {
            c35159d.f149173B0 = dimension4;
            c35159d.invalidateSelf();
            c35159d.m111238D();
        }
        c35159d.m111254T(typedArrayM29873g.getDimension(29, 0.0f));
        c35159d.m111252R(typedArrayM29873g.getDimension(27, 0.0f));
        float dimension5 = typedArrayM29873g.getDimension(13, 0.0f);
        if (c35159d.f149176E0 != dimension5) {
            c35159d.f149176E0 = dimension5;
            c35159d.invalidateSelf();
            c35159d.m111238D();
        }
        c35159d.f149209e1 = typedArrayM29873g.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM29873g.recycle();
        AbstractC11075m.m29867a(context2, attributeSet, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC11075m.m29868b(context2, attributeSet, iArr, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action);
        this.f20879N = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f20881P = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(AbstractC11075m.m29870d(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c35159d);
        c35159d.m66010l(AbstractC16877h0.m47510e(this));
        AbstractC11075m.m29867a(context2, attributeSet, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC11075m.m29868b(context2, attributeSet, iArr, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f20883R = new C35157b(this, this);
        m15731d();
        if (!zHasValue) {
            setOutlineProvider(new C32227b(this, 1));
        }
        setChecked(this.f20875J);
        setText(c35159d.f149210f0);
        setEllipsize(c35159d.f149205c1);
        m15734g();
        if (!this.f20870E.f149207d1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m15733f();
        if (this.f20879N) {
            setMinHeight(this.f20881P);
        }
        this.f20880O = getLayoutDirection();
        super.setOnCheckedChangeListener(new C35156a(this, 0));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f20886U;
        rectF.setEmpty();
        if (m15730c() && this.f20873H != null) {
            C35159d c35159d = this.f20870E;
            Rect bounds = c35159d.getBounds();
            rectF.setEmpty();
            if (c35159d.m111262b0()) {
                float f13 = c35159d.f149176E0 + c35159d.f149175D0 + c35159d.f149221p0 + c35159d.f149174C0 + c35159d.f149173B0;
                if (c35159d.getLayoutDirection() == 0) {
                    float f14 = bounds.right;
                    rectF.right = f14;
                    rectF.left = f14 - f13;
                } else {
                    float f15 = bounds.left;
                    rectF.left = f15;
                    rectF.right = f15 + f13;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i13 = (int) closeIconTouchBounds.left;
        int i14 = (int) closeIconTouchBounds.top;
        int i15 = (int) closeIconTouchBounds.right;
        int i16 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f20885T;
        rect.set(i13, i14, i15, i16);
        return rect;
    }

    private C17574d getTextAppearance() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149183L0.f35031g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f20877L != z4) {
            this.f20877L = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f20876K != z4) {
            this.f20876K = z4;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15729b(int i13) {
        this.f20881P = i13;
        if (!this.f20879N) {
            InsetDrawable insetDrawable = this.f20871F;
            if (insetDrawable == null) {
                m15732e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f20871F = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m15732e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i13 - ((int) this.f20870E.f149200a0));
        int iMax2 = Math.max(0, i13 - this.f20870E.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f20871F;
            if (insetDrawable2 == null) {
                m15732e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f20871F = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m15732e();
                    return;
                }
                return;
            }
        }
        int i14 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i15 = iMax > 0 ? iMax / 2 : 0;
        if (this.f20871F != null) {
            Rect rect = new Rect();
            this.f20871F.getPadding(rect);
            if (rect.top == i15 && rect.bottom == i15 && rect.left == i14 && rect.right == i14) {
                m15732e();
                return;
            }
        }
        if (getMinHeight() != i13) {
            setMinHeight(i13);
        }
        if (getMinWidth() != i13) {
            setMinWidth(i13);
        }
        this.f20871F = new InsetDrawable((Drawable) this.f20870E, i14, i15, i14, i15);
        m15732e();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15730c() {
        C35159d c35159d = this.f20870E;
        if (c35159d == null) {
            return false;
        }
        Drawable drawable = c35159d.f149218m0;
        return (drawable != null ? AbstractC32121b.m99995H(drawable) : null) != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m15731d() {
        C35159d c35159d;
        if (!m15730c() || (c35159d = this.f20870E) == null || !c35159d.f149217l0 || this.f20873H == null) {
            AbstractC16901p0.m47583n(this, null);
            this.f20884S = false;
        } else {
            AbstractC16901p0.m47583n(this, this.f20883R);
            this.f20884S = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i13;
        if (!this.f20884S) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C35157b c35157b = this.f20883R;
        AccessibilityManager accessibilityManager = c35157b.f157554h;
        int i14 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y13 = motionEvent.getY();
                Chip chip = c35157b.f149169q;
                if (chip.m15730c() && chip.getCloseIconTouchBounds().contains(x3, y13)) {
                    i14 = 1;
                }
                int i15 = c35157b.f157559m;
                if (i15 != i14) {
                    c35157b.f157559m = i14;
                    c35157b.m118070q(i14, 128);
                    c35157b.m118070q(i15, 256);
                    return true;
                }
            } else if (action == 10 && (i13 = c35157b.f157559m) != Integer.MIN_VALUE) {
                if (i13 != Integer.MIN_VALUE) {
                    c35157b.f157559m = Integer.MIN_VALUE;
                    c35157b.m118070q(Integer.MIN_VALUE, 128);
                    c35157b.m118070q(i13, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i13;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.f20884S) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C35157b c35157b = this.f20883R;
        c35157b.getClass();
        boolean zM118067m = false;
        int i14 = 0;
        zM118067m = false;
        zM118067m = false;
        zM118067m = false;
        zM118067m = false;
        zM118067m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i15 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i15 = 33;
                                } else if (keyCode == 21) {
                                    i15 = 17;
                                } else if (keyCode != 22) {
                                    i15 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z4 = false;
                                while (i14 < repeatCount && c35157b.m118067m(i15, null)) {
                                    i14++;
                                    z4 = true;
                                }
                                zM118067m = z4;
                            }
                            break;
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i13 = c35157b.f157558l;
                                if (i13 != Integer.MIN_VALUE) {
                                    chip = c35157b.f149169q;
                                    if (i13 == 0) {
                                        chip.performClick();
                                    } else if (i13 == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f20873H;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f20884S) {
                                            chip.f20883R.m118070q(1, 1);
                                        }
                                    }
                                }
                                zM118067m = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i13 = c35157b.f157558l;
                    if (i13 != Integer.MIN_VALUE) {
                        chip = c35157b.f149169q;
                        if (i13 == 0) {
                            chip.performClick();
                        } else if (i13 == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f20873H;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f20884S) {
                                chip.f20883R.m118070q(1, 1);
                            }
                        }
                    }
                    zM118067m = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM118067m = c35157b.m118067m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM118067m = c35157b.m118067m(1, null);
            }
        }
        if (!zM118067m || c35157b.f157558l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i13;
        int i14;
        super.drawableStateChanged();
        C35159d c35159d = this.f20870E;
        boolean zM111239E = false;
        if (c35159d != null && C35159d.m111235C(c35159d.f149218m0)) {
            C35159d c35159d2 = this.f20870E;
            ?? IsEnabled = isEnabled();
            if (this.f20878M) {
                i13 = IsEnabled;
                i13 = IsEnabled + 1;
            }
            i13 = IsEnabled;
            int i15 = i13;
            if (this.f20877L) {
                i15 = i13 + 1;
            }
            int i16 = i15;
            if (this.f20876K) {
                i16 = i15 + 1;
            }
            int i17 = i16;
            if (isChecked()) {
                i17 = i16 + 1;
            }
            int[] iArr = new int[i17];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (this.f20878M) {
                iArr[i14] = 16842908;
                i14++;
            }
            if (this.f20877L) {
                iArr[i14] = 16843623;
                i14++;
            }
            if (this.f20876K) {
                iArr[i14] = 16842919;
                i14++;
            }
            if (isChecked()) {
                iArr[i14] = 16842913;
            }
            if (!Arrays.equals(c35159d2.f149199Z0, iArr)) {
                c35159d2.f149199Z0 = iArr;
                if (c35159d2.m111262b0()) {
                    zM111239E = c35159d2.m111239E(c35159d2.getState(), iArr);
                }
            }
        }
        if (zM111239E) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15732e() {
        this.f20872G = new RippleDrawable(AbstractC20858a.m57613b(this.f20870E.f149208e0), getBackgroundDrawable(), null);
        this.f20870E.getClass();
        RippleDrawable rippleDrawable = this.f20872G;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setBackground(rippleDrawable);
        m15733f();
    }

    /* JADX INFO: renamed from: f */
    public final void m15733f() {
        C35159d c35159d;
        if (TextUtils.isEmpty(getText()) || (c35159d = this.f20870E) == null) {
            return;
        }
        int iM111266z = (int) (c35159d.m111266z() + c35159d.f149176E0 + c35159d.f149173B0);
        C35159d c35159d2 = this.f20870E;
        int iM111265y = (int) (c35159d2.m111265y() + c35159d2.f149229x0 + c35159d2.f149172A0);
        if (this.f20871F != null) {
            Rect rect = new Rect();
            this.f20871F.getPadding(rect);
            iM111265y += rect.left;
            iM111266z += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setPaddingRelative(iM111265y, paddingTop, iM111266z, paddingBottom);
    }

    /* JADX INFO: renamed from: g */
    public final void m15734g() {
        TextPaint paint = getPaint();
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            paint.drawableState = c35159d.getState();
        }
        C17574d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m50026e(getContext(), paint, this.f20887V);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f20882Q)) {
            return this.f20882Q;
        }
        C35159d c35159d = this.f20870E;
        if (c35159d == null || !c35159d.f149223r0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f20871F;
        return insetDrawable == null ? this.f20870E : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149225t0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149226u0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149198Z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return Math.max(0.0f, c35159d.m111237A());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f20870E;
    }

    public float getChipEndPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149176E0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C35159d c35159d = this.f20870E;
        if (c35159d == null || (drawable = c35159d.f149213h0) == null) {
            return null;
        }
        return AbstractC32121b.m99995H(drawable);
    }

    public float getChipIconSize() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149215j0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149214i0;
        }
        return null;
    }

    public float getChipMinHeight() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149200a0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149229x0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149204c0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149206d0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C35159d c35159d = this.f20870E;
        if (c35159d == null || (drawable = c35159d.f149218m0) == null) {
            return null;
        }
        return AbstractC32121b.m99995H(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149222q0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149175D0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149221p0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149174C0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149220o0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149205c1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f20884S) {
            C35157b c35157b = this.f20883R;
            if (c35157b.f157558l == 1 || c35157b.f157557k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C22770e getHideMotionSpec() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149228w0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149231z0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149230y0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149208e0;
        }
        return null;
    }

    public C22792k getShapeAppearanceModel() {
        return this.f20870E.f89748w.f89710a;
    }

    public C22770e getShowMotionSpec() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149227v0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149173B0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            return c35159d.f149172A0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC32411b.m101088c0(this, this.f20870E);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20868a0);
        }
        C35159d c35159d = this.f20870E;
        if (c35159d != null && c35159d.f149223r0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20869b0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i13, Rect rect) {
        super.onFocusChanged(z4, i13, rect);
        if (this.f20884S) {
            C35157b c35157b = this.f20883R;
            int i14 = c35157b.f157558l;
            if (i14 != Integer.MIN_VALUE) {
                c35157b.m118065j(i14);
            }
            if (z4) {
                c35157b.m118067m(i13, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C35159d c35159d = this.f20870E;
        accessibilityNodeInfo.setCheckable(c35159d != null && c35159d.f149223r0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i13) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        if (this.f20880O != i13) {
            this.f20880O = i13;
            m15733f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f20876K) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z4 = true;
                }
                z4 = false;
            } else {
                if (this.f20876K) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f20873H;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f20884S) {
                        this.f20883R.m118070q(1, 1);
                    }
                    z4 = true;
                }
                setCloseIconPressed(false);
            }
            z4 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z4 = true;
        } else {
            z4 = false;
        }
        return z4 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f20882Q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f20872G) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f20872G) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i13) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111240F(z4);
        }
    }

    public void setCheckableResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111240F(c35159d.f149177F0.getResources().getBoolean(i13));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null) {
            this.f20875J = z4;
        } else if (c35159d.f149223r0) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111241G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i13) {
        setCheckedIconVisible(i13);
    }

    public void setCheckedIconResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111241G(AbstractC30060g.m92133x(c35159d.f149177F0, i13));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111242H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111242H(AbstractC32122c.getColorStateList(c35159d.f149177F0, i13));
        }
    }

    public void setCheckedIconVisible(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111243I(c35159d.f149177F0.getResources().getBoolean(i13));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149198Z == colorStateList) {
            return;
        }
        c35159d.f149198Z = colorStateList;
        c35159d.onStateChange(c35159d.getState());
    }

    public void setChipBackgroundColorResource(int i13) {
        ColorStateList colorStateList;
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149198Z == (colorStateList = AbstractC32122c.getColorStateList(c35159d.f149177F0, i13))) {
            return;
        }
        c35159d.f149198Z = colorStateList;
        c35159d.onStateChange(c35159d.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111244J(f13);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111244J(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    public void setChipDrawable(C35159d c35159d) {
        C35159d c35159d2 = this.f20870E;
        if (c35159d2 != c35159d) {
            if (c35159d2 != null) {
                c35159d2.f149203b1 = new WeakReference(null);
            }
            this.f20870E = c35159d;
            c35159d.f149207d1 = false;
            c35159d.f149203b1 = new WeakReference(this);
            m15729b(this.f20881P);
        }
    }

    public void setChipEndPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149176E0 == f13) {
            return;
        }
        c35159d.f149176E0 = f13;
        c35159d.invalidateSelf();
        c35159d.m111238D();
    }

    public void setChipEndPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            float dimension = c35159d.f149177F0.getResources().getDimension(i13);
            if (c35159d.f149176E0 != dimension) {
                c35159d.f149176E0 = dimension;
                c35159d.invalidateSelf();
                c35159d.m111238D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111245K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i13) {
        setChipIconVisible(i13);
    }

    public void setChipIconResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111245K(AbstractC30060g.m92133x(c35159d.f149177F0, i13));
        }
    }

    public void setChipIconSize(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111246L(f13);
        }
    }

    public void setChipIconSizeResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111246L(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111247M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111247M(AbstractC32122c.getColorStateList(c35159d.f149177F0, i13));
        }
    }

    public void setChipIconVisible(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111248N(c35159d.f149177F0.getResources().getBoolean(i13));
        }
    }

    public void setChipMinHeight(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149200a0 == f13) {
            return;
        }
        c35159d.f149200a0 = f13;
        c35159d.invalidateSelf();
        c35159d.m111238D();
    }

    public void setChipMinHeightResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            float dimension = c35159d.f149177F0.getResources().getDimension(i13);
            if (c35159d.f149200a0 != dimension) {
                c35159d.f149200a0 = dimension;
                c35159d.invalidateSelf();
                c35159d.m111238D();
            }
        }
    }

    public void setChipStartPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149229x0 == f13) {
            return;
        }
        c35159d.f149229x0 = f13;
        c35159d.invalidateSelf();
        c35159d.m111238D();
    }

    public void setChipStartPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            float dimension = c35159d.f149177F0.getResources().getDimension(i13);
            if (c35159d.f149229x0 != dimension) {
                c35159d.f149229x0 = dimension;
                c35159d.invalidateSelf();
                c35159d.m111238D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111249O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111249O(AbstractC32122c.getColorStateList(c35159d.f149177F0, i13));
        }
    }

    public void setChipStrokeWidth(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111250P(f13);
        }
    }

    public void setChipStrokeWidthResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111250P(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i13) {
        setText(getResources().getString(i13));
    }

    public void setCloseIcon(Drawable drawable) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111251Q(drawable);
        }
        m15731d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149222q0 == charSequence) {
            return;
        }
        C14083b c14083bM40116c = C14083b.m40116c();
        c14083bM40116c.getClass();
        C5327g1 c5327g1 = AbstractC14087f.f50617a;
        c35159d.f149222q0 = c14083bM40116c.m40117d(charSequence);
        c35159d.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i13) {
        setCloseIconVisible(i13);
    }

    public void setCloseIconEndPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111252R(f13);
        }
    }

    public void setCloseIconEndPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111252R(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    public void setCloseIconResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111251Q(AbstractC30060g.m92133x(c35159d.f149177F0, i13));
        }
        m15731d();
    }

    public void setCloseIconSize(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111253S(f13);
        }
    }

    public void setCloseIconSizeResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111253S(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    public void setCloseIconStartPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111254T(f13);
        }
    }

    public void setCloseIconStartPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111254T(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111255U(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111255U(AbstractC32122c.getColorStateList(c35159d.f149177F0, i13));
        }
    }

    public void setCloseIconVisible(int i13) {
        setCloseIconVisible(getResources().getBoolean(i13));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i13, i14, i15, i16);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i13, i14, i15, i16);
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m66010l(f13);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f20870E == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.f149205c1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f20879N = z4;
        m15729b(this.f20881P);
    }

    @Override // android.widget.TextView
    public void setGravity(int i13) {
        if (i13 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i13);
        }
    }

    public void setHideMotionSpec(C22770e c22770e) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.f149228w0 = c22770e;
        }
    }

    public void setHideMotionSpecResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.f149228w0 = C22770e.m65973b(c35159d.f149177F0, i13);
        }
    }

    public void setIconEndPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111257W(f13);
        }
    }

    public void setIconEndPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111257W(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    public void setIconStartPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111258X(f13);
        }
    }

    public void setIconStartPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111258X(c35159d.f149177F0.getResources().getDimension(i13));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC11068f interfaceC11068f) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i13) {
        if (this.f20870E == null) {
            return;
        }
        super.setLayoutDirection(i13);
    }

    @Override // android.widget.TextView
    public void setLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i13);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i13);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i13) {
        super.setMaxWidth(i13);
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.f149209e1 = i13;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i13);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f20874I = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f20873H = onClickListener;
        m15731d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111259Y(colorStateList);
        }
        this.f20870E.getClass();
        m15732e();
    }

    public void setRippleColorResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111259Y(AbstractC32122c.getColorStateList(c35159d.f149177F0, i13));
            this.f20870E.getClass();
            m15732e();
        }
    }

    @Override // kr.InterfaceC22803v
    public void setShapeAppearanceModel(C22792k c22792k) {
        this.f20870E.setShapeAppearanceModel(c22792k);
    }

    public void setShowMotionSpec(C22770e c22770e) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.f149227v0 = c22770e;
        }
    }

    public void setShowMotionSpecResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.f149227v0 = C22770e.m65973b(c35159d.f149177F0, i13);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c35159d.f149207d1 ? null : charSequence, bufferType);
        C35159d c35159d2 = this.f20870E;
        if (c35159d2 == null || TextUtils.equals(c35159d2.f149210f0, charSequence)) {
            return;
        }
        c35159d2.f149210f0 = charSequence;
        c35159d2.f149183L0.f35029e = true;
        c35159d2.invalidateSelf();
        c35159d2.m111238D();
    }

    public void setTextAppearance(C17574d c17574d) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.f149183L0.m29866b(c17574d, c35159d.f149177F0);
        }
        m15734g();
    }

    public void setTextAppearanceResource(int i13) {
        setTextAppearance(getContext(), i13);
    }

    public void setTextEndPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149173B0 == f13) {
            return;
        }
        c35159d.f149173B0 = f13;
        c35159d.invalidateSelf();
        c35159d.m111238D();
    }

    public void setTextEndPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            float dimension = c35159d.f149177F0.getResources().getDimension(i13);
            if (c35159d.f149173B0 != dimension) {
                c35159d.f149173B0 = dimension;
                c35159d.invalidateSelf();
                c35159d.m111238D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i13, float f13) {
        super.setTextSize(i13, f13);
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            float fApplyDimension = TypedValue.applyDimension(i13, f13, getResources().getDisplayMetrics());
            C11073k c11073k = c35159d.f149183L0;
            C17574d c17574d = c11073k.f35031g;
            if (c17574d != null) {
                c17574d.f68101k = fApplyDimension;
                c11073k.f35025a.setTextSize(fApplyDimension);
                c35159d.mo29864a();
            }
        }
        m15734g();
    }

    public void setTextStartPadding(float f13) {
        C35159d c35159d = this.f20870E;
        if (c35159d == null || c35159d.f149172A0 == f13) {
            return;
        }
        c35159d.f149172A0 = f13;
        c35159d.invalidateSelf();
        c35159d.m111238D();
    }

    public void setTextStartPaddingResource(int i13) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            float dimension = c35159d.f149177F0.getResources().getDimension(i13);
            if (c35159d.f149172A0 != dimension) {
                c35159d.f149172A0 = dimension;
                c35159d.invalidateSelf();
                c35159d.m111238D();
            }
        }
    }

    public void setCloseIconVisible(boolean z4) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111256V(z4);
        }
        m15731d();
    }

    public void setCheckedIconVisible(boolean z4) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111243I(z4);
        }
    }

    public void setChipIconVisible(boolean z4) {
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            c35159d.m111248N(z4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            Context context2 = c35159d.f149177F0;
            c35159d.f149183L0.m29866b(new C17574d(context2, i13), context2);
        }
        m15734g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i13) {
        super.setTextAppearance(i13);
        C35159d c35159d = this.f20870E;
        if (c35159d != null) {
            Context context = c35159d.f149177F0;
            c35159d.f149183L0.m29866b(new C17574d(context, i13), context);
        }
        m15734g();
    }
}
