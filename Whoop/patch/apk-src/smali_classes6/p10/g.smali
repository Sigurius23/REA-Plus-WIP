.class public final enum Lp10/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lp10/g;

.field public static final enum x:Lp10/g;

.field public static final enum y:Lp10/g;

.field public static final enum z:Lp10/g;


# instance fields
.field public final w:Ly00/o;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lp10/g;

    const/4 v1, 0x0

    sget-object v2, Ly00/o;->y:Ly00/o;

    const-string v3, "RequestedReuse"

    invoke-direct {v0, v1, v3, v2}, Lp10/g;-><init>(ILjava/lang/String;Ly00/o;)V

    sput-object v0, Lp10/g;->x:Lp10/g;

    new-instance v1, Lp10/g;

    const/4 v2, 0x1

    sget-object v3, Ly00/o;->z:Ly00/o;

    const-string v4, "RequestedNoReuse"

    invoke-direct {v1, v2, v4, v3}, Lp10/g;-><init>(ILjava/lang/String;Ly00/o;)V

    sput-object v1, Lp10/g;->y:Lp10/g;

    new-instance v2, Lp10/g;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "NoRequest"

    invoke-direct {v2, v3, v5, v4}, Lp10/g;-><init>(ILjava/lang/String;Ly00/o;)V

    sput-object v2, Lp10/g;->z:Lp10/g;

    filled-new-array {v0, v1, v2}, [Lp10/g;

    move-result-object v0

    sput-object v0, Lp10/g;->E:[Lp10/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ly00/o;)V
    .locals 0

    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lp10/g;->w:Ly00/o;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp10/g;
    .locals 1

    const-class v0, Lp10/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp10/g;

    return-object p0
.end method

.method public static values()[Lp10/g;
    .locals 1

    sget-object v0, Lp10/g;->E:[Lp10/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp10/g;

    return-object v0
.end method
