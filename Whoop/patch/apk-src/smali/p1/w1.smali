.class public final enum Lp1/w1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lp1/w1;

.field public static final enum F:Lp1/w1;

.field public static final synthetic G:[Lp1/w1;

.field public static final enum w:Lp1/w1;

.field public static final enum x:Lp1/w1;

.field public static final enum y:Lp1/w1;

.field public static final enum z:Lp1/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lp1/w1;

    const-string v1, "ShutDown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp1/w1;->w:Lp1/w1;

    new-instance v1, Lp1/w1;

    const-string v2, "ShuttingDown"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lp1/w1;->x:Lp1/w1;

    new-instance v2, Lp1/w1;

    const-string v3, "Inactive"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lp1/w1;->y:Lp1/w1;

    new-instance v3, Lp1/w1;

    const-string v4, "InactivePendingWork"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lp1/w1;->z:Lp1/w1;

    new-instance v4, Lp1/w1;

    const-string v5, "Idle"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lp1/w1;->E:Lp1/w1;

    new-instance v5, Lp1/w1;

    const-string v6, "PendingWork"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lp1/w1;->F:Lp1/w1;

    filled-new-array/range {v0 .. v5}, [Lp1/w1;

    move-result-object v0

    sput-object v0, Lp1/w1;->G:[Lp1/w1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp1/w1;
    .locals 1

    const-class v0, Lp1/w1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp1/w1;

    return-object p0
.end method

.method public static values()[Lp1/w1;
    .locals 1

    sget-object v0, Lp1/w1;->G:[Lp1/w1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/w1;

    return-object v0
.end method
