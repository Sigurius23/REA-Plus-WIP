.class public final Lqa3/f0;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/List;

.field public F:Ljava/util/List;

.field public G:Ljava/util/List;

.field public H:Lqa3/c1;

.field public I:Lqa3/j1;

.field public z:I


# direct methods
.method public static k()Lqa3/f0;
    .locals 2

    new-instance v0, Lqa3/f0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/f0;->E:Ljava/util/List;

    iput-object v1, v0, Lqa3/f0;->F:Ljava/util/List;

    iput-object v1, v0, Lqa3/f0;->G:Ljava/util/List;

    sget-object v1, Lqa3/c1;->G:Lqa3/c1;

    iput-object v1, v0, Lqa3/f0;->H:Lqa3/c1;

    sget-object v1, Lqa3/j1;->E:Lqa3/j1;

    iput-object v1, v0, Lqa3/f0;->I:Lqa3/j1;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lqa3/f0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/f0;->E:Ljava/util/List;

    iput-object v1, v0, Lqa3/f0;->F:Ljava/util/List;

    iput-object v1, v0, Lqa3/f0;->G:Ljava/util/List;

    sget-object v1, Lqa3/c1;->G:Lqa3/c1;

    iput-object v1, v0, Lqa3/f0;->H:Lqa3/c1;

    sget-object v1, Lqa3/j1;->E:Lqa3/j1;

    iput-object v1, v0, Lqa3/f0;->I:Lqa3/j1;

    invoke-virtual {p0}, Lqa3/f0;->l()Lqa3/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/f0;->n(Lqa3/g0;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/f0;->l()Lqa3/g0;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/g0;->b()Z

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
    sget-object v1, Lqa3/g0;->L:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/g0;

    invoke-direct {v1, p1, p2}, Lqa3/g0;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/f0;->n(Lqa3/g0;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/g0;
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

    invoke-virtual {p0, v0}, Lqa3/f0;->n(Lqa3/g0;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/g0;

    invoke-virtual {p0, p1}, Lqa3/f0;->n(Lqa3/g0;)V

    return-object p0
.end method

.method public final l()Lqa3/g0;
    .locals 5

    new-instance v0, Lqa3/g0;

    invoke-direct {v0, p0}, Lqa3/g0;-><init>(Lqa3/f0;)V

    iget v1, p0, Lqa3/f0;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lqa3/f0;->E:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/f0;->E:Ljava/util/List;

    iget v2, p0, Lqa3/f0;->z:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Lqa3/f0;->z:I

    :cond_0
    iget-object v2, p0, Lqa3/f0;->E:Ljava/util/List;

    iput-object v2, v0, Lqa3/g0;->z:Ljava/util/List;

    iget v2, p0, Lqa3/f0;->z:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_1

    iget-object v2, p0, Lqa3/f0;->F:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/f0;->F:Ljava/util/List;

    iget v2, p0, Lqa3/f0;->z:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, Lqa3/f0;->z:I

    :cond_1
    iget-object v2, p0, Lqa3/f0;->F:Ljava/util/List;

    iput-object v2, v0, Lqa3/g0;->E:Ljava/util/List;

    iget v2, p0, Lqa3/f0;->z:I

    const/4 v4, 0x4

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_2

    iget-object v2, p0, Lqa3/f0;->G:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/f0;->G:Ljava/util/List;

    iget v2, p0, Lqa3/f0;->z:I

    and-int/lit8 v2, v2, -0x5

    iput v2, p0, Lqa3/f0;->z:I

    :cond_2
    iget-object v2, p0, Lqa3/f0;->G:Ljava/util/List;

    iput-object v2, v0, Lqa3/g0;->F:Ljava/util/List;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Lqa3/f0;->H:Lqa3/c1;

    iput-object v2, v0, Lqa3/g0;->G:Lqa3/c1;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x2

    :cond_4
    iget-object v1, p0, Lqa3/f0;->I:Lqa3/j1;

    iput-object v1, v0, Lqa3/g0;->H:Lqa3/j1;

    iput v3, v0, Lqa3/g0;->y:I

    return-object v0
.end method

.method public final n(Lqa3/g0;)V
    .locals 5

    sget-object v0, Lqa3/g0;->K:Lqa3/g0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lqa3/f0;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lqa3/g0;->z:Ljava/util/List;

    iput-object v0, p0, Lqa3/f0;->E:Ljava/util/List;

    iget v0, p0, Lqa3/f0;->z:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lqa3/f0;->z:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lqa3/f0;->z:I

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/f0;->E:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/f0;->E:Ljava/util/List;

    iget v0, p0, Lqa3/f0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/f0;->z:I

    :cond_2
    iget-object v0, p0, Lqa3/f0;->E:Ljava/util/List;

    iget-object v2, p1, Lqa3/g0;->z:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    iget-object v0, p1, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x2

    if-nez v0, :cond_6

    iget-object v0, p0, Lqa3/f0;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lqa3/g0;->E:Ljava/util/List;

    iput-object v0, p0, Lqa3/f0;->F:Ljava/util/List;

    iget v0, p0, Lqa3/f0;->z:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lqa3/f0;->z:I

    goto :goto_1

    :cond_4
    iget v0, p0, Lqa3/f0;->z:I

    and-int/2addr v0, v2

    if-eq v0, v2, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v3, p0, Lqa3/f0;->F:Ljava/util/List;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/f0;->F:Ljava/util/List;

    iget v0, p0, Lqa3/f0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/f0;->z:I

    :cond_5
    iget-object v0, p0, Lqa3/f0;->F:Ljava/util/List;

    iget-object v3, p1, Lqa3/g0;->E:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_1
    iget-object v0, p1, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lqa3/f0;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Lqa3/g0;->F:Ljava/util/List;

    iput-object v0, p0, Lqa3/f0;->G:Ljava/util/List;

    iget v0, p0, Lqa3/f0;->z:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lqa3/f0;->z:I

    goto :goto_2

    :cond_7
    iget v0, p0, Lqa3/f0;->z:I

    const/4 v3, 0x4

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_8

    new-instance v0, Ljava/util/ArrayList;

    iget-object v4, p0, Lqa3/f0;->G:Ljava/util/List;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/f0;->G:Ljava/util/List;

    iget v0, p0, Lqa3/f0;->z:I

    or-int/2addr v0, v3

    iput v0, p0, Lqa3/f0;->z:I

    :cond_8
    iget-object v0, p0, Lqa3/f0;->G:Ljava/util/List;

    iget-object v3, p1, Lqa3/g0;->F:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    :goto_2
    iget v0, p1, Lqa3/g0;->y:I

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_b

    iget-object v0, p1, Lqa3/g0;->G:Lqa3/c1;

    iget v1, p0, Lqa3/f0;->z:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_a

    iget-object v1, p0, Lqa3/f0;->H:Lqa3/c1;

    sget-object v4, Lqa3/c1;->G:Lqa3/c1;

    if-eq v1, v4, :cond_a

    invoke-static {v1}, Lqa3/c1;->i(Lqa3/c1;)Lqa3/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa3/g;->o(Lqa3/c1;)V

    invoke-virtual {v1}, Lqa3/g;->k()Lqa3/c1;

    move-result-object v0

    iput-object v0, p0, Lqa3/f0;->H:Lqa3/c1;

    goto :goto_3

    :cond_a
    iput-object v0, p0, Lqa3/f0;->H:Lqa3/c1;

    :goto_3
    iget v0, p0, Lqa3/f0;->z:I

    or-int/2addr v0, v3

    iput v0, p0, Lqa3/f0;->z:I

    :cond_b
    iget v0, p1, Lqa3/g0;->y:I

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_d

    iget-object v0, p1, Lqa3/g0;->H:Lqa3/j1;

    iget v1, p0, Lqa3/f0;->z:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_c

    iget-object v1, p0, Lqa3/f0;->I:Lqa3/j1;

    sget-object v3, Lqa3/j1;->E:Lqa3/j1;

    if-eq v1, v3, :cond_c

    new-instance v3, Lqa3/p;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lqa3/p;-><init>(I)V

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v4, v3, Lqa3/p;->z:Ljava/util/List;

    invoke-virtual {v3, v1}, Lqa3/p;->n(Lqa3/j1;)V

    invoke-virtual {v3, v0}, Lqa3/p;->n(Lqa3/j1;)V

    invoke-virtual {v3}, Lqa3/p;->k()Lqa3/j1;

    move-result-object v0

    iput-object v0, p0, Lqa3/f0;->I:Lqa3/j1;

    goto :goto_4

    :cond_c
    iput-object v0, p0, Lqa3/f0;->I:Lqa3/j1;

    :goto_4
    iget v0, p0, Lqa3/f0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/f0;->z:I

    :cond_d
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/g0;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
