.class public final enum Lqa3/j;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lwa3/q;


# static fields
.field public static final enum E:Lqa3/j;

.field public static final enum F:Lqa3/j;

.field public static final synthetic G:[Lqa3/j;

.field public static final enum x:Lqa3/j;

.field public static final enum y:Lqa3/j;

.field public static final enum z:Lqa3/j;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lqa3/j;

    const-string v1, "CLASS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lqa3/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqa3/j;->x:Lqa3/j;

    new-instance v1, Lqa3/j;

    const-string v2, "INTERFACE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lqa3/j;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqa3/j;->y:Lqa3/j;

    new-instance v2, Lqa3/j;

    const-string v3, "ENUM_CLASS"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lqa3/j;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lqa3/j;->z:Lqa3/j;

    new-instance v3, Lqa3/j;

    const-string v4, "ENUM_ENTRY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lqa3/j;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lqa3/j;

    const-string v5, "ANNOTATION_CLASS"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lqa3/j;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lqa3/j;->E:Lqa3/j;

    new-instance v5, Lqa3/j;

    const-string v6, "OBJECT"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lqa3/j;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lqa3/j;

    const-string v7, "COMPANION_OBJECT"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lqa3/j;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lqa3/j;->F:Lqa3/j;

    filled-new-array/range {v0 .. v6}, [Lqa3/j;

    move-result-object v0

    sput-object v0, Lqa3/j;->G:[Lqa3/j;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqa3/j;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqa3/j;
    .locals 1

    const-class v0, Lqa3/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa3/j;

    return-object p0
.end method

.method public static values()[Lqa3/j;
    .locals 1

    sget-object v0, Lqa3/j;->G:[Lqa3/j;

    invoke-virtual {v0}, [Lqa3/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa3/j;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lqa3/j;->w:I

    return v0
.end method
