package m72;

import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m72.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lm72/j;", "", "Lgz0/m0;", "icon", "", "title", "statDisplay", "statUnitDisplay", "<init>", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Ljava/lang/String;", "d", "c", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25211j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String statDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String statUnitDisplay;

    public C25211j(EnumC16313m0 icon, String title, String statDisplay, String statUnitDisplay) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(statDisplay, "statDisplay");
        AbstractC22676k.m65750j(statUnitDisplay, "statUnitDisplay");
        this.icon = icon;
        this.title = title;
        this.statDisplay = statDisplay;
        this.statUnitDisplay = statUnitDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStatDisplay() {
        return this.statDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatUnitDisplay() {
        return this.statUnitDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25211j)) {
            return false;
        }
        C25211j c25211j = (C25211j) other;
        return this.icon == c25211j.icon && AbstractC22676k.m65745e(this.title, c25211j.title) && AbstractC22676k.m65745e(this.statDisplay, c25211j.statDisplay) && AbstractC22676k.m65745e(this.statUnitDisplay, c25211j.statUnitDisplay);
    }

    public int hashCode() {
        return this.statUnitDisplay.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title), 31, this.statDisplay);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.title;
        String str2 = this.statDisplay;
        String str3 = this.statUnitDisplay;
        StringBuilder sb4 = new StringBuilder("StudyInsightsMetricViewState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", statDisplay=");
        return AbstractC11266d.m30464r(sb4, str2, ", statUnitDisplay=", str3, ")");
    }
}
