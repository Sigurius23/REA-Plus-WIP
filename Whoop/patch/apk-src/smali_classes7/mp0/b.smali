.class public final enum Lmp0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmp0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lmp0/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ALARM_SET_TO_FLOW",
        "LATEST_WAKE_TIME_FLOW",
        "SLEEP_GOAL_FLOW",
        "COLLAPSED_STATE_FLOW",
        "SAVING_STATE_FLOW",
        "EMPTY_STATE",
        "ALARM_SET_REMINDER_FLOW",
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


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lmp0/b;

.field public static final enum ALARM_SET_REMINDER_FLOW:Lmp0/b;

.field public static final enum ALARM_SET_TO_FLOW:Lmp0/b;

.field public static final enum COLLAPSED_STATE_FLOW:Lmp0/b;

.field public static final enum EMPTY_STATE:Lmp0/b;

.field public static final enum LATEST_WAKE_TIME_FLOW:Lmp0/b;

.field public static final enum SAVING_STATE_FLOW:Lmp0/b;

.field public static final enum SLEEP_GOAL_FLOW:Lmp0/b;


# direct methods
.method private static final synthetic $values()[Lmp0/b;
    .locals 7

    sget-object v0, Lmp0/b;->ALARM_SET_TO_FLOW:Lmp0/b;

    sget-object v1, Lmp0/b;->LATEST_WAKE_TIME_FLOW:Lmp0/b;

    sget-object v2, Lmp0/b;->SLEEP_GOAL_FLOW:Lmp0/b;

    sget-object v3, Lmp0/b;->COLLAPSED_STATE_FLOW:Lmp0/b;

    sget-object v4, Lmp0/b;->SAVING_STATE_FLOW:Lmp0/b;

    sget-object v5, Lmp0/b;->EMPTY_STATE:Lmp0/b;

    sget-object v6, Lmp0/b;->ALARM_SET_REMINDER_FLOW:Lmp0/b;

    filled-new-array/range {v0 .. v6}, [Lmp0/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmp0/b;

    const-string v1, "ALARM_SET_TO_FLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmp0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/b;->ALARM_SET_TO_FLOW:Lmp0/b;

    new-instance v0, Lmp0/b;

    const-string v1, "LATEST_WAKE_TIME_FLOW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmp0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/b;->LATEST_WAKE_TIME_FLOW:Lmp0/b;

    new-instance v0, Lmp0/b;

    const-string v1, "SLEEP_GOAL_FLOW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmp0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/b;->SLEEP_GOAL_FLOW:Lmp0/b;

    new-instance v0, Lmp0/b;

    const-string v1, "COLLAPSED_STATE_FLOW"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmp0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/b;->COLLAPSED_STATE_FLOW:Lmp0/b;

    new-instance v0, Lmp0/b;

    const-string v1, "SAVING_STATE_FLOW"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lmp0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/b;->SAVING_STATE_FLOW:Lmp0/b;

    new-instance v0, Lmp0/b;

    const-string v1, "EMPTY_STATE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lmp0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/b;->EMPTY_STATE:Lmp0/b;

    new-instance v0, Lmp0/b;

    const-string v1, "ALARM_SET_REMINDER_FLOW"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lmp0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/b;->ALARM_SET_REMINDER_FLOW:Lmp0/b;

    invoke-static {}, Lmp0/b;->$values()[Lmp0/b;

    move-result-object v0

    sput-object v0, Lmp0/b;->$VALUES:[Lmp0/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmp0/b;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lmp0/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmp0/b;
    .locals 1

    const-class v0, Lmp0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmp0/b;

    return-object p0
.end method

.method public static values()[Lmp0/b;
    .locals 1

    sget-object v0, Lmp0/b;->$VALUES:[Lmp0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmp0/b;

    return-object v0
.end method
