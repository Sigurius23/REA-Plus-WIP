package o52;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o52.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u0002`\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jp\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u0002`\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b%\u0010\u0017R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u0002`\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b!\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b)\u0010\u001d¨\u0006+"}, m65681d2 = {"Lo52/f;", "", "", "updateUi", "", "realtimeHearRate", "", "realTimeStrain", "hearRatePercentRange", "Ll83/k;", "Lcom/whoop/util/HeartRateStat;", "hearRateStat", "calories", "isGoalReached", "reachGoal", "<init>", "(ZIDILl83/k;IZZ)V", "a", "(ZIDILl83/k;IZZ)Lo52/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getUpdateUi", "()Z", "b", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "D", "g", "()D", "d", "e", "Ll83/k;", "()Ll83/k;", "f", "i", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27551f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean updateUi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int realtimeHearRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double realTimeStrain;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int hearRatePercentRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C23465k hearRateStat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int calories;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isGoalReached;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean reachGoal;

    public C27551f(boolean z4, int i13, double d3, int i14, C23465k hearRateStat, int i15, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(hearRateStat, "hearRateStat");
        this.updateUi = z4;
        this.realtimeHearRate = i13;
        this.realTimeStrain = d3;
        this.hearRatePercentRange = i14;
        this.hearRateStat = hearRateStat;
        this.calories = i15;
        this.isGoalReached = z13;
        this.reachGoal = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27551f m83153b(C27551f c27551f, boolean z4, int i13, double d3, int i14, C23465k c23465k, int i15, boolean z13, boolean z14, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            z4 = c27551f.updateUi;
        }
        if ((i16 & 2) != 0) {
            i13 = c27551f.realtimeHearRate;
        }
        if ((i16 & 4) != 0) {
            d3 = c27551f.realTimeStrain;
        }
        if ((i16 & 8) != 0) {
            i14 = c27551f.hearRatePercentRange;
        }
        if ((i16 & 16) != 0) {
            c23465k = c27551f.hearRateStat;
        }
        if ((i16 & 32) != 0) {
            i15 = c27551f.calories;
        }
        if ((i16 & 64) != 0) {
            z13 = c27551f.isGoalReached;
        }
        if ((i16 & 128) != 0) {
            z14 = c27551f.reachGoal;
        }
        boolean z15 = z14;
        int i17 = i15;
        int i18 = i14;
        double d14 = d3;
        return c27551f.m83154a(z4, i13, d14, i18, c23465k, i17, z13, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C27551f m83154a(boolean updateUi, int realtimeHearRate, double realTimeStrain, int hearRatePercentRange, C23465k hearRateStat, int calories, boolean isGoalReached, boolean reachGoal) {
        AbstractC22676k.m65750j(hearRateStat, "hearRateStat");
        return new C27551f(updateUi, realtimeHearRate, realTimeStrain, hearRatePercentRange, hearRateStat, calories, isGoalReached, reachGoal);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHearRatePercentRange() {
        return this.hearRatePercentRange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C23465k getHearRateStat() {
        return this.hearRateStat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27551f)) {
            return false;
        }
        C27551f c27551f = (C27551f) other;
        return this.updateUi == c27551f.updateUi && this.realtimeHearRate == c27551f.realtimeHearRate && Double.compare(this.realTimeStrain, c27551f.realTimeStrain) == 0 && this.hearRatePercentRange == c27551f.hearRatePercentRange && AbstractC22676k.m65745e(this.hearRateStat, c27551f.hearRateStat) && this.calories == c27551f.calories && this.isGoalReached == c27551f.isGoalReached && this.reachGoal == c27551f.reachGoal;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getReachGoal() {
        return this.reachGoal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getRealTimeStrain() {
        return this.realTimeStrain;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getRealtimeHearRate() {
        return this.realtimeHearRate;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reachGoal) + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.calories, (this.hearRateStat.hashCode() + AbstractC11266d.m30448b(this.hearRatePercentRange, AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.realtimeHearRate, Boolean.hashCode(this.updateUi) * 31, 31), 31, this.realTimeStrain), 31)) * 31, 31), 31, this.isGoalReached);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsGoalReached() {
        return this.isGoalReached;
    }

    public String toString() {
        return "RealTimeActivityStrainViewState(updateUi=" + this.updateUi + ", realtimeHearRate=" + this.realtimeHearRate + ", realTimeStrain=" + this.realTimeStrain + ", hearRatePercentRange=" + this.hearRatePercentRange + ", hearRateStat=" + this.hearRateStat + ", calories=" + this.calories + ", isGoalReached=" + this.isGoalReached + ", reachGoal=" + this.reachGoal + ")";
    }

    public /* synthetic */ C27551f(boolean z4, int i13, double d3, int i14, C23465k c23465k, int i15, boolean z13, boolean z14, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? false : z4, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0.0d : d3, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? new C23465k(0, 0) : c23465k, (i16 & 32) != 0 ? 0 : i15, (i16 & 64) != 0 ? false : z13, (i16 & 128) != 0 ? false : z14);
    }
}
