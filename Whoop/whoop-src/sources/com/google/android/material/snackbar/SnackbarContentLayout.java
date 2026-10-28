package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whoop.android.R;
import java.util.WeakHashMap;
import mr.InterfaceC25907m;
import p184h5.AbstractC16901p0;
import p287kq.AbstractC22766a;
import p558vp.AbstractC36259c;

/* JADX INFO: loaded from: classes6.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC25907m {

    /* JADX INFO: renamed from: w */
    public TextView f21043w;

    /* JADX INFO: renamed from: x */
    public Button f21044x;

    /* JADX INFO: renamed from: y */
    public final TimeInterpolator f21045y;

    /* JADX INFO: renamed from: z */
    public int f21046z;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21045y = AbstractC36259c.m115699l0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC22766a.f89673b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15780a(int i13, int i14, int i15) {
        boolean z4;
        if (i13 != getOrientation()) {
            setOrientation(i13);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f21043w.getPaddingTop() == i14 && this.f21043w.getPaddingBottom() == i15) {
            return z4;
        }
        TextView textView = this.f21043w;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i14, textView.getPaddingEnd(), i15);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i14, textView.getPaddingRight(), i15);
        return true;
    }

    public Button getActionView() {
        return this.f21044x;
    }

    public TextView getMessageView() {
        return this.f21043w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f21043w = (TextView) findViewById(R.id.snackbar_text);
        this.f21044x = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f21043w.getLayout();
        boolean z4 = layout != null && layout.getLineCount() > 1;
        if (!z4 || this.f21046z <= 0 || this.f21044x.getMeasuredWidth() <= this.f21046z) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m15780a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m15780a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i13, i14);
    }

    public void setMaxInlineActionWidth(int i13) {
        this.f21046z = i13;
    }
}
