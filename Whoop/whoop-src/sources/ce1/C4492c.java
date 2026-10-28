package ce1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lce1/c;", "", "", "activityV2Id", "activityName", "startTimeIso", "endTimeIso", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getStartTimeIso", "d", "getEndTimeIso", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4492c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String activityV2Id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String activityName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String startTimeIso;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String endTimeIso;

    public C4492c(String activityV2Id, String activityName, String str, String str2) {
        AbstractC22676k.m65750j(activityV2Id, "activityV2Id");
        AbstractC22676k.m65750j(activityName, "activityName");
        this.activityV2Id = activityV2Id;
        this.activityName = activityName;
        this.startTimeIso = str;
        this.endTimeIso = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivityV2Id() {
        return this.activityV2Id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4492c)) {
            return false;
        }
        C4492c c4492c = (C4492c) other;
        return AbstractC22676k.m65745e(this.activityV2Id, c4492c.activityV2Id) && AbstractC22676k.m65745e(this.activityName, c4492c.activityName) && AbstractC22676k.m65745e(this.startTimeIso, c4492c.startTimeIso) && AbstractC22676k.m65745e(this.endTimeIso, c4492c.endTimeIso);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.activityV2Id.hashCode() * 31, 31, this.activityName);
        String str = this.startTimeIso;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTimeIso;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.activityV2Id;
        String str2 = this.activityName;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("SelectedActivityInfo(activityV2Id=", str, ", activityName=", str2, ", startTimeIso="), this.startTimeIso, ", endTimeIso=", this.endTimeIso, ")");
    }
}
