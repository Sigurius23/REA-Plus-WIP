.class public final Lqa3/i;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:Ljava/util/List;

.field public I:Ljava/util/List;

.field public J:Ljava/util/List;

.field public K:Ljava/util/List;

.field public L:Ljava/util/List;

.field public M:Ljava/util/List;

.field public N:Ljava/util/List;

.field public O:Ljava/util/List;

.field public P:Ljava/util/List;

.field public Q:Ljava/util/List;

.field public R:Ljava/util/List;

.field public S:Ljava/util/List;

.field public T:I

.field public U:Lqa3/w0;

.field public V:I

.field public W:Ljava/util/List;

.field public X:Lqa3/c1;

.field public Y:Ljava/util/List;

.field public Z:Lqa3/j1;

.field public a0:Ljava/util/List;

.field public z:I


# direct methods
.method public static synthetic k()Lqa3/i;
    .locals 1

    invoke-static {}, Lqa3/i;->n()Lqa3/i;

    move-result-object v0

    return-object v0
.end method

.method public static n()Lqa3/i;
    .locals 3

    new-instance v0, Lqa3/i;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    const/4 v1, 0x6

    iput v1, v0, Lqa3/i;->E:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->H:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->I:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->J:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->K:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->L:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->M:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->N:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->O:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->P:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->Q:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->R:Ljava/util/List;

    iput-object v1, v0, Lqa3/i;->S:Ljava/util/List;

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, v0, Lqa3/i;->U:Lqa3/w0;

    iput-object v1, v0, Lqa3/i;->W:Ljava/util/List;

    sget-object v2, Lqa3/c1;->G:Lqa3/c1;

    iput-object v2, v0, Lqa3/i;->X:Lqa3/c1;

    iput-object v1, v0, Lqa3/i;->Y:Ljava/util/List;

    sget-object v2, Lqa3/j1;->E:Lqa3/j1;

    iput-object v2, v0, Lqa3/i;->Z:Lqa3/j1;

    iput-object v1, v0, Lqa3/i;->a0:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lqa3/i;->n()Lqa3/i;

    move-result-object v0

    invoke-virtual {p0}, Lqa3/i;->l()Lqa3/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/i;->o(Lqa3/k;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/i;->l()Lqa3/k;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/k;->b()Z

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
    sget-object v1, Lqa3/k;->h0:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/k;

    invoke-direct {v1, p1, p2}, Lqa3/k;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/i;->o(Lqa3/k;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/k;
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

    invoke-virtual {p0, v0}, Lqa3/i;->o(Lqa3/k;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/k;

    invoke-virtual {p0, p1}, Lqa3/i;->o(Lqa3/k;)V

    return-object p0
.end method

.method public final l()Lqa3/k;
    .locals 5

    new-instance v0, Lqa3/k;

    invoke-direct {v0, p0}, Lqa3/k;-><init>(Lqa3/i;)V

    iget v1, p0, Lqa3/i;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/i;->E:I

    iput v2, v0, Lqa3/k;->z:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lqa3/i;->F:I

    iput v2, v0, Lqa3/k;->E:I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, Lqa3/i;->G:I

    iput v2, v0, Lqa3/k;->F:I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    iget-object v2, p0, Lqa3/i;->H:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->H:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit8 v2, v2, -0x9

    iput v2, p0, Lqa3/i;->z:I

    :cond_3
    iget-object v2, p0, Lqa3/i;->H:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->G:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x10

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_4

    iget-object v2, p0, Lqa3/i;->I:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->I:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit8 v2, v2, -0x11

    iput v2, p0, Lqa3/i;->z:I

    :cond_4
    iget-object v2, p0, Lqa3/i;->I:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->H:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    iget-object v2, p0, Lqa3/i;->J:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->J:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, Lqa3/i;->z:I

    :cond_5
    iget-object v2, p0, Lqa3/i;->J:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->I:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x40

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_6

    iget-object v2, p0, Lqa3/i;->K:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->K:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit8 v2, v2, -0x41

    iput v2, p0, Lqa3/i;->z:I

    :cond_6
    iget-object v2, p0, Lqa3/i;->K:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->K:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x80

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_7

    iget-object v2, p0, Lqa3/i;->L:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->L:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x81

    iput v2, p0, Lqa3/i;->z:I

    :cond_7
    iget-object v2, p0, Lqa3/i;->L:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->M:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, Lqa3/i;->M:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->M:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, Lqa3/i;->z:I

    :cond_8
    iget-object v2, p0, Lqa3/i;->M:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->N:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x200

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    iget-object v2, p0, Lqa3/i;->N:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->N:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x201

    iput v2, p0, Lqa3/i;->z:I

    :cond_9
    iget-object v2, p0, Lqa3/i;->N:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->P:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x400

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_a

    iget-object v2, p0, Lqa3/i;->O:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->O:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, Lqa3/i;->z:I

    :cond_a
    iget-object v2, p0, Lqa3/i;->O:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->Q:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x800

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_b

    iget-object v2, p0, Lqa3/i;->P:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->P:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x801

    iput v2, p0, Lqa3/i;->z:I

    :cond_b
    iget-object v2, p0, Lqa3/i;->P:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->R:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x1000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_c

    iget-object v2, p0, Lqa3/i;->Q:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->Q:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x1001

    iput v2, p0, Lqa3/i;->z:I

    :cond_c
    iget-object v2, p0, Lqa3/i;->Q:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->S:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x2000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_d

    iget-object v2, p0, Lqa3/i;->R:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->R:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x2001

    iput v2, p0, Lqa3/i;->z:I

    :cond_d
    iget-object v2, p0, Lqa3/i;->R:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->T:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const/16 v4, 0x4000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_e

    iget-object v2, p0, Lqa3/i;->S:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->S:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    and-int/lit16 v2, v2, -0x4001

    iput v2, p0, Lqa3/i;->z:I

    :cond_e
    iget-object v2, p0, Lqa3/i;->S:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->U:Ljava/util/List;

    const v2, 0x8000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_f

    or-int/lit8 v3, v3, 0x8

    :cond_f
    iget v2, p0, Lqa3/i;->T:I

    iput v2, v0, Lqa3/k;->W:I

    const/high16 v2, 0x10000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_10

    or-int/lit8 v3, v3, 0x10

    :cond_10
    iget-object v2, p0, Lqa3/i;->U:Lqa3/w0;

    iput-object v2, v0, Lqa3/k;->X:Lqa3/w0;

    const/high16 v2, 0x20000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_11

    or-int/lit8 v3, v3, 0x20

    :cond_11
    iget v2, p0, Lqa3/i;->V:I

    iput v2, v0, Lqa3/k;->Y:I

    iget v2, p0, Lqa3/i;->z:I

    const/high16 v4, 0x40000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_12

    iget-object v2, p0, Lqa3/i;->W:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->W:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const v4, -0x40001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/i;->z:I

    :cond_12
    iget-object v2, p0, Lqa3/i;->W:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->Z:Ljava/util/List;

    const/high16 v2, 0x80000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_13

    or-int/lit8 v3, v3, 0x40

    :cond_13
    iget-object v2, p0, Lqa3/i;->X:Lqa3/c1;

    iput-object v2, v0, Lqa3/k;->a0:Lqa3/c1;

    iget v2, p0, Lqa3/i;->z:I

    const/high16 v4, 0x100000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_14

    iget-object v2, p0, Lqa3/i;->Y:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/i;->Y:Ljava/util/List;

    iget v2, p0, Lqa3/i;->z:I

    const v4, -0x100001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/i;->z:I

    :cond_14
    iget-object v2, p0, Lqa3/i;->Y:Ljava/util/List;

    iput-object v2, v0, Lqa3/k;->b0:Ljava/util/List;

    const/high16 v2, 0x200000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_15

    or-int/lit16 v3, v3, 0x80

    :cond_15
    iget-object v1, p0, Lqa3/i;->Z:Lqa3/j1;

    iput-object v1, v0, Lqa3/k;->c0:Lqa3/j1;

    iget v1, p0, Lqa3/i;->z:I

    const/high16 v2, 0x400000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_16

    iget-object v1, p0, Lqa3/i;->a0:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/i;->a0:Ljava/util/List;

    iget v1, p0, Lqa3/i;->z:I

    const v2, -0x400001

    and-int/2addr v1, v2

    iput v1, p0, Lqa3/i;->z:I

    :cond_16
    iget-object v1, p0, Lqa3/i;->a0:Ljava/util/List;

    iput-object v1, v0, Lqa3/k;->d0:Ljava/util/List;

    iput v3, v0, Lqa3/k;->y:I

    return-object v0
.end method

.method public final o(Lqa3/k;)V
    .locals 8

    sget-object v0, Lqa3/k;->g0:Lqa3/k;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/k;->y:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/k;->z:I

    iget v3, p0, Lqa3/i;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/i;->z:I

    iput v1, p0, Lqa3/i;->E:I

    :cond_1
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget v1, p1, Lqa3/k;->E:I

    iget v3, p0, Lqa3/i;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/i;->z:I

    iput v1, p0, Lqa3/i;->F:I

    :cond_2
    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget v0, p1, Lqa3/k;->F:I

    iget v2, p0, Lqa3/i;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/i;->z:I

    iput v0, p0, Lqa3/i;->G:I

    :cond_3
    iget-object v0, p1, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    iget-object v0, p0, Lqa3/i;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lqa3/k;->G:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->H:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lqa3/i;->z:I

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/i;->H:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->H:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/i;->z:I

    :cond_5
    iget-object v0, p0, Lqa3/i;->H:Ljava/util/List;

    iget-object v2, p1, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_0
    iget-object v0, p1, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v2, 0x10

    if-nez v0, :cond_9

    iget-object v0, p0, Lqa3/i;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Lqa3/k;->H:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->I:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_1

    :cond_7
    iget v0, p0, Lqa3/i;->z:I

    and-int/2addr v0, v2

    if-eq v0, v2, :cond_8

    new-instance v0, Ljava/util/ArrayList;

    iget-object v3, p0, Lqa3/i;->I:Ljava/util/List;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->I:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/i;->z:I

    :cond_8
    iget-object v0, p0, Lqa3/i;->I:Ljava/util/List;

    iget-object v3, p1, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    :goto_1
    iget-object v0, p1, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v3, 0x20

    if-nez v0, :cond_c

    iget-object v0, p0, Lqa3/i;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p1, Lqa3/k;->I:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->J:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_2

    :cond_a
    iget v0, p0, Lqa3/i;->z:I

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_b

    new-instance v0, Ljava/util/ArrayList;

    iget-object v4, p0, Lqa3/i;->J:Ljava/util/List;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->J:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v3

    iput v0, p0, Lqa3/i;->z:I

    :cond_b
    iget-object v0, p0, Lqa3/i;->J:Ljava/util/List;

    iget-object v4, p1, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_c
    :goto_2
    iget-object v0, p1, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v4, 0x40

    if-nez v0, :cond_f

    iget-object v0, p0, Lqa3/i;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, Lqa3/k;->K:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->K:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_3

    :cond_d
    iget v0, p0, Lqa3/i;->z:I

    and-int/2addr v0, v4

    if-eq v0, v4, :cond_e

    new-instance v0, Ljava/util/ArrayList;

    iget-object v5, p0, Lqa3/i;->K:Ljava/util/List;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->K:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v4

    iput v0, p0, Lqa3/i;->z:I

    :cond_e
    iget-object v0, p0, Lqa3/i;->K:Ljava/util/List;

    iget-object v5, p1, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    :goto_3
    iget-object v0, p1, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v5, 0x80

    if-nez v0, :cond_12

    iget-object v0, p0, Lqa3/i;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, Lqa3/k;->M:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->L:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_4

    :cond_10
    iget v0, p0, Lqa3/i;->z:I

    and-int/2addr v0, v5

    if-eq v0, v5, :cond_11

    new-instance v0, Ljava/util/ArrayList;

    iget-object v6, p0, Lqa3/i;->L:Ljava/util/List;

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->L:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v5

    iput v0, p0, Lqa3/i;->z:I

    :cond_11
    iget-object v0, p0, Lqa3/i;->L:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_12
    :goto_4
    iget-object v0, p1, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lqa3/i;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p1, Lqa3/k;->N:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->M:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_5

    :cond_13
    iget v0, p0, Lqa3/i;->z:I

    const/16 v6, 0x100

    and-int/2addr v0, v6

    if-eq v0, v6, :cond_14

    new-instance v0, Ljava/util/ArrayList;

    iget-object v7, p0, Lqa3/i;->M:Ljava/util/List;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->M:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v6

    iput v0, p0, Lqa3/i;->z:I

    :cond_14
    iget-object v0, p0, Lqa3/i;->M:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_15
    :goto_5
    iget-object v0, p1, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_18

    iget-object v0, p0, Lqa3/i;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p1, Lqa3/k;->P:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->N:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_6

    :cond_16
    iget v0, p0, Lqa3/i;->z:I

    const/16 v6, 0x200

    and-int/2addr v0, v6

    if-eq v0, v6, :cond_17

    new-instance v0, Ljava/util/ArrayList;

    iget-object v7, p0, Lqa3/i;->N:Ljava/util/List;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->N:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v6

    iput v0, p0, Lqa3/i;->z:I

    :cond_17
    iget-object v0, p0, Lqa3/i;->N:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_18
    :goto_6
    iget-object v0, p1, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lqa3/i;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p1, Lqa3/k;->Q:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->O:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_7

    :cond_19
    iget v0, p0, Lqa3/i;->z:I

    const/16 v6, 0x400

    and-int/2addr v0, v6

    if-eq v0, v6, :cond_1a

    new-instance v0, Ljava/util/ArrayList;

    iget-object v7, p0, Lqa3/i;->O:Ljava/util/List;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->O:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v6

    iput v0, p0, Lqa3/i;->z:I

    :cond_1a
    iget-object v0, p0, Lqa3/i;->O:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1b
    :goto_7
    iget-object v0, p1, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Lqa3/i;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p1, Lqa3/k;->R:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->P:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_8

    :cond_1c
    iget v0, p0, Lqa3/i;->z:I

    const/16 v6, 0x800

    and-int/2addr v0, v6

    if-eq v0, v6, :cond_1d

    new-instance v0, Ljava/util/ArrayList;

    iget-object v7, p0, Lqa3/i;->P:Ljava/util/List;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->P:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v6

    iput v0, p0, Lqa3/i;->z:I

    :cond_1d
    iget-object v0, p0, Lqa3/i;->P:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1e
    :goto_8
    iget-object v0, p1, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_21

    iget-object v0, p0, Lqa3/i;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1f

    iget-object v0, p1, Lqa3/k;->S:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->Q:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_9

    :cond_1f
    iget v0, p0, Lqa3/i;->z:I

    const/16 v6, 0x1000

    and-int/2addr v0, v6

    if-eq v0, v6, :cond_20

    new-instance v0, Ljava/util/ArrayList;

    iget-object v7, p0, Lqa3/i;->Q:Ljava/util/List;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->Q:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v6

    iput v0, p0, Lqa3/i;->z:I

    :cond_20
    iget-object v0, p0, Lqa3/i;->Q:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_21
    :goto_9
    iget-object v0, p1, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_24

    iget-object v0, p0, Lqa3/i;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object v0, p1, Lqa3/k;->T:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->R:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_a

    :cond_22
    iget v0, p0, Lqa3/i;->z:I

    const/16 v6, 0x2000

    and-int/2addr v0, v6

    if-eq v0, v6, :cond_23

    new-instance v0, Ljava/util/ArrayList;

    iget-object v7, p0, Lqa3/i;->R:Ljava/util/List;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->R:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v6

    iput v0, p0, Lqa3/i;->z:I

    :cond_23
    iget-object v0, p0, Lqa3/i;->R:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_24
    :goto_a
    iget-object v0, p1, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, p0, Lqa3/i;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_25

    iget-object v0, p1, Lqa3/k;->U:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->S:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_b

    :cond_25
    iget v0, p0, Lqa3/i;->z:I

    const/16 v6, 0x4000

    and-int/2addr v0, v6

    if-eq v0, v6, :cond_26

    new-instance v0, Ljava/util/ArrayList;

    iget-object v7, p0, Lqa3/i;->S:Ljava/util/List;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->S:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v6

    iput v0, p0, Lqa3/i;->z:I

    :cond_26
    iget-object v0, p0, Lqa3/i;->S:Ljava/util/List;

    iget-object v6, p1, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_27
    :goto_b
    iget v0, p1, Lqa3/k;->y:I

    and-int/lit8 v6, v0, 0x8

    if-ne v6, v1, :cond_28

    iget v1, p1, Lqa3/k;->W:I

    iget v6, p0, Lqa3/i;->z:I

    const v7, 0x8000

    or-int/2addr v6, v7

    iput v6, p0, Lqa3/i;->z:I

    iput v1, p0, Lqa3/i;->T:I

    :cond_28
    and-int/2addr v0, v2

    if-ne v0, v2, :cond_2a

    iget-object v0, p1, Lqa3/k;->X:Lqa3/w0;

    iget v1, p0, Lqa3/i;->z:I

    const/high16 v2, 0x10000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_29

    iget-object v1, p0, Lqa3/i;->U:Lqa3/w0;

    sget-object v6, Lqa3/w0;->U:Lqa3/w0;

    if-eq v1, v6, :cond_29

    invoke-static {v1}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v1}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/i;->U:Lqa3/w0;

    goto :goto_c

    :cond_29
    iput-object v0, p0, Lqa3/i;->U:Lqa3/w0;

    :goto_c
    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/i;->z:I

    :cond_2a
    iget v0, p1, Lqa3/k;->y:I

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2b

    iget v0, p1, Lqa3/k;->Y:I

    iget v1, p0, Lqa3/i;->z:I

    const/high16 v2, 0x20000

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/i;->z:I

    iput v0, p0, Lqa3/i;->V:I

    :cond_2b
    iget-object v0, p1, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2e

    iget-object v0, p0, Lqa3/i;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p1, Lqa3/k;->Z:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->W:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    const v1, -0x40001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_d

    :cond_2c
    iget v0, p0, Lqa3/i;->z:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_2d

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/i;->W:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->W:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/i;->z:I

    :cond_2d
    iget-object v0, p0, Lqa3/i;->W:Ljava/util/List;

    iget-object v1, p1, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2e
    :goto_d
    iget v0, p1, Lqa3/k;->y:I

    and-int/2addr v0, v4

    if-ne v0, v4, :cond_30

    iget-object v0, p1, Lqa3/k;->a0:Lqa3/c1;

    iget v1, p0, Lqa3/i;->z:I

    const/high16 v2, 0x80000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2f

    iget-object v1, p0, Lqa3/i;->X:Lqa3/c1;

    sget-object v3, Lqa3/c1;->G:Lqa3/c1;

    if-eq v1, v3, :cond_2f

    invoke-static {v1}, Lqa3/c1;->i(Lqa3/c1;)Lqa3/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa3/g;->o(Lqa3/c1;)V

    invoke-virtual {v1}, Lqa3/g;->k()Lqa3/c1;

    move-result-object v0

    iput-object v0, p0, Lqa3/i;->X:Lqa3/c1;

    goto :goto_e

    :cond_2f
    iput-object v0, p0, Lqa3/i;->X:Lqa3/c1;

    :goto_e
    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/i;->z:I

    :cond_30
    iget-object v0, p1, Lqa3/k;->b0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_33

    iget-object v0, p0, Lqa3/i;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_31

    iget-object v0, p1, Lqa3/k;->b0:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->Y:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    const v1, -0x100001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_f

    :cond_31
    iget v0, p0, Lqa3/i;->z:I

    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_32

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/i;->Y:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->Y:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/i;->z:I

    :cond_32
    iget-object v0, p0, Lqa3/i;->Y:Ljava/util/List;

    iget-object v1, p1, Lqa3/k;->b0:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_33
    :goto_f
    iget v0, p1, Lqa3/k;->y:I

    and-int/2addr v0, v5

    if-ne v0, v5, :cond_35

    iget-object v0, p1, Lqa3/k;->c0:Lqa3/j1;

    iget v1, p0, Lqa3/i;->z:I

    const/high16 v2, 0x200000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_34

    iget-object v1, p0, Lqa3/i;->Z:Lqa3/j1;

    sget-object v3, Lqa3/j1;->E:Lqa3/j1;

    if-eq v1, v3, :cond_34

    new-instance v3, Lqa3/p;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lqa3/p;-><init>(I)V

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v4, v3, Lqa3/p;->z:Ljava/util/List;

    invoke-virtual {v3, v1}, Lqa3/p;->n(Lqa3/j1;)V

    invoke-virtual {v3, v0}, Lqa3/p;->n(Lqa3/j1;)V

    invoke-virtual {v3}, Lqa3/p;->k()Lqa3/j1;

    move-result-object v0

    iput-object v0, p0, Lqa3/i;->Z:Lqa3/j1;

    goto :goto_10

    :cond_34
    iput-object v0, p0, Lqa3/i;->Z:Lqa3/j1;

    :goto_10
    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/i;->z:I

    :cond_35
    iget-object v0, p1, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_38

    iget-object v0, p0, Lqa3/i;->a0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_36

    iget-object v0, p1, Lqa3/k;->d0:Ljava/util/List;

    iput-object v0, p0, Lqa3/i;->a0:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    const v1, -0x400001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/i;->z:I

    goto :goto_11

    :cond_36
    iget v0, p0, Lqa3/i;->z:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_37

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/i;->a0:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/i;->a0:Ljava/util/List;

    iget v0, p0, Lqa3/i;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/i;->z:I

    :cond_37
    iget-object v0, p0, Lqa3/i;->a0:Ljava/util/List;

    iget-object v1, p1, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_38
    :goto_11
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/k;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
