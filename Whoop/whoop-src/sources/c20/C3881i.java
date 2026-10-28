package c20;

import al0.C0971f;
import android.content.Context;
import b10.C2222b;
import b20.EnumC2325e;
import bc3.AbstractC3050q0;
import com.stripe.android.model.StripeIntent$NextActionType;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import p442qy.C30766e;
import p565vy.InterfaceC36562b;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s40.C32132a;
import s93.AbstractC32309k;
import y00.InterfaceC38802c8;
import y00.InterfaceC38936q7;

/* JADX INFO: renamed from: c20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C3881i extends AbstractC3877e {

    /* JADX INFO: renamed from: a */
    public final C3886n f15875a;

    /* JADX INFO: renamed from: b */
    public final C3875c f15876b;

    /* JADX INFO: renamed from: c */
    public final Context f15877c;

    public C3881i(C3886n webIntentAuthenticator, C3875c noOpIntentAuthenticator, Context context) {
        AbstractC22676k.m65750j(webIntentAuthenticator, "webIntentAuthenticator");
        AbstractC22676k.m65750j(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        AbstractC22676k.m65750j(context, "context");
        this.f15875a = webIntentAuthenticator;
        this.f15876b = noOpIntentAuthenticator;
        this.f15877c = context;
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: d */
    public final Object mo6697d(C32132a c32132a, Object obj, C39857f c39857f, C3876d c3876d) {
        InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
        InterfaceC36562b interfaceC36562bMo124335m = interfaceC38802c8.mo124335m();
        AbstractC22676k.m65748h(interfaceC36562bMo124335m, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails");
        if (((InterfaceC38936q7) interfaceC36562bMo124335m).mo124358b() == null) {
            Context context = this.f15877c;
            AbstractC22676k.m65750j(context, "context");
            Context applicationContext = context.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            AbstractC32309k.m100574c(executorC22364d);
            C39865j c39865j = new C39865j(C30766e.f126697b, executorC22364d);
            C2222b c2222b = new C2222b(applicationContext, C25235a0.f99113w, new C0971f(applicationContext, 1));
            EnumC2325e enumC2325e = EnumC2325e.MISSING_HOSTED_VOUCHER_URL;
            StripeIntent$NextActionType stripeIntent$NextActionTypeMo124328O = interfaceC38802c8.mo124328O();
            Map mapM95645u = AbstractC31061c.m95645u("next_action_type", stripeIntent$NextActionTypeMo124328O != null ? stripeIntent$NextActionTypeMo124328O.f22242w : "");
            int i13 = 2 & 4;
            C25272z c25272z = C25272z.f99163w;
            if (i13 != 0) {
                mapM95645u = c25272z;
            }
            c39865j.m127938a(c2222b.mo7052a(enumC2325e, AbstractC25247g0.m73995d0(c25272z, mapM95645u)));
            Object objM11857c = this.f15876b.m11857c(c32132a, interfaceC38802c8, c39857f, c3876d);
            if (objM11857c == EnumC31071a.f128113w) {
                return objM11857c;
            }
        } else {
            Object objM11857c2 = this.f15875a.m11857c(c32132a, interfaceC38802c8, c39857f, c3876d);
            if (objM11857c2 == EnumC31071a.f128113w) {
                return objM11857c2;
            }
        }
        return C23454a0.f92919a;
    }
}
