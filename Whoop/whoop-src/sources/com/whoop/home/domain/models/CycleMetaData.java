package com.whoop.home.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,Jn\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010$R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b;\u0010$R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b<\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010(R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b\f\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bA\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bC\u0010@\u001a\u0004\b\u000e\u0010,¨\u0006F"}, m65681d2 = {"Lcom/whoop/home/domain/models/CycleMetaData;", "", "", "cycleId", "Lcom/whoop/home/domain/models/CycleDays;", "cycleDays", "", "cycleDateDisplay", "previousCycleDay", "nextCycleDay", "", "multiDayCycle", "isGDCFlow", "sleepState", "isDayZero", "<init>", "(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/CycleMetaData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()Lcom/whoop/home/domain/models/CycleDays;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "copy", "(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/home/domain/models/CycleMetaData;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getCycleId", "Lcom/whoop/home/domain/models/CycleDays;", "getCycleDays", "Ljava/lang/String;", "getCycleDateDisplay", "getPreviousCycleDay", "getNextCycleDay", "Z", "getMultiDayCycle", "isGDCFlow$annotations", "()V", "getSleepState", "Ljava/lang/Boolean;", "isDayZero$annotations", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CycleMetaData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("cycle_date_display")
    private final String cycleDateDisplay;

    @SerializedName("cycle_days")
    private final CycleDays cycleDays;

    @SerializedName("cycle_id")
    private final long cycleId;

    @SerializedName("day_zero")
    private final Boolean isDayZero;

    @SerializedName("has_multi_day_cycle_cta_tile")
    private final boolean isGDCFlow;

    @SerializedName("multi_day_cycle")
    private final boolean multiDayCycle;

    @SerializedName("next_cycle_day")
    private final String nextCycleDay;

    @SerializedName("previous_cycle_day")
    private final String previousCycleDay;

    @SerializedName("sleep_state")
    private final String sleepState;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/CycleMetaData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/CycleMetaData;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CycleMetaData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CycleMetaData(int i13, long j7, CycleDays cycleDays, String str, String str2, String str3, boolean z4, boolean z13, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, CycleMetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.cycleId = j7;
        this.cycleDays = cycleDays;
        this.cycleDateDisplay = str;
        this.previousCycleDay = str2;
        this.nextCycleDay = str3;
        this.multiDayCycle = z4;
        this.isGDCFlow = z13;
        this.sleepState = str4;
        this.isDayZero = bool;
    }

    public static /* synthetic */ CycleMetaData copy$default(CycleMetaData cycleMetaData, long j7, CycleDays cycleDays, String str, String str2, String str3, boolean z4, boolean z13, String str4, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = cycleMetaData.cycleId;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            cycleDays = cycleMetaData.cycleDays;
        }
        CycleDays cycleDays2 = cycleDays;
        if ((i13 & 4) != 0) {
            str = cycleMetaData.cycleDateDisplay;
        }
        return cycleMetaData.copy(j13, cycleDays2, str, (i13 & 8) != 0 ? cycleMetaData.previousCycleDay : str2, (i13 & 16) != 0 ? cycleMetaData.nextCycleDay : str3, (i13 & 32) != 0 ? cycleMetaData.multiDayCycle : z4, (i13 & 64) != 0 ? cycleMetaData.isGDCFlow : z13, (i13 & 128) != 0 ? cycleMetaData.sleepState : str4, (i13 & 256) != 0 ? cycleMetaData.isDayZero : bool);
    }

    @InterfaceC37143h("day_zero")
    public static /* synthetic */ void isDayZero$annotations() {
    }

    @InterfaceC37143h("has_multi_day_cycle_cta_tile")
    public static /* synthetic */ void isGDCFlow$annotations() {
    }

    public static final /* synthetic */ void write$Self$home_release(CycleMetaData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.cycleId);
        output.encodeSerializableElement(serialDesc, 1, CycleDays$$serializer.INSTANCE, self.cycleDays);
        output.encodeStringElement(serialDesc, 2, self.cycleDateDisplay);
        output.encodeStringElement(serialDesc, 3, self.previousCycleDay);
        output.encodeStringElement(serialDesc, 4, self.nextCycleDay);
        output.encodeBooleanElement(serialDesc, 5, self.multiDayCycle);
        output.encodeBooleanElement(serialDesc, 6, self.isGDCFlow);
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.sleepState);
        output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.isDayZero);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CycleDays getCycleDays() {
        return this.cycleDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCycleDateDisplay() {
        return this.cycleDateDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPreviousCycleDay() {
        return this.previousCycleDay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextCycleDay() {
        return this.nextCycleDay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getMultiDayCycle() {
        return this.multiDayCycle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsGDCFlow() {
        return this.isGDCFlow;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSleepState() {
        return this.sleepState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsDayZero() {
        return this.isDayZero;
    }

    public final CycleMetaData copy(long cycleId, CycleDays cycleDays, String cycleDateDisplay, String previousCycleDay, String nextCycleDay, boolean multiDayCycle, boolean isGDCFlow, String sleepState, Boolean isDayZero) {
        AbstractC22676k.m65750j(cycleDays, "cycleDays");
        AbstractC22676k.m65750j(cycleDateDisplay, "cycleDateDisplay");
        AbstractC22676k.m65750j(previousCycleDay, "previousCycleDay");
        AbstractC22676k.m65750j(nextCycleDay, "nextCycleDay");
        return new CycleMetaData(cycleId, cycleDays, cycleDateDisplay, previousCycleDay, nextCycleDay, multiDayCycle, isGDCFlow, sleepState, isDayZero);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CycleMetaData)) {
            return false;
        }
        CycleMetaData cycleMetaData = (CycleMetaData) other;
        return this.cycleId == cycleMetaData.cycleId && AbstractC22676k.m65745e(this.cycleDays, cycleMetaData.cycleDays) && AbstractC22676k.m65745e(this.cycleDateDisplay, cycleMetaData.cycleDateDisplay) && AbstractC22676k.m65745e(this.previousCycleDay, cycleMetaData.previousCycleDay) && AbstractC22676k.m65745e(this.nextCycleDay, cycleMetaData.nextCycleDay) && this.multiDayCycle == cycleMetaData.multiDayCycle && this.isGDCFlow == cycleMetaData.isGDCFlow && AbstractC22676k.m65745e(this.sleepState, cycleMetaData.sleepState) && AbstractC22676k.m65745e(this.isDayZero, cycleMetaData.isDayZero);
    }

    public final String getCycleDateDisplay() {
        return this.cycleDateDisplay;
    }

    public final CycleDays getCycleDays() {
        return this.cycleDays;
    }

    public final long getCycleId() {
        return this.cycleId;
    }

    public final boolean getMultiDayCycle() {
        return this.multiDayCycle;
    }

    public final String getNextCycleDay() {
        return this.nextCycleDay;
    }

    public final String getPreviousCycleDay() {
        return this.previousCycleDay;
    }

    public final String getSleepState() {
        return this.sleepState;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.cycleDays.hashCode() + (Long.hashCode(this.cycleId) * 31)) * 31, 31, this.cycleDateDisplay), 31, this.previousCycleDay), 31, this.nextCycleDay), 31, this.multiDayCycle), 31, this.isGDCFlow);
        String str = this.sleepState;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDayZero;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isDayZero() {
        return this.isDayZero;
    }

    public final boolean isGDCFlow() {
        return this.isGDCFlow;
    }

    public String toString() {
        long j7 = this.cycleId;
        CycleDays cycleDays = this.cycleDays;
        String str = this.cycleDateDisplay;
        String str2 = this.previousCycleDay;
        String str3 = this.nextCycleDay;
        boolean z4 = this.multiDayCycle;
        boolean z13 = this.isGDCFlow;
        String str4 = this.sleepState;
        Boolean bool = this.isDayZero;
        StringBuilder sb4 = new StringBuilder("CycleMetaData(cycleId=");
        sb4.append(j7);
        sb4.append(", cycleDays=");
        sb4.append(cycleDays);
        AbstractC11266d.m30444B(sb4, ", cycleDateDisplay=", str, ", previousCycleDay=", str2);
        sb4.append(", nextCycleDay=");
        sb4.append(str3);
        sb4.append(", multiDayCycle=");
        sb4.append(z4);
        sb4.append(", isGDCFlow=");
        sb4.append(z13);
        sb4.append(", sleepState=");
        sb4.append(str4);
        sb4.append(", isDayZero=");
        sb4.append(bool);
        sb4.append(")");
        return sb4.toString();
    }

    public CycleMetaData(long j7, CycleDays cycleDays, String cycleDateDisplay, String previousCycleDay, String nextCycleDay, boolean z4, boolean z13, String str, Boolean bool) {
        AbstractC22676k.m65750j(cycleDays, "cycleDays");
        AbstractC22676k.m65750j(cycleDateDisplay, "cycleDateDisplay");
        AbstractC22676k.m65750j(previousCycleDay, "previousCycleDay");
        AbstractC22676k.m65750j(nextCycleDay, "nextCycleDay");
        this.cycleId = j7;
        this.cycleDays = cycleDays;
        this.cycleDateDisplay = cycleDateDisplay;
        this.previousCycleDay = previousCycleDay;
        this.nextCycleDay = nextCycleDay;
        this.multiDayCycle = z4;
        this.isGDCFlow = z13;
        this.sleepState = str;
        this.isDayZero = bool;
    }
}
