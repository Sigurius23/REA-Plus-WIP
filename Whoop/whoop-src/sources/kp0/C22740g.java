package kp0;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b&\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b$\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b1\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106¨\u00067"}, m65681d2 = {"Lkp0/g;", "Landroid/os/Parcelable;", "", "sleepNeed", "baseline", "recentStrain", "sleepDebt", "recentNaps", "sleepGoalPercentage", "", "sleepGoalLabel", "sleepGoal", "averageAwakeTime", "recommendedTimeInBed", "", "isOptimalSleepOrWeeklyPlan", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "C", "x", "f", "y", "i", "z", "s", "E", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "F", "getSleepGoalPercentage", "G", "I", "H", "b", "J", "k", "K", "Z", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22740g implements Parcelable {
    public static final Parcelable.Creator<C22740g> CREATOR = new a();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String recentNaps;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String sleepGoalPercentage;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int sleepGoalLabel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String sleepGoal;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String averageAwakeTime;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String recommendedTimeInBed;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean isOptimalSleepOrWeeklyPlan;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String sleepNeed;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String baseline;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String recentStrain;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String sleepDebt;

    /* JADX INFO: renamed from: kp0.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C22740g> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22740g createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new C22740g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C22740g[] newArray(int i13) {
            return new C22740g[i13];
        }
    }

    public C22740g(String sleepNeed, String baseline, String recentStrain, String sleepDebt, String recentNaps, String sleepGoalPercentage, int i13, String sleepGoal, String averageAwakeTime, String recommendedTimeInBed, boolean z4) {
        AbstractC22676k.m65750j(sleepNeed, "sleepNeed");
        AbstractC22676k.m65750j(baseline, "baseline");
        AbstractC22676k.m65750j(recentStrain, "recentStrain");
        AbstractC22676k.m65750j(sleepDebt, "sleepDebt");
        AbstractC22676k.m65750j(recentNaps, "recentNaps");
        AbstractC22676k.m65750j(sleepGoalPercentage, "sleepGoalPercentage");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        AbstractC22676k.m65750j(averageAwakeTime, "averageAwakeTime");
        AbstractC22676k.m65750j(recommendedTimeInBed, "recommendedTimeInBed");
        this.sleepNeed = sleepNeed;
        this.baseline = baseline;
        this.recentStrain = recentStrain;
        this.sleepDebt = sleepDebt;
        this.recentNaps = recentNaps;
        this.sleepGoalPercentage = sleepGoalPercentage;
        this.sleepGoalLabel = i13;
        this.sleepGoal = sleepGoal;
        this.averageAwakeTime = averageAwakeTime;
        this.recommendedTimeInBed = recommendedTimeInBed;
        this.isOptimalSleepOrWeeklyPlan = z4;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getSleepNeed() {
        return this.sleepNeed;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getIsOptimalSleepOrWeeklyPlan() {
        return this.isOptimalSleepOrWeeklyPlan;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAverageAwakeTime() {
        return this.averageAwakeTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22740g)) {
            return false;
        }
        C22740g c22740g = (C22740g) other;
        return AbstractC22676k.m65745e(this.sleepNeed, c22740g.sleepNeed) && AbstractC22676k.m65745e(this.baseline, c22740g.baseline) && AbstractC22676k.m65745e(this.recentStrain, c22740g.recentStrain) && AbstractC22676k.m65745e(this.sleepDebt, c22740g.sleepDebt) && AbstractC22676k.m65745e(this.recentNaps, c22740g.recentNaps) && AbstractC22676k.m65745e(this.sleepGoalPercentage, c22740g.sleepGoalPercentage) && this.sleepGoalLabel == c22740g.sleepGoalLabel && AbstractC22676k.m65745e(this.sleepGoal, c22740g.sleepGoal) && AbstractC22676k.m65745e(this.averageAwakeTime, c22740g.averageAwakeTime) && AbstractC22676k.m65745e(this.recommendedTimeInBed, c22740g.recommendedTimeInBed) && this.isOptimalSleepOrWeeklyPlan == c22740g.isOptimalSleepOrWeeklyPlan;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRecentNaps() {
        return this.recentNaps;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOptimalSleepOrWeeklyPlan) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.sleepGoalLabel, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.sleepNeed.hashCode() * 31, 31, this.baseline), 31, this.recentStrain), 31, this.sleepDebt), 31, this.recentNaps), 31, this.sleepGoalPercentage), 31), 31, this.sleepGoal), 31, this.averageAwakeTime), 31, this.recommendedTimeInBed);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRecentStrain() {
        return this.recentStrain;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRecommendedTimeInBed() {
        return this.recommendedTimeInBed;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSleepDebt() {
        return this.sleepDebt;
    }

    public String toString() {
        String str = this.sleepNeed;
        String str2 = this.baseline;
        String str3 = this.recentStrain;
        String str4 = this.sleepDebt;
        String str5 = this.recentNaps;
        String str6 = this.sleepGoalPercentage;
        int i13 = this.sleepGoalLabel;
        String str7 = this.sleepGoal;
        String str8 = this.averageAwakeTime;
        String str9 = this.recommendedTimeInBed;
        boolean z4 = this.isOptimalSleepOrWeeklyPlan;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OptimalSleepCalculation(sleepNeed=", str, ", baseline=", str2, ", recentStrain=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", sleepDebt=", str4, ", recentNaps=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", sleepGoalPercentage=", str6, ", sleepGoalLabel=");
        AbstractC11895b.m31979B(i13, ", sleepGoal=", str7, ", averageAwakeTime=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str8, ", recommendedTimeInBed=", str9, ", isOptimalSleepOrWeeklyPlan=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.sleepNeed);
        dest.writeString(this.baseline);
        dest.writeString(this.recentStrain);
        dest.writeString(this.sleepDebt);
        dest.writeString(this.recentNaps);
        dest.writeString(this.sleepGoalPercentage);
        dest.writeInt(this.sleepGoalLabel);
        dest.writeString(this.sleepGoal);
        dest.writeString(this.averageAwakeTime);
        dest.writeString(this.recommendedTimeInBed);
        dest.writeInt(this.isOptimalSleepOrWeeklyPlan ? 1 : 0);
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getSleepGoal() {
        return this.sleepGoal;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getSleepGoalLabel() {
        return this.sleepGoalLabel;
    }
}
