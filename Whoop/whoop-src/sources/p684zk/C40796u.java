package p684zk;

import java.io.IOException;

/* JADX INFO: renamed from: zk.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C40796u implements Appendable {

    /* JADX INFO: renamed from: w */
    public final Appendable f175949w;

    /* JADX INFO: renamed from: x */
    public boolean f175950x = true;

    public C40796u(Appendable appendable) {
        this.f175949w = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) throws IOException {
        boolean z4 = this.f175950x;
        Appendable appendable = this.f175949w;
        if (z4) {
            this.f175950x = false;
            appendable.append("  ");
        }
        this.f175950x = c3 == '\n';
        appendable.append(c3);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z4 = this.f175950x;
        Appendable appendable = this.f175949w;
        boolean z13 = false;
        if (z4) {
            this.f175950x = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i14 - 1) == '\n') {
            z13 = true;
        }
        this.f175950x = z13;
        appendable.append(charSequence, i13, i14);
        return this;
    }
}
