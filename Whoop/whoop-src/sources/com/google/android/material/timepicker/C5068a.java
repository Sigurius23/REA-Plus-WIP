package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import cr.AbstractC11074l;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C5068a extends AbstractC11074l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ChipTextInputComboView f21358w;

    public C5068a(ChipTextInputComboView chipTextInputComboView) {
        this.f21358w = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f21358w;
        if (zIsEmpty) {
            chipTextInputComboView.f21326w.setText(ChipTextInputComboView.m15912a(chipTextInputComboView, "00"));
            return;
        }
        String strM15912a = ChipTextInputComboView.m15912a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f21326w;
        if (TextUtils.isEmpty(strM15912a)) {
            strM15912a = ChipTextInputComboView.m15912a(chipTextInputComboView, "00");
        }
        chip.setText(strM15912a);
    }
}
