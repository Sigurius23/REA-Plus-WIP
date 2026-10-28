package n11;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: n11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, m65681d2 = {"Ln11/b;", "Lm91/u;", "", "achievementIconRes", "Ln11/c;", "recordTitle", "recordSubtitle", "", "recordDate", "<init>", "(Ljava/lang/Integer;Ln11/c;Ln11/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ln11/c;", "e", "()Ln11/c;", "c", "d", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26162b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer achievementIconRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26163c recordTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26163c recordSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String recordDate;

    public C26162b(Integer num, C26163c recordTitle, C26163c c26163c, String recordDate) {
        AbstractC22676k.m65750j(recordTitle, "recordTitle");
        AbstractC22676k.m65750j(recordDate, "recordDate");
        this.achievementIconRes = num;
        this.recordTitle = recordTitle;
        this.recordSubtitle = c26163c;
        this.recordDate = recordDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAchievementIconRes() {
        return this.achievementIconRes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRecordDate() {
        return this.recordDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C26163c getRecordSubtitle() {
        return this.recordSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C26163c getRecordTitle() {
        return this.recordTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26162b)) {
            return false;
        }
        C26162b c26162b = (C26162b) other;
        return AbstractC22676k.m65745e(this.achievementIconRes, c26162b.achievementIconRes) && AbstractC22676k.m65745e(this.recordTitle, c26162b.recordTitle) && AbstractC22676k.m65745e(this.recordSubtitle, c26162b.recordSubtitle) && AbstractC22676k.m65745e(this.recordDate, c26162b.recordDate);
    }

    public int hashCode() {
        Integer num = this.achievementIconRes;
        int iHashCode = (this.recordTitle.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        C26163c c26163c = this.recordSubtitle;
        return this.recordDate.hashCode() + ((iHashCode + (c26163c != null ? c26163c.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ExerciseRecordHeaderViewState(achievementIconRes=" + this.achievementIconRes + ", recordTitle=" + this.recordTitle + ", recordSubtitle=" + this.recordSubtitle + ", recordDate=" + this.recordDate + ")";
    }
}
