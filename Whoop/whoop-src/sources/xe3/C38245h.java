package xe3;

import af3.AbstractC0822a;
import af3.C0833i;
import bf3.C3205d;
import cf3.AbstractC4545a;
import p188ha.C17039h;
import p478s3.AbstractC32098d;
import ze3.AbstractC40598b;

/* JADX INFO: renamed from: xe3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C38245h extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final C0833i f163982a;

    /* JADX INFO: renamed from: b */
    public String f163983b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f163984c;

    public C38245h(int i13, int i14, char c3) {
        C0833i c0833i = new C0833i();
        this.f163982a = c0833i;
        this.f163984c = new StringBuilder();
        c0833i.f3022g = c3;
        c0833i.f3023h = i13;
        c0833i.f3024i = i14;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: a */
    public final void mo14221a(C3205d c3205d) {
        CharSequence charSequence = c3205d.f12559a;
        if (this.f163983b == null) {
            this.f163983b = charSequence.toString();
            return;
        }
        StringBuilder sb4 = this.f163984c;
        sb4.append(charSequence);
        sb4.append('\n');
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: e */
    public final void mo14225e() {
        String strM131677b = AbstractC40598b.m131677b(this.f163983b.trim());
        C0833i c0833i = this.f163982a;
        c0833i.f3025j = strM131677b;
        c0833i.f3026k = this.f163984c.toString();
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        return this.f163982a;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        int i13 = c38244g.f163970f;
        int i14 = c38244g.f163967c;
        CharSequence charSequence = c38244g.f163965a.f12559a;
        int i15 = c38244g.f163972h;
        C0833i c0833i = this.f163982a;
        if (i15 < 4 && i13 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i13);
            char c3 = c0833i.f3022g;
            if (cCharAt == c3) {
                int i16 = c0833i.f3023h;
                int length = charSequence.length();
                for (int i17 = i13; i17 < length; i17++) {
                    if (charSequence.charAt(i17) != c3) {
                        length = i17;
                        break;
                    }
                }
                int i18 = length - i13;
                if (i18 >= i16 && AbstractC32098d.m99851r(charSequence, i13 + i18, charSequence.length()) == charSequence.length()) {
                    return new C17039h(-1, -1, true);
                }
            }
        }
        int length2 = charSequence.length();
        for (int i19 = c0833i.f3024i; i19 > 0 && i14 < length2 && charSequence.charAt(i14) == ' '; i19--) {
            i14++;
        }
        return C17039h.m48099a(i14);
    }
}
