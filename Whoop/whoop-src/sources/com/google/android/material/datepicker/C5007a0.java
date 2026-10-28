package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import java.util.Locale;
import kr.C22786e;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5007a0 extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    public final C5019m f20891a;

    public C5007a0(C5019m c5019m) {
        this.f20891a = c5019m;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        return this.f20891a.f20928y.f20893F;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        C5032z c5032z = (C5032z) abstractC1717o2;
        C5019m c5019m = this.f20891a;
        int i14 = c5019m.f20928y.f20895w.f20965y + i13;
        c5032z.f20982a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i14)));
        TextView textView = c5032z.f20982a;
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC5031y.m15761b().get(1) == i14 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i14)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i14)));
        C5009c c5009c = c5019m.f20920F;
        if (AbstractC5031y.m15761b().get(1) == i14) {
            C22786e c22786e = c5009c.f20900b;
        } else {
            C22786e c22786e2 = c5009c.f20899a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13) {
        return new C5032z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
