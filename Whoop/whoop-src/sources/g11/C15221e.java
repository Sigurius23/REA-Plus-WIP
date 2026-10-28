package g11;

import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.models.GenericInteraction;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g11.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, m65681d2 = {"Lg11/e;", "", "Ljava/time/LocalDate;", "minDate", "maxDate", "Lcom/whoop/navigation/models/GenericInteraction;", "validRangeAction", "invalidRangeAction", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", HttpHeaders.DATE, "a", "(Ljava/time/LocalDate;)Lcom/whoop/navigation/models/GenericInteraction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "getMinDate", "()Ljava/time/LocalDate;", "b", "getMaxDate", "c", "Lcom/whoop/navigation/models/GenericInteraction;", "getValidRangeAction", "()Lcom/whoop/navigation/models/GenericInteraction;", "d", "getInvalidRangeAction", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15221e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LocalDate minDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDate maxDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final GenericInteraction validRangeAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction invalidRangeAction;

    public C15221e(LocalDate localDate, LocalDate localDate2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        this.minDate = localDate;
        this.maxDate = localDate2;
        this.validRangeAction = genericInteraction;
        this.invalidRangeAction = genericInteraction2;
    }

    /* JADX INFO: renamed from: a */
    public final GenericInteraction m43284a(LocalDate date) {
        AbstractC22676k.m65750j(date, "date");
        LocalDate localDate = this.minDate;
        boolean z4 = true;
        boolean z13 = localDate == null || date.compareTo((ChronoLocalDate) localDate) >= 0;
        LocalDate localDate2 = this.maxDate;
        if (localDate2 != null) {
            z4 = date.compareTo((ChronoLocalDate) localDate2) <= 0;
        }
        return (z13 && z4) ? this.validRangeAction : this.invalidRangeAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15221e)) {
            return false;
        }
        C15221e c15221e = (C15221e) other;
        return AbstractC22676k.m65745e(this.minDate, c15221e.minDate) && AbstractC22676k.m65745e(this.maxDate, c15221e.maxDate) && AbstractC22676k.m65745e(this.validRangeAction, c15221e.validRangeAction) && AbstractC22676k.m65745e(this.invalidRangeAction, c15221e.invalidRangeAction);
    }

    public int hashCode() {
        LocalDate localDate = this.minDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.maxDate;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        GenericInteraction genericInteraction = this.validRangeAction;
        int iHashCode3 = (iHashCode2 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.invalidRangeAction;
        return iHashCode3 + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        return "DatePickerValidDateRange(minDate=" + this.minDate + ", maxDate=" + this.maxDate + ", validRangeAction=" + this.validRangeAction + ", invalidRangeAction=" + this.invalidRangeAction + ")";
    }
}
