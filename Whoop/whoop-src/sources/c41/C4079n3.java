package c41;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c41.n3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lc41/n3;", "", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "metricIcon", "statusIcon", "Lc41/w3;", "metricStatus", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Lc41/w3;", "()Lc41/w3;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4079n3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 metricIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 statusIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC4142w3 metricStatus;

    public C4079n3(TextResource title, EnumC16313m0 metricIcon, EnumC16313m0 statusIcon, EnumC4142w3 metricStatus) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metricIcon, "metricIcon");
        AbstractC22676k.m65750j(statusIcon, "statusIcon");
        AbstractC22676k.m65750j(metricStatus, "metricStatus");
        this.title = title;
        this.metricIcon = metricIcon;
        this.statusIcon = statusIcon;
        this.metricStatus = metricStatus;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getMetricIcon() {
        return this.metricIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC4142w3 getMetricStatus() {
        return this.metricStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getStatusIcon() {
        return this.statusIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4079n3)) {
            return false;
        }
        C4079n3 c4079n3 = (C4079n3) other;
        return AbstractC22676k.m65745e(this.title, c4079n3.title) && this.metricIcon == c4079n3.metricIcon && this.statusIcon == c4079n3.statusIcon && this.metricStatus == c4079n3.metricStatus;
    }

    public int hashCode() {
        return this.metricStatus.hashCode() + AbstractC17176i.m48500b(this.statusIcon, AbstractC17176i.m48500b(this.metricIcon, this.title.hashCode() * 31, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.metricIcon;
        EnumC16313m0 enumC16313m1 = this.statusIcon;
        EnumC4142w3 enumC4142w3 = this.metricStatus;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("MonitorMetricViewState(title=", textResource, ", metricIcon=", enumC16313m0, ", statusIcon=");
        sbM61140k.append(enumC16313m1);
        sbM61140k.append(", metricStatus=");
        sbM61140k.append(enumC4142w3);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
