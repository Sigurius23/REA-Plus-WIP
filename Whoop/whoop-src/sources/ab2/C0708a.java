package ab2;

import com.whoop.service.network.model.UserSessionDto;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: ab2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0017J+\u0010\u001a\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lab2/a;", "", "Lz82/b;", "analyticsManager", "<init>", "(Lz82/b;)V", "", "eventAction", "eventLabel", "eventCategory", "eventValue", "Ll83/a0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "action", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "index", "a", "(ILjava/lang/String;Ljava/lang/String;)V", "e", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "g", "actionSuffix", "b", "Lz82/b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0708a {

    /* JADX INFO: renamed from: c */
    public static final int f2690c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    public C0708a(InterfaceC40188b analyticsManager) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        this.analyticsManager = analyticsManager;
    }

    /* JADX INFO: renamed from: d */
    private final void m1769d(String eventAction, String eventLabel, String eventCategory, String eventValue) {
        this.analyticsManager.mo41426h(eventCategory, eventAction, eventLabel, "In App Banners", eventValue);
    }

    /* JADX INFO: renamed from: f */
    private final void m1770f(String eventCategory, String eventValue, String action) {
        this.analyticsManager.mo41426h(eventCategory, action, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "In App Banners", eventValue);
    }

    /* JADX INFO: renamed from: a */
    public final void m1771a(int index, String eventCategory, String eventValue) {
        AbstractC22676k.m65750j(eventCategory, "eventCategory");
        m1769d("Click", String.valueOf(index + 1), eventCategory, eventValue);
    }

    /* JADX INFO: renamed from: b */
    public final void m1772b(String eventCategory, String eventValue, String actionSuffix) {
        String strConcat;
        if (actionSuffix == null || (strConcat = " ".concat(actionSuffix)) == null) {
            strConcat = "";
        }
        m1770f(eventCategory, eventValue, "Click".concat(strConcat));
    }

    /* JADX INFO: renamed from: c */
    public final void m1773c(String eventCategory, String eventValue) {
        m1770f(eventCategory, eventValue, "Dismiss");
    }

    /* JADX INFO: renamed from: e */
    public final void m1774e(int index, String eventCategory, String eventValue) {
        AbstractC22676k.m65750j(eventCategory, "eventCategory");
        m1769d("Swipe", String.valueOf(index + 1), eventCategory, eventValue);
    }

    /* JADX INFO: renamed from: g */
    public final void m1775g(String eventCategory, String eventValue) {
        m1770f(eventCategory, eventValue, "Swipe");
    }
}
