package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kr.C22787f;
import kr.C22792k;

/* JADX INFO: renamed from: com.google.android.material.textfield.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C5046g extends C22787f {

    /* JADX INFO: renamed from: s */
    public final RectF f21211s;

    public C5046g(C22792k c22792k, RectF rectF) {
        super(c22792k);
        this.f21211s = rectF;
    }

    @Override // kr.C22787f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C5048h c5048h = new C5048h(this);
        c5048h.f21213Y = this;
        c5048h.invalidateSelf();
        return c5048h;
    }

    public C5046g(C5046g c5046g) {
        super(c5046g);
        this.f21211s = c5046g.f21211s;
    }
}
