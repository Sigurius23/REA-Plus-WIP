package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.whoop.android.R;
import p287kq.AbstractC22766a;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: com.google.android.material.textfield.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C5042e extends AbstractC5059r {

    /* JADX INFO: renamed from: e */
    public final int f21200e;

    /* JADX INFO: renamed from: f */
    public final int f21201f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f21202g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f21203h;

    /* JADX INFO: renamed from: i */
    public EditText f21204i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC5034a f21205j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC5036b f21206k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f21207l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f21208m;

    public C5042e(C5058q c5058q) {
        super(c5058q);
        this.f21205j = new ViewOnClickListenerC5034a(this, 0);
        this.f21206k = new ViewOnFocusChangeListenerC5036b(this, 0);
        this.f21200e = AbstractC36259c.m115697k0(c5058q.getContext(), R.attr.motionDurationShort3, 100);
        this.f21201f = AbstractC36259c.m115697k0(c5058q.getContext(), R.attr.motionDurationShort3, 150);
        this.f21202g = AbstractC36259c.m115699l0(c5058q.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC22766a.f89672a);
        this.f21203h = AbstractC36259c.m115699l0(c5058q.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC22766a.f89675d);
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: a */
    public final void mo15836a() {
        if (this.f21264b.f21252P != null) {
            return;
        }
        m15846s(m15847t());
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: c */
    public final int mo15837c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: d */
    public final int mo15838d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo15839e() {
        return this.f21206k;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo15840f() {
        return this.f21205j;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo15841g() {
        return this.f21206k;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: l */
    public final void mo15842l(EditText editText) {
        this.f21204i = editText;
        this.f21263a.setEndIconVisible(m15847t());
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: o */
    public final void mo15843o(boolean z4) {
        if (this.f21264b.f21252P == null) {
            return;
        }
        m15846s(z4);
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: q */
    public final void mo15844q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f21203h);
        valueAnimatorOfFloat.setDuration(this.f21201f);
        valueAnimatorOfFloat.addUpdateListener(new C5038c(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f21202g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i13 = this.f21200e;
        valueAnimatorOfFloat2.setDuration(i13);
        valueAnimatorOfFloat2.addUpdateListener(new C5038c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f21207l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f21207l.addListener(new C5040d(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i13);
        valueAnimatorOfFloat3.addUpdateListener(new C5038c(this, 0));
        this.f21208m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C5040d(this, 1));
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: r */
    public final void mo15845r() {
        EditText editText = this.f21204i;
        if (editText != null) {
            editText.post(new RunnableC5035a0(this, 1));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m15846s(boolean z4) {
        boolean z13 = this.f21264b.m15875d() == z4;
        if (z4 && !this.f21207l.isRunning()) {
            this.f21208m.cancel();
            this.f21207l.start();
            if (z13) {
                this.f21207l.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f21207l.cancel();
        this.f21208m.start();
        if (z13) {
            this.f21208m.end();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15847t() {
        EditText editText = this.f21204i;
        if (editText != null) {
            return (editText.hasFocus() || this.f21266d.hasFocus()) && this.f21204i.getText().length() > 0;
        }
        return false;
    }
}
