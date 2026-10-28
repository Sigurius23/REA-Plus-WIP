package com.whoop.p069ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import nf1.AbstractC26665f;

/* JADX INFO: renamed from: com.whoop.ui.r */
/* JADX INFO: loaded from: classes10.dex */
public class C10608r extends Toast {

    /* JADX INFO: renamed from: a */
    private WhoopToastView f32250a;

    private C10608r(Context context) {
        super(context);
        WhoopToastView whoopToastView = (WhoopToastView) LayoutInflater.from(context).inflate(AbstractC26665f.f106007b, (ViewGroup) null);
        this.f32250a = whoopToastView;
        setView(whoopToastView);
    }

    /* JADX INFO: renamed from: b */
    public static C10608r m27365b(Context context, int i13, int i14) {
        return m27366c(context, context.getText(i13), i14);
    }

    /* JADX INFO: renamed from: c */
    public static C10608r m27366c(Context context, CharSequence charSequence, int i13) {
        C10608r c10608r = new C10608r(context);
        c10608r.f32250a.setText(charSequence);
        c10608r.setDuration(i13);
        return c10608r;
    }

    @Override // android.widget.Toast
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WhoopToastView getView() {
        return this.f32250a;
    }
}
