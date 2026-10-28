package fr;

import android.animation.ObjectAnimator;
import ar.C1916d;
import java.util.ArrayList;
import p027b3.AbstractC2351b;
import p032bc.C2939b;
import p186h8.C16999a;

/* JADX INFO: renamed from: fr.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C14707r extends AbstractC2351b {

    /* JADX INFO: renamed from: j */
    public static final C2939b f54374j = new C2939b(Float.class, "animationFraction", 10);

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f54375d;

    /* JADX INFO: renamed from: e */
    public final C16999a f54376e;

    /* JADX INFO: renamed from: f */
    public final C14710u f54377f;

    /* JADX INFO: renamed from: g */
    public int f54378g;

    /* JADX INFO: renamed from: h */
    public boolean f54379h;

    /* JADX INFO: renamed from: i */
    public float f54380i;

    public C14707r(C14710u c14710u) {
        super(3);
        this.f54378g = 1;
        this.f54377f = c14710u;
        this.f54376e = new C16999a(1);
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: D */
    public final void mo7245D(C14692c c14692c) {
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: E */
    public final void mo7246E() {
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: I */
    public final void mo7250I() {
        if (this.f54375d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f54374j, 0.0f, 1.0f);
            this.f54375d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f54375d.setInterpolator(null);
            this.f54375d.setRepeatCount(-1);
            this.f54375d.addListener(new C1916d(this, 8));
        }
        m42149L();
        this.f54375d.start();
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: K */
    public final void mo7252K() {
    }

    /* JADX INFO: renamed from: L */
    public final void m42149L() {
        this.f54379h = true;
        this.f54378g = 1;
        for (C14703n c14703n : (ArrayList) this.f9292c) {
            C14710u c14710u = this.f54377f;
            c14703n.f54363c = c14710u.f54314c[0];
            c14703n.f54364d = c14710u.f54318g / 2;
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: f */
    public final void mo7253f() {
        ObjectAnimator objectAnimator = this.f54375d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: w */
    public final void mo7269w() {
        m42149L();
    }
}
