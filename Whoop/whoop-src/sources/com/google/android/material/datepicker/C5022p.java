package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.material.datepicker.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C5022p<S> extends AbstractC5028v {

    /* JADX INFO: renamed from: x */
    public int f20958x;

    /* JADX INFO: renamed from: y */
    public C5008b f20959y;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f20958x = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20959y = (C5008b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f20958x));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f20958x);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f20959y);
    }
}
