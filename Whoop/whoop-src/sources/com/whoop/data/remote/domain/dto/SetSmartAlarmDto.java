package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vw0.C36541a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001eR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010 R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001e¨\u00067"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;", "", "", "upperTimeBound", "timeZoneOffset", "", "smartAlarmEnabled", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "smartAlarmGoal", "scheduleEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Z)Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUpperTimeBound", "getTimeZoneOffset", "Z", "getSmartAlarmEnabled", "getSmartAlarmEnabled$annotations", "()V", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "getSmartAlarmGoal", "getSmartAlarmGoal$annotations", "getScheduleEnabled", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SetSmartAlarmDto {

    @SerializedName("schedule_enabled")
    private final boolean scheduleEnabled;

    @SerializedName("enabled")
    private final boolean smartAlarmEnabled;

    @SerializedName(WeeklyPlanApiKt.GOAL)
    private final SmartAlarmGoalType smartAlarmGoal;

    @SerializedName("time_zone_offset")
    private final String timeZoneOffset;

    @SerializedName("upper_time_bound")
    private final String upperTimeBound;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36541a(9)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SetSmartAlarmDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SetSmartAlarmDto(int i13, String str, String str2, boolean z4, SmartAlarmGoalType smartAlarmGoalType, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SetSmartAlarmDto$$serializer.INSTANCE.getDescriptor());
        }
        this.upperTimeBound = str;
        this.timeZoneOffset = str2;
        this.smartAlarmEnabled = z4;
        this.smartAlarmGoal = smartAlarmGoalType;
        this.scheduleEnabled = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return SmartAlarmGoalType.INSTANCE.serializer();
    }

    public static /* synthetic */ SetSmartAlarmDto copy$default(SetSmartAlarmDto setSmartAlarmDto, String str, String str2, boolean z4, SmartAlarmGoalType smartAlarmGoalType, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = setSmartAlarmDto.upperTimeBound;
        }
        if ((i13 & 2) != 0) {
            str2 = setSmartAlarmDto.timeZoneOffset;
        }
        if ((i13 & 4) != 0) {
            z4 = setSmartAlarmDto.smartAlarmEnabled;
        }
        if ((i13 & 8) != 0) {
            smartAlarmGoalType = setSmartAlarmDto.smartAlarmGoal;
        }
        if ((i13 & 16) != 0) {
            z13 = setSmartAlarmDto.scheduleEnabled;
        }
        boolean z14 = z13;
        boolean z15 = z4;
        return setSmartAlarmDto.copy(str, str2, z15, smartAlarmGoalType, z14);
    }

    @InterfaceC37143h("enabled")
    public static /* synthetic */ void getSmartAlarmEnabled$annotations() {
    }

    @InterfaceC37143h(WeeklyPlanApiKt.GOAL)
    public static /* synthetic */ void getSmartAlarmGoal$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(SetSmartAlarmDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.upperTimeBound);
        output.encodeStringElement(serialDesc, 1, self.timeZoneOffset);
        output.encodeBooleanElement(serialDesc, 2, self.smartAlarmEnabled);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.smartAlarmGoal);
        output.encodeBooleanElement(serialDesc, 4, self.scheduleEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUpperTimeBound() {
        return this.upperTimeBound;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSmartAlarmEnabled() {
        return this.smartAlarmEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SmartAlarmGoalType getSmartAlarmGoal() {
        return this.smartAlarmGoal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getScheduleEnabled() {
        return this.scheduleEnabled;
    }

    public final SetSmartAlarmDto copy(String upperTimeBound, String timeZoneOffset, boolean smartAlarmEnabled, SmartAlarmGoalType smartAlarmGoal, boolean scheduleEnabled) {
        AbstractC22676k.m65750j(upperTimeBound, "upperTimeBound");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        AbstractC22676k.m65750j(smartAlarmGoal, "smartAlarmGoal");
        return new SetSmartAlarmDto(upperTimeBound, timeZoneOffset, smartAlarmEnabled, smartAlarmGoal, scheduleEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetSmartAlarmDto)) {
            return false;
        }
        SetSmartAlarmDto setSmartAlarmDto = (SetSmartAlarmDto) other;
        return AbstractC22676k.m65745e(this.upperTimeBound, setSmartAlarmDto.upperTimeBound) && AbstractC22676k.m65745e(this.timeZoneOffset, setSmartAlarmDto.timeZoneOffset) && this.smartAlarmEnabled == setSmartAlarmDto.smartAlarmEnabled && this.smartAlarmGoal == setSmartAlarmDto.smartAlarmGoal && this.scheduleEnabled == setSmartAlarmDto.scheduleEnabled;
    }

    public final boolean getScheduleEnabled() {
        return this.scheduleEnabled;
    }

    public final boolean getSmartAlarmEnabled() {
        return this.smartAlarmEnabled;
    }

    public final SmartAlarmGoalType getSmartAlarmGoal() {
        return this.smartAlarmGoal;
    }

    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final String getUpperTimeBound() {
        return this.upperTimeBound;
    }

    public int hashCode() {
        return Boolean.hashCode(this.scheduleEnabled) + ((this.smartAlarmGoal.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.upperTimeBound.hashCode() * 31, 31, this.timeZoneOffset), 31, this.smartAlarmEnabled)) * 31);
    }

    public String toString() {
        String str = this.upperTimeBound;
        String str2 = this.timeZoneOffset;
        boolean z4 = this.smartAlarmEnabled;
        SmartAlarmGoalType smartAlarmGoalType = this.smartAlarmGoal;
        boolean z13 = this.scheduleEnabled;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SetSmartAlarmDto(upperTimeBound=", str, ", timeZoneOffset=", str2, ", smartAlarmEnabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", smartAlarmGoal=");
        sbM32001t.append(smartAlarmGoalType);
        sbM32001t.append(", scheduleEnabled=");
        return AbstractC18489d0.m53372m(sbM32001t, z13, ")");
    }

    public SetSmartAlarmDto(String upperTimeBound, String timeZoneOffset, boolean z4, SmartAlarmGoalType smartAlarmGoal, boolean z13) {
        AbstractC22676k.m65750j(upperTimeBound, "upperTimeBound");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        AbstractC22676k.m65750j(smartAlarmGoal, "smartAlarmGoal");
        this.upperTimeBound = upperTimeBound;
        this.timeZoneOffset = timeZoneOffset;
        this.smartAlarmEnabled = z4;
        this.smartAlarmGoal = smartAlarmGoal;
        this.scheduleEnabled = z13;
    }
}
