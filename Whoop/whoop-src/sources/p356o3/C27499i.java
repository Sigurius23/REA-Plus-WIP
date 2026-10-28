package p356o3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: o3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C27499i extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f110760a;

    /* JADX INFO: renamed from: b */
    public final float f110761b;

    /* JADX INFO: renamed from: c */
    public final float f110762c;

    /* JADX INFO: renamed from: d */
    public final float f110763d;

    public C27499i(int i13, float f13, float f14, float f15) {
        this.f110760a = i13;
        this.f110761b = f13;
        this.f110762c = f14;
        this.f110763d = f15;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f110763d, this.f110761b, this.f110762c, this.f110760a);
    }
}
