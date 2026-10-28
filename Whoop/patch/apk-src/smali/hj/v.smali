.class public final enum Lhj/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lhj/v;

.field public static final synthetic F:[Lhj/v;

.field public static final enum x:Lhj/v;

.field public static final enum y:Lhj/v;

.field public static final enum z:Lhj/v;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lhj/v;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lhj/v;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lhj/v;

    const-string v2, "ERROR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lhj/v;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lhj/v;->x:Lhj/v;

    new-instance v2, Lhj/v;

    const-string v3, "WARN"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lhj/v;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lhj/v;->y:Lhj/v;

    new-instance v3, Lhj/v;

    const-string v4, "VERBOSE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lhj/v;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lhj/v;->z:Lhj/v;

    new-instance v4, Lhj/v;

    const-string v5, "DEBUG"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lhj/v;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lhj/v;->E:Lhj/v;

    filled-new-array {v0, v1, v2, v3, v4}, [Lhj/v;

    move-result-object v0

    sput-object v0, Lhj/v;->F:[Lhj/v;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lhj/v;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhj/v;
    .locals 1

    const-class v0, Lhj/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhj/v;

    return-object p0
.end method

.method public static values()[Lhj/v;
    .locals 1

    sget-object v0, Lhj/v;->F:[Lhj/v;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhj/v;

    return-object v0
.end method
