.class public abstract synthetic Lxe2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I

.field public static final synthetic c:[I

.field public static final synthetic d:[I

.field public static final synthetic e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Lxe2/b;->values()[Lxe2/b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lxe2/b;->REPEAT_DAYS:Lxe2/b;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lxe2/b;->WAKE_MODE:Lxe2/b;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lxe2/b;->WAKE_TIME:Lxe2/b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v4, Lxe2/b;->SLEEP_GOAL:Lxe2/b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x4

    aput v5, v0, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    sput-object v0, Lxe2/e$a;->a:[I

    invoke-static {}, Laf2/b;->values()[Laf2/b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_4
    sget-object v4, Laf2/b;->UNSCHEDULED:Laf2/b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v4, Laf2/b;->CURRENT_SCHEDULE:Laf2/b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v4, Laf2/b;->OTHER_SCHEDULE:Laf2/b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    sput-object v0, Lxe2/e$a;->b:[I

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->values()[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->WAKE_MODE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->WAKE_TIME:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->SLEEP_GOAL:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    sput-object v0, Lxe2/e$a;->c:[I

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;->values()[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_a
    sget-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;->UNSCHEDULED:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    :try_start_b
    sget-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;->CURRENT_SCHEDULE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    sget-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;->OTHER_SCHEDULE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    sput-object v0, Lxe2/e$a;->d:[I

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;->values()[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_d
    sget-object v4, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;->PEAK:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    :try_start_e
    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;->PERFORM:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    :try_start_f
    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;->GET_BY:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    sput-object v0, Lxe2/e$a;->e:[I

    return-void
.end method
