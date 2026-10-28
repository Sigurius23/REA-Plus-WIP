package be;

import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: be.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C3148a {

    /* JADX INFO: renamed from: a */
    public static final C3148a f12325a = new C3148a();

    /* JADX INFO: renamed from: a */
    public static EnumC3149b m9050a(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        if (lowerCase.equals("ipv4")) {
            return EnumC3149b.f12328y;
        }
        if (lowerCase.equals("ipv6")) {
            return EnumC3149b.f12329z;
        }
        throw new IllegalArgumentException(AbstractC31061c.m95633i('`', "invalid EndpointMode: `", str));
    }
}
