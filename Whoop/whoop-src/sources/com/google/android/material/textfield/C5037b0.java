package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: com.google.android.material.textfield.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5037b0 implements TextWatcher {

    /* JADX INFO: renamed from: w */
    public int f21191w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EditText f21192x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextInputLayout f21193y;

    public C5037b0(TextInputLayout textInputLayout, EditText editText) {
        this.f21193y = textInputLayout;
        this.f21192x = editText;
        this.f21191w = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f21193y;
        textInputLayout.m15812J(!textInputLayout.f21154a1);
        if (textInputLayout.f21124K) {
            textInputLayout.m15805C(editable);
        }
        if (textInputLayout.f21140S) {
            textInputLayout.m15814L(editable);
        }
        EditText editText = this.f21192x;
        int lineCount = editText.getLineCount();
        int i13 = this.f21191w;
        if (lineCount != i13) {
            if (lineCount < i13) {
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                int minimumHeight = editText.getMinimumHeight();
                int i14 = textInputLayout.f21143T0;
                if (minimumHeight != i14) {
                    editText.setMinimumHeight(i14);
                }
            }
            this.f21191w = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }
}
