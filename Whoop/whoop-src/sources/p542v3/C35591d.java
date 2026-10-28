package p542v3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p098dt.AbstractC12350b;
import p181h2.C16620e;
import p208i2.AbstractC17922y0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import sc0.C32355c;

/* JADX INFO: renamed from: v3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C35591d extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: w */
    public final AbstractC17922y0 f151356w;

    /* JADX INFO: renamed from: x */
    public final float f151357x;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f151358y = AbstractC28683x.m87272z(new C16620e(9205357640488583168L));

    /* JADX INFO: renamed from: z */
    public final C28612f0 f151359z = AbstractC28683x.m87264r(new C32355c(this, 25));

    public C35591d(AbstractC17922y0 abstractC17922y0, float f13) {
        this.f151356w = abstractC17922y0;
        this.f151357x = f13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC12350b.m34566O(textPaint, this.f151357x);
        textPaint.setShader((Shader) this.f151359z.getValue());
    }
}
