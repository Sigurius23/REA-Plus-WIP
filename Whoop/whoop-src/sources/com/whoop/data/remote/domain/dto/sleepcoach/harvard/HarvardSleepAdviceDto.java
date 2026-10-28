package com.whoop.data.remote.domain.dto.sleepcoach.harvard;

import ad3.C0771n;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zi1.C40674e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010%J\u0082\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b1\u0010 J\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bB\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bG\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010'R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u0010+R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u0010-R\u001a\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bR\u0010%¨\u0006U"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;", "", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;", "turnOffAllModal", "turnOffScheduleModal", "", "chipLabelTextDisplay", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;", "alarmScheduleState", "nextScheduleDayLabel", "", "menstrualCoachEnabled", "Lkotlinx/serialization/json/JsonElement;", "menstrualCoachingDetails", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;", "needBreakdown", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;", "needBreakdownFormatted", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;", "recommendedTimeInBedFormatted", "eligibleForSmartAlarms", "<init>", "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;", "component5", "component6", "()Z", "component7", "()Lkotlinx/serialization/json/JsonElement;", "component8", "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;", "component9", "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;", "component10", "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;", "component11", "copy", "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;", "getTurnOffAllModal", "getTurnOffScheduleModal", "Ljava/lang/String;", "getChipLabelTextDisplay", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;", "getAlarmScheduleState", "getNextScheduleDayLabel", "Z", "getMenstrualCoachEnabled", "Lkotlinx/serialization/json/JsonElement;", "getMenstrualCoachingDetails", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;", "getNeedBreakdown", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;", "getNeedBreakdownFormatted", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;", "getRecommendedTimeInBedFormatted", "getEligibleForSmartAlarms", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HarvardSleepAdviceDto {

    @SerializedName("alarm_schedule_state")
    private final AlarmScheduleState alarmScheduleState;

    @SerializedName("chip_label_text_display")
    private final String chipLabelTextDisplay;

    @SerializedName("eligible_for_smart_alarms")
    private final boolean eligibleForSmartAlarms;

    @SerializedName("menstrual_coach_enabled")
    private final boolean menstrualCoachEnabled;

    @SerializedName("menstrual_coaching_details")
    private final JsonElement menstrualCoachingDetails;

    @SerializedName("need_breakdown")
    private final NeedBreakdown needBreakdown;

    @SerializedName("need_breakdown_formatted")
    private final NeedBreakdownFormatted needBreakdownFormatted;

    @SerializedName("next_schedule_day_label")
    private final String nextScheduleDayLabel;

    @SerializedName("recommended_time_in_bed_formatted")
    private final RecommendedTimeInBedFormatted recommendedTimeInBedFormatted;

    @SerializedName("turn_off_all_modal")
    private final SleepCoachInteractionModal turnOffAllModal;

    @SerializedName("turn_off_schedule_modal")
    private final SleepCoachInteractionModal turnOffScheduleModal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C40674e0(18)), null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HarvardSleepAdviceDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HarvardSleepAdviceDto(int i13, SleepCoachInteractionModal sleepCoachInteractionModal, SleepCoachInteractionModal sleepCoachInteractionModal2, String str, AlarmScheduleState alarmScheduleState, String str2, boolean z4, JsonElement jsonElement, NeedBreakdown needBreakdown, NeedBreakdownFormatted needBreakdownFormatted, RecommendedTimeInBedFormatted recommendedTimeInBedFormatted, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, HarvardSleepAdviceDto$$serializer.INSTANCE.getDescriptor());
        }
        this.turnOffAllModal = sleepCoachInteractionModal;
        this.turnOffScheduleModal = sleepCoachInteractionModal2;
        this.chipLabelTextDisplay = str;
        this.alarmScheduleState = alarmScheduleState;
        this.nextScheduleDayLabel = str2;
        this.menstrualCoachEnabled = z4;
        this.menstrualCoachingDetails = jsonElement;
        this.needBreakdown = needBreakdown;
        this.needBreakdownFormatted = needBreakdownFormatted;
        this.recommendedTimeInBedFormatted = recommendedTimeInBedFormatted;
        this.eligibleForSmartAlarms = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AlarmScheduleState.INSTANCE.serializer();
    }

    public static /* synthetic */ HarvardSleepAdviceDto copy$default(HarvardSleepAdviceDto harvardSleepAdviceDto, SleepCoachInteractionModal sleepCoachInteractionModal, SleepCoachInteractionModal sleepCoachInteractionModal2, String str, AlarmScheduleState alarmScheduleState, String str2, boolean z4, JsonElement jsonElement, NeedBreakdown needBreakdown, NeedBreakdownFormatted needBreakdownFormatted, RecommendedTimeInBedFormatted recommendedTimeInBedFormatted, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            sleepCoachInteractionModal = harvardSleepAdviceDto.turnOffAllModal;
        }
        if ((i13 & 2) != 0) {
            sleepCoachInteractionModal2 = harvardSleepAdviceDto.turnOffScheduleModal;
        }
        if ((i13 & 4) != 0) {
            str = harvardSleepAdviceDto.chipLabelTextDisplay;
        }
        if ((i13 & 8) != 0) {
            alarmScheduleState = harvardSleepAdviceDto.alarmScheduleState;
        }
        if ((i13 & 16) != 0) {
            str2 = harvardSleepAdviceDto.nextScheduleDayLabel;
        }
        if ((i13 & 32) != 0) {
            z4 = harvardSleepAdviceDto.menstrualCoachEnabled;
        }
        if ((i13 & 64) != 0) {
            jsonElement = harvardSleepAdviceDto.menstrualCoachingDetails;
        }
        if ((i13 & 128) != 0) {
            needBreakdown = harvardSleepAdviceDto.needBreakdown;
        }
        if ((i13 & 256) != 0) {
            needBreakdownFormatted = harvardSleepAdviceDto.needBreakdownFormatted;
        }
        if ((i13 & 512) != 0) {
            recommendedTimeInBedFormatted = harvardSleepAdviceDto.recommendedTimeInBedFormatted;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z13 = harvardSleepAdviceDto.eligibleForSmartAlarms;
        }
        RecommendedTimeInBedFormatted recommendedTimeInBedFormatted2 = recommendedTimeInBedFormatted;
        boolean z14 = z13;
        NeedBreakdown needBreakdown2 = needBreakdown;
        NeedBreakdownFormatted needBreakdownFormatted2 = needBreakdownFormatted;
        boolean z15 = z4;
        JsonElement jsonElement2 = jsonElement;
        String str3 = str2;
        String str4 = str;
        return harvardSleepAdviceDto.copy(sleepCoachInteractionModal, sleepCoachInteractionModal2, str4, alarmScheduleState, str3, z15, jsonElement2, needBreakdown2, needBreakdownFormatted2, recommendedTimeInBedFormatted2, z14);
    }

    public static final /* synthetic */ void write$Self$core_release(HarvardSleepAdviceDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        SleepCoachInteractionModal$$serializer sleepCoachInteractionModal$$serializer = SleepCoachInteractionModal$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sleepCoachInteractionModal$$serializer, self.turnOffAllModal);
        output.encodeSerializableElement(serialDesc, 1, sleepCoachInteractionModal$$serializer, self.turnOffScheduleModal);
        output.encodeStringElement(serialDesc, 2, self.chipLabelTextDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.alarmScheduleState);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.nextScheduleDayLabel);
        output.encodeBooleanElement(serialDesc, 5, self.menstrualCoachEnabled);
        output.encodeNullableSerializableElement(serialDesc, 6, C0771n.f2806a, self.menstrualCoachingDetails);
        output.encodeSerializableElement(serialDesc, 7, NeedBreakdown$$serializer.INSTANCE, self.needBreakdown);
        output.encodeSerializableElement(serialDesc, 8, NeedBreakdownFormatted$$serializer.INSTANCE, self.needBreakdownFormatted);
        output.encodeSerializableElement(serialDesc, 9, RecommendedTimeInBedFormatted$$serializer.INSTANCE, self.recommendedTimeInBedFormatted);
        output.encodeBooleanElement(serialDesc, 10, self.eligibleForSmartAlarms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepCoachInteractionModal getTurnOffAllModal() {
        return this.turnOffAllModal;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final RecommendedTimeInBedFormatted getRecommendedTimeInBedFormatted() {
        return this.recommendedTimeInBedFormatted;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getEligibleForSmartAlarms() {
        return this.eligibleForSmartAlarms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SleepCoachInteractionModal getTurnOffScheduleModal() {
        return this.turnOffScheduleModal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChipLabelTextDisplay() {
        return this.chipLabelTextDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AlarmScheduleState getAlarmScheduleState() {
        return this.alarmScheduleState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextScheduleDayLabel() {
        return this.nextScheduleDayLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getMenstrualCoachEnabled() {
        return this.menstrualCoachEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final JsonElement getMenstrualCoachingDetails() {
        return this.menstrualCoachingDetails;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NeedBreakdown getNeedBreakdown() {
        return this.needBreakdown;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final NeedBreakdownFormatted getNeedBreakdownFormatted() {
        return this.needBreakdownFormatted;
    }

    public final HarvardSleepAdviceDto copy(SleepCoachInteractionModal turnOffAllModal, SleepCoachInteractionModal turnOffScheduleModal, String chipLabelTextDisplay, AlarmScheduleState alarmScheduleState, String nextScheduleDayLabel, boolean menstrualCoachEnabled, JsonElement menstrualCoachingDetails, NeedBreakdown needBreakdown, NeedBreakdownFormatted needBreakdownFormatted, RecommendedTimeInBedFormatted recommendedTimeInBedFormatted, boolean eligibleForSmartAlarms) {
        AbstractC22676k.m65750j(turnOffAllModal, "turnOffAllModal");
        AbstractC22676k.m65750j(turnOffScheduleModal, "turnOffScheduleModal");
        AbstractC22676k.m65750j(chipLabelTextDisplay, "chipLabelTextDisplay");
        AbstractC22676k.m65750j(alarmScheduleState, "alarmScheduleState");
        AbstractC22676k.m65750j(needBreakdown, "needBreakdown");
        AbstractC22676k.m65750j(needBreakdownFormatted, "needBreakdownFormatted");
        AbstractC22676k.m65750j(recommendedTimeInBedFormatted, "recommendedTimeInBedFormatted");
        return new HarvardSleepAdviceDto(turnOffAllModal, turnOffScheduleModal, chipLabelTextDisplay, alarmScheduleState, nextScheduleDayLabel, menstrualCoachEnabled, menstrualCoachingDetails, needBreakdown, needBreakdownFormatted, recommendedTimeInBedFormatted, eligibleForSmartAlarms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HarvardSleepAdviceDto)) {
            return false;
        }
        HarvardSleepAdviceDto harvardSleepAdviceDto = (HarvardSleepAdviceDto) other;
        return AbstractC22676k.m65745e(this.turnOffAllModal, harvardSleepAdviceDto.turnOffAllModal) && AbstractC22676k.m65745e(this.turnOffScheduleModal, harvardSleepAdviceDto.turnOffScheduleModal) && AbstractC22676k.m65745e(this.chipLabelTextDisplay, harvardSleepAdviceDto.chipLabelTextDisplay) && this.alarmScheduleState == harvardSleepAdviceDto.alarmScheduleState && AbstractC22676k.m65745e(this.nextScheduleDayLabel, harvardSleepAdviceDto.nextScheduleDayLabel) && this.menstrualCoachEnabled == harvardSleepAdviceDto.menstrualCoachEnabled && AbstractC22676k.m65745e(this.menstrualCoachingDetails, harvardSleepAdviceDto.menstrualCoachingDetails) && AbstractC22676k.m65745e(this.needBreakdown, harvardSleepAdviceDto.needBreakdown) && AbstractC22676k.m65745e(this.needBreakdownFormatted, harvardSleepAdviceDto.needBreakdownFormatted) && AbstractC22676k.m65745e(this.recommendedTimeInBedFormatted, harvardSleepAdviceDto.recommendedTimeInBedFormatted) && this.eligibleForSmartAlarms == harvardSleepAdviceDto.eligibleForSmartAlarms;
    }

    public final AlarmScheduleState getAlarmScheduleState() {
        return this.alarmScheduleState;
    }

    public final String getChipLabelTextDisplay() {
        return this.chipLabelTextDisplay;
    }

    public final boolean getEligibleForSmartAlarms() {
        return this.eligibleForSmartAlarms;
    }

    public final boolean getMenstrualCoachEnabled() {
        return this.menstrualCoachEnabled;
    }

    public final JsonElement getMenstrualCoachingDetails() {
        return this.menstrualCoachingDetails;
    }

    public final NeedBreakdown getNeedBreakdown() {
        return this.needBreakdown;
    }

    public final NeedBreakdownFormatted getNeedBreakdownFormatted() {
        return this.needBreakdownFormatted;
    }

    public final String getNextScheduleDayLabel() {
        return this.nextScheduleDayLabel;
    }

    public final RecommendedTimeInBedFormatted getRecommendedTimeInBedFormatted() {
        return this.recommendedTimeInBedFormatted;
    }

    public final SleepCoachInteractionModal getTurnOffAllModal() {
        return this.turnOffAllModal;
    }

    public final SleepCoachInteractionModal getTurnOffScheduleModal() {
        return this.turnOffScheduleModal;
    }

    public int hashCode() {
        int iHashCode = (this.alarmScheduleState.hashCode() + AbstractC11266d.m30450d((this.turnOffScheduleModal.hashCode() + (this.turnOffAllModal.hashCode() * 31)) * 31, 31, this.chipLabelTextDisplay)) * 31;
        String str = this.nextScheduleDayLabel;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.menstrualCoachEnabled);
        JsonElement jsonElement = this.menstrualCoachingDetails;
        return Boolean.hashCode(this.eligibleForSmartAlarms) + ((this.recommendedTimeInBedFormatted.hashCode() + ((this.needBreakdownFormatted.hashCode() + ((this.needBreakdown.hashCode() + ((iM8289b + (jsonElement != null ? jsonElement.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        SleepCoachInteractionModal sleepCoachInteractionModal = this.turnOffAllModal;
        SleepCoachInteractionModal sleepCoachInteractionModal2 = this.turnOffScheduleModal;
        String str = this.chipLabelTextDisplay;
        AlarmScheduleState alarmScheduleState = this.alarmScheduleState;
        String str2 = this.nextScheduleDayLabel;
        boolean z4 = this.menstrualCoachEnabled;
        JsonElement jsonElement = this.menstrualCoachingDetails;
        NeedBreakdown needBreakdown = this.needBreakdown;
        NeedBreakdownFormatted needBreakdownFormatted = this.needBreakdownFormatted;
        RecommendedTimeInBedFormatted recommendedTimeInBedFormatted = this.recommendedTimeInBedFormatted;
        boolean z13 = this.eligibleForSmartAlarms;
        StringBuilder sb4 = new StringBuilder("HarvardSleepAdviceDto(turnOffAllModal=");
        sb4.append(sleepCoachInteractionModal);
        sb4.append(", turnOffScheduleModal=");
        sb4.append(sleepCoachInteractionModal2);
        sb4.append(", chipLabelTextDisplay=");
        sb4.append(str);
        sb4.append(", alarmScheduleState=");
        sb4.append(alarmScheduleState);
        sb4.append(", nextScheduleDayLabel=");
        AbstractC38963t7.m124390t(sb4, str2, ", menstrualCoachEnabled=", z4, ", menstrualCoachingDetails=");
        sb4.append(jsonElement);
        sb4.append(", needBreakdown=");
        sb4.append(needBreakdown);
        sb4.append(", needBreakdownFormatted=");
        sb4.append(needBreakdownFormatted);
        sb4.append(", recommendedTimeInBedFormatted=");
        sb4.append(recommendedTimeInBedFormatted);
        sb4.append(", eligibleForSmartAlarms=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public HarvardSleepAdviceDto(SleepCoachInteractionModal turnOffAllModal, SleepCoachInteractionModal turnOffScheduleModal, String chipLabelTextDisplay, AlarmScheduleState alarmScheduleState, String str, boolean z4, JsonElement jsonElement, NeedBreakdown needBreakdown, NeedBreakdownFormatted needBreakdownFormatted, RecommendedTimeInBedFormatted recommendedTimeInBedFormatted, boolean z13) {
        AbstractC22676k.m65750j(turnOffAllModal, "turnOffAllModal");
        AbstractC22676k.m65750j(turnOffScheduleModal, "turnOffScheduleModal");
        AbstractC22676k.m65750j(chipLabelTextDisplay, "chipLabelTextDisplay");
        AbstractC22676k.m65750j(alarmScheduleState, "alarmScheduleState");
        AbstractC22676k.m65750j(needBreakdown, "needBreakdown");
        AbstractC22676k.m65750j(needBreakdownFormatted, "needBreakdownFormatted");
        AbstractC22676k.m65750j(recommendedTimeInBedFormatted, "recommendedTimeInBedFormatted");
        this.turnOffAllModal = turnOffAllModal;
        this.turnOffScheduleModal = turnOffScheduleModal;
        this.chipLabelTextDisplay = chipLabelTextDisplay;
        this.alarmScheduleState = alarmScheduleState;
        this.nextScheduleDayLabel = str;
        this.menstrualCoachEnabled = z4;
        this.menstrualCoachingDetails = jsonElement;
        this.needBreakdown = needBreakdown;
        this.needBreakdownFormatted = needBreakdownFormatted;
        this.recommendedTimeInBedFormatted = recommendedTimeInBedFormatted;
        this.eligibleForSmartAlarms = z13;
    }
}
