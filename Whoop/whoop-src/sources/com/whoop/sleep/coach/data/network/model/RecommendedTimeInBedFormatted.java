package com.whoop.sleep.coach.data.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJR\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b4\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b5\u0010\u001a¨\u00068"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;", "", "Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;", "weeklyPlan", "peak", "perform", "getBy", "hoursOfSleep", "optimizeSleep", "<init>", "(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;)Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;", "getWeeklyPlan", "getPeak", "getPeak$annotations", "()V", "getPerform", "getPerform$annotations", "getGetBy", "getGetBy$annotations", "getHoursOfSleep", "getOptimizeSleep", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecommendedTimeInBedFormatted {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("70")
    private final FormattedTimeInBed getBy;

    @SerializedName("hours_of_sleep")
    private final FormattedTimeInBed hoursOfSleep;

    @SerializedName("optimize_sleep")
    private final FormattedTimeInBed optimizeSleep;

    @SerializedName("100")
    private final FormattedTimeInBed peak;

    @SerializedName("85")
    private final FormattedTimeInBed perform;

    @SerializedName("weekly_plan")
    private final FormattedTimeInBed weeklyPlan;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecommendedTimeInBedFormatted$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RecommendedTimeInBedFormatted(int i13, FormattedTimeInBed formattedTimeInBed, FormattedTimeInBed formattedTimeInBed2, FormattedTimeInBed formattedTimeInBed3, FormattedTimeInBed formattedTimeInBed4, FormattedTimeInBed formattedTimeInBed5, FormattedTimeInBed formattedTimeInBed6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, RecommendedTimeInBedFormatted$$serializer.INSTANCE.getDescriptor());
        }
        this.weeklyPlan = formattedTimeInBed;
        this.peak = formattedTimeInBed2;
        this.perform = formattedTimeInBed3;
        this.getBy = formattedTimeInBed4;
        this.hoursOfSleep = formattedTimeInBed5;
        this.optimizeSleep = formattedTimeInBed6;
    }

    public static /* synthetic */ RecommendedTimeInBedFormatted copy$default(RecommendedTimeInBedFormatted recommendedTimeInBedFormatted, FormattedTimeInBed formattedTimeInBed, FormattedTimeInBed formattedTimeInBed2, FormattedTimeInBed formattedTimeInBed3, FormattedTimeInBed formattedTimeInBed4, FormattedTimeInBed formattedTimeInBed5, FormattedTimeInBed formattedTimeInBed6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            formattedTimeInBed = recommendedTimeInBedFormatted.weeklyPlan;
        }
        if ((i13 & 2) != 0) {
            formattedTimeInBed2 = recommendedTimeInBedFormatted.peak;
        }
        if ((i13 & 4) != 0) {
            formattedTimeInBed3 = recommendedTimeInBedFormatted.perform;
        }
        if ((i13 & 8) != 0) {
            formattedTimeInBed4 = recommendedTimeInBedFormatted.getBy;
        }
        if ((i13 & 16) != 0) {
            formattedTimeInBed5 = recommendedTimeInBedFormatted.hoursOfSleep;
        }
        if ((i13 & 32) != 0) {
            formattedTimeInBed6 = recommendedTimeInBedFormatted.optimizeSleep;
        }
        FormattedTimeInBed formattedTimeInBed7 = formattedTimeInBed5;
        FormattedTimeInBed formattedTimeInBed8 = formattedTimeInBed6;
        return recommendedTimeInBedFormatted.copy(formattedTimeInBed, formattedTimeInBed2, formattedTimeInBed3, formattedTimeInBed4, formattedTimeInBed7, formattedTimeInBed8);
    }

    @InterfaceC37143h("70")
    public static /* synthetic */ void getGetBy$annotations() {
    }

    @InterfaceC37143h("100")
    public static /* synthetic */ void getPeak$annotations() {
    }

    @InterfaceC37143h("85")
    public static /* synthetic */ void getPerform$annotations() {
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(RecommendedTimeInBedFormatted self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        FormattedTimeInBed$$serializer formattedTimeInBed$$serializer = FormattedTimeInBed$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, formattedTimeInBed$$serializer, self.weeklyPlan);
        output.encodeSerializableElement(serialDesc, 1, formattedTimeInBed$$serializer, self.peak);
        output.encodeSerializableElement(serialDesc, 2, formattedTimeInBed$$serializer, self.perform);
        output.encodeSerializableElement(serialDesc, 3, formattedTimeInBed$$serializer, self.getBy);
        output.encodeNullableSerializableElement(serialDesc, 4, formattedTimeInBed$$serializer, self.hoursOfSleep);
        output.encodeNullableSerializableElement(serialDesc, 5, formattedTimeInBed$$serializer, self.optimizeSleep);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FormattedTimeInBed getWeeklyPlan() {
        return this.weeklyPlan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FormattedTimeInBed getPeak() {
        return this.peak;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FormattedTimeInBed getPerform() {
        return this.perform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FormattedTimeInBed getGetBy() {
        return this.getBy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FormattedTimeInBed getHoursOfSleep() {
        return this.hoursOfSleep;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FormattedTimeInBed getOptimizeSleep() {
        return this.optimizeSleep;
    }

    public final RecommendedTimeInBedFormatted copy(FormattedTimeInBed weeklyPlan, FormattedTimeInBed peak, FormattedTimeInBed perform, FormattedTimeInBed getBy, FormattedTimeInBed hoursOfSleep, FormattedTimeInBed optimizeSleep) {
        AbstractC22676k.m65750j(peak, "peak");
        AbstractC22676k.m65750j(perform, "perform");
        AbstractC22676k.m65750j(getBy, "getBy");
        return new RecommendedTimeInBedFormatted(weeklyPlan, peak, perform, getBy, hoursOfSleep, optimizeSleep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendedTimeInBedFormatted)) {
            return false;
        }
        RecommendedTimeInBedFormatted recommendedTimeInBedFormatted = (RecommendedTimeInBedFormatted) other;
        return AbstractC22676k.m65745e(this.weeklyPlan, recommendedTimeInBedFormatted.weeklyPlan) && AbstractC22676k.m65745e(this.peak, recommendedTimeInBedFormatted.peak) && AbstractC22676k.m65745e(this.perform, recommendedTimeInBedFormatted.perform) && AbstractC22676k.m65745e(this.getBy, recommendedTimeInBedFormatted.getBy) && AbstractC22676k.m65745e(this.hoursOfSleep, recommendedTimeInBedFormatted.hoursOfSleep) && AbstractC22676k.m65745e(this.optimizeSleep, recommendedTimeInBedFormatted.optimizeSleep);
    }

    public final FormattedTimeInBed getGetBy() {
        return this.getBy;
    }

    public final FormattedTimeInBed getHoursOfSleep() {
        return this.hoursOfSleep;
    }

    public final FormattedTimeInBed getOptimizeSleep() {
        return this.optimizeSleep;
    }

    public final FormattedTimeInBed getPeak() {
        return this.peak;
    }

    public final FormattedTimeInBed getPerform() {
        return this.perform;
    }

    public final FormattedTimeInBed getWeeklyPlan() {
        return this.weeklyPlan;
    }

    public int hashCode() {
        FormattedTimeInBed formattedTimeInBed = this.weeklyPlan;
        int iHashCode = (this.getBy.hashCode() + ((this.perform.hashCode() + ((this.peak.hashCode() + ((formattedTimeInBed == null ? 0 : formattedTimeInBed.hashCode()) * 31)) * 31)) * 31)) * 31;
        FormattedTimeInBed formattedTimeInBed2 = this.hoursOfSleep;
        int iHashCode2 = (iHashCode + (formattedTimeInBed2 == null ? 0 : formattedTimeInBed2.hashCode())) * 31;
        FormattedTimeInBed formattedTimeInBed3 = this.optimizeSleep;
        return iHashCode2 + (formattedTimeInBed3 != null ? formattedTimeInBed3.hashCode() : 0);
    }

    public String toString() {
        return "RecommendedTimeInBedFormatted(weeklyPlan=" + this.weeklyPlan + ", peak=" + this.peak + ", perform=" + this.perform + ", getBy=" + this.getBy + ", hoursOfSleep=" + this.hoursOfSleep + ", optimizeSleep=" + this.optimizeSleep + ")";
    }

    public RecommendedTimeInBedFormatted(FormattedTimeInBed formattedTimeInBed, FormattedTimeInBed peak, FormattedTimeInBed perform, FormattedTimeInBed getBy, FormattedTimeInBed formattedTimeInBed2, FormattedTimeInBed formattedTimeInBed3) {
        AbstractC22676k.m65750j(peak, "peak");
        AbstractC22676k.m65750j(perform, "perform");
        AbstractC22676k.m65750j(getBy, "getBy");
        this.weeklyPlan = formattedTimeInBed;
        this.peak = peak;
        this.perform = perform;
        this.getBy = getBy;
        this.hoursOfSleep = formattedTimeInBed2;
        this.optimizeSleep = formattedTimeInBed3;
    }
}
