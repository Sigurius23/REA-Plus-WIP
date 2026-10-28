package k20;

import b20.C2321a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import n83.C26463f;
import p203hy.AbstractC17719h;
import p319m4.AbstractC25012a;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import r80.AbstractC31061c;
import se.AbstractC32411b;
import y00.EnumC38853i;

/* JADX INFO: renamed from: k20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C22149n extends AbstractC22155t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85903w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashMap f85904x;

    public C22149n(AbstractC17719h abstractC17719h) {
        this.f85903w = 4;
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("experiment_retrieved", abstractC17719h.mo50711b().f167598w), new C23465k("arb_id", abstractC17719h.mo50710a()), new C23465k("assignment_group", abstractC17719h.mo50712c()));
        Map map = abstractC17719h.f68891d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(AbstractC25012a.m73375h(entry.getKey(), "dimensions-"), entry.getValue());
        }
        this.f85904x = AbstractC25247g0.m73995d0(mapM73990Y, linkedHashMap);
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f85903w) {
            case 0:
                return "mc_cardscan_cancel";
            case 1:
                return "mc_cardscan_failed";
            case 2:
                return "mc_cardscan_success";
            case 3:
                return "mc_elements_session_load_failed";
            case 4:
                return "elements.experiment_exposure";
            case 5:
                return "mc_load_failed";
            case 6:
                return "mc_set_default_payment_method_failed";
            default:
                return "mc_update_card_failed";
        }
    }

    @Override // k20.AbstractC22155t
    public final Map getParams() {
        switch (this.f85903w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return this.f85904x;
    }

    public C22149n(String str, Throwable th3) {
        this.f85903w = 6;
        this.f85904x = AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("error_message", th3.getMessage()), new C23465k("payment_method_type", str)), C2321a.m7172a(th3));
    }

    public C22149n(Throwable error) {
        this.f85903w = 3;
        AbstractC22676k.m65750j(error, "error");
        this.f85904x = AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("error_message", AbstractC32411b.m101059C(error).mo816a()), C2321a.m7172a(error));
    }

    public C22149n(Duration duration, int i13) {
        this.f85903w = i13;
        switch (i13) {
            case 2:
                this.f85904x = AbstractC25247g0.m73995d0(AbstractC35903f.m113985C(duration), AbstractC25247g0.m73989X(new C23465k("implementation", "google_pay")));
                break;
            default:
                this.f85904x = AbstractC25247g0.m73995d0(AbstractC35903f.m113985C(duration), AbstractC25247g0.m73989X(new C23465k("implementation", "google_pay")));
                break;
        }
    }

    public C22149n(Duration duration, Throwable error, int i13) {
        this.f85903w = i13;
        switch (i13) {
            case 5:
                AbstractC22676k.m65750j(error, "error");
                this.f85904x = AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, duration != null ? Float.valueOf((float) Duration.m134298toDoubleimpl(duration.getRawValue(), DurationUnit.SECONDS)) : null), new C23465k("error_message", AbstractC32411b.m101059C(error).mo816a())), C2321a.m7172a(error));
                break;
            default:
                this.f85904x = AbstractC25247g0.m73995d0(AbstractC35903f.m113985C(duration), AbstractC25247g0.m73990Y(new C23465k("implementation", "google_pay"), new C23465k("error_message", error != null ? error.getClass().getSimpleName() : null)));
                break;
        }
    }

    public C22149n(EnumC38853i enumC38853i, Throwable th3) {
        this.f85903w = 7;
        C26463f c26463f = new C26463f();
        if (enumC38853i != null) {
            c26463f.put("selected_card_brand", enumC38853i.f167260w);
        }
        c26463f.put("error_message", th3.getMessage());
        this.f85904x = AbstractC25247g0.m73995d0(c26463f.m78380b(), C2321a.m7172a(th3));
    }
}
