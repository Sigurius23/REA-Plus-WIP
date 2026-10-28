package lf2;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Llf2/e;", "", "", "isEnabled", "isSelected", "", "dayLabelDisplay", "dayOfWeek", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "d", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24012e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String dayLabelDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String dayOfWeek;

    public C24012e(boolean z4, boolean z13, String dayLabelDisplay, String dayOfWeek) {
        AbstractC22676k.m65750j(dayLabelDisplay, "dayLabelDisplay");
        AbstractC22676k.m65750j(dayOfWeek, "dayOfWeek");
        this.isEnabled = z4;
        this.isSelected = z13;
        this.dayLabelDisplay = dayLabelDisplay;
        this.dayOfWeek = dayOfWeek;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDayLabelDisplay() {
        return this.dayLabelDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24012e)) {
            return false;
        }
        C24012e c24012e = (C24012e) other;
        return this.isEnabled == c24012e.isEnabled && this.isSelected == c24012e.isSelected && AbstractC22676k.m65745e(this.dayLabelDisplay, c24012e.dayLabelDisplay) && AbstractC22676k.m65745e(this.dayOfWeek, c24012e.dayOfWeek);
    }

    public int hashCode() {
        return this.dayOfWeek.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.isEnabled) * 31, 31, this.isSelected), 31, this.dayLabelDisplay);
    }

    public String toString() {
        boolean z4 = this.isEnabled;
        boolean z13 = this.isSelected;
        return AbstractC11266d.m30464r(AbstractC11895b.m32002u("ScheduleDayViewState(isEnabled=", ", isSelected=", ", dayLabelDisplay=", z4, z13), this.dayLabelDisplay, ", dayOfWeek=", this.dayOfWeek, ")");
    }
}
