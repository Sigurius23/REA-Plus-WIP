.class public final enum Ly00/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ly00/j;

.field public static final enum F:Ly00/j;

.field public static final synthetic G:[Ly00/j;

.field public static final synthetic H:Lt83/b;

.field public static final x:Lt9/p;

.field public static final enum y:Ly00/j;

.field public static final enum z:Ly00/j;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ly00/j;

    const/4 v1, 0x0

    const-string v2, "credit"

    const-string v3, "Credit"

    invoke-direct {v0, v3, v1, v2}, Ly00/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/j;->y:Ly00/j;

    new-instance v1, Ly00/j;

    const/4 v2, 0x1

    const-string v3, "debit"

    const-string v4, "Debit"

    invoke-direct {v1, v4, v2, v3}, Ly00/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/j;->z:Ly00/j;

    new-instance v2, Ly00/j;

    const/4 v3, 0x2

    const-string v4, "prepaid"

    const-string v5, "Prepaid"

    invoke-direct {v2, v5, v3, v4}, Ly00/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/j;->E:Ly00/j;

    new-instance v3, Ly00/j;

    const/4 v4, 0x3

    const-string v5, "unknown"

    const-string v6, "Unknown"

    invoke-direct {v3, v6, v4, v5}, Ly00/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly00/j;->F:Ly00/j;

    filled-new-array {v0, v1, v2, v3}, [Ly00/j;

    move-result-object v0

    sput-object v0, Ly00/j;->G:[Ly00/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/j;->H:Lt83/b;

    new-instance v0, Lt9/p;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    sput-object v0, Ly00/j;->x:Lt9/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/j;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/j;
    .locals 1

    const-class v0, Ly00/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/j;

    return-object p0
.end method

.method public static values()[Ly00/j;
    .locals 1

    sget-object v0, Ly00/j;->G:[Ly00/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/j;

    return-object v0
.end method
