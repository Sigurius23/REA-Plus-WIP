package dj;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p426qi.C30387i;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: dj.e */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC12060e extends ValueAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: L */
    public C30387i f39994L;

    /* JADX INFO: renamed from: w */
    public final CopyOnWriteArraySet f39997w = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArraySet f39998x = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: y */
    public final CopyOnWriteArraySet f39999y = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: z */
    public float f40000z = 1.0f;

    /* JADX INFO: renamed from: E */
    public boolean f39987E = false;

    /* JADX INFO: renamed from: F */
    public long f39988F = 0;

    /* JADX INFO: renamed from: G */
    public float f39989G = 0.0f;

    /* JADX INFO: renamed from: H */
    public float f39990H = 0.0f;

    /* JADX INFO: renamed from: I */
    public int f39991I = 0;

    /* JADX INFO: renamed from: J */
    public float f39992J = -2.1474836E9f;

    /* JADX INFO: renamed from: K */
    public float f39993K = 2.1474836E9f;

    /* JADX INFO: renamed from: M */
    public boolean f39995M = false;

    /* JADX INFO: renamed from: N */
    public boolean f39996N = false;

    /* JADX INFO: renamed from: a */
    public final float m33241a() {
        C30387i c30387i = this.f39994L;
        if (c30387i == null) {
            return 0.0f;
        }
        float f13 = this.f39990H;
        float f14 = c30387i.f124692l;
        return (f13 - f14) / (c30387i.f124693m - f14);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f39998x.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39999y.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39997w.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public final float m33242b() {
        C30387i c30387i = this.f39994L;
        if (c30387i == null) {
            return 0.0f;
        }
        float f13 = this.f39993K;
        return f13 == 2.1474836E9f ? c30387i.f124693m : f13;
    }

    /* JADX INFO: renamed from: c */
    public final float m33243c() {
        C30387i c30387i = this.f39994L;
        if (c30387i == null) {
            return 0.0f;
        }
        float f13 = this.f39992J;
        return f13 == -2.1474836E9f ? c30387i.f124692l : f13;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f39998x.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        m33245e(m33244d());
        m33247g(true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33244d() {
        return this.f40000z < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        boolean z4 = false;
        if (this.f39995M) {
            m33247g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C30387i c30387i = this.f39994L;
        if (c30387i == null || !this.f39995M) {
            return;
        }
        long j13 = this.f39988F;
        float fAbs = (j13 != 0 ? j7 - j13 : 0L) / ((1.0E9f / c30387i.f124694n) / Math.abs(this.f40000z));
        float f13 = this.f39989G;
        if (m33244d()) {
            fAbs = -fAbs;
        }
        float f14 = f13 + fAbs;
        float fM33243c = m33243c();
        float fM33242b = m33242b();
        PointF pointF = AbstractC12062g.f40002a;
        if (f14 >= fM33243c && f14 <= fM33242b) {
            z4 = true;
        }
        float f15 = this.f39989G;
        float fM33252b = AbstractC12062g.m33252b(f14, m33243c(), m33242b());
        this.f39989G = fM33252b;
        if (this.f39996N) {
            fM33252b = (float) Math.floor(fM33252b);
        }
        this.f39990H = fM33252b;
        this.f39988F = j7;
        if (z4) {
            if (!this.f39996N || this.f39989G != f15) {
                m33246f();
            }
        } else if (getRepeatCount() == -1 || this.f39991I < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f39987E = !this.f39987E;
                this.f40000z = -this.f40000z;
            } else {
                float fM33242b2 = m33244d() ? m33242b() : m33243c();
                this.f39989G = fM33242b2;
                this.f39990H = fM33242b2;
            }
            this.f39988F = j7;
            if (!this.f39996N || this.f39989G != f15) {
                m33246f();
            }
            Iterator it = this.f39998x.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f39991I++;
        } else {
            float fM33243c2 = this.f40000z < 0.0f ? m33243c() : m33242b();
            this.f39989G = fM33243c2;
            this.f39990H = fM33243c2;
            m33247g(true);
            if (!this.f39996N || this.f39989G != f15) {
                m33246f();
            }
            m33245e(m33244d());
        }
        if (this.f39994L == null) {
            return;
        }
        float f16 = this.f39990H;
        if (f16 < this.f39992J || f16 > this.f39993K) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f39992J), Float.valueOf(this.f39993K), Float.valueOf(this.f39990H)));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m33245e(boolean z4) {
        Iterator it = this.f39998x.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z4);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33246f() {
        Iterator it = this.f39997w.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m33247g(boolean z4) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z4) {
            this.f39995M = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fM33243c;
        float fM33242b;
        float fM33243c2;
        if (this.f39994L == null) {
            return 0.0f;
        }
        if (m33244d()) {
            fM33243c = m33242b() - this.f39990H;
            fM33242b = m33242b();
            fM33243c2 = m33243c();
        } else {
            fM33243c = this.f39990H - m33243c();
            fM33242b = m33242b();
            fM33243c2 = m33243c();
        }
        return fM33243c / (fM33242b - fM33243c2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m33241a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C30387i c30387i = this.f39994L;
        if (c30387i == null) {
            return 0L;
        }
        return (long) c30387i.m92859b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX INFO: renamed from: h */
    public final void m33248h(float f13) {
        if (this.f39989G == f13) {
            return;
        }
        float fM33252b = AbstractC12062g.m33252b(f13, m33243c(), m33242b());
        this.f39989G = fM33252b;
        if (this.f39996N) {
            fM33252b = (float) Math.floor(fM33252b);
        }
        this.f39990H = fM33252b;
        this.f39988F = 0L;
        m33246f();
    }

    /* JADX INFO: renamed from: i */
    public final void m33249i(float f13, float f14) {
        if (f13 > f14) {
            throw new IllegalArgumentException(AbstractC31061c.m95638n("minFrame (", f13, ") must be <= maxFrame (", f14, ")"));
        }
        C30387i c30387i = this.f39994L;
        float f15 = c30387i == null ? -3.4028235E38f : c30387i.f124692l;
        float f16 = c30387i == null ? Float.MAX_VALUE : c30387i.f124693m;
        float fM33252b = AbstractC12062g.m33252b(f13, f15, f16);
        float fM33252b2 = AbstractC12062g.m33252b(f14, f15, f16);
        if (fM33252b == this.f39992J && fM33252b2 == this.f39993K) {
            return;
        }
        this.f39992J = fM33252b;
        this.f39993K = fM33252b2;
        m33248h((int) AbstractC12062g.m33252b(this.f39990H, fM33252b, fM33252b2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f39995M;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f39998x.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f39997w.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f39998x.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39999y.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39997w.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j7) {
        setDuration(j7);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i13) {
        super.setRepeatMode(i13);
        if (i13 == 2 || !this.f39987E) {
            return;
        }
        this.f39987E = false;
        this.f40000z = -this.f40000z;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j7) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j7) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
