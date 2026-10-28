package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.AbstractC1760z1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C5017k extends AbstractC1760z1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5027u f20914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f20915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5019m f20916c;

    public C5017k(C5019m c5019m, C5027u c5027u, MaterialButton materialButton) {
        this.f20916c = c5019m;
        this.f20914a = c5027u;
        this.f20915b = materialButton;
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i13) {
        if (i13 == 0) {
            recyclerView.announceForAccessibility(this.f20915b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrolled(RecyclerView recyclerView, int i13, int i14) {
        C5008b c5008b = this.f20914a.f20976a;
        C5019m c5019m = this.f20916c;
        int iFindFirstVisibleItemPosition = i13 < 0 ? ((LinearLayoutManager) c5019m.f20922H.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) c5019m.f20922H.getLayoutManager()).findLastVisibleItemPosition();
        Calendar calendarM15760a = AbstractC5031y.m15760a(c5008b.f20895w.f20963w);
        calendarM15760a.add(2, iFindFirstVisibleItemPosition);
        c5019m.f20929z = new C5023q(calendarM15760a);
        Calendar calendarM15760a2 = AbstractC5031y.m15760a(c5008b.f20895w.f20963w);
        calendarM15760a2.add(2, iFindFirstVisibleItemPosition);
        calendarM15760a2.set(5, 1);
        Calendar calendarM15760a3 = AbstractC5031y.m15760a(calendarM15760a2);
        calendarM15760a3.get(2);
        calendarM15760a3.get(1);
        calendarM15760a3.getMaximum(7);
        calendarM15760a3.getActualMaximum(5);
        calendarM15760a3.getTimeInMillis();
        long timeInMillis = calendarM15760a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = AbstractC5031y.f20981a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f20915b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
