package v00;

import java.util.Map;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p499t9.C33623c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: v00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35468h extends EnumC35470i {
    public C35468h() {
        super("ValidUsBankVerificationMethod", 5);
    }

    @Override // v00.EnumC35470i
    /* JADX INFO: renamed from: a */
    public final boolean mo112525a(C35459c0 c35459c0, String code) {
        AbstractC22676k.m65750j(code, "code");
        InterfaceC38802c8 interfaceC38802c8 = c35459c0.f150996w;
        if (interfaceC38802c8.getClientSecret() == null) {
            return true;
        }
        Map mapMo124326G = interfaceC38802c8.mo124326G();
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        Object obj = mapMo124326G.get("us_bank_account");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("verification_method") : null;
        return AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new String[]{"automatic", "instant", "instant_or_skip"}), obj2 instanceof String ? (String) obj2 : null);
    }
}
