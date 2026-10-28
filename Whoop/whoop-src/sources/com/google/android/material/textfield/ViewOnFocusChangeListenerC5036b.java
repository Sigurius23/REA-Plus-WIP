package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC5036b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC5059r f21190b;

    public /* synthetic */ ViewOnFocusChangeListenerC5036b(AbstractC5059r abstractC5059r, int i13) {
        this.f21189a = i13;
        this.f21190b = abstractC5059r;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f21189a) {
            case 0:
                C5042e c5042e = (C5042e) this.f21190b;
                c5042e.m15846s(c5042e.m15847t());
                break;
            default:
                C5053l c5053l = (C5053l) this.f21190b;
                c5053l.f21226l = z4;
                c5053l.m15888p();
                if (!z4) {
                    c5053l.m15855s(false);
                    c5053l.f21227m = false;
                }
                break;
        }
    }
}
