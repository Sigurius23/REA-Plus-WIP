package sw0;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lsw0/a;", "", "", "bottomSheetTitle", "impactTitle", "description", "metricsTagTitle", "", "metricTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33044a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String bottomSheetTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String impactTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String metricsTagTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> metricTags;

    public C33044a(String bottomSheetTitle, String impactTitle, String description, String metricsTagTitle, List<String> metricTags) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(impactTitle, "impactTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(metricsTagTitle, "metricsTagTitle");
        AbstractC22676k.m65750j(metricTags, "metricTags");
        this.bottomSheetTitle = bottomSheetTitle;
        this.impactTitle = impactTitle;
        this.description = description;
        this.metricsTagTitle = metricsTagTitle;
        this.metricTags = metricTags;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImpactTitle() {
        return this.impactTitle;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m104587d() {
        return this.metricTags;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMetricsTagTitle() {
        return this.metricsTagTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33044a)) {
            return false;
        }
        C33044a c33044a = (C33044a) other;
        return AbstractC22676k.m65745e(this.bottomSheetTitle, c33044a.bottomSheetTitle) && AbstractC22676k.m65745e(this.impactTitle, c33044a.impactTitle) && AbstractC22676k.m65745e(this.description, c33044a.description) && AbstractC22676k.m65745e(this.metricsTagTitle, c33044a.metricsTagTitle) && AbstractC22676k.m65745e(this.metricTags, c33044a.metricTags);
    }

    public int hashCode() {
        return this.metricTags.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.bottomSheetTitle.hashCode() * 31, 31, this.impactTitle), 31, this.description), 31, this.metricsTagTitle);
    }

    public String toString() {
        String str = this.bottomSheetTitle;
        String str2 = this.impactTitle;
        String str3 = this.description;
        String str4 = this.metricsTagTitle;
        List<String> list = this.metricTags;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BottomSheetInfoDomainState(bottomSheetTitle=", str, ", impactTitle=", str2, ", description=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", metricsTagTitle=", str4, ", metricTags=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }
}
