package k20;

import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import g73.C15553a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import n83.C26460c;
import n83.C26463f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import q20.AbstractC29840y;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import y00.EnumC38828f4;
import y00.EnumC38853i;

/* JADX INFO: renamed from: k20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C22150o extends AbstractC22155t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85905w = 3;

    /* JADX INFO: renamed from: x */
    public final Serializable f85906x;

    public C22150o(EventReporter$Mode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        this.f85906x = mode;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f85905w) {
            case 0:
                return "mc_initial_displayed_payment_methods";
            case 1:
                return "mc_load_succeeded";
            case 2:
                return "mc_update_card";
            default:
                return C15553a.m43789p((EventReporter$Mode) this.f85906x, "init");
        }
    }

    @Override // k20.AbstractC22155t
    public Map getParams() {
        switch (this.f85905w) {
            case 0:
                return (C26463f) this.f85906x;
            case 1:
                return (C26463f) this.f85906x;
            case 2:
                return (C26463f) this.f85906x;
            default:
                return super.getParams();
        }
    }

    public C22150o(C26460c visiblePaymentMethods, List hiddenPaymentMethods, boolean z4) {
        AbstractC22676k.m65750j(visiblePaymentMethods, "visiblePaymentMethods");
        AbstractC22676k.m65750j(hiddenPaymentMethods, "hiddenPaymentMethods");
        C26463f c26463f = new C26463f();
        c26463f.put("visible_payment_methods", AbstractC25265s.m74110N0(visiblePaymentMethods, ",", null, null, null, 62));
        c26463f.put("hidden_payment_methods", AbstractC25265s.m74110N0(hiddenPaymentMethods, ",", null, null, null, 62));
        c26463f.put("payment_method_layout", z4 ? "vertical" : "horizontal");
        this.f85906x = c26463f.m78380b();
    }

    public C22150o(AbstractC29840y abstractC29840y, ArrayList arrayList, Duration duration) {
        String str;
        C26463f c26463f = new C26463f();
        c26463f.put(AttachmentExtensionsKt.EXTRA_DURATION, duration != null ? Float.valueOf((float) Duration.m134298toDoubleimpl(duration.getRawValue(), DurationUnit.SECONDS)) : null);
        if (abstractC29840y instanceof C29824j) {
            str = "google_pay";
        } else if (abstractC29840y instanceof C29828m) {
            str = "link";
        } else if (abstractC29840y instanceof C29838w) {
            EnumC38828f4 enumC38828f4 = ((C29838w) abstractC29840y).f121955x.f167511E;
            if (enumC38828f4 == null || (str = enumC38828f4.f167132w) == null) {
                str = "saved";
            }
        } else {
            str = "none";
        }
        c26463f.put("selected_lpm", str);
        c26463f.put("ordered_lpms", AbstractC25265s.m74110N0(arrayList, ",", null, null, null, 62));
        this.f85906x = c26463f.m78380b();
    }

    public C22150o(EnumC38853i enumC38853i) {
        C26463f c26463f = new C26463f();
        if (enumC38853i != null) {
            c26463f.put("selected_card_brand", enumC38853i.f167260w);
        }
        this.f85906x = c26463f.m78380b();
    }
}
