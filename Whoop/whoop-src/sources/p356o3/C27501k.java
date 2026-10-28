package p356o3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: o3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C27501k extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f110765a;

    /* JADX INFO: renamed from: b */
    public final boolean f110766b;

    public C27501k(boolean z4, boolean z13) {
        this.f110765a = z4;
        this.f110766b = z13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f110765a);
        textPaint.setStrikeThruText(this.f110766b);
    }
}
