package g20;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import b10.C2222b;
import b10.C2273z0;
import b20.C2321a;
import b20.C2327g;
import bc3.AbstractC3006f0;
import bz.C3702a;
import bz.EnumC3703b;
import bz.InterfaceC3704c;
import c20.C3873a;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.MessageType;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.C25272z;
import p026b2.C2319y;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s40.C32132a;
import s83.AbstractC32269c;
import u03.InterfaceC34393a;
import v10.C35525a;
import wb3.AbstractC37056f;
import y00.C38915o4;
import y00.C38928q;
import y00.C38937r;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;
import y00.InterfaceC38946s;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C15272r extends AbstractC1637w1 {

    /* JADX INFO: renamed from: O */
    public static final List f57344O = AbstractC37056f.m118958J("payment_method");

    /* JADX INFO: renamed from: E */
    public final C2327g f57345E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC34393a f57346F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC34393a f57347G;

    /* JADX INFO: renamed from: H */
    public final C39865j f57348H;

    /* JADX INFO: renamed from: I */
    public final C2222b f57349I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC30063j f57350J;

    /* JADX INFO: renamed from: K */
    public final C1601k1 f57351K;

    /* JADX INFO: renamed from: L */
    public final boolean f57352L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC3704c f57353M;

    /* JADX INFO: renamed from: N */
    public final C13045h2 f57354N;

    /* JADX INFO: renamed from: w */
    public final boolean f57355w;

    /* JADX INFO: renamed from: x */
    public final C2273z0 f57356x;

    /* JADX INFO: renamed from: y */
    public final C3873a f57357y;

    /* JADX INFO: renamed from: z */
    public final C35525a f57358z;

    public C15272r(boolean z4, C2273z0 c2273z0, C3873a nextActionHandlerRegistry, C35525a defaultReturnUrl, C2327g c2327g, InterfaceC34393a lazyPaymentIntentFlowResultProcessor, InterfaceC34393a lazySetupIntentFlowResultProcessor, C39865j c39865j, C2222b c2222b, InterfaceC30063j uiContext, C1601k1 c1601k1, boolean z13, InterfaceC3704c durationProvider) {
        AbstractC22676k.m65750j(nextActionHandlerRegistry, "nextActionHandlerRegistry");
        AbstractC22676k.m65750j(defaultReturnUrl, "defaultReturnUrl");
        AbstractC22676k.m65750j(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        AbstractC22676k.m65750j(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        AbstractC22676k.m65750j(durationProvider, "durationProvider");
        this.f57355w = z4;
        this.f57356x = c2273z0;
        this.f57357y = nextActionHandlerRegistry;
        this.f57358z = defaultReturnUrl;
        this.f57345E = c2327g;
        this.f57346F = lazyPaymentIntentFlowResultProcessor;
        this.f57347G = lazySetupIntentFlowResultProcessor;
        this.f57348H = c39865j;
        this.f57349I = c2222b;
        this.f57350J = uiContext;
        this.f57351K = c1601k1;
        this.f57352L = z13;
        this.f57353M = durationProvider;
        this.f57354N = AbstractC13091v.m36593c(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public static final Object m43368g(C15272r c15272r, InterfaceC38946s interfaceC38946s, String str, AbstractC32269c abstractC32269c) {
        C15268n c15268n;
        C2327g c2327g = c15272r.f57345E;
        C2273z0 c2273z0 = c15272r.f57356x;
        if (abstractC32269c instanceof C15268n) {
            c15268n = (C15268n) abstractC32269c;
            int i13 = c15268n.f57332y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15268n.f57332y = i13 - Integer.MIN_VALUE;
            } else {
                c15268n = new C15268n(c15272r, abstractC32269c);
            }
        } else {
            c15268n = new C15268n(c15272r, abstractC32269c);
        }
        Object obj = c15268n.f57330w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15268n.f57332y;
        if (i14 != 0) {
            if (i14 != 1 && i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        interfaceC38946s.mo124366v0(str);
        InterfaceC38946s interfaceC38946sMo124367w0 = interfaceC38946s.mo124367w0();
        boolean z4 = interfaceC38946sMo124367w0 instanceof C38928q;
        List list = f57344O;
        if (z4) {
            C39857f c39857f = (C39857f) c2327g.get();
            c15268n.f57332y = 1;
            Object objM7086h = c2273z0.m7086h((C38928q) interfaceC38946sMo124367w0, c39857f, list, c15268n);
            if (objM7086h != enumC31071a) {
                return objM7086h;
            }
        } else {
            if (!(interfaceC38946sMo124367w0 instanceof C38937r)) {
                throw new NoWhenBranchMatchedException();
            }
            C39857f c39857f2 = (C39857f) c2327g.get();
            c15268n.f57332y = 2;
            Object objM7088j = c2273z0.m7088j((C38937r) interfaceC38946sMo124367w0, c39857f2, list, c15268n);
            if (objM7088j != enumC31071a) {
                return objM7088j;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: l */
    public static void m43369l(C15272r c15272r, AbstractC15258d abstractC15258d, InterfaceC38802c8 interfaceC38802c8, Map map, int i13) {
        String str;
        Map mapM7173b;
        C38915o4 c38915o4Mo124330Y;
        EnumC38828f4 enumC38828f4;
        String clientSecret;
        if ((i13 & 2) != 0) {
            interfaceC38802c8 = null;
        }
        int i14 = i13 & 4;
        Map mapM73989X = C25272z.f99163w;
        if (i14 != 0) {
            map = mapM73989X;
        }
        C13045h2 c13045h2 = c15272r.f57354N;
        if (c13045h2.getValue() != null) {
            return;
        }
        Boolean bool = (Boolean) c15272r.f57351K.m5001b("confirm_action_requested");
        PaymentAnalyticsEvent paymentAnalyticsEvent = bool != null ? bool.booleanValue() : true ? PaymentAnalyticsEvent.PaymentLauncherConfirmFinished : PaymentAnalyticsEvent.PaymentLauncherNextActionFinished;
        if (abstractC15258d instanceof C15256b) {
            str = "succeeded";
        } else if (abstractC15258d instanceof C15255a) {
            str = "canceled";
        } else {
            if (!(abstractC15258d instanceof C15257c)) {
                throw new NoWhenBranchMatchedException();
            }
            str = MessageType.FAILED;
        }
        Map mapM16798y = AbstractC5583n.m16798y(AbstractC25247g0.m73990Y(new C23465k("intent_id", (interfaceC38802c8 == null || (clientSecret = interfaceC38802c8.getClientSecret()) == null) ? null : AbstractC39414r.m125863I0(clientSecret, "_secret_")), new C23465k(NotificationCompat.CATEGORY_STATUS, str), new C23465k("payment_method_type", (interfaceC38802c8 == null || (c38915o4Mo124330Y = interfaceC38802c8.mo124330Y()) == null || (enumC38828f4 = c38915o4Mo124330Y.f167511E) == null) ? null : enumC38828f4.f167132w)));
        if (abstractC15258d instanceof C15257c) {
            int i15 = StripeException.f22154E;
            mapM7173b = C2321a.m7173b(AbstractC32123d.m100024d(((C15257c) abstractC15258d).f57288w));
        } else {
            mapM7173b = mapM73989X;
        }
        Duration durationM11527a = ((C3702a) c15272r.f57353M).m11527a(EnumC3703b.f15147H);
        if (durationM11527a != null) {
            mapM73989X = AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, Long.valueOf(Duration.m134276getInWholeSecondsimpl(durationM11527a.getRawValue()))));
        }
        c15272r.f57348H.m127938a(c15272r.f57349I.mo7052a(paymentAnalyticsEvent, AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(map, mapM16798y), mapM7173b), mapM73989X)));
        c13045h2.m36571k(null, abstractC15258d);
    }

    /* JADX INFO: renamed from: j */
    public final void m43370j(String clientSecret, C32132a c32132a) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        Boolean bool = (Boolean) this.f57351K.m5001b("key_has_started");
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C2319y(this, clientSecret, c32132a, null, 9), 3);
    }
}
