package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: com.google.android.material.textfield.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C5064w extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f21302a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f21303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5065x f21304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5064w(C5065x c5065x, Context context, int i13, String[] strArr) {
        super(context, i13, strArr);
        this.f21304c = c5065x;
        m15898a();
    }

    /* JADX INFO: renamed from: a */
    public final void m15898a() {
        ColorStateList colorStateList;
        C5065x c5065x = this.f21304c;
        ColorStateList colorStateList2 = c5065x.f21312L;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f21303b = colorStateList;
        if (c5065x.f21311K != 0 && c5065x.f21312L != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC35642a.m112836e(c5065x.f21312L.getColorForState(iArr3, 0), c5065x.f21311K), AbstractC35642a.m112836e(c5065x.f21312L.getColorForState(iArr2, 0), c5065x.f21311K), c5065x.f21311K});
        }
        this.f21302a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i13, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C5065x c5065x = this.f21304c;
            Drawable rippleDrawable = null;
            if (c5065x.getText().toString().contentEquals(textView.getText()) && c5065x.f21311K != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c5065x.f21311K);
                if (this.f21303b != null) {
                    colorDrawable.setTintList(this.f21302a);
                    rippleDrawable = new RippleDrawable(this.f21303b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
