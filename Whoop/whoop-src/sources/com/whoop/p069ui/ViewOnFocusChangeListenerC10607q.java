package com.whoop.p069ui;

import android.view.View;
import bh3.InterfaceC3255b;
import com.whoop.community.presentation.teams.C6377d;
import eq0.AbstractC13523r1;

/* JADX INFO: renamed from: com.whoop.ui.q */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC10607q implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f32248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f32249c;

    public /* synthetic */ ViewOnFocusChangeListenerC10607q(int i13, Object obj, Object obj2) {
        this.f32247a = i13;
        this.f32248b = obj;
        this.f32249c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f32247a) {
            case 0:
                ((WhoopEditText) this.f32248b).m26673U((InterfaceC3255b) this.f32249c, view, z4);
                break;
            default:
                C6377d.m19516U((AbstractC13523r1) this.f32248b, (C6377d) this.f32249c, view, z4);
                break;
        }
    }
}
