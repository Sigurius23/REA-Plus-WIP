package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.whoop.android.R;
import cr.RunnableC11076n;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: loaded from: classes6.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: w */
    public final Chip f21326w;

    /* JADX INFO: renamed from: x */
    public final EditText f21327x;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f21326w = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f21327x = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C5068a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* JADX INFO: renamed from: a */
    public static String m15912a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f21326w.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21327x.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z4) {
        Chip chip = this.f21326w;
        chip.setChecked(z4);
        int i13 = z4 ? 0 : 4;
        EditText editText = this.f21327x;
        editText.setVisibility(i13);
        chip.setVisibility(z4 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new RunnableC11076n(editText, 0));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21326w.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i13, Object obj) {
        this.f21326w.setTag(i13, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f21326w.toggle();
    }
}
