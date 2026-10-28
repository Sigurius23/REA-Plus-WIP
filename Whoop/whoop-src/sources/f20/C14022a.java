package f20;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38966u1;
import y00.EnumC38948s1;

/* JADX INFO: renamed from: f20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14022a {

    /* JADX INFO: renamed from: a */
    public static final C14022a f50044a = new C14022a();

    /* JADX INFO: renamed from: a */
    public static EnumC14023b m39912a(C38966u1 c38966u1) {
        boolean z4;
        if (c38966u1 != null ? AbstractC22676k.m65745e(c38966u1.f167721F.get(EnumC38948s1.ELEMENTS_PREFER_FC_LITE), Boolean.TRUE) : false) {
            if (!(c38966u1 != null ? AbstractC22676k.m65745e(c38966u1.f167721F.get(EnumC38948s1.ELEMENTS_DISABLE_FC_LITE), Boolean.TRUE) : false)) {
                return EnumC14023b.f50046x;
            }
        }
        try {
            Class.forName("com.stripe.android.financialconnections.FinancialConnectionsSheet");
            z4 = true;
        } catch (Exception unused) {
            z4 = false;
        }
        if (z4) {
            return EnumC14023b.f50045w;
        }
        if (c38966u1 != null ? AbstractC22676k.m65745e(c38966u1.f167721F.get(EnumC38948s1.ELEMENTS_DISABLE_FC_LITE), Boolean.TRUE) : false) {
            return null;
        }
        return EnumC14023b.f50046x;
    }
}
