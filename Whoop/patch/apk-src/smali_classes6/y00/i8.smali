.class public final enum Ly00/i8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Ly00/i8;

.field public static final synthetic x:[Ly00/i8;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ly00/i8;

    const/4 v1, 0x0

    const-string v2, "automatic"

    const-string v3, "Automatic"

    invoke-direct {v0, v3, v1, v2}, Ly00/i8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/i8;->w:Ly00/i8;

    new-instance v1, Ly00/i8;

    const/4 v2, 0x1

    const-string v3, "skip"

    const-string v4, "Skip"

    invoke-direct {v1, v4, v2, v3}, Ly00/i8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Ly00/i8;

    const/4 v3, 0x2

    const-string v4, "microdeposits"

    const-string v5, "Microdeposits"

    invoke-direct {v2, v5, v3, v4}, Ly00/i8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Ly00/i8;

    const/4 v4, 0x3

    const-string v5, "instant"

    const-string v6, "Instant"

    invoke-direct {v3, v6, v4, v5}, Ly00/i8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Ly00/i8;

    const/4 v5, 0x4

    const-string v6, "instant_or_skip"

    const-string v7, "InstantOrSkip"

    invoke-direct {v4, v7, v5, v6}, Ly00/i8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Ly00/i8;

    move-result-object v0

    sput-object v0, Ly00/i8;->x:[Ly00/i8;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/i8;
    .locals 1

    const-class v0, Ly00/i8;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/i8;

    return-object p0
.end method

.method public static values()[Ly00/i8;
    .locals 1

    sget-object v0, Ly00/i8;->x:[Ly00/i8;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/i8;

    return-object v0
.end method
