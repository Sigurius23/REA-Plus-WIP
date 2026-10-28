.class public final Lqa3/r;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:Lqa3/a0;

.field public F:Lqa3/u;

.field public G:Lqa3/s;

.field public x:I

.field public y:Lqa3/t;

.field public z:Ljava/util/List;


# direct methods
.method public static k()Lqa3/r;
    .locals 2

    new-instance v0, Lqa3/r;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Lqa3/t;->x:Lqa3/t;

    iput-object v1, v0, Lqa3/r;->y:Lqa3/t;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/r;->z:Ljava/util/List;

    sget-object v1, Lqa3/a0;->L:Lqa3/a0;

    iput-object v1, v0, Lqa3/r;->E:Lqa3/a0;

    sget-object v1, Lqa3/u;->x:Lqa3/u;

    iput-object v1, v0, Lqa3/r;->F:Lqa3/u;

    sget-object v1, Lqa3/s;->x:Lqa3/s;

    iput-object v1, v0, Lqa3/r;->G:Lqa3/s;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lqa3/r;->k()Lqa3/r;

    move-result-object v0

    invoke-virtual {p0}, Lqa3/r;->j()Lqa3/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/r;->l(Lqa3/v;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/r;->j()Lqa3/v;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/v;->b()Z

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
    sget-object v1, Lqa3/v;->K:Lqa3/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/v;

    invoke-direct {v1, p1, p2}, Lqa3/v;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/r;->l(Lqa3/v;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/v;
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

    invoke-virtual {p0, v0}, Lqa3/r;->l(Lqa3/v;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/v;

    invoke-virtual {p0, p1}, Lqa3/r;->l(Lqa3/v;)V

    return-object p0
.end method

.method public final j()Lqa3/v;
    .locals 5

    new-instance v0, Lqa3/v;

    invoke-direct {v0, p0}, Lqa3/v;-><init>(Lqa3/r;)V

    iget v1, p0, Lqa3/r;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Lqa3/r;->y:Lqa3/t;

    iput-object v2, v0, Lqa3/v;->y:Lqa3/t;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    iget-object v2, p0, Lqa3/r;->z:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/r;->z:Ljava/util/List;

    iget v2, p0, Lqa3/r;->x:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, Lqa3/r;->x:I

    :cond_1
    iget-object v2, p0, Lqa3/r;->z:Ljava/util/List;

    iput-object v2, v0, Lqa3/v;->z:Ljava/util/List;

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x2

    :cond_2
    iget-object v2, p0, Lqa3/r;->E:Lqa3/a0;

    iput-object v2, v0, Lqa3/v;->E:Lqa3/a0;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v2, p0, Lqa3/r;->F:Lqa3/u;

    iput-object v2, v0, Lqa3/v;->F:Lqa3/u;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x8

    :cond_4
    iget-object v1, p0, Lqa3/r;->G:Lqa3/s;

    iput-object v1, v0, Lqa3/v;->G:Lqa3/s;

    iput v3, v0, Lqa3/v;->x:I

    return-object v0
.end method

.method public final l(Lqa3/v;)V
    .locals 4

    sget-object v0, Lqa3/v;->J:Lqa3/v;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lqa3/v;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lqa3/v;->y:Lqa3/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, Lqa3/r;->x:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lqa3/r;->x:I

    iput-object v0, p0, Lqa3/r;->y:Lqa3/t;

    :cond_1
    iget-object v0, p1, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lqa3/r;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lqa3/v;->z:Ljava/util/List;

    iput-object v0, p0, Lqa3/r;->z:Ljava/util/List;

    iget v0, p0, Lqa3/r;->x:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lqa3/r;->x:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lqa3/r;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/r;->z:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/r;->z:Ljava/util/List;

    iget v0, p0, Lqa3/r;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/r;->x:I

    :cond_3
    iget-object v0, p0, Lqa3/r;->z:Ljava/util/List;

    iget-object v1, p1, Lqa3/v;->z:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_0
    invoke-virtual {p1}, Lqa3/v;->m()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lqa3/v;->E:Lqa3/a0;

    iget v1, p0, Lqa3/r;->x:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Lqa3/r;->E:Lqa3/a0;

    sget-object v3, Lqa3/a0;->L:Lqa3/a0;

    if-eq v1, v3, :cond_5

    invoke-static {}, Lqa3/y;->k()Lqa3/y;

    move-result-object v3

    invoke-virtual {v3, v1}, Lqa3/y;->l(Lqa3/a0;)V

    invoke-virtual {v3, v0}, Lqa3/y;->l(Lqa3/a0;)V

    invoke-virtual {v3}, Lqa3/y;->j()Lqa3/a0;

    move-result-object v0

    iput-object v0, p0, Lqa3/r;->E:Lqa3/a0;

    goto :goto_1

    :cond_5
    iput-object v0, p0, Lqa3/r;->E:Lqa3/a0;

    :goto_1
    iget v0, p0, Lqa3/r;->x:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/r;->x:I

    :cond_6
    invoke-virtual {p1}, Lqa3/v;->o()Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_7

    iget-object v0, p1, Lqa3/v;->F:Lqa3/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/r;->x:I

    or-int/2addr v2, v1

    iput v2, p0, Lqa3/r;->x:I

    iput-object v0, p0, Lqa3/r;->F:Lqa3/u;

    :cond_7
    iget v0, p1, Lqa3/v;->x:I

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_8

    iget-object v0, p1, Lqa3/v;->G:Lqa3/s;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, Lqa3/r;->x:I

    or-int/lit8 v1, v1, 0x10

    iput v1, p0, Lqa3/r;->x:I

    iput-object v0, p0, Lqa3/r;->G:Lqa3/s;

    :cond_8
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/v;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
