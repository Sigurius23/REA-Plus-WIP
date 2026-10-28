package xe3;

import af3.AbstractC0822a;
import af3.C0824b;
import cf3.AbstractC4545a;
import p188ha.C17039h;

/* JADX INFO: renamed from: xe3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C38238a extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final C0824b f163939a = new C0824b();

    /* JADX INFO: renamed from: j */
    public static boolean m122567j(C38244g c38244g, int i13) {
        CharSequence charSequence = c38244g.f163965a.f12559a;
        return c38244g.f163972h < 4 && i13 < charSequence.length() && charSequence.charAt(i13) == '>';
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        return this.f163939a;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        char cCharAt;
        int i13 = c38244g.f163970f;
        if (!m122567j(c38244g, i13)) {
            return null;
        }
        int i14 = c38244g.f163968d + c38244g.f163972h;
        int i15 = i14 + 1;
        CharSequence charSequence = c38244g.f163965a.f12559a;
        int i16 = i13 + 1;
        if (i16 < charSequence.length() && ((cCharAt = charSequence.charAt(i16)) == '\t' || cCharAt == ' ')) {
            i15 = i14 + 2;
        }
        return new C17039h(-1, i15, false);
    }
}
