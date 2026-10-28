.class public final enum Ltd1/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltd1/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Ltd1/e;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "isReady",
        "()Z",
        "CONNECTION_FAILED",
        "NONE",
        "BONDING",
        "CONNECTING",
        "REGISTERING",
        "INITIALIZING",
        "LOCKED",
        "READY",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Ltd1/e;

.field public static final enum BONDING:Ltd1/e;

.field public static final enum CONNECTING:Ltd1/e;

.field public static final enum CONNECTION_FAILED:Ltd1/e;

.field public static final enum INITIALIZING:Ltd1/e;

.field public static final enum LOCKED:Ltd1/e;

.field public static final enum NONE:Ltd1/e;

.field public static final enum READY:Ltd1/e;

.field public static final enum REGISTERING:Ltd1/e;


# direct methods
.method private static final synthetic $values()[Ltd1/e;
    .locals 8

    sget-object v0, Ltd1/e;->CONNECTION_FAILED:Ltd1/e;

    sget-object v1, Ltd1/e;->NONE:Ltd1/e;

    sget-object v2, Ltd1/e;->BONDING:Ltd1/e;

    sget-object v3, Ltd1/e;->CONNECTING:Ltd1/e;

    sget-object v4, Ltd1/e;->REGISTERING:Ltd1/e;

    sget-object v5, Ltd1/e;->INITIALIZING:Ltd1/e;

    sget-object v6, Ltd1/e;->LOCKED:Ltd1/e;

    sget-object v7, Ltd1/e;->READY:Ltd1/e;

    filled-new-array/range {v0 .. v7}, [Ltd1/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltd1/e;

    const-string v1, "CONNECTION_FAILED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->CONNECTION_FAILED:Ltd1/e;

    new-instance v0, Ltd1/e;

    const-string v1, "NONE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->NONE:Ltd1/e;

    new-instance v0, Ltd1/e;

    const-string v1, "BONDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->BONDING:Ltd1/e;

    new-instance v0, Ltd1/e;

    const-string v1, "CONNECTING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->CONNECTING:Ltd1/e;

    new-instance v0, Ltd1/e;

    const-string v1, "REGISTERING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->REGISTERING:Ltd1/e;

    new-instance v0, Ltd1/e;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->INITIALIZING:Ltd1/e;

    new-instance v0, Ltd1/e;

    const-string v1, "LOCKED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->LOCKED:Ltd1/e;

    new-instance v0, Ltd1/e;

    const-string v1, "READY"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ltd1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltd1/e;->READY:Ltd1/e;

    invoke-static {}, Ltd1/e;->$values()[Ltd1/e;

    move-result-object v0

    sput-object v0, Ltd1/e;->$VALUES:[Ltd1/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ltd1/e;->$ENTRIES:Lt83/a;

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

    sget-object v0, Ltd1/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltd1/e;
    .locals 1

    const-class v0, Ltd1/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltd1/e;

    return-object p0
.end method

.method public static values()[Ltd1/e;
    .locals 1

    sget-object v0, Ltd1/e;->$VALUES:[Ltd1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltd1/e;

    return-object v0
.end method


# virtual methods
.method public final isReady()Z
    .locals 1

    sget-object v0, Ltd1/e;->READY:Ltd1/e;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
