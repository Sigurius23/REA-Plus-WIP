package ch1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ch1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "source", "", "analyticsProperties", "", "Ll83/k;", "", "additionalProperties", "a", "(Ljava/lang/String;Ljava/util/Map;[Ll83/k;)Ljava/util/Map;", "Lfi0/a;", "Ll83/a0;", "c", "(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V", "buttonId", "b", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4667c {
    /* JADX INFO: renamed from: a */
    private static final Map<String, Object> m14735a(String str, Map<String, String> map, C23465k... c23465kArr) {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("source", str));
        linkedHashMapM73993b0.putAll(map);
        return AbstractC25247g0.m73995d0(linkedHashMapM73993b0, AbstractC25247g0.m74002k0(c23465kArr));
    }

    /* JADX INFO: renamed from: b */
    public static final void m14736b(InterfaceC14515a interfaceC14515a, String source, String buttonId, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(buttonId, "buttonId");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", null, "Mobile Gift", buttonId, m14735a(source, analyticsProperties, new C23465k[0]), 5, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m14737c(InterfaceC14515a interfaceC14515a, String source, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, null, "Mobile Gift", null, m14735a(source, analyticsProperties, new C23465k[0]), 21, null);
    }
}
