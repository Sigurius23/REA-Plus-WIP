package com.google.android.material.textfield;

import android.text.Editable;
import cr.AbstractC11074l;

/* JADX INFO: renamed from: com.google.android.material.textfield.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C5054m extends AbstractC11074l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C5058q f21233w;

    public C5054m(C5058q c5058q) {
        this.f21233w = c5058q;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f21233w.m15873b().mo15836a();
    }

    @Override // cr.AbstractC11074l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f21233w.m15873b().mo15886b();
    }
}
