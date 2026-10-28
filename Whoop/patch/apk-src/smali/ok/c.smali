.class public final enum Lok/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lok/c;

.field public static final enum F:Lok/c;

.field public static final enum G:Lok/c;

.field public static final synthetic H:[Lok/c;

.field public static final enum x:Lok/c;

.field public static final enum y:Lok/c;

.field public static final enum z:Lok/c;


# instance fields
.field public final w:Li93/j;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lok/c;

    new-instance v1, Li93/j;

    const/16 v2, 0xc8

    const/16 v3, 0x12b

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Li93/h;-><init>(III)V

    const-string v2, "SUCCESS"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lok/c;-><init>(Ljava/lang/String;ILi93/j;)V

    sput-object v0, Lok/c;->x:Lok/c;

    new-instance v1, Lok/c;

    const-string v2, "BAD_REQUEST"

    const/16 v3, 0x190

    invoke-direct {v1, v2, v4, v3}, Lok/c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lok/c;->y:Lok/c;

    new-instance v2, Lok/c;

    const/4 v3, 0x2

    const/16 v5, 0x198

    const-string v6, "TIMEOUT"

    invoke-direct {v2, v6, v3, v5}, Lok/c;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lok/c;->z:Lok/c;

    new-instance v3, Lok/c;

    const/4 v5, 0x3

    const/16 v6, 0x19d

    const-string v7, "PAYLOAD_TOO_LARGE"

    invoke-direct {v3, v7, v5, v6}, Lok/c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lok/c;->E:Lok/c;

    move v5, v4

    new-instance v4, Lok/c;

    const/4 v6, 0x4

    const/16 v7, 0x1ad

    const-string v8, "TOO_MANY_REQUESTS"

    invoke-direct {v4, v8, v6, v7}, Lok/c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lok/c;->F:Lok/c;

    move v6, v5

    new-instance v5, Lok/c;

    new-instance v7, Li93/j;

    const/16 v8, 0x257

    const/16 v9, 0x1f4

    invoke-direct {v7, v9, v8, v6}, Li93/h;-><init>(III)V

    const-string v6, "FAILED"

    const/4 v8, 0x5

    invoke-direct {v5, v6, v8, v7}, Lok/c;-><init>(Ljava/lang/String;ILi93/j;)V

    sput-object v5, Lok/c;->G:Lok/c;

    filled-new-array/range {v0 .. v5}, [Lok/c;

    move-result-object v0

    sput-object v0, Lok/c;->H:[Lok/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 3
    new-instance v0, Li93/j;

    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p3, p3, v1}, Li93/h;-><init>(III)V

    .line 5
    invoke-direct {p0, p1, p2, v0}, Lok/c;-><init>(Ljava/lang/String;ILi93/j;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILi93/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lok/c;->w:Li93/j;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lok/c;
    .locals 1

    const-class v0, Lok/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lok/c;

    return-object p0
.end method

.method public static values()[Lok/c;
    .locals 1

    sget-object v0, Lok/c;->H:[Lok/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lok/c;

    return-object v0
.end method
