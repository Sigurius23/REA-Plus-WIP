package jh1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jh1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001am\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0011\u0010\u0010\u001a?\u0010\u0012\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"", "screenName", "source", "", "analyticsProperties", "", "Ll83/k;", "", "additionalProperties", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[Ll83/k;)Ljava/util/Map;", "Lfi0/a;", "giftType", "numberOfTests", "Ll83/a0;", "d", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "a", "b", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21698c {
    /* JADX INFO: renamed from: a */
    public static final void m61114a(InterfaceC14515a interfaceC14515a, String source, String giftType, String numberOfTests, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(numberOfTests, "numberOfTests");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "toggle", null, "Mobile Gift", numberOfTests, m61116c(giftType, source, analyticsProperties, new C23465k[0]), 5, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m61115b(InterfaceC14515a interfaceC14515a, String source, String giftType, String numberOfTests, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(numberOfTests, "numberOfTests");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click_to_checkout", null, "Mobile Gift", numberOfTests, m61116c(giftType, source, analyticsProperties, new C23465k[0]), 5, null);
    }

    /* JADX INFO: renamed from: c */
    private static final Map<String, Object> m61116c(String str, String str2, Map<String, String> map, C23465k... c23465kArr) {
        return AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k(HMSTrackSource.SCREEN, str), new C23465k("source", str2)), map), AbstractC25247g0.m74002k0(c23465kArr));
    }

    /* JADX INFO: renamed from: d */
    public static final void m61117d(InterfaceC14515a interfaceC14515a, String source, String giftType, String numberOfTests, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(numberOfTests, "numberOfTests");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, null, "Mobile Gift", numberOfTests, m61116c(giftType, source, analyticsProperties, new C23465k[0]), 5, null);
    }
}
