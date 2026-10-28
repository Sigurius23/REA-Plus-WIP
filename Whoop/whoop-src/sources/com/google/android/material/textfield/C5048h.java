package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kr.C22788g;

/* JADX INFO: renamed from: com.google.android.material.textfield.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C5048h extends C22788g {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ int f21212Z = 0;

    /* JADX INFO: renamed from: Y */
    public C5046g f21213Y;

    @Override // kr.C22788g
    /* JADX INFO: renamed from: g */
    public final void mo15848g(Canvas canvas) {
        if (this.f21213Y.f21211s.isEmpty()) {
            super.mo15848g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f21213Y.f21211s);
        super.mo15848g(canvas);
        canvas.restore();
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f21213Y = new C5046g(this.f21213Y);
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final void m15849w(float f13, float f14, float f15, float f16) {
        RectF rectF = this.f21213Y.f21211s;
        if (f13 == rectF.left && f14 == rectF.top && f15 == rectF.right && f16 == rectF.bottom) {
            return;
        }
        rectF.set(f13, f14, f15, f16);
        invalidateSelf();
    }
}
