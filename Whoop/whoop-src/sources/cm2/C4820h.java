package cm2;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: cm2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b!\u0010'R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b(\u0010\u0012¨\u0006-"}, m65681d2 = {"Lcm2/h;", "Lm91/u;", "", "id", "Lkd1/o;", "iconSource", "Lgz0/m0;", "iconBackup", "Lcom/whoop/design/util/TextResource;", "weight", "metricUnit", "subtitle", "Lcm2/g;", "weightDetailsScreen", "source", "<init>", "(Ljava/lang/String;Lkd1/o;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcm2/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lkd1/o;", "()Lkd1/o;", "c", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "e", "g", "Lcm2/g;", "()Lcm2/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4820h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o iconSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 iconBackup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource metricUnit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C4819g weightDetailsScreen;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String source;

    public C4820h(String id4, AbstractC22403o abstractC22403o, EnumC16313m0 iconBackup, TextResource weight, TextResource metricUnit, TextResource subtitle, C4819g c4819g, String source) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(iconBackup, "iconBackup");
        AbstractC22676k.m65750j(weight, "weight");
        AbstractC22676k.m65750j(metricUnit, "metricUnit");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(source, "source");
        this.id = id4;
        this.iconSource = abstractC22403o;
        this.iconBackup = iconBackup;
        this.weight = weight;
        this.metricUnit = metricUnit;
        this.subtitle = subtitle;
        this.weightDetailsScreen = c4819g;
        this.source = source;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIconBackup() {
        return this.iconBackup;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getIconSource() {
        return this.iconSource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getMetricUnit() {
        return this.metricUnit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4820h)) {
            return false;
        }
        C4820h c4820h = (C4820h) other;
        return AbstractC22676k.m65745e(this.id, c4820h.id) && AbstractC22676k.m65745e(this.iconSource, c4820h.iconSource) && this.iconBackup == c4820h.iconBackup && AbstractC22676k.m65745e(this.weight, c4820h.weight) && AbstractC22676k.m65745e(this.metricUnit, c4820h.metricUnit) && AbstractC22676k.m65745e(this.subtitle, c4820h.subtitle) && AbstractC22676k.m65745e(this.weightDetailsScreen, c4820h.weightDetailsScreen) && AbstractC22676k.m65745e(this.source, c4820h.source);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C4819g getWeightDetailsScreen() {
        return this.weightDetailsScreen;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        AbstractC22403o abstractC22403o = this.iconSource;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC17176i.m48500b(this.iconBackup, (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31), this.weight, 31), this.metricUnit, 31), this.subtitle, 31);
        C4819g c4819g = this.weightDetailsScreen;
        return this.source.hashCode() + ((iM95625a + (c4819g != null ? c4819g.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        AbstractC22403o abstractC22403o = this.iconSource;
        EnumC16313m0 enumC16313m0 = this.iconBackup;
        TextResource textResource = this.weight;
        TextResource textResource2 = this.metricUnit;
        TextResource textResource3 = this.subtitle;
        C4819g c4819g = this.weightDetailsScreen;
        String str2 = this.source;
        StringBuilder sb4 = new StringBuilder("MeasurementBoxViewState(id=");
        sb4.append(str);
        sb4.append(", iconSource=");
        sb4.append(abstractC22403o);
        sb4.append(", iconBackup=");
        sb4.append(enumC16313m0);
        sb4.append(", weight=");
        sb4.append(textResource);
        sb4.append(", metricUnit=");
        AbstractC30007c.m91855y(sb4, textResource2, ", subtitle=", textResource3, ", weightDetailsScreen=");
        sb4.append(c4819g);
        sb4.append(", source=");
        sb4.append(str2);
        sb4.append(")");
        return sb4.toString();
    }
}
