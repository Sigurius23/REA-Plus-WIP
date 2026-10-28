package jw0;

import com.whoop.core.details.network.model.sleep.SleepDetailsMetricModalsModel;
import com.whoop.core.details.network.model.sleep.SleepMetricBreakdownModel;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: jw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ljw0/a;", "", "", "title", "subtitle", "", "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;", "metrics", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;", "metricModals", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21983a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<SleepMetricBreakdownModel> metrics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<SleepDetailsMetricModalsModel> metricModals;

    public C21983a(String title, String subtitle, List<SleepMetricBreakdownModel> metrics, List<SleepDetailsMetricModalsModel> metricModals) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(metrics, "metrics");
        AbstractC22676k.m65750j(metricModals, "metricModals");
        this.title = title;
        this.subtitle = subtitle;
        this.metrics = metrics;
        this.metricModals = metricModals;
    }

    /* JADX INFO: renamed from: a */
    public final List<SleepDetailsMetricModalsModel> m62764a() {
        return this.metricModals;
    }

    /* JADX INFO: renamed from: b */
    public final List<SleepMetricBreakdownModel> m62765b() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21983a)) {
            return false;
        }
        C21983a c21983a = (C21983a) other;
        return AbstractC22676k.m65745e(this.title, c21983a.title) && AbstractC22676k.m65745e(this.subtitle, c21983a.subtitle) && AbstractC22676k.m65745e(this.metrics, c21983a.metrics) && AbstractC22676k.m65745e(this.metricModals, c21983a.metricModals);
    }

    public int hashCode() {
        return this.metricModals.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.metrics);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return AbstractC30007c.m91843m(AbstractC11895b.m32001t("KeyMetricsDomainState(title=", str, ", subtitle=", str2, ", metrics="), this.metrics, ", metricModals=", this.metricModals, ")");
    }
}
