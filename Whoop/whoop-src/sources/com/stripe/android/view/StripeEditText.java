package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p243j5.C21328b;
import p244j6.C21357b;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import rq0.ViewOnFocusChangeListenerC31661e0;
import s40.C32138c;
import s40.C32152g1;
import s40.C32162k0;
import s40.C32177s;
import s40.InterfaceC32143d1;
import s40.InterfaceC32146e1;
import s40.InterfaceC32149f1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001:\u0005\u000e\n\u0012PQJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\n \"*\u0004\u0018\u00010\u001c0\u001cH\u0007¢\u0006\u0004\b#\u0010!J\u0019\u0010(\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b&\u0010'R(\u00102\u001a\u00020)8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00109\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0006R*\u0010:\u001a\u00020)2\u0006\u0010:\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-\"\u0004\b=\u0010/R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0019R \u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0011\u0010M\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010N\u001a\u0004\u0018\u00010\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\bN\u0010?\u001a\u0004\bO\u0010A¨\u0006R"}, m65681d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/res/ColorStateList;", "colors", "Ll83/a0;", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "", "color", "(I)V", "Ls40/d1;", "afterTextChangedListener", "setAfterTextChangedListener", "(Ls40/d1;)V", "Ls40/e1;", "deleteEmptyListener", "setDeleteEmptyListener", "(Ls40/e1;)V", "Ls40/f1;", "errorMessageListener", "setErrorMessageListener", "(Ls40/f1;)V", "", "errorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "errorColor", "setErrorColor", "Landroid/view/View$OnFocusChangeListener;", "listener", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "kotlin.jvm.PlatformType", "getParentOnFocusChangeListener", "", "text", "setTextSilent$payments_core_release", "(Ljava/lang/CharSequence;)V", "setTextSilent", "", "H", "Z", "isLastKeyDelete$payments_core_release", "()Z", "setLastKeyDelete$payments_core_release", "(Z)V", "isLastKeyDelete$payments_core_release$annotations", "()V", "isLastKeyDelete", "value", "K", "Landroid/content/res/ColorStateList;", "getDefaultColorStateList$payments_core_release", "()Landroid/content/res/ColorStateList;", "setDefaultColorStateList$payments_core_release", "defaultColorStateList", "shouldShowError", "P", "getShouldShowError", "setShouldShowError", "Q", "Ljava/lang/String;", "getErrorMessage$payments_core_release", "()Ljava/lang/String;", "setErrorMessage$payments_core_release", "", "S", "Ljava/util/List;", "getInternalFocusChangeListeners", "()Ljava/util/List;", "internalFocusChangeListeners", "getFieldText$payments_core_release", "fieldText", "getDefaultErrorColorInt", "()I", "defaultErrorColorInt", "accessibilityText", "getAccessibilityText", "j5/b", "s40/g1", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public class StripeEditText extends TextInputEditText {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f22580U = 0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean isLastKeyDelete;

    /* JADX INFO: renamed from: I */
    public InterfaceC32143d1 f22582I;

    /* JADX INFO: renamed from: J */
    public InterfaceC32146e1 f22583J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ColorStateList defaultColorStateList;

    /* JADX INFO: renamed from: L */
    public ColorStateList f22585L;

    /* JADX INFO: renamed from: M */
    public int f22586M;

    /* JADX INFO: renamed from: N */
    public Integer f22587N;

    /* JADX INFO: renamed from: O */
    public final ArrayList f22588O;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean shouldShowError;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String errorMessage;

    /* JADX INFO: renamed from: R */
    public InterfaceC32149f1 f22591R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f22592S;

    /* JADX INFO: renamed from: T */
    public View.OnFocusChangeListener f22593T;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
        AbstractC22676k.m65750j(context, "context");
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList;
        super.addTextChangedListener(textWatcher);
        if (textWatcher == null || (arrayList = this.f22588O) == null) {
            return;
        }
        arrayList.add(textWatcher);
    }

    /* JADX INFO: renamed from: b */
    public final void m16926b() {
        Context context = getContext();
        int defaultColor = this.defaultColorStateList.getDefaultColor();
        this.f22586M = AbstractC32122c.getColor(context, ((((double) Color.blue(defaultColor)) * 0.114d) + ((((double) Color.green(defaultColor)) * 0.587d) + (((double) Color.red(defaultColor)) * 0.299d))) / ((double) 255) <= 0.5d ? R.color.stripe_error_text_light_theme : R.color.stripe_error_text_dark_theme);
    }

    /* JADX INFO: renamed from: c */
    public final void m16927c() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    public String getAccessibilityText() {
        return null;
    }

    /* JADX INFO: renamed from: getDefaultColorStateList$payments_core_release, reason: from getter */
    public final ColorStateList getDefaultColorStateList() {
        return this.defaultColorStateList;
    }

    public final int getDefaultErrorColorInt() {
        m16926b();
        return this.f22586M;
    }

    /* JADX INFO: renamed from: getErrorMessage$payments_core_release, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getFieldText$payments_core_release() {
        Editable text = getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.f22592S;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f22593T;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        AbstractC22676k.m65750j(outAttrs, "outAttrs");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new C21328b((C21357b) inputConnectionOnCreateInputConnection, this.f22583J);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        AbstractC22676k.m65750j(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.shouldShowError);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.errorMessage;
        if (!this.shouldShowError) {
            str = null;
        }
        info.setError(str);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C32152g1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C32152g1 c32152g1 = (C32152g1) parcelable;
        super.onRestoreInstanceState(c32152g1.f133200w);
        this.errorMessage = c32152g1.f133201x;
        setShouldShowError(c32152g1.f133202y);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new C32152g1(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList;
        super.removeTextChangedListener(textWatcher);
        if (textWatcher == null || (arrayList = this.f22588O) == null) {
            return;
        }
        arrayList.remove(textWatcher);
    }

    public final void setAfterTextChangedListener(InterfaceC32143d1 afterTextChangedListener) {
        this.f22582I = afterTextChangedListener;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        AbstractC22676k.m65750j(colorStateList, "<set-?>");
        this.defaultColorStateList = colorStateList;
    }

    public final void setDeleteEmptyListener(InterfaceC32146e1 deleteEmptyListener) {
        this.f22583J = deleteEmptyListener;
    }

    public final void setErrorColor(int errorColor) {
        this.f22587N = Integer.valueOf(errorColor);
    }

    public final void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessageListener(InterfaceC32149f1 errorMessageListener) {
        this.f22591R = errorMessageListener;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z4) {
        this.isLastKeyDelete = z4;
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener listener) {
        super.setOnFocusChangeListener(new ViewOnFocusChangeListenerC31661e0(this, 5));
        this.f22593T = listener;
    }

    public final void setShouldShowError(boolean z4) {
        InterfaceC32149f1 interfaceC32149f1;
        String str = this.errorMessage;
        if (str != null && (interfaceC32149f1 = this.f22591R) != null) {
            if (!z4) {
                str = null;
            }
            TextInputLayout textInputLayout = ((C32162k0) interfaceC32149f1).f133229a;
            if (str == null) {
                textInputLayout.setError(null);
                textInputLayout.setErrorEnabled(false);
            } else {
                textInputLayout.setError(str);
            }
        }
        if (this.shouldShowError != z4) {
            if (z4) {
                Integer num = this.f22587N;
                super.setTextColor(num != null ? num.intValue() : this.f22586M);
            } else {
                ColorStateList colorStateList = this.f22585L;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z4;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        this.f22585L = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence text) {
        ArrayList arrayList = this.f22588O;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener((TextWatcher) it.next());
            }
        }
        setText(text);
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                super.addTextChangedListener((TextWatcher) it3.next());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        C32177s c32177s = new C32177s(this, 1);
        ArrayList arrayList = new ArrayList();
        this.f22588O = arrayList;
        setMaxLines(1);
        addTextChangedListener(new C32138c(this, 4));
        if (!arrayList.contains(c32177s)) {
            addTextChangedListener(c32177s);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: s40.c1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i14, KeyEvent keyEvent) {
                InterfaceC32146e1 interfaceC32146e1;
                int i15 = StripeEditText.f22580U;
                if (keyEvent.getAction() == 0) {
                    boolean z4 = i14 == 67;
                    StripeEditText stripeEditText = this.f133177w;
                    stripeEditText.isLastKeyDelete = z4;
                    if (z4 && stripeEditText.length() == 0 && (interfaceC32146e1 = stripeEditText.f22583J) != null) {
                        ((C29934u0) interfaceC32146e1).m91529E();
                    }
                }
                return false;
            }
        });
        this.defaultColorStateList = getTextColors();
        m16926b();
        setOnFocusChangeListener(null);
        this.f22592S = new ArrayList();
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        setTextColor(ColorStateList.valueOf(color));
    }
}
