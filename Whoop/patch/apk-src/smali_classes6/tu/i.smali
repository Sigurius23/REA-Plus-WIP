.class public final enum Ltu/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltu/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\u0008\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ltu/i;",
        "",
        "w",
        "x",
        "y",
        "z",
        "E",
        "F",
        "G",
        "sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final enum E:Ltu/i;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rate-limit"
    .end annotation
.end field

.field public static final enum F:Ltu/i;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "in-offline-mode"
    .end annotation
.end field

.field public static final enum G:Ltu/i;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "other"
    .end annotation
.end field

.field public static final synthetic H:[Ltu/i;

.field public static final enum w:Ltu/i;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "success"
    .end annotation
.end field

.field public static final enum x:Ltu/i;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "not-found"
    .end annotation
.end field

.field public static final enum y:Ltu/i;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "server"
    .end annotation
.end field

.field public static final enum z:Ltu/i;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "connection"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ltu/i;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/i;->w:Ltu/i;

    new-instance v1, Ltu/i;

    const-string v2, "NOT_FOUND"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ltu/i;->x:Ltu/i;

    new-instance v2, Ltu/i;

    const-string v3, "SERVER"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ltu/i;->y:Ltu/i;

    new-instance v3, Ltu/i;

    const-string v4, "CONNECTION"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ltu/i;->z:Ltu/i;

    new-instance v4, Ltu/i;

    const-string v5, "RATE_LIMIT"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ltu/i;->E:Ltu/i;

    new-instance v5, Ltu/i;

    const-string v6, "IN_OFFLINE_MODE"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ltu/i;->F:Ltu/i;

    new-instance v6, Ltu/i;

    const-string v7, "OTHER"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ltu/i;->G:Ltu/i;

    filled-new-array/range {v0 .. v6}, [Ltu/i;

    move-result-object v0

    sput-object v0, Ltu/i;->H:[Ltu/i;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ltu/i;
    .locals 1

    const-class v0, Ltu/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltu/i;

    return-object p0
.end method

.method public static values()[Ltu/i;
    .locals 1

    sget-object v0, Ltu/i;->H:[Ltu/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltu/i;

    return-object v0
.end method
