package k60;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k60.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lfi0/a;", "", "source", "", "analyticsProperties", "Ll83/a0;", "a", "(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V", "achievements_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22227c {
    /* JADX INFO: renamed from: a */
    public static final void m63726a(InterfaceC14515a interfaceC14515a, String source, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, "achievement details", ProfileAnalyticsKt.VIEW, null, "Achievements", null, AbstractC25247g0.m73995d0(analyticsProperties, AbstractC25247g0.m73989X(new C23465k("source", source))), 20, null);
    }
}
