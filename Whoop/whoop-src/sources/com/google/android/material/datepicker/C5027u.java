package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.C1744v1;
import com.whoop.android.R;
import java.util.Calendar;
import ro.C31624i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C5027u extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    public final C5008b f20976a;

    /* JADX INFO: renamed from: b */
    public final C31624i f20977b;

    /* JADX INFO: renamed from: c */
    public final int f20978c;

    public C5027u(ContextThemeWrapper contextThemeWrapper, C5008b c5008b, C31624i c31624i) {
        C5023q c5023q = c5008b.f20895w;
        C5023q c5023q2 = c5008b.f20896x;
        C5023q c5023q3 = c5008b.f20898z;
        if (c5023q.f20963w.compareTo(c5023q3.f20963w) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c5023q3.f20963w.compareTo(c5023q2.f20963w) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f20978c = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C5024r.f20967d) + (C5021o.m15751B(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f20976a = c5008b;
        this.f20977b = c31624i;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        return this.f20976a.f20894G;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final long getItemId(int i13) {
        Calendar calendarM15760a = AbstractC5031y.m15760a(this.f20976a.f20895w.f20963w);
        calendarM15760a.add(2, i13);
        calendarM15760a.set(5, 1);
        Calendar calendarM15760a2 = AbstractC5031y.m15760a(calendarM15760a);
        calendarM15760a2.get(2);
        calendarM15760a2.get(1);
        calendarM15760a2.getMaximum(7);
        calendarM15760a2.getActualMaximum(5);
        calendarM15760a2.getTimeInMillis();
        return calendarM15760a2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        C5026t c5026t = (C5026t) abstractC1717o2;
        C5008b c5008b = this.f20976a;
        Calendar calendarM15760a = AbstractC5031y.m15760a(c5008b.f20895w.f20963w);
        calendarM15760a.add(2, i13);
        C5023q c5023q = new C5023q(calendarM15760a);
        c5026t.f20974a.setText(c5023q.m15755h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c5026t.f20975b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m15735a() == null || !c5023q.equals(materialCalendarGridView.m15735a().f20969a)) {
            new C5024r(c5023q, c5008b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m15735a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C5021o.m15751B(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C5026t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C1744v1(-1, this.f20978c));
        return new C5026t(linearLayout, true);
    }
}
