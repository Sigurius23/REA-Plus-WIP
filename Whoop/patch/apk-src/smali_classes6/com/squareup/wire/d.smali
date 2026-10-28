.class public final enum Lcom/squareup/wire/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lcom/squareup/wire/d;

.field public static final synthetic F:[Lcom/squareup/wire/d;

.field public static final enum x:Lcom/squareup/wire/d;

.field public static final enum y:Lcom/squareup/wire/d;

.field public static final enum z:Lcom/squareup/wire/d;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/squareup/wire/d;

    const-string v1, "VARINT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/squareup/wire/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    new-instance v1, Lcom/squareup/wire/d;

    const-string v2, "FIXED64"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/squareup/wire/d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/squareup/wire/d;->y:Lcom/squareup/wire/d;

    new-instance v2, Lcom/squareup/wire/d;

    const-string v3, "LENGTH_DELIMITED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/squareup/wire/d;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    new-instance v3, Lcom/squareup/wire/d;

    const/4 v4, 0x3

    const/4 v5, 0x5

    const-string v6, "FIXED32"

    invoke-direct {v3, v6, v4, v5}, Lcom/squareup/wire/d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/squareup/wire/d;->E:Lcom/squareup/wire/d;

    filled-new-array {v0, v1, v2, v3}, [Lcom/squareup/wire/d;

    move-result-object v0

    sput-object v0, Lcom/squareup/wire/d;->F:[Lcom/squareup/wire/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/squareup/wire/d;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/wire/d;
    .locals 1

    const-class v0, Lcom/squareup/wire/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/squareup/wire/d;

    return-object p0
.end method

.method public static values()[Lcom/squareup/wire/d;
    .locals 1

    sget-object v0, Lcom/squareup/wire/d;->F:[Lcom/squareup/wire/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/wire/d;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/squareup/wire/q;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->FIXED32:Lcom/squareup/wire/q;

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lcom/squareup/wire/q;->BYTES:Lcom/squareup/wire/q;

    return-object v0

    :cond_2
    sget-object v0, Lcom/squareup/wire/q;->FIXED64:Lcom/squareup/wire/q;

    return-object v0

    :cond_3
    sget-object v0, Lcom/squareup/wire/q;->UINT64:Lcom/squareup/wire/q;

    return-object v0
.end method
