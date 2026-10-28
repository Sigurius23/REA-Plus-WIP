package hq0;

import com.whoop.domain.model.teams.LeadersEntry;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: hq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, m65681d2 = {"Lhq0/a;", "", "", "average", "", "Lcom/whoop/domain/model/teams/LeadersEntry;", "entries", "", "lastUpdated", "", "totalCount", "totalCompliant", "totalNonCompliantCount", "<init>", "(Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "d", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "f", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17561a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Double average;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<LeadersEntry> entries;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String lastUpdated;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer totalCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer totalCompliant;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Integer totalNonCompliantCount;

    public C17561a(Double d3, List<LeadersEntry> list, String str, Integer num, Integer num2, Integer num3) {
        this.average = d3;
        this.entries = list;
        this.lastUpdated = str;
        this.totalCount = num;
        this.totalCompliant = num2;
        this.totalNonCompliantCount = num3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAverage() {
        return this.average;
    }

    /* JADX INFO: renamed from: b */
    public final List<LeadersEntry> m49977b() {
        return this.entries;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getTotalCompliant() {
        return this.totalCompliant;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17561a)) {
            return false;
        }
        C17561a c17561a = (C17561a) other;
        return AbstractC22676k.m65745e(this.average, c17561a.average) && AbstractC22676k.m65745e(this.entries, c17561a.entries) && AbstractC22676k.m65745e(this.lastUpdated, c17561a.lastUpdated) && AbstractC22676k.m65745e(this.totalCount, c17561a.totalCount) && AbstractC22676k.m65745e(this.totalCompliant, c17561a.totalCompliant) && AbstractC22676k.m65745e(this.totalNonCompliantCount, c17561a.totalNonCompliantCount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTotalNonCompliantCount() {
        return this.totalNonCompliantCount;
    }

    public int hashCode() {
        Double d3 = this.average;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        List<LeadersEntry> list = this.entries;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.lastUpdated;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCompliant;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalNonCompliantCount;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        Double d3 = this.average;
        List<LeadersEntry> list = this.entries;
        String str = this.lastUpdated;
        Integer num = this.totalCount;
        Integer num2 = this.totalCompliant;
        Integer num3 = this.totalNonCompliantCount;
        StringBuilder sb4 = new StringBuilder("Leaderboard(average=");
        sb4.append(d3);
        sb4.append(", entries=");
        sb4.append(list);
        sb4.append(", lastUpdated=");
        AbstractC30007c.m91853w(num, str, ", totalCount=", ", totalCompliant=", sb4);
        sb4.append(num2);
        sb4.append(", totalNonCompliantCount=");
        sb4.append(num3);
        sb4.append(")");
        return sb4.toString();
    }
}
