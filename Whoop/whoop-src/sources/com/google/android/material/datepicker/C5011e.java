package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whoop.android.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C5011e extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Calendar f20902a;

    /* JADX INFO: renamed from: b */
    public final int f20903b;

    /* JADX INFO: renamed from: c */
    public final int f20904c;

    public C5011e() {
        Calendar calendarM15762c = AbstractC5031y.m15762c(null);
        this.f20902a = calendarM15762c;
        this.f20903b = calendarM15762c.getMaximum(7);
        this.f20904c = calendarM15762c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f20903b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        int i14 = this.f20903b;
        if (i13 >= i14) {
            return null;
        }
        int i15 = i13 + this.f20904c;
        if (i15 > i14) {
            i15 -= i14;
        }
        return Integer.valueOf(i15);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i14 = i13 + this.f20904c;
        int i15 = this.f20903b;
        if (i14 > i15) {
            i14 -= i15;
        }
        Calendar calendar = this.f20902a;
        calendar.set(7, i14);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C5011e(int i13) {
        Calendar calendarM15762c = AbstractC5031y.m15762c(null);
        this.f20902a = calendarM15762c;
        this.f20903b = calendarM15762c.getMaximum(7);
        this.f20904c = i13;
    }
}
