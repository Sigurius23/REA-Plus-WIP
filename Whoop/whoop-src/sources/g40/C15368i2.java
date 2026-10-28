package g40;

import java.io.IOException;
import p000.AbstractC11266d;
import p412q3.InterfaceC29873g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g40.i2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15368i2 extends AbstractC15380k2 {

    /* JADX INFO: renamed from: c */
    public final String f57768c;

    /* JADX INFO: renamed from: d */
    public final C15362h2 f57769d;

    public C15368i2(String countryCode) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        this.f57768c = countryCode;
        this.f57769d = new C15362h2(0);
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: a */
    public final String mo43575a() {
        return this.f57768c;
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: b */
    public final String mo43576b() {
        return "+############";
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: c */
    public final String mo43577c() {
        return "";
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: d */
    public final InterfaceC29873g0 mo43578d() {
        return this.f57769d;
    }

    @Override // g40.AbstractC15380k2
    /* JADX INFO: renamed from: e */
    public final String mo43579e(String input) {
        AbstractC22676k.m65750j(input, "input");
        return AbstractC11266d.m30461o("+", AbstractC39414r.m125874S0(mo43580f(input), '0'));
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
}
