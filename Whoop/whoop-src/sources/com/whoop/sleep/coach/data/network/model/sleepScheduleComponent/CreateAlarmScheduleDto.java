package com.whoop.sleep.coach.data.network.model.sleepScheduleComponent;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import db2.C11888a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b5\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b6\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;", "", "", "latestWakeTime", "alarmMode", "", "alarmEnabled", "", "dayOfWeekList", "sleepGoal", "timeZoneOffset", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/util/List;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLatestWakeTime", "getAlarmMode", "Z", "getAlarmEnabled", "getAlarmEnabled$annotations", "()V", "Ljava/util/List;", "getDayOfWeekList", "getSleepGoal", "getTimeZoneOffset", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CreateAlarmScheduleDto {

    @SerializedName("enabled")
    private final boolean alarmEnabled;

    @SerializedName("alarm_mode")
    private final String alarmMode;

    @SerializedName("day_of_week_list")
    private final List<String> dayOfWeekList;

    @SerializedName("latest_wake_time")
    private final String latestWakeTime;

    @SerializedName("sleep_goal")
    private final String sleepGoal;

    @SerializedName("time_zone_offset")
    private final String timeZoneOffset;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11888a(27)), null, null};

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CreateAlarmScheduleDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateAlarmScheduleDto(int i13, String str, String str2, boolean z4, List list, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, CreateAlarmScheduleDto$$serializer.INSTANCE.getDescriptor());
        }
        this.latestWakeTime = str;
        this.alarmMode = str2;
        this.alarmEnabled = z4;
        this.dayOfWeekList = list;
        this.sleepGoal = str3;
        this.timeZoneOffset = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateAlarmScheduleDto copy$default(CreateAlarmScheduleDto createAlarmScheduleDto, String str, String str2, boolean z4, List list, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = createAlarmScheduleDto.latestWakeTime;
        }
        if ((i13 & 2) != 0) {
            str2 = createAlarmScheduleDto.alarmMode;
        }
        if ((i13 & 4) != 0) {
            z4 = createAlarmScheduleDto.alarmEnabled;
        }
        if ((i13 & 8) != 0) {
            list = createAlarmScheduleDto.dayOfWeekList;
        }
        if ((i13 & 16) != 0) {
            str3 = createAlarmScheduleDto.sleepGoal;
        }
        if ((i13 & 32) != 0) {
            str4 = createAlarmScheduleDto.timeZoneOffset;
        }
        String str5 = str3;
        String str6 = str4;
        return createAlarmScheduleDto.copy(str, str2, z4, list, str5, str6);
    }

    @InterfaceC37143h("enabled")
    public static /* synthetic */ void getAlarmEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(CreateAlarmScheduleDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.latestWakeTime);
        output.encodeStringElement(serialDesc, 1, self.alarmMode);
        output.encodeBooleanElement(serialDesc, 2, self.alarmEnabled);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.dayOfWeekList);
        output.encodeStringElement(serialDesc, 4, self.sleepGoal);
        output.encodeStringElement(serialDesc, 5, self.timeZoneOffset);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLatestWakeTime() {
        return this.latestWakeTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlarmMode() {
        return this.alarmMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAlarmEnabled() {
        return this.alarmEnabled;
    }

    public final List<String> component4() {
        return this.dayOfWeekList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSleepGoal() {
        return this.sleepGoal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final CreateAlarmScheduleDto copy(String latestWakeTime, String alarmMode, boolean alarmEnabled, List<String> dayOfWeekList, String sleepGoal, String timeZoneOffset) {
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(alarmMode, "alarmMode");
        AbstractC22676k.m65750j(dayOfWeekList, "dayOfWeekList");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        return new CreateAlarmScheduleDto(latestWakeTime, alarmMode, alarmEnabled, dayOfWeekList, sleepGoal, timeZoneOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAlarmScheduleDto)) {
            return false;
        }
        CreateAlarmScheduleDto createAlarmScheduleDto = (CreateAlarmScheduleDto) other;
        return AbstractC22676k.m65745e(this.latestWakeTime, createAlarmScheduleDto.latestWakeTime) && AbstractC22676k.m65745e(this.alarmMode, createAlarmScheduleDto.alarmMode) && this.alarmEnabled == createAlarmScheduleDto.alarmEnabled && AbstractC22676k.m65745e(this.dayOfWeekList, createAlarmScheduleDto.dayOfWeekList) && AbstractC22676k.m65745e(this.sleepGoal, createAlarmScheduleDto.sleepGoal) && AbstractC22676k.m65745e(this.timeZoneOffset, createAlarmScheduleDto.timeZoneOffset);
    }

    public final boolean getAlarmEnabled() {
        return this.alarmEnabled;
    }

    public final String getAlarmMode() {
        return this.alarmMode;
    }

    public final List<String> getDayOfWeekList() {
        return this.dayOfWeekList;
    }

    public final String getLatestWakeTime() {
        return this.latestWakeTime;
    }

    public final String getSleepGoal() {
        return this.sleepGoal;
    }

    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public int hashCode() {
        return this.timeZoneOffset.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.latestWakeTime.hashCode() * 31, 31, this.alarmMode), 31, this.alarmEnabled), 31, this.dayOfWeekList), 31, this.sleepGoal);
    }

    public String toString() {
        String str = this.latestWakeTime;
        String str2 = this.alarmMode;
        boolean z4 = this.alarmEnabled;
        List<String> list = this.dayOfWeekList;
        String str3 = this.sleepGoal;
        String str4 = this.timeZoneOffset;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CreateAlarmScheduleDto(latestWakeTime=", str, ", alarmMode=", str2, ", alarmEnabled=");
        AbstractC25012a.m73391x(", dayOfWeekList=", ", sleepGoal=", sbM32001t, list, z4);
        return AbstractC11266d.m30464r(sbM32001t, str3, ", timeZoneOffset=", str4, ")");
    }

    public CreateAlarmScheduleDto(String latestWakeTime, String alarmMode, boolean z4, List<String> dayOfWeekList, String sleepGoal, String timeZoneOffset) {
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(alarmMode, "alarmMode");
        AbstractC22676k.m65750j(dayOfWeekList, "dayOfWeekList");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        this.latestWakeTime = latestWakeTime;
        this.alarmMode = alarmMode;
        this.alarmEnabled = z4;
        this.dayOfWeekList = dayOfWeekList;
        this.sleepGoal = sleepGoal;
        this.timeZoneOffset = timeZoneOffset;
    }
}
