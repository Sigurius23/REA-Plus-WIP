.class public final Lqa3/v0;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/List;

.field public F:Z

.field public G:I

.field public H:Lqa3/w0;

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:Lqa3/w0;

.field public O:I

.field public P:Lqa3/w0;

.field public Q:I

.field public R:I

.field public S:Ljava/util/List;

.field public z:I


# direct methods
.method public static l()Lqa3/v0;
    .locals 3

    new-instance v0, Lqa3/v0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/v0;->E:Ljava/util/List;

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, v0, Lqa3/v0;->H:Lqa3/w0;

    iput-object v2, v0, Lqa3/v0;->N:Lqa3/w0;

    iput-object v2, v0, Lqa3/v0;->P:Lqa3/w0;

    iput-object v1, v0, Lqa3/v0;->S:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lqa3/v0;->l()Lqa3/v0;

    move-result-object v0

    invoke-virtual {p0}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/w0;->b()Z

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
    sget-object v1, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/w0;

    invoke-direct {v1, p1, p2}, Lqa3/w0;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/w0;
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

    invoke-virtual {p0, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/w0;

    invoke-virtual {p0, p1}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    return-object p0
.end method

.method public final k()Lqa3/w0;
    .locals 5

    new-instance v0, Lqa3/w0;

    invoke-direct {v0, p0}, Lqa3/w0;-><init>(Lqa3/v0;)V

    iget v1, p0, Lqa3/v0;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lqa3/v0;->E:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/v0;->E:Ljava/util/List;

    iget v2, p0, Lqa3/v0;->z:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Lqa3/v0;->z:I

    :cond_0
    iget-object v2, p0, Lqa3/v0;->E:Ljava/util/List;

    iput-object v2, v0, Lqa3/w0;->z:Ljava/util/List;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-boolean v2, p0, Lqa3/v0;->F:Z

    iput-boolean v2, v0, Lqa3/w0;->E:Z

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x2

    :cond_2
    iget v2, p0, Lqa3/v0;->G:I

    iput v2, v0, Lqa3/w0;->F:I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v2, p0, Lqa3/v0;->H:Lqa3/w0;

    iput-object v2, v0, Lqa3/w0;->G:Lqa3/w0;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x8

    :cond_4
    iget v2, p0, Lqa3/v0;->I:I

    iput v2, v0, Lqa3/w0;->H:I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x10

    :cond_5
    iget v2, p0, Lqa3/v0;->J:I

    iput v2, v0, Lqa3/w0;->I:I

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget v2, p0, Lqa3/v0;->K:I

    iput v2, v0, Lqa3/w0;->J:I

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget v2, p0, Lqa3/v0;->L:I

    iput v2, v0, Lqa3/w0;->K:I

    and-int/lit16 v2, v1, 0x100

    const/16 v4, 0x100

    if-ne v2, v4, :cond_8

    or-int/lit16 v3, v3, 0x80

    :cond_8
    iget v2, p0, Lqa3/v0;->M:I

    iput v2, v0, Lqa3/w0;->L:I

    and-int/lit16 v2, v1, 0x200

    const/16 v4, 0x200

    if-ne v2, v4, :cond_9

    or-int/lit16 v3, v3, 0x100

    :cond_9
    iget-object v2, p0, Lqa3/v0;->N:Lqa3/w0;

    iput-object v2, v0, Lqa3/w0;->M:Lqa3/w0;

    and-int/lit16 v2, v1, 0x400

    const/16 v4, 0x400

    if-ne v2, v4, :cond_a

    or-int/lit16 v3, v3, 0x200

    :cond_a
    iget v2, p0, Lqa3/v0;->O:I

    iput v2, v0, Lqa3/w0;->N:I

    and-int/lit16 v2, v1, 0x800

    const/16 v4, 0x800

    if-ne v2, v4, :cond_b

    or-int/lit16 v3, v3, 0x400

    :cond_b
    iget-object v2, p0, Lqa3/v0;->P:Lqa3/w0;

    iput-object v2, v0, Lqa3/w0;->O:Lqa3/w0;

    and-int/lit16 v2, v1, 0x1000

    const/16 v4, 0x1000

    if-ne v2, v4, :cond_c

    or-int/lit16 v3, v3, 0x800

    :cond_c
    iget v2, p0, Lqa3/v0;->Q:I

    iput v2, v0, Lqa3/w0;->P:I

    const/16 v2, 0x2000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    or-int/lit16 v3, v3, 0x1000

    :cond_d
    iget v1, p0, Lqa3/v0;->R:I

    iput v1, v0, Lqa3/w0;->Q:I

    iget v1, p0, Lqa3/v0;->z:I

    const/16 v2, 0x4000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_e

    iget-object v1, p0, Lqa3/v0;->S:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/v0;->S:Ljava/util/List;

    iget v1, p0, Lqa3/v0;->z:I

    and-int/lit16 v1, v1, -0x4001

    iput v1, p0, Lqa3/v0;->z:I

    :cond_e
    iget-object v1, p0, Lqa3/v0;->S:Ljava/util/List;

    iput-object v1, v0, Lqa3/w0;->R:Ljava/util/List;

    iput v3, v0, Lqa3/w0;->y:I

    return-object v0
.end method

.method public final n(Lqa3/w0;)Lqa3/v0;
    .locals 5

    sget-object v0, Lqa3/w0;->U:Lqa3/w0;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    iget-object v1, p1, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_3

    iget-object v1, p0, Lqa3/v0;->E:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Lqa3/w0;->z:Ljava/util/List;

    iput-object v1, p0, Lqa3/v0;->E:Ljava/util/List;

    iget v1, p0, Lqa3/v0;->z:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lqa3/v0;->z:I

    goto :goto_0

    :cond_1
    iget v1, p0, Lqa3/v0;->z:I

    and-int/2addr v1, v2

    if-eq v1, v2, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lqa3/v0;->E:Ljava/util/List;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Lqa3/v0;->E:Ljava/util/List;

    iget v1, p0, Lqa3/v0;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/v0;->z:I

    :cond_2
    iget-object v1, p0, Lqa3/v0;->E:Ljava/util/List;

    iget-object v3, p1, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    iget v1, p1, Lqa3/w0;->y:I

    and-int/lit8 v3, v1, 0x1

    const/4 v4, 0x2

    if-ne v3, v2, :cond_4

    iget-boolean v2, p1, Lqa3/w0;->E:Z

    iget v3, p0, Lqa3/v0;->z:I

    or-int/2addr v3, v4

    iput v3, p0, Lqa3/v0;->z:I

    iput-boolean v2, p0, Lqa3/v0;->F:Z

    :cond_4
    and-int/lit8 v2, v1, 0x2

    const/4 v3, 0x4

    if-ne v2, v4, :cond_5

    iget v2, p1, Lqa3/w0;->F:I

    iget v4, p0, Lqa3/v0;->z:I

    or-int/2addr v4, v3

    iput v4, p0, Lqa3/v0;->z:I

    iput v2, p0, Lqa3/v0;->G:I

    :cond_5
    and-int/2addr v1, v3

    const/16 v2, 0x8

    if-ne v1, v3, :cond_7

    iget-object v1, p1, Lqa3/w0;->G:Lqa3/w0;

    iget v3, p0, Lqa3/v0;->z:I

    and-int/2addr v3, v2

    if-ne v3, v2, :cond_6

    iget-object v3, p0, Lqa3/v0;->H:Lqa3/w0;

    if-eq v3, v0, :cond_6

    invoke-static {v3}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v3

    invoke-virtual {v3, v1}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v3}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v1

    iput-object v1, p0, Lqa3/v0;->H:Lqa3/w0;

    goto :goto_1

    :cond_6
    iput-object v1, p0, Lqa3/v0;->H:Lqa3/w0;

    :goto_1
    iget v1, p0, Lqa3/v0;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/v0;->z:I

    :cond_7
    iget v1, p1, Lqa3/w0;->y:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    iget v1, p1, Lqa3/w0;->H:I

    iget v2, p0, Lqa3/v0;->z:I

    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Lqa3/v0;->z:I

    iput v1, p0, Lqa3/v0;->I:I

    :cond_8
    invoke-virtual {p1}, Lqa3/w0;->p()Z

    move-result v1

    const/16 v2, 0x20

    if-eqz v1, :cond_9

    iget v1, p1, Lqa3/w0;->I:I

    iget v3, p0, Lqa3/v0;->z:I

    or-int/2addr v3, v2

    iput v3, p0, Lqa3/v0;->z:I

    iput v1, p0, Lqa3/v0;->J:I

    :cond_9
    iget v1, p1, Lqa3/w0;->y:I

    and-int/lit8 v3, v1, 0x20

    const/16 v4, 0x40

    if-ne v3, v2, :cond_a

    iget v2, p1, Lqa3/w0;->J:I

    iget v3, p0, Lqa3/v0;->z:I

    or-int/2addr v3, v4

    iput v3, p0, Lqa3/v0;->z:I

    iput v2, p0, Lqa3/v0;->K:I

    :cond_a
    and-int/lit8 v2, v1, 0x40

    const/16 v3, 0x80

    if-ne v2, v4, :cond_b

    iget v2, p1, Lqa3/w0;->K:I

    iget v4, p0, Lqa3/v0;->z:I

    or-int/2addr v4, v3

    iput v4, p0, Lqa3/v0;->z:I

    iput v2, p0, Lqa3/v0;->L:I

    :cond_b
    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x100

    if-ne v2, v3, :cond_c

    iget v2, p1, Lqa3/w0;->L:I

    iget v3, p0, Lqa3/v0;->z:I

    or-int/2addr v3, v4

    iput v3, p0, Lqa3/v0;->z:I

    iput v2, p0, Lqa3/v0;->M:I

    :cond_c
    and-int/2addr v1, v4

    const/16 v2, 0x200

    if-ne v1, v4, :cond_e

    iget-object v1, p1, Lqa3/w0;->M:Lqa3/w0;

    iget v3, p0, Lqa3/v0;->z:I

    and-int/2addr v3, v2

    if-ne v3, v2, :cond_d

    iget-object v3, p0, Lqa3/v0;->N:Lqa3/w0;

    if-eq v3, v0, :cond_d

    invoke-static {v3}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v3

    invoke-virtual {v3, v1}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v3}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v1

    iput-object v1, p0, Lqa3/v0;->N:Lqa3/w0;

    goto :goto_2

    :cond_d
    iput-object v1, p0, Lqa3/v0;->N:Lqa3/w0;

    :goto_2
    iget v1, p0, Lqa3/v0;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/v0;->z:I

    :cond_e
    iget v1, p1, Lqa3/w0;->y:I

    and-int/lit16 v3, v1, 0x200

    const/16 v4, 0x400

    if-ne v3, v2, :cond_f

    iget v2, p1, Lqa3/w0;->N:I

    iget v3, p0, Lqa3/v0;->z:I

    or-int/2addr v3, v4

    iput v3, p0, Lqa3/v0;->z:I

    iput v2, p0, Lqa3/v0;->O:I

    :cond_f
    and-int/2addr v1, v4

    const/16 v2, 0x800

    if-ne v1, v4, :cond_11

    iget-object v1, p1, Lqa3/w0;->O:Lqa3/w0;

    iget v3, p0, Lqa3/v0;->z:I

    and-int/2addr v3, v2

    if-ne v3, v2, :cond_10

    iget-object v3, p0, Lqa3/v0;->P:Lqa3/w0;

    if-eq v3, v0, :cond_10

    invoke-static {v3}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v0}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/v0;->P:Lqa3/w0;

    goto :goto_3

    :cond_10
    iput-object v1, p0, Lqa3/v0;->P:Lqa3/w0;

    :goto_3
    iget v0, p0, Lqa3/v0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/v0;->z:I

    :cond_11
    iget v0, p1, Lqa3/w0;->y:I

    and-int/lit16 v1, v0, 0x800

    const/16 v3, 0x1000

    if-ne v1, v2, :cond_12

    iget v1, p1, Lqa3/w0;->P:I

    iget v2, p0, Lqa3/v0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/v0;->z:I

    iput v1, p0, Lqa3/v0;->Q:I

    :cond_12
    and-int/2addr v0, v3

    if-ne v0, v3, :cond_13

    iget v0, p1, Lqa3/w0;->Q:I

    iget v1, p0, Lqa3/v0;->z:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Lqa3/v0;->z:I

    iput v0, p0, Lqa3/v0;->R:I

    :cond_13
    iget-object v0, p1, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, p0, Lqa3/v0;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p1, Lqa3/w0;->R:Ljava/util/List;

    iput-object v0, p0, Lqa3/v0;->S:Ljava/util/List;

    iget v0, p0, Lqa3/v0;->z:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lqa3/v0;->z:I

    goto :goto_4

    :cond_14
    iget v0, p0, Lqa3/v0;->z:I

    const/16 v1, 0x4000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_15

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/v0;->S:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/v0;->S:Ljava/util/List;

    iget v0, p0, Lqa3/v0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/v0;->z:I

    :cond_15
    iget-object v0, p0, Lqa3/v0;->S:Ljava/util/List;

    iget-object v1, p1, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_16
    :goto_4
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/w0;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-object p0
.end method
