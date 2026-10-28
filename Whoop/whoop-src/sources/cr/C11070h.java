package cr;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: cr.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11070h {

    /* JADX INFO: renamed from: a */
    public CharSequence f35011a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f35012b;

    /* JADX INFO: renamed from: c */
    public final int f35013c;

    /* JADX INFO: renamed from: d */
    public int f35014d;

    /* JADX INFO: renamed from: k */
    public boolean f35021k;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f35015e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f35016f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f35017g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f35018h = 1.0f;

    /* JADX INFO: renamed from: i */
    public int f35019i = 1;

    /* JADX INFO: renamed from: j */
    public boolean f35020j = true;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f35022l = null;

    public C11070h(CharSequence charSequence, TextPaint textPaint, int i13) {
        this.f35011a = charSequence;
        this.f35012b = textPaint;
        this.f35013c = i13;
        this.f35014d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m29860a() {
        if (this.f35011a == null) {
            this.f35011a = "";
        }
        int iMax = Math.max(0, this.f35013c);
        CharSequence charSequenceEllipsize = this.f35011a;
        int i13 = this.f35016f;
        TextPaint textPaint = this.f35012b;
        if (i13 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f35022l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f35014d);
        this.f35014d = iMin;
        if (this.f35021k && this.f35016f == 1) {
            this.f35015e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f35015e);
        builderObtain.setIncludePad(this.f35020j);
        builderObtain.setTextDirection(this.f35021k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f35022l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f35016f);
        float f13 = this.f35017g;
        if (f13 != 0.0f || this.f35018h != 1.0f) {
            builderObtain.setLineSpacing(f13, this.f35018h);
        }
        if (this.f35016f > 1) {
            builderObtain.setHyphenationFrequency(this.f35019i);
        }
        return builderObtain.build();
    }
}
