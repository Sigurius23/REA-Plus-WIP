package bm2;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bm2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'¨\u0006("}, m65681d2 = {"Lbm2/n;", "Lm91/u;", "", "id", "Lgz0/m0;", "iconSource", "iconUrl", "Lcom/whoop/design/util/TextResource;", "measurementValue", "metricUnit", "subtitle", "menuSheet", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lm91/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "getIconUrl", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "e", "f", "g", "Lm91/u;", "()Lm91/u;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3462n implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 iconSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource measurementValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource metricUnit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC25312u menuSheet;

    public C3462n(String id4, EnumC16313m0 iconSource, String str, TextResource measurementValue, TextResource metricUnit, TextResource subtitle, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(iconSource, "iconSource");
        AbstractC22676k.m65750j(measurementValue, "measurementValue");
        AbstractC22676k.m65750j(metricUnit, "metricUnit");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.iconSource = iconSource;
        this.iconUrl = str;
        this.measurementValue = measurementValue;
        this.metricUnit = metricUnit;
        this.subtitle = subtitle;
        this.menuSheet = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIconSource() {
        return this.iconSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getMeasurementValue() {
        return this.measurementValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getMenuSheet() {
        return this.menuSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getMetricUnit() {
        return this.metricUnit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3462n)) {
            return false;
        }
        C3462n c3462n = (C3462n) other;
        return AbstractC22676k.m65745e(this.id, c3462n.id) && this.iconSource == c3462n.iconSource && AbstractC22676k.m65745e(this.iconUrl, c3462n.iconUrl) && AbstractC22676k.m65745e(this.measurementValue, c3462n.measurementValue) && AbstractC22676k.m65745e(this.metricUnit, c3462n.metricUnit) && AbstractC22676k.m65745e(this.subtitle, c3462n.subtitle) && AbstractC22676k.m65745e(this.menuSheet, c3462n.menuSheet);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.iconSource, this.id.hashCode() * 31, 31);
        String str = this.iconUrl;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM48500b + (str == null ? 0 : str.hashCode())) * 31, this.measurementValue, 31), this.metricUnit, 31), this.subtitle, 31);
        InterfaceC25312u interfaceC25312u = this.menuSheet;
        return iM95625a + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        EnumC16313m0 enumC16313m0 = this.iconSource;
        String str2 = this.iconUrl;
        TextResource textResource = this.measurementValue;
        TextResource textResource2 = this.metricUnit;
        TextResource textResource3 = this.subtitle;
        InterfaceC25312u interfaceC25312u = this.menuSheet;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("GenericMeasurementViewState(id=", str, ", iconSource=", enumC16313m0, ", iconUrl=");
        AbstractC30007c.m91826A(sbM61141l, str2, ", measurementValue=", textResource, ", metricUnit=");
        AbstractC30007c.m91855y(sbM61141l, textResource2, ", subtitle=", textResource3, ", menuSheet=");
        sbM61141l.append(interfaceC25312u);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }
}
