package fr;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import p027b3.AbstractC2351b;
import p032bc.C2939b;
import p186h8.C16999a;

/* JADX INFO: renamed from: fr.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C14697h extends AbstractC2351b {

    /* JADX INFO: renamed from: l */
    public static final int[] f54326l = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: m */
    public static final int[] f54327m = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: n */
    public static final int[] f54328n = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: o */
    public static final C2939b f54329o;

    /* JADX INFO: renamed from: p */
    public static final C2939b f54330p;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f54331d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f54332e;

    /* JADX INFO: renamed from: f */
    public final C16999a f54333f;

    /* JADX INFO: renamed from: g */
    public final C14698i f54334g;

    /* JADX INFO: renamed from: h */
    public int f54335h;

    /* JADX INFO: renamed from: i */
    public float f54336i;

    /* JADX INFO: renamed from: j */
    public float f54337j;

    /* JADX INFO: renamed from: k */
    public C14692c f54338k;

    static {
        Class<Float> cls = Float.class;
        f54329o = new C2939b(cls, "animationFraction", 7);
        f54330p = new C2939b(cls, "completeEndFraction", 8);
    }

    public C14697h(C14698i c14698i) {
        super(1);
        this.f54335h = 0;
        this.f54338k = null;
        this.f54334g = c14698i;
        this.f54333f = new C16999a(1);
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: D */
    public final void mo7245D(C14692c c14692c) {
        this.f54338k = c14692c;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: E */
    public final void mo7246E() {
        ObjectAnimator objectAnimator = this.f54332e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((C14705p) this.f9291b).isVisible()) {
            this.f54332e.start();
        } else {
            mo7253f();
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: I */
    public final void mo7250I() {
        int i13 = 0;
        if (this.f54331d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f54329o, 0.0f, 1.0f);
            this.f54331d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f54331d.setInterpolator(null);
            this.f54331d.setRepeatCount(-1);
            this.f54331d.addListener(new C14696g(this, i13));
        }
        if (this.f54332e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f54330p, 0.0f, 1.0f);
            this.f54332e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f54332e.setInterpolator(this.f54333f);
            this.f54332e.addListener(new C14696g(this, 1));
        }
        this.f54335h = 0;
        ((C14703n) ((ArrayList) this.f9292c).get(0)).f54363c = this.f54334g.f54314c[0];
        this.f54337j = 0.0f;
        this.f54331d.start();
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: K */
    public final void mo7252K() {
        this.f54338k = null;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: f */
    public final void mo7253f() {
        ObjectAnimator objectAnimator = this.f54331d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: w */
    public final void mo7269w() {
        this.f54335h = 0;
        ((C14703n) ((ArrayList) this.f9292c).get(0)).f54363c = this.f54334g.f54314c[0];
        this.f54337j = 0.0f;
    }
}
