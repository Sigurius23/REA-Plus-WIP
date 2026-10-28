package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.iterable.iterableapi.C5327g1;
import cr.AbstractC11066d;
import cr.AbstractC11075m;
import cr.C11065c;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kr.C22782a;
import kr.C22786e;
import kr.C22787f;
import kr.C22788g;
import kr.C22790i;
import kr.C22791j;
import kr.C22792k;
import kr.InterfaceC22784c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p032bc.AbstractC2938a0;
import p032bc.C2951h;
import p047c9.C4316g;
import p137f5.AbstractC14087f;
import p137f5.C14083b;
import p184h5.AbstractC16886k0;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31484o;
import p474s.AbstractC31950e1;
import p474s.C31983m2;
import p474s.C31992p;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32122c;
import p543v4.AbstractC35642a;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.AbstractC30060g;
import se.AbstractC32410a;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c1 */
    private static final int f21106c1 = 2132083971;

    /* JADX INFO: renamed from: d1 */
    private static final int[][] f21107d1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A0 */
    private final RectF f21108A0;

    /* JADX INFO: renamed from: B0 */
    private Typeface f21109B0;

    /* JADX INFO: renamed from: C0 */
    private Drawable f21110C0;

    /* JADX INFO: renamed from: D0 */
    private int f21111D0;

    /* JADX INFO: renamed from: E */
    private CharSequence f21112E;

    /* JADX INFO: renamed from: E0 */
    private final LinkedHashSet<InterfaceC5047g0> f21113E0;

    /* JADX INFO: renamed from: F */
    private int f21114F;

    /* JADX INFO: renamed from: F0 */
    private Drawable f21115F0;

    /* JADX INFO: renamed from: G */
    private int f21116G;

    /* JADX INFO: renamed from: G0 */
    private int f21117G0;

    /* JADX INFO: renamed from: H */
    private int f21118H;

    /* JADX INFO: renamed from: H0 */
    private Drawable f21119H0;

    /* JADX INFO: renamed from: I */
    private int f21120I;

    /* JADX INFO: renamed from: I0 */
    private ColorStateList f21121I0;

    /* JADX INFO: renamed from: J */
    private final C5062u f21122J;

    /* JADX INFO: renamed from: J0 */
    private ColorStateList f21123J0;

    /* JADX INFO: renamed from: K */
    boolean f21124K;

    /* JADX INFO: renamed from: K0 */
    private int f21125K0;

    /* JADX INFO: renamed from: L */
    private int f21126L;

    /* JADX INFO: renamed from: L0 */
    private int f21127L0;

    /* JADX INFO: renamed from: M */
    private boolean f21128M;

    /* JADX INFO: renamed from: M0 */
    private int f21129M0;

    /* JADX INFO: renamed from: N */
    private InterfaceC5045f0 f21130N;

    /* JADX INFO: renamed from: N0 */
    private ColorStateList f21131N0;

    /* JADX INFO: renamed from: O */
    private TextView f21132O;

    /* JADX INFO: renamed from: O0 */
    private int f21133O0;

    /* JADX INFO: renamed from: P */
    private int f21134P;

    /* JADX INFO: renamed from: P0 */
    private int f21135P0;

    /* JADX INFO: renamed from: Q */
    private int f21136Q;

    /* JADX INFO: renamed from: Q0 */
    private int f21137Q0;

    /* JADX INFO: renamed from: R */
    private CharSequence f21138R;

    /* JADX INFO: renamed from: R0 */
    private int f21139R0;

    /* JADX INFO: renamed from: S */
    private boolean f21140S;

    /* JADX INFO: renamed from: S0 */
    private int f21141S0;

    /* JADX INFO: renamed from: T */
    private TextView f21142T;

    /* JADX INFO: renamed from: T0 */
    int f21143T0;

    /* JADX INFO: renamed from: U */
    private ColorStateList f21144U;

    /* JADX INFO: renamed from: U0 */
    private boolean f21145U0;

    /* JADX INFO: renamed from: V */
    private int f21146V;

    /* JADX INFO: renamed from: V0 */
    final C11065c f21147V0;

    /* JADX INFO: renamed from: W */
    private C2951h f21148W;

    /* JADX INFO: renamed from: W0 */
    private boolean f21149W0;

    /* JADX INFO: renamed from: X0 */
    private boolean f21150X0;

    /* JADX INFO: renamed from: Y0 */
    private ValueAnimator f21151Y0;

    /* JADX INFO: renamed from: Z0 */
    private boolean f21152Z0;

    /* JADX INFO: renamed from: a0 */
    private C2951h f21153a0;

    /* JADX INFO: renamed from: a1 */
    private boolean f21154a1;

    /* JADX INFO: renamed from: b0 */
    private ColorStateList f21155b0;

    /* JADX INFO: renamed from: b1 */
    private boolean f21156b1;

    /* JADX INFO: renamed from: c0 */
    private ColorStateList f21157c0;

    /* JADX INFO: renamed from: d0 */
    private ColorStateList f21158d0;

    /* JADX INFO: renamed from: e0 */
    private ColorStateList f21159e0;

    /* JADX INFO: renamed from: f0 */
    private boolean f21160f0;

    /* JADX INFO: renamed from: g0 */
    private CharSequence f21161g0;

    /* JADX INFO: renamed from: h0 */
    private boolean f21162h0;

    /* JADX INFO: renamed from: i0 */
    private C22788g f21163i0;

    /* JADX INFO: renamed from: j0 */
    private C22788g f21164j0;

    /* JADX INFO: renamed from: k0 */
    private StateListDrawable f21165k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f21166l0;

    /* JADX INFO: renamed from: m0 */
    private C22788g f21167m0;

    /* JADX INFO: renamed from: n0 */
    private C22788g f21168n0;

    /* JADX INFO: renamed from: o0 */
    private C22792k f21169o0;

    /* JADX INFO: renamed from: p0 */
    private boolean f21170p0;

    /* JADX INFO: renamed from: q0 */
    private final int f21171q0;

    /* JADX INFO: renamed from: r0 */
    private int f21172r0;

    /* JADX INFO: renamed from: s0 */
    private int f21173s0;

    /* JADX INFO: renamed from: t0 */
    private int f21174t0;

    /* JADX INFO: renamed from: u0 */
    private int f21175u0;

    /* JADX INFO: renamed from: v0 */
    private int f21176v0;

    /* JADX INFO: renamed from: w */
    private final FrameLayout f21177w;

    /* JADX INFO: renamed from: w0 */
    private int f21178w0;

    /* JADX INFO: renamed from: x */
    private final C5067z f21179x;

    /* JADX INFO: renamed from: x0 */
    private int f21180x0;

    /* JADX INFO: renamed from: y */
    private final C5058q f21181y;

    /* JADX INFO: renamed from: y0 */
    private final Rect f21182y0;

    /* JADX INFO: renamed from: z */
    EditText f21183z;

    /* JADX INFO: renamed from: z0 */
    private final Rect f21184z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.whoop.android.R.attr.textInputStyle);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f21183z;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f21163i0;
        }
        int iM96969u = AbstractC31484o.m96969u(this.f21183z, com.whoop.android.R.attr.colorControlHighlight);
        int i13 = this.f21172r0;
        if (i13 != 2) {
            if (i13 != 1) {
                return null;
            }
            C22788g c22788g = this.f21163i0;
            int i14 = this.f21180x0;
            return new RippleDrawable(new ColorStateList(f21107d1, new int[]{AbstractC31484o.m96972x(0.1f, iM96969u, i14), i14}), c22788g, c22788g);
        }
        Context context = getContext();
        C22788g c22788g2 = this.f21163i0;
        int[][] iArr = f21107d1;
        TypedValue typedValueM56325X = AbstractC20301a.m56325X(context, com.whoop.android.R.attr.colorSurface, "TextInputLayout");
        int i15 = typedValueM56325X.resourceId;
        int color = i15 != 0 ? AbstractC32122c.getColor(context, i15) : typedValueM56325X.data;
        C22788g c22788g3 = new C22788g(c22788g2.f89748w.f89710a);
        int iM96972x = AbstractC31484o.m96972x(0.1f, iM96969u, color);
        c22788g3.m66011m(new ColorStateList(iArr, new int[]{iM96972x, 0}));
        c22788g3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM96972x, color});
        C22788g c22788g4 = new C22788g(c22788g2.f89748w.f89710a);
        c22788g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c22788g3, c22788g4), c22788g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f21165k0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f21165k0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f21165k0.addState(new int[0], m15823m(false));
        }
        return this.f21165k0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f21164j0 == null) {
            this.f21164j0 = m15823m(true);
        }
        return this.f21164j0;
    }

    private void setEditText(EditText editText) {
        if (this.f21183z != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f21183z = editText;
        int i13 = this.f21114F;
        if (i13 != -1) {
            setMinEms(i13);
        } else {
            setMinWidth(this.f21118H);
        }
        int i14 = this.f21116G;
        if (i14 != -1) {
            setMaxEms(i14);
        } else {
            setMaxWidth(this.f21120I);
        }
        this.f21166l0 = false;
        m15832v();
        setTextInputAccessibilityDelegate(new C5043e0(this));
        C11065c c11065c = this.f21147V0;
        Typeface typeface = this.f21183z.getTypeface();
        boolean zM29853m = c11065c.m29853m(typeface);
        boolean zM29855o = c11065c.m29855o(typeface);
        if (zM29853m || zM29855o) {
            c11065c.m29849i(false);
        }
        C11065c c11065c2 = this.f21147V0;
        float textSize = this.f21183z.getTextSize();
        if (c11065c2.f34982l != textSize) {
            c11065c2.f34982l = textSize;
            c11065c2.m29849i(false);
        }
        int i15 = Build.VERSION.SDK_INT;
        C11065c c11065c3 = this.f21147V0;
        float letterSpacing = this.f21183z.getLetterSpacing();
        if (c11065c3.f34973g0 != letterSpacing) {
            c11065c3.f34973g0 = letterSpacing;
            c11065c3.m29849i(false);
        }
        int gravity = this.f21183z.getGravity();
        this.f21147V0.m29852l((gravity & (-113)) | 48);
        C11065c c11065c4 = this.f21147V0;
        if (c11065c4.f34978j != gravity) {
            c11065c4.f34978j = gravity;
            c11065c4.m29849i(false);
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        this.f21143T0 = editText.getMinimumHeight();
        this.f21183z.addTextChangedListener(new C5037b0(this, editText));
        if (this.f21121I0 == null) {
            this.f21121I0 = this.f21183z.getHintTextColors();
        }
        if (this.f21160f0) {
            if (TextUtils.isEmpty(this.f21161g0)) {
                CharSequence hint = this.f21183z.getHint();
                this.f21112E = hint;
                setHint(hint);
                this.f21183z.setHint((CharSequence) null);
            }
            this.f21162h0 = true;
        }
        if (i15 >= 29) {
            m15807E();
        }
        if (this.f21132O != null) {
            m15805C(this.f21183z.getText());
        }
        m15809G();
        this.f21122J.m15890b();
        this.f21179x.bringToFront();
        this.f21181y.bringToFront();
        Iterator<InterfaceC5047g0> it = this.f21113E0.iterator();
        while (it.hasNext()) {
            ((C5055n) it.next()).m15857a(this);
        }
        this.f21181y.m15884m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m15813K(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f21161g0)) {
            return;
        }
        this.f21161g0 = charSequence;
        C11065c c11065c = this.f21147V0;
        if (charSequence == null || !TextUtils.equals(c11065c.f34940G, charSequence)) {
            c11065c.f34940G = charSequence;
            c11065c.f34941H = null;
            Bitmap bitmap = c11065c.f34944K;
            if (bitmap != null) {
                bitmap.recycle();
                c11065c.f34944K = null;
            }
            c11065c.m29849i(false);
        }
        if (this.f21145U0) {
            return;
        }
        m15833w();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f21140S == z4) {
            return;
        }
        if (z4) {
            TextView textView = this.f21142T;
            if (textView != null) {
                this.f21177w.addView(textView);
                this.f21142T.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f21142T;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f21142T = null;
        }
        this.f21140S = z4;
    }

    /* JADX INFO: renamed from: x */
    public static void m15802x(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                m15802x((ViewGroup) childAt, z4);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m15803A(TextView textView, int i13) {
        try {
            textView.setTextAppearance(i13);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.whoop.android.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(AbstractC32122c.getColor(getContext(), com.whoop.android.R.color.design_error));
    }

    /* JADX INFO: renamed from: B */
    public boolean m15804B() {
        C5062u c5062u = this.f21122J;
        return (c5062u.f21289o != 1 || c5062u.f21292r == null || TextUtils.isEmpty(c5062u.f21290p)) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public void m15805C(Editable editable) {
        ((C4316g) this.f21130N).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z4 = this.f21128M;
        int i13 = this.f21126L;
        if (i13 == -1) {
            this.f21132O.setText(String.valueOf(length));
            this.f21132O.setContentDescription(null);
            this.f21128M = false;
        } else {
            this.f21128M = length > i13;
            Context context = getContext();
            this.f21132O.setContentDescription(context.getString(this.f21128M ? com.whoop.android.R.string.character_counter_overflowed_content_description : com.whoop.android.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f21126L)));
            if (z4 != this.f21128M) {
                m15806D();
            }
            C14083b c14083bM40116c = C14083b.m40116c();
            TextView textView = this.f21132O;
            String string = getContext().getString(com.whoop.android.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f21126L));
            c14083bM40116c.getClass();
            C5327g1 c5327g1 = AbstractC14087f.f50617a;
            textView.setText(string != null ? c14083bM40116c.m40117d(string).toString() : null);
        }
        if (this.f21183z == null || z4 == this.f21128M) {
            return;
        }
        m15812J(false);
        m15816N();
        m15809G();
    }

    /* JADX INFO: renamed from: D */
    public final void m15806D() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f21132O;
        if (textView != null) {
            m15803A(textView, this.f21128M ? this.f21134P : this.f21136Q);
            if (!this.f21128M && (colorStateList2 = this.f21155b0) != null) {
                this.f21132O.setTextColor(colorStateList2);
            }
            if (!this.f21128M || (colorStateList = this.f21157c0) == null) {
                return;
            }
            this.f21132O.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX INFO: renamed from: E */
    public final void m15807E() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f21158d0;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM56323V = AbstractC20301a.m56323V(context, com.whoop.android.R.attr.colorControlActivated);
            if (typedValueM56323V != null) {
                int i13 = typedValueM56323V.resourceId;
                if (i13 != 0) {
                    colorStateListValueOf = AbstractC32122c.getColorStateList(context, i13);
                } else {
                    int i14 = typedValueM56323V.data;
                    if (i14 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i14);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f21183z;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f21183z.getTextCursorDrawable().mutate();
        if ((m15804B() || (this.f21132O != null && this.f21128M)) && (colorStateList = this.f21159e0) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX INFO: renamed from: F */
    public boolean m15808F() {
        boolean z4;
        if (this.f21183z == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z13 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f21179x.getMeasuredWidth() > 0) {
            int measuredWidth = this.f21179x.getMeasuredWidth() - this.f21183z.getPaddingLeft();
            if (this.f21110C0 == null || this.f21111D0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f21110C0 = colorDrawable;
                this.f21111D0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f21183z.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f21110C0;
            if (drawable != drawable2) {
                this.f21183z.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z4 = true;
            } else {
                z4 = false;
            }
        } else if (this.f21110C0 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f21183z.getCompoundDrawablesRelative();
            this.f21183z.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.f21110C0 = null;
            z4 = true;
        } else {
            z4 = false;
        }
        if ((this.f21181y.m15876e() || ((this.f21181y.f21245I != 0 && m15826p()) || this.f21181y.f21252P != null)) && this.f21181y.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f21181y.f21253Q.getMeasuredWidth() - this.f21183z.getPaddingRight();
            C5058q c5058q = this.f21181y;
            if (c5058q.m15876e()) {
                checkableImageButton = c5058q.f21261y;
            } else if (c5058q.f21245I != 0 && c5058q.m15875d()) {
                checkableImageButton = c5058q.f21243G;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f21183z.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f21115F0;
            if (drawable3 != null && this.f21117G0 != measuredWidth2) {
                this.f21117G0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f21183z.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f21115F0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f21115F0 = colorDrawable2;
                this.f21117G0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f21115F0;
            if (drawable4 != drawable5) {
                this.f21119H0 = drawable4;
                this.f21183z.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f21115F0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f21183z.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f21115F0) {
                this.f21183z.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f21119H0, compoundDrawablesRelative4[3]);
            } else {
                z13 = z4;
            }
            this.f21115F0 = null;
            return z13;
        }
        return z4;
    }

    /* JADX INFO: renamed from: G */
    public void m15809G() {
        Drawable background;
        TextView textView;
        EditText editText = this.f21183z;
        if (editText == null || this.f21172r0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC31950e1.f132660a;
        Drawable drawableMutate = background.mutate();
        if (m15804B()) {
            drawableMutate.setColorFilter(C31992p.m99506c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f21128M && (textView = this.f21132O) != null) {
            drawableMutate.setColorFilter(C31992p.m99506c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f21183z.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: H */
    public void m15810H() {
        EditText editText = this.f21183z;
        if (editText == null || this.f21163i0 == null) {
            return;
        }
        if ((this.f21166l0 || editText.getBackground() == null) && this.f21172r0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f21183z;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            editText2.setBackground(editTextBoxBackground);
            this.f21166l0 = true;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m15811I() {
        if (this.f21172r0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21177w.getLayoutParams();
            int iM15820j = m15820j();
            if (iM15820j != layoutParams.topMargin) {
                layoutParams.topMargin = iM15820j;
                this.f21177w.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m15812J(boolean z4) {
        m15813K(z4, false);
    }

    /* JADX INFO: renamed from: K */
    public final void m15813K(boolean z4, boolean z13) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f21183z;
        boolean z14 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f21183z;
        boolean z15 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f21121I0;
        if (colorStateList2 != null) {
            this.f21147V0.m29850j(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f21121I0;
            this.f21147V0.m29850j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f21141S0) : this.f21141S0));
        } else if (m15804B()) {
            C11065c c11065c = this.f21147V0;
            AppCompatTextView appCompatTextView = this.f21122J.f21292r;
            c11065c.m29850j(appCompatTextView != null ? appCompatTextView.getTextColors() : null);
        } else if (this.f21128M && (textView = this.f21132O) != null) {
            this.f21147V0.m29850j(textView.getTextColors());
        } else if (z15 && (colorStateList = this.f21123J0) != null) {
            C11065c c11065c2 = this.f21147V0;
            if (c11065c2.f34988o != colorStateList) {
                c11065c2.f34988o = colorStateList;
                c11065c2.m29849i(false);
            }
        }
        if (z14 || !this.f21149W0 || (isEnabled() && z15)) {
            if (z13 || this.f21145U0) {
                ValueAnimator valueAnimator = this.f21151Y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f21151Y0.cancel();
                }
                if (z4 && this.f21150X0) {
                    m15818h(1.0f);
                } else {
                    this.f21147V0.m29856p(1.0f);
                }
                this.f21145U0 = false;
                if (m15822l()) {
                    m15833w();
                }
                EditText editText3 = this.f21183z;
                m15814L(editText3 != null ? editText3.getText() : null);
                C5067z c5067z = this.f21179x;
                c5067z.f21321J = false;
                c5067z.m15906e();
                C5058q c5058q = this.f21181y;
                c5058q.f21254R = false;
                c5058q.m15885n();
                return;
            }
            return;
        }
        if (z13 || !this.f21145U0) {
            ValueAnimator valueAnimator2 = this.f21151Y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f21151Y0.cancel();
            }
            if (z4 && this.f21150X0) {
                m15818h(0.0f);
            } else {
                this.f21147V0.m29856p(0.0f);
            }
            if (m15822l() && !((C5048h) this.f21163i0).f21213Y.f21211s.isEmpty() && m15822l()) {
                ((C5048h) this.f21163i0).m15849w(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f21145U0 = true;
            TextView textView2 = this.f21142T;
            if (textView2 != null && this.f21140S) {
                textView2.setText((CharSequence) null);
                AbstractC2938a0.m8568a(this.f21177w, this.f21153a0);
                this.f21142T.setVisibility(4);
            }
            C5067z c5067z2 = this.f21179x;
            c5067z2.f21321J = true;
            c5067z2.m15906e();
            C5058q c5058q2 = this.f21181y;
            c5058q2.f21254R = true;
            c5058q2.m15885n();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m15814L(Editable editable) {
        ((C4316g) this.f21130N).getClass();
        if ((editable != null ? editable.length() : 0) != 0 || this.f21145U0) {
            TextView textView = this.f21142T;
            if (textView == null || !this.f21140S) {
                return;
            }
            textView.setText((CharSequence) null);
            AbstractC2938a0.m8568a(this.f21177w, this.f21153a0);
            this.f21142T.setVisibility(4);
            return;
        }
        if (this.f21142T == null || !this.f21140S || TextUtils.isEmpty(this.f21138R)) {
            return;
        }
        this.f21142T.setText(this.f21138R);
        AbstractC2938a0.m8568a(this.f21177w, this.f21148W);
        this.f21142T.setVisibility(0);
        this.f21142T.bringToFront();
        announceForAccessibility(this.f21138R);
    }

    /* JADX INFO: renamed from: M */
    public final void m15815M(boolean z4, boolean z13) {
        int defaultColor = this.f21131N0.getDefaultColor();
        int colorForState = this.f21131N0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f21131N0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.f21178w0 = colorForState2;
        } else if (z13) {
            this.f21178w0 = colorForState;
        } else {
            this.f21178w0 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m15816N() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f21163i0 == null || this.f21172r0 == 0) {
            return;
        }
        boolean z4 = false;
        boolean z13 = isFocused() || ((editText2 = this.f21183z) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f21183z) != null && editText.isHovered())) {
            z4 = true;
        }
        if (!isEnabled()) {
            this.f21178w0 = this.f21141S0;
        } else if (m15804B()) {
            if (this.f21131N0 != null) {
                m15815M(z13, z4);
            } else {
                this.f21178w0 = getErrorCurrentTextColors();
            }
        } else if (!this.f21128M || (textView = this.f21132O) == null) {
            if (z13) {
                this.f21178w0 = this.f21129M0;
            } else if (z4) {
                this.f21178w0 = this.f21127L0;
            } else {
                this.f21178w0 = this.f21125K0;
            }
        } else if (this.f21131N0 != null) {
            m15815M(z13, z4);
        } else {
            this.f21178w0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m15807E();
        }
        C5058q c5058q = this.f21181y;
        TextInputLayout textInputLayout = c5058q.f21259w;
        CheckableImageButton checkableImageButton = c5058q.f21243G;
        TextInputLayout textInputLayout2 = c5058q.f21259w;
        c5058q.m15883l();
        AbstractC32073e.m99730X(textInputLayout2, c5058q.f21261y, c5058q.f21262z);
        AbstractC32073e.m99730X(textInputLayout2, checkableImageButton, c5058q.f21247K);
        if (c5058q.m15873b() instanceof C5053l) {
            if (!textInputLayout.m15804B() || checkableImageButton.getDrawable() == null) {
                AbstractC32073e.m99754m(textInputLayout, checkableImageButton, c5058q.f21247K, c5058q.f21248L);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        m15834y();
        if (this.f21172r0 == 2) {
            int i13 = this.f21174t0;
            if (z13 && isEnabled()) {
                this.f21174t0 = this.f21176v0;
            } else {
                this.f21174t0 = this.f21175u0;
            }
            if (this.f21174t0 != i13 && m15822l() && !this.f21145U0) {
                if (m15822l()) {
                    ((C5048h) this.f21163i0).m15849w(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m15833w();
            }
        }
        if (this.f21172r0 == 1) {
            if (!isEnabled()) {
                this.f21180x0 = this.f21135P0;
            } else if (z4 && !z13) {
                this.f21180x0 = this.f21139R0;
            } else if (z13) {
                this.f21180x0 = this.f21137Q0;
            } else {
                this.f21180x0 = this.f21133O0;
            }
        }
        m15819i();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i13, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f21177w.addView(view, layoutParams2);
        this.f21177w.setLayoutParams(layoutParams);
        m15811I();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i13) {
        EditText editText = this.f21183z;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i13);
            return;
        }
        if (this.f21112E != null) {
            boolean z4 = this.f21162h0;
            this.f21162h0 = false;
            CharSequence hint = editText.getHint();
            this.f21183z.setHint(this.f21112E);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i13);
                return;
            } finally {
                this.f21183z.setHint(hint);
                this.f21162h0 = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i13);
        onProvideAutofillVirtualStructure(viewStructure, i13);
        viewStructure.setChildCount(this.f21177w.getChildCount());
        for (int i14 = 0; i14 < this.f21177w.getChildCount(); i14++) {
            View childAt = this.f21177w.getChildAt(i14);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i14);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i13);
            if (childAt == this.f21183z) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f21154a1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f21154a1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C22788g c22788g;
        super.draw(canvas);
        if (this.f21160f0) {
            this.f21147V0.m29845d(canvas);
        }
        if (this.f21168n0 == null || (c22788g = this.f21167m0) == null) {
            return;
        }
        c22788g.draw(canvas);
        if (this.f21183z.isFocused()) {
            Rect bounds = this.f21168n0.getBounds();
            Rect bounds2 = this.f21167m0.getBounds();
            float f13 = this.f21147V0.f34962b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC22766a.m65971c(f13, iCenterX, bounds2.left);
            bounds.right = AbstractC22766a.m65971c(f13, iCenterX, bounds2.right);
            this.f21168n0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z4;
        ColorStateList colorStateList;
        if (this.f21152Z0) {
            return;
        }
        this.f21152Z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C11065c c11065c = this.f21147V0;
        if (c11065c != null) {
            c11065c.f34951R = drawableState;
            ColorStateList colorStateList2 = c11065c.f34988o;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c11065c.f34986n) == null || !colorStateList.isStateful())) {
                z4 = false;
            } else {
                c11065c.m29849i(false);
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (this.f21183z != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            m15812J(isLaidOut() && isEnabled());
        }
        m15809G();
        m15816N();
        if (z4) {
            invalidate();
        }
        this.f21152Z0 = false;
    }

    /* JADX INFO: renamed from: g */
    public void m15817g(InterfaceC5047g0 interfaceC5047g0) {
        this.f21113E0.add(interfaceC5047g0);
        if (this.f21183z != null) {
            ((C5055n) interfaceC5047g0).m15857a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f21183z;
        if (editText == null) {
            return super.getBaseline();
        }
        return m15820j() + getPaddingTop() + editText.getBaseline();
    }

    public C22788g getBoxBackground() {
        int i13 = this.f21172r0;
        if (i13 == 1 || i13 == 2) {
            return this.f21163i0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f21180x0;
    }

    public int getBoxBackgroundMode() {
        return this.f21172r0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f21173s0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return AbstractC11075m.m29872f(this) ? this.f21169o0.f89773h.mo65993a(this.f21108A0) : this.f21169o0.f89772g.mo65993a(this.f21108A0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return AbstractC11075m.m29872f(this) ? this.f21169o0.f89772g.mo65993a(this.f21108A0) : this.f21169o0.f89773h.mo65993a(this.f21108A0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return AbstractC11075m.m29872f(this) ? this.f21169o0.f89770e.mo65993a(this.f21108A0) : this.f21169o0.f89771f.mo65993a(this.f21108A0);
    }

    public float getBoxCornerRadiusTopStart() {
        return AbstractC11075m.m29872f(this) ? this.f21169o0.f89771f.mo65993a(this.f21108A0) : this.f21169o0.f89770e.mo65993a(this.f21108A0);
    }

    public int getBoxStrokeColor() {
        return this.f21129M0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f21131N0;
    }

    public int getBoxStrokeWidth() {
        return this.f21175u0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f21176v0;
    }

    public int getCounterMaxLength() {
        return this.f21126L;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f21124K && this.f21128M && (textView = this.f21132O) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f21157c0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f21155b0;
    }

    public ColorStateList getCursorColor() {
        return this.f21158d0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f21159e0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f21121I0;
    }

    public EditText getEditText() {
        return this.f21183z;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f21181y.f21243G.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f21181y.f21243G.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f21181y.f21249M;
    }

    public int getEndIconMode() {
        return this.f21181y.f21245I;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f21181y.f21250N;
    }

    public CheckableImageButton getEndIconView() {
        return this.f21181y.f21243G;
    }

    public CharSequence getError() {
        C5062u c5062u = this.f21122J;
        if (c5062u.f21291q) {
            return c5062u.f21290p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f21122J.f21294t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f21122J.f21293s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f21122J.f21292r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f21181y.f21261y.getDrawable();
    }

    public CharSequence getHelperText() {
        C5062u c5062u = this.f21122J;
        if (c5062u.f21298x) {
            return c5062u.f21297w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f21122J.f21299y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f21160f0) {
            return this.f21161g0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f21147V0.m29846e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C11065c c11065c = this.f21147V0;
        return c11065c.m29847f(c11065c.f34988o);
    }

    public ColorStateList getHintTextColor() {
        return this.f21123J0;
    }

    public InterfaceC5045f0 getLengthCounter() {
        return this.f21130N;
    }

    public int getMaxEms() {
        return this.f21116G;
    }

    public int getMaxWidth() {
        return this.f21120I;
    }

    public int getMinEms() {
        return this.f21114F;
    }

    public int getMinWidth() {
        return this.f21118H;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f21181y.f21243G.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f21181y.f21243G.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f21140S) {
            return this.f21138R;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f21146V;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f21144U;
    }

    public CharSequence getPrefixText() {
        return this.f21179x.f21324y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f21179x.f21323x.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f21179x.f21323x;
    }

    public C22792k getShapeAppearanceModel() {
        return this.f21169o0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f21179x.f21325z.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f21179x.f21325z.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f21179x.f21318G;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f21179x.f21319H;
    }

    public CharSequence getSuffixText() {
        return this.f21181y.f21252P;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f21181y.f21253Q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f21181y.f21253Q;
    }

    public Typeface getTypeface() {
        return this.f21109B0;
    }

    /* JADX INFO: renamed from: h */
    public void m15818h(float f13) {
        if (this.f21147V0.f34962b == f13) {
            return;
        }
        if (this.f21151Y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f21151Y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC36259c.m115699l0(getContext(), com.whoop.android.R.attr.motionEasingEmphasizedInterpolator, AbstractC22766a.f89673b));
            this.f21151Y0.setDuration(AbstractC36259c.m115697k0(getContext(), com.whoop.android.R.attr.motionDurationMedium4, 167));
            this.f21151Y0.addUpdateListener(new C5041d0(this));
        }
        this.f21151Y0.setFloatValues(this.f21147V0.f34962b, f13);
        this.f21151Y0.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m15819i() {
        int i13;
        int i14;
        C22788g c22788g = this.f21163i0;
        if (c22788g == null) {
            return;
        }
        C22792k c22792k = c22788g.f89748w.f89710a;
        C22792k c22792k2 = this.f21169o0;
        if (c22792k != c22792k2) {
            c22788g.setShapeAppearanceModel(c22792k2);
        }
        if (this.f21172r0 == 2 && (i13 = this.f21174t0) > -1 && (i14 = this.f21178w0) != 0) {
            C22788g c22788g2 = this.f21163i0;
            c22788g2.m66017s(i13);
            c22788g2.m66015q(ColorStateList.valueOf(i14));
        }
        int iM112836e = this.f21180x0;
        if (this.f21172r0 == 1) {
            iM112836e = AbstractC35642a.m112836e(this.f21180x0, AbstractC31484o.m96968t(getContext(), com.whoop.android.R.attr.colorSurface, 0));
        }
        this.f21180x0 = iM112836e;
        this.f21163i0.m66011m(ColorStateList.valueOf(iM112836e));
        C22788g c22788g3 = this.f21167m0;
        if (c22788g3 != null && this.f21168n0 != null) {
            if (this.f21174t0 > -1 && this.f21178w0 != 0) {
                c22788g3.m66011m(this.f21183z.isFocused() ? ColorStateList.valueOf(this.f21125K0) : ColorStateList.valueOf(this.f21178w0));
                this.f21168n0.m66011m(ColorStateList.valueOf(this.f21178w0));
            }
            invalidate();
        }
        m15810H();
    }

    /* JADX INFO: renamed from: j */
    public final int m15820j() {
        float fM29846e;
        if (!this.f21160f0) {
            return 0;
        }
        int i13 = this.f21172r0;
        if (i13 == 0) {
            fM29846e = this.f21147V0.m29846e();
        } else {
            if (i13 != 2) {
                return 0;
            }
            fM29846e = this.f21147V0.m29846e() / 2.0f;
        }
        return (int) fM29846e;
    }

    /* JADX INFO: renamed from: k */
    public final C2951h m15821k() {
        C2951h c2951h = new C2951h((Object) null);
        c2951h.f11935y = AbstractC36259c.m115697k0(getContext(), com.whoop.android.R.attr.motionDurationShort2, 87);
        c2951h.f11936z = AbstractC36259c.m115699l0(getContext(), com.whoop.android.R.attr.motionEasingLinearInterpolator, AbstractC22766a.f89672a);
        return c2951h;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m15822l() {
        return this.f21160f0 && !TextUtils.isEmpty(this.f21161g0) && (this.f21163i0 instanceof C5048h);
    }

    /* JADX INFO: renamed from: m */
    public final C22788g m15823m(boolean z4) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_shape_corner_size_small_component);
        float f13 = z4 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f21183z;
        float popupElevation = editText instanceof C5065x ? ((C5065x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.whoop.android.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C22790i c22790i = new C22790i();
        C22790i c22790i2 = new C22790i();
        C22790i c22790i3 = new C22790i();
        C22790i c22790i4 = new C22790i();
        int i13 = 0;
        C22786e c22786e = new C22786e(i13);
        C22786e c22786e2 = new C22786e(i13);
        C22786e c22786e3 = new C22786e(i13);
        C22786e c22786e4 = new C22786e(i13);
        C22782a c22782a = new C22782a(f13);
        C22782a c22782a2 = new C22782a(f13);
        C22782a c22782a3 = new C22782a(dimensionPixelOffset);
        C22782a c22782a4 = new C22782a(dimensionPixelOffset);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = c22790i;
        c22792k.f89767b = c22790i2;
        c22792k.f89768c = c22790i3;
        c22792k.f89769d = c22790i4;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a4;
        c22792k.f89773h = c22782a3;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        EditText editText2 = this.f21183z;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C5065x ? ((C5065x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C22788g.f89728X;
            TypedValue typedValueM56325X = AbstractC20301a.m56325X(context, com.whoop.android.R.attr.colorSurface, C22788g.class.getSimpleName());
            int i14 = typedValueM56325X.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i14 != 0 ? AbstractC32122c.getColor(context, i14) : typedValueM56325X.data);
        }
        C22788g c22788g = new C22788g();
        c22788g.m66009k(context);
        c22788g.m66011m(dropDownBackgroundTintList);
        c22788g.m66010l(popupElevation);
        c22788g.setShapeAppearanceModel(c22792k);
        C22787f c22787f = c22788g.f89748w;
        if (c22787f.f89717h == null) {
            c22787f.f89717h = new Rect();
        }
        c22788g.f89748w.f89717h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c22788g.invalidateSelf();
        return c22788g;
    }

    /* JADX INFO: renamed from: n */
    public final int m15824n(int i13, boolean z4) {
        int compoundPaddingLeft;
        if (z4 || getPrefixText() == null) {
            compoundPaddingLeft = (!z4 || getSuffixText() == null) ? this.f21183z.getCompoundPaddingLeft() : this.f21181y.m15874c();
        } else {
            compoundPaddingLeft = this.f21179x.m15902a();
        }
        return compoundPaddingLeft + i13;
    }

    /* JADX INFO: renamed from: o */
    public final int m15825o(int i13, boolean z4) {
        int compoundPaddingRight;
        if (z4 || getSuffixText() == null) {
            compoundPaddingRight = (!z4 || getPrefixText() == null) ? this.f21183z.getCompoundPaddingRight() : this.f21179x.m15902a();
        } else {
            compoundPaddingRight = this.f21181y.m15874c();
        }
        return i13 - compoundPaddingRight;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21147V0.m29848h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int iMax;
        this.f21181y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z4 = false;
        this.f21156b1 = false;
        if (this.f21183z != null && this.f21183z.getMeasuredHeight() < (iMax = Math.max(this.f21181y.getMeasuredHeight(), this.f21179x.getMeasuredHeight()))) {
            this.f21183z.setMinimumHeight(iMax);
            z4 = true;
        }
        boolean zM15808F = m15808F();
        if (z4 || zM15808F) {
            this.f21183z.post(new RunnableC5035a0(this, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        EditText editText = this.f21183z;
        if (editText != null) {
            Rect rect = this.f21182y0;
            AbstractC11066d.m29858a(this, editText, rect);
            C22788g c22788g = this.f21167m0;
            if (c22788g != null) {
                int i17 = rect.bottom;
                c22788g.setBounds(rect.left, i17 - this.f21175u0, rect.right, i17);
            }
            C22788g c22788g2 = this.f21168n0;
            if (c22788g2 != null) {
                int i18 = rect.bottom;
                c22788g2.setBounds(rect.left, i18 - this.f21176v0, rect.right, i18);
            }
            if (this.f21160f0) {
                C11065c c11065c = this.f21147V0;
                float textSize = this.f21183z.getTextSize();
                if (c11065c.f34982l != textSize) {
                    c11065c.f34982l = textSize;
                    c11065c.m29849i(false);
                }
                int gravity = this.f21183z.getGravity();
                this.f21147V0.m29852l((gravity & (-113)) | 48);
                C11065c c11065c2 = this.f21147V0;
                if (c11065c2.f34978j != gravity) {
                    c11065c2.f34978j = gravity;
                    c11065c2.m29849i(false);
                }
                C11065c c11065c3 = this.f21147V0;
                if (this.f21183z == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.f21184z0;
                boolean zM29872f = AbstractC11075m.m29872f(this);
                rect2.bottom = rect.bottom;
                int i19 = this.f21172r0;
                if (i19 == 1) {
                    rect2.left = m15824n(rect.left, zM29872f);
                    rect2.top = rect.top + this.f21173s0;
                    rect2.right = m15825o(rect.right, zM29872f);
                } else if (i19 != 2) {
                    rect2.left = m15824n(rect.left, zM29872f);
                    rect2.top = getPaddingTop();
                    rect2.right = m15825o(rect.right, zM29872f);
                } else {
                    rect2.left = this.f21183z.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m15820j();
                    rect2.right = rect.right - this.f21183z.getPaddingRight();
                }
                c11065c3.getClass();
                int i24 = rect2.left;
                int i25 = rect2.top;
                int i26 = rect2.right;
                int i27 = rect2.bottom;
                Rect rect3 = c11065c3.f34974h;
                if (rect3.left != i24 || rect3.top != i25 || rect3.right != i26 || rect3.bottom != i27) {
                    rect3.set(i24, i25, i26, i27);
                    c11065c3.f34952S = true;
                }
                C11065c c11065c4 = this.f21147V0;
                if (this.f21183z == null) {
                    throw new IllegalStateException();
                }
                Rect rect4 = this.f21184z0;
                TextPaint textPaint = c11065c4.f34954U;
                textPaint.setTextSize(c11065c4.f34982l);
                textPaint.setTypeface(c11065c4.f35002z);
                textPaint.setLetterSpacing(c11065c4.f34973g0);
                float f13 = -textPaint.ascent();
                rect4.left = this.f21183z.getCompoundPaddingLeft() + rect.left;
                rect4.top = (this.f21172r0 != 1 || this.f21183z.getMinLines() > 1) ? rect.top + this.f21183z.getCompoundPaddingTop() : (int) (rect.centerY() - (f13 / 2.0f));
                rect4.right = rect.right - this.f21183z.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f21172r0 != 1 || this.f21183z.getMinLines() > 1) ? rect.bottom - this.f21183z.getCompoundPaddingBottom() : (int) (rect4.top + f13);
                rect4.bottom = compoundPaddingBottom;
                int i28 = rect4.left;
                int i29 = rect4.top;
                int i34 = rect4.right;
                Rect rect5 = c11065c4.f34972g;
                if (rect5.left != i28 || rect5.top != i29 || rect5.right != i34 || rect5.bottom != compoundPaddingBottom) {
                    rect5.set(i28, i29, i34, compoundPaddingBottom);
                    c11065c4.f34952S = true;
                }
                this.f21147V0.m29849i(false);
                if (!m15822l() || this.f21145U0) {
                    return;
                }
                m15833w();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        EditText editText;
        super.onMeasure(i13, i14);
        if (!this.f21156b1) {
            this.f21181y.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f21156b1 = true;
        }
        if (this.f21142T != null && (editText = this.f21183z) != null) {
            this.f21142T.setGravity(editText.getGravity());
            this.f21142T.setPadding(this.f21183z.getCompoundPaddingLeft(), this.f21183z.getCompoundPaddingTop(), this.f21183z.getCompoundPaddingRight(), this.f21183z.getCompoundPaddingBottom());
        }
        this.f21181y.m15884m();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5049h0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5049h0 c5049h0 = (C5049h0) parcelable;
        super.onRestoreInstanceState(c5049h0.m113141b());
        setError(c5049h0.f21214y);
        if (c5049h0.f21215z) {
            post(new RunnableC5039c0(this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        boolean z4 = i13 == 1;
        if (z4 != this.f21170p0) {
            float fMo65993a = this.f21169o0.f89770e.mo65993a(this.f21108A0);
            float fMo65993a2 = this.f21169o0.f89771f.mo65993a(this.f21108A0);
            float fMo65993a3 = this.f21169o0.f89773h.mo65993a(this.f21108A0);
            float fMo65993a4 = this.f21169o0.f89772g.mo65993a(this.f21108A0);
            C22792k c22792k = this.f21169o0;
            AbstractC32410a abstractC32410a = c22792k.f89766a;
            AbstractC32410a abstractC32410a2 = c22792k.f89767b;
            AbstractC32410a abstractC32410a3 = c22792k.f89769d;
            AbstractC32410a abstractC32410a4 = c22792k.f89768c;
            C22786e c22786e = new C22786e(0);
            C22786e c22786e2 = new C22786e(0);
            C22786e c22786e3 = new C22786e(0);
            C22786e c22786e4 = new C22786e(0);
            C22782a c22782a = new C22782a(fMo65993a2);
            C22782a c22782a2 = new C22782a(fMo65993a);
            C22782a c22782a3 = new C22782a(fMo65993a4);
            C22782a c22782a4 = new C22782a(fMo65993a3);
            C22792k c22792k2 = new C22792k();
            c22792k2.f89766a = abstractC32410a2;
            c22792k2.f89767b = abstractC32410a;
            c22792k2.f89768c = abstractC32410a3;
            c22792k2.f89769d = abstractC32410a4;
            c22792k2.f89770e = c22782a;
            c22792k2.f89771f = c22782a2;
            c22792k2.f89772g = c22782a4;
            c22792k2.f89773h = c22782a3;
            c22792k2.f89774i = c22786e;
            c22792k2.f89775j = c22786e2;
            c22792k2.f89776k = c22786e3;
            c22792k2.f89777l = c22786e4;
            this.f21170p0 = z4;
            setShapeAppearanceModel(c22792k2);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5049h0 c5049h0 = new C5049h0(super.onSaveInstanceState());
        if (m15804B()) {
            c5049h0.f21214y = getError();
        }
        C5058q c5058q = this.f21181y;
        c5049h0.f21215z = c5058q.f21245I != 0 && c5058q.f21243G.f21004z;
        return c5049h0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m15826p() {
        return this.f21181y.m15875d();
    }

    /* JADX INFO: renamed from: q */
    public boolean m15827q() {
        return this.f21122J.f21291q;
    }

    /* JADX INFO: renamed from: r */
    public boolean m15828r() {
        return this.f21122J.f21298x;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15829s() {
        return this.f21160f0;
    }

    public void setBoxBackgroundColor(int i13) {
        if (this.f21180x0 != i13) {
            this.f21180x0 = i13;
            this.f21133O0 = i13;
            this.f21137Q0 = i13;
            this.f21139R0 = i13;
            m15819i();
        }
    }

    public void setBoxBackgroundColorResource(int i13) {
        setBoxBackgroundColor(AbstractC32122c.getColor(getContext(), i13));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f21133O0 = defaultColor;
        this.f21180x0 = defaultColor;
        this.f21135P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f21137Q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f21139R0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m15819i();
    }

    public void setBoxBackgroundMode(int i13) {
        if (i13 == this.f21172r0) {
            return;
        }
        this.f21172r0 = i13;
        if (this.f21183z != null) {
            m15832v();
        }
    }

    public void setBoxCollapsedPaddingTop(int i13) {
        this.f21173s0 = i13;
    }

    public void setBoxCornerFamily(int i13) {
        C22791j c22791jM66029e = this.f21169o0.m66029e();
        InterfaceC22784c interfaceC22784c = this.f21169o0.f89770e;
        c22791jM66029e.f89753a = AbstractC32411b.m101114z(i13);
        c22791jM66029e.f89757e = interfaceC22784c;
        InterfaceC22784c interfaceC22784c2 = this.f21169o0.f89771f;
        c22791jM66029e.f89754b = AbstractC32411b.m101114z(i13);
        c22791jM66029e.f89758f = interfaceC22784c2;
        InterfaceC22784c interfaceC22784c3 = this.f21169o0.f89773h;
        c22791jM66029e.f89756d = AbstractC32411b.m101114z(i13);
        c22791jM66029e.f89760h = interfaceC22784c3;
        InterfaceC22784c interfaceC22784c4 = this.f21169o0.f89772g;
        c22791jM66029e.f89755c = AbstractC32411b.m101114z(i13);
        c22791jM66029e.f89759g = interfaceC22784c4;
        this.f21169o0 = c22791jM66029e.m66021a();
        m15819i();
    }

    public void setBoxStrokeColor(int i13) {
        if (this.f21129M0 != i13) {
            this.f21129M0 = i13;
            m15816N();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f21125K0 = colorStateList.getDefaultColor();
            this.f21141S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f21127L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f21129M0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f21129M0 != colorStateList.getDefaultColor()) {
            this.f21129M0 = colorStateList.getDefaultColor();
        }
        m15816N();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f21131N0 != colorStateList) {
            this.f21131N0 = colorStateList;
            m15816N();
        }
    }

    public void setBoxStrokeWidth(int i13) {
        this.f21175u0 = i13;
        m15816N();
    }

    public void setBoxStrokeWidthFocused(int i13) {
        this.f21176v0 = i13;
        m15816N();
    }

    public void setBoxStrokeWidthFocusedResource(int i13) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i13));
    }

    public void setBoxStrokeWidthResource(int i13) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i13));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f21124K != z4) {
            if (z4) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f21132O = appCompatTextView;
                appCompatTextView.setId(com.whoop.android.R.id.textinput_counter);
                Typeface typeface = this.f21109B0;
                if (typeface != null) {
                    this.f21132O.setTypeface(typeface);
                }
                this.f21132O.setMaxLines(1);
                this.f21122J.m15889a(this.f21132O, 2);
                ((ViewGroup.MarginLayoutParams) this.f21132O.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_textinput_counter_margin_start));
                m15806D();
                if (this.f21132O != null) {
                    EditText editText = this.f21183z;
                    m15805C(editText != null ? editText.getText() : null);
                }
            } else {
                this.f21122J.m15895g(this.f21132O, 2);
                this.f21132O = null;
            }
            this.f21124K = z4;
        }
    }

    public void setCounterMaxLength(int i13) {
        if (this.f21126L != i13) {
            if (i13 > 0) {
                this.f21126L = i13;
            } else {
                this.f21126L = -1;
            }
            if (!this.f21124K || this.f21132O == null) {
                return;
            }
            EditText editText = this.f21183z;
            m15805C(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i13) {
        if (this.f21134P != i13) {
            this.f21134P = i13;
            m15806D();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f21157c0 != colorStateList) {
            this.f21157c0 = colorStateList;
            m15806D();
        }
    }

    public void setCounterTextAppearance(int i13) {
        if (this.f21136Q != i13) {
            this.f21136Q = i13;
            m15806D();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f21155b0 != colorStateList) {
            this.f21155b0 = colorStateList;
            m15806D();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f21158d0 != colorStateList) {
            this.f21158d0 = colorStateList;
            m15807E();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f21159e0 != colorStateList) {
            this.f21159e0 = colorStateList;
            if (m15804B() || (this.f21132O != null && this.f21128M)) {
                m15807E();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f21121I0 = colorStateList;
        this.f21123J0 = colorStateList;
        if (this.f21183z != null) {
            m15812J(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        m15802x(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f21181y.f21243G.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f21181y.f21243G.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i13) {
        C5058q c5058q = this.f21181y;
        CharSequence text = i13 != 0 ? c5058q.getResources().getText(i13) : null;
        CheckableImageButton checkableImageButton = c5058q.f21243G;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i13) {
        C5058q c5058q = this.f21181y;
        Drawable drawableM92133x = i13 != 0 ? AbstractC30060g.m92133x(c5058q.getContext(), i13) : null;
        TextInputLayout textInputLayout = c5058q.f21259w;
        CheckableImageButton checkableImageButton = c5058q.f21243G;
        checkableImageButton.setImageDrawable(drawableM92133x);
        if (drawableM92133x != null) {
            AbstractC32073e.m99754m(textInputLayout, checkableImageButton, c5058q.f21247K, c5058q.f21248L);
            AbstractC32073e.m99730X(textInputLayout, checkableImageButton, c5058q.f21247K);
        }
    }

    public void setEndIconMinSize(int i13) {
        C5058q c5058q = this.f21181y;
        if (i13 < 0) {
            c5058q.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i13 != c5058q.f21249M) {
            c5058q.f21249M = i13;
            CheckableImageButton checkableImageButton = c5058q.f21243G;
            checkableImageButton.setMinimumWidth(i13);
            checkableImageButton.setMinimumHeight(i13);
            CheckableImageButton checkableImageButton2 = c5058q.f21261y;
            checkableImageButton2.setMinimumWidth(i13);
            checkableImageButton2.setMinimumHeight(i13);
        }
    }

    public void setEndIconMode(int i13) {
        this.f21181y.m15878g(i13);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C5058q c5058q = this.f21181y;
        CheckableImageButton checkableImageButton = c5058q.f21243G;
        View.OnLongClickListener onLongClickListener = c5058q.f21251O;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C5058q c5058q = this.f21181y;
        c5058q.f21251O = onLongClickListener;
        CheckableImageButton checkableImageButton = c5058q.f21243G;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C5058q c5058q = this.f21181y;
        c5058q.f21250N = scaleType;
        c5058q.f21243G.setScaleType(scaleType);
        c5058q.f21261y.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C5058q c5058q = this.f21181y;
        if (c5058q.f21247K != colorStateList) {
            c5058q.f21247K = colorStateList;
            AbstractC32073e.m99754m(c5058q.f21259w, c5058q.f21243G, colorStateList, c5058q.f21248L);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C5058q c5058q = this.f21181y;
        if (c5058q.f21248L != mode) {
            c5058q.f21248L = mode;
            AbstractC32073e.m99754m(c5058q.f21259w, c5058q.f21243G, c5058q.f21247K, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        this.f21181y.m15879h(z4);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f21122J.f21291q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f21122J.m15894f();
            return;
        }
        C5062u c5062u = this.f21122J;
        c5062u.m15891c();
        c5062u.f21290p = charSequence;
        c5062u.f21292r.setText(charSequence);
        int i13 = c5062u.f21288n;
        if (i13 != 1) {
            c5062u.f21289o = 1;
        }
        c5062u.m15897i(i13, c5062u.f21289o, c5062u.m15896h(c5062u.f21292r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i13) {
        C5062u c5062u = this.f21122J;
        c5062u.f21294t = i13;
        AppCompatTextView appCompatTextView = c5062u.f21292r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            appCompatTextView.setAccessibilityLiveRegion(i13);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C5062u c5062u = this.f21122J;
        c5062u.f21293s = charSequence;
        AppCompatTextView appCompatTextView = c5062u.f21292r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) {
        C5062u c5062u = this.f21122J;
        TextInputLayout textInputLayout = c5062u.f21282h;
        if (c5062u.f21291q == z4) {
            return;
        }
        c5062u.m15891c();
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c5062u.f21281g, null);
            c5062u.f21292r = appCompatTextView;
            appCompatTextView.setId(com.whoop.android.R.id.textinput_error);
            c5062u.f21292r.setTextAlignment(5);
            Typeface typeface = c5062u.f21274B;
            if (typeface != null) {
                c5062u.f21292r.setTypeface(typeface);
            }
            int i13 = c5062u.f21295u;
            c5062u.f21295u = i13;
            AppCompatTextView appCompatTextView2 = c5062u.f21292r;
            if (appCompatTextView2 != null) {
                c5062u.f21282h.m15803A(appCompatTextView2, i13);
            }
            ColorStateList colorStateList = c5062u.f21296v;
            c5062u.f21296v = colorStateList;
            AppCompatTextView appCompatTextView3 = c5062u.f21292r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c5062u.f21293s;
            c5062u.f21293s = charSequence;
            AppCompatTextView appCompatTextView4 = c5062u.f21292r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i14 = c5062u.f21294t;
            c5062u.f21294t = i14;
            AppCompatTextView appCompatTextView5 = c5062u.f21292r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                appCompatTextView5.setAccessibilityLiveRegion(i14);
            }
            c5062u.f21292r.setVisibility(4);
            c5062u.m15889a(c5062u.f21292r, 0);
        } else {
            c5062u.m15894f();
            c5062u.m15895g(c5062u.f21292r, 0);
            c5062u.f21292r = null;
            textInputLayout.m15809G();
            textInputLayout.m15816N();
        }
        c5062u.f21291q = z4;
    }

    public void setErrorIconDrawable(int i13) {
        C5058q c5058q = this.f21181y;
        c5058q.m15880i(i13 != 0 ? AbstractC30060g.m92133x(c5058q.getContext(), i13) : null);
        AbstractC32073e.m99730X(c5058q.f21259w, c5058q.f21261y, c5058q.f21262z);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C5058q c5058q = this.f21181y;
        CheckableImageButton checkableImageButton = c5058q.f21261y;
        View.OnLongClickListener onLongClickListener = c5058q.f21242F;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C5058q c5058q = this.f21181y;
        c5058q.f21242F = onLongClickListener;
        CheckableImageButton checkableImageButton = c5058q.f21261y;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C5058q c5058q = this.f21181y;
        if (c5058q.f21262z != colorStateList) {
            c5058q.f21262z = colorStateList;
            AbstractC32073e.m99754m(c5058q.f21259w, c5058q.f21261y, colorStateList, c5058q.f21241E);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C5058q c5058q = this.f21181y;
        if (c5058q.f21241E != mode) {
            c5058q.f21241E = mode;
            AbstractC32073e.m99754m(c5058q.f21259w, c5058q.f21261y, c5058q.f21262z, mode);
        }
    }

    public void setErrorTextAppearance(int i13) {
        C5062u c5062u = this.f21122J;
        c5062u.f21295u = i13;
        AppCompatTextView appCompatTextView = c5062u.f21292r;
        if (appCompatTextView != null) {
            c5062u.f21282h.m15803A(appCompatTextView, i13);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C5062u c5062u = this.f21122J;
        c5062u.f21296v = colorStateList;
        AppCompatTextView appCompatTextView = c5062u.f21292r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.f21149W0 != z4) {
            this.f21149W0 = z4;
            m15812J(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m15828r()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!m15828r()) {
            setHelperTextEnabled(true);
        }
        C5062u c5062u = this.f21122J;
        c5062u.m15891c();
        c5062u.f21297w = charSequence;
        c5062u.f21299y.setText(charSequence);
        int i13 = c5062u.f21288n;
        if (i13 != 2) {
            c5062u.f21289o = 2;
        }
        c5062u.m15897i(i13, c5062u.f21289o, c5062u.m15896h(c5062u.f21299y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C5062u c5062u = this.f21122J;
        c5062u.f21273A = colorStateList;
        AppCompatTextView appCompatTextView = c5062u.f21299y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        C5062u c5062u = this.f21122J;
        TextInputLayout textInputLayout = c5062u.f21282h;
        if (c5062u.f21298x == z4) {
            return;
        }
        c5062u.m15891c();
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c5062u.f21281g, null);
            c5062u.f21299y = appCompatTextView;
            appCompatTextView.setId(com.whoop.android.R.id.textinput_helper_text);
            c5062u.f21299y.setTextAlignment(5);
            Typeface typeface = c5062u.f21274B;
            if (typeface != null) {
                c5062u.f21299y.setTypeface(typeface);
            }
            c5062u.f21299y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = c5062u.f21299y;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i13 = c5062u.f21300z;
            c5062u.f21300z = i13;
            AppCompatTextView appCompatTextView3 = c5062u.f21299y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i13);
            }
            ColorStateList colorStateList = c5062u.f21273A;
            c5062u.f21273A = colorStateList;
            AppCompatTextView appCompatTextView4 = c5062u.f21299y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            c5062u.m15889a(c5062u.f21299y, 1);
            c5062u.f21299y.setAccessibilityDelegate(new C5061t(c5062u));
        } else {
            c5062u.m15891c();
            int i14 = c5062u.f21288n;
            if (i14 == 2) {
                c5062u.f21289o = 0;
            }
            c5062u.m15897i(i14, c5062u.f21289o, c5062u.m15896h(c5062u.f21299y, ""));
            c5062u.m15895g(c5062u.f21299y, 1);
            c5062u.f21299y = null;
            textInputLayout.m15809G();
            textInputLayout.m15816N();
        }
        c5062u.f21298x = z4;
    }

    public void setHelperTextTextAppearance(int i13) {
        C5062u c5062u = this.f21122J;
        c5062u.f21300z = i13;
        AppCompatTextView appCompatTextView = c5062u.f21299y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i13);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f21160f0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.f21150X0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.f21160f0) {
            this.f21160f0 = z4;
            if (z4) {
                CharSequence hint = this.f21183z.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f21161g0)) {
                        setHint(hint);
                    }
                    this.f21183z.setHint((CharSequence) null);
                }
                this.f21162h0 = true;
            } else {
                this.f21162h0 = false;
                if (!TextUtils.isEmpty(this.f21161g0) && TextUtils.isEmpty(this.f21183z.getHint())) {
                    this.f21183z.setHint(this.f21161g0);
                }
                setHintInternal(null);
            }
            if (this.f21183z != null) {
                m15811I();
            }
        }
    }

    public void setHintTextAppearance(int i13) {
        this.f21147V0.m29851k(i13);
        this.f21123J0 = this.f21147V0.f34988o;
        if (this.f21183z != null) {
            m15812J(false);
            m15811I();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f21123J0 != colorStateList) {
            if (this.f21121I0 == null) {
                C11065c c11065c = this.f21147V0;
                if (c11065c.f34988o != colorStateList) {
                    c11065c.f34988o = colorStateList;
                    c11065c.m29849i(false);
                }
            }
            this.f21123J0 = colorStateList;
            if (this.f21183z != null) {
                m15812J(false);
            }
        }
    }

    public void setLengthCounter(InterfaceC5045f0 interfaceC5045f0) {
        this.f21130N = interfaceC5045f0;
    }

    public void setMaxEms(int i13) {
        this.f21116G = i13;
        EditText editText = this.f21183z;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMaxEms(i13);
    }

    public void setMaxWidth(int i13) {
        this.f21120I = i13;
        EditText editText = this.f21183z;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMaxWidth(i13);
    }

    public void setMaxWidthResource(int i13) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i13));
    }

    public void setMinEms(int i13) {
        this.f21114F = i13;
        EditText editText = this.f21183z;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMinEms(i13);
    }

    public void setMinWidth(int i13) {
        this.f21118H = i13;
        EditText editText = this.f21183z;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMinWidth(i13);
    }

    public void setMinWidthResource(int i13) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i13));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i13) {
        C5058q c5058q = this.f21181y;
        c5058q.f21243G.setContentDescription(i13 != 0 ? c5058q.getResources().getText(i13) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i13) {
        C5058q c5058q = this.f21181y;
        c5058q.f21243G.setImageDrawable(i13 != 0 ? AbstractC30060g.m92133x(c5058q.getContext(), i13) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        C5058q c5058q = this.f21181y;
        if (z4 && c5058q.f21245I != 1) {
            c5058q.m15878g(1);
        } else if (z4) {
            c5058q.getClass();
        } else {
            c5058q.m15878g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C5058q c5058q = this.f21181y;
        c5058q.f21247K = colorStateList;
        AbstractC32073e.m99754m(c5058q.f21259w, c5058q.f21243G, colorStateList, c5058q.f21248L);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C5058q c5058q = this.f21181y;
        c5058q.f21248L = mode;
        AbstractC32073e.m99754m(c5058q.f21259w, c5058q.f21243G, c5058q.f21247K, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f21142T == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f21142T = appCompatTextView;
            appCompatTextView.setId(com.whoop.android.R.id.textinput_placeholder);
            TextView textView = this.f21142T;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            textView.setImportantForAccessibility(2);
            C2951h c2951hM15821k = m15821k();
            this.f21148W = c2951hM15821k;
            c2951hM15821k.f11934x = 67L;
            this.f21153a0 = m15821k();
            setPlaceholderTextAppearance(this.f21146V);
            setPlaceholderTextColor(this.f21144U);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f21140S) {
                setPlaceholderTextEnabled(true);
            }
            this.f21138R = charSequence;
        }
        EditText editText = this.f21183z;
        m15814L(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i13) {
        this.f21146V = i13;
        TextView textView = this.f21142T;
        if (textView != null) {
            textView.setTextAppearance(i13);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f21144U != colorStateList) {
            this.f21144U = colorStateList;
            TextView textView = this.f21142T;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C5067z c5067z = this.f21179x;
        c5067z.getClass();
        c5067z.f21324y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c5067z.f21323x.setText(charSequence);
        c5067z.m15906e();
    }

    public void setPrefixTextAppearance(int i13) {
        this.f21179x.f21323x.setTextAppearance(i13);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f21179x.f21323x.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C22792k c22792k) {
        C22788g c22788g = this.f21163i0;
        if (c22788g == null || c22788g.f89748w.f89710a == c22792k) {
            return;
        }
        this.f21169o0 = c22792k;
        m15819i();
    }

    public void setStartIconCheckable(boolean z4) {
        this.f21179x.f21325z.setCheckable(z4);
    }

    public void setStartIconContentDescription(int i13) {
        setStartIconContentDescription(i13 != 0 ? getResources().getText(i13) : null);
    }

    public void setStartIconDrawable(int i13) {
        setStartIconDrawable(i13 != 0 ? AbstractC30060g.m92133x(getContext(), i13) : null);
    }

    public void setStartIconMinSize(int i13) {
        C5067z c5067z = this.f21179x;
        if (i13 < 0) {
            c5067z.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i13 != c5067z.f21318G) {
            c5067z.f21318G = i13;
            CheckableImageButton checkableImageButton = c5067z.f21325z;
            checkableImageButton.setMinimumWidth(i13);
            checkableImageButton.setMinimumHeight(i13);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C5067z c5067z = this.f21179x;
        CheckableImageButton checkableImageButton = c5067z.f21325z;
        View.OnLongClickListener onLongClickListener = c5067z.f21320I;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C5067z c5067z = this.f21179x;
        c5067z.f21320I = onLongClickListener;
        CheckableImageButton checkableImageButton = c5067z.f21325z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C5067z c5067z = this.f21179x;
        c5067z.f21319H = scaleType;
        c5067z.f21325z.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C5067z c5067z = this.f21179x;
        if (c5067z.f21316E != colorStateList) {
            c5067z.f21316E = colorStateList;
            AbstractC32073e.m99754m(c5067z.f21322w, c5067z.f21325z, colorStateList, c5067z.f21317F);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C5067z c5067z = this.f21179x;
        if (c5067z.f21317F != mode) {
            c5067z.f21317F = mode;
            AbstractC32073e.m99754m(c5067z.f21322w, c5067z.f21325z, c5067z.f21316E, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f21179x.m15904c(z4);
    }

    public void setSuffixText(CharSequence charSequence) {
        C5058q c5058q = this.f21181y;
        c5058q.getClass();
        c5058q.f21252P = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c5058q.f21253Q.setText(charSequence);
        c5058q.m15885n();
    }

    public void setSuffixTextAppearance(int i13) {
        this.f21181y.f21253Q.setTextAppearance(i13);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f21181y.f21253Q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C5043e0 c5043e0) {
        EditText editText = this.f21183z;
        if (editText != null) {
            AbstractC16901p0.m47583n(editText, c5043e0);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f21109B0) {
            this.f21109B0 = typeface;
            C11065c c11065c = this.f21147V0;
            boolean zM29853m = c11065c.m29853m(typeface);
            boolean zM29855o = c11065c.m29855o(typeface);
            if (zM29853m || zM29855o) {
                c11065c.m29849i(false);
            }
            C5062u c5062u = this.f21122J;
            if (typeface != c5062u.f21274B) {
                c5062u.f21274B = typeface;
                AppCompatTextView appCompatTextView = c5062u.f21292r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = c5062u.f21299y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            TextView textView = this.f21132O;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15830t() {
        return this.f21145U0;
    }

    /* JADX INFO: renamed from: u */
    public boolean m15831u() {
        return this.f21162h0;
    }

    /* JADX INFO: renamed from: v */
    public final void m15832v() {
        int i13 = this.f21172r0;
        if (i13 == 0) {
            this.f21163i0 = null;
            this.f21167m0 = null;
            this.f21168n0 = null;
        } else if (i13 == 1) {
            this.f21163i0 = new C22788g(this.f21169o0);
            this.f21167m0 = new C22788g();
            this.f21168n0 = new C22788g();
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException(AbstractC18489d0.m53371l(new StringBuilder(), this.f21172r0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f21160f0 || (this.f21163i0 instanceof C5048h)) {
                this.f21163i0 = new C22788g(this.f21169o0);
            } else {
                C22792k c22792k = this.f21169o0;
                int i14 = C5048h.f21212Z;
                if (c22792k == null) {
                    c22792k = new C22792k();
                }
                C5046g c5046g = new C5046g(c22792k, new RectF());
                C5048h c5048h = new C5048h(c5046g);
                c5048h.f21213Y = c5046g;
                this.f21163i0 = c5048h;
            }
            this.f21167m0 = null;
            this.f21168n0 = null;
        }
        m15810H();
        m15816N();
        if (this.f21172r0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f21173s0 = getResources().getDimensionPixelSize(com.whoop.android.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC22674j.m65705M(getContext())) {
                this.f21173s0 = getResources().getDimensionPixelSize(com.whoop.android.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f21183z != null && this.f21172r0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f21183z;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.whoop.android.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f21183z.getPaddingEnd(), getResources().getDimensionPixelSize(com.whoop.android.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC22674j.m65705M(getContext())) {
                EditText editText2 = this.f21183z;
                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.whoop.android.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f21183z.getPaddingEnd(), getResources().getDimensionPixelSize(com.whoop.android.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f21172r0 != 0) {
            m15811I();
        }
        EditText editText3 = this.f21183z;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i15 = this.f21172r0;
                if (i15 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i15 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX INFO: renamed from: w */
    public final void m15833w() {
        float f13;
        float f14;
        float f15;
        float f16;
        int i13;
        float f17;
        int i14;
        if (m15822l()) {
            RectF rectF = this.f21108A0;
            C11065c c11065c = this.f21147V0;
            int width = this.f21183z.getWidth();
            int gravity = this.f21183z.getGravity();
            boolean zM29843b = c11065c.m29843b(c11065c.f34940G);
            c11065c.f34942I = zM29843b;
            Rect rect = c11065c.f34974h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM29843b) {
                        i14 = rect.left;
                        f15 = i14;
                    } else {
                        f13 = rect.right;
                        f14 = c11065c.f34979j0;
                    }
                } else if (zM29843b) {
                    f13 = rect.right;
                    f14 = c11065c.f34979j0;
                } else {
                    i14 = rect.left;
                    f15 = i14;
                }
                float fMax = Math.max(f15, rect.left);
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f16 = (width / 2.0f) + (c11065c.f34979j0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c11065c.f34942I) {
                        f17 = c11065c.f34979j0;
                        f16 = f17 + fMax;
                    } else {
                        i13 = rect.right;
                        f16 = i13;
                    }
                } else if (c11065c.f34942I) {
                    i13 = rect.right;
                    f16 = i13;
                } else {
                    f17 = c11065c.f34979j0;
                    f16 = f17 + fMax;
                }
                rectF.right = Math.min(f16, rect.right);
                rectF.bottom = c11065c.m29846e() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f18 = rectF.left;
                float f19 = this.f21171q0;
                rectF.left = f18 - f19;
                rectF.right += f19;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f21174t0);
                C5048h c5048h = (C5048h) this.f21163i0;
                c5048h.getClass();
                c5048h.m15849w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f13 = width / 2.0f;
            f14 = c11065c.f34979j0 / 2.0f;
            f15 = f13 - f14;
            float fMax2 = Math.max(f15, rect.left);
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f16 = (width / 2.0f) + (c11065c.f34979j0 / 2.0f);
            } else {
                f16 = (width / 2.0f) + (c11065c.f34979j0 / 2.0f);
            }
            rectF.right = Math.min(f16, rect.right);
            rectF.bottom = c11065c.m29846e() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m15834y() {
        C5067z c5067z = this.f21179x;
        AbstractC32073e.m99730X(c5067z.f21322w, c5067z.f21325z, c5067z.f21316E);
    }

    /* JADX INFO: renamed from: z */
    public void m15835z(float f13, float f14, float f15, float f16) {
        boolean zM29872f = AbstractC11075m.m29872f(this);
        this.f21170p0 = zM29872f;
        float f17 = zM29872f ? f14 : f13;
        if (!zM29872f) {
            f13 = f14;
        }
        float f18 = zM29872f ? f16 : f15;
        if (!zM29872f) {
            f15 = f16;
        }
        C22788g c22788g = this.f21163i0;
        if (c22788g != null && c22788g.m66007i() == f17) {
            C22788g c22788g2 = this.f21163i0;
            if (c22788g2.f89748w.f89710a.f89771f.mo65993a(c22788g2.m66006h()) == f13) {
                C22788g c22788g3 = this.f21163i0;
                if (c22788g3.f89748w.f89710a.f89773h.mo65993a(c22788g3.m66006h()) == f18) {
                    C22788g c22788g4 = this.f21163i0;
                    if (c22788g4.f89748w.f89710a.f89772g.mo65993a(c22788g4.m66006h()) == f15) {
                        return;
                    }
                }
            }
        }
        C22791j c22791jM66029e = this.f21169o0.m66029e();
        c22791jM66029e.f89757e = new C22782a(f17);
        c22791jM66029e.f89758f = new C22782a(f13);
        c22791jM66029e.m66023c(f18);
        c22791jM66029e.m66024d(f15);
        this.f21169o0 = c22791jM66029e.m66021a();
        m15819i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f21106c1;
        super(AbstractC30554a.m93706a(context, attributeSet, i13, i14), attributeSet, i13);
        this.f21114F = -1;
        this.f21116G = -1;
        this.f21118H = -1;
        this.f21120I = -1;
        this.f21122J = new C5062u(this);
        this.f21130N = new C4316g(9);
        this.f21182y0 = new Rect();
        this.f21184z0 = new Rect();
        this.f21108A0 = new RectF();
        this.f21113E0 = new LinkedHashSet<>();
        C11065c c11065c = new C11065c(this);
        this.f21147V0 = c11065c;
        this.f21156b1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f21177w = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC22766a.f89672a;
        c11065c.f34956W = linearInterpolator;
        c11065c.m29849i(false);
        c11065c.f34955V = linearInterpolator;
        c11065c.m29849i(false);
        c11065c.m29852l(8388659);
        AbstractC11075m.m29867a(context2, attributeSet, i13, i14);
        int[] iArr = AbstractC21885a.f84539P;
        AbstractC11075m.m29868b(context2, attributeSet, iArr, i13, i14, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        C31983m2 c31983m2 = new C31983m2(context2, typedArrayObtainStyledAttributes);
        C5067z c5067z = new C5067z(this, c31983m2);
        this.f21179x = c5067z;
        this.f21160f0 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f21150X0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f21149W0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f21169o0 = C22792k.m66026b(context2, attributeSet, i13, i14).m66021a();
        this.f21171q0 = context2.getResources().getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f21173s0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f21175u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.whoop.android.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f21176v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.whoop.android.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f21174t0 = this.f21175u0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C22791j c22791jM66029e = this.f21169o0.m66029e();
        if (dimension >= 0.0f) {
            c22791jM66029e.f89757e = new C22782a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c22791jM66029e.f89758f = new C22782a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c22791jM66029e.m66024d(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c22791jM66029e.m66023c(dimension4);
        }
        this.f21169o0 = c22791jM66029e.m66021a();
        ColorStateList colorStateListM65694B = AbstractC22674j.m65694B(context2, c31983m2, 7);
        if (colorStateListM65694B != null) {
            int defaultColor = colorStateListM65694B.getDefaultColor();
            this.f21133O0 = defaultColor;
            this.f21180x0 = defaultColor;
            if (colorStateListM65694B.isStateful()) {
                this.f21135P0 = colorStateListM65694B.getColorForState(new int[]{-16842910}, -1);
                this.f21137Q0 = colorStateListM65694B.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f21139R0 = colorStateListM65694B.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f21137Q0 = this.f21133O0;
                ColorStateList colorStateList = AbstractC32122c.getColorStateList(context2, com.whoop.android.R.color.mtrl_filled_background_color);
                this.f21135P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f21139R0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f21180x0 = 0;
            this.f21133O0 = 0;
            this.f21135P0 = 0;
            this.f21137Q0 = 0;
            this.f21139R0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM99484h = c31983m2.m99484h(1);
            this.f21123J0 = colorStateListM99484h;
            this.f21121I0 = colorStateListM99484h;
        }
        ColorStateList colorStateListM65694B2 = AbstractC22674j.m65694B(context2, c31983m2, 14);
        this.f21129M0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f21125K0 = AbstractC32122c.getColor(context2, com.whoop.android.R.color.mtrl_textinput_default_box_stroke_color);
        this.f21141S0 = AbstractC32122c.getColor(context2, com.whoop.android.R.color.mtrl_textinput_disabled_color);
        this.f21127L0 = AbstractC32122c.getColor(context2, com.whoop.android.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM65694B2 != null) {
            setBoxStrokeColorStateList(colorStateListM65694B2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC22674j.m65694B(context2, c31983m2, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f21158d0 = c31983m2.m99484h(24);
        this.f21159e0 = c31983m2.m99484h(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i15 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f21136Q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f21134P = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i15);
        setCounterOverflowTextAppearance(this.f21134P);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f21136Q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c31983m2.m99484h(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c31983m2.m99484h(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c31983m2.m99484h(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c31983m2.m99484h(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c31983m2.m99484h(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c31983m2.m99484h(58));
        }
        C5058q c5058q = new C5058q(this, c31983m2);
        this.f21181y = c5058q;
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c31983m2.m99491r();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setImportantForAccessibility(2);
        AbstractC16886k0.m47548b(this, 1);
        frameLayout.addView(c5067z);
        frameLayout.addView(c5058q);
        addView(frameLayout);
        setEnabled(z15);
        setHelperTextEnabled(z13);
        setErrorEnabled(z4);
        setCounterEnabled(z14);
        setHelperText(text2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f21179x.f21325z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f21179x.m15903b(drawable);
    }

    public void setHint(int i13) {
        setHint(i13 != 0 ? getResources().getText(i13) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f21181y.f21243G.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f21181y.f21243G.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f21181y.m15880i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f21181y.f21243G;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C5058q c5058q = this.f21181y;
        TextInputLayout textInputLayout = c5058q.f21259w;
        CheckableImageButton checkableImageButton = c5058q.f21243G;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC32073e.m99754m(textInputLayout, checkableImageButton, c5058q.f21247K, c5058q.f21248L);
            AbstractC32073e.m99730X(textInputLayout, checkableImageButton, c5058q.f21247K);
        }
    }
}
