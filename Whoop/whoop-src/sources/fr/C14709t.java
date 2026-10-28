package fr;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import cc.AbstractC4394a;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import p027b3.AbstractC2351b;
import p032bc.C2939b;

/* JADX INFO: renamed from: fr.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C14709t extends AbstractC2351b {

    /* JADX INFO: renamed from: l */
    public static final int[] f54383l = {533, 567, 850, 750};

    /* JADX INFO: renamed from: m */
    public static final int[] f54384m = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: n */
    public static final C2939b f54385n = new C2939b(Float.class, "animationFraction", 11);

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f54386d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f54387e;

    /* JADX INFO: renamed from: f */
    public final Interpolator[] f54388f;

    /* JADX INFO: renamed from: g */
    public final C14710u f54389g;

    /* JADX INFO: renamed from: h */
    public int f54390h;

    /* JADX INFO: renamed from: i */
    public boolean f54391i;

    /* JADX INFO: renamed from: j */
    public float f54392j;

    /* JADX INFO: renamed from: k */
    public C14692c f54393k;

    public C14709t(Context context, C14710u c14710u) {
        super(2);
        this.f54390h = 0;
        this.f54393k = null;
        this.f54389g = c14710u;
        this.f54388f = new Interpolator[]{AbstractC4394a.m13815a(context, R.anim.linear_indeterminate_line1_head_interpolator), AbstractC4394a.m13815a(context, R.anim.linear_indeterminate_line1_tail_interpolator), AbstractC4394a.m13815a(context, R.anim.linear_indeterminate_line2_head_interpolator), AbstractC4394a.m13815a(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: D */
    public final void mo7245D(C14692c c14692c) {
        this.f54393k = c14692c;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: E */
    public final void mo7246E() {
        ObjectAnimator objectAnimator = this.f54387e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo7253f();
        if (((C14705p) this.f9291b).isVisible()) {
            this.f54387e.setFloatValues(this.f54392j, 1.0f);
            this.f54387e.setDuration((long) ((1.0f - this.f54392j) * 1800.0f));
            this.f54387e.start();
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: I */
    public final void mo7250I() {
        ObjectAnimator objectAnimator = this.f54386d;
        C2939b c2939b = f54385n;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c2939b, 0.0f, 1.0f);
            this.f54386d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f54386d.setInterpolator(null);
            this.f54386d.setRepeatCount(-1);
            this.f54386d.addListener(new C14708s(this, 0));
        }
        if (this.f54387e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c2939b, 1.0f);
            this.f54387e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f54387e.setInterpolator(null);
            this.f54387e.addListener(new C14708s(this, 1));
        }
        m42150L();
        this.f54386d.start();
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: K */
    public final void mo7252K() {
        this.f54393k = null;
    }

    /* JADX INFO: renamed from: L */
    public final void m42150L() {
        this.f54390h = 0;
        Iterator it = ((ArrayList) this.f9292c).iterator();
        while (it.hasNext()) {
            ((C14703n) it.next()).f54363c = this.f54389g.f54314c[0];
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: f */
    public final void mo7253f() {
        ObjectAnimator objectAnimator = this.f54386d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: w */
    public final void mo7269w() {
        m42150L();
    }
}
