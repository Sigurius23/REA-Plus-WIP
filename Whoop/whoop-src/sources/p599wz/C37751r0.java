package p599wz;

import com.stripe.android.link.LinkActivityContract;
import ih0.AbstractC18489d0;
import n20.C26168c;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p479s4.AbstractC32121b;
import p631xz.C38737n0;
import p665yz.C39898a;
import p665yz.C39899b;
import p665yz.C39900c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import v00.C35459c0;
import v10.C35540p;

/* JADX INFO: renamed from: wz.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37751r0 {

    /* JADX INFO: renamed from: a */
    public final String f161715a;

    /* JADX INFO: renamed from: b */
    public final LinkActivityContract f161716b;

    /* JADX INFO: renamed from: c */
    public final C38737n0 f161717c;

    /* JADX INFO: renamed from: d */
    public final C39898a f161718d;

    /* JADX INFO: renamed from: e */
    public AbstractC21065d f161719e;

    public C37751r0(C26168c linkAnalyticsComponentFactory, String paymentElementCallbackIdentifier, LinkActivityContract linkActivityContract, C38737n0 linkStore) {
        AbstractC22676k.m65750j(linkAnalyticsComponentFactory, "linkAnalyticsComponentFactory");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(linkActivityContract, "linkActivityContract");
        AbstractC22676k.m65750j(linkStore, "linkStore");
        this.f161715a = paymentElementCallbackIdentifier;
        this.f161716b = linkActivityContract;
        this.f161717c = linkStore;
        this.f161718d = linkAnalyticsComponentFactory.m77713a().m77687a();
    }

    /* JADX INFO: renamed from: a */
    public final void m121158a(AbstractC37747q linkActivityResult, Function1 function1) {
        C39899b c39899b = this.f161718d.f172270a;
        AbstractC22676k.m65750j(linkActivityResult, "linkActivityResult");
        boolean z4 = linkActivityResult instanceof C37735m;
        if (z4) {
            int iOrdinal = ((C37735m) linkActivityResult).f161688w.ordinal();
            if (iOrdinal == 0) {
                c39899b.m128003a(C39900c.f172277E, null);
            } else if (iOrdinal == 1) {
                c39899b.m128003a(C39900c.f172279G, null);
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((linkActivityResult instanceof C37744p) || (linkActivityResult instanceof C37738n)) {
            c39899b.m128003a(C39900c.f172282J, null);
        } else {
            if (!(linkActivityResult instanceof C37741o)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable error = ((C37741o) linkActivityResult).f161701w;
            c39899b.getClass();
            AbstractC22676k.m65750j(error, "error");
            c39899b.m128003a(C39900c.f172278F, AbstractC31061c.m95645u("error_message", AbstractC32121b.m100006k(error)));
        }
        if ((linkActivityResult instanceof C37744p) || (linkActivityResult instanceof C37738n)) {
            this.f161717c.m124148a();
        } else if (!z4 && !(linkActivityResult instanceof C37741o)) {
            throw new NoWhenBranchMatchedException();
        }
        function1.invoke(linkActivityResult);
    }

    /* JADX INFO: renamed from: b */
    public final void m121159b(C35459c0 paymentMethodMetadata, C37708d linkAccountInfo, C37718g0 configuration, EnumC37721h0 linkExpressMode, InterfaceC37739n0 launchMode) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
        AbstractC22676k.m65750j(launchMode, "launchMode");
        AbstractC22676k.m65750j(linkExpressMode, "linkExpressMode");
        C37729k c37729k = new C37729k(paymentMethodMetadata, linkAccountInfo, configuration, linkExpressMode, launchMode);
        AbstractC21065d abstractC21065d = this.f161719e;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(c37729k, null);
        }
        this.f161718d.f172270a.m128003a(C39900c.f172280H, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m121160c(String str, AbstractC21071j activityResultRegistry, Function1 function1) {
        AbstractC22676k.m65750j(activityResultRegistry, "activityResultRegistry");
        this.f161719e = activityResultRegistry.m58914d(AbstractC18489d0.m53370k(this.f161715a, "_", str), this.f161716b, new C35540p(this, function1));
    }
}
