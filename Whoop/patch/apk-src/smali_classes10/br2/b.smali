.class public final enum Lbr2/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbr2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lbr2/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "BED_TIME_VARIABILITY",
        "NEGATIVE_RECOVERY_TREND",
        "NEUTRAL",
        "POSITIVE_RECOVERY_TREND",
        "RECOVERY",
        "STRAIN",
        "WAKE_TIME_VARIABILITY",
        "LIGHT_SLEEP",
        "SLEEP_DEEP_SLEEP",
        "user-journey_release"
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

.field private static final synthetic $VALUES:[Lbr2/b;

.field public static final enum BED_TIME_VARIABILITY:Lbr2/b;

.field public static final enum LIGHT_SLEEP:Lbr2/b;

.field public static final enum NEGATIVE_RECOVERY_TREND:Lbr2/b;

.field public static final enum NEUTRAL:Lbr2/b;

.field public static final enum POSITIVE_RECOVERY_TREND:Lbr2/b;

.field public static final enum RECOVERY:Lbr2/b;

.field public static final enum SLEEP_DEEP_SLEEP:Lbr2/b;

.field public static final enum STRAIN:Lbr2/b;

.field public static final enum WAKE_TIME_VARIABILITY:Lbr2/b;


# direct methods
.method private static final synthetic $values()[Lbr2/b;
    .locals 9

    sget-object v0, Lbr2/b;->BED_TIME_VARIABILITY:Lbr2/b;

    sget-object v1, Lbr2/b;->NEGATIVE_RECOVERY_TREND:Lbr2/b;

    sget-object v2, Lbr2/b;->NEUTRAL:Lbr2/b;

    sget-object v3, Lbr2/b;->POSITIVE_RECOVERY_TREND:Lbr2/b;

    sget-object v4, Lbr2/b;->RECOVERY:Lbr2/b;

    sget-object v5, Lbr2/b;->STRAIN:Lbr2/b;

    sget-object v6, Lbr2/b;->WAKE_TIME_VARIABILITY:Lbr2/b;

    sget-object v7, Lbr2/b;->LIGHT_SLEEP:Lbr2/b;

    sget-object v8, Lbr2/b;->SLEEP_DEEP_SLEEP:Lbr2/b;

    filled-new-array/range {v0 .. v8}, [Lbr2/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbr2/b;

    const-string v1, "BED_TIME_VARIABILITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->BED_TIME_VARIABILITY:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "NEGATIVE_RECOVERY_TREND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->NEGATIVE_RECOVERY_TREND:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "NEUTRAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->NEUTRAL:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "POSITIVE_RECOVERY_TREND"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->POSITIVE_RECOVERY_TREND:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "RECOVERY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->RECOVERY:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "STRAIN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->STRAIN:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "WAKE_TIME_VARIABILITY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->WAKE_TIME_VARIABILITY:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "LIGHT_SLEEP"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->LIGHT_SLEEP:Lbr2/b;

    new-instance v0, Lbr2/b;

    const-string v1, "SLEEP_DEEP_SLEEP"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lbr2/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbr2/b;->SLEEP_DEEP_SLEEP:Lbr2/b;

    invoke-static {}, Lbr2/b;->$values()[Lbr2/b;

    move-result-object v0

    sput-object v0, Lbr2/b;->$VALUES:[Lbr2/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lbr2/b;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lbr2/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbr2/b;
    .locals 1

    const-class v0, Lbr2/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbr2/b;

    return-object p0
.end method

.method public static values()[Lbr2/b;
    .locals 1

    sget-object v0, Lbr2/b;->$VALUES:[Lbr2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbr2/b;

    return-object v0
.end method
