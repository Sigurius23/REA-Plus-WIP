package fm1;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: fm1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001d"}, m65681d2 = {"Lfm1/l;", "", "", "dayStrainValue", "", "recoveryScoreValue", "", "millisOfSleep", "calories", "<init>", "(DIJI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "I", "d", "c", "J", "()J", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14608l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double dayStrainValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int recoveryScoreValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long millisOfSleep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int calories;

    public C14608l(double d3, int i13, long j7, int i14) {
        this.dayStrainValue = d3;
        this.recoveryScoreValue = i13;
        this.millisOfSleep = j7;
        this.calories = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getDayStrainValue() {
        return this.dayStrainValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getMillisOfSleep() {
        return this.millisOfSleep;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRecoveryScoreValue() {
        return this.recoveryScoreValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14608l)) {
            return false;
        }
        C14608l c14608l = (C14608l) other;
        return Double.compare(this.dayStrainValue, c14608l.dayStrainValue) == 0 && this.recoveryScoreValue == c14608l.recoveryScoreValue && this.millisOfSleep == c14608l.millisOfSleep && this.calories == c14608l.calories;
    }

    public int hashCode() {
        return Integer.hashCode(this.calories) + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.recoveryScoreValue, Double.hashCode(this.dayStrainValue) * 31, 31), this.millisOfSleep, 31);
    }

    public String toString() {
        double d3 = this.dayStrainValue;
        int i13 = this.recoveryScoreValue;
        long j7 = this.millisOfSleep;
        int i14 = this.calories;
        StringBuilder sb4 = new StringBuilder("WhoopLiveMeta(dayStrainValue=");
        sb4.append(d3);
        sb4.append(", recoveryScoreValue=");
        sb4.append(i13);
        AbstractC2875y.m8285A(sb4, ", millisOfSleep=", j7, ", calories=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
