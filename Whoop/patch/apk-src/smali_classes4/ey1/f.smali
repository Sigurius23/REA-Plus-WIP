.class public final enum Ley1/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ley1/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0013\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ley1/f;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "ALARM_ALREADY_DISABLED_AND_SYNC",
        "ALARM_SUCCESSFULLY_DISABLED",
        "LWT_ALREADY_SET_ON_STRAP",
        "INSIDE_WAKE_WINDOW",
        "SUCCESSFULLY_UPDATED_STRAP",
        "STRAP_NOT_READY",
        "ALARM_DISABLED",
        "SLEEP_SCHEDULE_OUT_OF_SYNC",
        "UPDATED_BE_ON_GEN3_DOWNGRADE",
        "SUCCESSFULLY_TRIGGERED_ALARM",
        "ALARM_UPDATED_FROM_STALE_CACHE",
        "EMPTY_READ_FROM_CACHE",
        "metrics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Ley1/f;

.field public static final enum ALARM_ALREADY_DISABLED_AND_SYNC:Ley1/f;

.field public static final enum ALARM_DISABLED:Ley1/f;

.field public static final enum ALARM_SUCCESSFULLY_DISABLED:Ley1/f;

.field public static final enum ALARM_UPDATED_FROM_STALE_CACHE:Ley1/f;

.field public static final enum EMPTY_READ_FROM_CACHE:Ley1/f;

.field public static final enum INSIDE_WAKE_WINDOW:Ley1/f;

.field public static final enum LWT_ALREADY_SET_ON_STRAP:Ley1/f;

.field public static final enum SLEEP_SCHEDULE_OUT_OF_SYNC:Ley1/f;

.field public static final enum STRAP_NOT_READY:Ley1/f;

.field public static final enum SUCCESSFULLY_TRIGGERED_ALARM:Ley1/f;

.field public static final enum SUCCESSFULLY_UPDATED_STRAP:Ley1/f;

.field public static final enum UPDATED_BE_ON_GEN3_DOWNGRADE:Ley1/f;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ley1/f;
    .locals 12

    sget-object v0, Ley1/f;->ALARM_ALREADY_DISABLED_AND_SYNC:Ley1/f;

    sget-object v1, Ley1/f;->ALARM_SUCCESSFULLY_DISABLED:Ley1/f;

    sget-object v2, Ley1/f;->LWT_ALREADY_SET_ON_STRAP:Ley1/f;

    sget-object v3, Ley1/f;->INSIDE_WAKE_WINDOW:Ley1/f;

    sget-object v4, Ley1/f;->SUCCESSFULLY_UPDATED_STRAP:Ley1/f;

    sget-object v5, Ley1/f;->STRAP_NOT_READY:Ley1/f;

    sget-object v6, Ley1/f;->ALARM_DISABLED:Ley1/f;

    sget-object v7, Ley1/f;->SLEEP_SCHEDULE_OUT_OF_SYNC:Ley1/f;

    sget-object v8, Ley1/f;->UPDATED_BE_ON_GEN3_DOWNGRADE:Ley1/f;

    sget-object v9, Ley1/f;->SUCCESSFULLY_TRIGGERED_ALARM:Ley1/f;

    sget-object v10, Ley1/f;->ALARM_UPDATED_FROM_STALE_CACHE:Ley1/f;

    sget-object v11, Ley1/f;->EMPTY_READ_FROM_CACHE:Ley1/f;

    filled-new-array/range {v0 .. v11}, [Ley1/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ley1/f;

    const/4 v1, 0x0

    const-string v2, "strap_and_alarm_perference_disabled_exiting_early"

    const-string v3, "ALARM_ALREADY_DISABLED_AND_SYNC"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->ALARM_ALREADY_DISABLED_AND_SYNC:Ley1/f;

    new-instance v0, Ley1/f;

    const/4 v1, 0x1

    const-string v2, "alarm_preferences_on_strap_updated_to_disabled"

    const-string v3, "ALARM_SUCCESSFULLY_DISABLED"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->ALARM_SUCCESSFULLY_DISABLED:Ley1/f;

    new-instance v0, Ley1/f;

    const/4 v1, 0x2

    const-string v2, "latest_waketime_calculated_is_same_as_strap_exiting_early"

    const-string v3, "LWT_ALREADY_SET_ON_STRAP"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->LWT_ALREADY_SET_ON_STRAP:Ley1/f;

    new-instance v0, Ley1/f;

    const/4 v1, 0x3

    const-string v2, "inside_wake_window_will_not_reset_strap"

    const-string v3, "INSIDE_WAKE_WINDOW"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->INSIDE_WAKE_WINDOW:Ley1/f;

    new-instance v0, Ley1/f;

    const/4 v1, 0x4

    const-string v2, "successfully_updated_strap"

    const-string v3, "SUCCESSFULLY_UPDATED_STRAP"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->SUCCESSFULLY_UPDATED_STRAP:Ley1/f;

    new-instance v0, Ley1/f;

    const/4 v1, 0x5

    const-string v2, "strap_not_ready"

    const-string v3, "STRAP_NOT_READY"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->STRAP_NOT_READY:Ley1/f;

    new-instance v0, Ley1/f;

    const/4 v1, 0x6

    const-string v2, "alarm_disabled"

    const-string v3, "ALARM_DISABLED"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->ALARM_DISABLED:Ley1/f;

    new-instance v0, Ley1/f;

    const/4 v1, 0x7

    const-string v2, "we_are_on_schedule_and_out_of_sync"

    const-string v3, "SLEEP_SCHEDULE_OUT_OF_SYNC"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->SLEEP_SCHEDULE_OUT_OF_SYNC:Ley1/f;

    new-instance v0, Ley1/f;

    const/16 v1, 0x8

    const-string v2, "updated_backend_for_Gen3_downgrade"

    const-string v3, "UPDATED_BE_ON_GEN3_DOWNGRADE"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->UPDATED_BE_ON_GEN3_DOWNGRADE:Ley1/f;

    new-instance v0, Ley1/f;

    const/16 v1, 0x9

    const-string v2, "successfully_triggered_alarm"

    const-string v3, "SUCCESSFULLY_TRIGGERED_ALARM"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->SUCCESSFULLY_TRIGGERED_ALARM:Ley1/f;

    new-instance v0, Ley1/f;

    const/16 v1, 0xa

    const-string v2, "alarm_preferences_updated_from_stale_cache"

    const-string v3, "ALARM_UPDATED_FROM_STALE_CACHE"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->ALARM_UPDATED_FROM_STALE_CACHE:Ley1/f;

    new-instance v0, Ley1/f;

    const/16 v1, 0xb

    const-string v2, "failed_read_smart_alarm_prefs_from_Userdefaults"

    const-string v3, "EMPTY_READ_FROM_CACHE"

    invoke-direct {v0, v3, v1, v2}, Ley1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ley1/f;->EMPTY_READ_FROM_CACHE:Ley1/f;

    invoke-static {}, Ley1/f;->$values()[Ley1/f;

    move-result-object v0

    sput-object v0, Ley1/f;->$VALUES:[Ley1/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ley1/f;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ley1/f;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Ley1/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ley1/f;
    .locals 1

    const-class v0, Ley1/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ley1/f;

    return-object p0
.end method

.method public static values()[Ley1/f;
    .locals 1

    sget-object v0, Ley1/f;->$VALUES:[Ley1/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ley1/f;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ley1/f;->value:Ljava/lang/String;

    return-object v0
.end method
