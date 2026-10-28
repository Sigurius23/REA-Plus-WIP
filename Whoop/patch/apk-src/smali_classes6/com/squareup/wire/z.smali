.class public final enum Lcom/squareup/wire/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lcom/squareup/wire/z;

.field public static final enum F:Lcom/squareup/wire/z;

.field public static final synthetic G:[Lcom/squareup/wire/z;

.field public static final enum w:Lcom/squareup/wire/z;

.field public static final enum x:Lcom/squareup/wire/z;

.field public static final enum y:Lcom/squareup/wire/z;

.field public static final enum z:Lcom/squareup/wire/z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/squareup/wire/z;

    const-string v1, "REQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/wire/z;->w:Lcom/squareup/wire/z;

    new-instance v1, Lcom/squareup/wire/z;

    const-string v2, "OPTIONAL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/squareup/wire/z;->x:Lcom/squareup/wire/z;

    new-instance v2, Lcom/squareup/wire/z;

    const-string v3, "REPEATED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;

    new-instance v3, Lcom/squareup/wire/z;

    const-string v4, "ONE_OF"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/squareup/wire/z;->z:Lcom/squareup/wire/z;

    new-instance v4, Lcom/squareup/wire/z;

    const-string v5, "PACKED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/squareup/wire/z;->E:Lcom/squareup/wire/z;

    new-instance v5, Lcom/squareup/wire/z;

    const-string v6, "OMIT_IDENTITY"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;

    filled-new-array/range {v0 .. v5}, [Lcom/squareup/wire/z;

    move-result-object v0

    sput-object v0, Lcom/squareup/wire/z;->G:[Lcom/squareup/wire/z;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/wire/z;
    .locals 1

    const-class v0, Lcom/squareup/wire/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/squareup/wire/z;

    return-object p0
.end method

.method public static values()[Lcom/squareup/wire/z;
    .locals 1

    sget-object v0, Lcom/squareup/wire/z;->G:[Lcom/squareup/wire/z;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/wire/z;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    sget-object v0, Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/squareup/wire/z;->E:Lcom/squareup/wire/z;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
