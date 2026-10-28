package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.datepicker.C5016j;
import cr.C11063a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p184h5.AbstractC16901p0;

/* JADX INFO: loaded from: classes6.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: G */
    public static final int[] f21001G = {R.attr.state_checked};

    /* JADX INFO: renamed from: E */
    public boolean f21002E;

    /* JADX INFO: renamed from: F */
    public boolean f21003F;

    /* JADX INFO: renamed from: z */
    public boolean f21004z;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.whoop.android.R.attr.imageButtonStyle);
        this.f21002E = true;
        this.f21003F = true;
        AbstractC16901p0.m47583n(this, new C5016j(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f21004z;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        return this.f21004z ? View.mergeDrawableStates(super.onCreateDrawableState(i13 + 1), f21001G) : super.onCreateDrawableState(i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C11063a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C11063a c11063a = (C11063a) parcelable;
        super.onRestoreInstanceState(c11063a.m113141b());
        setChecked(c11063a.f34931y);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C11063a c11063a = new C11063a(super.onSaveInstanceState());
        c11063a.f34931y = this.f21004z;
        return c11063a;
    }

    public void setCheckable(boolean z4) {
        if (this.f21002E != z4) {
            this.f21002E = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f21002E || this.f21004z == z4) {
            return;
        }
        this.f21004z = z4;
        refreshDrawableState();
        sendAccessibilityEvent(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
    }

    public void setPressable(boolean z4) {
        this.f21003F = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f21003F) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f21004z);
    }
}
