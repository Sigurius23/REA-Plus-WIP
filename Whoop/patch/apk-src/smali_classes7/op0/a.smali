.class public final enum Lop0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lop0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lop0/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SLEEP_NEED",
        "SLEEP_GOAL",
        "LATEST_WAKE_TIME",
        "BED_TIME_SUGGESTION",
        "ALARM_TOGGLE",
        "END_ON_BOARDING",
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

.field private static final synthetic $VALUES:[Lop0/a;

.field public static final enum ALARM_TOGGLE:Lop0/a;

.field public static final enum BED_TIME_SUGGESTION:Lop0/a;

.field public static final enum END_ON_BOARDING:Lop0/a;

.field public static final enum LATEST_WAKE_TIME:Lop0/a;

.field public static final enum SLEEP_GOAL:Lop0/a;

.field public static final enum SLEEP_NEED:Lop0/a;


# direct methods
.method private static final synthetic $values()[Lop0/a;
    .locals 6

    sget-object v0, Lop0/a;->SLEEP_NEED:Lop0/a;

    sget-object v1, Lop0/a;->SLEEP_GOAL:Lop0/a;

    sget-object v2, Lop0/a;->LATEST_WAKE_TIME:Lop0/a;

    sget-object v3, Lop0/a;->BED_TIME_SUGGESTION:Lop0/a;

    sget-object v4, Lop0/a;->ALARM_TOGGLE:Lop0/a;

    sget-object v5, Lop0/a;->END_ON_BOARDING:Lop0/a;

    filled-new-array/range {v0 .. v5}, [Lop0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lop0/a;

    const-string v1, "SLEEP_NEED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lop0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop0/a;->SLEEP_NEED:Lop0/a;

    new-instance v0, Lop0/a;

    const-string v1, "SLEEP_GOAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lop0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop0/a;->SLEEP_GOAL:Lop0/a;

    new-instance v0, Lop0/a;

    const-string v1, "LATEST_WAKE_TIME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lop0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop0/a;->LATEST_WAKE_TIME:Lop0/a;

    new-instance v0, Lop0/a;

    const-string v1, "BED_TIME_SUGGESTION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lop0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop0/a;->BED_TIME_SUGGESTION:Lop0/a;

    new-instance v0, Lop0/a;

    const-string v1, "ALARM_TOGGLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lop0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop0/a;->ALARM_TOGGLE:Lop0/a;

    new-instance v0, Lop0/a;

    const-string v1, "END_ON_BOARDING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lop0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop0/a;->END_ON_BOARDING:Lop0/a;

    invoke-static {}, Lop0/a;->$values()[Lop0/a;

    move-result-object v0

    sput-object v0, Lop0/a;->$VALUES:[Lop0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lop0/a;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lop0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lop0/a;
    .locals 1

    const-class v0, Lop0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lop0/a;

    return-object p0
.end method

.method public static values()[Lop0/a;
    .locals 1

    sget-object v0, Lop0/a;->$VALUES:[Lop0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lop0/a;

    return-object v0
.end method
