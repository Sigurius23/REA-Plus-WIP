package uc3;

import ce3.C4510k;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import rc3.AbstractC31237b;
import sc0.C32355c;

/* JADX INFO: renamed from: uc3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C34775m implements InterfaceC34773k {

    /* JADX INFO: renamed from: a */
    public final String f146444a;

    public C34775m(String string) {
        AbstractC22676k.m65750j(string, "string");
        this.f146444a = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (AbstractC31237b.m96190b(string.charAt(0))) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("String '", string, "' starts with a digit").toString());
        }
        if (AbstractC31237b.m96190b(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("String '", string, "' ends with a digit").toString());
        }
    }

    @Override // uc3.InterfaceC34773k
    /* JADX INFO: renamed from: a */
    public final Object mo109777a(InterfaceC34764b interfaceC34764b, String str, int i13) {
        String str2 = this.f146444a;
        if (str2.length() + i13 > str.length()) {
            return new C34769g(i13, new C32355c(this, 17));
        }
        int length = str2.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (str.charAt(i13 + i14) != str2.charAt(i14)) {
                return new C34769g(i13, new C4510k(str, i13, i14, 3, this));
            }
        }
        return Integer.valueOf(str2.length() + i13);
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("'"), this.f146444a, '\'');
    }
}
