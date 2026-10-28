package com.whoop.p069ui;

import android.view.View;
import jo.C21830s;
import p087db.C11865o;
import p087db.C11882x;

/* JADX INFO: renamed from: com.whoop.ui.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC10592j implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f32185w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f32186x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f32187y;

    public /* synthetic */ ViewOnClickListenerC10592j(Object obj, int i13, int i14) {
        this.f32185w = i14;
        this.f32187y = obj;
        this.f32186x = i13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32185w) {
            case 0:
                C10593k.m27328b((C10593k) this.f32187y, this.f32186x, view);
                break;
            case 1:
                C11865o c11865o = (C11865o) this.f32187y;
                C11882x c11882x = (C11882x) c11865o.f38705e;
                int i13 = c11865o.f38704d;
                int i14 = this.f32186x;
                if (i14 != i13) {
                    c11882x.setPlaybackSpeed(c11865o.f38703c[i14]);
                }
                c11882x.f38790K.dismiss();
                break;
            default:
                C11865o c11865o2 = (C11865o) this.f32187y;
                C21830s c21830s = (C21830s) c11865o2.f38705e;
                int i15 = c11865o2.f38704d;
                int i16 = this.f32186x;
                if (i16 != i15) {
                    c21830s.setPlaybackSpeed(c11865o2.f38703c[i16]);
                }
                c21830s.f84175L0.dismiss();
                break;
        }
    }
}
