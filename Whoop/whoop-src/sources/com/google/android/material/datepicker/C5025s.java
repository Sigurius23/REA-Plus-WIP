package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C5025s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MaterialCalendarGridView f20972w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C5027u f20973x;

    public C5025s(C5027u c5027u, MaterialCalendarGridView materialCalendarGridView) {
        this.f20973x = c5027u;
        this.f20972w = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        MaterialCalendarGridView materialCalendarGridView = this.f20972w;
        C5024r c5024rM15735a = materialCalendarGridView.m15735a();
        if (i13 < c5024rM15735a.m15757a() || i13 > c5024rM15735a.m15759c()) {
            return;
        }
        if (materialCalendarGridView.m15735a().getItem(i13).longValue() >= ((C5019m) this.f20973x.f20977b.f130665x).f20928y.f20897y.f20901w) {
            throw null;
        }
    }
}
