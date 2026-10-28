.class public final enum Lts0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lts0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lts0/e;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ONGOING_TRANSMISSION",
        "TIMED_RATE_LIMITER",
        "MIN_SYNC_THRESHOLD",
        "SYNC_EXCEPTION",
        "STRAP_NOT_READY",
        "TIMEOUT",
        "UNKNOWN_RESULT",
        "connectivity-core_release"
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

.field private static final synthetic $VALUES:[Lts0/e;

.field public static final enum MIN_SYNC_THRESHOLD:Lts0/e;

.field public static final enum ONGOING_TRANSMISSION:Lts0/e;

.field public static final enum STRAP_NOT_READY:Lts0/e;

.field public static final enum SYNC_EXCEPTION:Lts0/e;

.field public static final enum TIMED_RATE_LIMITER:Lts0/e;

.field public static final enum TIMEOUT:Lts0/e;

.field public static final enum UNKNOWN_RESULT:Lts0/e;


# direct methods
.method private static final synthetic $values()[Lts0/e;
    .locals 7

    sget-object v0, Lts0/e;->ONGOING_TRANSMISSION:Lts0/e;

    sget-object v1, Lts0/e;->TIMED_RATE_LIMITER:Lts0/e;

    sget-object v2, Lts0/e;->MIN_SYNC_THRESHOLD:Lts0/e;

    sget-object v3, Lts0/e;->SYNC_EXCEPTION:Lts0/e;

    sget-object v4, Lts0/e;->STRAP_NOT_READY:Lts0/e;

    sget-object v5, Lts0/e;->TIMEOUT:Lts0/e;

    sget-object v6, Lts0/e;->UNKNOWN_RESULT:Lts0/e;

    filled-new-array/range {v0 .. v6}, [Lts0/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lts0/e;

    const-string v1, "ONGOING_TRANSMISSION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lts0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts0/e;->ONGOING_TRANSMISSION:Lts0/e;

    new-instance v0, Lts0/e;

    const-string v1, "TIMED_RATE_LIMITER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lts0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts0/e;->TIMED_RATE_LIMITER:Lts0/e;

    new-instance v0, Lts0/e;

    const-string v1, "MIN_SYNC_THRESHOLD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lts0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts0/e;->MIN_SYNC_THRESHOLD:Lts0/e;

    new-instance v0, Lts0/e;

    const-string v1, "SYNC_EXCEPTION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lts0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts0/e;->SYNC_EXCEPTION:Lts0/e;

    new-instance v0, Lts0/e;

    const-string v1, "STRAP_NOT_READY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lts0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts0/e;->STRAP_NOT_READY:Lts0/e;

    new-instance v0, Lts0/e;

    const-string v1, "TIMEOUT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lts0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts0/e;->TIMEOUT:Lts0/e;

    new-instance v0, Lts0/e;

    const-string v1, "UNKNOWN_RESULT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lts0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts0/e;->UNKNOWN_RESULT:Lts0/e;

    invoke-static {}, Lts0/e;->$values()[Lts0/e;

    move-result-object v0

    sput-object v0, Lts0/e;->$VALUES:[Lts0/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lts0/e;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lts0/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lts0/e;
    .locals 1

    const-class v0, Lts0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lts0/e;

    return-object p0
.end method

.method public static values()[Lts0/e;
    .locals 1

    sget-object v0, Lts0/e;->$VALUES:[Lts0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lts0/e;

    return-object v0
.end method
