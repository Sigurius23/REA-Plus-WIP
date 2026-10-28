.class public final enum Ly00/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Ly00/z;

.field public static final synthetic F:Lt83/b;

.field public static final y:Lt9/c0;

.field public static final enum z:Ly00/z;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ly00/j;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ly00/z;

    const-string v1, "CREDIT"

    sget-object v2, Ly00/j;->y:Ly00/j;

    const-string v3, "Credit"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ly00/z;-><init>(Ljava/lang/String;ILjava/lang/String;Ly00/j;)V

    new-instance v1, Ly00/z;

    const-string v2, "DEBIT"

    sget-object v3, Ly00/j;->z:Ly00/j;

    const-string v4, "Debit"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v3}, Ly00/z;-><init>(Ljava/lang/String;ILjava/lang/String;Ly00/j;)V

    new-instance v2, Ly00/z;

    const-string v3, "PREPAID"

    sget-object v4, Ly00/j;->E:Ly00/j;

    const-string v5, "Prepaid"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v3, v4}, Ly00/z;-><init>(Ljava/lang/String;ILjava/lang/String;Ly00/j;)V

    new-instance v3, Ly00/z;

    const-string v4, "UNKNOWN"

    sget-object v5, Ly00/j;->F:Ly00/j;

    const-string v6, "Unknown"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4, v5}, Ly00/z;-><init>(Ljava/lang/String;ILjava/lang/String;Ly00/j;)V

    sput-object v3, Ly00/z;->z:Ly00/z;

    filled-new-array {v0, v1, v2, v3}, [Ly00/z;

    move-result-object v0

    sput-object v0, Ly00/z;->E:[Ly00/z;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/z;->F:Lt83/b;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly00/z;->y:Lt9/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ly00/j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/z;->w:Ljava/lang/String;

    iput-object p4, p0, Ly00/z;->x:Ly00/j;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/z;
    .locals 1

    const-class v0, Ly00/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/z;

    return-object p0
.end method

.method public static values()[Ly00/z;
    .locals 1

    sget-object v0, Ly00/z;->E:[Ly00/z;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/z;

    return-object v0
.end method
