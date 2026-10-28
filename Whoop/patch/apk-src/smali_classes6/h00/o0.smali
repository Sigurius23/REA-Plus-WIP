.class public final enum Lh00/o0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lh00/o0;

.field public static final enum x:Lh00/o0;

.field public static final enum y:Lh00/o0;

.field public static final enum z:Lh00/o0;


# instance fields
.field public final w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lh00/o0;

    const-string v1, "Enabled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lh00/o0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lh00/o0;->x:Lh00/o0;

    new-instance v1, Lh00/o0;

    const-string v3, "Disabled"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lh00/o0;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lh00/o0;->y:Lh00/o0;

    new-instance v2, Lh00/o0;

    const-string v3, "Processing"

    const/4 v5, 0x2

    invoke-direct {v2, v3, v5, v4}, Lh00/o0;-><init>(Ljava/lang/String;IZ)V

    sput-object v2, Lh00/o0;->z:Lh00/o0;

    new-instance v3, Lh00/o0;

    const-string v5, "Completed"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v4}, Lh00/o0;-><init>(Ljava/lang/String;IZ)V

    filled-new-array {v0, v1, v2, v3}, [Lh00/o0;

    move-result-object v0

    sput-object v0, Lh00/o0;->E:[Lh00/o0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lh00/o0;->w:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lh00/o0;
    .locals 1

    const-class v0, Lh00/o0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh00/o0;

    return-object p0
.end method

.method public static values()[Lh00/o0;
    .locals 1

    sget-object v0, Lh00/o0;->E:[Lh00/o0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh00/o0;

    return-object v0
.end method
