package ur1;

import com.whoop.data.remote.domain.dto.JournalDayInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ur1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lur1/d;", "", "", "title", "Lcom/whoop/data/remote/domain/dto/JournalDayInfo;", "nextDay", "previousDay", "", "isLoading", "<init>", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)V", "a", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)Lur1/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcom/whoop/data/remote/domain/dto/JournalDayInfo;", "c", "()Lcom/whoop/data/remote/domain/dto/JournalDayInfo;", "d", "Z", "f", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35187d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JournalDayInfo nextDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final JournalDayInfo previousDay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isLoading;

    public C35187d(String title, JournalDayInfo journalDayInfo, JournalDayInfo journalDayInfo2, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.nextDay = journalDayInfo;
        this.previousDay = journalDayInfo2;
        this.isLoading = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35187d m111394b(C35187d c35187d, String str, JournalDayInfo journalDayInfo, JournalDayInfo journalDayInfo2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c35187d.title;
        }
        if ((i13 & 2) != 0) {
            journalDayInfo = c35187d.nextDay;
        }
        if ((i13 & 4) != 0) {
            journalDayInfo2 = c35187d.previousDay;
        }
        if ((i13 & 8) != 0) {
            z4 = c35187d.isLoading;
        }
        return c35187d.m111395a(str, journalDayInfo, journalDayInfo2, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C35187d m111395a(String title, JournalDayInfo nextDay, JournalDayInfo previousDay, boolean isLoading) {
        AbstractC22676k.m65750j(title, "title");
        return new C35187d(title, nextDay, previousDay, isLoading);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JournalDayInfo getNextDay() {
        return this.nextDay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JournalDayInfo getPreviousDay() {
        return this.previousDay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35187d)) {
            return false;
        }
        C35187d c35187d = (C35187d) other;
        return AbstractC22676k.m65745e(this.title, c35187d.title) && AbstractC22676k.m65745e(this.nextDay, c35187d.nextDay) && AbstractC22676k.m65745e(this.previousDay, c35187d.previousDay) && this.isLoading == c35187d.isLoading;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        JournalDayInfo journalDayInfo = this.nextDay;
        int iHashCode2 = (iHashCode + (journalDayInfo == null ? 0 : journalDayInfo.hashCode())) * 31;
        JournalDayInfo journalDayInfo2 = this.previousDay;
        return Boolean.hashCode(this.isLoading) + ((iHashCode2 + (journalDayInfo2 != null ? journalDayInfo2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "DatePickerDomainState(title=" + this.title + ", nextDay=" + this.nextDay + ", previousDay=" + this.previousDay + ", isLoading=" + this.isLoading + ")";
    }

    public /* synthetic */ C35187d(String str, JournalDayInfo journalDayInfo, JournalDayInfo journalDayInfo2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, journalDayInfo, journalDayInfo2, (i13 & 8) != 0 ? false : z4);
    }
}
