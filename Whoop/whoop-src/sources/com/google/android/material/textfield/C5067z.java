package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p474s.C31983m2;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: com.google.android.material.textfield.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C5067z extends LinearLayout {

    /* JADX INFO: renamed from: E */
    public ColorStateList f21316E;

    /* JADX INFO: renamed from: F */
    public PorterDuff.Mode f21317F;

    /* JADX INFO: renamed from: G */
    public int f21318G;

    /* JADX INFO: renamed from: H */
    public ImageView.ScaleType f21319H;

    /* JADX INFO: renamed from: I */
    public View.OnLongClickListener f21320I;

    /* JADX INFO: renamed from: J */
    public boolean f21321J;

    /* JADX INFO: renamed from: w */
    public final TextInputLayout f21322w;

    /* JADX INFO: renamed from: x */
    public final AppCompatTextView f21323x;

    /* JADX INFO: renamed from: y */
    public CharSequence f21324y;

    /* JADX INFO: renamed from: z */
    public final CheckableImageButton f21325z;

    public C5067z(TextInputLayout textInputLayout, C31983m2 c31983m2) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f21322w = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f21325z = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f21323x = appCompatTextView;
        if (AbstractC22674j.m65705M(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f21320I;
        checkableImageButton.setOnClickListener(null);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
        this.f21320I = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC32073e.m99742e0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c31983m2.f132769x;
        if (typedArray.hasValue(69)) {
            this.f21316E = AbstractC22674j.m65694B(getContext(), c31983m2, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f21317F = AbstractC11075m.m29874h(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m15903b(c31983m2.m99486j(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f21318G) {
            this.f21318G = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM99758q = AbstractC32073e.m99758q(typedArray.getInt(68, -1));
            this.f21319H = scaleTypeM99758q;
            checkableImageButton.setScaleType(scaleTypeM99758q);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(c31983m2.m99484h(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f21324y = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        m15906e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* JADX INFO: renamed from: a */
    public final int m15902a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f21325z;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return this.f21323x.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX INFO: renamed from: b */
    public final void m15903b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f21325z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f21316E;
            PorterDuff.Mode mode = this.f21317F;
            TextInputLayout textInputLayout = this.f21322w;
            AbstractC32073e.m99754m(textInputLayout, checkableImageButton, colorStateList, mode);
            m15904c(true);
            AbstractC32073e.m99730X(textInputLayout, checkableImageButton, this.f21316E);
            return;
        }
        m15904c(false);
        View.OnLongClickListener onLongClickListener = this.f21320I;
        checkableImageButton.setOnClickListener(null);
        AbstractC32073e.m99742e0(checkableImageButton, onLongClickListener);
        this.f21320I = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC32073e.m99742e0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15904c(boolean z4) {
        CheckableImageButton checkableImageButton = this.f21325z;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            m15905d();
            m15906e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15905d() {
        int paddingStart;
        EditText editText = this.f21322w.f21183z;
        if (editText == null) {
            return;
        }
        if (this.f21325z.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
        this.f21323x.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m15906e() {
        int i13 = (this.f21324y == null || this.f21321J) ? 8 : 0;
        setVisibility((this.f21325z.getVisibility() == 0 || i13 == 0) ? 0 : 8);
        this.f21323x.setVisibility(i13);
        this.f21322w.m15808F();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        m15905d();
    }
}
