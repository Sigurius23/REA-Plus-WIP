package x20;

import al0.C0971f;
import android.app.Application;
import android.content.Context;
import androidx.core.app.ActivityOptionsCompat;
import b10.C2222b;
import b20.EnumC2325e;
import bc3.AbstractC3050q0;
import c20.AbstractC3877e;
import c20.C3876d;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.whoop.android.R;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import org.joda.time.DateTimeConstants;
import p088dc.AbstractC11895b;
import p236j.AbstractC21065d;
import p236j.InterfaceC21063b;
import p236j.InterfaceC21064c;
import p442qy.C30766e;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32132a;
import s93.AbstractC32309k;
import y00.AbstractC38792b8;
import y00.C38915o4;
import y00.C38918o7;
import y00.C38927p7;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: x20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C37846n extends AbstractC3877e {

    /* JADX INFO: renamed from: a */
    public AbstractC21065d f162017a;

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: a */
    public final void mo11856a() {
        AbstractC21065d abstractC21065d = this.f162017a;
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
        this.f162017a = null;
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: b */
    public final void mo6696b(InterfaceC21064c interfaceC21064c, InterfaceC21063b interfaceC21063b) {
        this.f162017a = interfaceC21064c.registerForActivityResult(new PollingContract(), interfaceC21063b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: d */
    public final Object mo6697d(C32132a c32132a, Object obj, C39857f c39857f, C3876d c3876d) {
        C37843k c37843k;
        EnumC38828f4 enumC38828f4;
        InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
        C38915o4 c38915o4Mo124330Y = interfaceC38802c8.mo124330Y();
        str = null;
        String str = null;
        EnumC38828f4 enumC38828f5 = c38915o4Mo124330Y != null ? c38915o4Mo124330Y.f167511E : null;
        int i13 = enumC38828f5 == null ? -1 : AbstractC37845m.f162016a[enumC38828f5.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            String clientSecret = interfaceC38802c8.getClientSecret();
            if (clientSecret == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c37843k = new C37843k(clientSecret, c32132a.f133154b, 300, 5, R.string.stripe_upi_polling_message, c39857f.f172129x, null);
        } else if (i13 == 2) {
            String clientSecret2 = interfaceC38802c8.getClientSecret();
            if (clientSecret2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c37843k = new C37843k(clientSecret2, c32132a.f133154b, 60, 5, R.string.stripe_blik_confirm_payment, c39857f.f172129x, null);
        } else if (i13 == 3) {
            String clientSecret3 = interfaceC38802c8.getClientSecret();
            if (clientSecret3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Integer num = c32132a.f133154b;
            String str2 = c39857f.f172129x;
            AbstractC38792b8 abstractC38792b8Mo124335m = interfaceC38802c8.mo124335m();
            AbstractC22676k.m65748h(abstractC38792b8Mo124335m, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayPayNowDetails");
            String str3 = ((C38918o7) abstractC38792b8Mo124335m).f167537w;
            if (str3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c37843k = new C37843k(clientSecret3, num, DateTimeConstants.SECONDS_PER_HOUR, 5, R.string.stripe_qrcode_lpm_confirm_payment, str2, str3);
        } else {
            if (i13 != 4) {
                C38915o4 c38915o4Mo124330Y2 = interfaceC38802c8.mo124330Y();
                if (c38915o4Mo124330Y2 != null && (enumC38828f4 = c38915o4Mo124330Y2.f167511E) != null) {
                    str = enumC38828f4.f167132w;
                }
                throw new IllegalStateException(AbstractC11895b.m31996o("Received invalid payment method type ", str, " in PollingAuthenticator").toString());
            }
            String clientSecret4 = interfaceC38802c8.getClientSecret();
            if (clientSecret4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Integer num2 = c32132a.f133154b;
            String str4 = c39857f.f172129x;
            AbstractC38792b8 abstractC38792b8Mo124335m2 = interfaceC38802c8.mo124335m();
            AbstractC22676k.m65748h(abstractC38792b8Mo124335m2, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayPromptPayDetails");
            String str5 = ((C38927p7) abstractC38792b8Mo124335m2).f167560w;
            if (str5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c37843k = new C37843k(clientSecret4, num2, DateTimeConstants.SECONDS_PER_HOUR, 5, R.string.stripe_qrcode_lpm_confirm_payment, str4, str5);
        }
        Application application = c32132a.f133153a.getApplication();
        AbstractC22676k.m65749i(application, "getApplication(...)");
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(application.getApplicationContext(), R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
        AbstractC22676k.m65749i(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        AbstractC21065d abstractC21065d = this.f162017a;
        if (abstractC21065d == null) {
            Application application2 = c32132a.f133153a.getApplication();
            AbstractC22676k.m65749i(application2, "getApplication(...)");
            Context applicationContext = application2.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            AbstractC32309k.m100574c(executorC22364d);
            C39865j c39865j = new C39865j(C30766e.f126697b, executorC22364d);
            C2222b c2222b = new C2222b(applicationContext, C25235a0.f99113w, new C0971f(applicationContext, i14));
            EnumC2325e enumC2325e = EnumC2325e.MISSING_POLLING_AUTHENTICATOR;
            boolean z4 = 6 & 4;
            C25272z c25272z = C25272z.f99163w;
            C25272z additionalNonPiiParams = z4 != 0 ? c25272z : null;
            AbstractC22676k.m65750j(additionalNonPiiParams, "additionalNonPiiParams");
            c39865j.m127938a(c2222b.mo7052a(enumC2325e, AbstractC25247g0.m73995d0(c25272z, additionalNonPiiParams)));
        } else {
            abstractC21065d.mo4052a(c37843k, activityOptionsCompatMakeCustomAnimation);
        }
        return C23454a0.f92919a;
    }
}
