.class public final Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Ba\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+JV\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010/\u001a\u00020.H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008<\u0010$R\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010=\u001a\u0004\u0008>\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010(R\u001a\u0010\u000c\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008A\u0010(R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010B\u001a\u0004\u0008C\u0010+\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;",
        "repeatDays",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;",
        "wakeMode",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;",
        "wakeTime",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;",
        "sleepGoal",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
        "scheduleSaveSuccessModal",
        "scheduleSavingModal",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
        "scheduleSaveErrorModal",
        "<init>",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;",
        "component2",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;",
        "component3",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;",
        "component4",
        "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;",
        "component5",
        "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
        "component6",
        "component7",
        "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
        "copy",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;",
        "getRepeatDays",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;",
        "getWakeMode",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;",
        "getWakeTime",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;",
        "getSleepGoal",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;",
        "getScheduleSaveSuccessModal",
        "getScheduleSavingModal",
        "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;",
        "getScheduleSaveErrorModal",
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

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$Companion;


# instance fields
.field private final repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "repeat_days"
    .end annotation
.end field

.field private final scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_save_error_modal"
    .end annotation
.end field

.field private final scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_save_success_modal"
    .end annotation
.end field

.field private final scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_saving_modal"
    .end annotation
.end field

.field private final sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_goal"
    .end annotation
.end field

.field private final wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "wake_mode"
    .end annotation
.end field

.field private final wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "wake_time"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$$serializer;

    invoke-virtual {p9}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iput-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iput-object p8, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V
    .locals 1

    const-string v0, "repeatDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoal"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSaveSuccessModal"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSavingModal"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSaveErrorModal"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    .line 5
    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    .line 6
    iput-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    .line 7
    iput-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    .line 8
    iput-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    .line 9
    iput-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;ILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->copy(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto$$serializer;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto$$serializer;

    iget-object p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    return-object v0
.end method

.method public final component2()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    return-object v0
.end method

.method public final component3()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    return-object v0
.end method

.method public final component4()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    return-object v0
.end method

.method public final component5()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final component6()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final component7()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-object v0
.end method

.method public final copy(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;
    .locals 9

    const-string v0, "repeatDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wakeTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepGoal"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSaveSuccessModal"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSavingModal"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSaveErrorModal"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;-><init>(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    iget-object p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getRepeatDays()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    return-object v0
.end method

.method public final getScheduleSaveErrorModal()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    return-object v0
.end method

.method public final getScheduleSaveSuccessModal()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final getScheduleSavingModal()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    return-object v0
.end method

.method public final getSleepGoal()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    return-object v0
.end method

.method public final getWakeMode()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    return-object v0
.end method

.method public final getWakeTime()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    invoke-virtual {v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    invoke-virtual {v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    invoke-virtual {v1}, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    invoke-virtual {v0}, Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->repeatDays:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeMode:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->wakeTime:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;

    iget-object v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->sleepGoal:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;

    iget-object v4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveSuccessModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSavingModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;

    iget-object v6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;->scheduleSaveErrorModal:Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "SleepScheduleComponentsDto(repeatDays="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wakeMode="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wakeTime="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepGoal="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scheduleSaveSuccessModal="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scheduleSavingModal="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scheduleSaveErrorModal="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
