.class public final Lqa3/d1;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public G:Lqa3/w0;

.field public H:I

.field public I:Lqa3/w0;

.field public J:I

.field public K:Ljava/util/List;

.field public L:Lqa3/e;

.field public z:I


# direct methods
.method public static l()Lqa3/d1;
    .locals 2

    new-instance v0, Lqa3/d1;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    sget-object v1, Lqa3/w0;->U:Lqa3/w0;

    iput-object v1, v0, Lqa3/d1;->G:Lqa3/w0;

    iput-object v1, v0, Lqa3/d1;->I:Lqa3/w0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/d1;->K:Ljava/util/List;

    sget-object v1, Lqa3/e;->P:Lqa3/e;

    iput-object v1, v0, Lqa3/d1;->L:Lqa3/e;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lqa3/d1;->l()Lqa3/d1;

    move-result-object v0

    invoke-virtual {p0}, Lqa3/d1;->k()Lqa3/e1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/d1;->n(Lqa3/e1;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/d1;->k()Lqa3/e1;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/e1;->b()Z

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
    sget-object v1, Lqa3/e1;->O:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/e1;

    invoke-direct {v1, p1, p2}, Lqa3/e1;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/d1;->n(Lqa3/e1;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/e1;
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

    invoke-virtual {p0, v0}, Lqa3/d1;->n(Lqa3/e1;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/e1;

    invoke-virtual {p0, p1}, Lqa3/d1;->n(Lqa3/e1;)V

    return-object p0
.end method

.method public final k()Lqa3/e1;
    .locals 5

    new-instance v0, Lqa3/e1;

    invoke-direct {v0, p0}, Lqa3/e1;-><init>(Lqa3/d1;)V

    iget v1, p0, Lqa3/d1;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/d1;->E:I

    iput v2, v0, Lqa3/e1;->z:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lqa3/d1;->F:I

    iput v2, v0, Lqa3/e1;->E:I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Lqa3/d1;->G:Lqa3/w0;

    iput-object v2, v0, Lqa3/e1;->F:Lqa3/w0;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget v2, p0, Lqa3/d1;->H:I

    iput v2, v0, Lqa3/e1;->G:I

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget-object v2, p0, Lqa3/d1;->I:Lqa3/w0;

    iput-object v2, v0, Lqa3/e1;->H:Lqa3/w0;

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget v2, p0, Lqa3/d1;->J:I

    iput v2, v0, Lqa3/e1;->I:I

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    iget-object v2, p0, Lqa3/d1;->K:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/d1;->K:Ljava/util/List;

    iget v2, p0, Lqa3/d1;->z:I

    and-int/lit8 v2, v2, -0x41

    iput v2, p0, Lqa3/d1;->z:I

    :cond_6
    iget-object v2, p0, Lqa3/d1;->K:Ljava/util/List;

    iput-object v2, v0, Lqa3/e1;->J:Ljava/util/List;

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget-object v1, p0, Lqa3/d1;->L:Lqa3/e;

    iput-object v1, v0, Lqa3/e1;->K:Lqa3/e;

    iput v3, v0, Lqa3/e1;->y:I

    return-object v0
.end method

.method public final n(Lqa3/e1;)V
    .locals 4

    sget-object v0, Lqa3/e1;->N:Lqa3/e1;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/e1;->y:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/e1;->z:I

    iget v3, p0, Lqa3/d1;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/d1;->z:I

    iput v1, p0, Lqa3/d1;->E:I

    :cond_1
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget v1, p1, Lqa3/e1;->E:I

    iget v3, p0, Lqa3/d1;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/d1;->z:I

    iput v1, p0, Lqa3/d1;->F:I

    :cond_2
    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget-object v0, p1, Lqa3/e1;->F:Lqa3/w0;

    iget v2, p0, Lqa3/d1;->z:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_3

    iget-object v2, p0, Lqa3/d1;->G:Lqa3/w0;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    if-eq v2, v3, :cond_3

    invoke-static {v2}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v2}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/d1;->G:Lqa3/w0;

    goto :goto_0

    :cond_3
    iput-object v0, p0, Lqa3/d1;->G:Lqa3/w0;

    :goto_0
    iget v0, p0, Lqa3/d1;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/d1;->z:I

    :cond_4
    iget v0, p1, Lqa3/e1;->y:I

    and-int/lit8 v1, v0, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_5

    iget v1, p1, Lqa3/e1;->G:I

    iget v3, p0, Lqa3/d1;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/d1;->z:I

    iput v1, p0, Lqa3/d1;->H:I

    :cond_5
    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_7

    iget-object v0, p1, Lqa3/e1;->H:Lqa3/w0;

    iget v2, p0, Lqa3/d1;->z:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_6

    iget-object v2, p0, Lqa3/d1;->I:Lqa3/w0;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    if-eq v2, v3, :cond_6

    invoke-static {v2}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v2}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/d1;->I:Lqa3/w0;

    goto :goto_1

    :cond_6
    iput-object v0, p0, Lqa3/d1;->I:Lqa3/w0;

    :goto_1
    iget v0, p0, Lqa3/d1;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/d1;->z:I

    :cond_7
    iget v0, p1, Lqa3/e1;->y:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_8

    iget v0, p1, Lqa3/e1;->I:I

    iget v2, p0, Lqa3/d1;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/d1;->z:I

    iput v0, p0, Lqa3/d1;->J:I

    :cond_8
    iget-object v0, p1, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v1, 0x40

    if-nez v0, :cond_b

    iget-object v0, p0, Lqa3/d1;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p1, Lqa3/e1;->J:Ljava/util/List;

    iput-object v0, p0, Lqa3/d1;->K:Ljava/util/List;

    iget v0, p0, Lqa3/d1;->z:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lqa3/d1;->z:I

    goto :goto_2

    :cond_9
    iget v0, p0, Lqa3/d1;->z:I

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_a

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/d1;->K:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/d1;->K:Ljava/util/List;

    iget v0, p0, Lqa3/d1;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/d1;->z:I

    :cond_a
    iget-object v0, p0, Lqa3/d1;->K:Ljava/util/List;

    iget-object v2, p1, Lqa3/e1;->J:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_b
    :goto_2
    iget v0, p1, Lqa3/e1;->y:I

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_d

    iget-object v0, p1, Lqa3/e1;->K:Lqa3/e;

    iget v1, p0, Lqa3/d1;->z:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_c

    iget-object v1, p0, Lqa3/d1;->L:Lqa3/e;

    sget-object v3, Lqa3/e;->P:Lqa3/e;

    if-eq v1, v3, :cond_c

    invoke-static {v1}, Lqa3/e;->j(Lqa3/e;)Lqa3/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa3/c;->l(Lqa3/e;)V

    invoke-virtual {v1}, Lqa3/c;->j()Lqa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/d1;->L:Lqa3/e;

    goto :goto_3

    :cond_c
    iput-object v0, p0, Lqa3/d1;->L:Lqa3/e;

    :goto_3
    iget v0, p0, Lqa3/d1;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/d1;->z:I

    :cond_d
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/e1;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
