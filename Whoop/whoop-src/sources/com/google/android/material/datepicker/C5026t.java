package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p184h5.C16865d0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C5026t extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a */
    public final TextView f20974a;

    /* JADX INFO: renamed from: b */
    public final MaterialCalendarGridView f20975b;

    public C5026t(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f20974a = textView;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        new C16865d0(3).m47493b(textView, Boolean.TRUE);
        this.f20975b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
