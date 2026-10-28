.class public final enum Ltu/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltu/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0003\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\u0008\u0002j\u0002\u0008\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltu/f;",
        "",
        "w",
        "x",
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
.field public static final enum w:Ltu/f;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "regular"
    .end annotation
.end field

.field public static final enum x:Ltu/f;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "low"
    .end annotation
.end field

.field public static final synthetic y:[Ltu/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ltu/f;

    const-string v1, "REGULAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/f;->w:Ltu/f;

    new-instance v1, Ltu/f;

    const-string v2, "LOW"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ltu/f;->x:Ltu/f;

    filled-new-array {v0, v1}, [Ltu/f;

    move-result-object v0

    sput-object v0, Ltu/f;->y:[Ltu/f;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ltu/f;
    .locals 1

    const-class v0, Ltu/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltu/f;

    return-object p0
.end method

.method public static values()[Ltu/f;
    .locals 1

    sget-object v0, Ltu/f;->y:[Ltu/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltu/f;

    return-object v0
.end method
