package so1;

import com.mapbox.common.HttpHeaders;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.JournalToggleType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lso1/r;", "", "", HttpHeaders.DATE, "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "type", "<init>", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32834r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JournalToggleType type;

    public C32834r(String str, JournalToggleType journalToggleType) {
        this.date = str;
        this.type = journalToggleType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final JournalToggleType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32834r)) {
            return false;
        }
        C32834r c32834r = (C32834r) other;
        return AbstractC22676k.m65745e(this.date, c32834r.date) && this.type == c32834r.type;
    }

    public int hashCode() {
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JournalToggleType journalToggleType = this.type;
        return iHashCode + (journalToggleType != null ? journalToggleType.hashCode() : 0);
    }

    public String toString() {
        return "LogPeriodData(date=" + this.date + ", type=" + this.type + ")";
    }
}
