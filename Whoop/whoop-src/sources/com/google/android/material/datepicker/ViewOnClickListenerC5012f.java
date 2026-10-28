package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.f */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC5012f implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f20905w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C5027u f20906x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C5019m f20907y;

    public /* synthetic */ ViewOnClickListenerC5012f(C5019m c5019m, C5027u c5027u, int i13) {
        this.f20905w = i13;
        this.f20907y = c5019m;
        this.f20906x = c5027u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20905w) {
            case 0:
                C5019m c5019m = this.f20907y;
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) c5019m.f20922H.getLayoutManager()).findLastVisibleItemPosition() - 1;
                if (iFindLastVisibleItemPosition >= 0) {
                    Calendar calendarM15760a = AbstractC5031y.m15760a(this.f20906x.f20976a.f20895w.f20963w);
                    calendarM15760a.add(2, iFindLastVisibleItemPosition);
                    c5019m.m15736y(new C5023q(calendarM15760a));
                }
                break;
            default:
                C5019m c5019m2 = this.f20907y;
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) c5019m2.f20922H.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                if (iFindFirstVisibleItemPosition < c5019m2.f20922H.getAdapter().getDisplayCount()) {
                    Calendar calendarM15760a2 = AbstractC5031y.m15760a(this.f20906x.f20976a.f20895w.f20963w);
                    calendarM15760a2.add(2, iFindFirstVisibleItemPosition);
                    c5019m2.m15736y(new C5023q(calendarM15760a2));
                }
                break;
        }
    }
}
