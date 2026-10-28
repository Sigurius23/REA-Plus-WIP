package px0;

import c13.AbstractC3855a;
import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: px0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Lpx0/d;", "", "", "screenName", "navigationStyle", "", "Lpx0/f;", "stackGroups", "rootDestination", "logLines", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getNavigationStyle", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "getRootDestination", "e", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29594d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String screenName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String navigationStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C29596f> stackGroups;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String rootDestination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> logLines;

    public C29594d(String screenName, String navigationStyle, List<C29596f> stackGroups, String rootDestination, List<String> logLines) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(navigationStyle, "navigationStyle");
        AbstractC22676k.m65750j(stackGroups, "stackGroups");
        AbstractC22676k.m65750j(rootDestination, "rootDestination");
        AbstractC22676k.m65750j(logLines, "logLines");
        this.screenName = screenName;
        this.navigationStyle = navigationStyle;
        this.stackGroups = stackGroups;
        this.rootDestination = rootDestination;
        this.logLines = logLines;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m90766a() {
        return this.logLines;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX INFO: renamed from: c */
    public final List<C29596f> m90768c() {
        return this.stackGroups;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29594d)) {
            return false;
        }
        C29594d c29594d = (C29594d) other;
        return AbstractC22676k.m65745e(this.screenName, c29594d.screenName) && AbstractC22676k.m65745e(this.navigationStyle, c29594d.navigationStyle) && AbstractC22676k.m65745e(this.stackGroups, c29594d.stackGroups) && AbstractC22676k.m65745e(this.rootDestination, c29594d.rootDestination) && AbstractC22676k.m65745e(this.logLines, c29594d.logLines);
    }

    public int hashCode() {
        return this.logLines.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.screenName.hashCode() * 31, 31, this.navigationStyle), 31, this.stackGroups), 31, this.rootDestination);
    }

    public String toString() {
        String str = this.screenName;
        String str2 = this.navigationStyle;
        List<C29596f> list = this.stackGroups;
        String str3 = this.rootDestination;
        List<String> list2 = this.logLines;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DismissalPlaygroundState(screenName=", str, ", navigationStyle=", str2, ", stackGroups=");
        AbstractC17176i.m48511m(", rootDestination=", str3, ", logLines=", sbM32001t, list);
        return AbstractC3855a.m11829m(sbM32001t, list2, ")");
    }
}
