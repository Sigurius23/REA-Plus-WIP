package kq2;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kq2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lkq2/a;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "", "action", "screenName", "Ll83/a0;", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "f", "d", "", "year", "c", "(I)V", "", "isCorrect", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lfi0/a;", "b", "Z", "wirAnalytics", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22775a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean wirAnalytics;

    public C22775a(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m65982b(C22775a c22775a, String str, String str2, Boolean bool, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            bool = null;
        }
        c22775a.m65986a(str, str2, bool);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m65983e(C22775a c22775a, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        c22775a.m65988d(str, str2);
    }

    /* JADX INFO: renamed from: f */
    private final void m65984f(String action, String screenName) {
        InterfaceC14515a interfaceC14515a = this.baseAnalytics;
        if (screenName == null) {
            screenName = "Onboarding";
        }
        interfaceC14515a.mo41424f(screenName, action, null, "Onboarding Week In Review");
    }

    /* JADX INFO: renamed from: g */
    private final void m65985g(String action, String screenName) {
        this.baseAnalytics.mo41424f(screenName, action, "Year in Review 2024", "Year in Review");
    }

    /* JADX INFO: renamed from: a */
    public final void m65986a(String screenName, String action, Boolean isCorrect) {
        String str;
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(action, "action");
        InterfaceC14515a interfaceC14515a = this.baseAnalytics;
        if (isCorrect != null) {
            str = isCorrect.booleanValue() ? "Correct" : "Incorrect";
        } else {
            str = null;
        }
        interfaceC14515a.mo41426h(screenName, action, "Year in Review 2024", "Quiz", str);
    }

    /* JADX INFO: renamed from: c */
    public final void m65987c(int year) {
        this.wirAnalytics = year == -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m65988d(String action, String screenName) {
        AbstractC22676k.m65750j(action, "action");
        if (this.wirAnalytics) {
            m65984f(action, screenName);
        } else {
            m65985g(action, screenName);
        }
    }
}
