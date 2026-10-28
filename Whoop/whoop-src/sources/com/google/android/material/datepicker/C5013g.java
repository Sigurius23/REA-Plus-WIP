package com.google.android.material.datepicker;

import android.view.View;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: com.google.android.material.datepicker.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C5013g extends C16858b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f20908d;

    public /* synthetic */ C5013g(int i13) {
        this.f20908d = i13;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        switch (this.f20908d) {
            case 0:
                this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
                c18093f.m51954i(null);
                break;
            case 1:
                this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
                c18093f.m51956k(false);
                break;
            default:
                this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
                c18093f.m51954i(null);
                break;
        }
    }
}
