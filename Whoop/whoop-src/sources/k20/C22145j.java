package k20;

import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import t20.C33338s;
import y00.EnumC38853i;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: k20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C22145j extends AbstractC22155t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85895w = 3;

    /* JADX INFO: renamed from: x */
    public final Object f85896x;

    public C22145j(String code, String str) {
        AbstractC22676k.m65750j(code, "code");
        this.f85896x = AbstractC25247g0.m73990Y(new C23465k("selected_lpm", code), new C23465k("link_context", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    private final Map m63406d() {
        return this.f85896x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    private final Map m63407e() {
        return this.f85896x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: f */
    private final Map m63408f() {
        return this.f85896x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: g */
    private final Map m63409g() {
        return this.f85896x;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f85895w) {
            case 0:
                return "stripe_android.bankaccountcollector.finished";
            case 1:
                return "mc_cbc_selected";
            case 2:
                return "mc_cardscan_api_check_failed";
            default:
                return "mc_carousel_payment_method_tapped";
        }
    }

    @Override // k20.AbstractC22155t
    public final Map getParams() {
        switch (this.f85895w) {
            case 0:
                return m63406d();
            case 1:
                return m63407e();
            case 2:
                return m63408f();
            default:
                return m63409g();
        }
    }

    public C22145j(Throwable th3) {
        this.f85896x = AbstractC25247g0.m73990Y(new C23465k("implementation", "google_pay"), new C23465k("error_message", th3 != null ? th3.getClass().getSimpleName() : null));
    }

    public C22145j(EnumC22148m enumC22148m, EnumC38853i selectedBrand) {
        AbstractC22676k.m65750j(selectedBrand, "selectedBrand");
        this.f85896x = AbstractC25247g0.m73990Y(new C23465k("cbc_event_source", enumC22148m.f85902w), new C23465k("selected_card_brand", selectedBrand.f167260w));
    }

    public C22145j(C33338s event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC38802c8 interfaceC38802c8 = event.f139082c;
        this.f85896x = AbstractC25247g0.m73990Y(new C23465k("intent_id", interfaceC38802c8 != null ? interfaceC38802c8.getId() : null), new C23465k("link_account_session_id", event.f139081b), new C23465k("fc_sdk_result", event.f139080a));
    }
}
