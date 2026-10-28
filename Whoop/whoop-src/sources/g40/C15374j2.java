package g40;

import java.io.IOException;
import p031b9.AbstractC2875y;
import p412q3.InterfaceC29873g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: g40.j2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15374j2 extends AbstractC15380k2 {

    /* JADX INFO: renamed from: c */
    public final C15356g2 f57793c;

    /* JADX INFO: renamed from: d */
    public final String f57794d;

    /* JADX INFO: renamed from: e */
    public final String f57795e;

    /* JADX INFO: renamed from: f */
    public final String f57796f;

    /* JADX INFO: renamed from: g */
    public final C15337d1 f57797g;

    public C15374j2(C15356g2 c15356g2) {
        this.f57793c = c15356g2;
        this.f57794d = c15356g2.f57729a;
        String str = c15356g2.f57731c;
        this.f57795e = str != null ? AbstractC39421y.m125927L(str, '#', '5') : "";
        this.f57796f = c15356g2.f57730b;
        this.f57797g = new C15337d1(this, 1);
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: a */
    public final String mo43575a() {
        return this.f57796f;
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: b */
    public final String mo43576b() {
        return this.f57795e;
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: c */
    public final String mo43577c() {
        return this.f57794d;
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: d */
    public final InterfaceC29873g0 mo43578d() {
        return this.f57797g;
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: e */
    public final String mo43579e(String input) {
        AbstractC22676k.m65750j(input, "input");
        return AbstractC2875y.m8299l(this.f57794d, AbstractC39414r.m125874S0(mo43580f(input), '0'));
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: f */
    public final String mo43580f(String input) throws IOException {
        AbstractC22676k.m65750j(input, "input");
        StringBuilder sb4 = new StringBuilder();
        int length = input.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = input.charAt(i13);
            if (AbstractC15380k2.f57813a.m52652e(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        String string = sb4.toString();
        String strSubstring = string.substring(0, Math.min(string.length(), 15));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: g */
    public final String m43584g(String filteredInput) {
        AbstractC22676k.m65750j(filteredInput, "filteredInput");
        C15356g2 c15356g2 = this.f57793c;
        if (c15356g2.f57731c == null) {
            return filteredInput;
        }
        StringBuilder sb4 = new StringBuilder();
        String str = c15356g2.f57731c;
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (i13 < filteredInput.length()) {
                if (cCharAt == '#') {
                    cCharAt = filteredInput.charAt(i13);
                    i13++;
                }
                sb4.append(cCharAt);
            }
        }
        if (i13 < filteredInput.length()) {
            sb4.append(' ');
            String strSubstring = filteredInput.substring(i13);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            char[] charArray = strSubstring.toCharArray();
            AbstractC22676k.m65749i(charArray, "toCharArray(...)");
            sb4.append(charArray);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
