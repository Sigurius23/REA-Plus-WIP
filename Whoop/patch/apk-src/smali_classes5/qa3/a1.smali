.class public final enum Lqa3/a1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lwa3/q;


# static fields
.field public static final synthetic E:[Lqa3/a1;

.field public static final enum x:Lqa3/a1;

.field public static final enum y:Lqa3/a1;

.field public static final enum z:Lqa3/a1;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lqa3/a1;

    const-string v1, "IN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lqa3/a1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqa3/a1;->x:Lqa3/a1;

    new-instance v1, Lqa3/a1;

    const-string v2, "OUT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lqa3/a1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqa3/a1;->y:Lqa3/a1;

    new-instance v2, Lqa3/a1;

    const-string v3, "INV"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lqa3/a1;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lqa3/a1;->z:Lqa3/a1;

    filled-new-array {v0, v1, v2}, [Lqa3/a1;

    move-result-object v0

    sput-object v0, Lqa3/a1;->E:[Lqa3/a1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqa3/a1;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqa3/a1;
    .locals 1

    const-class v0, Lqa3/a1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa3/a1;

    return-object p0
.end method

.method public static values()[Lqa3/a1;
    .locals 1

    sget-object v0, Lqa3/a1;->E:[Lqa3/a1;

    invoke-virtual {v0}, [Lqa3/a1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa3/a1;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lqa3/a1;->w:I

    return v0
.end method
