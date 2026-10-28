package td2;

import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: td2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m65681d2 = {"Ltd2/d;", "", "", "historyDate", "recordDate", "", "Ltd2/g;", "records", "nextToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getHistoryDate", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "getNextToken", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33713d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String historyDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String recordDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C33716g> records;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String nextToken;

    public C33713d(String historyDate, String recordDate, List<C33716g> records, String str) {
        AbstractC22676k.m65750j(historyDate, "historyDate");
        AbstractC22676k.m65750j(recordDate, "recordDate");
        AbstractC22676k.m65750j(records, "records");
        this.historyDate = historyDate;
        this.recordDate = recordDate;
        this.records = records;
        this.nextToken = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRecordDate() {
        return this.recordDate;
    }

    /* JADX INFO: renamed from: b */
    public final List<C33716g> m106546b() {
        return this.records;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33713d)) {
            return false;
        }
        C33713d c33713d = (C33713d) other;
        return AbstractC22676k.m65745e(this.historyDate, c33713d.historyDate) && AbstractC22676k.m65745e(this.recordDate, c33713d.recordDate) && AbstractC22676k.m65745e(this.records, c33713d.records) && AbstractC22676k.m65745e(this.nextToken, c33713d.nextToken);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.historyDate.hashCode() * 31, 31, this.recordDate), 31, this.records);
        String str = this.nextToken;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.historyDate;
        String str2 = this.recordDate;
        return AbstractC38963t7.m124377g(", nextToken=", this.nextToken, ")", AbstractC11895b.m32001t("ShepherdHistoryDetailByDateViewState(historyDate=", str, ", recordDate=", str2, ", records="), this.records);
    }
}
