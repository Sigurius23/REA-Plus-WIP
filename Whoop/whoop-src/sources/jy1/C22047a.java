package jy1;

import com.whoop.metrics.domain.models.MetricPostType;
import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, m65681d2 = {"Ljy1/a;", "", "", "id", "", "name", "", "value", "", "tags", "Lcom/whoop/metrics/domain/models/MetricPostType;", "metricType", "<init>", "(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;)V", "a", "(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;)Ljy1/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Ljava/lang/String;", "e", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/whoop/metrics/domain/models/MetricPostType;", "()Lcom/whoop/metrics/domain/models/MetricPostType;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22047a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Double value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> tags;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final MetricPostType metricType;

    public C22047a(int i13, String name, Double d3, List<String> tags, MetricPostType metricPostType) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(tags, "tags");
        this.id = i13;
        this.name = name;
        this.value = d3;
        this.tags = tags;
        this.metricType = metricPostType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22047a m63100b(C22047a c22047a, int i13, String str, Double d3, List list, MetricPostType metricPostType, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c22047a.id;
        }
        if ((i14 & 2) != 0) {
            str = c22047a.name;
        }
        if ((i14 & 4) != 0) {
            d3 = c22047a.value;
        }
        if ((i14 & 8) != 0) {
            list = c22047a.tags;
        }
        if ((i14 & 16) != 0) {
            metricPostType = c22047a.metricType;
        }
        MetricPostType metricPostType2 = metricPostType;
        Double d14 = d3;
        return c22047a.m63101a(i13, str, d14, list, metricPostType2);
    }

    /* JADX INFO: renamed from: a */
    public final C22047a m63101a(int id4, String name, Double value, List<String> tags, MetricPostType metricType) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(tags, "tags");
        return new C22047a(id4, name, value, tags, metricType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MetricPostType getMetricType() {
        return this.metricType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22047a)) {
            return false;
        }
        C22047a c22047a = (C22047a) other;
        return this.id == c22047a.id && AbstractC22676k.m65745e(this.name, c22047a.name) && AbstractC22676k.m65745e(this.value, c22047a.value) && AbstractC22676k.m65745e(this.tags, c22047a.tags) && this.metricType == c22047a.metricType;
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m63105f() {
        return this.tags;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.name);
        Double d3 = this.value;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (d3 == null ? 0 : d3.hashCode())) * 31, 31, this.tags);
        MetricPostType metricPostType = this.metricType;
        return iM31983b + (metricPostType != null ? metricPostType.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.name;
        Double d3 = this.value;
        List<String> list = this.tags;
        MetricPostType metricPostType = this.metricType;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "Metric(id=", ", name=", str, ", value=");
        sbM53373n.append(d3);
        sbM53373n.append(", tags=");
        sbM53373n.append(list);
        sbM53373n.append(", metricType=");
        sbM53373n.append(metricPostType);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public /* synthetic */ C22047a(int i13, String str, Double d3, List list, MetricPostType metricPostType, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, str, (i14 & 4) != 0 ? null : d3, list, (i14 & 16) != 0 ? null : metricPostType);
    }
}
