.class public final enum Lf23/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lf23/a;

.field public static final enum F:Lf23/a;

.field public static final synthetic G:[Lf23/a;

.field public static final w:Lkr/e;

.field public static final enum x:Lf23/a;

.field public static final enum y:Lf23/a;

.field public static final enum z:Lf23/a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lf23/a;

    const-string v1, "NOT_DETECTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf23/a;->x:Lf23/a;

    new-instance v1, Lf23/a;

    const-string v2, "UP"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf23/a;->y:Lf23/a;

    new-instance v2, Lf23/a;

    const-string v3, "DOWN"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lf23/a;->z:Lf23/a;

    new-instance v3, Lf23/a;

    const-string v4, "LEFT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lf23/a;->E:Lf23/a;

    new-instance v4, Lf23/a;

    const-string v5, "RIGHT"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lf23/a;->F:Lf23/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lf23/a;

    move-result-object v0

    sput-object v0, Lf23/a;->G:[Lf23/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lkr/e;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, Lf23/a;->w:Lkr/e;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf23/a;
    .locals 1

    const-class v0, Lf23/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf23/a;

    return-object p0
.end method

.method public static values()[Lf23/a;
    .locals 1

    sget-object v0, Lf23/a;->G:[Lf23/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf23/a;

    return-object v0
.end method
