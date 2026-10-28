package p332n3;

import android.text.TextPaint;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: n3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C26207b extends AbstractC34870c0 {

    /* JADX INFO: renamed from: x */
    public final CharSequence f103921x;

    /* JADX INFO: renamed from: y */
    public final TextPaint f103922y;

    public C26207b(CharSequence charSequence, TextPaint textPaint) {
        this.f103921x = charSequence;
        this.f103922y = textPaint;
    }

    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: d0 */
    public final int mo77819d0(int i13) {
        CharSequence charSequence = this.f103921x;
        return this.f103922y.getTextRunCursor(charSequence, 0, charSequence.length(), false, i13, 0);
    }

    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: g0 */
    public final int mo77820g0(int i13) {
        CharSequence charSequence = this.f103921x;
        return this.f103922y.getTextRunCursor(charSequence, 0, charSequence.length(), false, i13, 2);
    }
}
