package ph0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ph0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lph0/b;", "", "", "sourceId", "sourceContextType", "activityType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29234b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String sourceContextType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String activityType;

    public C29234b(String sourceId, String sourceContextType, String activityType) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(sourceContextType, "sourceContextType");
        AbstractC22676k.m65750j(activityType, "activityType");
        this.sourceId = sourceId;
        this.sourceContextType = sourceContextType;
        this.activityType = activityType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSourceContextType() {
        return this.sourceContextType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29234b)) {
            return false;
        }
        C29234b c29234b = (C29234b) other;
        return AbstractC22676k.m65745e(this.sourceId, c29234b.sourceId) && AbstractC22676k.m65745e(this.sourceContextType, c29234b.sourceContextType) && AbstractC22676k.m65745e(this.activityType, c29234b.activityType);
    }

    public int hashCode() {
        return this.activityType.hashCode() + AbstractC11266d.m30450d(this.sourceId.hashCode() * 31, 31, this.sourceContextType);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.activityType, ")", AbstractC11895b.m32001t("AiInsightsScreenArgs(sourceId=", this.sourceId, ", sourceContextType=", this.sourceContextType, ", activityType="));
    }
}
