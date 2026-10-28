.class public final Lta3/c;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public x:I

.field public y:I

.field public z:I


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lta3/c;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    invoke-virtual {p0}, Lta3/c;->j()Lta3/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lta3/c;->k(Lta3/d;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 1

    invoke-virtual {p0}, Lta3/c;->j()Lta3/d;

    move-result-object v0

    invoke-virtual {v0}, Lta3/d;->b()Z

    return-object v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 1

    const/4 p2, 0x0

    :try_start_0
    sget-object v0, Lta3/d;->H:Lqa3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lta3/d;

    invoke-direct {v0, p1}, Lta3/d;-><init>(Lwa3/f;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lta3/c;->k(Lta3/d;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast v0, Lta3/d;
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

    invoke-virtual {p0, p2}, Lta3/c;->k(Lta3/d;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lta3/d;

    invoke-virtual {p0, p1}, Lta3/c;->k(Lta3/d;)V

    return-object p0
.end method

.method public final j()Lta3/d;
    .locals 4

    new-instance v0, Lta3/d;

    invoke-direct {v0, p0}, Lta3/d;-><init>(Lta3/c;)V

    iget v1, p0, Lta3/c;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lta3/c;->y:I

    iput v2, v0, Lta3/d;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v1, p0, Lta3/c;->z:I

    iput v1, v0, Lta3/d;->z:I

    iput v3, v0, Lta3/d;->x:I

    return-object v0
.end method

.method public final k(Lta3/d;)V
    .locals 4

    sget-object v0, Lta3/d;->G:Lta3/d;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lta3/d;->x:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lta3/d;->y:I

    iget v3, p0, Lta3/c;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lta3/c;->x:I

    iput v1, p0, Lta3/c;->y:I

    :cond_1
    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget v0, p1, Lta3/d;->z:I

    iget v2, p0, Lta3/c;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lta3/c;->x:I

    iput v0, p0, Lta3/c;->z:I

    :cond_2
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lta3/d;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
