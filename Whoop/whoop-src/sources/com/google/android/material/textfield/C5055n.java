package com.google.android.material.textfield;

import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C5055n implements InterfaceC5047g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5058q f21234a;

    public C5055n(C5058q c5058q) {
        this.f21234a = c5058q;
    }

    /* JADX INFO: renamed from: a */
    public final void m15857a(TextInputLayout textInputLayout) {
        C5058q c5058q = this.f21234a;
        C5054m c5054m = c5058q.f21258V;
        if (c5058q.f21255S == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c5058q.f21255S;
        if (editText != null) {
            editText.removeTextChangedListener(c5054m);
            if (c5058q.f21255S.getOnFocusChangeListener() == c5058q.m15873b().mo15839e()) {
                c5058q.f21255S.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c5058q.f21255S = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c5054m);
        }
        c5058q.m15873b().mo15842l(c5058q.f21255S);
        c5058q.m15881j(c5058q.m15873b());
    }
}
