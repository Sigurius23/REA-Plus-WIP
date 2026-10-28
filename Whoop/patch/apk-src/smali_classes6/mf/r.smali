.class public final enum Lmf/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lmf/r;

.field public static final enum x:Lmf/r;

.field public static final enum y:Lmf/r;

.field public static final synthetic z:[Lmf/r;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lmf/r;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmf/r;->w:Lmf/r;

    new-instance v1, Lmf/r;

    const-string v2, "POST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lmf/r;->x:Lmf/r;

    new-instance v2, Lmf/r;

    const-string v3, "PUT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lmf/r;->y:Lmf/r;

    new-instance v3, Lmf/r;

    const-string v4, "PATCH"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lmf/r;

    const-string v5, "DELETE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v5, Lmf/r;

    const-string v6, "HEAD"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v6, Lmf/r;

    const-string v7, "OPTIONS"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array/range {v0 .. v6}, [Lmf/r;

    move-result-object v0

    sput-object v0, Lmf/r;->z:[Lmf/r;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmf/r;
    .locals 1

    const-class v0, Lmf/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmf/r;

    return-object p0
.end method

.method public static values()[Lmf/r;
    .locals 1

    sget-object v0, Lmf/r;->z:[Lmf/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmf/r;

    return-object v0
.end method
