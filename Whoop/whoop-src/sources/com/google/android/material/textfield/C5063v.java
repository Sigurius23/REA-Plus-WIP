package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import p474s.C32018v1;

/* JADX INFO: renamed from: com.google.android.material.textfield.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C5063v implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C5065x f21301w;

    public C5063v(C5065x c5065x) {
        this.f21301w = c5065x;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        Object item;
        C5065x c5065x = this.f21301w;
        C32018v1 c32018v1 = c5065x.f21305E;
        if (i13 < 0) {
            item = !c32018v1.f132871Z.isShowing() ? null : c32018v1.f132874y.getSelectedItem();
        } else {
            item = c5065x.getAdapter().getItem(i13);
        }
        C5065x.m15899a(c5065x, item);
        AdapterView.OnItemClickListener onItemClickListener = c5065x.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i13 < 0) {
                view = !c32018v1.f132871Z.isShowing() ? null : c32018v1.f132874y.getSelectedView();
                i13 = !c32018v1.f132871Z.isShowing() ? -1 : c32018v1.f132874y.getSelectedItemPosition();
                j7 = !c32018v1.f132871Z.isShowing() ? Long.MIN_VALUE : c32018v1.f132874y.getSelectedItemId();
            }
            onItemClickListener.onItemClick(c32018v1.f132874y, view, i13, j7);
        }
        c32018v1.dismiss();
    }
}
