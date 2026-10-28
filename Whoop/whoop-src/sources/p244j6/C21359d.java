package p244j6;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p185h6.C16955j;

/* JADX INFO: renamed from: j6.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C21359d implements InputFilter {

    /* JADX INFO: renamed from: w */
    public final TextView f81703w;

    /* JADX INFO: renamed from: x */
    public RunnableC21358c f81704x;

    public C21359d(TextView textView) {
        this.f81703w = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
        TextView textView = this.f81703w;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM47711c = C16955j.m47708a().m47711c();
        if (iM47711c != 0) {
            if (iM47711c == 1) {
                if ((i16 == 0 && i15 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i13 != 0 || i14 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i13, i14);
                }
                return C16955j.m47708a().m47714g(0, charSequence.length(), 0, charSequence);
            }
            if (iM47711c != 3) {
                return charSequence;
            }
        }
        C16955j c16955jM47708a = C16955j.m47708a();
        if (this.f81704x == null) {
            this.f81704x = new RunnableC21358c(textView, this);
        }
        c16955jM47708a.m47715h(this.f81704x);
        return charSequence;
    }
}
