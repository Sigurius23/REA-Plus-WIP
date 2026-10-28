package f41;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lf41/a;", "", "Lcom/whoop/design/util/TextResource;", "bottomSheetTitle", "impactTitle", "description", "metricsTagTitle", "", "Lhy0/h1;", "metricTags", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14063a {

    /* JADX INFO: renamed from: f */
    public static final int f50430f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource bottomSheetTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource impactTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource metricsTagTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C17750h1> metricTags;

    public C14063a(TextResource bottomSheetTitle, TextResource impactTitle, TextResource description, TextResource metricsTagTitle, List<C17750h1> metricTags) {
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
    public final TextResource getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getImpactTitle() {
        return this.impactTitle;
    }

    /* JADX INFO: renamed from: d */
    public final List<C17750h1> m40024d() {
        return this.metricTags;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getMetricsTagTitle() {
        return this.metricsTagTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14063a)) {
            return false;
        }
        C14063a c14063a = (C14063a) other;
        return AbstractC22676k.m65745e(this.bottomSheetTitle, c14063a.bottomSheetTitle) && AbstractC22676k.m65745e(this.impactTitle, c14063a.impactTitle) && AbstractC22676k.m65745e(this.description, c14063a.description) && AbstractC22676k.m65745e(this.metricsTagTitle, c14063a.metricsTagTitle) && AbstractC22676k.m65745e(this.metricTags, c14063a.metricTags);
    }

    public int hashCode() {
        return this.metricTags.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.bottomSheetTitle.hashCode() * 31, this.impactTitle, 31), this.description, 31), this.metricsTagTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.bottomSheetTitle;
        TextResource textResource2 = this.impactTitle;
        TextResource textResource3 = this.description;
        TextResource textResource4 = this.metricsTagTitle;
        List<C17750h1> list = this.metricTags;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BottomSheetInfoViewState(bottomSheetTitle=", textResource, ", impactTitle=", textResource2, ", description=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", metricsTagTitle=", textResource4, ", metricTags=");
        return AbstractC3855a.m11829m(sbM106658q, list, ")");
    }
}
