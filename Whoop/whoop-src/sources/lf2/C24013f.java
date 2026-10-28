package lf2;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llf2/f;", "", "", "sleepGoalText", "Llf2/h;", "sleepGoal", "", "toggleSelected", "<init>", "(Ljava/lang/String;Llf2/h;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Llf2/h;", "()Llf2/h;", "c", "Z", "getToggleSelected", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24013f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sleepGoalText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC24015h sleepGoal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean toggleSelected;

    public C24013f(String sleepGoalText, EnumC24015h sleepGoal, boolean z4) {
        AbstractC22676k.m65750j(sleepGoalText, "sleepGoalText");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        this.sleepGoalText = sleepGoalText;
        this.sleepGoal = sleepGoal;
        this.toggleSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC24015h getSleepGoal() {
        return this.sleepGoal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSleepGoalText() {
        return this.sleepGoalText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24013f)) {
            return false;
        }
        C24013f c24013f = (C24013f) other;
        return AbstractC22676k.m65745e(this.sleepGoalText, c24013f.sleepGoalText) && this.sleepGoal == c24013f.sleepGoal && this.toggleSelected == c24013f.toggleSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.toggleSelected) + ((this.sleepGoal.hashCode() + (this.sleepGoalText.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.sleepGoalText;
        EnumC24015h enumC24015h = this.sleepGoal;
        boolean z4 = this.toggleSelected;
        StringBuilder sb4 = new StringBuilder("SleepGoal(sleepGoalText=");
        sb4.append(str);
        sb4.append(", sleepGoal=");
        sb4.append(enumC24015h);
        sb4.append(", toggleSelected=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
