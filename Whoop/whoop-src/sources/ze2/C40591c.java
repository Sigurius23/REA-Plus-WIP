package ze2;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ze2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lze2/c;", "", "", "shouldShowAddScheduleButton", "", "addScheduleButtonLabelDisplay", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getAddScheduleButtonLabelDisplay", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40591c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldShowAddScheduleButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String addScheduleButtonLabelDisplay;

    public C40591c(boolean z4, String addScheduleButtonLabelDisplay) {
        AbstractC22676k.m65750j(addScheduleButtonLabelDisplay, "addScheduleButtonLabelDisplay");
        this.shouldShowAddScheduleButton = z4;
        this.addScheduleButtonLabelDisplay = addScheduleButtonLabelDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShouldShowAddScheduleButton() {
        return this.shouldShowAddScheduleButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40591c)) {
            return false;
        }
        C40591c c40591c = (C40591c) other;
        return this.shouldShowAddScheduleButton == c40591c.shouldShowAddScheduleButton && AbstractC22676k.m65745e(this.addScheduleButtonLabelDisplay, c40591c.addScheduleButtonLabelDisplay);
    }

    public int hashCode() {
        return this.addScheduleButtonLabelDisplay.hashCode() + (Boolean.hashCode(this.shouldShowAddScheduleButton) * 31);
    }

    public String toString() {
        return AbstractC3855a.m11825i("ScheduleButtonComponentDomain(shouldShowAddScheduleButton=", ", addScheduleButtonLabelDisplay=", this.addScheduleButtonLabelDisplay, ")", this.shouldShowAddScheduleButton);
    }
}
