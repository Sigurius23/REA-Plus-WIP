package dz;

import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import v30.InterfaceC35592a;
import y00.EnumC38853i;

/* JADX INFO: renamed from: dz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12455b extends AbstractC12462i implements InterfaceC35592a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42524w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f42525x;

    public C12455b(EnumC12454a enumC12454a, EnumC38853i selectedBrand) {
        AbstractC22676k.m65750j(selectedBrand, "selectedBrand");
        this.f42525x = AbstractC25247g0.m73990Y(new C23465k("cbc_event_source", enumC12454a.f42523w), new C23465k("selected_card_brand", selectedBrand.f167260w));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    private final Map m35092d() {
        return this.f42525x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    private final Map m35093e() {
        return this.f42525x;
    }

    @Override // dz.AbstractC12462i
    /* JADX INFO: renamed from: a */
    public final Map mo35094a() {
        switch (this.f42524w) {
            case 0:
                return m35092d();
            default:
                return m35093e();
        }
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f42524w) {
            case 0:
                return "cs_cbc_selected";
            default:
                return "cs_cardscan_api_check_failed";
        }
    }

    public C12455b(Throwable th3) {
        this.f42525x = AbstractC25247g0.m73990Y(new C23465k("implementation", "google_pay"), new C23465k("error_message", th3 != null ? th3.getClass().getSimpleName() : null));
    }
}
