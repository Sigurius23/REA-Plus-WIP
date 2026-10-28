package vf0;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vf0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"", "Ll83/k;", "", "", "additionalProperties", "", "b", "([Ll83/k;)Ljava/util/Map;", "Lfi0/a;", "source", "testCount", "Ll83/a0;", "c", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lfi0/a;Ljava/lang/String;)V", "advanced-labs-join_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35945b {
    /* JADX INFO: renamed from: a */
    public static final void m114185a(InterfaceC14515a interfaceC14515a, String testCount) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(testCount, "testCount");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "change_test_count", null, "Bloodwork", testCount, m114186b(new C23465k[0]), 5, null);
    }

    /* JADX INFO: renamed from: b */
    private static final Map<String, Object> m114186b(C23465k... c23465kArr) {
        return AbstractC25247g0.m73995d0(AbstractC31061c.m95645u(HMSTrackSource.SCREEN, "ad_hoc"), AbstractC25247g0.m74002k0(c23465kArr));
    }

    /* JADX INFO: renamed from: c */
    public static final void m114187c(InterfaceC14515a interfaceC14515a, String source, String testCount) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(testCount, "testCount");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, null, "Bloodwork", testCount, m114186b(new C23465k("source", source)), 5, null);
    }
}
