.class public final Lqa3/m0;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:Lqa3/n0;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public static j()Lqa3/m0;
    .locals 2

    new-instance v0, Lqa3/m0;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    const/4 v1, -0x1

    iput v1, v0, Lqa3/m0;->y:I

    sget-object v1, Lqa3/n0;->y:Lqa3/n0;

    iput-object v1, v0, Lqa3/m0;->E:Lqa3/n0;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lqa3/m0;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    const/4 v1, -0x1

    iput v1, v0, Lqa3/m0;->y:I

    sget-object v1, Lqa3/n0;->y:Lqa3/n0;

    iput-object v1, v0, Lqa3/m0;->E:Lqa3/n0;

    invoke-virtual {p0}, Lqa3/m0;->k()Lqa3/o0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/m0;->l(Lqa3/o0;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/m0;->k()Lqa3/o0;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/o0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    throw v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 1

    const/4 p2, 0x0

    :try_start_0
    sget-object v0, Lqa3/o0;->I:Lqa3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lqa3/o0;

    invoke-direct {v0, p1}, Lqa3/o0;-><init>(Lwa3/f;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lqa3/m0;->l(Lqa3/o0;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast v0, Lqa3/o0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lqa3/m0;->l(Lqa3/o0;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/o0;

    invoke-virtual {p0, p1}, Lqa3/m0;->l(Lqa3/o0;)V

    return-object p0
.end method

.method public final k()Lqa3/o0;
    .locals 5

    new-instance v0, Lqa3/o0;

    invoke-direct {v0, p0}, Lqa3/o0;-><init>(Lqa3/m0;)V

    iget v1, p0, Lqa3/m0;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/m0;->y:I

    iput v2, v0, Lqa3/o0;->y:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lqa3/m0;->z:I

    iput v2, v0, Lqa3/o0;->z:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v1, p0, Lqa3/m0;->E:Lqa3/n0;

    iput-object v1, v0, Lqa3/o0;->E:Lqa3/n0;

    iput v3, v0, Lqa3/o0;->x:I

    return-object v0
.end method

.method public final l(Lqa3/o0;)V
    .locals 4

    sget-object v0, Lqa3/o0;->H:Lqa3/o0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/o0;->x:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/o0;->y:I

    iget v3, p0, Lqa3/m0;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/m0;->x:I

    iput v1, p0, Lqa3/m0;->y:I

    :cond_1
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget v1, p1, Lqa3/o0;->z:I

    iget v3, p0, Lqa3/m0;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/m0;->x:I

    iput v1, p0, Lqa3/m0;->z:I

    :cond_2
    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Lqa3/o0;->E:Lqa3/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/m0;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/m0;->x:I

    iput-object v0, p0, Lqa3/m0;->E:Lqa3/n0;

    :cond_3
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/o0;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
