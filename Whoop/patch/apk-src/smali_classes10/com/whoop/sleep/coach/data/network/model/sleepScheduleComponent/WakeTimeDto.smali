.class public final Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008.\u0010\u001aR\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008/\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;",
        "",
        "",
        "wakeTimeLabelDisplay",
        "wakeTimeSaveButtonLabelDisplay",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;",
        "alarmToWakeTimeDescriptionMap",
        "helpIconLink",
        "latestWakeTime",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getWakeTimeLabelDisplay",
        "getWakeTimeSaveButtonLabelDisplay",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;",
        "getAlarmToWakeTimeDescriptionMap",
        "getHelpIconLink",
        "getLatestWakeTime",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$Companion;


# instance fields
.field private final alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_to_wake_time_description_map"
    .end annotation
.end field

.field private final helpIconLink:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "help_icon_link"
    .end annotation
.end field

.field private final latestWakeTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "latest_wake_time"
    .end annotation
.end field

.field private final wakeTimeLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "wake_time_label_display"
    .end annotation
.end field

.field private final wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "wake_time_save_button_label_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$$serializer;

    invoke-virtual {p7}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "wakeTimeLabelDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeTimeSaveButtonLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmToWakeTimeDescriptionMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpIconLink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestWakeTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    .line 6
    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;
    .locals 7

    const-string v0, "wakeTimeLabelDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeTimeSaveButtonLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmToWakeTimeDescriptionMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpIconLink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestWakeTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAlarmToWakeTimeDescriptionMap()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    return-object v0
.end method

.method public final getHelpIconLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatestWakeTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getWakeTimeLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getWakeTimeSaveButtonLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    invoke-virtual {v2}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeLabelDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->wakeTimeSaveButtonLabelDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->alarmToWakeTimeDescriptionMap:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->helpIconLink:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->latestWakeTime:Ljava/lang/String;

    const-string v5, ", wakeTimeSaveButtonLabelDisplay="

    const-string v6, ", alarmToWakeTimeDescriptionMap="

    const-string v7, "WakeTimeDto(wakeTimeLabelDisplay="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", helpIconLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", latestWakeTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
