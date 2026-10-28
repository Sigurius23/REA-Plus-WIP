.class public final enum Lr53/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lr53/g;

.field public static final synthetic F:[Lr53/g;

.field public static final enum x:Lr53/g;

.field public static final enum y:Lr53/g;

.field public static final enum z:Lr53/g;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lr53/g;

    const-string v1, "ROTATE_0"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lr53/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lr53/g;->x:Lr53/g;

    new-instance v1, Lr53/g;

    const/4 v2, 0x1

    const/16 v3, 0x5a

    const-string v4, "ROTATE_90"

    invoke-direct {v1, v4, v2, v3}, Lr53/g;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lr53/g;->y:Lr53/g;

    new-instance v2, Lr53/g;

    const/4 v3, 0x2

    const/16 v4, 0xb4

    const-string v5, "ROTATE_180"

    invoke-direct {v2, v5, v3, v4}, Lr53/g;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lr53/g;->z:Lr53/g;

    new-instance v3, Lr53/g;

    const/4 v4, 0x3

    const/16 v5, 0x10e

    const-string v6, "ROTATE_270"

    invoke-direct {v3, v6, v4, v5}, Lr53/g;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lr53/g;->E:Lr53/g;

    filled-new-array {v0, v1, v2, v3}, [Lr53/g;

    move-result-object v0

    sput-object v0, Lr53/g;->F:[Lr53/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lr53/g;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr53/g;
    .locals 1

    const-class v0, Lr53/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr53/g;

    return-object p0
.end method

.method public static values()[Lr53/g;
    .locals 1

    sget-object v0, Lr53/g;->F:[Lr53/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr53/g;

    return-object v0
.end method
