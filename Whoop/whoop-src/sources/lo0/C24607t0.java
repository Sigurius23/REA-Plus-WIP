package lo0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lo0.t0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llo0/t0;", "", "Llo0/s0;", "schedulingDatePicker", "<init>", "(Llo0/s0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llo0/s0;", "()Llo0/s0;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24607t0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24605s0 schedulingDatePicker;

    public C24607t0(C24605s0 schedulingDatePicker) {
        AbstractC22676k.m65750j(schedulingDatePicker, "schedulingDatePicker");
        this.schedulingDatePicker = schedulingDatePicker;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C24605s0 getSchedulingDatePicker() {
        return this.schedulingDatePicker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C24607t0) && AbstractC22676k.m65745e(this.schedulingDatePicker, ((C24607t0) other).schedulingDatePicker);
    }

    public int hashCode() {
        return this.schedulingDatePicker.hashCode();
    }

    public String toString() {
        return "VideoSchedulingFormContentState(schedulingDatePicker=" + this.schedulingDatePicker + ")";
    }
}
