.class public final Lqa3/f1;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:Lqa3/g1;

.field public F:I

.field public G:I

.field public H:Lqa3/h1;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public static j()Lqa3/f1;
    .locals 2

    new-instance v0, Lqa3/f1;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Lqa3/g1;->y:Lqa3/g1;

    iput-object v1, v0, Lqa3/f1;->E:Lqa3/g1;

    sget-object v1, Lqa3/h1;->x:Lqa3/h1;

    iput-object v1, v0, Lqa3/f1;->H:Lqa3/h1;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lqa3/f1;

    invoke-direct {v0}, Lwa3/k;-><init>()V

    sget-object v1, Lqa3/g1;->y:Lqa3/g1;

    iput-object v1, v0, Lqa3/f1;->E:Lqa3/g1;

    sget-object v1, Lqa3/h1;->x:Lqa3/h1;

    iput-object v1, v0, Lqa3/f1;->H:Lqa3/h1;

    invoke-virtual {p0}, Lqa3/f1;->k()Lqa3/i1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/f1;->l(Lqa3/i1;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 1

    invoke-virtual {p0}, Lqa3/f1;->k()Lqa3/i1;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/i1;->b()Z

    return-object v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 1

    const/4 p2, 0x0

    :try_start_0
    sget-object v0, Lqa3/i1;->L:Lqa3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lqa3/i1;

    invoke-direct {v0, p1}, Lqa3/i1;-><init>(Lwa3/f;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lqa3/f1;->l(Lqa3/i1;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast v0, Lqa3/i1;
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

    invoke-virtual {p0, p2}, Lqa3/f1;->l(Lqa3/i1;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/i1;

    invoke-virtual {p0, p1}, Lqa3/f1;->l(Lqa3/i1;)V

    return-object p0
.end method

.method public final k()Lqa3/i1;
    .locals 5

    new-instance v0, Lqa3/i1;

    invoke-direct {v0, p0}, Lqa3/i1;-><init>(Lqa3/f1;)V

    iget v1, p0, Lqa3/f1;->x:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/f1;->y:I

    iput v2, v0, Lqa3/i1;->y:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lqa3/f1;->z:I

    iput v2, v0, Lqa3/i1;->z:I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Lqa3/f1;->E:Lqa3/g1;

    iput-object v2, v0, Lqa3/i1;->E:Lqa3/g1;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget v2, p0, Lqa3/f1;->F:I

    iput v2, v0, Lqa3/i1;->F:I

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, Lqa3/f1;->G:I

    iput v2, v0, Lqa3/i1;->G:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget-object v1, p0, Lqa3/f1;->H:Lqa3/h1;

    iput-object v1, v0, Lqa3/i1;->H:Lqa3/h1;

    iput v3, v0, Lqa3/i1;->x:I

    return-object v0
.end method

.method public final l(Lqa3/i1;)V
    .locals 4

    sget-object v0, Lqa3/i1;->K:Lqa3/i1;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/i1;->x:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/i1;->y:I

    iget v3, p0, Lqa3/f1;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/f1;->x:I

    iput v1, p0, Lqa3/f1;->y:I

    :cond_1
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget v1, p1, Lqa3/i1;->z:I

    iget v3, p0, Lqa3/f1;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/f1;->x:I

    iput v1, p0, Lqa3/f1;->z:I

    :cond_2
    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Lqa3/i1;->E:Lqa3/g1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/f1;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/f1;->x:I

    iput-object v0, p0, Lqa3/f1;->E:Lqa3/g1;

    :cond_3
    iget v0, p1, Lqa3/i1;->x:I

    and-int/lit8 v1, v0, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_4

    iget v1, p1, Lqa3/i1;->F:I

    iget v3, p0, Lqa3/f1;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/f1;->x:I

    iput v1, p0, Lqa3/f1;->F:I

    :cond_4
    and-int/lit8 v1, v0, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_5

    iget v1, p1, Lqa3/i1;->G:I

    iget v3, p0, Lqa3/f1;->x:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/f1;->x:I

    iput v1, p0, Lqa3/f1;->G:I

    :cond_5
    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_6

    iget-object v0, p1, Lqa3/i1;->H:Lqa3/h1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/f1;->x:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/f1;->x:I

    iput-object v0, p0, Lqa3/f1;->H:Lqa3/h1;

    :cond_6
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/i1;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
