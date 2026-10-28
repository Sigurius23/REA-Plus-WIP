package p664yy;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ar0.C1926a;
import b10.C2222b;
import b10.C2273z0;
import bi.AbstractC3269g;
import bi.C3278p;
import c93.InterfaceC4339a;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.whoop.access.omronauth.view.OmronAuthFragment;
import com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementFragment;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p025b1.InterfaceC2215f;
import p027b3.AbstractC2378g1;
import p499t9.C33652u;
import p505ts.AbstractC34132o;
import p537ux.C35362x;
import p537ux.C35363y;
import p601x0.InterfaceC37796g;
import p695zx.C41192n;
import p695zx.C41193o;
import p695zx.C41201w;
import p695zx.InterfaceC41184f;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32800q;
import ti0.C33840e;
import wo2.C37479b;
import xi1.C38322b;
import yi1.C39568b;
import zd3.C40580x;
import zi0.AbstractC40662a;
import zi1.AbstractC40678h;
import zi1.AbstractC40679i;
import zk1.AbstractC40837a;
import zk1.C40839c;
import zo2.AbstractC40936g;

/* JADX INFO: renamed from: yy.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C39850b0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172104w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f172105x;

    public /* synthetic */ C39850b0(Object obj, int i13) {
        this.f172104w = i13;
        this.f172105x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws PendingIntent.CanceledException {
        Object objM107888l;
        InterfaceC41184f c41201w;
        switch (this.f172104w) {
            case 0:
                return (C39857f) this.f172105x;
            case 1:
                return ((InterfaceC2215f) this.f172105x).mo278s();
            case 2:
                ((InterfaceC37796g) this.f172105x).close();
                return C23454a0.f92919a;
            case 3:
                PendingIntent actionIntent = ((RemoteAction) this.f172105x).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC2378g1.m7342q(actionIntent);
                } else {
                    actionIntent.send();
                }
                return C23454a0.f92919a;
            case 4:
                return PaymentMethodManagementFragment.m23231C((PaymentMethodManagementFragment) this.f172105x);
            case 5:
                return OmronAuthFragment.m16964F((OmronAuthFragment) this.f172105x);
            case 6:
                return Boolean.valueOf(AbstractC40662a.m131975s((C33840e) this.f172105x));
            case 7:
                return AbstractC40678h.m132062f((C39568b) this.f172105x);
            case 8:
                return AbstractC40679i.m132068d((C38322b) this.f172105x);
            case 9:
                return AbstractC40837a.m132342n((C40839c) this.f172105x);
            case 10:
                return AbstractC40936g.m132841r((C37479b) this.f172105x);
            default:
                C41193o c41193o = (C41193o) this.f172105x;
                C3278p c3278p = new C3278p(7);
                C32800q c32800q = new C32800q();
                c32800q.f136504w = c3278p;
                c32800q.f136505x = AbstractC3269g.m9493Z(Boolean.FALSE);
                Context appContext = c41193o.f177721d;
                try {
                    AbstractC22676k.m65749i(appContext, "appContext");
                    C35363y c35363y = C35363y.f150632y;
                    if (c35363y == null) {
                        SharedPreferences sharedPreferences = new C35362x(appContext).f150631a;
                        String string = sharedPreferences.getString("key_publishable_key", null);
                        c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                        if (c35363y == null) {
                            throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                        }
                        C35363y.f150632y = c35363y;
                    }
                    objM107888l = c35363y.f150633w;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (!(objM107888l instanceof C23467m)) {
                    c41193o.m133832a(PaymentAnalyticsEvent.CardMetadataPublishableKeyAvailable, (String) objM107888l);
                }
                if (C23468n.m68037a(objM107888l) != null) {
                    c41193o.m133832a(PaymentAnalyticsEvent.CardMetadataPublishableKeyUnavailable, "pk_undefined");
                }
                if (C23468n.m68037a(objM107888l) == null) {
                    String str = (String) objM107888l;
                    AbstractC22676k.m65749i(appContext, "appContext");
                    c41201w = new C41201w(new C2273z0(appContext, new C1926a(str, 11), c41193o.f177719b, null, null, null, null, null, null, 65528), new C39857f(str, (String) null, 6), c3278p, new C39865j(), new C2222b(appContext, c41193o.f177718a, str));
                } else {
                    C40580x c40580x = new C40580x();
                    c40580x.f174776w = AbstractC3269g.m9493Z(Boolean.FALSE);
                    c41201w = c40580x;
                }
                return new C41192n(c32800q, c41201w, new C33652u(12), c3278p);
        }
    }
}
