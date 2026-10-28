.class public final Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 S2\u00020\u0001:\u0002TSBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010%J\u0082\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010 J\u0010\u00102\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00105\u001a\u00020\n2\u0008\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010@\u001a\u0004\u0008A\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010@\u001a\u0004\u0008B\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010C\u001a\u0004\u0008D\u0010 R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010E\u001a\u0004\u0008F\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010C\u001a\u0004\u0008G\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010H\u001a\u0004\u0008I\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010J\u001a\u0004\u0008K\u0010\'R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010L\u001a\u0004\u0008M\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010N\u001a\u0004\u0008O\u0010+R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010P\u001a\u0004\u0008Q\u0010-R\u001a\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010H\u001a\u0004\u0008R\u0010%\u00a8\u0006U"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;",
        "",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;",
        "turnOffAllModal",
        "turnOffScheduleModal",
        "",
        "chipLabelTextDisplay",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;",
        "alarmScheduleState",
        "nextScheduleDayLabel",
        "",
        "menstrualCoachEnabled",
        "Lkotlinx/serialization/json/JsonElement;",
        "menstrualCoachingDetails",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;",
        "needBreakdown",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;",
        "needBreakdownFormatted",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;",
        "recommendedTimeInBedFormatted",
        "eligibleForSmartAlarms",
        "<init>",
        "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;",
        "component5",
        "component6",
        "()Z",
        "component7",
        "()Lkotlinx/serialization/json/JsonElement;",
        "component8",
        "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;",
        "component9",
        "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;",
        "component10",
        "()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;",
        "component11",
        "copy",
        "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;",
        "getTurnOffAllModal",
        "getTurnOffScheduleModal",
        "Ljava/lang/String;",
        "getChipLabelTextDisplay",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;",
        "getAlarmScheduleState",
        "getNextScheduleDayLabel",
        "Z",
        "getMenstrualCoachEnabled",
        "Lkotlinx/serialization/json/JsonElement;",
        "getMenstrualCoachingDetails",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;",
        "getNeedBreakdown",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;",
        "getNeedBreakdownFormatted",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;",
        "getRecommendedTimeInBedFormatted",
        "getEligibleForSmartAlarms",
        "Companion",
        "$serializer",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$Companion;


# instance fields
.field private final alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_schedule_state"
    .end annotation
.end field

.field private final chipLabelTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "chip_label_text_display"
    .end annotation
.end field

.field private final eligibleForSmartAlarms:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "eligible_for_smart_alarms"
    .end annotation
.end field

.field private final menstrualCoachEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "menstrual_coach_enabled"
    .end annotation
.end field

.field private final menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "menstrual_coaching_details"
    .end annotation
.end field

.field private final needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "need_breakdown"
    .end annotation
.end field

.field private final needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "need_breakdown_formatted"
    .end annotation
.end field

.field private final nextScheduleDayLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "next_schedule_day_label"
    .end annotation
.end field

.field private final recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recommended_time_in_bed_formatted"
    .end annotation
.end field

.field private final turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "turn_off_all_modal"
    .end annotation
.end field

.field private final turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "turn_off_schedule_modal"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->Companion:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lzi1/e0;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lzi1/e0;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xb

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    const/4 v0, 0x7

    aput-object v1, v2, v0

    const/16 v0, 0x8

    aput-object v1, v2, v0

    const/16 v0, 0x9

    aput-object v1, v2, v0

    const/16 v0, 0xa

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$$serializer;

    invoke-virtual {p13}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    iput-object p11, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    iput-boolean p12, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)V
    .locals 1

    const-string v0, "turnOffAllModal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnOffScheduleModal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chipLabelTextDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmScheduleState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "needBreakdown"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "needBreakdownFormatted"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedFormatted"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    .line 11
    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    .line 12
    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    .line 13
    iput-boolean p11, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;->Companion:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState$Companion;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;ZILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-boolean p6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-boolean p11, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    :cond_a
    move-object p12, p10

    move p13, p11

    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->copy(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal$$serializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lad3/n;->a:Lad3/n;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    const/16 v2, 0x9

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xa

    iget-boolean p0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    return-object v0
.end method

.method public final component10()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    return v0
.end method

.method public final component2()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    return v0
.end method

.method public final component7()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component8()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    return-object v0
.end method

.method public final component9()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    return-object v0
.end method

.method public final copy(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;
    .locals 13

    const-string v0, "turnOffAllModal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnOffScheduleModal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chipLabelTextDisplay"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmScheduleState"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "needBreakdown"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "needBreakdownFormatted"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedFormatted"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;-><init>(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    iget-boolean p1, p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAlarmScheduleState()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    return-object v0
.end method

.method public final getChipLabelTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getEligibleForSmartAlarms()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    return v0
.end method

.method public final getMenstrualCoachEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    return v0
.end method

.method public final getMenstrualCoachingDetails()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getNeedBreakdown()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    return-object v0
.end method

.method public final getNeedBreakdownFormatted()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    return-object v0
.end method

.method public final getNextScheduleDayLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecommendedTimeInBedFormatted()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    return-object v0
.end method

.method public final getTurnOffAllModal()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    return-object v0
.end method

.method public final getTurnOffScheduleModal()Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffAllModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->turnOffScheduleModal:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/SleepCoachInteractionModal;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->chipLabelTextDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->alarmScheduleState:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/AlarmScheduleState;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->nextScheduleDayLabel:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachEnabled:Z

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->menstrualCoachingDetails:Lkotlinx/serialization/json/JsonElement;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdown:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;

    iget-object v8, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->needBreakdownFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;

    iget-object v9, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->recommendedTimeInBedFormatted:Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;

    iget-boolean v10, p0, Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;->eligibleForSmartAlarms:Z

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "HarvardSleepAdviceDto(turnOffAllModal="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", turnOffScheduleModal="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", chipLabelTextDisplay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", alarmScheduleState="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nextScheduleDayLabel="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", menstrualCoachEnabled="

    const-string v1, ", menstrualCoachingDetails="

    invoke-static {v11, v4, v0, v5, v1}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", needBreakdown="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", needBreakdownFormatted="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", recommendedTimeInBedFormatted="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", eligibleForSmartAlarms="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
