package v20;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import m83.AbstractC25265s;
import m83.C25271y;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: v20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C35578r extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w */
    public final C13096w1 f151315w;

    /* JADX INFO: renamed from: x */
    public final C13078q1 f151316x;

    /* JADX INFO: renamed from: y */
    public final C13081r1 f151317y;

    public C35578r(C35576p c35576p) {
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.f151315w = c13096w1M36592b;
        this.f151316x = AbstractC13091v.m36597g(c13096w1M36592b);
        String str = c35576p.f151308a;
        String str2 = c35576p.f151309b;
        String strM74110N0 = AbstractC25265s.m74110N0(AbstractC39414r.m125873S(c35576p.f151310c), "-", null, null, null, 62);
        String str3 = c35576p.f151311d;
        C41210b c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_bacs_notice_default_payer);
        Object[] objArr = {AbstractC32128i.m100054h(R.string.stripe_paymentsheet_bacs_support_default_address_line_one), AbstractC32128i.m100054h(R.string.stripe_paymentsheet_bacs_support_default_address_line_two), AbstractC32128i.m100054h(R.string.stripe_paymentsheet_bacs_support_default_email), AbstractC32128i.m100054h(R.string.stripe_paymentsheet_bacs_support_default_email)};
        C25271y c25271y = C25271y.f99162w;
        this.f151317y = AbstractC13091v.m36598h(AbstractC13091v.m36593c(new C35579s(str, str2, strM74110N0, str3, c41210bM100054h, AbstractC32128i.m100064s(R.string.stripe_paymentsheet_bacs_support_address_format, objArr, c25271y), AbstractC32128i.m100064s(R.string.stripe_paymentsheet_bacs_guarantee_format, new Object[]{AbstractC32128i.m100054h(R.string.stripe_paymentsheet_bacs_guarantee_url), AbstractC32128i.m100054h(R.string.stripe_paymentsheet_bacs_guarantee)}, c25271y))));
    }

    /* JADX INFO: renamed from: g */
    public final void m112770g(InterfaceC35575o action) {
        AbstractC22676k.m65750j(action, "action");
        InterfaceC30057d interfaceC30057d = null;
        if (action instanceof C35573m) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C35577q(this, interfaceC30057d, 1), 3);
        } else if (action instanceof C35574n) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C35577q(this, interfaceC30057d, 2), 3);
        } else {
            if (!(action instanceof C35572l)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C35577q(this, interfaceC30057d, 0), 3);
        }
    }
}
