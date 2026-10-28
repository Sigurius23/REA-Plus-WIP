package lo0;

import i93.C18284j;
import jh3.AbstractC21702c;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lo0.d0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, m65681d2 = {"Llo0/d0;", "", "Lny0/h;", "cancelButton", "confirmButton", "", "initialSelectedMillis", "displayedMonthMillis", "Li93/j;", "yearRange", "lowerBoundMillis", "upperBoundMillis", "<init>", "(Lny0/h;Lny0/h;Ljava/lang/Long;Ljava/lang/Long;Li93/j;Ljava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lny0/h;", "()Lny0/h;", "b", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "e", "Li93/j;", "g", "()Li93/j;", "f", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24575d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27256h cancelButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27256h confirmButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Long initialSelectedMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Long displayedMonthMillis;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C18284j yearRange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Long lowerBoundMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Long upperBoundMillis;

    public C24575d0(C27256h cancelButton, C27256h confirmButton, Long l7, Long l12, C18284j c18284j, Long l13, Long l14) {
        AbstractC22676k.m65750j(cancelButton, "cancelButton");
        AbstractC22676k.m65750j(confirmButton, "confirmButton");
        this.cancelButton = cancelButton;
        this.confirmButton = confirmButton;
        this.initialSelectedMillis = l7;
        this.displayedMonthMillis = l12;
        this.yearRange = c18284j;
        this.lowerBoundMillis = l13;
        this.upperBoundMillis = l14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getCancelButton() {
        return this.cancelButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27256h getConfirmButton() {
        return this.confirmButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getDisplayedMonthMillis() {
        return this.displayedMonthMillis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getInitialSelectedMillis() {
        return this.initialSelectedMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getLowerBoundMillis() {
        return this.lowerBoundMillis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24575d0)) {
            return false;
        }
        C24575d0 c24575d0 = (C24575d0) other;
        return AbstractC22676k.m65745e(this.cancelButton, c24575d0.cancelButton) && AbstractC22676k.m65745e(this.confirmButton, c24575d0.confirmButton) && AbstractC22676k.m65745e(this.initialSelectedMillis, c24575d0.initialSelectedMillis) && AbstractC22676k.m65745e(this.displayedMonthMillis, c24575d0.displayedMonthMillis) && AbstractC22676k.m65745e(this.yearRange, c24575d0.yearRange) && AbstractC22676k.m65745e(this.lowerBoundMillis, c24575d0.lowerBoundMillis) && AbstractC22676k.m65745e(this.upperBoundMillis, c24575d0.upperBoundMillis);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getUpperBoundMillis() {
        return this.upperBoundMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C18284j getYearRange() {
        return this.yearRange;
    }

    public int hashCode() {
        int iHashCode = (this.confirmButton.hashCode() + (this.cancelButton.hashCode() * 31)) * 31;
        Long l7 = this.initialSelectedMillis;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.displayedMonthMillis;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        C18284j c18284j = this.yearRange;
        int iHashCode4 = (iHashCode3 + (c18284j == null ? 0 : c18284j.hashCode())) * 31;
        Long l13 = this.lowerBoundMillis;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.upperBoundMillis;
        return iHashCode5 + (l14 != null ? l14.hashCode() : 0);
    }

    public String toString() {
        C27256h c27256h = this.cancelButton;
        C27256h c27256h2 = this.confirmButton;
        Long l7 = this.initialSelectedMillis;
        Long l12 = this.displayedMonthMillis;
        C18284j c18284j = this.yearRange;
        Long l13 = this.lowerBoundMillis;
        Long l14 = this.upperBoundMillis;
        StringBuilder sb4 = new StringBuilder("DatePickerSheetViewState(cancelButton=");
        sb4.append(c27256h);
        sb4.append(", confirmButton=");
        sb4.append(c27256h2);
        sb4.append(", initialSelectedMillis=");
        AbstractC21702c.m61147r(sb4, l7, ", displayedMonthMillis=", l12, ", yearRange=");
        sb4.append(c18284j);
        sb4.append(", lowerBoundMillis=");
        sb4.append(l13);
        sb4.append(", upperBoundMillis=");
        sb4.append(l14);
        sb4.append(")");
        return sb4.toString();
    }
}
