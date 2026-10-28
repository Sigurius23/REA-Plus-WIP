.class public final enum Ldd3/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Ldd3/b;

.field public static final enum x:Ldd3/b;

.field public static final enum y:Ldd3/b;

.field public static final enum z:Ldd3/b;


# instance fields
.field public final w:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ldd3/b;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "DEFAULT"

    invoke-direct {v0, v4, v1, v2, v3}, Ldd3/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ldd3/b;->x:Ldd3/b;

    new-instance v1, Ldd3/b;

    const/4 v2, 0x1

    const-wide v3, 0x200000000L

    const-string v5, "SIGNED"

    invoke-direct {v1, v5, v2, v3, v4}, Ldd3/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, Ldd3/b;->y:Ldd3/b;

    new-instance v2, Ldd3/b;

    const/4 v3, 0x2

    const-wide v4, 0x400000000L

    const-string v6, "FIXED"

    invoke-direct {v2, v6, v3, v4, v5}, Ldd3/b;-><init>(Ljava/lang/String;IJ)V

    sput-object v2, Ldd3/b;->z:Ldd3/b;

    filled-new-array {v0, v1, v2}, [Ldd3/b;

    move-result-object v0

    sput-object v0, Ldd3/b;->E:[Ldd3/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Ldd3/b;->w:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldd3/b;
    .locals 1

    const-class v0, Ldd3/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldd3/b;

    return-object p0
.end method

.method public static values()[Ldd3/b;
    .locals 1

    sget-object v0, Ldd3/b;->E:[Ldd3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldd3/b;

    return-object v0
.end method
