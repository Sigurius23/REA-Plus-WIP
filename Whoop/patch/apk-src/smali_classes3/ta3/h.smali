.class public final Lta3/h;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Lta3/i;

.field public G:Ljava/util/List;

.field public H:Ljava/util/List;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public static j()Lta3/h;
    .locals 2

    new-instance v0, Lta3/h;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    const/4 v1, 0x1

    iput v1, v0, Lta3/h;->y:I

    const-string v1, ""

    iput-object v1, v0, Lta3/h;->E:Ljava/lang/Object;

    sget-object v1, Lta3/i;->x:Lta3/i;

    iput-object v1, v0, Lta3/h;->F:Lta3/i;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lta3/h;->G:Ljava/util/List;

    iput-object v1, v0, Lta3/h;->H:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lta3/h;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    const/4 v1, 0x1

    iput v1, v0, Lta3/h;->y:I

    const-string v1, ""

    iput-object v1, v0, Lta3/h;->E:Ljava/lang/Object;

    sget-object v1, Lta3/i;->x:Lta3/i;

    iput-object v1, v0, Lta3/h;->F:Lta3/i;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lta3/h;->G:Ljava/util/List;

    iput-object v1, v0, Lta3/h;->H:Ljava/util/List;

    invoke-virtual {p0}, Lta3/h;->k()Lta3/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lta3/h;->l(Lta3/j;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 1

    invoke-virtual {p0}, Lta3/h;->k()Lta3/j;

    move-result-object v0

    invoke-virtual {v0}, Lta3/j;->b()Z

    return-object v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 1

    const/4 p2, 0x0

    :try_start_0
    sget-object v0, Lta3/j;->N:Lqa3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lta3/j;

    invoke-direct {v0, p1}, Lta3/j;-><init>(Lwa3/f;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lta3/h;->l(Lta3/j;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast v0, Lta3/j;
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

    invoke-virtual {p0, p2}, Lta3/h;->l(Lta3/j;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lta3/j;

    invoke-virtual {p0, p1}, Lta3/h;->l(Lta3/j;)V

    return-object p0
.end method

.method public final k()Lta3/j;
    .locals 5

    new-instance v0, Lta3/j;

    invoke-direct {v0, p0}, Lta3/j;-><init>(Lta3/h;)V

    iget v1, p0, Lta3/h;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lta3/h;->y:I

    iput v2, v0, Lta3/j;->y:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lta3/h;->z:I

    iput v2, v0, Lta3/j;->z:I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Lta3/h;->E:Ljava/lang/Object;

    iput-object v2, v0, Lta3/j;->E:Ljava/lang/Object;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, Lta3/h;->F:Lta3/i;

    iput-object v2, v0, Lta3/j;->F:Lta3/i;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lta3/h;->G:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lta3/h;->G:Ljava/util/List;

    iget v1, p0, Lta3/h;->x:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Lta3/h;->x:I

    :cond_4
    iget-object v1, p0, Lta3/h;->G:Ljava/util/List;

    iput-object v1, v0, Lta3/j;->G:Ljava/util/List;

    iget v1, p0, Lta3/h;->x:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Lta3/h;->H:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lta3/h;->H:Ljava/util/List;

    iget v1, p0, Lta3/h;->x:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, Lta3/h;->x:I

    :cond_5
    iget-object v1, p0, Lta3/h;->H:Ljava/util/List;

    iput-object v1, v0, Lta3/j;->I:Ljava/util/List;

    iput v3, v0, Lta3/j;->x:I

    return-object v0
.end method

.method public final l(Lta3/j;)V
    .locals 4

    sget-object v0, Lta3/j;->M:Lta3/j;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lta3/j;->x:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lta3/j;->y:I

    iget v3, p0, Lta3/h;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lta3/h;->x:I

    iput v1, p0, Lta3/h;->y:I

    :cond_1
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget v1, p1, Lta3/j;->z:I

    iget v3, p0, Lta3/h;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lta3/h;->x:I

    iput v1, p0, Lta3/h;->z:I

    :cond_2
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    iget v1, p0, Lta3/h;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lta3/h;->x:I

    iget-object v1, p1, Lta3/j;->E:Ljava/lang/Object;

    iput-object v1, p0, Lta3/h;->E:Ljava/lang/Object;

    :cond_3
    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget-object v0, p1, Lta3/j;->F:Lta3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lta3/h;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lta3/h;->x:I

    iput-object v0, p0, Lta3/h;->F:Lta3/i;

    :cond_4
    iget-object v0, p1, Lta3/j;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lta3/h;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lta3/j;->G:Ljava/util/List;

    iput-object v0, p0, Lta3/h;->G:Ljava/util/List;

    iget v0, p0, Lta3/h;->x:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lta3/h;->x:I

    goto :goto_0

    :cond_5
    iget v0, p0, Lta3/h;->x:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_6

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lta3/h;->G:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lta3/h;->G:Ljava/util/List;

    iget v0, p0, Lta3/h;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/h;->x:I

    :cond_6
    iget-object v0, p0, Lta3/h;->G:Ljava/util/List;

    iget-object v1, p1, Lta3/j;->G:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_0
    iget-object v0, p1, Lta3/j;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lta3/h;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lta3/j;->I:Ljava/util/List;

    iput-object v0, p0, Lta3/h;->H:Ljava/util/List;

    iget v0, p0, Lta3/h;->x:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lta3/h;->x:I

    goto :goto_1

    :cond_8
    iget v0, p0, Lta3/h;->x:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_9

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lta3/h;->H:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lta3/h;->H:Ljava/util/List;

    iget v0, p0, Lta3/h;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/h;->x:I

    :cond_9
    iget-object v0, p0, Lta3/h;->H:Ljava/util/List;

    iget-object v1, p1, Lta3/j;->I:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_1
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lta3/j;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
