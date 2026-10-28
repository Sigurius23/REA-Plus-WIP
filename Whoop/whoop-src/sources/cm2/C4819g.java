package cm2;

import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Date;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: cm2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b \u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b$\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b2\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b&\u0010:\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b(\u00105¨\u0006<"}, m65681d2 = {"Lcm2/g;", "", "Lorg/joda/time/LocalDateTime;", "initialDateTime", "Ljava/util/Date;", "startDate", "", "weight", "bodyFat", "leanBodyMass", "Lcm2/j;", "metricType", "Lcom/whoop/design/util/TextResource;", "leanBodyMassSuffix", "bodyFatSuffix", "Lcm2/n;", "replaceDialog", "", "source", "saveTitle", "deleteTitle", "<init>", "(Lorg/joda/time/LocalDateTime;Ljava/util/Date;DLjava/lang/Double;Ljava/lang/Double;Lcm2/j;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcm2/n;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "d", "()Lorg/joda/time/LocalDateTime;", "b", "Ljava/util/Date;", "j", "()Ljava/util/Date;", "c", "D", "k", "()D", "Ljava/lang/Double;", "()Ljava/lang/Double;", "e", "f", "Lcm2/j;", "()Lcm2/j;", "g", "Lcom/whoop/design/util/TextResource;", "getLeanBodyMassSuffix", "()Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lcm2/n;", "()Lcm2/n;", "Ljava/lang/String;", "l", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4819g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LocalDateTime initialDateTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Date startDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double weight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Double bodyFat;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Double leanBodyMass;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC4822j metricType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource leanBodyMassSuffix;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource bodyFatSuffix;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C4826n replaceDialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource saveTitle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource deleteTitle;

    public C4819g(LocalDateTime initialDateTime, Date startDate, double d3, Double d14, Double d15, EnumC4822j metricType, TextResource textResource, TextResource bodyFatSuffix, C4826n c4826n, String source, TextResource textResource2, TextResource textResource3) {
        AbstractC22676k.m65750j(initialDateTime, "initialDateTime");
        AbstractC22676k.m65750j(startDate, "startDate");
        AbstractC22676k.m65750j(metricType, "metricType");
        AbstractC22676k.m65750j(bodyFatSuffix, "bodyFatSuffix");
        AbstractC22676k.m65750j(source, "source");
        this.initialDateTime = initialDateTime;
        this.startDate = startDate;
        this.weight = d3;
        this.bodyFat = d14;
        this.leanBodyMass = d15;
        this.metricType = metricType;
        this.leanBodyMassSuffix = textResource;
        this.bodyFatSuffix = bodyFatSuffix;
        this.replaceDialog = c4826n;
        this.source = source;
        this.saveTitle = textResource2;
        this.deleteTitle = textResource3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getBodyFat() {
        return this.bodyFat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getBodyFatSuffix() {
        return this.bodyFatSuffix;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDeleteTitle() {
        return this.deleteTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDateTime getInitialDateTime() {
        return this.initialDateTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getLeanBodyMass() {
        return this.leanBodyMass;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4819g)) {
            return false;
        }
        C4819g c4819g = (C4819g) other;
        return AbstractC22676k.m65745e(this.initialDateTime, c4819g.initialDateTime) && AbstractC22676k.m65745e(this.startDate, c4819g.startDate) && Double.compare(this.weight, c4819g.weight) == 0 && AbstractC22676k.m65745e(this.bodyFat, c4819g.bodyFat) && AbstractC22676k.m65745e(this.leanBodyMass, c4819g.leanBodyMass) && this.metricType == c4819g.metricType && AbstractC22676k.m65745e(this.leanBodyMassSuffix, c4819g.leanBodyMassSuffix) && AbstractC22676k.m65745e(this.bodyFatSuffix, c4819g.bodyFatSuffix) && AbstractC22676k.m65745e(this.replaceDialog, c4819g.replaceDialog) && AbstractC22676k.m65745e(this.source, c4819g.source) && AbstractC22676k.m65745e(this.saveTitle, c4819g.saveTitle) && AbstractC22676k.m65745e(this.deleteTitle, c4819g.deleteTitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC4822j getMetricType() {
        return this.metricType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C4826n getReplaceDialog() {
        return this.replaceDialog;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSaveTitle() {
        return this.saveTitle;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC38963t7.m124373c(this.startDate, this.initialDateTime.hashCode() * 31, 31), 31, this.weight);
        Double d3 = this.bodyFat;
        int iHashCode = (iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.leanBodyMass;
        int iHashCode2 = (this.metricType.hashCode() + ((iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31)) * 31;
        TextResource textResource = this.leanBodyMassSuffix;
        int iM95625a = AbstractC31061c.m95625a((iHashCode2 + (textResource == null ? 0 : textResource.hashCode())) * 31, this.bodyFatSuffix, 31);
        C4826n c4826n = this.replaceDialog;
        int iM30450d = AbstractC11266d.m30450d((iM95625a + (c4826n == null ? 0 : c4826n.hashCode())) * 31, 31, this.source);
        TextResource textResource2 = this.saveTitle;
        int iHashCode3 = (iM30450d + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.deleteTitle;
        return iHashCode3 + (textResource3 != null ? textResource3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    public String toString() {
        return "ManualMeasurementViewState(initialDateTime=" + this.initialDateTime + ", startDate=" + this.startDate + ", weight=" + this.weight + ", bodyFat=" + this.bodyFat + ", leanBodyMass=" + this.leanBodyMass + ", metricType=" + this.metricType + ", leanBodyMassSuffix=" + this.leanBodyMassSuffix + ", bodyFatSuffix=" + this.bodyFatSuffix + ", replaceDialog=" + this.replaceDialog + ", source=" + this.source + ", saveTitle=" + this.saveTitle + ", deleteTitle=" + this.deleteTitle + ")";
    }
}
