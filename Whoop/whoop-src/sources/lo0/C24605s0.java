package lo0;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lo0.s0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, m65681d2 = {"Llo0/s0;", "", "Lcom/whoop/design/util/TextResource;", "dateDisplay", "", "Llo0/q0;", "schedulingDatePickerItems", "", "selectedTimeSlot", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24605s0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource dateDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C24601q0> schedulingDatePickerItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String selectedTimeSlot;

    public C24605s0(TextResource dateDisplay, List<C24601q0> schedulingDatePickerItems, String str) {
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(schedulingDatePickerItems, "schedulingDatePickerItems");
        this.dateDisplay = dateDisplay;
        this.schedulingDatePickerItems = schedulingDatePickerItems;
        this.selectedTimeSlot = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDateDisplay() {
        return this.dateDisplay;
    }

    /* JADX INFO: renamed from: b */
    public final List<C24601q0> m71848b() {
        return this.schedulingDatePickerItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSelectedTimeSlot() {
        return this.selectedTimeSlot;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24605s0)) {
            return false;
        }
        C24605s0 c24605s0 = (C24605s0) other;
        return AbstractC22676k.m65745e(this.dateDisplay, c24605s0.dateDisplay) && AbstractC22676k.m65745e(this.schedulingDatePickerItems, c24605s0.schedulingDatePickerItems) && AbstractC22676k.m65745e(this.selectedTimeSlot, c24605s0.selectedTimeSlot);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.dateDisplay.hashCode() * 31, 31, this.schedulingDatePickerItems);
        String str = this.selectedTimeSlot;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.selectedTimeSlot, ")", AbstractC33745d.m106657p(this.dateDisplay, "VideoSchedulingDatePickerState(dateDisplay=", ", schedulingDatePickerItems=", ", selectedTimeSlot=", this.schedulingDatePickerItems));
    }
}
