package g11;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: g11.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b\u001a\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+¨\u0006,"}, m65681d2 = {"Lg11/d;", "Lm91/u;", "", "id", "Ljava/time/LocalDate;", "selectedDate", "minimumDate", "maximumDate", "Lg11/e;", "validDateRange", "", "isEnabled", "emitsInitialValue", "Lg11/f;", "updateDatePicker", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Lg11/e;ZZLg11/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/time/LocalDate;", "e", "()Ljava/time/LocalDate;", "c", "d", "Lg11/e;", "g", "()Lg11/e;", "f", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "Lg11/f;", "()Lg11/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15220d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDate selectedDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalDate minimumDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalDate maximumDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C15221e validDateRange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean emitsInitialValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C15222f updateDatePicker;

    public C15220d(String id4, LocalDate selectedDate, LocalDate localDate, LocalDate localDate2, C15221e c15221e, boolean z4, boolean z13, C15222f c15222f) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        this.id = id4;
        this.selectedDate = selectedDate;
        this.minimumDate = localDate;
        this.maximumDate = localDate2;
        this.validDateRange = c15221e;
        this.isEnabled = z4;
        this.emitsInitialValue = z13;
        this.updateDatePicker = c15222f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEmitsInitialValue() {
        return this.emitsInitialValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getMaximumDate() {
        return this.maximumDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getMinimumDate() {
        return this.minimumDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15220d)) {
            return false;
        }
        C15220d c15220d = (C15220d) other;
        return AbstractC22676k.m65745e(this.id, c15220d.id) && AbstractC22676k.m65745e(this.selectedDate, c15220d.selectedDate) && AbstractC22676k.m65745e(this.minimumDate, c15220d.minimumDate) && AbstractC22676k.m65745e(this.maximumDate, c15220d.maximumDate) && AbstractC22676k.m65745e(this.validDateRange, c15220d.validDateRange) && this.isEnabled == c15220d.isEnabled && this.emitsInitialValue == c15220d.emitsInitialValue && AbstractC22676k.m65745e(this.updateDatePicker, c15220d.updateDatePicker);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C15222f getUpdateDatePicker() {
        return this.updateDatePicker;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C15221e getValidDateRange() {
        return this.validDateRange;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public int hashCode() {
        int iM38558e = AbstractC13673n.m38558e(this.selectedDate, this.id.hashCode() * 31, 31);
        LocalDate localDate = this.minimumDate;
        int iHashCode = (iM38558e + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.maximumDate;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        C15221e c15221e = this.validDateRange;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (c15221e == null ? 0 : c15221e.hashCode())) * 31, 31, this.isEnabled), 31, this.emitsInitialValue);
        C15222f c15222f = this.updateDatePicker;
        return iM8289b + (c15222f != null ? c15222f.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        LocalDate localDate = this.minimumDate;
        LocalDate localDate2 = this.maximumDate;
        C15221e c15221e = this.validDateRange;
        boolean z4 = this.isEnabled;
        boolean z13 = this.emitsInitialValue;
        StringBuilder sb4 = new StringBuilder("DatePickerItemState(id=");
        sb4.append(str);
        sb4.append(", selectedDate=REDACTED, minimumDate=");
        sb4.append(localDate);
        sb4.append(", maximumDate=");
        sb4.append(localDate2);
        sb4.append(", validDateRange=");
        sb4.append(c15221e);
        sb4.append(", isEnabled=");
        return AbstractC36095b.m114682j(sb4, z4, ", emitsInitialValue=", z13, ")");
    }
}
