package af2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: af2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Laf2/h;", "", "", "sleepGoalLabelToggledDisplay", "sleepGoalLabelNotToggledDisplay", "Laf2/i;", "sleepGoalValue", "", "toggleSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Laf2/i;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Laf2/i;Z)Laf2/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "c", "Laf2/i;", "e", "()Laf2/i;", "Z", "f", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0818h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sleepGoalLabelToggledDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String sleepGoalLabelNotToggledDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC0819i sleepGoalValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean toggleSelected;

    public C0818h(String sleepGoalLabelToggledDisplay, String sleepGoalLabelNotToggledDisplay, EnumC0819i sleepGoalValue, boolean z4) {
        AbstractC22676k.m65750j(sleepGoalLabelToggledDisplay, "sleepGoalLabelToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalLabelNotToggledDisplay, "sleepGoalLabelNotToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalValue, "sleepGoalValue");
        this.sleepGoalLabelToggledDisplay = sleepGoalLabelToggledDisplay;
        this.sleepGoalLabelNotToggledDisplay = sleepGoalLabelNotToggledDisplay;
        this.sleepGoalValue = sleepGoalValue;
        this.toggleSelected = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0818h m2003b(C0818h c0818h, String str, String str2, EnumC0819i enumC0819i, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c0818h.sleepGoalLabelToggledDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = c0818h.sleepGoalLabelNotToggledDisplay;
        }
        if ((i13 & 4) != 0) {
            enumC0819i = c0818h.sleepGoalValue;
        }
        if ((i13 & 8) != 0) {
            z4 = c0818h.toggleSelected;
        }
        return c0818h.m2004a(str, str2, enumC0819i, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C0818h m2004a(String sleepGoalLabelToggledDisplay, String sleepGoalLabelNotToggledDisplay, EnumC0819i sleepGoalValue, boolean toggleSelected) {
        AbstractC22676k.m65750j(sleepGoalLabelToggledDisplay, "sleepGoalLabelToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalLabelNotToggledDisplay, "sleepGoalLabelNotToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalValue, "sleepGoalValue");
        return new C0818h(sleepGoalLabelToggledDisplay, sleepGoalLabelNotToggledDisplay, sleepGoalValue, toggleSelected);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSleepGoalLabelNotToggledDisplay() {
        return this.sleepGoalLabelNotToggledDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSleepGoalLabelToggledDisplay() {
        return this.sleepGoalLabelToggledDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC0819i getSleepGoalValue() {
        return this.sleepGoalValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0818h)) {
            return false;
        }
        C0818h c0818h = (C0818h) other;
        return AbstractC22676k.m65745e(this.sleepGoalLabelToggledDisplay, c0818h.sleepGoalLabelToggledDisplay) && AbstractC22676k.m65745e(this.sleepGoalLabelNotToggledDisplay, c0818h.sleepGoalLabelNotToggledDisplay) && this.sleepGoalValue == c0818h.sleepGoalValue && this.toggleSelected == c0818h.toggleSelected;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getToggleSelected() {
        return this.toggleSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.toggleSelected) + ((this.sleepGoalValue.hashCode() + AbstractC11266d.m30450d(this.sleepGoalLabelToggledDisplay.hashCode() * 31, 31, this.sleepGoalLabelNotToggledDisplay)) * 31);
    }

    public String toString() {
        String str = this.sleepGoalLabelToggledDisplay;
        String str2 = this.sleepGoalLabelNotToggledDisplay;
        EnumC0819i enumC0819i = this.sleepGoalValue;
        boolean z4 = this.toggleSelected;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepGoalTypeDomainObject(sleepGoalLabelToggledDisplay=", str, ", sleepGoalLabelNotToggledDisplay=", str2, ", sleepGoalValue=");
        sbM32001t.append(enumC0819i);
        sbM32001t.append(", toggleSelected=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
