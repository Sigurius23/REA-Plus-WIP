package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p287kq.AbstractC22766a;
import p477s2.AbstractC32073e;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: com.google.android.material.textfield.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C5062u {

    /* JADX INFO: renamed from: A */
    public ColorStateList f21273A;

    /* JADX INFO: renamed from: B */
    public Typeface f21274B;

    /* JADX INFO: renamed from: a */
    public final int f21275a;

    /* JADX INFO: renamed from: b */
    public final int f21276b;

    /* JADX INFO: renamed from: c */
    public final int f21277c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f21278d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f21279e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f21280f;

    /* JADX INFO: renamed from: g */
    public final Context f21281g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f21282h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f21283i;

    /* JADX INFO: renamed from: j */
    public int f21284j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f21285k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f21286l;

    /* JADX INFO: renamed from: m */
    public final float f21287m;

    /* JADX INFO: renamed from: n */
    public int f21288n;

    /* JADX INFO: renamed from: o */
    public int f21289o;

    /* JADX INFO: renamed from: p */
    public CharSequence f21290p;

    /* JADX INFO: renamed from: q */
    public boolean f21291q;

    /* JADX INFO: renamed from: r */
    public AppCompatTextView f21292r;

    /* JADX INFO: renamed from: s */
    public CharSequence f21293s;

    /* JADX INFO: renamed from: t */
    public int f21294t;

    /* JADX INFO: renamed from: u */
    public int f21295u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f21296v;

    /* JADX INFO: renamed from: w */
    public CharSequence f21297w;

    /* JADX INFO: renamed from: x */
    public boolean f21298x;

    /* JADX INFO: renamed from: y */
    public AppCompatTextView f21299y;

    /* JADX INFO: renamed from: z */
    public int f21300z;

    public C5062u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f21281g = context;
        this.f21282h = textInputLayout;
        this.f21287m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f21275a = AbstractC36259c.m115697k0(context, R.attr.motionDurationShort4, 217);
        this.f21276b = AbstractC36259c.m115697k0(context, R.attr.motionDurationMedium4, 167);
        this.f21277c = AbstractC36259c.m115697k0(context, R.attr.motionDurationShort4, 167);
        this.f21278d = AbstractC36259c.m115699l0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC22766a.f89675d);
        LinearInterpolator linearInterpolator = AbstractC22766a.f89672a;
        this.f21279e = AbstractC36259c.m115699l0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f21280f = AbstractC36259c.m115699l0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m15889a(TextView textView, int i13) {
        if (this.f21283i == null && this.f21285k == null) {
            Context context = this.f21281g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f21283i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f21283i;
            TextInputLayout textInputLayout = this.f21282h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f21285k = new FrameLayout(context);
            this.f21283i.addView(this.f21285k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m15890b();
            }
        }
        if (i13 == 0 || i13 == 1) {
            this.f21285k.setVisibility(0);
            this.f21285k.addView(textView);
        } else {
            this.f21283i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f21283i.setVisibility(0);
        this.f21284j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m15890b() {
        if (this.f21283i != null) {
            TextInputLayout textInputLayout = this.f21282h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f21281g;
                boolean zM65705M = AbstractC22674j.m65705M(context);
                LinearLayout linearLayout = this.f21283i;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                int paddingStart = editText.getPaddingStart();
                if (zM65705M) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM65705M) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM65705M) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15891c() {
        AnimatorSet animatorSet = this.f21286l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15892d(ArrayList arrayList, boolean z4, AppCompatTextView appCompatTextView, int i13, int i14, int i15) {
        if (appCompatTextView == null || !z4) {
            return;
        }
        if (i13 == i15 || i13 == i14) {
            boolean z13 = i15 == i13;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z13 ? 1.0f : 0.0f);
            int i16 = this.f21277c;
            objectAnimatorOfFloat.setDuration(z13 ? this.f21276b : i16);
            objectAnimatorOfFloat.setInterpolator(z13 ? this.f21279e : this.f21280f);
            if (i13 == i15 && i14 != 0) {
                objectAnimatorOfFloat.setStartDelay(i16);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i15 != i13 || i14 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f21287m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f21275a);
            objectAnimatorOfFloat2.setInterpolator(this.f21278d);
            objectAnimatorOfFloat2.setStartDelay(i16);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m15893e(int i13) {
        if (i13 == 1) {
            return this.f21292r;
        }
        if (i13 != 2) {
            return null;
        }
        return this.f21299y;
    }

    /* JADX INFO: renamed from: f */
    public final void m15894f() {
        this.f21290p = null;
        m15891c();
        if (this.f21288n == 1) {
            if (!this.f21298x || TextUtils.isEmpty(this.f21297w)) {
                this.f21289o = 0;
            } else {
                this.f21289o = 2;
            }
        }
        m15897i(this.f21288n, this.f21289o, m15896h(this.f21292r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m15895g(TextView textView, int i13) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f21283i;
        if (linearLayout == null) {
            return;
        }
        if ((i13 == 0 || i13 == 1) && (frameLayout = this.f21285k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i14 = this.f21284j - 1;
        this.f21284j = i14;
        LinearLayout linearLayout2 = this.f21283i;
        if (i14 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15896h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        TextInputLayout textInputLayout = this.f21282h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f21289o == this.f21288n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m15897i(int i13, int i14, boolean z4) {
        C5062u c5062u;
        TextView textViewM15893e;
        TextView textViewM15893e2;
        if (i13 == i14) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f21286l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c5062u = this;
            c5062u.m15892d(arrayList, this.f21298x, this.f21299y, 2, i13, i14);
            c5062u.m15892d(arrayList, c5062u.f21291q, c5062u.f21292r, 1, i13, i14);
            AbstractC32073e.m99727U(animatorSet, arrayList);
            animatorSet.addListener(new C5060s(c5062u, i14, m15893e(i13), i13, m15893e(i14)));
            animatorSet.start();
        } else {
            c5062u = this;
            if (i13 != i14) {
                if (i14 != 0 && (textViewM15893e2 = m15893e(i14)) != null) {
                    textViewM15893e2.setVisibility(0);
                    textViewM15893e2.setAlpha(1.0f);
                }
                if (i13 != 0 && (textViewM15893e = m15893e(i13)) != null) {
                    textViewM15893e.setVisibility(4);
                    if (i13 == 1) {
                        textViewM15893e.setText((CharSequence) null);
                    }
                }
                c5062u.f21288n = i14;
            }
        }
        TextInputLayout textInputLayout = c5062u.f21282h;
        textInputLayout.m15809G();
        textInputLayout.m15812J(z4);
        textInputLayout.m15816N();
    }
}
