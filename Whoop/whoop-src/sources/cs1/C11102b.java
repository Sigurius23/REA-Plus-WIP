package cs1;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cs1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lcs1/b;", "", "", "cycleId", "", "requestDate", "", "isAutoPop", "source", "label", "<init>", "(JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "d", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11102b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long cycleId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String requestDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isAutoPop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String label;

    public C11102b(long j7, String requestDate, boolean z4, String str, String str2) {
        AbstractC22676k.m65750j(requestDate, "requestDate");
        this.cycleId = j7;
        this.requestDate = requestDate;
        this.isAutoPop = z4;
        this.source = str;
        this.label = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRequestDate() {
        return this.requestDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAutoPop() {
        return this.isAutoPop;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11102b)) {
            return false;
        }
        C11102b c11102b = (C11102b) other;
        return this.cycleId == c11102b.cycleId && AbstractC22676k.m65745e(this.requestDate, c11102b.requestDate) && this.isAutoPop == c11102b.isAutoPop && AbstractC22676k.m65745e(this.source, c11102b.source) && AbstractC22676k.m65745e(this.label, c11102b.label);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(Long.hashCode(this.cycleId) * 31, 31, this.requestDate), 31, this.isAutoPop);
        String str = this.source;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        long j7 = this.cycleId;
        String str = this.requestDate;
        boolean z4 = this.isAutoPop;
        String str2 = this.source;
        String str3 = this.label;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("JournalSurveyConfig(cycleId=", ", requestDate=", j7, str);
        sbM114685m.append(", isAutoPop=");
        sbM114685m.append(z4);
        sbM114685m.append(", source=");
        sbM114685m.append(str2);
        return AbstractC2875y.m8304q(sbM114685m, ", label=", str3, ")");
    }
}
