package c41;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: c41.o1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lc41/o1;", "", "Lcom/whoop/analytics/AnalyticEventModel;", ProfileAnalyticsKt.VIEW, "cta", "dismiss", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/analytics/AnalyticEventModel;", "c", "()Lcom/whoop/analytics/AnalyticEventModel;", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4084o1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AnalyticEventModel view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AnalyticEventModel cta;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AnalyticEventModel dismiss;

    public C4084o1(AnalyticEventModel analyticEventModel, AnalyticEventModel analyticEventModel2, AnalyticEventModel analyticEventModel3) {
        this.view = analyticEventModel;
        this.cta = analyticEventModel2;
        this.dismiss = analyticEventModel3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnalyticEventModel getDismiss() {
        return this.dismiss;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AnalyticEventModel getView() {
        return this.view;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4084o1)) {
            return false;
        }
        C4084o1 c4084o1 = (C4084o1) other;
        return AbstractC22676k.m65745e(this.view, c4084o1.view) && AbstractC22676k.m65745e(this.cta, c4084o1.cta) && AbstractC22676k.m65745e(this.dismiss, c4084o1.dismiss);
    }

    public int hashCode() {
        AnalyticEventModel analyticEventModel = this.view;
        int iHashCode = (analyticEventModel == null ? 0 : analyticEventModel.hashCode()) * 31;
        AnalyticEventModel analyticEventModel2 = this.cta;
        int iHashCode2 = (iHashCode + (analyticEventModel2 == null ? 0 : analyticEventModel2.hashCode())) * 31;
        AnalyticEventModel analyticEventModel3 = this.dismiss;
        return iHashCode2 + (analyticEventModel3 != null ? analyticEventModel3.hashCode() : 0);
    }

    public String toString() {
        AnalyticEventModel analyticEventModel = this.view;
        AnalyticEventModel analyticEventModel2 = this.cta;
        AnalyticEventModel analyticEventModel3 = this.dismiss;
        StringBuilder sb4 = new StringBuilder("EntryPointTileAnalyticEvents(view=");
        sb4.append(analyticEventModel);
        sb4.append(", cta=");
        sb4.append(analyticEventModel2);
        sb4.append(", dismiss=");
        return AbstractC38963t7.m124378h(sb4, analyticEventModel3, ")");
    }
}
