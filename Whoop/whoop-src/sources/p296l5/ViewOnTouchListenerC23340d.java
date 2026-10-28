package p296l5;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import p036bq.RunnableC3543b;
import p474s.C31974k1;

/* JADX INFO: renamed from: l5.d */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC23340d implements View.OnTouchListener {

    /* JADX INFO: renamed from: R */
    public static final int f92536R = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: E */
    public final float[] f92537E;

    /* JADX INFO: renamed from: F */
    public final float[] f92538F;

    /* JADX INFO: renamed from: G */
    public final int f92539G;

    /* JADX INFO: renamed from: H */
    public final int f92540H;

    /* JADX INFO: renamed from: I */
    public final float[] f92541I;

    /* JADX INFO: renamed from: J */
    public final float[] f92542J;

    /* JADX INFO: renamed from: K */
    public final float[] f92543K;

    /* JADX INFO: renamed from: L */
    public boolean f92544L;

    /* JADX INFO: renamed from: M */
    public boolean f92545M;

    /* JADX INFO: renamed from: N */
    public boolean f92546N;

    /* JADX INFO: renamed from: O */
    public boolean f92547O;

    /* JADX INFO: renamed from: P */
    public boolean f92548P;

    /* JADX INFO: renamed from: Q */
    public final C31974k1 f92549Q;

    /* JADX INFO: renamed from: w */
    public final C23337a f92550w;

    /* JADX INFO: renamed from: x */
    public final AccelerateInterpolator f92551x;

    /* JADX INFO: renamed from: y */
    public final C31974k1 f92552y;

    /* JADX INFO: renamed from: z */
    public RunnableC3543b f92553z;

    public ViewOnTouchListenerC23340d(C31974k1 c31974k1) {
        C23337a c23337a = new C23337a();
        c23337a.f92531e = Long.MIN_VALUE;
        c23337a.f92533g = -1L;
        c23337a.f92532f = 0L;
        this.f92550w = c23337a;
        this.f92551x = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f92537E = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f92538F = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f92541I = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f92542J = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f92543K = fArr5;
        this.f92552y = c31974k1;
        float f13 = Resources.getSystem().getDisplayMetrics().density;
        float f14 = ((int) ((1575.0f * f13) + 0.5f)) / 1000.0f;
        fArr5[0] = f14;
        fArr5[1] = f14;
        float f15 = ((int) ((f13 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f15;
        fArr4[1] = f15;
        this.f92539G = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f92540H = f92536R;
        c23337a.f92527a = 500;
        c23337a.f92528b = 500;
        this.f92549Q = c31974k1;
    }

    /* JADX INFO: renamed from: b */
    public static float m67573b(float f13, float f14, float f15) {
        if (f13 > f15) {
            return f15;
        }
        return f13 < f14 ? f14 : f13;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: a */
    public final float m67574a(int i13, float f13, float f14, float f15) {
        float fM67573b;
        float interpolation;
        float fM67573b2 = m67573b(this.f92537E[i13] * f14, 0.0f, this.f92538F[i13]);
        float fM67575c = m67575c(f14 - f13, fM67573b2) - m67575c(f13, fM67573b2);
        AccelerateInterpolator accelerateInterpolator = this.f92551x;
        if (fM67575c >= 0.0f) {
            if (fM67575c > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM67575c);
            } else {
                fM67573b = 0.0f;
            }
            if (fM67573b == 0.0f) {
                return 0.0f;
            }
            float f16 = this.f92541I[i13];
            float f17 = this.f92542J[i13];
            float f18 = this.f92543K[i13];
            float f19 = f16 * f15;
            return fM67573b > 0.0f ? m67573b(fM67573b * f19, f17, f18) : -m67573b((-fM67573b) * f19, f17, f18);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM67575c);
        fM67573b = m67573b(interpolation, -1.0f, 1.0f);
        if (fM67573b == 0.0f) {
            return 0.0f;
        }
        float f110 = this.f92541I[i13];
        float f111 = this.f92542J[i13];
        float f112 = this.f92543K[i13];
        float f113 = f110 * f15;
        if (fM67573b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m67575c(float f13, float f14) {
        if (f14 != 0.0f) {
            int i13 = this.f92539G;
            if (i13 == 0 || i13 == 1) {
                if (f13 < f14) {
                    if (f13 >= 0.0f) {
                        return 1.0f - (f13 / f14);
                    }
                    if (this.f92547O && i13 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i13 == 2 && f13 < 0.0f) {
                return f13 / (-f14);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m67576d() {
        int i13 = 0;
        if (this.f92545M) {
            this.f92547O = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C23337a c23337a = this.f92550w;
        int i14 = (int) (jCurrentAnimationTimeMillis - c23337a.f92531e);
        int i15 = c23337a.f92528b;
        if (i14 > i15) {
            i13 = i15;
        } else if (i14 >= 0) {
            i13 = i14;
        }
        c23337a.f92535i = i13;
        c23337a.f92534h = c23337a.m67568a(jCurrentAnimationTimeMillis);
        c23337a.f92533g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m67577e() {
        C31974k1 c31974k1;
        int count;
        C23337a c23337a = this.f92550w;
        float f13 = c23337a.f92530d;
        int iAbs = (int) (f13 / Math.abs(f13));
        Math.abs(c23337a.f92529c);
        if (iAbs != 0 && (count = (c31974k1 = this.f92549Q).getCount()) != 0) {
            int childCount = c31974k1.getChildCount();
            int firstVisiblePosition = c31974k1.getFirstVisiblePosition();
            int i13 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c31974k1.getChildAt(0).getTop() >= 0)) : !(i13 >= count && c31974k1.getChildAt(childCount - 1).getBottom() <= c31974k1.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f92548P
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.m67576d()
            return r1
        L1b:
            r7.f92546N = r2
            r7.f92544L = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            s.k1 r4 = r7.f92552y
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m67574a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m67574a(r2, r9, r8, r3)
            l5.a r9 = r7.f92550w
            r9.f92529c = r0
            r9.f92530d = r8
            boolean r8 = r7.f92547O
            if (r8 != 0) goto L7e
            boolean r8 = r7.m67577e()
            if (r8 == 0) goto L7e
            bq.b r8 = r7.f92553z
            if (r8 != 0) goto L62
            bq.b r8 = new bq.b
            r9 = 15
            r8.<init>(r7, r9)
            r7.f92553z = r8
        L62:
            r7.f92547O = r2
            r7.f92545M = r2
            boolean r8 = r7.f92544L
            if (r8 != 0) goto L77
            int r8 = r7.f92540H
            if (r8 <= 0) goto L77
            bq.b r9 = r7.f92553z
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p184h5.AbstractC16901p0.f64851a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            bq.b r8 = r7.f92553z
            r8.run()
        L7c:
            r7.f92544L = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p296l5.ViewOnTouchListenerC23340d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
