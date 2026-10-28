.class public final enum Lmf/s;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Li93/g;


# static fields
.field public static final synthetic E:[Lmf/s;

.field public static final x:Lmf/a;

.field public static final enum y:Lmf/s;

.field public static final enum z:Lmf/s;


# instance fields
.field public final w:Li93/j;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lmf/s;

    new-instance v1, Li93/j;

    const/16 v2, 0x64

    const/16 v3, 0xc7

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Li93/h;-><init>(III)V

    const-string v2, "INFORMATION"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lmf/s;-><init>(Ljava/lang/String;ILi93/j;)V

    new-instance v1, Lmf/s;

    new-instance v2, Li93/j;

    const/16 v3, 0xc8

    const/16 v5, 0x12b

    invoke-direct {v2, v3, v5, v4}, Li93/h;-><init>(III)V

    const-string v3, "SUCCESS"

    invoke-direct {v1, v3, v4, v2}, Lmf/s;-><init>(Ljava/lang/String;ILi93/j;)V

    sput-object v1, Lmf/s;->y:Lmf/s;

    new-instance v2, Lmf/s;

    new-instance v3, Li93/j;

    const/16 v5, 0x12c

    const/16 v6, 0x18f

    invoke-direct {v3, v5, v6, v4}, Li93/h;-><init>(III)V

    const-string v5, "REDIRECT"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v3}, Lmf/s;-><init>(Ljava/lang/String;ILi93/j;)V

    new-instance v3, Lmf/s;

    new-instance v5, Li93/j;

    const/16 v6, 0x190

    const/16 v7, 0x1f3

    invoke-direct {v5, v6, v7, v4}, Li93/h;-><init>(III)V

    const-string v6, "CLIENT_ERROR"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v5}, Lmf/s;-><init>(Ljava/lang/String;ILi93/j;)V

    new-instance v5, Lmf/s;

    new-instance v6, Li93/j;

    const/16 v7, 0x1f4

    const/16 v8, 0x257

    invoke-direct {v6, v7, v8, v4}, Li93/h;-><init>(III)V

    const-string v4, "SERVER_ERROR"

    const/4 v7, 0x4

    invoke-direct {v5, v4, v7, v6}, Lmf/s;-><init>(Ljava/lang/String;ILi93/j;)V

    sput-object v5, Lmf/s;->z:Lmf/s;

    filled-new-array {v0, v1, v2, v3, v5}, [Lmf/s;

    move-result-object v0

    sput-object v0, Lmf/s;->E:[Lmf/s;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lmf/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmf/s;->x:Lmf/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILi93/j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lmf/s;->w:Li93/j;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmf/s;
    .locals 1

    const-class v0, Lmf/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmf/s;

    return-object p0
.end method

.method public static values()[Lmf/s;
    .locals 1

    sget-object v0, Lmf/s;->E:[Lmf/s;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmf/s;

    return-object v0
.end method


# virtual methods
.method public final d()Ljava/lang/Comparable;
    .locals 1

    iget-object v0, p0, Lmf/s;->w:Li93/j;

    iget v0, v0, Li93/h;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getStart()Ljava/lang/Comparable;
    .locals 1

    iget-object v0, p0, Lmf/s;->w:Li93/j;

    iget v0, v0, Li93/h;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lmf/s;->w:Li93/j;

    invoke-virtual {v0}, Li93/j;->isEmpty()Z

    move-result v0

    return v0
.end method
