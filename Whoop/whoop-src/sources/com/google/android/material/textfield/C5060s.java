package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: com.google.android.material.textfield.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C5060s extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f21268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f21269c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f21270d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5062u f21271e;

    public C5060s(C5062u c5062u, int i13, TextView textView, int i14, TextView textView2) {
        this.f21271e = c5062u;
        this.f21267a = i13;
        this.f21268b = textView;
        this.f21269c = i14;
        this.f21270d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i13 = this.f21267a;
        C5062u c5062u = this.f21271e;
        c5062u.f21288n = i13;
        c5062u.f21286l = null;
        TextView textView = this.f21268b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f21269c == 1 && (appCompatTextView = c5062u.f21292r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f21270d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f21270d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
