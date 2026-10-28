package com.whoop.sleep.coach.data.network.model;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010'Jr\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010%J\u001a\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010'R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b=\u0010'R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b>\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b?\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b@\u0010'¨\u0006C"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;", "", "", "flexSleepTime", "", "maxPossibleSri", "Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;", "optimalEndpointsFormatted", "recommendedTimeInBed", "", "estimatedAwakeTimeString", "recommendedTimeInBedTimeString", "sleepNeedTimeString", "projectedSleepConsistency", "sleepAdjustmentTimeString", "<init>", "(ZLjava/lang/Integer;Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/Integer;Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;", "component4", "()I", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/Integer;Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getFlexSleepTime", "Ljava/lang/Integer;", "getMaxPossibleSri", "Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;", "getOptimalEndpointsFormatted", "I", "getRecommendedTimeInBed", "Ljava/lang/String;", "getEstimatedAwakeTimeString", "getRecommendedTimeInBedTimeString", "getSleepNeedTimeString", "getProjectedSleepConsistency", "getSleepAdjustmentTimeString", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FormattedTimeInBed {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("estimated_awake_time_string")
    private final String estimatedAwakeTimeString;

    @SerializedName("flex_sleep_time")
    private final boolean flexSleepTime;

    @SerializedName("max_possible_sri")
    private final Integer maxPossibleSri;

    @SerializedName("optimal_endpoints_formatted")
    private final OptimalEndpointsFormatted optimalEndpointsFormatted;

    @SerializedName("projected_sleep_consistency")
    private final Integer projectedSleepConsistency;

    @SerializedName("recommended_time_in_bed")
    private final int recommendedTimeInBed;

    @SerializedName("recommended_time_in_bed_time_string")
    private final String recommendedTimeInBedTimeString;

    @SerializedName("sleep_adjustment_time_string")
    private final String sleepAdjustmentTimeString;

    @SerializedName("sleep_need_time_string")
    private final String sleepNeedTimeString;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FormattedTimeInBed$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FormattedTimeInBed(int i13, boolean z4, Integer num, OptimalEndpointsFormatted optimalEndpointsFormatted, int i14, String str, String str2, String str3, Integer num2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, FormattedTimeInBed$$serializer.INSTANCE.getDescriptor());
        }
        this.flexSleepTime = z4;
        this.maxPossibleSri = num;
        this.optimalEndpointsFormatted = optimalEndpointsFormatted;
        this.recommendedTimeInBed = i14;
        this.estimatedAwakeTimeString = str;
        this.recommendedTimeInBedTimeString = str2;
        this.sleepNeedTimeString = str3;
        this.projectedSleepConsistency = num2;
        this.sleepAdjustmentTimeString = str4;
    }

    public static /* synthetic */ FormattedTimeInBed copy$default(FormattedTimeInBed formattedTimeInBed, boolean z4, Integer num, OptimalEndpointsFormatted optimalEndpointsFormatted, int i13, String str, String str2, String str3, Integer num2, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z4 = formattedTimeInBed.flexSleepTime;
        }
        if ((i14 & 2) != 0) {
            num = formattedTimeInBed.maxPossibleSri;
        }
        if ((i14 & 4) != 0) {
            optimalEndpointsFormatted = formattedTimeInBed.optimalEndpointsFormatted;
        }
        if ((i14 & 8) != 0) {
            i13 = formattedTimeInBed.recommendedTimeInBed;
        }
        if ((i14 & 16) != 0) {
            str = formattedTimeInBed.estimatedAwakeTimeString;
        }
        if ((i14 & 32) != 0) {
            str2 = formattedTimeInBed.recommendedTimeInBedTimeString;
        }
        if ((i14 & 64) != 0) {
            str3 = formattedTimeInBed.sleepNeedTimeString;
        }
        if ((i14 & 128) != 0) {
            num2 = formattedTimeInBed.projectedSleepConsistency;
        }
        if ((i14 & 256) != 0) {
            str4 = formattedTimeInBed.sleepAdjustmentTimeString;
        }
        Integer num3 = num2;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        String str8 = str;
        OptimalEndpointsFormatted optimalEndpointsFormatted2 = optimalEndpointsFormatted;
        return formattedTimeInBed.copy(z4, num, optimalEndpointsFormatted2, i13, str8, str6, str7, num3, str5);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(FormattedTimeInBed self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.flexSleepTime);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.maxPossibleSri);
        output.encodeNullableSerializableElement(serialDesc, 2, OptimalEndpointsFormatted$$serializer.INSTANCE, self.optimalEndpointsFormatted);
        output.encodeIntElement(serialDesc, 3, self.recommendedTimeInBed);
        output.encodeStringElement(serialDesc, 4, self.estimatedAwakeTimeString);
        output.encodeStringElement(serialDesc, 5, self.recommendedTimeInBedTimeString);
        output.encodeStringElement(serialDesc, 6, self.sleepNeedTimeString);
        output.encodeNullableSerializableElement(serialDesc, 7, intSerializer, self.projectedSleepConsistency);
        output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.sleepAdjustmentTimeString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getFlexSleepTime() {
        return this.flexSleepTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxPossibleSri() {
        return this.maxPossibleSri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OptimalEndpointsFormatted getOptimalEndpointsFormatted() {
        return this.optimalEndpointsFormatted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRecommendedTimeInBed() {
        return this.recommendedTimeInBed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEstimatedAwakeTimeString() {
        return this.estimatedAwakeTimeString;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRecommendedTimeInBedTimeString() {
        return this.recommendedTimeInBedTimeString;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSleepNeedTimeString() {
        return this.sleepNeedTimeString;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getProjectedSleepConsistency() {
        return this.projectedSleepConsistency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSleepAdjustmentTimeString() {
        return this.sleepAdjustmentTimeString;
    }

    public final FormattedTimeInBed copy(boolean flexSleepTime, Integer maxPossibleSri, OptimalEndpointsFormatted optimalEndpointsFormatted, int recommendedTimeInBed, String estimatedAwakeTimeString, String recommendedTimeInBedTimeString, String sleepNeedTimeString, Integer projectedSleepConsistency, String sleepAdjustmentTimeString) {
        AbstractC22676k.m65750j(estimatedAwakeTimeString, "estimatedAwakeTimeString");
        AbstractC22676k.m65750j(recommendedTimeInBedTimeString, "recommendedTimeInBedTimeString");
        AbstractC22676k.m65750j(sleepNeedTimeString, "sleepNeedTimeString");
        return new FormattedTimeInBed(flexSleepTime, maxPossibleSri, optimalEndpointsFormatted, recommendedTimeInBed, estimatedAwakeTimeString, recommendedTimeInBedTimeString, sleepNeedTimeString, projectedSleepConsistency, sleepAdjustmentTimeString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedTimeInBed)) {
            return false;
        }
        FormattedTimeInBed formattedTimeInBed = (FormattedTimeInBed) other;
        return this.flexSleepTime == formattedTimeInBed.flexSleepTime && AbstractC22676k.m65745e(this.maxPossibleSri, formattedTimeInBed.maxPossibleSri) && AbstractC22676k.m65745e(this.optimalEndpointsFormatted, formattedTimeInBed.optimalEndpointsFormatted) && this.recommendedTimeInBed == formattedTimeInBed.recommendedTimeInBed && AbstractC22676k.m65745e(this.estimatedAwakeTimeString, formattedTimeInBed.estimatedAwakeTimeString) && AbstractC22676k.m65745e(this.recommendedTimeInBedTimeString, formattedTimeInBed.recommendedTimeInBedTimeString) && AbstractC22676k.m65745e(this.sleepNeedTimeString, formattedTimeInBed.sleepNeedTimeString) && AbstractC22676k.m65745e(this.projectedSleepConsistency, formattedTimeInBed.projectedSleepConsistency) && AbstractC22676k.m65745e(this.sleepAdjustmentTimeString, formattedTimeInBed.sleepAdjustmentTimeString);
    }

    public final String getEstimatedAwakeTimeString() {
        return this.estimatedAwakeTimeString;
    }

    public final boolean getFlexSleepTime() {
        return this.flexSleepTime;
    }

    public final Integer getMaxPossibleSri() {
        return this.maxPossibleSri;
    }

    public final OptimalEndpointsFormatted getOptimalEndpointsFormatted() {
        return this.optimalEndpointsFormatted;
    }

    public final Integer getProjectedSleepConsistency() {
        return this.projectedSleepConsistency;
    }

    public final int getRecommendedTimeInBed() {
        return this.recommendedTimeInBed;
    }

    public final String getRecommendedTimeInBedTimeString() {
        return this.recommendedTimeInBedTimeString;
    }

    public final String getSleepAdjustmentTimeString() {
        return this.sleepAdjustmentTimeString;
    }

    public final String getSleepNeedTimeString() {
        return this.sleepNeedTimeString;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.flexSleepTime) * 31;
        Integer num = this.maxPossibleSri;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        OptimalEndpointsFormatted optimalEndpointsFormatted = this.optimalEndpointsFormatted;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.recommendedTimeInBed, (iHashCode2 + (optimalEndpointsFormatted == null ? 0 : optimalEndpointsFormatted.hashCode())) * 31, 31), 31, this.estimatedAwakeTimeString), 31, this.recommendedTimeInBedTimeString), 31, this.sleepNeedTimeString);
        Integer num2 = this.projectedSleepConsistency;
        int iHashCode3 = (iM30450d + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.sleepAdjustmentTimeString;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.flexSleepTime;
        Integer num = this.maxPossibleSri;
        OptimalEndpointsFormatted optimalEndpointsFormatted = this.optimalEndpointsFormatted;
        int i13 = this.recommendedTimeInBed;
        String str = this.estimatedAwakeTimeString;
        String str2 = this.recommendedTimeInBedTimeString;
        String str3 = this.sleepNeedTimeString;
        Integer num2 = this.projectedSleepConsistency;
        String str4 = this.sleepAdjustmentTimeString;
        StringBuilder sb4 = new StringBuilder("FormattedTimeInBed(flexSleepTime=");
        sb4.append(z4);
        sb4.append(", maxPossibleSri=");
        sb4.append(num);
        sb4.append(", optimalEndpointsFormatted=");
        sb4.append(optimalEndpointsFormatted);
        sb4.append(", recommendedTimeInBed=");
        sb4.append(i13);
        sb4.append(", estimatedAwakeTimeString=");
        AbstractC11266d.m30444B(sb4, str, ", recommendedTimeInBedTimeString=", str2, ", sleepNeedTimeString=");
        AbstractC30007c.m91853w(num2, str3, ", projectedSleepConsistency=", ", sleepAdjustmentTimeString=", sb4);
        return AbstractC25012a.m73376i(str4, ")", sb4);
    }

    public FormattedTimeInBed(boolean z4, Integer num, OptimalEndpointsFormatted optimalEndpointsFormatted, int i13, String estimatedAwakeTimeString, String recommendedTimeInBedTimeString, String sleepNeedTimeString, Integer num2, String str) {
        AbstractC22676k.m65750j(estimatedAwakeTimeString, "estimatedAwakeTimeString");
        AbstractC22676k.m65750j(recommendedTimeInBedTimeString, "recommendedTimeInBedTimeString");
        AbstractC22676k.m65750j(sleepNeedTimeString, "sleepNeedTimeString");
        this.flexSleepTime = z4;
        this.maxPossibleSri = num;
        this.optimalEndpointsFormatted = optimalEndpointsFormatted;
        this.recommendedTimeInBed = i13;
        this.estimatedAwakeTimeString = estimatedAwakeTimeString;
        this.recommendedTimeInBedTimeString = recommendedTimeInBedTimeString;
        this.sleepNeedTimeString = sleepNeedTimeString;
        this.projectedSleepConsistency = num2;
        this.sleepAdjustmentTimeString = str;
    }
}
