package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.whoop.android.R;

/* JADX INFO: loaded from: classes6.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f21356x = 0;

    /* JADX INFO: renamed from: w */
    public final Chip f21357w;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC5074g viewOnClickListenerC5074g = new ViewOnClickListenerC5074g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f20855y.add(new C5073f());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f21357w = chip2;
        ViewOnTouchListenerC5076i viewOnTouchListenerC5076i = new ViewOnTouchListenerC5076i(new GestureDetector(getContext(), new C5075h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC5076i);
        chip2.setOnTouchListener(viewOnTouchListenerC5076i);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC5074g);
        chip2.setOnClickListener(viewOnClickListenerC5074g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i13) {
        super.onVisibilityChanged(view, i13);
        if (view == this && i13 == 0) {
            this.f21357w.sendAccessibilityEvent(8);
        }
    }
}
