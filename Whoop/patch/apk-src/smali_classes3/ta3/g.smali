.class public final Lta3/g;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public x:I

.field public y:Ljava/util/List;

.field public z:Ljava/util/List;


# direct methods
.method public static j()Lta3/g;
    .locals 2

    new-instance v0, Lta3/g;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lta3/g;->y:Ljava/util/List;

    iput-object v1, v0, Lta3/g;->z:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lta3/g;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lta3/g;->y:Ljava/util/List;

    iput-object v1, v0, Lta3/g;->z:Ljava/util/List;

    invoke-virtual {p0}, Lta3/g;->k()Lta3/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lta3/g;->l(Lta3/k;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 1

    invoke-virtual {p0}, Lta3/g;->k()Lta3/k;

    move-result-object v0

    invoke-virtual {v0}, Lta3/k;->b()Z

    return-object v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lta3/k;->H:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lta3/k;

    invoke-direct {v1, p1, p2}, Lta3/k;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lta3/g;->l(Lta3/k;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lta3/k;
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

    invoke-virtual {p0, v0}, Lta3/g;->l(Lta3/k;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lta3/k;

    invoke-virtual {p0, p1}, Lta3/g;->l(Lta3/k;)V

    return-object p0
.end method

.method public final k()Lta3/k;
    .locals 3

    new-instance v0, Lta3/k;

    invoke-direct {v0, p0}, Lta3/k;-><init>(Lta3/g;)V

    iget v1, p0, Lta3/g;->x:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lta3/g;->y:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lta3/g;->y:Ljava/util/List;

    iget v1, p0, Lta3/g;->x:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lta3/g;->x:I

    :cond_0
    iget-object v1, p0, Lta3/g;->y:Ljava/util/List;

    iput-object v1, v0, Lta3/k;->x:Ljava/util/List;

    iget v1, p0, Lta3/g;->x:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lta3/g;->z:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lta3/g;->z:Ljava/util/List;

    iget v1, p0, Lta3/g;->x:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lta3/g;->x:I

    :cond_1
    iget-object v1, p0, Lta3/g;->z:Ljava/util/List;

    iput-object v1, v0, Lta3/k;->y:Ljava/util/List;

    return-object v0
.end method

.method public final l(Lta3/k;)V
    .locals 3

    sget-object v0, Lta3/k;->G:Lta3/k;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lta3/k;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lta3/g;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lta3/k;->x:Ljava/util/List;

    iput-object v0, p0, Lta3/g;->y:Ljava/util/List;

    iget v0, p0, Lta3/g;->x:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lta3/g;->x:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lta3/g;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lta3/g;->y:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lta3/g;->y:Ljava/util/List;

    iget v0, p0, Lta3/g;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/g;->x:I

    :cond_2
    iget-object v0, p0, Lta3/g;->y:Ljava/util/List;

    iget-object v1, p1, Lta3/k;->x:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    iget-object v0, p1, Lta3/k;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lta3/g;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lta3/k;->y:Ljava/util/List;

    iput-object v0, p0, Lta3/g;->z:Ljava/util/List;

    iget v0, p0, Lta3/g;->x:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lta3/g;->x:I

    goto :goto_1

    :cond_4
    iget v0, p0, Lta3/g;->x:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lta3/g;->z:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lta3/g;->z:Ljava/util/List;

    iget v0, p0, Lta3/g;->x:I

    or-int/2addr v0, v1

    iput v0, p0, Lta3/g;->x:I

    :cond_5
    iget-object v0, p0, Lta3/g;->z:Ljava/util/List;

    iget-object v1, p1, Lta3/k;->y:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_1
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lta3/k;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
