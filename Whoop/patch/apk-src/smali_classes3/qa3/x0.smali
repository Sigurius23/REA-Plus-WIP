.class public final Lqa3/x0;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public G:Ljava/util/List;

.field public H:Lqa3/w0;

.field public I:I

.field public J:Lqa3/w0;

.field public K:I

.field public L:Ljava/util/List;

.field public M:Ljava/util/List;

.field public N:Ljava/util/List;

.field public z:I


# direct methods
.method public static k()Lqa3/x0;
    .locals 3

    new-instance v0, Lqa3/x0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    const/4 v1, 0x6

    iput v1, v0, Lqa3/x0;->E:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/x0;->G:Ljava/util/List;

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, v0, Lqa3/x0;->H:Lqa3/w0;

    iput-object v2, v0, Lqa3/x0;->J:Lqa3/w0;

    iput-object v1, v0, Lqa3/x0;->L:Ljava/util/List;

    iput-object v1, v0, Lqa3/x0;->M:Ljava/util/List;

    iput-object v1, v0, Lqa3/x0;->N:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lqa3/x0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    const/4 v1, 0x6

    iput v1, v0, Lqa3/x0;->E:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/x0;->G:Ljava/util/List;

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, v0, Lqa3/x0;->H:Lqa3/w0;

    iput-object v2, v0, Lqa3/x0;->J:Lqa3/w0;

    iput-object v1, v0, Lqa3/x0;->L:Ljava/util/List;

    iput-object v1, v0, Lqa3/x0;->M:Ljava/util/List;

    iput-object v1, v0, Lqa3/x0;->N:Ljava/util/List;

    invoke-virtual {p0}, Lqa3/x0;->l()Lqa3/y0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/x0;->n(Lqa3/y0;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/x0;->l()Lqa3/y0;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/y0;->b()Z

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
    sget-object v1, Lqa3/y0;->Q:Lqa3/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/y0;

    invoke-direct {v1, p1, p2}, Lqa3/y0;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/x0;->n(Lqa3/y0;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/y0;
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

    invoke-virtual {p0, v0}, Lqa3/x0;->n(Lqa3/y0;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/y0;

    invoke-virtual {p0, p1}, Lqa3/x0;->n(Lqa3/y0;)V

    return-object p0
.end method

.method public final l()Lqa3/y0;
    .locals 5

    new-instance v0, Lqa3/y0;

    invoke-direct {v0, p0}, Lqa3/y0;-><init>(Lqa3/x0;)V

    iget v1, p0, Lqa3/x0;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/x0;->E:I

    iput v2, v0, Lqa3/y0;->z:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lqa3/x0;->F:I

    iput v2, v0, Lqa3/y0;->E:I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    iget-object v2, p0, Lqa3/x0;->G:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/x0;->G:Ljava/util/List;

    iget v2, p0, Lqa3/x0;->z:I

    and-int/lit8 v2, v2, -0x5

    iput v2, p0, Lqa3/x0;->z:I

    :cond_2
    iget-object v2, p0, Lqa3/x0;->G:Ljava/util/List;

    iput-object v2, v0, Lqa3/y0;->F:Ljava/util/List;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v2, p0, Lqa3/x0;->H:Lqa3/w0;

    iput-object v2, v0, Lqa3/y0;->G:Lqa3/w0;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x8

    :cond_4
    iget v2, p0, Lqa3/x0;->I:I

    iput v2, v0, Lqa3/y0;->H:I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x10

    :cond_5
    iget-object v2, p0, Lqa3/x0;->J:Lqa3/w0;

    iput-object v2, v0, Lqa3/y0;->I:Lqa3/w0;

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget v1, p0, Lqa3/x0;->K:I

    iput v1, v0, Lqa3/y0;->J:I

    iget v1, p0, Lqa3/x0;->z:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    iget-object v1, p0, Lqa3/x0;->L:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/x0;->L:Ljava/util/List;

    iget v1, p0, Lqa3/x0;->z:I

    and-int/lit16 v1, v1, -0x81

    iput v1, p0, Lqa3/x0;->z:I

    :cond_7
    iget-object v1, p0, Lqa3/x0;->L:Ljava/util/List;

    iput-object v1, v0, Lqa3/y0;->K:Ljava/util/List;

    iget v1, p0, Lqa3/x0;->z:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    iget-object v1, p0, Lqa3/x0;->M:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/x0;->M:Ljava/util/List;

    iget v1, p0, Lqa3/x0;->z:I

    and-int/lit16 v1, v1, -0x101

    iput v1, p0, Lqa3/x0;->z:I

    :cond_8
    iget-object v1, p0, Lqa3/x0;->M:Ljava/util/List;

    iput-object v1, v0, Lqa3/y0;->L:Ljava/util/List;

    iget v1, p0, Lqa3/x0;->z:I

    const/16 v2, 0x200

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_9

    iget-object v1, p0, Lqa3/x0;->N:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/x0;->N:Ljava/util/List;

    iget v1, p0, Lqa3/x0;->z:I

    and-int/lit16 v1, v1, -0x201

    iput v1, p0, Lqa3/x0;->z:I

    :cond_9
    iget-object v1, p0, Lqa3/x0;->N:Ljava/util/List;

    iput-object v1, v0, Lqa3/y0;->M:Ljava/util/List;

    iput v3, v0, Lqa3/y0;->y:I

    return-object v0
.end method

.method public final n(Lqa3/y0;)V
    .locals 4

    sget-object v0, Lqa3/y0;->P:Lqa3/y0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/y0;->y:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/y0;->z:I

    iget v3, p0, Lqa3/x0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/x0;->z:I

    iput v1, p0, Lqa3/x0;->E:I

    :cond_1
    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget v0, p1, Lqa3/y0;->E:I

    iget v2, p0, Lqa3/x0;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/x0;->z:I

    iput v0, p0, Lqa3/x0;->F:I

    :cond_2
    iget-object v0, p1, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x4

    if-nez v0, :cond_5

    iget-object v0, p0, Lqa3/x0;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lqa3/y0;->F:Ljava/util/List;

    iput-object v0, p0, Lqa3/x0;->G:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lqa3/x0;->z:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lqa3/x0;->z:I

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/x0;->G:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/x0;->G:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/x0;->z:I

    :cond_4
    iget-object v0, p0, Lqa3/x0;->G:Ljava/util/List;

    iget-object v2, p1, Lqa3/y0;->F:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_0
    iget v0, p1, Lqa3/y0;->y:I

    and-int/2addr v0, v1

    const/16 v2, 0x8

    if-ne v0, v1, :cond_7

    iget-object v0, p1, Lqa3/y0;->G:Lqa3/w0;

    iget v1, p0, Lqa3/x0;->z:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lqa3/x0;->H:Lqa3/w0;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    if-eq v1, v3, :cond_6

    invoke-static {v1}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v1}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/x0;->H:Lqa3/w0;

    goto :goto_1

    :cond_6
    iput-object v0, p0, Lqa3/x0;->H:Lqa3/w0;

    :goto_1
    iget v0, p0, Lqa3/x0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/x0;->z:I

    :cond_7
    iget v0, p1, Lqa3/y0;->y:I

    and-int/lit8 v1, v0, 0x8

    const/16 v3, 0x10

    if-ne v1, v2, :cond_8

    iget v1, p1, Lqa3/y0;->H:I

    iget v2, p0, Lqa3/x0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/x0;->z:I

    iput v1, p0, Lqa3/x0;->I:I

    :cond_8
    and-int/2addr v0, v3

    const/16 v1, 0x20

    if-ne v0, v3, :cond_a

    iget-object v0, p1, Lqa3/y0;->I:Lqa3/w0;

    iget v2, p0, Lqa3/x0;->z:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_9

    iget-object v2, p0, Lqa3/x0;->J:Lqa3/w0;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    if-eq v2, v3, :cond_9

    invoke-static {v2}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v2}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/x0;->J:Lqa3/w0;

    goto :goto_2

    :cond_9
    iput-object v0, p0, Lqa3/x0;->J:Lqa3/w0;

    :goto_2
    iget v0, p0, Lqa3/x0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/x0;->z:I

    :cond_a
    iget v0, p1, Lqa3/y0;->y:I

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_b

    iget v0, p1, Lqa3/y0;->J:I

    iget v1, p0, Lqa3/x0;->z:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Lqa3/x0;->z:I

    iput v0, p0, Lqa3/x0;->K:I

    :cond_b
    iget-object v0, p1, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lqa3/x0;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p1, Lqa3/y0;->K:Ljava/util/List;

    iput-object v0, p0, Lqa3/x0;->L:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lqa3/x0;->z:I

    goto :goto_3

    :cond_c
    iget v0, p0, Lqa3/x0;->z:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_d

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/x0;->L:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/x0;->L:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/x0;->z:I

    :cond_d
    iget-object v0, p0, Lqa3/x0;->L:Ljava/util/List;

    iget-object v1, p1, Lqa3/y0;->K:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_e
    :goto_3
    iget-object v0, p1, Lqa3/y0;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lqa3/x0;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p1, Lqa3/y0;->L:Ljava/util/List;

    iput-object v0, p0, Lqa3/x0;->M:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lqa3/x0;->z:I

    goto :goto_4

    :cond_f
    iget v0, p0, Lqa3/x0;->z:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_10

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/x0;->M:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/x0;->M:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/x0;->z:I

    :cond_10
    iget-object v0, p0, Lqa3/x0;->M:Ljava/util/List;

    iget-object v1, p1, Lqa3/y0;->L:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_11
    :goto_4
    iget-object v0, p1, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    iget-object v0, p0, Lqa3/x0;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p1, Lqa3/y0;->M:Ljava/util/List;

    iput-object v0, p0, Lqa3/x0;->N:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lqa3/x0;->z:I

    goto :goto_5

    :cond_12
    iget v0, p0, Lqa3/x0;->z:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_13

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/x0;->N:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/x0;->N:Ljava/util/List;

    iget v0, p0, Lqa3/x0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/x0;->z:I

    :cond_13
    iget-object v0, p0, Lqa3/x0;->N:Ljava/util/List;

    iget-object v1, p1, Lqa3/y0;->M:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_14
    :goto_5
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/y0;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
