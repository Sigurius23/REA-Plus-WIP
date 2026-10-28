package m02;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m02.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\u0018\u0010\u0014¨\u0006("}, m65681d2 = {"Lm02/c;", "", "", "cycleId", "", "lowerBound", "upperBound", "", "scaledStrain", "", "recoveryScoreValue", "millisOfSleep", "", "isComplete", "calories", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;IJZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "c", "g", "d", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "e", "I", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24884c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long cycleId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String lowerBound;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String upperBound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Double scaledStrain;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int recoveryScoreValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long millisOfSleep;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isComplete;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int calories;

    public C24884c(long j7, String lowerBound, String upperBound, Double d3, int i13, long j13, boolean z4, int i14) {
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        this.cycleId = j7;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.scaledStrain = d3;
        this.recoveryScoreValue = i13;
        this.millisOfSleep = j13;
        this.isComplete = z4;
        this.calories = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMillisOfSleep() {
        return this.millisOfSleep;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRecoveryScoreValue() {
        return this.recoveryScoreValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24884c)) {
            return false;
        }
        C24884c c24884c = (C24884c) other;
        return this.cycleId == c24884c.cycleId && AbstractC22676k.m65745e(this.lowerBound, c24884c.lowerBound) && AbstractC22676k.m65745e(this.upperBound, c24884c.upperBound) && AbstractC22676k.m65745e(this.scaledStrain, c24884c.scaledStrain) && this.recoveryScoreValue == c24884c.recoveryScoreValue && this.millisOfSleep == c24884c.millisOfSleep && this.isComplete == c24884c.isComplete && this.calories == c24884c.calories;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getScaledStrain() {
        return this.scaledStrain;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Long.hashCode(this.cycleId) * 31, 31, this.lowerBound), 31, this.upperBound);
        Double d3 = this.scaledStrain;
        return Integer.hashCode(this.calories) + AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.recoveryScoreValue, (iM30450d + (d3 == null ? 0 : d3.hashCode())) * 31, 31), this.millisOfSleep, 31), 31, this.isComplete);
    }

    public String toString() {
        long j7 = this.cycleId;
        String str = this.lowerBound;
        String str2 = this.upperBound;
        Double d3 = this.scaledStrain;
        int i13 = this.recoveryScoreValue;
        long j13 = this.millisOfSleep;
        boolean z4 = this.isComplete;
        int i14 = this.calories;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("WhoopLiveParams(cycleId=", ", lowerBound=", j7, str);
        sbM114685m.append(", upperBound=");
        sbM114685m.append(str2);
        sbM114685m.append(", scaledStrain=");
        sbM114685m.append(d3);
        sbM114685m.append(", recoveryScoreValue=");
        sbM114685m.append(i13);
        sbM114685m.append(", millisOfSleep=");
        sbM114685m.append(j13);
        sbM114685m.append(", isComplete=");
        sbM114685m.append(z4);
        sbM114685m.append(", calories=");
        sbM114685m.append(i14);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
