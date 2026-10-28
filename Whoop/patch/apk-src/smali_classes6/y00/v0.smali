.class public final enum Ly00/v0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ly00/v0;

.field public static final enum F:Ly00/v0;

.field public static final enum G:Ly00/v0;

.field public static final synthetic H:[Ly00/v0;

.field public static final synthetic I:Lt83/b;

.field public static final x:Lt9/p;

.field public static final enum y:Ly00/v0;

.field public static final enum z:Ly00/v0;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ly00/v0;

    const/4 v1, 0x0

    const-string v2, "PASS"

    const-string v3, "Pass"

    invoke-direct {v0, v3, v1, v2}, Ly00/v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Ly00/v0;

    const/4 v2, 0x1

    const-string v3, "FAIL"

    const-string v4, "Fail"

    invoke-direct {v1, v4, v2, v3}, Ly00/v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/v0;->y:Ly00/v0;

    new-instance v2, Ly00/v0;

    const/4 v3, 0x2

    const-string v4, "UNAVAILABLE"

    const-string v5, "Unavailable"

    invoke-direct {v2, v5, v3, v4}, Ly00/v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/v0;->z:Ly00/v0;

    new-instance v3, Ly00/v0;

    const/4 v4, 0x3

    const-string v5, "UNCHECKED"

    const-string v6, "Unchecked"

    invoke-direct {v3, v6, v4, v5}, Ly00/v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly00/v0;->E:Ly00/v0;

    new-instance v4, Ly00/v0;

    const/4 v5, 0x4

    const-string v6, "STATE_INVALID"

    const-string v7, "StateInvalid"

    invoke-direct {v4, v7, v5, v6}, Ly00/v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Ly00/v0;->F:Ly00/v0;

    new-instance v5, Ly00/v0;

    const/4 v6, 0x5

    const-string v7, "UNKNOWN"

    const-string v8, "Unknown"

    invoke-direct {v5, v8, v6, v7}, Ly00/v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Ly00/v0;->G:Ly00/v0;

    filled-new-array/range {v0 .. v5}, [Ly00/v0;

    move-result-object v0

    sput-object v0, Ly00/v0;->H:[Ly00/v0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/v0;->I:Lt83/b;

    new-instance v0, Lt9/p;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    sput-object v0, Ly00/v0;->x:Lt9/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/v0;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/v0;
    .locals 1

    const-class v0, Ly00/v0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/v0;

    return-object p0
.end method

.method public static values()[Ly00/v0;
    .locals 1

    sget-object v0, Ly00/v0;->H:[Ly00/v0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/v0;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 4

    sget-object v0, Ly00/v0;->E:Ly00/v0;

    sget-object v1, Ly00/v0;->F:Ly00/v0;

    sget-object v2, Ly00/v0;->y:Ly00/v0;

    sget-object v3, Ly00/v0;->z:Ly00/v0;

    filled-new-array {v2, v3, v0, v1}, [Ly00/v0;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
