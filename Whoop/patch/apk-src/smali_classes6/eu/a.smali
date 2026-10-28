.class public final enum Leu/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Leu/a;

.field public static final enum x:Leu/a;

.field public static final enum y:Leu/a;

.field public static final enum z:Leu/a;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Leu/a;

    const/4 v1, 0x0

    const/4 v2, -0x2

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Leu/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Leu/a;->x:Leu/a;

    new-instance v1, Leu/a;

    const/4 v2, -0x1

    const-string v3, "NO_MOVEMENT_YET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Leu/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Leu/a;->y:Leu/a;

    new-instance v2, Leu/a;

    const-string v3, "GESTURE"

    const/4 v5, 0x2

    invoke-direct {v2, v3, v5, v4}, Leu/a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Leu/a;->z:Leu/a;

    new-instance v3, Leu/a;

    const-string v4, "API_ANIMATION"

    const/4 v6, 0x3

    invoke-direct {v3, v4, v6, v5}, Leu/a;-><init>(Ljava/lang/String;II)V

    new-instance v4, Leu/a;

    const-string v5, "DEVELOPER_ANIMATION"

    const/4 v7, 0x4

    invoke-direct {v4, v5, v7, v6}, Leu/a;-><init>(Ljava/lang/String;II)V

    filled-new-array {v0, v1, v2, v3, v4}, [Leu/a;

    move-result-object v0

    sput-object v0, Leu/a;->E:[Leu/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Leu/a;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Leu/a;
    .locals 1

    const-class v0, Leu/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leu/a;

    return-object p0
.end method

.method public static values()[Leu/a;
    .locals 1

    sget-object v0, Leu/a;->E:[Leu/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leu/a;

    return-object v0
.end method
