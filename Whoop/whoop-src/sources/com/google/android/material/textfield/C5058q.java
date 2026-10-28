package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p184h5.AbstractC16901p0;
import p211i5.AccessibilityManagerTouchExplorationStateChangeListenerC18089b;
import p474s.C31983m2;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: com.google.android.material.textfield.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C5058q extends LinearLayout {

    /* JADX INFO: renamed from: E */
    public PorterDuff.Mode f21241E;

    /* JADX INFO: renamed from: F */
    public View.OnLongClickListener f21242F;

    /* JADX INFO: renamed from: G */
    public final CheckableImageButton f21243G;

    /* JADX INFO: renamed from: H */
    public final C5057p f21244H;

    /* JADX INFO: renamed from: I */
    public int f21245I;

    /* JADX INFO: renamed from: J */
    public final LinkedHashSet f21246J;

    /* JADX INFO: renamed from: K */
    public ColorStateList f21247K;

    /* JADX INFO: renamed from: L */
    public PorterDuff.Mode f21248L;

    /* JADX INFO: renamed from: M */
    public int f21249M;

    /* JADX INFO: renamed from: N */
    public ImageView.ScaleType f21250N;

    /* JADX INFO: renamed from: O */
    public View.OnLongClickListener f21251O;

    /* JADX INFO: renamed from: P */
    public CharSequence f21252P;

    /* JADX INFO: renamed from: Q */
    public final AppCompatTextView f21253Q;

    /* JADX INFO: renamed from: R */
    public boolean f21254R;

    /* JADX INFO: renamed from: S */
    public EditText f21255S;

    /* JADX INFO: renamed from: T */
    public final AccessibilityManager f21256T;

    /* JADX INFO: renamed from: U */
    public C5052k f21257U;

    /* JADX INFO: renamed from: V */
    public final C5054m f21258V;

    /* JADX INFO: renamed from: w */
    public final TextInputLayout f21259w;

    /* JADX INFO: renamed from: x */
    public final FrameLayout f21260x;

    /* JADX INFO: renamed from: y */
    public final CheckableImageButton f21261y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f21262z;

    public C5058q(TextInputLayout textInputLayout, C31983m2 c31983m2) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f21245I = 0;
        this.f21246J = new LinkedHashSet();
        this.f21258V = new C5054m(this);
        C5055n c5055n = new C5055n(this);
        this.f21256T = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f21259w = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21260x = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM15872a = m15872a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f21261y = checkableImageButtonM15872a;
        CheckableImageButton checkableImageButtonM15872a2 = m15872a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f21243G = checkableImageButtonM15872a2;
        this.f21244H = new C5057p(this, c31983m2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f21253Q = appCompatTextView;
        TypedArray typedArray = (TypedArray) c31983m2.f132769x;
        if (typedArray.hasValue(38)) {
            this.f21262z = AbstractC22674j.m65694B(getContext(), c31983m2, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f21241E = AbstractC11075m.m29874h(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m15880i(c31983m2.m99486j(37));
        }
        checkableImageButtonM15872a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        checkableImageButtonM15872a.setImportantForAccessibility(2);
        checkableImageButtonM15872a.setClickable(false);
        checkableImageButtonM15872a.setPressable(false);
        checkableImageButtonM15872a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f21247K = AbstractC22674j.m65694B(getContext(), c31983m2, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f21248L = AbstractC11075m.m29874h(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m15878g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonM15872a2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonM15872a2.setContentDescription(text);
            }
            checkableImageButtonM15872a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f21247K = AbstractC22674j.m65694B(getContext(), c31983m2, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f21248L = AbstractC11075m.m29874h(typedArray.getInt(55, -1), null);
            }
            m15878g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonM15872a2.getContentDescription() != text2) {
                checkableImageButtonM15872a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f21249M) {
            this.f21249M = dimensionPixelSize;
            checkableImageButtonM15872a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM15872a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM15872a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM15872a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM99758q = AbstractC32073e.m99758q(typedArray.getInt(31, -1));
            this.f21250N = scaleTypeM99758q;
            checkableImageButtonM15872a2.setScaleType(scaleTypeM99758q);
            checkableImageButtonM15872a.setScaleType(scaleTypeM99758q);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            appCompatTextView.setTextColor(c31983m2.m99484h(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f21252P = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        m15885n();
        frameLayout.addView(checkableImageButtonM15872a2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonM15872a);
        textInputLayout.m15817g(c5055n);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5056o(this));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m15872a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i13) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i13);
        if (AbstractC22674j.m65705M(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5059r m15873b() {
        AbstractC5059r c5044f;
        int i13 = this.f21245I;
        C5057p c5057p = this.f21244H;
        SparseArray sparseArray = (SparseArray) c5057p.f21239d;
        AbstractC5059r abstractC5059r = (AbstractC5059r) sparseArray.get(i13);
        if (abstractC5059r != null) {
            return abstractC5059r;
        }
        C5058q c5058q = (C5058q) c5057p.f21240e;
        if (i13 == -1) {
            c5044f = new C5044f(c5058q, 0);
        } else if (i13 == 0) {
            c5044f = new C5044f(c5058q, 1);
        } else if (i13 == 1) {
            c5044f = new C5066y(c5058q, c5057p.f21238c);
        } else if (i13 == 2) {
            c5044f = new C5042e(c5058q);
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid end icon mode: "));
            }
            c5044f = new C5053l(c5058q);
        }
        sparseArray.append(i13, c5044f);
        return c5044f;
    }

    /* JADX INFO: renamed from: c */
    public final int m15874c() {
        int marginStart;
        if (m15875d() || m15876e()) {
            CheckableImageButton checkableImageButton = this.f21243G;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return this.f21253Q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15875d() {
        return this.f21260x.getVisibility() == 0 && this.f21243G.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15876e() {
        return this.f21261y.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m15877f(boolean z4) {
        boolean z13;
        boolean zIsActivated;
        boolean z14;
        AbstractC5059r abstractC5059rM15873b = m15873b();
        boolean zMo15887j = abstractC5059rM15873b.mo15887j();
        CheckableImageButton checkableImageButton = this.f21243G;
        boolean z15 = true;
        if (!zMo15887j || (z14 = checkableImageButton.f21004z) == abstractC5059rM15873b.mo15852k()) {
            z13 = false;
        } else {
            checkableImageButton.setChecked(!z14);
            z13 = true;
        }
        if (!(abstractC5059rM15873b instanceof C5053l) || (zIsActivated = checkableImageButton.isActivated()) == ((C5053l) abstractC5059rM15873b).f21226l) {
            z15 = z13;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z4 || z15) {
            AbstractC32073e.m99730X(this.f21259w, checkableImageButton, this.f21247K);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15878g(int i13) {
        if (this.f21245I == i13) {
            return;
        }
        AbstractC5059r abstractC5059rM15873b = m15873b();
        C5052k c5052k = this.f21257U;
        AccessibilityManager accessibilityManager = this.f21256T;
        if (c5052k != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC18089b(c5052k));
        }
        this.f21257U = null;
        abstractC5059rM15873b.mo15845r();
        this.f21245I = i13;
        Iterator it = this.f21246J.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        m15879h(i13 != 0);
        AbstractC5059r abstractC5059rM15873b2 = m15873b();
        int iMo15838d = this.f21244H.f21237b;
        if (iMo15838d == 0) {
            iMo15838d = abstractC5059rM15873b2.mo15838d();
        }
        Drawable drawableM92133x = iMo15838d != 0 ? AbstractC30060g.m92133x(getContext(), iMo15838d) : null;
        CheckableImageButton checkableImageButton = this.f21243G;
        checkableImageButton.setImageDrawable(drawableM92133x);
        TextInputLayout textInputLayout = this.f21259w;
        if (drawableM92133x != null) {
            AbstractC32073e.m99754m(textInputLayout, checkableImageButton, this.f21247K, this.f21248L);
            AbstractC32073e.m99730X(textInputLayout, checkableImageButton, this.f21247K);
        }
        int iMo15837c = abstractC5059rM15873b2.mo15837c();
        CharSequence text = iMo15837c != 0 ? getResources().getText(iMo15837c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC5059rM15873b2.mo15887j());
        if (!abstractC5059rM15873b2.mo15851i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i13);
        }
        abstractC5059rM15873b2.mo15844q();
        C5052k c5052kMo15850h = abstractC5059rM15873b2.mo15850h();
        this.f21257U = c5052kMo15850h;
        if (c5052kMo15850h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC18089b(this.f21257U));
            }
        }
        View.OnClickListener onClickListenerMo15840f = abstractC5059rM15873b2.mo15840f();
        View.OnLongClickListener onLongClickListener = this.f21251O;
        checkableImageButton.setOnClickListener(onClickListenerMo15840f);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
        EditText editText = this.f21255S;
        if (editText != null) {
            abstractC5059rM15873b2.mo15842l(editText);
            m15881j(abstractC5059rM15873b2);
        }
        AbstractC32073e.m99754m(textInputLayout, checkableImageButton, this.f21247K, this.f21248L);
        m15877f(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m15879h(boolean z4) {
        if (m15875d() != z4) {
            this.f21243G.setVisibility(z4 ? 0 : 8);
            m15882k();
            m15884m();
            this.f21259w.m15808F();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15880i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f21261y;
        checkableImageButton.setImageDrawable(drawable);
        m15883l();
        AbstractC32073e.m99754m(this.f21259w, checkableImageButton, this.f21262z, this.f21241E);
    }

    /* JADX INFO: renamed from: j */
    public final void m15881j(AbstractC5059r abstractC5059r) {
        if (this.f21255S == null) {
            return;
        }
        if (abstractC5059r.mo15839e() != null) {
            this.f21255S.setOnFocusChangeListener(abstractC5059r.mo15839e());
        }
        if (abstractC5059r.mo15841g() != null) {
            this.f21243G.setOnFocusChangeListener(abstractC5059r.mo15841g());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15882k() {
        this.f21260x.setVisibility((this.f21243G.getVisibility() != 0 || m15876e()) ? 8 : 0);
        setVisibility((m15875d() || m15876e() || ((this.f21252P == null || this.f21254R) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: l */
    public final void m15883l() {
        CheckableImageButton checkableImageButton = this.f21261y;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f21259w;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.m15827q() && textInputLayout.m15804B()) ? 0 : 8);
        m15882k();
        m15884m();
        if (this.f21245I != 0) {
            return;
        }
        textInputLayout.m15808F();
    }

    /* JADX INFO: renamed from: m */
    public final void m15884m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f21259w;
        if (textInputLayout.f21183z == null) {
            return;
        }
        if (m15875d() || m15876e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f21183z;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f21183z.getPaddingTop();
        int paddingBottom = textInputLayout.f21183z.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
        this.f21253Q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: n */
    public final void m15885n() {
        AppCompatTextView appCompatTextView = this.f21253Q;
        int visibility = appCompatTextView.getVisibility();
        int i13 = (this.f21252P == null || this.f21254R) ? 8 : 0;
        if (visibility != i13) {
            m15873b().mo15843o(i13 == 0);
        }
        m15882k();
        appCompatTextView.setVisibility(i13);
        this.f21259w.m15808F();
    }
}
