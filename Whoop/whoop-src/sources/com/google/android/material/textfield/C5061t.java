package com.google.android.material.textfield;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C5061t extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5062u f21272a;

    public C5061t(C5062u c5062u) {
        this.f21272a = c5062u;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f21272a.f21282h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
