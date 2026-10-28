package com.whoop.whooplive.selfie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p144fc.AbstractC14345a;
import pz2.AbstractC29648a;
import pz2.AbstractC29653f;

/* JADX INFO: renamed from: com.whoop.whooplive.selfie.a */
/* JADX INFO: loaded from: classes11.dex */
class C10881a extends AbstractC14345a {

    /* JADX INFO: renamed from: c */
    private LayoutInflater f33584c;

    /* JADX INFO: renamed from: d */
    private String[] f33585d;

    /* JADX INFO: renamed from: e */
    private View.OnClickListener f33586e;

    public C10881a(Context context, boolean z4, View.OnClickListener onClickListener) {
        this.f33585d = context.getResources().getStringArray(z4 ? AbstractC29648a.f121084a : AbstractC29648a.f121085b);
        this.f33584c = LayoutInflater.from(context);
        this.f33586e = onClickListener;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: a */
    public void mo4232a(ViewGroup viewGroup, int i13, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: d */
    public int mo28901d() {
        return this.f33585d.length;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: h */
    public Object mo4234h(ViewGroup viewGroup, int i13) {
        TextView textView = (TextView) this.f33584c.inflate(AbstractC29653f.f121182b, viewGroup, false);
        textView.setText(this.f33585d[i13]);
        viewGroup.addView(textView);
        textView.setOnClickListener(this.f33586e);
        return textView;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: i */
    public boolean mo4235i(View view, Object obj) {
        return view == obj;
    }
}
