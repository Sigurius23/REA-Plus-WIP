package com.whoop.p069ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import bh3.InterfaceC3255b;
import vu1.AbstractC36514e;
import vu1.AbstractC36516g;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopSwitch extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: w */
    SwitchCompat f31581w;

    /* JADX INFO: renamed from: x */
    TextView f31582x;

    /* JADX INFO: renamed from: y */
    TextView f31583y;

    /* JADX INFO: renamed from: z */
    private InterfaceC3255b f31584z;

    /* JADX INFO: renamed from: com.whoop.ui.WhoopSwitch$a */
    public class C10452a implements CompoundButton.OnCheckedChangeListener {
        public C10452a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            WhoopSwitch.this.m26693c();
        }
    }

    public WhoopSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156148J0);
        m26692b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    private void m26692b(TypedArray typedArray) {
        LayoutInflater.from(getContext()).inflate(AbstractC36516g.f156117g, this);
        this.f31581w = (SwitchCompat) findViewById(AbstractC36514e.f156104v);
        this.f31582x = (TextView) findViewById(AbstractC36514e.f156105w);
        this.f31583y = (TextView) findViewById(AbstractC36514e.f156106x);
        this.f31581w.setBackground(null);
        setTransitionGroup(true);
        if (typedArray != null) {
            for (int i13 = 0; i13 < typedArray.getIndexCount(); i13++) {
                int index = typedArray.getIndex(i13);
                if (index == AbstractC36519j.f156152L0) {
                    int resourceId = typedArray.getResourceId(index, 0);
                    this.f31582x.setTextAppearance(getContext(), resourceId);
                    this.f31583y.setTextAppearance(getContext(), resourceId);
                } else if (index == AbstractC36519j.f156154M0) {
                    this.f31582x.setText(typedArray.getText(index));
                } else if (index == AbstractC36519j.f156156N0) {
                    this.f31583y.setText(typedArray.getText(index));
                } else if (index == AbstractC36519j.f156158O0) {
                    setThumbColor(typedArray.getColor(index, -1));
                } else if (index == AbstractC36519j.f156150K0) {
                    setChecked(typedArray.getBoolean(index, false));
                }
            }
        }
        this.f31581w.setOnCheckedChangeListener(new C10452a());
        m26693c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m26693c() {
        this.f31583y.setSelected(isChecked());
        this.f31583y.setVisibility(isChecked() ? 0 : 8);
        this.f31582x.setSelected(!isChecked());
        this.f31582x.setVisibility(isChecked() ? 8 : 0);
        InterfaceC3255b interfaceC3255b = this.f31584z;
        if (interfaceC3255b != null) {
            interfaceC3255b.mo9472b(Boolean.valueOf(isChecked()));
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f31581w.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        this.f31581w.setChecked(z4);
        m26693c();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        this.f31581w.setEnabled(z4);
    }

    public void setOnCheckedChangeListener(InterfaceC3255b interfaceC3255b) {
        this.f31584z = interfaceC3255b;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f31581w.setOnClickListener(onClickListener);
    }

    public void setThumbColor(int i13) {
        Drawable thumbDrawable = this.f31581w.getThumbDrawable();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        thumbDrawable.setColorFilter(i13, mode);
        int i14 = (i13 >> 16) & 255;
        int i15 = (i13 >> 8) & 255;
        int i16 = i13 & 255;
        int i17 = i14 - 30;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = i15 - 30;
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = i16 - 30;
        this.f31581w.getTrackDrawable().setColorFilter(Color.rgb(i17, i18, i19 >= 0 ? i19 : 0), mode);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f31581w.toggle();
        m26693c();
    }
}
