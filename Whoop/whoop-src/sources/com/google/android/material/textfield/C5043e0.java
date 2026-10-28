package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: com.google.android.material.textfield.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5043e0 extends C16858b {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f21209d;

    public C5043e0(TextInputLayout textInputLayout) {
        this.f21209d = textInputLayout;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        this.f64777a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f21209d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean zM15830t = textInputLayout.m15830t();
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z4 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C5067z c5067z = textInputLayout.f21179x;
        AppCompatTextView appCompatTextView = c5067z.f21323x;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c5067z.f21325z);
        }
        if (!zIsEmpty) {
            c18093f.m51957l(text);
        } else if (!TextUtils.isEmpty(string)) {
            c18093f.m51957l(string);
            if (!zM15830t && placeholderText != null) {
                c18093f.m51957l(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c18093f.m51957l(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z4) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f21122J.f21299y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f21181y.m15873b().mo15853m(c18093f);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: e */
    public final void mo5305e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo5305e(view, accessibilityEvent);
        this.f21209d.f21181y.m15873b().mo15854n(accessibilityEvent);
    }
}
