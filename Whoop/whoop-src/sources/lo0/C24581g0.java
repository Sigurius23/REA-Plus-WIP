package lo0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lo0.g0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m65681d2 = {"Llo0/g0;", "Llo0/f0;", "", "dateLowerBound", "dateUpperBound", "startingDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDateLowerBound", "b", "getDateUpperBound", "c", "getStartingDate", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24581g0 implements InterfaceC24579f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String dateLowerBound;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dateUpperBound;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String startingDate;

    public C24581g0(String dateLowerBound, String dateUpperBound, String startingDate) {
        AbstractC22676k.m65750j(dateLowerBound, "dateLowerBound");
        AbstractC22676k.m65750j(dateUpperBound, "dateUpperBound");
        AbstractC22676k.m65750j(startingDate, "startingDate");
        this.dateLowerBound = dateLowerBound;
        this.dateUpperBound = dateUpperBound;
        this.startingDate = startingDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24581g0)) {
            return false;
        }
        C24581g0 c24581g0 = (C24581g0) other;
        return AbstractC22676k.m65745e(this.dateLowerBound, c24581g0.dateLowerBound) && AbstractC22676k.m65745e(this.dateUpperBound, c24581g0.dateUpperBound) && AbstractC22676k.m65745e(this.startingDate, c24581g0.startingDate);
    }

    public int hashCode() {
        return this.startingDate.hashCode() + AbstractC11266d.m30450d(this.dateLowerBound.hashCode() * 31, 31, this.dateUpperBound);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.startingDate, ")", AbstractC11895b.m32001t("FormSheetDateContentViewState(dateLowerBound=", this.dateLowerBound, ", dateUpperBound=", this.dateUpperBound, ", startingDate="));
    }
}
