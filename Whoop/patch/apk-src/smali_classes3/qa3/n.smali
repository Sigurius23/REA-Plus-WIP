.class public final Lqa3/n;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:Ljava/util/List;

.field public G:Ljava/util/List;

.field public H:Ljava/util/List;

.field public I:Ljava/util/List;

.field public z:I


# direct methods
.method public static k()Lqa3/n;
    .locals 2

    new-instance v0, Lqa3/n;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    const/4 v1, 0x6

    iput v1, v0, Lqa3/n;->E:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->F:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->G:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->H:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->I:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lqa3/n;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    const/4 v1, 0x6

    iput v1, v0, Lqa3/n;->E:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->F:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->G:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->H:Ljava/util/List;

    iput-object v1, v0, Lqa3/n;->I:Ljava/util/List;

    invoke-virtual {p0}, Lqa3/n;->l()Lqa3/o;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/n;->n(Lqa3/o;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/n;->l()Lqa3/o;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/o;->b()Z

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
    sget-object v1, Lqa3/o;->L:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/o;

    invoke-direct {v1, p1, p2}, Lqa3/o;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/n;->n(Lqa3/o;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/o;
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

    invoke-virtual {p0, v0}, Lqa3/n;->n(Lqa3/o;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/o;

    invoke-virtual {p0, p1}, Lqa3/n;->n(Lqa3/o;)V

    return-object p0
.end method

.method public final l()Lqa3/o;
    .locals 4

    new-instance v0, Lqa3/o;

    invoke-direct {v0, p0}, Lqa3/o;-><init>(Lqa3/n;)V

    iget v1, p0, Lqa3/n;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/n;->E:I

    iput v2, v0, Lqa3/o;->z:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lqa3/n;->F:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/n;->F:Ljava/util/List;

    iget v1, p0, Lqa3/n;->z:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lqa3/n;->z:I

    :cond_1
    iget-object v1, p0, Lqa3/n;->F:Ljava/util/List;

    iput-object v1, v0, Lqa3/o;->E:Ljava/util/List;

    iget v1, p0, Lqa3/n;->z:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lqa3/n;->G:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/n;->G:Ljava/util/List;

    iget v1, p0, Lqa3/n;->z:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Lqa3/n;->z:I

    :cond_2
    iget-object v1, p0, Lqa3/n;->G:Ljava/util/List;

    iput-object v1, v0, Lqa3/o;->F:Ljava/util/List;

    iget v1, p0, Lqa3/n;->z:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lqa3/n;->H:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/n;->H:Ljava/util/List;

    iget v1, p0, Lqa3/n;->z:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Lqa3/n;->z:I

    :cond_3
    iget-object v1, p0, Lqa3/n;->H:Ljava/util/List;

    iput-object v1, v0, Lqa3/o;->G:Ljava/util/List;

    iget v1, p0, Lqa3/n;->z:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lqa3/n;->I:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/n;->I:Ljava/util/List;

    iget v1, p0, Lqa3/n;->z:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Lqa3/n;->z:I

    :cond_4
    iget-object v1, p0, Lqa3/n;->I:Ljava/util/List;

    iput-object v1, v0, Lqa3/o;->H:Ljava/util/List;

    iput v3, v0, Lqa3/o;->y:I

    return-object v0
.end method

.method public final n(Lqa3/o;)V
    .locals 3

    sget-object v0, Lqa3/o;->K:Lqa3/o;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/o;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p1, Lqa3/o;->z:I

    iget v2, p0, Lqa3/n;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/n;->z:I

    iput v0, p0, Lqa3/n;->E:I

    :cond_1
    iget-object v0, p1, Lqa3/o;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lqa3/n;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lqa3/o;->E:Ljava/util/List;

    iput-object v0, p0, Lqa3/n;->F:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lqa3/n;->z:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lqa3/n;->z:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/n;->F:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/n;->F:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/n;->z:I

    :cond_3
    iget-object v0, p0, Lqa3/n;->F:Ljava/util/List;

    iget-object v1, p1, Lqa3/o;->E:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_0
    iget-object v0, p1, Lqa3/o;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lqa3/n;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lqa3/o;->F:Ljava/util/List;

    iput-object v0, p0, Lqa3/n;->G:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lqa3/n;->z:I

    goto :goto_1

    :cond_5
    iget v0, p0, Lqa3/n;->z:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_6

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/n;->G:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/n;->G:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/n;->z:I

    :cond_6
    iget-object v0, p0, Lqa3/n;->G:Ljava/util/List;

    iget-object v1, p1, Lqa3/o;->F:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_1
    iget-object v0, p1, Lqa3/o;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lqa3/n;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lqa3/o;->G:Ljava/util/List;

    iput-object v0, p0, Lqa3/n;->H:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lqa3/n;->z:I

    goto :goto_2

    :cond_8
    iget v0, p0, Lqa3/n;->z:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_9

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/n;->H:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/n;->H:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/n;->z:I

    :cond_9
    iget-object v0, p0, Lqa3/n;->H:Ljava/util/List;

    iget-object v1, p1, Lqa3/o;->G:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_2
    iget-object v0, p1, Lqa3/o;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lqa3/n;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p1, Lqa3/o;->H:Ljava/util/List;

    iput-object v0, p0, Lqa3/n;->I:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lqa3/n;->z:I

    goto :goto_3

    :cond_b
    iget v0, p0, Lqa3/n;->z:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_c

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/n;->I:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/n;->I:Ljava/util/List;

    iget v0, p0, Lqa3/n;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/n;->z:I

    :cond_c
    iget-object v0, p0, Lqa3/n;->I:Ljava/util/List;

    iget-object v1, p1, Lqa3/o;->H:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_d
    :goto_3
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/o;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
