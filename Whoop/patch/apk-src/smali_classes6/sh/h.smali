.class public final enum Lsh/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lsh/h;

.field public static final enum w:Lsh/h;

.field public static final enum x:Lsh/h;

.field public static final enum y:Lsh/h;

.field public static final enum z:Lsh/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lsh/h;

    const-string v1, "MEMORY_CACHE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh/h;->w:Lsh/h;

    new-instance v1, Lsh/h;

    const-string v2, "MEMORY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lsh/h;->x:Lsh/h;

    new-instance v2, Lsh/h;

    const-string v3, "DISK"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lsh/h;->y:Lsh/h;

    new-instance v3, Lsh/h;

    const-string v4, "NETWORK"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lsh/h;->z:Lsh/h;

    filled-new-array {v0, v1, v2, v3}, [Lsh/h;

    move-result-object v0

    sput-object v0, Lsh/h;->E:[Lsh/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lsh/h;
    .locals 1

    const-class v0, Lsh/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsh/h;

    return-object p0
.end method

.method public static values()[Lsh/h;
    .locals 1

    sget-object v0, Lsh/h;->E:[Lsh/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsh/h;

    return-object v0
.end method
