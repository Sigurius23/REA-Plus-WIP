package k20;

import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import g73.C15553a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.Map;
import n10.EnumC26121c0;
import n83.C26463f;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import q20.AbstractC29840y;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: k20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C22154s extends AbstractC22155t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85909w = 1;

    /* JADX INFO: renamed from: x */
    public final String f85910x;

    /* JADX INFO: renamed from: y */
    public final Map f85911y;

    public C22154s(EventReporter$Mode mode, InterfaceC22153r interfaceC22153r, Duration duration, AbstractC29840y paymentSelection, EnumC26121c0 enumC26121c0, String str) {
        String strM43789p;
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        if (mode == EventReporter$Mode.Embedded) {
            strM43789p = C15553a.m43789p(mode, "payment_".concat(interfaceC22153r.mo63410e()));
        } else {
            strM43789p = C15553a.m43789p(mode, "payment_" + C15553a.m43788o(paymentSelection) + "_" + interfaceC22153r.mo63410e());
        }
        this.f85910x = strM43789p;
        C26463f c26463f = new C26463f();
        c26463f.put(AttachmentExtensionsKt.EXTRA_DURATION, duration != null ? Float.valueOf((float) Duration.m134298toDoubleimpl(duration.getRawValue(), DurationUnit.SECONDS)) : null);
        if (enumC26121c0 != null) {
            c26463f.put("deferred_intent_confirmation_type", enumC26121c0.f103492w);
        }
        if (str != null) {
            c26463f.put("intent_id", str);
        }
        if (interfaceC22153r instanceof C22151p) {
            AbstractC22143h abstractC22143h = ((C22151p) interfaceC22153r).f85907a;
            c26463f.put("error_message", abstractC22143h.mo63404a());
            String strMo63405b = abstractC22143h.mo63405b();
            if (strMo63405b != null) {
                c26463f.put("error_code", strMo63405b);
            }
        }
        c26463f.put("selected_lpm", AbstractC22156u.m63411a(paymentSelection));
        String strM63412b = AbstractC22156u.m63412b(paymentSelection);
        if (strM63412b != null) {
            c26463f.put("link_context", strM63412b);
        }
        Boolean boolM99719I = AbstractC32073e.m99719I(paymentSelection);
        if (boolM99719I != null) {
            c26463f.put("set_as_default", boolM99719I);
        }
        this.f85911y = c26463f.m78380b();
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f85909w) {
            case 0:
                break;
        }
        return this.f85910x;
    }

    @Override // k20.AbstractC22155t
    public final Map getParams() {
        switch (this.f85909w) {
            case 0:
                return (C26463f) this.f85911y;
            default:
                return this.f85911y;
        }
    }

    public C22154s(EventReporter$Mode mode, String code) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(code, "code");
        this.f85910x = C15553a.m43789p(mode, "paymentoption_removed");
        this.f85911y = AbstractC31061c.m95645u("selected_lpm", code);
    }
}
