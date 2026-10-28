package dw0;

import hw0.EnumC17696a;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ldw0/a;", "", "", "newHome", "", "entryPoint", "activityId", "Lhw0/a;", "activityType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lhw0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "Lhw0/a;", "()Lhw0/a;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12402a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean newHome;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String entryPoint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String activityId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC17696a activityType;

    public C12402a(boolean z4, String entryPoint, String activityId, EnumC17696a activityType) {
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(activityType, "activityType");
        this.newHome = z4;
        this.entryPoint = entryPoint;
        this.activityId = activityId;
        this.activityType = activityType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC17696a getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNewHome() {
        return this.newHome;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12402a)) {
            return false;
        }
        C12402a c12402a = (C12402a) other;
        return this.newHome == c12402a.newHome && AbstractC22676k.m65745e(this.entryPoint, c12402a.entryPoint) && AbstractC22676k.m65745e(this.activityId, c12402a.activityId) && this.activityType == c12402a.activityType;
    }

    public int hashCode() {
        return this.activityType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.newHome) * 31, 31, this.entryPoint), 31, this.activityId);
    }

    public String toString() {
        boolean z4 = this.newHome;
        String str = this.entryPoint;
        String str2 = this.activityId;
        EnumC17696a enumC17696a = this.activityType;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("BaseInfo(newHome=", ", entryPoint=", str, ", activityId=", z4);
        sbM38567n.append(str2);
        sbM38567n.append(", activityType=");
        sbM38567n.append(enumC17696a);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }
}
