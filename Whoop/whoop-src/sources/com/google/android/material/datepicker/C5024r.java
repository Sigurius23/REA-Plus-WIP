package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whoop.android.R;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C5024r extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f20967d = AbstractC5031y.m15762c(null).getMaximum(4);

    /* JADX INFO: renamed from: e */
    public static final int f20968e = (AbstractC5031y.m15762c(null).getMaximum(7) + AbstractC5031y.m15762c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final C5023q f20969a;

    /* JADX INFO: renamed from: b */
    public C5009c f20970b;

    /* JADX INFO: renamed from: c */
    public final C5008b f20971c;

    public C5024r(C5023q c5023q, C5008b c5008b) {
        this.f20969a = c5023q;
        this.f20971c = c5008b;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m15757a() {
        int firstDayOfWeek = this.f20971c.f20892E;
        C5023q c5023q = this.f20969a;
        Calendar calendar = c5023q.f20963w;
        int i13 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i14 = i13 - firstDayOfWeek;
        return i14 < 0 ? i14 + c5023q.f20966z : i14;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i13) {
        if (i13 < m15757a() || i13 > m15759c()) {
            return null;
        }
        int iM15757a = (i13 - m15757a()) + 1;
        Calendar calendarM15760a = AbstractC5031y.m15760a(this.f20969a.f20963w);
        calendarM15760a.set(5, iM15757a);
        return Long.valueOf(calendarM15760a.getTimeInMillis());
    }

    /* JADX INFO: renamed from: c */
    public final int m15759c() {
        return (m15757a() + this.f20969a.f20960E) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f20968e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13 / this.f20969a.f20966z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f20970b == null) {
            this.f20970b = new C5009c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM15757a = i13 - m15757a();
        if (iM15757a >= 0) {
            C5023q c5023q = this.f20969a;
            if (iM15757a >= c5023q.f20960E) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(c5023q);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM15757a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i13) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        AbstractC5031y.m15761b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
