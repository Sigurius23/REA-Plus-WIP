.class public final enum Lj43/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lj43/h;

.field public static final enum w:Lj43/h;

.field public static final enum x:Lj43/h;

.field public static final enum y:Lj43/h;

.field public static final enum z:Lj43/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lj43/h;

    const-string v1, "FG_SERVICE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj43/h;->w:Lj43/h;

    new-instance v1, Lj43/h;

    const-string v2, "SERVICE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj43/h;->x:Lj43/h;

    new-instance v2, Lj43/h;

    const-string v3, "ONLY_NOTIFICATION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lj43/h;->y:Lj43/h;

    new-instance v3, Lj43/h;

    const-string v4, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj43/h;->z:Lj43/h;

    filled-new-array {v0, v1, v2, v3}, [Lj43/h;

    move-result-object v0

    sput-object v0, Lj43/h;->E:[Lj43/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj43/h;
    .locals 1

    const-class v0, Lj43/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj43/h;

    return-object p0
.end method

.method public static values()[Lj43/h;
    .locals 1

    sget-object v0, Lj43/h;->E:[Lj43/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj43/h;

    return-object v0
.end method
