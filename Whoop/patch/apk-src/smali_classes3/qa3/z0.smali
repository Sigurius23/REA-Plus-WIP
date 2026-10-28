.class public final Lqa3/z0;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public G:Z

.field public H:Lqa3/a1;

.field public I:Ljava/util/List;

.field public J:Ljava/util/List;

.field public K:Ljava/util/List;

.field public z:I


# direct methods
.method public static k()Lqa3/z0;
    .locals 2

    new-instance v0, Lqa3/z0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    sget-object v1, Lqa3/a1;->z:Lqa3/a1;

    iput-object v1, v0, Lqa3/z0;->H:Lqa3/a1;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/z0;->I:Ljava/util/List;

    iput-object v1, v0, Lqa3/z0;->J:Ljava/util/List;

    iput-object v1, v0, Lqa3/z0;->K:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lqa3/z0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    sget-object v1, Lqa3/a1;->z:Lqa3/a1;

    iput-object v1, v0, Lqa3/z0;->H:Lqa3/a1;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/z0;->I:Ljava/util/List;

    iput-object v1, v0, Lqa3/z0;->J:Ljava/util/List;

    iput-object v1, v0, Lqa3/z0;->K:Ljava/util/List;

    invoke-virtual {p0}, Lqa3/z0;->l()Lqa3/b1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/z0;->n(Lqa3/b1;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/z0;->l()Lqa3/b1;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/b1;->b()Z

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
    sget-object v1, Lqa3/b1;->O:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/b1;

    invoke-direct {v1, p1, p2}, Lqa3/b1;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/z0;->n(Lqa3/b1;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/b1;
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

    invoke-virtual {p0, v0}, Lqa3/z0;->n(Lqa3/b1;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/b1;

    invoke-virtual {p0, p1}, Lqa3/z0;->n(Lqa3/b1;)V

    return-object p0
.end method

.method public final l()Lqa3/b1;
    .locals 5

    new-instance v0, Lqa3/b1;

    invoke-direct {v0, p0}, Lqa3/b1;-><init>(Lqa3/z0;)V

    iget v1, p0, Lqa3/z0;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/z0;->E:I

    iput v2, v0, Lqa3/b1;->z:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lqa3/z0;->F:I

    iput v2, v0, Lqa3/b1;->E:I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-boolean v2, p0, Lqa3/z0;->G:Z

    iput-boolean v2, v0, Lqa3/b1;->F:Z

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, Lqa3/z0;->H:Lqa3/a1;

    iput-object v2, v0, Lqa3/b1;->G:Lqa3/a1;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lqa3/z0;->I:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/z0;->I:Ljava/util/List;

    iget v1, p0, Lqa3/z0;->z:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Lqa3/z0;->z:I

    :cond_4
    iget-object v1, p0, Lqa3/z0;->I:Ljava/util/List;

    iput-object v1, v0, Lqa3/b1;->H:Ljava/util/List;

    iget v1, p0, Lqa3/z0;->z:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Lqa3/z0;->J:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/z0;->J:Ljava/util/List;

    iget v1, p0, Lqa3/z0;->z:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, Lqa3/z0;->z:I

    :cond_5
    iget-object v1, p0, Lqa3/z0;->J:Ljava/util/List;

    iput-object v1, v0, Lqa3/b1;->I:Ljava/util/List;

    iget v1, p0, Lqa3/z0;->z:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lqa3/z0;->K:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/z0;->K:Ljava/util/List;

    iget v1, p0, Lqa3/z0;->z:I

    and-int/lit8 v1, v1, -0x41

    iput v1, p0, Lqa3/z0;->z:I

    :cond_6
    iget-object v1, p0, Lqa3/z0;->K:Ljava/util/List;

    iput-object v1, v0, Lqa3/b1;->K:Ljava/util/List;

    iput v3, v0, Lqa3/b1;->y:I

    return-object v0
.end method

.method public final n(Lqa3/b1;)V
    .locals 4

    sget-object v0, Lqa3/b1;->N:Lqa3/b1;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/b1;->y:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/b1;->z:I

    iget v3, p0, Lqa3/z0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/z0;->z:I

    iput v1, p0, Lqa3/z0;->E:I

    :cond_1
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget v1, p1, Lqa3/b1;->E:I

    iget v3, p0, Lqa3/z0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/z0;->z:I

    iput v1, p0, Lqa3/z0;->F:I

    :cond_2
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    iget-boolean v1, p1, Lqa3/b1;->F:Z

    iget v3, p0, Lqa3/z0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/z0;->z:I

    iput-boolean v1, p0, Lqa3/z0;->G:Z

    :cond_3
    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget-object v0, p1, Lqa3/b1;->G:Lqa3/a1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/z0;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/z0;->z:I

    iput-object v0, p0, Lqa3/z0;->H:Lqa3/a1;

    :cond_4
    iget-object v0, p1, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lqa3/z0;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lqa3/b1;->H:Ljava/util/List;

    iput-object v0, p0, Lqa3/z0;->I:Ljava/util/List;

    iget v0, p0, Lqa3/z0;->z:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lqa3/z0;->z:I

    goto :goto_0

    :cond_5
    iget v0, p0, Lqa3/z0;->z:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_6

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/z0;->I:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/z0;->I:Ljava/util/List;

    iget v0, p0, Lqa3/z0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/z0;->z:I

    :cond_6
    iget-object v0, p0, Lqa3/z0;->I:Ljava/util/List;

    iget-object v1, p1, Lqa3/b1;->H:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_0
    iget-object v0, p1, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lqa3/z0;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lqa3/b1;->I:Ljava/util/List;

    iput-object v0, p0, Lqa3/z0;->J:Ljava/util/List;

    iget v0, p0, Lqa3/z0;->z:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lqa3/z0;->z:I

    goto :goto_1

    :cond_8
    iget v0, p0, Lqa3/z0;->z:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_9

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/z0;->J:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/z0;->J:Ljava/util/List;

    iget v0, p0, Lqa3/z0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/z0;->z:I

    :cond_9
    iget-object v0, p0, Lqa3/z0;->J:Ljava/util/List;

    iget-object v1, p1, Lqa3/b1;->I:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_1
    iget-object v0, p1, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lqa3/z0;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p1, Lqa3/b1;->K:Ljava/util/List;

    iput-object v0, p0, Lqa3/z0;->K:Ljava/util/List;

    iget v0, p0, Lqa3/z0;->z:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lqa3/z0;->z:I

    goto :goto_2

    :cond_b
    iget v0, p0, Lqa3/z0;->z:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_c

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/z0;->K:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/z0;->K:Ljava/util/List;

    iget v0, p0, Lqa3/z0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/z0;->z:I

    :cond_c
    iget-object v0, p0, Lqa3/z0;->K:Ljava/util/List;

    iget-object v1, p1, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_d
    :goto_2
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/b1;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
