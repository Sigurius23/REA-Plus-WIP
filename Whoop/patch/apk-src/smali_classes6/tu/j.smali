.class public final enum Ltu/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltu/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\u0008\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ltu/j;",
        "",
        "w",
        "x",
        "y",
        "z",
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
.field public static final synthetic E:[Ltu/j;

.field public static final enum w:Ltu/j;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "network"
    .end annotation
.end field

.field public static final enum x:Ltu/j;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cache"
    .end annotation
.end field

.field public static final enum y:Ltu/j;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tile-store"
    .end annotation
.end field

.field public static final enum z:Ltu/j;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "local-file"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ltu/j;

    const-string v1, "NETWORK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/j;->w:Ltu/j;

    new-instance v1, Ltu/j;

    const-string v2, "CACHE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ltu/j;->x:Ltu/j;

    new-instance v2, Ltu/j;

    const-string v3, "TILE_STORE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ltu/j;->y:Ltu/j;

    new-instance v3, Ltu/j;

    const-string v4, "LOCAL_FILE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ltu/j;->z:Ltu/j;

    filled-new-array {v0, v1, v2, v3}, [Ltu/j;

    move-result-object v0

    sput-object v0, Ltu/j;->E:[Ltu/j;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ltu/j;
    .locals 1

    const-class v0, Ltu/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltu/j;

    return-object p0
.end method

.method public static values()[Ltu/j;
    .locals 1

    sget-object v0, Ltu/j;->E:[Ltu/j;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltu/j;

    return-object v0
.end method
