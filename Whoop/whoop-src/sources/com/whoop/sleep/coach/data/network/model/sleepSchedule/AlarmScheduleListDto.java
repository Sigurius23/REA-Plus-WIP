package com.whoop.sleep.coach.data.network.model.sleepSchedule;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import cb1.C4387a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.AlarmModeValue;
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

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJv\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b<\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b=\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b>\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010 R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\bB\u00109\u001a\u0004\bA\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bC\u0010\u001b¨\u0006F"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;", "alarmMode", "", "", "daysScheduledLabelDisplayList", "alarmModeLabelDisplay", "editLabelDisplay", "deleteLabelDisplay", "latestWakeTime", "", "alarmOn", "scheduleDaysList", "scheduleId", "<init>", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "copy", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;", "getAlarmMode", "Ljava/util/List;", "getDaysScheduledLabelDisplayList", "getDaysScheduledLabelDisplayList$annotations", "()V", "Ljava/lang/String;", "getAlarmModeLabelDisplay", "getEditLabelDisplay", "getDeleteLabelDisplay", "getLatestWakeTime", "Z", "getAlarmOn", "getScheduleDaysList", "getScheduleDaysList$annotations", "getScheduleId", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AlarmScheduleListDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("alarm_mode")
    private final AlarmModeValue alarmMode;

    @SerializedName("alarm_mode_label_display")
    private final String alarmModeLabelDisplay;

    @SerializedName("alarm_on")
    private final boolean alarmOn;

    @SerializedName("days_scheduled_label_display")
    private final List<String> daysScheduledLabelDisplayList;

    @SerializedName("delete_label_display")
    private final String deleteLabelDisplay;

    @SerializedName("edit_label_display")
    private final String editLabelDisplay;

    @SerializedName("latest_wake_time")
    private final String latestWakeTime;

    @SerializedName("scheduled_days")
    private final List<String> scheduleDaysList;

    @SerializedName("schedule_id")
    private final String scheduleId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AlarmScheduleListDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C4387a(1)), AbstractC30060g.m92087G(enumC23463i, new C4387a(2)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C4387a(3)), null};
    }

    public /* synthetic */ AlarmScheduleListDto(int i13, AlarmModeValue alarmModeValue, List list, String str, String str2, String str3, String str4, boolean z4, List list2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, AlarmScheduleListDto$$serializer.INSTANCE.getDescriptor());
        }
        this.alarmMode = alarmModeValue;
        this.daysScheduledLabelDisplayList = list;
        this.alarmModeLabelDisplay = str;
        this.editLabelDisplay = str2;
        this.deleteLabelDisplay = str3;
        this.latestWakeTime = str4;
        this.alarmOn = z4;
        this.scheduleDaysList = list2;
        this.scheduleId = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AlarmModeValue.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlarmScheduleListDto copy$default(AlarmScheduleListDto alarmScheduleListDto, AlarmModeValue alarmModeValue, List list, String str, String str2, String str3, String str4, boolean z4, List list2, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            alarmModeValue = alarmScheduleListDto.alarmMode;
        }
        if ((i13 & 2) != 0) {
            list = alarmScheduleListDto.daysScheduledLabelDisplayList;
        }
        if ((i13 & 4) != 0) {
            str = alarmScheduleListDto.alarmModeLabelDisplay;
        }
        if ((i13 & 8) != 0) {
            str2 = alarmScheduleListDto.editLabelDisplay;
        }
        if ((i13 & 16) != 0) {
            str3 = alarmScheduleListDto.deleteLabelDisplay;
        }
        if ((i13 & 32) != 0) {
            str4 = alarmScheduleListDto.latestWakeTime;
        }
        if ((i13 & 64) != 0) {
            z4 = alarmScheduleListDto.alarmOn;
        }
        if ((i13 & 128) != 0) {
            list2 = alarmScheduleListDto.scheduleDaysList;
        }
        if ((i13 & 256) != 0) {
            str5 = alarmScheduleListDto.scheduleId;
        }
        List list3 = list2;
        String str6 = str5;
        String str7 = str4;
        boolean z13 = z4;
        String str8 = str3;
        String str9 = str;
        return alarmScheduleListDto.copy(alarmModeValue, list, str9, str2, str8, str7, z13, list3, str6);
    }

    @InterfaceC37143h("days_scheduled_label_display")
    public static /* synthetic */ void getDaysScheduledLabelDisplayList$annotations() {
    }

    @InterfaceC37143h("scheduled_days")
    public static /* synthetic */ void getScheduleDaysList$annotations() {
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(AlarmScheduleListDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.alarmMode);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.daysScheduledLabelDisplayList);
        output.encodeStringElement(serialDesc, 2, self.alarmModeLabelDisplay);
        output.encodeStringElement(serialDesc, 3, self.editLabelDisplay);
        output.encodeStringElement(serialDesc, 4, self.deleteLabelDisplay);
        output.encodeStringElement(serialDesc, 5, self.latestWakeTime);
        output.encodeBooleanElement(serialDesc, 6, self.alarmOn);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.scheduleDaysList);
        output.encodeStringElement(serialDesc, 8, self.scheduleId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AlarmModeValue getAlarmMode() {
        return this.alarmMode;
    }

    public final List<String> component2() {
        return this.daysScheduledLabelDisplayList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAlarmModeLabelDisplay() {
        return this.alarmModeLabelDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEditLabelDisplay() {
        return this.editLabelDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeleteLabelDisplay() {
        return this.deleteLabelDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLatestWakeTime() {
        return this.latestWakeTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAlarmOn() {
        return this.alarmOn;
    }

    public final List<String> component8() {
        return this.scheduleDaysList;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getScheduleId() {
        return this.scheduleId;
    }

    public final AlarmScheduleListDto copy(AlarmModeValue alarmMode, List<String> daysScheduledLabelDisplayList, String alarmModeLabelDisplay, String editLabelDisplay, String deleteLabelDisplay, String latestWakeTime, boolean alarmOn, List<String> scheduleDaysList, String scheduleId) {
        AbstractC22676k.m65750j(alarmMode, "alarmMode");
        AbstractC22676k.m65750j(daysScheduledLabelDisplayList, "daysScheduledLabelDisplayList");
        AbstractC22676k.m65750j(alarmModeLabelDisplay, "alarmModeLabelDisplay");
        AbstractC22676k.m65750j(editLabelDisplay, "editLabelDisplay");
        AbstractC22676k.m65750j(deleteLabelDisplay, "deleteLabelDisplay");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(scheduleDaysList, "scheduleDaysList");
        AbstractC22676k.m65750j(scheduleId, "scheduleId");
        return new AlarmScheduleListDto(alarmMode, daysScheduledLabelDisplayList, alarmModeLabelDisplay, editLabelDisplay, deleteLabelDisplay, latestWakeTime, alarmOn, scheduleDaysList, scheduleId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmScheduleListDto)) {
            return false;
        }
        AlarmScheduleListDto alarmScheduleListDto = (AlarmScheduleListDto) other;
        return this.alarmMode == alarmScheduleListDto.alarmMode && AbstractC22676k.m65745e(this.daysScheduledLabelDisplayList, alarmScheduleListDto.daysScheduledLabelDisplayList) && AbstractC22676k.m65745e(this.alarmModeLabelDisplay, alarmScheduleListDto.alarmModeLabelDisplay) && AbstractC22676k.m65745e(this.editLabelDisplay, alarmScheduleListDto.editLabelDisplay) && AbstractC22676k.m65745e(this.deleteLabelDisplay, alarmScheduleListDto.deleteLabelDisplay) && AbstractC22676k.m65745e(this.latestWakeTime, alarmScheduleListDto.latestWakeTime) && this.alarmOn == alarmScheduleListDto.alarmOn && AbstractC22676k.m65745e(this.scheduleDaysList, alarmScheduleListDto.scheduleDaysList) && AbstractC22676k.m65745e(this.scheduleId, alarmScheduleListDto.scheduleId);
    }

    public final AlarmModeValue getAlarmMode() {
        return this.alarmMode;
    }

    public final String getAlarmModeLabelDisplay() {
        return this.alarmModeLabelDisplay;
    }

    public final boolean getAlarmOn() {
        return this.alarmOn;
    }

    public final List<String> getDaysScheduledLabelDisplayList() {
        return this.daysScheduledLabelDisplayList;
    }

    public final String getDeleteLabelDisplay() {
        return this.deleteLabelDisplay;
    }

    public final String getEditLabelDisplay() {
        return this.editLabelDisplay;
    }

    public final String getLatestWakeTime() {
        return this.latestWakeTime;
    }

    public final List<String> getScheduleDaysList() {
        return this.scheduleDaysList;
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public int hashCode() {
        return this.scheduleId.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.alarmMode.hashCode() * 31, 31, this.daysScheduledLabelDisplayList), 31, this.alarmModeLabelDisplay), 31, this.editLabelDisplay), 31, this.deleteLabelDisplay), 31, this.latestWakeTime), 31, this.alarmOn), 31, this.scheduleDaysList);
    }

    public String toString() {
        AlarmModeValue alarmModeValue = this.alarmMode;
        List<String> list = this.daysScheduledLabelDisplayList;
        String str = this.alarmModeLabelDisplay;
        String str2 = this.editLabelDisplay;
        String str3 = this.deleteLabelDisplay;
        String str4 = this.latestWakeTime;
        boolean z4 = this.alarmOn;
        List<String> list2 = this.scheduleDaysList;
        String str5 = this.scheduleId;
        StringBuilder sb4 = new StringBuilder("AlarmScheduleListDto(alarmMode=");
        sb4.append(alarmModeValue);
        sb4.append(", daysScheduledLabelDisplayList=");
        sb4.append(list);
        sb4.append(", alarmModeLabelDisplay=");
        AbstractC11266d.m30444B(sb4, str, ", editLabelDisplay=", str2, ", deleteLabelDisplay=");
        AbstractC11266d.m30444B(sb4, str3, ", latestWakeTime=", str4, ", alarmOn=");
        AbstractC25012a.m73391x(", scheduleDaysList=", ", scheduleId=", sb4, list2, z4);
        return AbstractC25012a.m73376i(str5, ")", sb4);
    }

    public AlarmScheduleListDto(AlarmModeValue alarmMode, List<String> daysScheduledLabelDisplayList, String alarmModeLabelDisplay, String editLabelDisplay, String deleteLabelDisplay, String latestWakeTime, boolean z4, List<String> scheduleDaysList, String scheduleId) {
        AbstractC22676k.m65750j(alarmMode, "alarmMode");
        AbstractC22676k.m65750j(daysScheduledLabelDisplayList, "daysScheduledLabelDisplayList");
        AbstractC22676k.m65750j(alarmModeLabelDisplay, "alarmModeLabelDisplay");
        AbstractC22676k.m65750j(editLabelDisplay, "editLabelDisplay");
        AbstractC22676k.m65750j(deleteLabelDisplay, "deleteLabelDisplay");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(scheduleDaysList, "scheduleDaysList");
        AbstractC22676k.m65750j(scheduleId, "scheduleId");
        this.alarmMode = alarmMode;
        this.daysScheduledLabelDisplayList = daysScheduledLabelDisplayList;
        this.alarmModeLabelDisplay = alarmModeLabelDisplay;
        this.editLabelDisplay = editLabelDisplay;
        this.deleteLabelDisplay = deleteLabelDisplay;
        this.latestWakeTime = latestWakeTime;
        this.alarmOn = z4;
        this.scheduleDaysList = scheduleDaysList;
        this.scheduleId = scheduleId;
    }
}
