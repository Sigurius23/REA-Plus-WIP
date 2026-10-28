package ln1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ln1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lln1/d;", "Lm91/u;", "", "metricId", "", "showSelectionHighlight", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Ljava/lang/String;ZLgz0/m0;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24526d implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f95686e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String metricId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showSelectionHighlight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    public C24526d(String metricId, boolean z4, EnumC16313m0 icon, TextResource title) {
        AbstractC22676k.m65750j(metricId, "metricId");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        this.metricId = metricId;
        this.showSelectionHighlight = z4;
        this.icon = icon;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMetricId() {
        return this.metricId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowSelectionHighlight() {
        return this.showSelectionHighlight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24526d)) {
            return false;
        }
        C24526d c24526d = (C24526d) other;
        return AbstractC22676k.m65745e(this.metricId, c24526d.metricId) && this.showSelectionHighlight == c24526d.showSelectionHighlight && this.icon == c24526d.icon && AbstractC22676k.m65745e(this.title, c24526d.title);
    }

    public int hashCode() {
        return this.title.hashCode() + AbstractC17176i.m48500b(this.icon, AbstractC2875y.m8289b(this.metricId.hashCode() * 31, 31, this.showSelectionHighlight), 31);
    }

    public String toString() {
        String str = this.metricId;
        boolean z4 = this.showSelectionHighlight;
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.title;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("CustomizeMetricTileState(metricId=", str, ", showSelectionHighlight=", ", icon=", z4);
        sbM73379l.append(enumC16313m0);
        sbM73379l.append(", title=");
        sbM73379l.append(textResource);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
