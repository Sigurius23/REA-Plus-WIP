package k20;

import com.squareup.wire.AbstractC5583n;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import r80.AbstractC31061c;
import y00.EnumC38853i;

/* JADX INFO: renamed from: k20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C22147l extends AbstractC22155t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85898w;

    /* JADX INFO: renamed from: x */
    public final Map f85899x;

    public C22147l(int i13) {
        this.f85898w = i13;
        switch (i13) {
            case 2:
                this.f85899x = AbstractC31061c.m95645u("implementation", "google_pay");
                break;
            default:
                this.f85899x = AbstractC31061c.m95645u("implementation", "google_pay");
                break;
        }
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f85898w) {
            case 0:
                return "mc_disallowed_card_brand";
            case 1:
                return "mc_cardscan_api_check_succeeded";
            case 2:
                return "mc_cardscan_scan_started";
            case 3:
                return "mc_load_started";
            case 4:
                return "luxe_serialize_failure";
            case 5:
                return "mc_form_completed";
            case 6:
                return "mc_form_interacted";
            case 7:
                return "mc_confirm_button_tapped";
            case 8:
                return "mc_set_default_payment_method";
            default:
                return "mc_form_shown";
        }
    }

    @Override // k20.AbstractC22155t
    public final Map getParams() {
        switch (this.f85898w) {
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
            case 7:
                break;
            case 8:
                break;
        }
        return this.f85899x;
    }

    public C22147l(String code, int i13) {
        this.f85898w = i13;
        switch (i13) {
            case 5:
                this.f85899x = AbstractC31061c.m95645u("selected_lpm", code);
                break;
            case 6:
                AbstractC22676k.m65750j(code, "code");
                this.f85899x = AbstractC31061c.m95645u("selected_lpm", code);
                break;
            case 7:
            default:
                this.f85899x = AbstractC31061c.m95645u("error_message", code);
                break;
            case 8:
                this.f85899x = AbstractC31061c.m95645u("payment_method_type", code);
                break;
            case 9:
                AbstractC22676k.m65750j(code, "code");
                this.f85899x = AbstractC31061c.m95645u("selected_lpm", code);
                break;
        }
    }

    public C22147l(Duration duration, String str, String str2) {
        this.f85898w = 7;
        this.f85899x = AbstractC5583n.m16798y(AbstractC25247g0.m73990Y(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, duration != null ? Float.valueOf((float) Duration.m134298toDoubleimpl(duration.getRawValue(), DurationUnit.SECONDS)) : null), new C23465k("selected_lpm", str), new C23465k("link_context", str2)));
    }

    public C22147l(EnumC38853i cardBrand) {
        this.f85898w = 0;
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        this.f85899x = AbstractC31061c.m95645u("brand", cardBrand.f167260w);
    }

    public C22147l(boolean z4) {
        this.f85898w = 3;
        this.f85899x = AbstractC36095b.m114688p(Boolean.valueOf(z4), "compose");
    }
}
