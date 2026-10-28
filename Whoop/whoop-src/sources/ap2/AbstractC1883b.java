package ap2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ap2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lfi0/a;", "", "source", "", "", "otherProperties", "upsellsShown", "Ll83/a0;", "c", "(Lfi0/a;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "label", "value", "b", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lfi0/a;Ljava/lang/String;)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1883b {
    /* JADX INFO: renamed from: a */
    public static final void m5662a(InterfaceC14515a interfaceC14515a, String source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "icon", "Mobile Checkout", "back", AbstractC25247g0.m73990Y(new C23465k("screen_name", "receipt"), new C23465k("flow_type", source)), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m5663b(InterfaceC14515a interfaceC14515a, String str, String str2, String source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap_receipt_page_upsell", str, "Mobile Checkout", str2, AbstractC25247g0.m73990Y(new C23465k("screen_name", "receipt"), new C23465k("flow_type", source)), 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m5664c(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map, String str) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "receipt"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        if (str != null) {
            linkedHashMapM73993b0.put("upsells_shown", str);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Mobile Checkout", null, linkedHashMapM73993b0, 17, null);
    }
}
