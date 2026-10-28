.class public final enum Ltu/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltu/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\u0008\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ltu/a;",
        "",
        "w",
        "x",
        "y",
        "z",
        "E",
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
.field public static final enum E:Ltu/a;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "file-system"
    .end annotation
.end field

.field public static final synthetic F:[Ltu/a;

.field public static final enum w:Ltu/a;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "resource-loader"
    .end annotation
.end field

.field public static final enum x:Ltu/a;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "network"
    .end annotation
.end field

.field public static final enum y:Ltu/a;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "database"
    .end annotation
.end field

.field public static final enum z:Ltu/a;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "asset"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ltu/a;

    const-string v1, "RESOURCE_LOADER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/a;->w:Ltu/a;

    new-instance v1, Ltu/a;

    const-string v2, "NETWORK"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ltu/a;->x:Ltu/a;

    new-instance v2, Ltu/a;

    const-string v3, "DATABASE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ltu/a;->y:Ltu/a;

    new-instance v3, Ltu/a;

    const-string v4, "ASSET"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ltu/a;->z:Ltu/a;

    new-instance v4, Ltu/a;

    const-string v5, "FILE_SYSTEM"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ltu/a;->E:Ltu/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Ltu/a;

    move-result-object v0

    sput-object v0, Ltu/a;->F:[Ltu/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ltu/a;
    .locals 1

    const-class v0, Ltu/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltu/a;

    return-object p0
.end method

.method public static values()[Ltu/a;
    .locals 1

    sget-object v0, Ltu/a;->F:[Ltu/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltu/a;

    return-object v0
.end method
