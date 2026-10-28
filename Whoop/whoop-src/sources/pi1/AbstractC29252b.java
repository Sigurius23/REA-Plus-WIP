package pi1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import n83.C26463f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: pi1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aG\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\r\u001a\u00020\f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0011\u0010\u0014\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u0011\u0010\u0015\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u0019\u0010\u0016\u001a\u00020\f*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\f*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u00020\f*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u001a\u0010\u0010\u001a\u0011\u0010\u001b\u001a\u00020\f*\u00020\b¢\u0006\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"", "Ll83/k;", "", "", "additionalProperties", "", "b", "([Ll83/k;)Ljava/util/Map;", "Lfi0/a;", "source", "value", "label", "Ll83/a0;", "m", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "e", "(Lfi0/a;)V", "k", "f", "j", "d", "c", "i", "(Lfi0/a;Ljava/lang/String;)V", "l", "a", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29252b {
    /* JADX INFO: renamed from: a */
    public static final void m88862a(InterfaceC14515a interfaceC14515a, String label) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(label, "label");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "dismissed_upsell", label, "Upgrade", null, m88863b(new C23465k[0]), 17, null);
    }

    /* JADX INFO: renamed from: b */
    private static final Map<String, Object> m88863b(C23465k... c23465kArr) {
        return AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("source", "health_tab"), AbstractC25247g0.m74002k0(c23465kArr));
    }

    /* JADX INFO: renamed from: c */
    public static final void m88864c(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.SCROLLED_TO_BOTTOM, null, "Health tab", null, null, 53, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m88865d(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, null, null, "Blood Pressure", null, m88863b(new C23465k[0]), 23, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m88866e(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, null, null, "Health Monitor - Entered", null, m88863b(new C23465k[0]), 23, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m88867f(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, null, null, "Healthspan", null, m88863b(new C23465k[0]), 23, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m88868g(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, "MCI", "view_overview", null, "MCI", null, m88863b(new C23465k[0]), 20, null);
    }

    /* JADX INFO: renamed from: h */
    public static final void m88869h(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click_advanced_labs_card", null, "Bloodwork", null, m88863b(new C23465k(HMSTrackSource.SCREEN, "health_tab")), 21, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m88870i(InterfaceC14515a interfaceC14515a, String label) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(label, "label");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "clicked_feature", label, "Upgrade", null, m88863b(new C23465k[0]), 17, null);
    }

    /* JADX INFO: renamed from: j */
    public static final void m88871j(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, null, null, "HI - Pregnancy", null, m88863b(new C23465k[0]), 23, null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m88872k(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, null, null, "Stress Monitor", null, m88863b(new C23465k[0]), 23, null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m88873l(InterfaceC14515a interfaceC14515a, String label) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(label, "label");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "clicked_upsell", label, "Upgrade", null, m88863b(new C23465k[0]), 17, null);
    }

    /* JADX INFO: renamed from: m */
    public static final void m88874m(InterfaceC14515a interfaceC14515a, String source, String str, String str2) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        C26463f c26463f = new C26463f();
        c26463f.put("source", source);
        if (str2 != null) {
        }
        if (str != null) {
            c26463f.put("value", str);
        }
        interfaceC14515a.mo41423e("Health tab", c26463f.m78380b());
    }
}
