package c41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.h2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lc41/h2;", "", "Lcom/whoop/design/util/TextResource;", "startTitle", "endTitle", "Lgz0/m0;", "icon", "Lc41/w3;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lc41/w3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lc41/w3;", "()Lc41/w3;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4036h2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource startTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource endTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC4142w3 status;

    public C4036h2(TextResource textResource, TextResource textResource2, EnumC16313m0 icon, EnumC4142w3 status) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(status, "status");
        this.startTitle = textResource;
        this.endTitle = textResource2;
        this.icon = icon;
        this.status = status;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getEndTitle() {
        return this.endTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getStartTitle() {
        return this.startTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC4142w3 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4036h2)) {
            return false;
        }
        C4036h2 c4036h2 = (C4036h2) other;
        return AbstractC22676k.m65745e(this.startTitle, c4036h2.startTitle) && AbstractC22676k.m65745e(this.endTitle, c4036h2.endTitle) && this.icon == c4036h2.icon && this.status == c4036h2.status;
    }

    public int hashCode() {
        TextResource textResource = this.startTitle;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.endTitle;
        return this.status.hashCode() + AbstractC17176i.m48500b(this.icon, (iHashCode + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.startTitle;
        TextResource textResource2 = this.endTitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC4142w3 enumC4142w3 = this.status;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HorizontalFooterMetricTileState(startTitle=", textResource, ", endTitle=", textResource2, ", icon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", status=");
        sbM106658q.append(enumC4142w3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
