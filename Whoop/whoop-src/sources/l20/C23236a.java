package l20;

import org.json.JSONObject;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import w20.C36722l;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38915o4;
import y00.C39013z3;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: l20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C23236a {
    /* JADX INFO: renamed from: a */
    public final boolean m67268a(InterfaceC38802c8 stripeIntent) {
        JSONObject jSONObjectOptJSONObject;
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        boolean z4 = stripeIntent instanceof C38887l3;
        if (!z4) {
            if (stripeIntent instanceof C38840g6) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z4) {
            String str = ((C38887l3) stripeIntent).f167389X;
            if (str != null && (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("card")) != null) {
                return jSONObjectOptJSONObject.optBoolean("require_cvc_recollection");
            }
        } else if (!(stripeIntent instanceof C38840g6)) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m67269b(C38915o4 paymentMethod, Function1 function1) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        C39013z3 c39013z3 = paymentMethod.f167514H;
        C36722l c36722l = c39013z3 != null ? new C36722l(c39013z3.f167913H, c39013z3.f167918w) : null;
        if (c36722l == null) {
            throw new IllegalStateException("unable to create CvcRecollectionData");
        }
        function1.invoke(c36722l);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67270c(InterfaceC38802c8 stripeIntent, C38915o4 paymentMethod) {
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        return paymentMethod.f167511E == EnumC38828f4.f167090I && m67268a(stripeIntent);
    }
}
