.class public final Lqa3/s0;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:I

.field public x:I

.field public y:Lqa3/t0;

.field public z:Lqa3/w0;


# direct methods
.method public static j()Lqa3/s0;
    .locals 2

    new-instance v0, Lqa3/s0;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Lqa3/t0;->z:Lqa3/t0;

    iput-object v1, v0, Lqa3/s0;->y:Lqa3/t0;

    sget-object v1, Lqa3/w0;->U:Lqa3/w0;

    iput-object v1, v0, Lqa3/s0;->z:Lqa3/w0;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lqa3/s0;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Lqa3/t0;->z:Lqa3/t0;

    iput-object v1, v0, Lqa3/s0;->y:Lqa3/t0;

    sget-object v1, Lqa3/w0;->U:Lqa3/w0;

    iput-object v1, v0, Lqa3/s0;->z:Lqa3/w0;

    invoke-virtual {p0}, Lqa3/s0;->k()Lqa3/u0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/s0;->l(Lqa3/u0;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/s0;->k()Lqa3/u0;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/u0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    throw v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lqa3/u0;->I:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/u0;

    invoke-direct {v1, p1, p2}, Lqa3/u0;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/s0;->l(Lqa3/u0;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/u0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lqa3/s0;->l(Lqa3/u0;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/u0;

    invoke-virtual {p0, p1}, Lqa3/s0;->l(Lqa3/u0;)V

    return-object p0
.end method

.method public final k()Lqa3/u0;
    .locals 5

    new-instance v0, Lqa3/u0;

    invoke-direct {v0, p0}, Lqa3/u0;-><init>(Lqa3/s0;)V

    iget v1, p0, Lqa3/s0;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Lqa3/s0;->y:Lqa3/t0;

    iput-object v2, v0, Lqa3/u0;->y:Lqa3/t0;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v2, p0, Lqa3/s0;->z:Lqa3/w0;

    iput-object v2, v0, Lqa3/u0;->z:Lqa3/w0;

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v1, p0, Lqa3/s0;->E:I

    iput v1, v0, Lqa3/u0;->E:I

    iput v3, v0, Lqa3/u0;->x:I

    return-object v0
.end method

.method public final l(Lqa3/u0;)V
    .locals 4

    sget-object v0, Lqa3/u0;->H:Lqa3/u0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/u0;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Lqa3/u0;->y:Lqa3/t0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/s0;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/s0;->x:I

    iput-object v0, p0, Lqa3/s0;->y:Lqa3/t0;

    :cond_1
    iget v0, p1, Lqa3/u0;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Lqa3/u0;->z:Lqa3/w0;

    iget v2, p0, Lqa3/s0;->x:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_2

    iget-object v2, p0, Lqa3/s0;->z:Lqa3/w0;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    if-eq v2, v3, :cond_2

    invoke-static {v2}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v2}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/s0;->z:Lqa3/w0;

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lqa3/s0;->z:Lqa3/w0;

    :goto_0
    iget v0, p0, Lqa3/s0;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/s0;->x:I

    :cond_3
    iget v0, p1, Lqa3/u0;->x:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget v0, p1, Lqa3/u0;->E:I

    iget v2, p0, Lqa3/s0;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/s0;->x:I

    iput v0, p0, Lqa3/s0;->E:I

    :cond_4
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/u0;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
