.class public final Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u007f\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJv\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010)\u001a\u00020\u000b2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00081\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u0017R&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00106\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008;\u0010\u001bR\u001a\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008<\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008=\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008>\u0010\u001bR\u001a\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008@\u0010 R&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u00106\u0012\u0004\u0008B\u00109\u001a\u0004\u0008A\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010:\u001a\u0004\u0008C\u0010\u001b\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;",
        "alarmMode",
        "",
        "",
        "daysScheduledLabelDisplayList",
        "alarmModeLabelDisplay",
        "editLabelDisplay",
        "deleteLabelDisplay",
        "latestWakeTime",
        "",
        "alarmOn",
        "scheduleDaysList",
        "scheduleId",
        "<init>",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Z",
        "component8",
        "component9",
        "copy",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;",
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
        "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;",
        "getAlarmMode",
        "Ljava/util/List;",
        "getDaysScheduledLabelDisplayList",
        "getDaysScheduledLabelDisplayList$annotations",
        "()V",
        "Ljava/lang/String;",
        "getAlarmModeLabelDisplay",
        "getEditLabelDisplay",
        "getDeleteLabelDisplay",
        "getLatestWakeTime",
        "Z",
        "getAlarmOn",
        "getScheduleDaysList",
        "getScheduleDaysList$annotations",
        "getScheduleId",
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

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$Companion;


# instance fields
.field private final alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_mode"
    .end annotation
.end field

.field private final alarmModeLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_mode_label_display"
    .end annotation
.end field

.field private final alarmOn:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_on"
    .end annotation
.end field

.field private final daysScheduledLabelDisplayList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "days_scheduled_label_display"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deleteLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "delete_label_display"
    .end annotation
.end field

.field private final editLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "edit_label_display"
    .end annotation
.end field

.field private final latestWakeTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "latest_wake_time"
    .end annotation
.end field

.field private final scheduleDaysList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "scheduled_days"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final scheduleId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_id"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcb1/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lcb1/a;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lcb1/a;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x9

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v3, v7, v9

    aput-object v5, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

    const/4 v3, 0x4

    aput-object v1, v7, v3

    const/4 v3, 0x5

    aput-object v1, v7, v3

    const/4 v3, 0x6

    aput-object v1, v7, v3

    const/4 v3, 0x7

    aput-object v2, v7, v3

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$$serializer;

    invoke-virtual {p11}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    iput-object p9, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    iput-object p10, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "alarmMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysScheduledLabelDisplayList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmModeLabelDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editLabelDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteLabelDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestWakeTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleDaysList"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleId"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue$Companion;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->copy(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDaysScheduledLabelDisplayList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "days_scheduled_label_display"
    .end annotation

    return-void
.end method

.method public static synthetic getScheduleDaysList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "scheduled_days"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-object p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;"
        }
    .end annotation

    const-string v0, "alarmMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysScheduledLabelDisplayList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmModeLabelDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editLabelDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteLabelDisplay"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestWakeTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleDaysList"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleId"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;-><init>(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    iget-boolean v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAlarmMode()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    return-object v0
.end method

.method public final getAlarmModeLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAlarmOn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    return v0
.end method

.method public final getDaysScheduledLabelDisplayList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    return-object v0
.end method

.method public final getDeleteLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getEditLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatestWakeTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getScheduleDaysList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    return-object v0
.end method

.method public final getScheduleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->daysScheduledLabelDisplayList:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmModeLabelDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->editLabelDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->deleteLabelDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->latestWakeTime:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->alarmOn:Z

    iget-object v7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleDaysList:Ljava/util/List;

    iget-object v8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;->scheduleId:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "AlarmScheduleListDto(alarmMode="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", daysScheduledLabelDisplayList="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", alarmModeLabelDisplay="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", editLabelDisplay="

    const-string v1, ", deleteLabelDisplay="

    invoke-static {v9, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", latestWakeTime="

    const-string v1, ", alarmOn="

    invoke-static {v9, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", scheduleDaysList="

    const-string v1, ", scheduleId="

    invoke-static {v0, v1, v9, v7, v6}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v0, ")"

    invoke-static {v8, v0, v9}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
