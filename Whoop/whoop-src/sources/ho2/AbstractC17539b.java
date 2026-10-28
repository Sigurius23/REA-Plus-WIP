package ho2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j02.InterfaceC21153l0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import jy1.C22047a;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ho2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\b\u001a1\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a1\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\b\u001a1\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\b\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\b\u001a9\u0010\u0016\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a;\u0010\u0018\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0018\u0010\u000b\u001aC\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aK\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\b\u001a\u0013\u0010 \u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010!\u001a\u0013\u0010#\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0001H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lfi0/a;", "", "source", "", "", "otherProperties", "Ll83/a0;", "r", "(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V", "errorMessage", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Liy1/c;", "i", "(Liy1/c;)V", "a", "(Lfi0/a;Ljava/lang/String;)V", "l", "m", "n", "f", "g", "o", "paymentType", "q", "usedSavedPaymentMethod", "k", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "e", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "j", "Lj02/l0;", "d", "(Lj02/l0;)V", "c", "p", "(Ljava/lang/String;)Ljava/lang/String;", "value", "", "b", "(Ljava/lang/String;)Z", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17539b {
    /* JADX INFO: renamed from: a */
    public static final void m49844a(InterfaceC14515a interfaceC14515a, String source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "icon", "Mobile Checkout", "back", AbstractC25247g0.m73990Y(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source)), 1, null);
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m49845b(String input) {
        Pattern patternCompile = Pattern.compile("^(.)\\1{3}\\d{4}$");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC22676k.m65750j(input, "input");
        return patternCompile.matcher(input).matches();
    }

    /* JADX INFO: renamed from: c */
    public static final void m49846c(InterfaceC21153l0 interfaceC21153l0) {
        AbstractC22676k.m65750j(interfaceC21153l0, "<this>");
        interfaceC21153l0.mo59005T("universal_checkout", "affirm");
    }

    /* JADX INFO: renamed from: d */
    public static final void m49847d(InterfaceC21153l0 interfaceC21153l0) {
        AbstractC22676k.m65750j(interfaceC21153l0, "<this>");
        interfaceC21153l0.mo59005T("universal_checkout", "klarna");
    }

    /* JADX INFO: renamed from: e */
    public static final void m49848e(InterfaceC14515a interfaceC14515a, String source, String errorMessage, String str, String usedSavedPaymentMethod, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(usedSavedPaymentMethod, "usedSavedPaymentMethod");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source), new C23465k("used_saved_payment_method", usedSavedPaymentMethod), new C23465k("payment_type", str != null ? m49859p(str) : null));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "error", errorMessage, "Mobile Checkout", "order_error", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m49849f(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", null, "Mobile Checkout", "discount_applied", linkedHashMapM73993b0, 5, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m49850g(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", null, "Mobile Checkout", "discount_removed", linkedHashMapM73993b0, 5, null);
    }

    /* JADX INFO: renamed from: h */
    public static final void m49851h(InterfaceC14515a interfaceC14515a, String source, String str, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        if (str == null) {
            str = "Unknown stripe error";
        }
        String str2 = str;
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source), new C23465k("error_message", str2));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "error", "stripe", "Mobile Checkout", str2, linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m49852i(InterfaceC21030c interfaceC21030c) {
        AbstractC22676k.m65750j(interfaceC21030c, "<this>");
        interfaceC21030c.mo58701b(new C22047a(0, "universal_checkout.stripe_flow_controller_initialization_error", null, C25271y.f99162w, null, 21, null));
    }

    /* JADX INFO: renamed from: j */
    public static final void m49853j(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "auto-open", "cta", "Mobile Checkout", "open_payment_sheet", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m49854k(InterfaceC14515a interfaceC14515a, String source, String str, String usedSavedPaymentMethod, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(usedSavedPaymentMethod, "usedSavedPaymentMethod");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source), new C23465k("used_saved_payment_method", usedSavedPaymentMethod), new C23465k("payment_type", str != null ? m49859p(str) : null));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "cta", "Mobile Checkout", "place_order", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m49855l(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "cta", "Mobile Checkout", "add_payment_method", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: m */
    public static final void m49856m(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "cta", "Mobile Checkout", "HSA_FSA", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: n */
    public static final void m49857n(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "cta", "Mobile Checkout", "discount_code_entry", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: o */
    public static final void m49858o(InterfaceC14515a interfaceC14515a, String errorMessage, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", errorMessage, "Mobile Checkout", "error", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: p */
    private static final String m49859p(String str) {
        if (m49845b(str)) {
            return "card";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: q */
    public static final void m49860q(InterfaceC14515a interfaceC14515a, String source, String str, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source), new C23465k("payment_type", str != null ? m49859p(str) : null));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "cta", "Mobile Checkout", "update_payment_method", linkedHashMapM73993b0, 1, null);
    }

    /* JADX INFO: renamed from: r */
    public static final void m49861r(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "checkout"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Mobile Checkout", null, linkedHashMapM73993b0, 17, null);
    }
}
