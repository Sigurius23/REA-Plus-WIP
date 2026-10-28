.class public final Lta3/e;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:Lta3/d;

.field public F:Lta3/d;

.field public G:Lta3/d;

.field public x:I

.field public y:Lta3/b;

.field public z:Lta3/d;


# direct methods
.method public static k()Lta3/e;
    .locals 2

    new-instance v0, Lta3/e;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Lta3/b;->G:Lta3/b;

    iput-object v1, v0, Lta3/e;->y:Lta3/b;

    sget-object v1, Lta3/d;->G:Lta3/d;

    iput-object v1, v0, Lta3/e;->z:Lta3/d;

    iput-object v1, v0, Lta3/e;->E:Lta3/d;

    iput-object v1, v0, Lta3/e;->F:Lta3/d;

    iput-object v1, v0, Lta3/e;->G:Lta3/d;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lta3/e;->k()Lta3/e;

    move-result-object v0

    invoke-virtual {p0}, Lta3/e;->j()Lta3/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lta3/e;->l(Lta3/f;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 1

    invoke-virtual {p0}, Lta3/e;->j()Lta3/f;

    move-result-object v0

    invoke-virtual {v0}, Lta3/f;->b()Z

    return-object v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lta3/f;->K:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lta3/f;

    invoke-direct {v1, p1, p2}, Lta3/f;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lta3/e;->l(Lta3/f;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lta3/f;
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

    invoke-virtual {p0, v0}, Lta3/e;->l(Lta3/f;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lta3/f;

    invoke-virtual {p0, p1}, Lta3/e;->l(Lta3/f;)V

    return-object p0
.end method

.method public final j()Lta3/f;
    .locals 5

    new-instance v0, Lta3/f;

    invoke-direct {v0, p0}, Lta3/f;-><init>(Lta3/e;)V

    iget v1, p0, Lta3/e;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Lta3/e;->y:Lta3/b;

    iput-object v2, v0, Lta3/f;->y:Lta3/b;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v2, p0, Lta3/e;->z:Lta3/d;

    iput-object v2, v0, Lta3/f;->z:Lta3/d;

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Lta3/e;->E:Lta3/d;

    iput-object v2, v0, Lta3/f;->E:Lta3/d;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, Lta3/e;->F:Lta3/d;

    iput-object v2, v0, Lta3/f;->F:Lta3/d;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget-object v1, p0, Lta3/e;->G:Lta3/d;

    iput-object v1, v0, Lta3/f;->G:Lta3/d;

    iput v3, v0, Lta3/f;->x:I

    return-object v0
.end method

.method public final l(Lta3/f;)V
    .locals 4

    sget-object v0, Lta3/f;->J:Lta3/f;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lta3/f;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Lta3/f;->y:Lta3/b;

    iget v2, p0, Lta3/e;->x:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_1

    iget-object v2, p0, Lta3/e;->y:Lta3/b;

    sget-object v3, Lta3/b;->G:Lta3/b;

    if-eq v2, v3, :cond_1

    invoke-static {}, Lta3/a;->j()Lta3/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lta3/a;->l(Lta3/b;)V

    invoke-virtual {v3, v0}, Lta3/a;->l(Lta3/b;)V

    invoke-virtual {v3}, Lta3/a;->k()Lta3/b;

    move-result-object v0

    iput-object v0, p0, Lta3/e;->y:Lta3/b;

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lta3/e;->y:Lta3/b;

    :goto_0
    iget v0, p0, Lta3/e;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/e;->x:I

    :cond_2
    iget v0, p1, Lta3/f;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget-object v0, p1, Lta3/f;->z:Lta3/d;

    iget v2, p0, Lta3/e;->x:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_3

    iget-object v2, p0, Lta3/e;->z:Lta3/d;

    sget-object v3, Lta3/d;->G:Lta3/d;

    if-eq v2, v3, :cond_3

    invoke-static {v2}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lta3/c;->k(Lta3/d;)V

    invoke-virtual {v2}, Lta3/c;->j()Lta3/d;

    move-result-object v0

    iput-object v0, p0, Lta3/e;->z:Lta3/d;

    goto :goto_1

    :cond_3
    iput-object v0, p0, Lta3/e;->z:Lta3/d;

    :goto_1
    iget v0, p0, Lta3/e;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/e;->x:I

    :cond_4
    invoke-virtual {p1}, Lta3/f;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lta3/f;->E:Lta3/d;

    iget v1, p0, Lta3/e;->x:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Lta3/e;->E:Lta3/d;

    sget-object v3, Lta3/d;->G:Lta3/d;

    if-eq v1, v3, :cond_5

    invoke-static {v1}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lta3/c;->k(Lta3/d;)V

    invoke-virtual {v1}, Lta3/c;->j()Lta3/d;

    move-result-object v0

    iput-object v0, p0, Lta3/e;->E:Lta3/d;

    goto :goto_2

    :cond_5
    iput-object v0, p0, Lta3/e;->E:Lta3/d;

    :goto_2
    iget v0, p0, Lta3/e;->x:I

    or-int/2addr v0, v2

    iput v0, p0, Lta3/e;->x:I

    :cond_6
    iget v0, p1, Lta3/f;->x:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_8

    iget-object v0, p1, Lta3/f;->F:Lta3/d;

    iget v2, p0, Lta3/e;->x:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_7

    iget-object v2, p0, Lta3/e;->F:Lta3/d;

    sget-object v3, Lta3/d;->G:Lta3/d;

    if-eq v2, v3, :cond_7

    invoke-static {v2}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lta3/c;->k(Lta3/d;)V

    invoke-virtual {v2}, Lta3/c;->j()Lta3/d;

    move-result-object v0

    iput-object v0, p0, Lta3/e;->F:Lta3/d;

    goto :goto_3

    :cond_7
    iput-object v0, p0, Lta3/e;->F:Lta3/d;

    :goto_3
    iget v0, p0, Lta3/e;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/e;->x:I

    :cond_8
    iget v0, p1, Lta3/f;->x:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_a

    iget-object v0, p1, Lta3/f;->G:Lta3/d;

    iget v2, p0, Lta3/e;->x:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_9

    iget-object v2, p0, Lta3/e;->G:Lta3/d;

    sget-object v3, Lta3/d;->G:Lta3/d;

    if-eq v2, v3, :cond_9

    invoke-static {v2}, Lta3/d;->i(Lta3/d;)Lta3/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lta3/c;->k(Lta3/d;)V

    invoke-virtual {v2}, Lta3/c;->j()Lta3/d;

    move-result-object v0

    iput-object v0, p0, Lta3/e;->G:Lta3/d;

    goto :goto_4

    :cond_9
    iput-object v0, p0, Lta3/e;->G:Lta3/d;

    :goto_4
    iget v0, p0, Lta3/e;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/e;->x:I

    :cond_a
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lta3/f;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
