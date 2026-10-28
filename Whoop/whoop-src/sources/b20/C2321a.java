package b20;

import com.squareup.wire.AbstractC5583n;
import com.stripe.android.core.exception.StripeException;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p442qy.C30767f;
import p479s4.AbstractC32123d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2321a {
    /* JADX INFO: renamed from: a */
    public static Map m7172a(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        if (error instanceof StripeException) {
            return m7173b((StripeException) error);
        }
        int i13 = StripeException.f22154E;
        return m7173b(AbstractC32123d.m100024d(error));
    }

    /* JADX INFO: renamed from: b */
    public static Map m7173b(StripeException stripeException) {
        AbstractC22676k.m65750j(stripeException, "stripeException");
        int i13 = stripeException.f22157y;
        Integer numValueOf = i13 == 0 ? null : Integer.valueOf(i13);
        C23465k c23465k = new C23465k("analytics_value", stripeException.getF22331G());
        C23465k c23465k2 = new C23465k("status_code", numValueOf != null ? numValueOf.toString() : null);
        C23465k c23465k3 = new C23465k("request_id", stripeException.f22156x);
        C30767f c30767f = stripeException.f22155w;
        return AbstractC5583n.m16798y(AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, new C23465k("error_type", c30767f != null ? c30767f.f126702w : null), new C23465k("error_code", c30767f != null ? c30767f.f126704y : null)));
    }
}
