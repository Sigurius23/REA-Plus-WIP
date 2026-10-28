.class public final Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 O2\u00020\u0001:\u0002POBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0081\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0080\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\u001cJ\u0010\u0010/\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00102\u001a\u00020\u000b2\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010=\u001a\u0004\u0008>\u0010\u001cR \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010?\u001a\u0004\u0008@\u0010\u001eR\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010A\u001a\u0004\u0008B\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010C\u001a\u0004\u0008D\u0010\"R \u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010E\u0012\u0004\u0008F\u0010G\u001a\u0004\u0008\u000c\u0010$R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008H\u0010$R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008I\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008K\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010J\u001a\u0004\u0008L\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010M\u001a\u0004\u0008N\u0010+\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;",
        "",
        "",
        "allAlarmScheduleLabelDisplay",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
        "alarmScheduleList",
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;",
        "alarmScheduleFooter",
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;",
        "scheduleButtonComponent",
        "",
        "isScheduleEnabled",
        "shouldShowOverlay",
        "scheduleDisabledText",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
        "deleteInProgressModal",
        "deletingSuccessModal",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
        "deleteErrorModal",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;",
        "component4",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;",
        "component5",
        "()Z",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
        "component9",
        "component10",
        "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;",
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
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getAllAlarmScheduleLabelDisplay",
        "Ljava/util/List;",
        "getAlarmScheduleList",
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;",
        "getAlarmScheduleFooter",
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;",
        "getScheduleButtonComponent",
        "Z",
        "isScheduleEnabled$annotations",
        "()V",
        "getShouldShowOverlay",
        "getScheduleDisabledText",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
        "getDeleteInProgressModal",
        "getDeletingSuccessModal",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
        "getDeleteErrorModal",
        "Companion",
        "$serializer",
        "sleep-coach_release"
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

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$Companion;


# instance fields
.field private final alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_schedule_footer"
    .end annotation
.end field

.field private final alarmScheduleList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_schedule_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
            ">;"
        }
    .end annotation
.end field

.field private final allAlarmScheduleLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "all_alarm_schedule_label_display"
    .end annotation
.end field

.field private final deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "delete_error_modal"
    .end annotation
.end field

.field private final deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleting_in_progress_modal"
    .end annotation
.end field

.field private final deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleting_success_modal"
    .end annotation
.end field

.field private final isScheduleEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_enabled"
    .end annotation
.end field

.field private final scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_button_component"
    .end annotation
.end field

.field private final scheduleDisabledText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_disabled_text"
    .end annotation
.end field

.field private final shouldShowOverlay:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "should_show_overlay"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcb1/a;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v2, v3, v5

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    aput-object v1, v3, v4

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$$serializer;

    invoke-virtual {p12}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    iput-boolean p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    iput-boolean p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    iput-object p8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x80

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    goto :goto_0

    :cond_1
    iput-object p9, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    :goto_0
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    goto :goto_1

    :cond_2
    iput-object p10, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    :goto_1
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-void

    :cond_3
    iput-object p11, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
            ">;",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;",
            "ZZ",
            "Ljava/lang/String;",
            "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
            "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
            "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
            ")V"
        }
    .end annotation

    const-string v0, "allAlarmScheduleLabelDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmScheduleList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmScheduleFooter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleButtonComponent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleDisabledText"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    .line 6
    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    .line 8
    iput-boolean p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    .line 11
    iput-object p9, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    .line 12
    iput-object p10, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p11, 0x80

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p8, v0

    :cond_0
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_1

    move-object p9, v0

    :cond_1
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_2

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;ILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-boolean p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-boolean p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isScheduleEnabled$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "schedule_enabled"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto$$serializer;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto$$serializer;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto$$serializer;

    iget-object p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    return-object v0
.end method

.method public final component4()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final component9()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
            ">;",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;",
            "ZZ",
            "Ljava/lang/String;",
            "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
            "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
            "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
            ")",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;"
        }
    .end annotation

    const-string v0, "allAlarmScheduleLabelDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmScheduleList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmScheduleFooter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleButtonComponent"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleDisabledText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    iget-boolean v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    iget-object p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAlarmScheduleFooter()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    return-object v0
.end method

.method public final getAlarmScheduleList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    return-object v0
.end method

.method public final getAllAlarmScheduleLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleteErrorModal()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-object v0
.end method

.method public final getDeleteInProgressModal()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final getDeletingSuccessModal()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final getScheduleButtonComponent()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    return-object v0
.end method

.method public final getScheduleDisabledText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldShowOverlay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    invoke-virtual {v2}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public final isScheduleEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->allAlarmScheduleLabelDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleList:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->alarmScheduleFooter:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleButtonComponent:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;

    iget-boolean v4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->isScheduleEnabled:Z

    iget-boolean v5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->shouldShowOverlay:Z

    iget-object v6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->scheduleDisabledText:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteInProgressModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deletingSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v9, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;->deleteErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    const-string v10, ", alarmScheduleList="

    const-string v11, ", alarmScheduleFooter="

    const-string v12, "SleepScheduleDto(allAlarmScheduleLabelDisplay="

    invoke-static {v12, v0, v10, v11, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scheduleButtonComponent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isScheduleEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowOverlay="

    const-string v2, ", scheduleDisabledText="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deleteInProgressModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deletingSuccessModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deleteErrorModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
