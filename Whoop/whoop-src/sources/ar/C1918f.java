package ar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p287kq.AbstractC22766a;

/* JADX INFO: renamed from: ar.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C1918f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f7589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f7590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f7591c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f7592d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f7593e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f7594f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f7595g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Matrix f7596h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC1923k f7597i;

    public C1918f(AbstractC1923k abstractC1923k, float f13, float f14, float f15, float f16, float f17, float f18, float f19, Matrix matrix) {
        this.f7597i = abstractC1923k;
        this.f7589a = f13;
        this.f7590b = f14;
        this.f7591c = f15;
        this.f7592d = f16;
        this.f7593e = f17;
        this.f7594f = f18;
        this.f7595g = f19;
        this.f7596h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC1923k abstractC1923k = this.f7597i;
        abstractC1923k.f7635s.setAlpha(AbstractC22766a.m65970b(this.f7589a, this.f7590b, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = abstractC1923k.f7635s;
        float f13 = this.f7591c;
        float f14 = this.f7592d;
        floatingActionButton.setScaleX(AbstractC22766a.m65969a(f13, f14, fFloatValue));
        abstractC1923k.f7635s.setScaleY(AbstractC22766a.m65969a(this.f7593e, f14, fFloatValue));
        float f15 = this.f7594f;
        float f16 = this.f7595g;
        abstractC1923k.f7632p = AbstractC22766a.m65969a(f15, f16, fFloatValue);
        float fM65969a = AbstractC22766a.m65969a(f15, f16, fFloatValue);
        Matrix matrix = this.f7596h;
        abstractC1923k.m5877a(fM65969a, matrix);
        abstractC1923k.f7635s.setImageMatrix(matrix);
    }
}
