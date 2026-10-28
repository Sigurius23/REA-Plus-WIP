package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whoop.android.R;
import e10.C12554k0;
import p096dq.AbstractC12273q;
import p126eq.C13435d;

/* JADX INFO: loaded from: classes6.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public View.OnClickListener f20654w;

    /* JADX INFO: renamed from: x */
    public final C12554k0 f20655x;

    /* JADX INFO: renamed from: y */
    public View f20656y;

    public PayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C12554k0 c12554k0M15642b = ButtonOptions.m15642b();
        this.f20655x = c12554k0M15642b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC12273q.f41100a);
        int i13 = typedArrayObtainStyledAttributes.getInt(0, 1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        ButtonOptions buttonOptions = (ButtonOptions) c12554k0M15642b.f42881x;
        buttonOptions.f20651x = i13;
        buttonOptions.f20652y = dimensionPixelSize;
        typedArrayObtainStyledAttributes.hasValue(1);
        typedArrayObtainStyledAttributes.recycle();
        buttonOptions.f20650w = 1;
        if (isInEditMode()) {
            m15643a(buttonOptions);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15643a(ButtonOptions buttonOptions) {
        removeAllViews();
        C13435d c13435d = new C13435d(new ContextThemeWrapper(getContext(), buttonOptions.f20651x == 2 ? R.style.PayButtonGenericLightTheme : R.style.PayButtonGenericDarkTheme), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(c13435d.getContext()).inflate(R.layout.paybutton_generic, (ViewGroup) c13435d, true).findViewById(R.id.pay_button_view);
        Context context = c13435d.getContext();
        int i13 = buttonOptions.f20652y;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable.mutate();
        gradientDrawable.setCornerRadius(i13);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericRippleColor});
        int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(color), gradientDrawable, null));
        c13435d.setContentDescription(c13435d.getContext().getString(R.string.gpay_logo_description));
        this.f20656y = c13435d;
        addView(c13435d);
        this.f20656y.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f20654w;
        if (onClickListener == null || view != this.f20656y) {
            return;
        }
        onClickListener.onClick(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f20654w = onClickListener;
    }
}
