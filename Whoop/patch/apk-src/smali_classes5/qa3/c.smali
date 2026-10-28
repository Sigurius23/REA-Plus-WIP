.class public final Lqa3/c;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:F

.field public F:D

.field public G:I

.field public H:I

.field public I:I

.field public J:Lqa3/h;

.field public K:Ljava/util/List;

.field public L:I

.field public M:I

.field public x:I

.field public y:Lqa3/d;

.field public z:J


# direct methods
.method public static k()Lqa3/c;
    .locals 2

    new-instance v0, Lqa3/c;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Lqa3/d;->x:Lqa3/d;

    iput-object v1, v0, Lqa3/c;->y:Lqa3/d;

    sget-object v1, Lqa3/h;->G:Lqa3/h;

    iput-object v1, v0, Lqa3/c;->J:Lqa3/h;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/c;->K:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lqa3/c;->k()Lqa3/c;

    move-result-object v0

    invoke-virtual {p0}, Lqa3/c;->j()Lqa3/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/c;->l(Lqa3/e;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/c;->j()Lqa3/e;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/e;->b()Z

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
    sget-object v1, Lqa3/e;->Q:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/e;

    invoke-direct {v1, p1, p2}, Lqa3/e;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/c;->l(Lqa3/e;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/e;
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

    invoke-virtual {p0, v0}, Lqa3/c;->l(Lqa3/e;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/e;

    invoke-virtual {p0, p1}, Lqa3/c;->l(Lqa3/e;)V

    return-object p0
.end method

.method public final j()Lqa3/e;
    .locals 6

    new-instance v0, Lqa3/e;

    invoke-direct {v0, p0}, Lqa3/e;-><init>(Lqa3/c;)V

    iget v1, p0, Lqa3/c;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Lqa3/c;->y:Lqa3/d;

    iput-object v2, v0, Lqa3/e;->y:Lqa3/d;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-wide v4, p0, Lqa3/c;->z:J

    iput-wide v4, v0, Lqa3/e;->z:J

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, Lqa3/c;->E:F

    iput v2, v0, Lqa3/e;->E:F

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-wide v4, p0, Lqa3/c;->F:D

    iput-wide v4, v0, Lqa3/e;->F:D

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, Lqa3/c;->G:I

    iput v2, v0, Lqa3/e;->G:I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget v2, p0, Lqa3/c;->H:I

    iput v2, v0, Lqa3/e;->H:I

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x40

    :cond_6
    iget v2, p0, Lqa3/c;->I:I

    iput v2, v0, Lqa3/e;->I:I

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit16 v3, v3, 0x80

    :cond_7
    iget-object v2, p0, Lqa3/c;->J:Lqa3/h;

    iput-object v2, v0, Lqa3/e;->J:Lqa3/h;

    and-int/lit16 v2, v1, 0x100

    const/16 v4, 0x100

    if-ne v2, v4, :cond_8

    iget-object v2, p0, Lqa3/c;->K:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/c;->K:Ljava/util/List;

    iget v2, p0, Lqa3/c;->x:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, Lqa3/c;->x:I

    :cond_8
    iget-object v2, p0, Lqa3/c;->K:Ljava/util/List;

    iput-object v2, v0, Lqa3/e;->K:Ljava/util/List;

    and-int/lit16 v2, v1, 0x200

    const/16 v4, 0x200

    if-ne v2, v4, :cond_9

    or-int/lit16 v3, v3, 0x100

    :cond_9
    iget v2, p0, Lqa3/c;->L:I

    iput v2, v0, Lqa3/e;->L:I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    or-int/lit16 v3, v3, 0x200

    :cond_a
    iget v1, p0, Lqa3/c;->M:I

    iput v1, v0, Lqa3/e;->M:I

    iput v3, v0, Lqa3/e;->x:I

    return-object v0
.end method

.method public final l(Lqa3/e;)V
    .locals 5

    sget-object v0, Lqa3/e;->P:Lqa3/e;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/e;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Lqa3/e;->y:Lqa3/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/c;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/c;->x:I

    iput-object v0, p0, Lqa3/c;->y:Lqa3/d;

    :cond_1
    iget v0, p1, Lqa3/e;->x:I

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-wide v3, p1, Lqa3/e;->z:J

    iget v1, p0, Lqa3/c;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/c;->x:I

    iput-wide v3, p0, Lqa3/c;->z:J

    :cond_2
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    iget v1, p1, Lqa3/e;->E:F

    iget v3, p0, Lqa3/c;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/c;->x:I

    iput v1, p0, Lqa3/c;->E:F

    :cond_3
    and-int/lit8 v1, v0, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_4

    iget-wide v3, p1, Lqa3/e;->F:D

    iget v1, p0, Lqa3/c;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/c;->x:I

    iput-wide v3, p0, Lqa3/c;->F:D

    :cond_4
    and-int/lit8 v1, v0, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_5

    iget v1, p1, Lqa3/e;->G:I

    iget v3, p0, Lqa3/c;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/c;->x:I

    iput v1, p0, Lqa3/c;->G:I

    :cond_5
    and-int/lit8 v1, v0, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_6

    iget v1, p1, Lqa3/e;->H:I

    iget v3, p0, Lqa3/c;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/c;->x:I

    iput v1, p0, Lqa3/c;->H:I

    :cond_6
    and-int/lit8 v1, v0, 0x40

    const/16 v2, 0x40

    if-ne v1, v2, :cond_7

    iget v1, p1, Lqa3/e;->I:I

    iget v3, p0, Lqa3/c;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/c;->x:I

    iput v1, p0, Lqa3/c;->I:I

    :cond_7
    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_9

    iget-object v0, p1, Lqa3/e;->J:Lqa3/h;

    iget v2, p0, Lqa3/c;->x:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_8

    iget-object v2, p0, Lqa3/c;->J:Lqa3/h;

    sget-object v3, Lqa3/h;->G:Lqa3/h;

    if-eq v2, v3, :cond_8

    new-instance v3, Lqa3/g;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lqa3/g;-><init>(I)V

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v4, v3, Lqa3/g;->z:Ljava/util/List;

    invoke-virtual {v3, v2}, Lqa3/g;->n(Lqa3/h;)V

    invoke-virtual {v3, v0}, Lqa3/g;->n(Lqa3/h;)V

    invoke-virtual {v3}, Lqa3/g;->j()Lqa3/h;

    move-result-object v0

    iput-object v0, p0, Lqa3/c;->J:Lqa3/h;

    goto :goto_0

    :cond_8
    iput-object v0, p0, Lqa3/c;->J:Lqa3/h;

    :goto_0
    iget v0, p0, Lqa3/c;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/c;->x:I

    :cond_9
    iget-object v0, p1, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v1, 0x100

    if-nez v0, :cond_c

    iget-object v0, p0, Lqa3/c;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p1, Lqa3/e;->K:Ljava/util/List;

    iput-object v0, p0, Lqa3/c;->K:Ljava/util/List;

    iget v0, p0, Lqa3/c;->x:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lqa3/c;->x:I

    goto :goto_1

    :cond_a
    iget v0, p0, Lqa3/c;->x:I

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_b

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/c;->K:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/c;->K:Ljava/util/List;

    iget v0, p0, Lqa3/c;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/c;->x:I

    :cond_b
    iget-object v0, p0, Lqa3/c;->K:Ljava/util/List;

    iget-object v2, p1, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_c
    :goto_1
    iget v0, p1, Lqa3/e;->x:I

    and-int/lit16 v2, v0, 0x100

    const/16 v3, 0x200

    if-ne v2, v1, :cond_d

    iget v1, p1, Lqa3/e;->L:I

    iget v2, p0, Lqa3/c;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/c;->x:I

    iput v1, p0, Lqa3/c;->L:I

    :cond_d
    and-int/2addr v0, v3

    if-ne v0, v3, :cond_e

    iget v0, p1, Lqa3/e;->M:I

    iget v1, p0, Lqa3/c;->x:I

    or-int/lit16 v1, v1, 0x400

    iput v1, p0, Lqa3/c;->x:I

    iput v0, p0, Lqa3/c;->M:I

    :cond_e
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/e;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
