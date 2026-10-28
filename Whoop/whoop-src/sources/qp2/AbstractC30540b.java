package qp2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qp2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lfi0/a;", "", "source", "", "", "otherProperties", "Ll83/a0;", "b", "(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V", "a", "(Lfi0/a;Ljava/lang/String;)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30540b {
    /* JADX INFO: renamed from: a */
    public static final void m93627a(InterfaceC14515a interfaceC14515a, String source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "icon", "Mobile Checkout", "back", AbstractC25247g0.m73990Y(new C23465k("screen_name", "shipping_method"), new C23465k("flow_type", source)), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m93628b(InterfaceC14515a interfaceC14515a, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("screen_name", "shipping_method"), new C23465k("flow_type", source));
        if (map != null) {
            linkedHashMapM73993b0.putAll(map);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Mobile Checkout", null, linkedHashMapM73993b0, 17, null);
    }
}
