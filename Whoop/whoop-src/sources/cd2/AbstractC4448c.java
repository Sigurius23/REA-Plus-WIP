package cd2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.AbstractC25247g0;
import n83.C26463f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aC\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\n\u001a\u00020\t*\u00020\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\f\u001a\u00020\t*\u00020\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\u000b\u001a9\u0010\r\u001a\u00020\t*\u00020\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a9\u0010\u000e\u001a\u00020\t*\u00020\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000b\u001a9\u0010\u0010\u001a\u00020\t*\u00020\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\t*\u00020\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"", "", "analyticProperties", "", "backgroundEnabled", "assetId", "a", "(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;", "Lfi0/a;", "Ll83/a0;", "d", "(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V", "e", "f", "g", "backgroundEnabledAfterToggle", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lfi0/a;Ljava/util/Map;Z)V", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4448c {
    /* JADX INFO: renamed from: a */
    private static final Map<String, String> m13914a(Map<String, String> map, boolean z4, String str) {
        C26463f c26463f = new C26463f();
        c26463f.put("background", z4 ? "enabled" : "disabled");
        if (str != null) {
            c26463f.put("asset_id", str);
        }
        return AbstractC25247g0.m73995d0(map, c26463f.m78380b());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Map m13915b(Map map, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        return m13914a(map, z4, str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m13916c(InterfaceC14515a interfaceC14515a, Map<String, String> analyticProperties, boolean z4, String str) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click", z4 ? "background_enabled" : "background_disabled", "Sharing", null, m13914a(analyticProperties, z4, str), 17, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m13917d(InterfaceC14515a interfaceC14515a, Map<String, String> analyticProperties, boolean z4, String str) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click", "copy", "Sharing", null, m13914a(analyticProperties, z4, str), 17, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m13918e(InterfaceC14515a interfaceC14515a, Map<String, String> analyticProperties, boolean z4, String str) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click", "download", "Sharing", null, m13914a(analyticProperties, z4, str), 17, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m13919f(InterfaceC14515a interfaceC14515a, Map<String, String> analyticProperties, boolean z4, String str) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click", "message", "Sharing", null, m13914a(analyticProperties, z4, str), 17, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m13920g(InterfaceC14515a interfaceC14515a, Map<String, String> analyticProperties, boolean z4, String str) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click", "more", "Sharing", null, m13914a(analyticProperties, z4, str), 17, null);
    }

    /* JADX INFO: renamed from: h */
    public static final void m13921h(InterfaceC14515a interfaceC14515a, Map<String, String> analyticProperties, boolean z4) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, null, "Sharing", null, m13915b(analyticProperties, z4, null, 4, null), 17, null);
    }
}
