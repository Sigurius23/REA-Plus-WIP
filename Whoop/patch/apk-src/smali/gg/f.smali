.class public final enum Lgg/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lgg/f;

.field public static final enum w:Lgg/f;

.field public static final enum x:Lgg/f;

.field public static final enum y:Lgg/f;

.field public static final enum z:Lgg/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lgg/f;

    const-string v1, "ServerSide"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgg/f;->w:Lgg/f;

    new-instance v1, Lgg/f;

    const-string v2, "ClientSide"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgg/f;->x:Lgg/f;

    new-instance v2, Lgg/f;

    const-string v3, "Throttling"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lgg/f;->y:Lgg/f;

    new-instance v3, Lgg/f;

    const-string v4, "Transient"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lgg/f;->z:Lgg/f;

    filled-new-array {v0, v1, v2, v3}, [Lgg/f;

    move-result-object v0

    sput-object v0, Lgg/f;->E:[Lgg/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgg/f;
    .locals 1

    const-class v0, Lgg/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method public static values()[Lgg/f;
    .locals 1

    sget-object v0, Lgg/f;->E:[Lgg/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgg/f;

    return-object v0
.end method
